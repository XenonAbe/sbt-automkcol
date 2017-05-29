sbtPlugin := true

organization := "com.github.xenonabe"

name := "sbt-automkcol"

version := "1.6.3"

libraryDependencies ++= Seq(
    "com.github.lookfirst" % "sardine" % "5.7",
    "org.scalatest" %% "scalatest" % "3.0.3" % "test",
    "com.typesafe"  % "config" % "1.3.1" % "test"
)

sbtPlugin := true

publishMavenStyle := true

publishTo := Some(Resolver.file("file", new File("./docs")))

publishArtifact in Test := false
