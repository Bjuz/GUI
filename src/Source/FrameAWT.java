package Source;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameAWT extends Frame {
    public FrameAWT(String title) throws HeadlessException {
        super(title);
    }

    public void addComponents(){
        Panel panel = new Panel();
        panel.setLayout(new FlowLayout());
        panel.add(new Button("Boton 1"));
        panel.add(new Checkbox());

        this.add(panel);

    }
    public static void crearMostrarGUI( String name){
        String message =String.format("Welcome, %s, to my project!",name);
        JOptionPane.showMessageDialog(null, message );
        FrameAWT frameAWT = new FrameAWT("Portfolio 1");
        //frameAWT.setBackground(Color.BLUE); //Pone color que uno quiere a la ventana
        frameAWT.setSize(500,500);
        frameAWT.addComponents();
        frameAWT.setVisible(true);
        //frameAWT.pack(); // es para acomodar la ventana de una forma automatica, primero se agrega despues se empaqueta
        frameAWT.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                JOptionPane.showMessageDialog(null, "Thanks for using my program, have a nice day");
                System.exit(0);
            }
        });
    }
}
