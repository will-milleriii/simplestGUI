import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleButton implements ActionListener {
    private JLabel label = new JLabel("Number of Clicks: 0");
    private JFrame frame = new JFrame();
    private int clicks = 0;

    public static void main(String[] args){
        new SimpleButton();

    }

    public SimpleButton(){
        JButton button = new JButton("Plus One");
        button.addActionListener(this);
        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(40, 40, 20, 40));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI");
        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        clicks++;
        label.setText("Number of clicks:" + clicks);

    }
}
