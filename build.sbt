sbtPlugin := true

organization := "com.github.tototoshi"

name := "sbt-automkcol"

version := "1.5.1"

libraryDependencies ++= Seq(
    "com.googlecode.sardine" % "sardine" % "146",
    "org.scalatest" %% "scalatest" % "2.2.4" % "test",
    "com.typesafe"  % "config" % "1.0.0" % "test"
)

publishMavenStyle := true

publishTo := Some(Resolver.file("file", new File("./docs")))

publishArtifact in Test := false
