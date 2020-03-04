import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class BorrowerTest {

    val library = Library(20)
    val borrower = Borrower("Gregor")
    val book1 = Book("The Martian Chronicles", "Ray Bradbury", "Sci-Fi")
    val book2 = Book("The Grapes Of Wrath", "John Steinbeck", "Classic")
    val book3 = Book("Jamie's Italian", "Jamie Oliver", "Cookery")

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

    @Test
    fun canCheckBookOutFromLibrary() {
        library.addBookToCollection(book1)
        library.addBookToCollection(book2)
        library.addBookToCollection(book3)
        borrower.checkOutBook("The Martian Chronicles", library)
        assertEquals(1, borrower.countCollection())
        assertEquals(2, library.countBooksInCollection())
        assertTrue(borrower.collection[0] == book1)
        assertFalse(library.stock.contains(book1))
    }

    @Test
    fun cannotCheckBookOutIfNotFound() {
        library.addBookToCollection(book1)
        library.addBookToCollection(book2)
        library.addBookToCollection(book3)
        borrower.checkOutBook("Jane Eyre", library)
        assertEquals(0, borrower.countCollection())
        assertEquals(3, library.countBooksInCollection())
    }

}