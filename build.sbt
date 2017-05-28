sbtPlugin := true

organization := "com.github.xenonabe"

name := "sbt-automkcol"

version := "1.6.0-SNAPSHOT"

libraryDependencies ++= Seq(
    "com.googlecode.sardine" % "sardine" % "146",
    "org.scalatest" %% "scalatest" % "3.0.3" % "test",
    "com.typesafe"  % "config" % "1.0.0" % "test"
)

publishMavenStyle := true

publishTo := Some(Resolver.file("file", new File("./docs")))

publishArtifact in Test := false
