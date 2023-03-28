import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TextFieldExample extends JFrame{
    
    TextFieldExample(){

        super("TextField példa");
        initComponents();

    }

    private void initComponents(){
        
        // alap ablak
        this.setSize(300, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null); // ennek hatására lehet pozícionálni a komponenseket
        this.setLocationRelativeTo(null);

        JLabel label01 = new JLabel("Szöveg: ");
        label01.setBounds(50, 20, 100, 30);
        this.add(label01);

        JTextField jtf = new JTextField(20);
        jtf.setBounds(110, 20, 100, 30);
        this.add(jtf);

        JButton button = new JButton("Mehet");
        button.setBounds(110, 60, 80, 30);
        this.add(button);

        JLabel label02 = new JLabel();
        label02.setBounds(110, 100, 100, 30);
        this.add(label02);

        button.addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent event) {
                
                String text = jtf.getText();
                label02.setText(text);
                // szöveg mező kiürítése
                jtf.setText("");

            }
        });

        
    }
}
