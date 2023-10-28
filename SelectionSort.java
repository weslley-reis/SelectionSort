import java.util.Scanner;
import java.util.InputMismatchException;

/* Selection Sort (Ordenação por Seleção):

Encontra o menor elemento da lista e o coloca na primeira posição.
Em seguida, encontra o segundo menor e o coloca na segunda posição.
Continua esse processo até que a lista inteira esteja ordenada.
Tem uma complexidade de tempo de O(n^2) no pior caso. */

public class SelectionSort{
    public static void main(String[] args) {
        int i, j, temp, posicaoMenor, tamArr;

        System.out.println("Digite o tamanho do array: ");
        Scanner entrada = new Scanner(System.in);

        try{
            tamArr = entrada.nextInt();
        } catch(InputMismatchException e){
            System.err.println("Erro: Digite um número valido!");
            return;
        } 

        int arr[] = new int[tamArr];

        System.out.println("Digite os valores do array: ");
        try {
            for(i = 0; i < arr.length; i++){
                arr[i] = entrada.nextInt();
            }
        } catch (InputMismatchException e) {
            System.err.println("Erro: Digite um número valido!");
            return;
        } finally{
            entrada.close();
        }

        for(i = 0; i < arr.length - 1; i++){
            
            for(j = i + 1; j < arr.length; j++){
                posicaoMenor = i;
                if(arr[j] < arr[posicaoMenor]){   
                  posicaoMenor = j;  
                } 
                if(i != posicaoMenor){
                temp = arr[posicaoMenor];
                arr[j] = arr[i];
                arr[i] = temp;
                }
            }
      
        }

        System.out.println("Array ordenardo!");
        System.out.print("{");
           
        for (i = 0; i < arr.length; i++){
             System.out.print(arr[i]);
             if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("}");
    }
}
