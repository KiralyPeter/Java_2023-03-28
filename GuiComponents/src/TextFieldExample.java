import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

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
        
    }
}
