package controllers

import algebras.Todo
import play.api.mvc._
import play.api.libs.json._
import services._

class HomeController extends Controller with TodoService {

  implicit val todoWrites = Json.writes[Todo]

  def index = Action { implicit req =>
    req match {
      case Accepts.Html() => Ok(views.html.home.index(todos.all))
      case Accepts.Json() => Ok(Json.toJson(todos.all))
      case _ => InternalServerError
    }
  }
}
