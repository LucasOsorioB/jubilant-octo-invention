

public class App {
    public static void main(String[] args) throws Exception {
        Aluno lucas = new Aluno(10434481, "lucas", "tukhas6@hotmail.com", 3, "CC");
        System.out.println(lucas.nome + " " + lucas.getmatricula() + " " + lucas.email + " " + lucas.etapa + " " + lucas.curso);
        Aluno arthur = new Aluno("arthur", "arthurtorres@gmail.com", 3, "CC");
        System.out.println(arthur.nome + " " + arthur.getmatricula() + " " + arthur.email + " " + arthur.etapa + " " + arthur.curso);    }   


}
