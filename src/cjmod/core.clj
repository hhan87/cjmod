(ns cjmod.core
  (:require [clojure.java.io :as io])
  (:import [java.nio.file Files Paths]
           [java.nio.file.attribute PosixFilePermissions])
  (:gen-class))

(defn check-args
  [args]
  (if (= 2 (count args))
    (println (str "Try to change permissions of " (first args) " to " (last args)))
    (do
      (println (str "wrong args count. Args must be 2. " args))
      (System/exit 0))))

(defn chmod
  [file-path permission]
  (let [path (Paths/get file-path (into-array String []))
        perm (PosixFilePermissions/fromString permission)]
    (Files/setPosixFilePermissions path perm)))

(defn -main
  [& args]
  (println args)
  (check-args args)
  (let [root-path (first args)
        permission (last args)]
    (doseq
     [x (file-seq (io/file root-path))]
        (println (str "change permission of " (.toString x) " to " permission))
      (if (.isDirectory x)
        (chmod (.toString x) "rwxr-xr-x")
        (chmod (.toString x) permission))  
      )))