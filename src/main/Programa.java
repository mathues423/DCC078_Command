package main;

public class Programa {
    private int ID;
    private String descricao;
    private String situacao;

    public Programa(int ID, String descricao) {
        this.ID = ID;
        this.descricao = descricao;
    }

    public String getInfo(){
        return "Informação ("+descricao+") em estado " + situacao;
    }

    public void abrirPrograma(){
        this.situacao = "'Aberto'";
    }

    public void fecharPrograma(){
        this.situacao = "'Fechado'";
    }
}
