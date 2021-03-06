credentials += (Some(new File("/private/diversit/.credentials/.credentials")) map(f => Credentials(f))).get

publishTo <<= version { v: String =>
  val cloudbees = "https://repository-diversit.forge.cloudbees.com/"
  if (v.trim.endsWith("SNAPSHOT"))
    Some("snapshots" at cloudbees + "snapshot")
  else
    Some("releases" at cloudbees + "release")
}

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { x => false }

pomExtra := (
  <licenses>
    <license>
      <name>Eclipse Public License v1.0</name>
      <url>http://www.eclipse.org/legal/epl-v10.html</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
)

