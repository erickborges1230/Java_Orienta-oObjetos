package org.example.Encapsulamento;

public class ServidorPublico {
    /***Construtor**/
    public ServidorPublico(){}

    public ServidorPublico(int matricula, String nome, String cargo) {
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
    }

    private static int totalServidor; //Criando um atributo para a classe
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

    public static int getTotalServidor() {
        return totalServidor;
    }

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
    /*
    * Usando recurso de VARARGS, que permite que um métado aceite um número de variável de argumentos do mesmo tipo
    * Passando varias horas extras, tipo: por semana, mês, quinzena
    * public double calcularSalarioHorasExtras(int... horasTrabalhas)
    {
        double salarioMensal = 0;
        for(int horasExtras : horasTrabalhas)
            salarioMensal = salarioMensal + horasExtras*40;
        return (salario + salarioMensal);

    }*/
    public void mostrarTamanhoNome(){
        System.out.println(this.nome.length());
    }
    public void mostrarPreNome(){
        System.out.println(this.nome.substring(0, nome.indexOf(" "))); //Vai mostrar o primeiro nome
    }
    public void mostrarSobreNome(){
        System.out.println(this.nome.substring(nome.indexOf(" "))); //Vai mostrar o primeiro nome
    }

    public static void main(String[] args) {
        //Outro métado de adicionar informação. Agora através de um construtor definido acima.
        ServidorPublico isabela = new ServidorPublico(1, "Isabela Sampaio", "Auditora"); //1º objeto
        totalServidor++;
        isabela.setSalario(15000);
        //Passando no métado VARARGS (40,30,10,15)
        System.out.println("O salário da Isabela mais horas extras é de "+isabela.calcularSalarioHorasExtras(40));
        //Toda vez que for criado um novo construtor precisa ser criado um construtor vazio.
        ServidorPublico heila = new ServidorPublico(); //2º objeto
        //Acessando o atributo de um objeto = nome do objeto + ponto o atributo
        totalServidor++;
        heila.setMatricula(2);
        heila.setNome("Heila galeleia");
        heila.setCargo("Estagiária");

        ServidorPublico maria = new ServidorPublico(); //3º objeto
        totalServidor++;
        maria.setMatricula(3);
        maria.setNome("Maria Fontenele");
        maria.setCargo("Analista");

        ServidorPublico caio = new ServidorPublico(); //4º objeto
        totalServidor++;

        caio.setMatricula(4);
        caio.setNome("Caio Borges") ;
        caio.setCargo("Analista tributário");

        //Agora vou saber quantos servidores eu tenho;
        System.out.println(getTotalServidor());

        isabela.mostrarTamanhoNome();
        isabela.mostrarPreNome();
        isabela.mostrarSobreNome();

    }
}
