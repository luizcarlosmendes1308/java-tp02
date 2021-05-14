     1
package javaapplication20;
import java.util.Scanner;
public class JavaApplication20 {
    public static void main(String[] args) {
/* 1. Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro. Caso contrário solicitar novamente apenas o segundo valor.
*/
     Scanner ler = new Scanner(System.in);
	float n1,n2;
	System.out.print("Informe o primeiro numero: ");
        n1 = ler.nextFloat();
        System.out.print("Informe o primeiro numero: ");
        n2 = ler.nextFloat();
       while (n2<n1)  
        {
        System.out.println("O primeiro número é maior do que o primeiro \n");
        System.out.println("Digite outro numero");
        n2 = ler.nextFloat();
        }
         System.out.println("O segundo número (" + n2 + ") é maior do que o primeiro (" + n1 + ")" );   
}
}

     2
package lp1i3_tp002_ex02;
import java.util.Scanner;
public class LP1I3_TP002_EX02 {
   public static void main(String[] args) {
/*  2. Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de erro, se necessário. Após a digitação, exibir: a. O maior valor; b. A soma dos valores; c. A média aritmética dos valores. */
     Scanner ler = new Scanner(System.in);
	    float n=10;
            float maior = 0;
            float menor = 0;
            float soma = 0;
            float media = 0;
            float n1 = 0;
            float N2 = 0;
            for (int i = 1; i <= n; i++)
            {
                float numero = 0;
                System.out.print("Digite o numero "+ i + " : ");
                numero = ler.nextFloat();

                if (numero > maior)
                {
                    maior = numero;
                }
                else
                { 
                    menor = numero;
            }
                if (numero< menor)
                {
                    menor = numero;
                }
                soma = soma + numero;
                media = soma / n;
                if (numero > 0)
                {
                    n1++;
                }
            }
            System.out.print(" o maior numero é :  "+ maior);
            System.out.print("\n a soma é "+ soma);
            System.out.print("\n a media é "+ media);
}
   }

     3
package lp1i3_tp002_ex03;
import java.util.Scanner;
public class LP1I3_TP002_EX03 {
    public static void main(String[] args) {
/*3. Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a digitação dos “N” valores, exibir: a. O maior valor; b. O menor valor; c. A soma dos valores; d. A média aritmética dos valores; e. A porcentagem de valores que são positivos; f. A porcentagem de valores negativos; Após exibir os dados, perguntar ao usuário de deseja ou não uma nova execução do programa. Consistir a resposta no sentido de aceitar somente “S” ou “N” e encerrar o programa em função dessa resposta. 
 */
  Scanner ler = new Scanner(System.in);
	    float n;
            float maior = 0;
            float menor = 0;
            float soma = 0;
            float media = 0;
            float porc1 = 0;
            float porc2 = 0;
            float n1 = 0;
            float N2 = 0;
            System.out.print("Digite a quantidade dos numeros: ");
            n = ler.nextFloat();
            while (n >= 20)
            {
                System.out.print("Digite a quantidade correta: ");
                n = ler.nextFloat();
            }
            while (n < 0)
            {
                System.out.print("Digite a quantidade correta: ");
                n = ler.nextFloat();
            }
            for (int i = 1; i <= n; i++)
            {
                float numero = 0;
                System.out.print("Digite o numero "+ i + " : ");
                numero = ler.nextFloat();
                if (numero > maior)
                {
                    maior = numero;
                }
                else
                { 
                    menor = numero;
            }
                if (numero< menor)
                {
                    menor = numero;
                }
                media = soma / n;
                soma = soma + numero;
                if (numero > 0)
                {
                    n1++;
                }
                else
                    if (numero < 0)
                N2++;
            }
            porc1 = (n1 * 100 ) / n;
            porc2 = (N2 * 100) / n;
            System.out.print(" o maior numero é :  "+ maior);
            System.out.print("\n o menor numero é :  "+ menor);
            System.out.print("\n a soma é "+ soma);
            System.out.print("\n a media é "+ media);
            System.out.print("\n a porcentagem de numero positivo é "+porc1);
            System.out.print("\n a porcentagem de numero positivo  é "+ porc2);
}
}

    4
