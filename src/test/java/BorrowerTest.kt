import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class BorrowerTest {

    val borrower = Borrower("Gregor")
    val book1 = Book("The Martian Chronicles", "Ray Bradbury", "Sci-Fi")

    @Test
    fun getName() {
        assertEquals("Gregor", borrower.name)
    }

    @Test
    fun collectionStartsEmpty() {
        assertEquals(0, borrower.countCollection())
    }

    @Test
    fun canAddBookToCollection() {
        borrower.addBookToCollection(book1)
        assertEquals(1, borrower.countCollection())
    }

}