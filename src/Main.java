import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Digite um CEP VALIDO");
        Scanner leitura = new Scanner(System.in);
        var cep = leitura.nextLine();

        ConsultaCep consultaCep = new ConsultaCep();
        Endereco novoEndereco = consultaCep.buscaEndereco(cep);

        GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
        geradorDeArquivo.salvaJson(novoEndereco);

        System.out.println(novoEndereco);

    }
}