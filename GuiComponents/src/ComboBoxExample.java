import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class ComboBoxExample extends JFrame{
    
       
        ComboBoxExample(){
    
            super("ComboBox példa");
            initComponents();
    
        }
    
        private void initComponents(){
            
            // alap ablak
            this.setSize(300, 200);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLayout(null); // ennek hatására lehet pozícionálni a komponenseket
            this.setLocationRelativeTo(null);


            // ComboBox lista elemei
            String[] comboItems = {"Szinek", "Piros", "Kék", "Zöld", "Sárga"};

            // ComboBox
            JComboBox jcb = new JComboBox(comboItems);
            jcb.setBounds(100, 70, 100, 30);
            // szerkesztés engedélyezése, Sok értelme nincs...
            // jcb.setEditable(true);
            this.add(jcb);

            // Label
            JLabel label = new JLabel();
            label.setBounds(50, 100, 100, 30);
            this.add(label);

            // a folyamatos figyeléshez Listener szükséges, ez így nem frissíti...
            // kiválasztott elem lekérdezése
            String actualItem = jcb.getSelectedItem().toString();
            label.setText(actualItem);

            int comboSize = jcb.getItemCount();
            System.out.println(comboSize);

            
        }


    }
    


