public class FuncionarioCaixa {
    private String nome, endereco, sexo;
    private Calculadora calculadora;

    public FuncionarioCaixa() {
        this.nome = "XXXX";
        this.endereco = "XXXXXXX";
        this.sexo = "X";
        this.calculadora = new Calculadora("Preta");
    }
    
    public FuncionarioCaixa(String nome, String endereco, String sexo, Calculadora calculadora) {
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.calculadora = calculadora;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Calculadora getCalculadora() {
        return calculadora;
    }

    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    public double soma(int a, int b){
        return calculadora.soma(a, b);
    }

    public double subtrai(int a, int b){
        return calculadora.subtrai(a, b);
    }

    public double multiplica(int a, int b){
        return calculadora.multiplica(a, b);
    }

    public double divide(int a, int b){
        return calculadora.divide(a, b);
    }

    public double elevaAoQuadrado(int a){
        return calculadora.elevaAoQuadrado(a);
    }

    public double elevaAoCubo(int a){
        return calculadora.elevaAoCubo(a);
    }

    public void imprimeInfo() {
        System.out.println("#### Informações : ####");
        System.out.println("Nome: " + nome + "\nEndereco: " + endereco + "\nSexo: " + sexo);
        System.out.println("Calculadora:\n\t- Cor:" + calculadora.getCor() + "\n\tMemória: " + calculadora.getMemoria());
    }
}
