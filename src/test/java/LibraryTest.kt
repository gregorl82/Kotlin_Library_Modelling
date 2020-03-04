import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class LibraryTest {

    val library = Library()

    @Test
    fun libraryStartsEmpty() {
        assertEquals(0, library.countBooksInCollection())
    }
}