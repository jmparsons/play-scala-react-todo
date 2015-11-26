package models

import play.api.Play.current
import reactivemongo.bson.BSONObjectID
import play.api.libs.json._
import reactivemongo.extensions.json.dao.JsonDao
import play.modules.reactivemongo.json.BSONFormats._
import scala.concurrent.ExecutionContext.Implicits.global
import api.MongoContext

case class Todo(
  _id: BSONObjectID = BSONObjectID.generate,
  content: String
)

object Todo {
  implicit val todoFormat = Json.format[Todo]
}

object Todos extends JsonDao[Todo, BSONObjectID](MongoContext.db, "todo")