import com.joaolightz.supermarket.model.Funcionario;
import com.joaolightz.supermarket.model.Gerente;
import com.joaolightz.supermarket.model.SuperMercado;
import com.joaolightz.supermarket.model.Supervisor;

public class Main {
    public static void main(String[] args) {
        SuperMercado superMercado = new SuperMercado("Mercantil Legal"); // Cria o Super Mercado
        Gerente gerente = superMercado.contrataGerente(superMercado, "Gerente", "GerenteSenha"); // Super Mercado contrata Gerente, responsável por contratar o Supervisor e demais Funcionários
        gerente.autentica("GerenteSenha"); // Autentica Gerente no Sistema após Login Sucedido com Senha.
        Supervisor supervisor = gerente.contrataSupervisor("Supervisor", "SupervisorSenha"); // Gerente contrata Supervisor, responsável por alterar/encarregar Metas de Funcionários.
        Funcionario repositor = gerente.contrataRepositor("Repositor"); // Gerente contrata Repositor.
        Funcionario operador = gerente.contrataOperador("Operador"); // Gerente contrata Operador.
    }
}
