
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.BorderFactory; 
import javax.swing.border.Border;
import javax.swing.UIManager;

public class ColourModes extends JFrame implements ActionListener, MouseListener
{
 
    private JLabel colourMode;        
                
    private JButton normal,deficiency,quit; 
    private Border border; 
    
    
    public ColourModes()
    {
        // For cross platform performance.
        try{
            UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );}
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        this.setSize(600,600);
        this.setLayout(null);
        this.setTitle("King Domino");
        border = BorderFactory.createLineBorder(Color.cyan); 
        
        
        getContentPane().setLayout(null);
        getContentPane().setBackground(Color.black);
        
        getContentPane().add(setColourMode());
        getContentPane().add(setNormalMode());
        getContentPane().add(setDeficiencyMode());
        getContentPane().add(setQuit());
        
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    
    }
    
    private JLabel setColourMode() {
        colourMode = new JLabel("Colour Mode");
        colourMode.setHorizontalAlignment(SwingConstants.CENTER);
        colourMode.setBorder(border);
        colourMode.setFont(new Font("TimesRoman", Font.BOLD, 57));
        colourMode.setBounds(67,12,460,117);
        colourMode.setForeground(Color.cyan);
        return colourMode;
    }
    
    
    private JButton setNormalMode(){
        normal = new JButton("Normal");
        normal.setFont(new Font("Serif", Font.BOLD, 37));
        normal.setBackground(Color.cyan);
        normal.setForeground(Color.black);
        normal.addActionListener(this);
        normal.setFocusable(false);        
        normal.setBounds(80, 150, 400, 100);
        return normal;
    }    
    
    private JButton setDeficiencyMode(){
        deficiency = new JButton("Vision Deficiency");
        deficiency.setFont(new Font("Serif", Font.BOLD, 37));
        deficiency.setBackground(Color.cyan);
        deficiency.setForeground(Color.black);
        deficiency.addActionListener(this);
        deficiency.setFocusable(false);        
        deficiency.setBounds(80, 270, 400, 100);
        return deficiency;
    }
    private JButton setQuit(){
        quit = new JButton("Quit");        
        quit.setFont(new Font("Serif", Font.BOLD, 37));
        quit.setBackground(Color.cyan);
        quit.setForeground(Color.black);
        quit.addActionListener(this);
        quit.setFocusable(false);        
        quit.setBounds(80, 390, 400, 100);
        return quit;
        
        
        
    
    }
    
    
    public void actionPerformed(ActionEvent aevt)
    {
        // get the object that was selected in the gui
        Object selected = aevt.getSource();
        if (selected.equals(normal)){
            
            this.dispose();
            
            
            
        }
        
         if (selected.equals(deficiency)){
            
            this.dispose();
            
            
            
        }
        
        if (selected.equals(quit)){
            
            System.exit(0);
            
            
        }
        
        
    }


    // Mouse Listener events
    public void mouseClicked(MouseEvent mevt)
    {
        // get the object that was selected in the gui
        Object selected = mevt.getSource();
        
    
    }
    
    // not used but must be present to fulfil MouseListener contract
    public void mouseEntered(MouseEvent arg0){}
    public void mouseExited(MouseEvent arg0) {}
    public void mousePressed(MouseEvent arg0) {}
    public void mouseReleased(MouseEvent arg0) {}
}
