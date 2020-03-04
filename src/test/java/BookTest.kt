import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class BookTest {

    val book = Book("The Great Gatsby", "F Scott Fitzgerald", "Classic")

    @Test
    fun getTitle() {
        assertEquals("The Great Gatsby", book.title)
    }

    @Test
    fun getAuthor() {
        assertEquals("F Scott Fitzgerald", book.author)
    }

    @Test
    fun getGenre() {
        assertEquals("Classic", book.genre)
    }
}