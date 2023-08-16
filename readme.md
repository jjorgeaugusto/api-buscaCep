# API de Busca de CEP utilizando a API ViaCEP

Esta é uma API em Java que permite buscar informações de endereços a partir de um CEP utilizando a API do ViaCEP. Ela faz requisições para a URL do ViaCEP e manipula os dados de entrada para exibir informações relevantes do endereço.

## Como funciona

A API é construída em Java e utiliza a biblioteca Gson para salvar um novo Json com as informações da busca do usuário. O processo de busca do CEP é feito da seguinte maneira:

1. O usuário insere um CEP.
2. A API constrói a URL de requisição para o ViaCEP usando o CEP inserido.
3. A API faz uma requisição HTTP para a URL do ViaCEP.
4. A resposta JSON é recebida pela API.
5. A API utiliza o Gson para extrair os campos relevantes (cep, logradouro, complemento, bairro, localidade, uf e DDD) do JSON recebido.
6. Os dados são formatados em um novo JSON utilizando o método `GsonBuilder().setPrettyPrinting().create()`.
7. Um arquivo JSON contendo as informações é gerado e salvo no diretório do projeto.

## Pré-requisitos

Certifique-se de ter o seguinte instalado antes de executar a API:

- Java Development Kit (JDK)
- Biblioteca Gson (pode ser adicionada como dependência no arquivo de configuração do seu projeto)

## Como usar

1. Clone este repositório para a sua máquina local.
2. Abra o projeto em sua IDE Java preferida.
3. Configure as dependências necessárias (incluindo a biblioteca Gson).
4. Execute o código da API.
5. Insira um CEP válido quando solicitado.
6. O programa irá imprimir as informações do endereço formatadas e salvar um arquivo JSON no diretório do projeto.

## Exemplo de Uso

Aqui está um exemplo de como usar a API para buscar informações de um CEP e gerar um arquivo JSON com os dados do endereço:

```java
    // Solicita ao usuário que insira um CEP válido
    System.out.println("Digite um CEP válido:");
    Scanner leitura = new Scanner(System.in);
    String cep = leitura.nextLine();

    // Inicializa a classe de consulta de CEP
    ConsultaCep consultaCep = new ConsultaCep();
    
    // Realiza a busca do endereço correspondente ao CEP
    Endereco novoEndereco = consultaCep.buscaEndereco(cep);

    // Inicializa a classe para gerar arquivos JSON
    GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
    
    // Salva os dados do endereço em um arquivo JSON
    geradorDeArquivo.salvaJson(novoEndereco);


