package teste;

import main.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GerenciadorTest {
    Gerenciador gerente;
    Programa app;

    @BeforeEach
    void setUp() {
        gerente = new Gerenciador();
        app = new Programa (1, "Programa que é muito bom.");
    }

    @Test
    void deveAbrirPrograma() {
        Tarefa aberturaPrograma = new AbrturaProgramaTarefa(app);
        gerente.executarTarefa(aberturaPrograma);

        assertEquals("Informação (Programa que é muito bom.) em estado 'Aberto'", app.getInfo());
    }

    @Test
    void deveFecharPrograma() {
        Tarefa fechamentoPrograma = new CancelamentoProgramaTarefa(app);
        gerente.executarTarefa(fechamentoPrograma);

        assertEquals("Informação (Programa que é muito bom.) em estado 'Fechado'", app.getInfo());
    }

    @Test
    void deveCancelarAberturaPrograma() {
        Tarefa aberturaPrograma = new AbrturaProgramaTarefa(app);
        Tarefa fechamentoPrograma = new CancelamentoProgramaTarefa(app);

        gerente.executarTarefa(aberturaPrograma);
        gerente.executarTarefa(fechamentoPrograma);

        gerente.cancelarTarefa(aberturaPrograma);

        assertEquals("Informação (Programa que é muito bom.) em estado 'Fechado'", app.getInfo());
    }
}