import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AbstractFactoryTest {

	@Test
	fun `test WotifWidgetFactory`() {
		val factory: WidgetFactory = WidgetFactory.MotifWidgetFactory
		assertEquals("MotifScrollBar", factory.createScrollBar().name)
		assertEquals("MotifWindow", factory.createWindow().name)
	}

	@Test
	fun `test PMWidgetFactory`() {
		val factory: WidgetFactory = WidgetFactory.PMWidgetFactory
		assertEquals("PMScrollBar", factory.createScrollBar().name)
		assertEquals("PMWindow", factory.createWindow().name)
	}
}