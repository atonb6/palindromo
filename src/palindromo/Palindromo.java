
package palindromo;

import java.util.Scanner;
/**
 *
 * @author Philippe
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String palindromo, sinsignos=" ", minus, letras, frase;char letrafinal, letrainicial;int largo,x, a=0;
 
    Scanner leer= new Scanner(System.in);
    
        System.out.println("Ingrese su supuesto palíndromo");
        palindromo = leer.nextLine();
        minus = (palindromo.replaceAll(" ", ""));
        largo = minus.length();
        
            for(x=0;x<largo;++x)
            {
                if(!Character.isLetter(palindromo.charAt(x))){
                    
                     sinsignos = sinsignos.replace(palindromo.charAt(x),' '); 
                     //System.out.println(sinsignos);
                     
                }
            }
        
        minus = sinsignos.toLowerCase();
        minus = (minus.replaceAll(" ", ""));
        //System.out.println(minus);
        largo = minus.length();
        //System.out.println(largo);
        
        for(x=0;x<largo;++x){
        letrafinal = minus.charAt((largo-1)-x);
        letrainicial= minus.charAt(x);
        
            if(letrafinal==letrainicial){
            a=a+1;
            }
        }
        
        if(a==largo){
                System.out.println("Es un Palíndromo");
        }
        else{
                System.out.println("No es un palíndromo");
        }
    
}
}
