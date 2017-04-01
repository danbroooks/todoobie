package controllers

import play.api.mvc._
import play.api.libs.json._
import services._

class HomeController extends Controller with TodoService {

  def index = Action { implicit req =>
    req match {
      case Accepts.Html() => Ok(views.html.home.index())
      case Accepts.Json() => {
        Ok(Json.toJson(todos.all))
      }
      case _ => InternalServerError
    }
  }
}
