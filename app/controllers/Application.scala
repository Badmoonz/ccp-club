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

  def partnership = Action {
    Ok(views.html.partnership())
  }
  def advisors = Action {
    Ok(views.html.advisors())
  }
  def clients = Action {
    Ok(views.html.clients())
  }
  def investors = Action {
    Ok(views.html.investors())
  }

  def agents = Action {
    Ok(views.html.agents())
  }
}