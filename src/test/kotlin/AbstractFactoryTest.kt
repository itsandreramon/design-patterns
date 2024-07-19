import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AbstractFactoryTest {

	@Test
	fun test() {
		val factory: WidgetFactory = WidgetFactory.MotifWidgetFactory
		assertEquals("MotifScrollBar", factory.createScrollBar().name)
		assertEquals("MotifWindow", factory.createWindow().name)
	}
}