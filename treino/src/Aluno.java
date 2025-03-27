
public class Aluno {
    private int matricula = 5;
    public String nome;
    public String email;
    public int etapa;
    public String curso;


    public int getmatricula(){
        return this.matricula;
    }
    public void setmatricula(int a){
        this.matricula = a;
    }
    

    public Aluno(int matricula, String nome, String email, int etapa, String curso){
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.etapa = etapa;
        this.curso = curso; 
    }

    public Aluno(String nome, String email, int etapa, String curso){
        this.nome = nome;
        this.email = email;
        this.etapa = etapa;
        this.curso = curso;
    }
} 