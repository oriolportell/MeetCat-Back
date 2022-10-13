package upc.fib.pes.grup121

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus
import upc.fib.pes.grup121.model.Esdeveniment
import java.time.LocalDateTime

@SpringBootTest(
    classes = arrayOf(Grup121Application::class),
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Disabled
class EsdevenimentsIntegrationTest {

    @Autowired
    lateinit var restTemplate: TestRestTemplate

    @Test
    fun whePostCalled_thenShouldReturnBankObject() {
        val result = restTemplate.postForEntity("/esdeveniments", Esdeveniment(null, "Titol", "Desc", LocalDateTime.now(), "locatioN", LocalDateTime.now(), LocalDateTime.now()), Esdeveniment::class.java);

        assertNotNull(result)
        assertEquals(HttpStatus.CREATED, result?.statusCode)
        assertEquals("Desc", result.getBody()?.descripcio)
    }

    @Test
    fun whenGetCalled_thenShouldBadReqeust() {
       val result = restTemplate.getForEntity("/esdeveniments", Esdeveniment::class.java);
        print(result)
        assertNotNull(result)
        assertEquals(HttpStatus.NOT_FOUND, result?.statusCode)
    }

}