package controllers

import play.api.mvc._
import play.api.libs.json._
import services.persistence.Connection
import doobie.imports._, cats._

class MainController extends Controller {

  def index = Action {
    val todos = sql"select content from todos"
      .query[String]
      .list
      .transact(Connection.xa)
      .unsafePerformIO

    Ok(Json.toJson(todos))
  }
}
