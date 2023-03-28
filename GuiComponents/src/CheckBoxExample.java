import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class CheckBoxExample extends JFrame{
    
    CheckBoxExample(){

        super("CheckBox példa");
        initComponents();

    }

    private void initComponents(){
        
        // alap ablak
        this.setSize(300, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null); // ennek hatására lehet pozícionálni a komponenseket
        this.setLocationRelativeTo(null);

        JCheckBox chb = new JCheckBox("Teszt", true);
        chb.setBounds(100, 70, 100, 30);
        this.add(chb);

        // az állapotot az ItemListener figyeli...
        chb.addItemListener(new ItemListener() {
            
            @Override
            public void itemStateChanged(ItemEvent event) {

                if(event.getStateChange() == 1){
                    chb.setText("Bejeölve");

                } else {
                    chb.setText("Nincs jelölve");
                }

            }
        });

        System.out.println(chb.isSelected());

    }

   
    
}

