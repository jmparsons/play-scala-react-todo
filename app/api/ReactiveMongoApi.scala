package api

import scala.concurrent.ExecutionContext.Implicits.global
import reactivemongo.api.{ DB, MongoDriver }

object MongoContext {
  val driver = new MongoDriver
  val connection = driver.connection(List("localhost"))
  def db: DB = connection("todoapp")
}