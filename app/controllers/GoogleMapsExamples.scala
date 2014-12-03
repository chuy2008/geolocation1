package controllers

import play.api._
import play.api.mvc._

object GoogleMapsExamples extends Controller
{

  def example1 = Action
  {
    Ok(views.html.googleMapsExample1("google Maps Example 1"))
  }

  def example2 = Action
  {
    Ok(views.html.googleMapsExample2("google Maps Example 2"))
  }

  def example3 = Action
  {
    Ok(views.html.googleMapsExample3("google Maps Example 3"))
  }

  def example4 = Action
  {
    Ok(views.html.googleMapsExample4("google Maps Example 4"))
  }
  
}