package incrementCounter

// Sole task is to forward to call ?
// Just because there is no DB or anything, i think
internal class Controller(private val model: Model) {
    fun incrementCounter(): Unit = model.incrementCounter()
}
