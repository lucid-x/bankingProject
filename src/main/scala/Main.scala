import java.time.LocalDate
import scala.concurrent.Future

object Main {

  val shawshank = Movie(1L, "Shawshank Redemption", LocalDate.of(1994, 4, 2), 162)

  def insertMovie(movie: Movie): Future[Int] = {
    val insertQuery = SlickTables.movieTable += movie
    Connection.db.run(insertQuery)
  }

  def main(args: Array[String]): Unit = {
    println("Hello world!")
  }
}