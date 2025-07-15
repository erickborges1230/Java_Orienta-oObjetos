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

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getOrgao() {
        return orgao;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTempoContribuicao() {
        return tempoContribuicao;
    }

    public void setTempoContribuicao(int tempoContribuicao) {
        this.tempoContribuicao = tempoContribuicao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getLotacao() {
        return lotacao;
    }

    public void setLotacao(String lotacao) {
        this.lotacao = lotacao;
    }

    public String getExercicio() {
        return exercicio;
    }

    public void setExercicio(String exercicio) {
        this.exercicio = exercicio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }
    public double calcularSalarioHorasExtras(int horasTrabalhas)
    {
        double salarioMensal = salario + horasTrabalhas * 40;
        return (salarioMensal);

    }

    public static void main(String[] args) {
        ServidorPublico isabela = new ServidorPublico(); //1º objeto
        //Acessando o atributo de um objeto = nome do objeto + ponto o atributo
        isabela.setMatricula(1);
        isabela.setNome("Isabela Sampaio");
        isabela.setCargo("Auditora");
        isabela.setSalario(15000);
        System.out.println("O salário da Isabela mais horas extras é de "+isabela.calcularSalarioHorasExtras(40));
        ServidorPublico heila = new ServidorPublico(); //2º objeto
        heila.setMatricula(2);
        heila.setNome("Heila galeleia");
        heila.setCargo("Estagiária");
        ServidorPublico maria = new ServidorPublico(); //3º objeto
        maria.setMatricula(3);
        maria.setNome("Maria Fontenele");
        maria.setCargo("Analista");
        ServidorPublico caio = new ServidorPublico(); //4º objeto
        caio.setMatricula(4);
        caio.setNome("Caio Borges") ;
        caio.setCargo("Analista tributário");

    }
}
