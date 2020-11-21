package incrementCounter

import javax.swing.event.SwingPropertyChangeSupport

fun SwingPropertyChangeSupport.firePropertyChange(intention: Intention, oldValue: Int, newValue: Int) {
    this.firePropertyChange(intention.name, oldValue, newValue)
}
