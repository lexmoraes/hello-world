package model;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private String genero;
    private int paginas;
    private boolean disponivel;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Livro(String titulo, String autor, int ano, String genero, int paginas, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.genero = genero;
        this.paginas = paginas;
        this.disponivel = disponivel;
    }

    public boolean verificar_disponibilidade() {
        return disponivel;
    }

    public void emprestar() {
        if (verificar_disponibilidade()){
            System.out.println("Emprestado com sucesso!");
            disponivel = false;
        } else {
            System.out.println("Livro indisponível!");
        }
    }

    public void devolver() {
        if (verificar_disponibilidade()){
            System.out.println("O livro não foi emprestado!");
        } else {
            System.out.println("O livro foi devolvido!");
            disponivel = true;
        }
    }

    public void mostrar_infos(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano: " + this.ano);
        System.out.println("Genero: " + this.genero);
        System.out.println("Paginas: " + this.paginas);
        System.out.println("Disponivel: " + this.disponivel);
    }
}



