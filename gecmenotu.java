
package orrnek1;

import javax.swing.JOptionPane;

public class Orrnek1 {

    public static void main(String[] args) {
      String vize = JOptionPane.showInputDialog("vize notunu giriniz");
      String fin = JOptionPane.showInputDialog("final notunu giriniz");
      int vizeInt = Integer.parseInt(vize);
      int finInt = Integer.parseInt(fin);
      double ort = (double)vizeInt *40/100 + (double)finInt *60/100;
      ort = Math.round(ort);
      int ortInt = (int)ort;
      if(ort >= 45)
          JOptionPane.showInputDialog(null,ort + " notu ile geçti");
     else
          System.out.println(ort + "notu ile kaldı");
    } 
}
