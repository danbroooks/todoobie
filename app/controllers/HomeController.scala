package controllers

import domain.Todo
import play.api.mvc._
import play.api.libs.json._
import services._

class HomeController extends Controller {

  implicit val todoWrites = Json.writes[Todo]

  def index = Action { implicit req =>
    req match {
      case Accepts.Html() => Ok(views.html.home.index(Todo.all))
      case Accepts.Json() => Ok(Json.toJson(Todo.all))
      case _ => InternalServerError
    }
  }
}
