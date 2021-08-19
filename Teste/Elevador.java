package Teste;
/*
    Crie uma classe Elevador para armazenar as informações de um elevador de prédio.
     x - A classe deve armazenar o andar atual (térreo = 0),
     x - total de andares no prédio (desconsiderando o térreo),
     x - capacidade do elevador
     x - e quantas pessoas estão presentes nele.

     A classe deve também disponibilizar os seguintes métodos:

     x - ** Inicializar: que deve receber como parâmetros a capacidade do elevador
        e o total de andares no prédio (os elevadores sempre começam no térreo e vazio);
     x - ** Entrar: para acrescentar UMA pessoa no elevador (só deve acrescentar se ainda houver espaço);
     x - ** Sair: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
     x - ** Subir: para subir um andar (não deve subir se já estiver no último andar);
     x - ** Descer: para descer um andar (não deve descer se já estiver no térreo);

     - Obs.: Encapsular todos os atributos da classe (criar os métodos set e get).
*/
public class Elevador {
    private Integer andarAtual;
    private Integer quantidadeAndares;
    private Integer capacidadeElevador;
    private Integer quantidadePessoas;

    public Elevador() {
        this.andarAtual = 0;
        this.quantidadePessoas = 0;
    }

    public void descer(){
        if(this.andarAtual > 0){
            this.andarAtual--;
        }
    }

    public void subir(){
        if(this.andarAtual < this.quantidadeAndares){
            this.andarAtual++;
        }
    }

    public void sair(){
        if(this.quantidadePessoas > 0){
            this.quantidadePessoas--;
        }
    }

    public void entrar(){
        if(this.quantidadePessoas < this.capacidadeElevador){
            this.quantidadePessoas++;
        }
    }

    public void iniciar(Integer capacidadeElevador, Integer quantidadeAndares){
        this.capacidadeElevador = capacidadeElevador;
        this.quantidadeAndares = quantidadeAndares;
    }

    public Integer getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(Integer andarAtual) {
        this.andarAtual = andarAtual;
    }

    public Integer getQuantidadeAndares() {
        return quantidadeAndares;
    }

    public void setQuantidadeAndares(Integer quantidadeAndares) {
        this.quantidadeAndares = quantidadeAndares;
    }

    public Integer getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public void setCapacidadeElevador(Integer capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public Integer getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(Integer quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }
}
