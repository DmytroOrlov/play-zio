val V = new {
  val zio = "1.0.1"
  val akka = "2.6.8"
}

lazy val `play-zio` = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    scalaVersion := "2.13.3",
    version := "1.0-SNAPSHOT",
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % V.zio,
      "com.softwaremill.macwire" %% "macros" % "2.3.7" % Provided,
/*
      "com.typesafe.akka" %% "akka-stream" % V.akka,
      "com.typesafe.akka" %% "akka-actor-typed" % V.akka,
      "com.typesafe.akka" %% "akka-serialization-jackson" % V.akka,
      "com.typesafe.akka" %% "akka-slf4j" % V.akka,
*/
    ),
  )