package lp1i3_tp002_ex04;
import java.util.Scanner;
public class LP1I3_TP002_EX04 {
    public static void main(String[] args) {
/*4. Armazenar seis valores em uma matriz de ordem 2x3. Apresentar os valores na tela. 
*/
            Scanner ler = new Scanner(System.in);
        int [][] matriz = new int [2][3];
        for (int i=0; i<matriz.length; i++){
        for (int j=0; j<matriz[i].length; j++){
        System.out.print("entre com o valor da pos[" + i + "," + j + "] : ");
        matriz[i][j] = ler.nextInt();
          }
    }
    for (int i=0; i<matriz.length; i++){
        for (int j=0; j<matriz[i].length; j++){
        System.out.print(matriz[i][j] +  " |  ");
        }
    }
}
}

     5
package lp1i3_tp002_ex05;
import java.util.Scanner;
public class LP1I3_TP002_EX05 {
    public static void main(String[] args) {
/*5. Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela. */
       Scanner ler = new Scanner(System.in);
        int [][] matriz = new int [3][2];
        for (int i=0; i<matriz.length; i++){
        for (int j=0; j<matriz[i].length; j++){
        System.out.print("entre com o valor da pos[" + i + "," + j + "] : ");
        matriz[i][j] = ler.nextInt();
          }
    }
    for (int i=0; i<matriz.length; i++){
        for (int j=0; j<matriz[i].length; j++){
        
        System.out.print(matriz[i][j] +  " |  ");
        }
    }
}
}
    6
package lp1i3_tp002_ex06;
import java.util.Scanner;
public class LP1I3_TP002_EX06 {
    public static void main(String[] args) {
     /* 6.Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela. */
    Scanner ler = new Scanner(System.in);
    String nomes[][] = new String[2][3];
    for (int i=0;i<2;i++){
    for (int j=0; j<3;j++){
    System.out.println("Diga o nome da posição [" + i + "," + j + "] :");
    nomes[i][j]= ler.next();
    }
    }
    System.out.println();
    System.out.println();
    for (int i=0; i<2; i++){
        for (int j=0; j<3; j++){
        System.out.print(nomes[i][j] +  " ");
        System.out.println();
        }
    
}
}
}

     7
package lp1i3_tp002_ex07;
import java.util.Scanner;
public class LP1I3_TP002_EX07 {
    public static void main(String[] args) {
/*7. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada valor matriz e armazenar o resultado na própria matriz, nas posições correspondentes. 
 */
        Scanner ler = new Scanner(System.in);
        int [][] matriz = new int [3][4];
        for (int i=0; i<matriz.length; i++){
        for (int j=0; j<matriz[i].length; j++){
        System.out.print("entre com o valor da pos[" + i + "," + j + "] : ");
        matriz[i][j] = ler.nextInt();
          }
    }
        System.out.print("Favor digitar o número que ira multiplicar os valores da matriz");
        int n= ler.nextInt();
        for (int i=0; i<matriz.length; i++){
        for (int j=0; j<matriz[i].length; j++){
        System.out.print(matriz[i][j]*n +  " ");
        }
    }
}
}


     8
package lp1i3_tp002_ex08;
import java.util.Scanner;
public class LP1I3_TP002_EX08 {
    public static void main(String[] args) {
/*8. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada valor matriz e armazenar o resultado em outra matriz de mesma ordem, nas posições correspondentes. Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por colunas.
 */
        Scanner ler = new Scanner(System.in);
        int [][] matriz = new int [3][4];
        for (int i=0; i<matriz.length; i++){
        for (int j=0; j<matriz[i].length; j++){
        System.out.print("entre com o valor da pos[" + i + "," + j + "] : ");
        matriz[i][j] = ler.nextInt();
          }
    }
        System.out.print("Favor digitar o número que ira multiplicar os valores da matriz: ");
        int n= ler.nextInt();
        for (int i=0; i<matriz.length; i++){
        for (int j=0; j<matriz[i].length; j++){
        
        System.out.print(matriz[i][j]*n +  " ");
        }
        System.out.println();
    }
}
}

       9
