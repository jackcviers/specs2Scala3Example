scalaVersion := "3.2.0"
libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "4.19.0" cross CrossVersion.for3Use2_13,
  "org.mockito" %% "mockito-scala-specs2" % "1.17.12" cross CrossVersion.for3Use2_13,
  "com.typesafe.play" %% "play-ahc-ws-standalone" % "2.2.0-M2" cross CrossVersion.for3Use2_13,
)
scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-unchecked"
)
Test / scalacOptions := (Compile / scalacOptions).value ++ Seq("-Xprint:typer")
