package library;
import javax.swing.*;

public class lView extends JFrame
{
    private static final long serialVersionUID = 1L;
    JFrame f;

    public lView() {  
        initializeGui(); 
    }  

    private void initializeGui() {
        JButton b=new JButton("click");//create button  
        b.setBounds(130,100,100, 40);  
                
        add(b);//adding button on frame  
        setSize(400,500);  
        setLayout(null);  
        setVisible(true); 
    }
}  
