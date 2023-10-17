import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"bienvenido a nuestros cajeros ");
        float ingreso,retiro,saldo = 10000;

        int opcion = 0;


        while (opcion!=3) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"1. ingresar dinero \n"+"2.retirar dinero\n "+"3.salir\n"));

            switch (opcion){


                case 1: ingreso = Integer.parseInt(JOptionPane.showInputDialog("CUANTO DINERO DESEA INGRESAR"));
                    saldo = saldo+ingreso;
                    JOptionPane.showMessageDialog(null,"su saldo actual es de  "+saldo);
                    break;



                case 2: retiro=Integer.parseInt(JOptionPane.showInputDialog("cuanto dinero desea retirar"));
                    if (retiro > saldo ){
                        JOptionPane.showMessageDialog(null,"USTED NO POSEE SALDO SUFICIENTE");}
                    else {
                        saldo = saldo -retiro;


                        JOptionPane.showMessageDialog(null,"su saldo actual es de  "+saldo);}
                    break;
                case 3: break;


            }




        }





    }


}