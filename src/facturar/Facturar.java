
package facturar;

import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import facturar.Vista.ViewMain;
import java.text.ParseException;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Facturar {


    public static void main(String[] args) {
      try 
    {
      UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
    } 
    catch (ParseException | UnsupportedLookAndFeelException e) 
    {
      e.printStackTrace();
    }
        ViewMain vmain= new ViewMain();
     vmain.setLocationRelativeTo(null);
     vmain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     vmain.setVisible(true);
     vmain.setExtendedState(vmain.getExtendedState() | vmain.MAXIMIZED_BOTH);
      
    }
    
}
