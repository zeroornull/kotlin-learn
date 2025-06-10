import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StringUtilsTest {

    @Test
    fun `should reverse string`() {
        // Given
        val input = "hello"
        
        // When
        val result = input.reversed()
        
        // Then
        assertEquals("olleh", result)
    }

    @Test
    fun `should return true for palindrome`() {
        // Given
        val input = "madam"
        
        // When
        val result = input == input.reversed()
        
        // Then
        assertEquals(true, result)
    }
    
    fun String.reversed(): String {
        return this.reversed()
    }
    
    
}