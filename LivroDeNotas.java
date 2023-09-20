public class LivroDeNotas {
    private String nomeDoCurso;

    //Construtor com parametro
    public LivroDeNotas(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }
    //construtor padrao
    public LivroDeNotas () {
        
    }
    //metodode acesso = getters
    public String getNomeDoCurso () {
        return nomeDoCurso;
    }
    //metodos modificadores = setters
    public void setNomeDoCurso (String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

    public void exibeMensagem () {
        System.out.println("Bem vindo ao livro de notas do curso " + nomeDoCurso);
    }
}