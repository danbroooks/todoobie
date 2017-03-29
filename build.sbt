name := "todoobie"

version := "0.0.1"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

scalacOptions ++= Seq("-deprecation")

libraryDependencies += "junit" % "junit" % "4.10" % "test"
libraryDependencies += "com.typesafe.play" %% "play-netty-server" % "2.5.0"
libraryDependencies += "com.typesafe.play" %% "play" % "2.5.0"
