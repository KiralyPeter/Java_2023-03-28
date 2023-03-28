import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MenuExample extends JFrame{
    
    MenuExample(){

        super("Menü példa");
        initComponents();

    }

    private void initComponents(){
        
        // alap ablak
        this.setSize(500, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null); // ennek hatására lehet pozícionálni a komponenseket
        this.setLocationRelativeTo(null);
        
        // MenuBar-t csak Frame-re lehet tenni!!!

        JMenuBar menubar = new JMenuBar();
        
        // Az ActionListener kezeli a menüket is!!!

        // File menü
        JMenu fileMenu = new JMenu("File");
        // File menü elemei
        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);


        JMenu editMenu = new JMenu("Edit");
        JMenu viewMenu = new JMenu("View");
        
        menubar.add(fileMenu);
        menubar.add(editMenu);
        menubar.add(viewMenu);

        this.setJMenuBar(menubar);

    }
}
