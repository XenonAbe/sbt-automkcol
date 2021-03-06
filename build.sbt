sbtPlugin := true

organization := "com.github.xenonabe"

name := "sbt-automkcol"

version := "1.6.5"

crossSbtVersions := Seq("0.13.17", "1.2.8")

libraryDependencies ++= Seq(
    "com.github.lookfirst" % "sardine" % "5.7",
    "org.scalatest" %% "scalatest" % "3.0.3" % "test",
    "com.typesafe"  % "config" % "1.3.1" % "test"
)

publishMavenStyle := true

publishTo := Some(Resolver.file("file", new File("./docs")))

publishArtifact in Test := false
