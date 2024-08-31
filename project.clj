(defproject cjmod "0.1.0-SNAPSHOT"
  :description "change UNIX permission of all files in directory recursively."
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.11.4"]]
  :repl-options {:init-ns cjmod.core}
  :main cjmod.core)
