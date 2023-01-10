package main;

import java.util.ArrayList;
import java.util.List;

public class Gerenciador {
    private List<Tarefa> tarefas = new ArrayList<Tarefa>();

    public void executarTarefa(Tarefa tarefa){
        this.tarefas.add(tarefa);
        tarefa.executar();
    }

    public void cancelarTarefa(Tarefa tarefa){
        if(this.tarefas.contains(tarefa)){
            Tarefa tarefaAuxiliar = this.tarefas.remove(this.tarefas.indexOf(tarefa));
            tarefaAuxiliar.cancelar();
        }
    }
}
