import java.util.Random;
import java.util.Scanner;
import java.math.*;
import javax.swing.JOptionPane;


public class buclesWhile {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        /* String clave ="jafet";
       String vacio ="";
       while (clave.equals(vacio)==false){

            vacio =JOptionPane.showInputDialog("Introduzca una clave");

            if (clave.equals(vacio)==true) {
               JOptionPane.showMessageDialog(null,"Clave correcta");
          int opcion=JOptionPane.showConfirmDialog(null,"Desea continuar ?");
             if(opcion==JOptionPane.YES_OPTION){
                 JOptionPane.showMessageDialog(null,"Bienvenido Jafet");
             }
            }else{
                JOptionPane.showMessageDialog(null,"Clave incorrecta");
            int ve=    JOptionPane.showConfirmDialog(null,"Deseas continuar ?");
                if(ve==JOptionPane.YES_OPTION){

                }else{

                    JOptionPane.showMessageDialog(null,"Cerrando app");
                    break;
                }
            }


        }*/
        int variable_contadora =1;
        int num = 0;
        int numero_aleatorio = random.nextInt(100);
          while(numero_aleatorio!=num){

            System.out.println("Digite un numero");
            num = sc.nextInt();


            if(numero_aleatorio==num){
                System.out.println("Los numeros son iguales");
                System.out.println("La cantidad de intentos es "+variable_contadora+ " Y el numero del random es "+numero_aleatorio);

                break;
            }else if(numero_aleatorio>num) {
                System.out.println("El numero es mayor");

            }else{
                System.out.println("El numero es menor");


            }
              variable_contadora=variable_contadora +1;
        }

      }

}


