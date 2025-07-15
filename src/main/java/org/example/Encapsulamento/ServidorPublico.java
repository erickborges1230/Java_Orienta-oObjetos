package org.example.Encapsulamento;

public class ServidorPublico {
    private int matricula;
    private String nome;
    private String foto;
    private String orgao;
    private String veiculo;
    private double salario;
    private int idade;
    private int tempoContribuicao;
    private String cargo;
    private String lotacao;
    private String exercicio;
    private String email;
    private String telefone;
    private String celular;
    private String cpf;
    private String naturalidade;

    public static void main(String[] args) {
        ServidorPublico isabela = new ServidorPublico(); //1º objeto
        //Acessando o atributo de um objeto = nome do objeto + ponto o atributo
        isabela.matricula = 1;
        isabela.nome = "Isabela Sampaio";
        isabela.cargo = "Auditora";
        ServidorPublico heila = new ServidorPublico(); //2º objeto
        heila.matricula = 2;
        heila.nome = "Heila galeleia";
        heila.cargo = "Estagiária";
        ServidorPublico maria = new ServidorPublico(); //3º objeto
        maria.matricula = 3;
        maria.nome = "Maria Fontenele";
        maria.cargo = "Analista";
        ServidorPublico caio = new ServidorPublico(); //4º objeto
        caio.matricula = 4;
        caio.nome = "Caio Borges ";
        caio.cargo = "Analista tributário";

    }
}
