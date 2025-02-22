public class MinhaSegundaED {
    String[] nomes = new String[26];
    int quantidadeNomes = 0;

    public boolean validarNome(String nome){
        return nome != null && !nome.isEmpty();
    }

    public int getIndice(String nome) {
        if(validarNome(nome)){
            return -1;
        }

        char letraInicial = nome.toLowerCase().toCharArray()[0];

        return switch (letraInicial) {
            case 'a' -> 0;
            case 'b' -> 1;
            case 'c' -> 2;
            case 'd' -> 3;
            case 'e' -> 4;
            case 'f' -> 5;
            case 'g' -> 6;
            case 'h' -> 7;
            case 'i' -> 8;
            case 'j' -> 9;
            case 'k' -> 10;
            case 'l' -> 11;
            case 'm' -> 12;
            case 'n' -> 13;
            case 'o' -> 14;
            case 'p' -> 15;
            case 'q' -> 16;
            case 'r' -> 17;
            case 's' -> 18;
            case 't' -> 19;
            case 'u' -> 20;
            case 'v' -> 21;
            case 'w' -> 22;
            case 'x' -> 23;
            case 'y' -> 24;
            case 'z' -> 25;
            default -> -1;
        };
    }

    public void adicionar(String nome) {
        int posicao = getIndice(nome);

        if (posicao == -1) {
            throw new IllegalArgumentException("Nome inválido ou letra inicial não mapeada.");
        }

        if (nomes[posicao] == null) {
            nomes[posicao] = nome;
            quantidadeNomes++;
        } else {
            System.out.println("Posição já ocupada por outro nome.");
        }
    }

    public boolean posicaoOcupada(int posicao) {
        return nomes[posicao] != null && nomes[posicao] != "";
    }

    public void remover(String nome) {
        int posicao = getIndice(nome);

        if (posicao == -1 || nomes[posicao] == null) {
            throw new IllegalArgumentException("Nome não encontrado para remoção.");
        }

        nomes[posicao] = null;
        quantidadeNomes--;
    }


    public boolean contem(String nome) {
        int indice = getIndice(nome);

        return indice != -1 && nomes[indice] != null;
    }

    public String getNome(int posicao) {
        if (posicao < 0 || posicao >= 26) {
            throw new ArrayIndexOutOfBoundsException("Posição fora do intervalo.");
        }

        return nomes[posicao] != null ? nomes[posicao] : "Posição vazia";
    }

    public int totalNomes() {
        return quantidadeNomes;
    }
}