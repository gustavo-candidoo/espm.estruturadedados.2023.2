import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class Util {
    
    public void menu() {

    }

    private String gerarMenu() {
        String menu = "Escolha uma operação\n";
        menu += "1. Inserir Vendedor\n";
        menu += "2. Venda Vendedor\n";
        menu += "3. Remover Vendedor\n";
        menu += "4. Remover Venda\n";
        menu += "5. Listar Venda\n";
        menu += "6. Finalizar\n";

        return menu;
    }

}
