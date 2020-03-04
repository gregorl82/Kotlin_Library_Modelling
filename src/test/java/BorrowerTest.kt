import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class BorrowerTest {

    val borrower = Borrower("Gregor")

    @Test
    fun getName() {
        assertEquals("Gregor", borrower.name)
    }

}