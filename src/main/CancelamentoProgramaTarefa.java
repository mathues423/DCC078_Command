package main;

public class CancelamentoProgramaTarefa implements Tarefa{

    private Programa programa;

    public CancelamentoProgramaTarefa(Programa programa){
        this.programa = programa;
    }

    @Override
    public void executar() {
        this.programa.fecharPrograma();
    }

    @Override
    public void cancelar() {
        this.programa.abrirPrograma();
    }
}
