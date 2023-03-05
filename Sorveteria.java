import java.util.Scanner;

public class Sorveteria { // crio a classe Sorveteria para colocar as funções
    public static int saborMaisPopular(int[] votos) { // recebe como parâmetro o array 'votos'
        int[] contagem = new int[5]; // array para contagem dos votos
        for (int voto : votos) { //percorro o array
            contagem[voto]++; // toda vez que percorre, incrementa no array até chegar ao seu limite
        }
        int saborMaisVotado = 0; // crio uma variável 
        for (int i = 1; i < contagem.length; i++) { // percorro o array
            if (contagem[i] > contagem[saborMaisVotado]) { // comparo a contagem dos outros sabores com a contagem do sabor mais votado
                saborMaisVotado = i; // atualiza com o sabor mais votado
            }
        }
        return saborMaisVotado; //retorna o código do sabor mais votado
    }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Digite a quantidade de votos: ");// peço para o usuário digitar a quantidade de votos
            int n = scanner.nextInt(); //recebo o valor digitado
            int[] votos = new int[n]; // crio um array do tamanho que o usuário digitou
    
            for (int i = 0; i < n; i++) { // um for para ler os códigos dos sabores do tamanho da qtd de votos
                System.out.print("Digite o código do sabor (0 a 4) do voto " + (i+1) + ": "); // pedir para o usuário digitar o código
                votos[i] = scanner.nextInt();// armazenar os votos 
            }
    
            int saborMaisPopular = Sorveteria.saborMaisPopular(votos); //a função criada é chamada com o parâmetro 'votos'
            System.out.println("O sabor mais popular é " + saborMaisPopular);// imprime o sabor mais popular 
        }
    }
    

