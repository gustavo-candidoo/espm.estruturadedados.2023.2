import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Util {

    private AVLTree<Funcionario> arvoreVendedor = new AVLTree<>();
    private List<Funcionario> listaFunc = new ArrayList<>();

    private AVLTree<Venda> arvoreVenda = new AVLTree<>();
    private List<Venda> listaVenda = new ArrayList<>();

    public static void main(String[] args) {

    }

    public void menu() {
        String menuOptions = """
                1. Register Seller
                2. Register Sale
                3. List Sales
                4. Remove Sale
                5. Remove Seller
                6. End Program
                """;

        int option = 0;

        do {
            try {
                option = parseInt(showInputDialog(menuOptions));

                if (option < 1 || option > 6) {
                    showMessageDialog(null, "Invalid Input");
                } else {
                    switch (option) {
                        case 1:
                            registerSeller();
                            break;
                        case 2:
                            registerSale();
                            break;
                        case 3:
                            listSales();
                            break;
                        case 4:
                            removeSale();
                            break;
                        case 5:
                            removeSeller();
                            break;
                        case 6:
                            showMessageDialog(null, "Program finished");
                            System.exit(0);
                            break;
                        default:
                            showMessageDialog(null, "Incorrect Option");
                            break;
                    }
                }
            } catch (NumberFormatException e) {
                showMessageDialog(null, "Type only valid numbers");
            }
        } while (option != 6);
    }

    public void listSales() {
        String employeeDetails = "Employee Details:\n";
        for (Funcionario funcionario : listaFunc) {
            double totalCommissions = 0;

            for (Venda venda : listaVenda) {
                if (venda.getFuncionario().compareTo(funcionario) == 0){
                    totalCommissions += venda.getValor() * 0.15 + 50.0;
                }
            }

            double totalSalary = funcionario.getSalario() + totalCommissions;

            employeeDetails += "Name: " + funcionario.getNome() +
                    "\nBase Salary: " + funcionario.getSalario() +
                    "\nTotal Comisions: " + totalCommissions +
                    "\nTotal Salary: " + totalSalary + "\n\n";
        }

        showMessageDialog(null, employeeDetails);
    }

    public void registerSale() {
        int id = parseInt(showInputDialog("Type the id from who completed the sale\n" + arvoreVendedor.preOrdem()));

        for (Funcionario funcionario : listaFunc) {
            if (funcionario.getId() == id) {
                double valor = parseDouble(showInputDialog("Type the sale's value"));
                Venda venda = new Venda(createSaleID(), funcionario, valor);

                arvoreVenda.inserir(venda);
                listaVenda.add(venda);
                return;
            }
        }

    }

    public void removeSale() {
        int id = parseInt(showInputDialog("Type the sale you wish to remove\n" + arvoreVenda.preOrdem()));

        for (Venda venda : listaVenda) {
            if (venda.getId() == id) {
                arvoreVenda.remover(venda);
                return;
            }
        }
    }

    public void registerSeller() {
        String nome = showInputDialog("Type the salesman's name");
        Cargo cargo = Cargo.VENDEDOR;
        double salario = parseDouble(showInputDialog("Type the salesman's salary"));

        Funcionario funcionario = new Funcionario(createEmployeeID(), nome, salario, cargo);

        arvoreVendedor.inserir(funcionario);
        listaFunc.add(funcionario);
    }

    public void removeSeller() {
        int id = parseInt(
                showInputDialog("Type the id from the salesman you wish to remove\n" + arvoreVendedor.preOrdem()));

        for (Funcionario funcionario : listaFunc) {
            if (funcionario.getId() == id) {
                for (Venda venda : listaVenda) {
                    if (venda.getFuncionario().compareTo(funcionario) == 0) {
                        showMessageDialog(null, "Salesman couldn't be removed because he has sale");
                    }
                }
                arvoreVendedor.remover(funcionario);
                return;
            }
        }
    }

    public int createSaleID() {
        Random n = new Random();
        int id = n.nextInt(1000);

        Venda ver = new Venda(id);

        for (Venda venda : listaVenda) {
            if (venda.compareTo(ver) == 0) {
                return createSaleID();
            }
        }

        return id;
    }

    public int createEmployeeID() {
        Random n = new Random();
        int id = n.nextInt(1000);

        Funcionario ver = new Funcionario(id);

        for (Funcionario funcionario : listaFunc) {
            if (funcionario.compareTo(ver) == 0) {
                createEmployeeID();
            }
        }

        return id;
    }

}
