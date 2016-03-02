# The Scala.js tutorial

This repository contains the code accompanying the [Scala.js tutorial](http://www.scala-js.org/doc/tutorial.html)


Use [ScalaTest](http://scalatest.org) and [Karma](http://karma-runner.github.io) for running tests.

## Setup

Prerequisites: Node/NPM

* ```npm install```
* ```sbt test:fastOptJS```

## Run tests

```karma start karma.conf.js --single-run```

or via IntelliJ's [Karma plugin](https://www.jetbrains.com/idea/help/running-unit-tests-on-karma.html)

![IntelliJ Karma](intellij-karma-screenshot.jpg?raw=true)

## Known issues

* Total test count is incorrect
