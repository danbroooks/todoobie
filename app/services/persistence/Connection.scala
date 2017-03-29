package services.persistence

import doobie.imports._
import cats._, cats.data._, cats.implicits._
import com.typesafe.config._

object Connection {
  lazy val conf = ConfigFactory.load()

  lazy val xa = DriverManagerTransactor[IOLite](
    driver = "org.postgresql.Driver",
    url    = conf.getString("doobie.url"),
    user   = conf.getString("doobie.user"),
    pass   = conf.getString("doobie.password")
  )
}
