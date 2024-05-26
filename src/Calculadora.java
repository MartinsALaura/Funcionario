public class Calculadora {
    private double memoria;
    private String cor;
    
    public Calculadora(String cor) {
        this.cor = cor;
        this.memoria = 0;
    }
    
    public double getMemoria() {
        return memoria;
    }

    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double soma(int a, int b){
        return a + b;
    }

    public double subtrai(int a, int b){
        return a - b;
    }

    public double multiplica(int a, int b){
        return a * b;
    }

    public double divide(int a, int b){
        return a / b;
    }

    public double elevaAoQuadrado(int a){
        return (int)(Math.pow(a, 2));
    }

    public double elevaAoCubo(int a){
        return (int)(Math.pow(a, 3));
    }

    public void imprimeInfo() {
        System.out.println("#### Informações Calculadora: ####");
        System.out.println("Cor: " + cor + "\nMemória: " + memoria);
        System.out.println("Operações: soma, subtração, divisão, multiplicação, elevação ao quadrado e ao cubo.");
    }
}
