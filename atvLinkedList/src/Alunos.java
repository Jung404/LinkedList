public class Alunos {
    private String nome, matricula, datanasc;

    public Alunos(String nome, String matricula, String datanasc){
        this.nome = nome;
        this.matricula = matricula;
        this.datanasc = datanasc;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getDatanasc(){
        return datanasc;
    }
    public void setDatanasc(String datanasc){
        this.datanasc = datanasc;
    }

    @Override
    public String toString() {
        return "alunos{" + "nome=" + nome + ", matricula=" + matricula + ", datanasc=" + datanasc + '}';
    }

}
