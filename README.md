Overview
========
This is a starter java project

Note on gradle
==============
The build scripts are built around gradle.  You can install gradle or use the provided version.  

To install using [brew](http://mxcl.github.com/homebrew/), run `brew install gradle`.

To install manually, goto [gradle](http://www.gradle.org/downloads).

To use the provided version, instead of running `gradle`, run `./g`

Opening in Eclipse
==================
If you use Eclipse, the gradle scripts are nice enough to create your project and classpath files.

The first time you open the project, first create the eclipse project files:

```
gradle eclipse
```

Now you can import the project into eclipse.

If you change dependencies, update the classpath:

```
gradle cleanEclipseClasspath eclipseClasspath
```

How to Run, Method 1
====================

Compile
-------
To compile:
```
gradle fatjar
```

Run
---
```
java -cp build/libs/jar-starterkit.jar jayray.net.hello.HelloWorld
```

How to Run, Method 2
====================

Compile
-------
To compile:
```
gradle installApp
```

Run
---
```
build/install/jar-starterkit/bin/jar-starterkit
```
