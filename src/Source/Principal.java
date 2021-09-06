package Source;
import javax.swing.JOptionPane;

public class Principal {
    public static  void main(String[] args){
        //VentanaAWT ventanaAWT = new VentanaAWT();

        String name =JOptionPane.showInputDialog("What is your name?");

        FrameAWT.crearMostrarGUI(name);



    }
}
