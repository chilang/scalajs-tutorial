enablePlugins(ScalaJSPlugin)

name := "Scala.js Tutorial"

scalaVersion := "2.11.7"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.8.1"
libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.8.0"

jsDependencies += RuntimeDOM

skip in packageJSDependencies := false

jsDependencies +=
  "org.webjars" % "jquery" % "2.1.4" / "2.1.4/jquery.js"


libraryDependencies += "org.scalatest" %%% "scalatest" % "3.0.0-M10" % "test"

persistLauncher in Compile := true

persistLauncher in Test := false

