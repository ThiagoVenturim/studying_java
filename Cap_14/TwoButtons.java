import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class TwoButtons{
    private JFrame frame;
    private JLabel label;

    public static void main(String[] args){
        TwoButtons gui = new TwoButtons();
        gui.go();
    }

    public void go(){
        frame= new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton labelButton = new JButton("Change Label");
        labelButton.addActionListener(event -> label.setText("OUCH!"));

        JButton colorButton  = new JButton("Change Circle");
        colorButton.addActionListener(event -> frame.repaint());
    
        label = new JLabel(" I´m a label");
        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setSize(500,400);
        frame.setVisible(true);

    }
}


class MyDrawPanel extends JPanel {
   MyDrawPanel() {
   }

   public void paintComponent(Graphics var1) {
      Graphics2D var2 = (Graphics2D)var1;
      Random var3 = new Random();
      int var4 = var3.nextInt(256);
      int var5 = var3.nextInt(256);
      int var6 = var3.nextInt(256);
      Color var7 = new Color(var4, var5, var6);
      var4 = var3.nextInt(256);
      var5 = var3.nextInt(256);
      var6 = var3.nextInt(256);
      Color var8 = new Color(var4, var5, var6);
      GradientPaint var9 = new GradientPaint(70.0F, 70.0F, var7, 150.0F, 150.0F, var8);
      var2.setPaint(var9);
      var2.fillOval(75, 75, 100, 100);
   }
}
