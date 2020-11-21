package incrementCounter

import java.awt.GridBagConstraints
import java.awt.GridBagLayout
import javax.swing.JButton
import javax.swing.JPanel
import javax.swing.JTextField

internal class View : JPanel(GridBagLayout()) {

    private val textField: JTextField = JTextField(10)
    private val model: Model = Model().also { model ->
        model.addPropertyChangeListener {
            when (Intention.valueOf(it.propertyName)) {
                Intention.INCREMENT_COUNTER -> textField.text = it.newValue.toString()
            }
        }
    }

    private val controller: Controller = Controller(model)
    private val button: JButton = JButton("Click me to increment count")

    init {
        textField.text = model.currentCounter()
        button.addActionListener { controller.incrementCounter() }

        val gbc = GridBagConstraints()
        gbc.gridheight = 1
        gbc.gridwidth = 1
        gbc.anchor = GridBagConstraints.LINE_START
        gbc.fill = GridBagConstraints.BOTH
        gbc.gridx = 0
        gbc.gridy = 0
        add(button, gbc)
        gbc.gridx = 1
        gbc.gridy = 0
        add(textField, gbc)
    }
}


