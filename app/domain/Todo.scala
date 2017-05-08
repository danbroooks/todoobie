package domain

import services.persistence.Connection
import doobie.imports._, cats._

case class Todo(content: String)

object Todo {
  def all = sql"""
      select content from todos
    """
      .query[Todo]
      .list
      .transact(Connection.xa)
      .unsafePerformIO

  def addTodo(t: String) = sql"""
      insert into todos (content, completed)
      values (${t}, false)
    """
      .update
      .run
      .transact(Connection.xa)
      .unsafePerformIO
}
