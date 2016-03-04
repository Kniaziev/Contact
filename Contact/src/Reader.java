/**
 * Created by kniaziev on 3/4/2016.
 */
import javax.swing.JOptionPane;

import static javax.swing.JOptionPane.showMessageDialog;

public class Reader {
    int i, k;
    String n1, n2;
    public void Scan(){
        n1 = JOptionPane.showInputDialog("Enter the first number");
        n2 = JOptionPane.showInputDialog("Enter the second number");
        i = Integer.parseInt(n1);
        k = Integer.parseInt(n2);

    }
    public void Scan(int a, int b){
        showMessageDialog(null, "Now your first number is " +a);
        showMessageDialog(null, "Now your second number is " +b);

    }
}
