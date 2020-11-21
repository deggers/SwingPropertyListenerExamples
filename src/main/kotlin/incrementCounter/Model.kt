package incrementCounter

import incrementCounter.Intention.INCREMENT_COUNTER
import java.beans.PropertyChangeListener
import javax.swing.event.SwingPropertyChangeSupport

internal class Model {
    private var counter = 0
    private val pcs: SwingPropertyChangeSupport = SwingPropertyChangeSupport(this)

    fun addPropertyChangeListener(l: PropertyChangeListener?) = pcs.addPropertyChangeListener(l)

    private fun setCounter(i: Int) {
        val oldValue = counter
        counter = i
        pcs.firePropertyChange(INCREMENT_COUNTER, oldValue, i)
        println("""setCounter finished with oldValue=$oldValue, newValue=$i""")
    }

    fun incrementCounter() = this.setCounter(counter + 1)
    fun currentCounter(): String = counter.toString()
}

