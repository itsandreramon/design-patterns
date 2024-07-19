import kotlin.test.Test
import kotlin.test.assertEquals

class FactoryMethodTest {

	@Test
	fun test() {
		val factory: DocumentFactory = MyDocumentFactory
		assertEquals("MyDocument", factory.createDocument().name)
	}
}