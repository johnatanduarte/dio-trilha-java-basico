public class Operadores {
    public static void main(String[] args) {
        /* 
    //classe Operadores.java
        String nomeCompleto = "LINGUAGEM" + "JAVA";
		
    //qual o resultado das expressoes abaixo?
        String concatenacao ="?"; 
        System.out.println(concatenacao);
    
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
    
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
    
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
    
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
    
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
        */

        // classe Operadores.java
int a, b;

a = 5;
b = 6;

/* String resultado = "";
if(a==b)
   resultado = "verdadeiro";
else
   resultado = "falso"; */


//MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
String resultado = (a==b) ? "verdadeiro" : "falso";

System.out.println(resultado);
    }
}
