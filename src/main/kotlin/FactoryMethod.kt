interface Document {
	val name: String
}

class MyDocument : Document {
	override val name = "MyDocument"
}

interface DocumentFactory {
	fun createDocument(): Document
}

object MyDocumentFactory : DocumentFactory {
	override fun createDocument(): Document {
		return MyDocument()
	}
}
