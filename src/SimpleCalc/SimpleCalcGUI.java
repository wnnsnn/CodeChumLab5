package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField lblResult;

    public SimpleCalcGUI(){

        try{
           btnCompute.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   String operation = cbOperations.getSelectedItem().toString();
                   switch (operation){
                       case "+":
                           try {
                               int a = Integer.parseInt(tfNumber1.getText());
                               int b = Integer.parseInt(tfNumber2.getText());
                               int result = a + b;
                               lblResult.setText(Integer.toString(result));
                           }catch (Exception ee){
                               JOptionPane.showMessageDialog(panel1,ee.getMessage());
                           }
                           break;
                       case "-":
                           try{
                           int a1 = Integer.parseInt(tfNumber1.getText());
                           int b1 = Integer.parseInt(tfNumber2.getText());
                           int result1 = a1-b1;
                           lblResult.setText(Integer.toString(result1));
                               lblResult.setEditable(false);
                           }catch (Exception ee){
                               lblResult.setEditable(true);
                               JOptionPane.showMessageDialog(panel1,ee.getMessage());
                           }

                           break;

                       case "/":
                           try{
                           int a2 = Integer.parseInt(tfNumber1.getText());
                           int b2 = Integer.parseInt(tfNumber2.getText());
                           int result2 = a2/b2;
                           lblResult.setText(Integer.toString(result2));
                           lblResult.setEditable(false);
                           }catch (Exception ee){
                               lblResult.setEditable(true);
                               JOptionPane.showMessageDialog(panel1,ee.getMessage());
                           }
                           break;
                       case "*":
                           try{
                           int a3 = Integer.parseInt(tfNumber1.getText());
                           int b3 = Integer.parseInt(tfNumber2.getText());
                           int result3 = a3*b3;
                           lblResult.setText(Integer.toString(result3));
                           lblResult.setEditable(false);
                           }catch (Exception ee){
                               lblResult.setEditable(true);
                               JOptionPane.showMessageDialog(panel1,ee.getMessage())
                               ;
                           }
                           break;
                   }
                   lblResult.setEditable(false);
               }
           });
        }catch (Exception err){
            JOptionPane.showMessageDialog(panel1, err.getMessage());
        }
    }

    public static void main(String[] args) {
        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setContentPane(app.panel1);
        app.setTitle("Simple Calculator");
        app.setSize(500, 800);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}

