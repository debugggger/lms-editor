package lmseditor.gui.panel.properties;

import javax.swing.*;

public class QuestionNumericalAnswerProperties extends JPanel {

    private JLabel label;

    public QuestionNumericalAnswerProperties() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        label = new JLabel("Properties");

        this.add(label);
        this.add(new JCheckBox("Check box 1")); // test
        this.add(new JCheckBox("Check box 2")); // test

    }


}
