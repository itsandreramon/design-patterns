interface Widget {
	val name: String
}

interface ScrollBar : Widget {
	class MotifScrollBar : ScrollBar {
		override val name = "MotifScrollBar"
	}

	class PMScrollBar : ScrollBar {
		override val name = "PMScrollBar"
	}
}

interface Window : Widget {
	class MotifWindow : Window {
		override val name = "MotifWindow"
	}

	class PMWindow : Window {
		override val name = "PMWindow"
	}
}

interface WidgetFactory {
	fun createScrollBar(): ScrollBar
	fun createWindow(): Window

	object MotifWidgetFactory : WidgetFactory {
		override fun createScrollBar() = ScrollBar.MotifScrollBar()
		override fun createWindow() = Window.MotifWindow()
	}

	object PMWidgetFactory : WidgetFactory {
		override fun createScrollBar() = ScrollBar.PMScrollBar()
		override fun createWindow() = Window.PMWindow()
	}
}