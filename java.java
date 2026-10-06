//Main


public class Main {
    public static void main(String[] args) {
        new PrimeCheck();
    }
}


//PrimeCheck

import java.awt.*;
import java.awt.event.*;

public class PrimeCheck extends MyFrame implements ActionListener {
    Label label1, result;
    TextField entryField;   
    Button checkPrime, checkEven;
    PrimeCheck() {
        setTitle("Checker for Prime Number");
        label1 = new Label("Enter a number");
        result = new Label("");
        result.setSize(250, 25);
        entryField = new TextField(10);
        checkPrime = new Button("CHECK PRIME");
        checkEven = new Button("CHECK EVEN");
        setLayout(new FlowLayout());
        add(label1);
        add(entryField);
        add(checkPrime);
        add(checkEven);
        add(result);
        checkPrime.addActionListener(this);
        checkEven.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == checkPrime) {
            int value = Integer.parseInt(entryField.getText());
            boolean checkNo = true;
            for (int div = 2; div < value; div++) {
                if (value%div==0) {
                    checkNo = false;
                    break;
                }
            }
            if (checkNo)    result.setText("" + value + " is Prime Number");
            else            result.setText("" + value + " is Not Prime Number");
        }
        if (ae.getSource() == checkEven) {
            int value = Integer.parseInt(entryField.getText());
            result.setText((value%2==0) ? "Even" : "Odd");           
        }
    }
}


//MyFrame 



import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements MouseListener, WindowListener {
    MyFrame() {
        setSize(400, 500);
        setLayout(null);
        setLocationRelativeTo(null);
        setBackground(Color.GRAY);
        setVisible(true);
    }
    public void windowClosing(WindowEvent we) { System.exit(0); }
    public void windowDeiconified(WindowEvent we) {}
    public void windowIconified(WindowEvent we) {}
    public void windowDeactivated(WindowEvent we) {}
    public void windowActivated(WindowEvent we) {}
    public void windowOpened(WindowEvent we) {}
    public void windowClosed(WindowEvent we) {}


    public void mouseEntered(MouseEvent me) {}
    public void mouseExited(MouseEvent me) {}
    public void mouseClicked(MouseEvent me) {}
    public void mousePressed(MouseEvent me) {}
    public void mouseReleased(MouseEvent me) {}
}
