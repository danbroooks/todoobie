resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/maven-releases/"
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.5.9")

resolvers += "Flyway" at "https://flywaydb.org/repo"
addSbtPlugin("org.flywaydb" % "flyway-sbt" % "4.1.2")