package lp1i3_tp002_ex09;
import java.util.Scanner;
public class LP1I3_TP002_EX09 {
    public static void main(String[] args) {
/*
9. Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário, sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a digitação dos elementos, calcular e exibir a matriz transposta. 

*/
        Scanner ler = new Scanner(System.in);
        int n, p;
        System.out.print("Entre com o primeiro valor da matriz: ");
        n = ler.nextInt();
        System.out.print("Entre com o segundo valor da matriz: ");
        p = ler.nextInt();
        while (n>10 || p>10){
        System.out.println("favor digitar novamente");
        System.out.print("Entre com o primeiro valor da matriz: ");
         n = ler.nextInt();
        System.out.print("Entre com o segundo valor da matriz: ");
        p = ler.nextInt();
        }
        int [][] matriz = new int [n][p];
        int [][] transposta = new int [p][n];
        for (int i=0; i<n; i++){
        for (int j=0; j<p; j++){
        System.out.print("entre com o valor da pos[" + i + "," + j + "] : ");
        matriz[i][j] = ler.nextInt();
        transposta[j][i] = matriz [i][j];
          }
    }
        for (int i=0; i<n; i++){
        for (int j=0; j<p; j++){
        
        System.out.print(matriz[i][j]+  " ");
        }
        System.out.println();
    }
        for (int j=0; j<transposta.length; j++){
        for (int i=0; i<transposta[j].length; i++){
        
        System.out.print(transposta[j][i]+  " ");
        }
        System.out.println();
    } 
}
}

      10
package lp1i3_tp002_ex10;
import java.util.Scanner;
public class LP1I3_TP002_ex10 {
    public static void main(String[] args) {
/*10. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário, sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos a matriz inversa. Exibir as matrizes na tela, sob a forma matricial (linhas x colunas). */
        Scanner ler = new Scanner(System.in);
        int n, p;
        System.out.print("Entre com o primeiro valor da matriz: ");
        n = ler.nextInt();
        System.out.print("Entre com o segundo valor da matriz: ");
        p = ler.nextInt();
        while (n>10 || p>10 || n!=p){
        System.out.println("favor digitar novamente");
        System.out.print("Entre com o primeiro valor da matriz: ");
         n = ler.nextInt();
        System.out.print("Entre com o segundo valor da matriz: ");
        p = ler.nextInt();
        }
        int [][] matriz = new int [n][p];
        int [][] inversa = new int [p][n];
        for (int i=0; i<n; i++){
        for (int j=0; j<p; j++){
        System.out.print("entre com o valor da pos[" + i + "," + j + "] : ");
        matriz[i][j] = ler.nextInt();
        inversa[j][i] = matriz [i][j];
          }
    }
        for (int i=0; i<n; i++){
        for (int j=0; j<p; j++){
        System.out.print(matriz[i][j]+  " ");
        }
        System.out.println();
    }        
}
}
      11
package lp1i3_tp002_ex11;

import java.util.Scanner;

public class LP1I3_TP002_EX11 {

    public static void main(String[] args) {
        /*11. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário, 
        sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos, calcular 
        e exibir determinante da matriz.*/
       Scanner ler = new Scanner(System.in);
        int n, p;
        System.out.print("Entre com o primeiro valor da matriz: ");
        n = ler.nextInt();
        System.out.print("Entre com o segundo valor da matriz: ");
        p = ler.nextInt();
        while (n>10 || p>10 || n!=p){
        System.out.println("favor digitar novamente");
        System.out.print("Entre com o primeiro valor da matriz: ");
         n = ler.nextInt();
        System.out.print("Entre com o segundo valor da matriz: ");
        p = ler.nextInt();
        }
        int [][] matriz = new int [n][p];
        int [][] inversa = new int [p][n];
        for (int i=0; i<n; i++){
        for (int j=0; j<p; j++){
        System.out.print("entre com o valor da pos[" + i + "," + j + "] : ");
        matriz[i][j] = ler.nextInt();
        inversa[j][i] = matriz [i][j];
          }
    }
        if (n==1){
           
            System.out.println(matriz);
        }
   
        if (n==2){
        int det2 = ((matriz[0][0]*matriz[1][1])-(matriz[0][1]*matriz[1][0]));
        System.out.print("O determinante da matriz é:" + det2);
    }
       
        if (n==3){
            int i, j;
            i = ((matriz[0][0]*matriz[1][1]*matriz[2][2])+(matriz[0][1]*matriz[1][2]*matriz[2][0])+(matriz[0][2]*matriz[1][0]*matriz[2][1]));
            j = ((matriz[0][1]*matriz[1][0]*matriz[2][2])+(matriz[0][0]*matriz[1][2]*matriz[2][1])+(matriz[0][2]*matriz[1][1]*matriz[2][0]));
        System.out.println("o determinante é :" + (i-j));
        }
        for (int i=0; i<n; i++){
        for (int j=0; j<p; j++){
       
        System.out.print(matriz[i][j]+  " ");
        }
        System.out.println();
       
       
    }
    }
}
