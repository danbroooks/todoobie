name := "todoobie"

version := "0.0.1"

scalaVersion := "2.11.7"

scalacOptions ++= Seq("-deprecation")

lazy val root = (project in file(".")).enablePlugins(PlayScala)

lazy val doobieVersion = "0.4.0"

libraryDependencies += "junit" % "junit" % "4.10" % "test"
libraryDependencies += "com.typesafe.play" %% "play-netty-server" % "2.5.0"
libraryDependencies += "com.typesafe.play" %% "play" % "2.5.0"
libraryDependencies += "org.tpolecat"      %% "doobie-core-cats"       % doobieVersion
libraryDependencies += "org.tpolecat"      %% "doobie-postgres-cats"   % doobieVersion
libraryDependencies += "org.scalatest"     %% "scalatest"   % "3.0.0" % "test"

flywayUrl       := "jdbc:postgresql:todoobie"
flywayUser      := "todoobie"
flywayLocations := Seq("filesystem:migrations")
