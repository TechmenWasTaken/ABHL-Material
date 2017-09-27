/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materiel1;
import java.awt.Color;

/**
 *
 * @author Techmen
 */
public class Function {
    static Color c1 = new Color(52,152,219);
    static Color c2 = new Color(236,240,241);
    static int activePan = 0;
    public static void leftMenuColor(javax.swing.JPanel jp){
        if(jp.getBackground().equals(c1)){
            jp.setBackground(c2);
        }else {
            jp.setBackground(c1);
        }
    }
    public static int whosActive(){
        return activePan;
    }
    public static void setActive(int i) {
        activePan = i;
    }
    
}
