package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def contacts = Action {
    Ok(views.html.contacts())
  }

  def about = Action {
    Ok(views.html.about())
  }

  def services = Action {
    Ok(views.html.services())
  }

}