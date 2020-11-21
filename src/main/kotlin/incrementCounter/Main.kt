package incrementCounter

import javax.swing.JFrame
import javax.swing.SwingUtilities
import javax.swing.event.SwingPropertyChangeSupport


class Main : JFrame() {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SwingUtilities.invokeLater { Main() }
        }
    }

    init {
        val theGui = View()
        defaultCloseOperation = EXIT_ON_CLOSE
        isResizable = true
        add(theGui)
        pack()
        isVisible = true
    }
}



