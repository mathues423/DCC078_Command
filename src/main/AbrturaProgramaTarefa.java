package main;

public class AbrturaProgramaTarefa implements Tarefa{

    private Programa programa;

    public AbrturaProgramaTarefa(Programa programa){
        this.programa = programa;
    }

    @Override
    public void executar() {
        this.programa.abrirPrograma();
    }

    @Override
    public void cancelar() {
        this.programa.fecharPrograma();
    }
}
