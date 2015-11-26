package controllers

import play.api._
import play.api.mvc._
import models._
import scala.concurrent.ExecutionContext.Implicits.global

class Application extends Controller {

  def index = Action {
    Ok("hi world")
  }

}
