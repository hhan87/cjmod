# cjmod

`cjmod` is a utility designed to help you easily change the permissions of all files and directories within a specified directory recursively on UNIX systems.

## Usage

### 1. Changing File Permissions Recursively

With `cjmod`, you can recursively change the permissions of all files and subdirectories within a specified directory. This is particularly useful for ensuring consistent file permissions or adjusting permissions for deployment environments.

To use `cjmod`, run the following command:

```bash
$ lein run <target-dir> <permission: e.g. "rwxrw-rw-">
<target-dir>: The directory path where you want to change the permissions.
<permission>: The permission string you want to apply (e.g., "rwxrw-rw-").
Make sure you have Leiningen installed and run this command from the project’s root directory.
```

## License
MIT License

Copyright (c) 2024 Hyunseop Han

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
