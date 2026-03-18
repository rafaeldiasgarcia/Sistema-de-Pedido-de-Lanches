import java.util.Scanner;

public class Aplicativo {

 public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    PedidoRepository repository = new PedidoRepository();

    int opcao = -1;
    int id = 1;

    while (opcao != 0) {

        System.out.println("\n===== MENU LANCHONETE =====");
        System.out.println("1 - X-Burguer");
        System.out.println("2 - X-Salada");
        System.out.println("3 - Hot Dog");
        System.out.println("4 - Listar pedidos");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");

        opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao >= 1 && opcao <= 3) {

            System.out.print("Nome do cliente: ");
            String nome = scanner.nextLine();
            String lanche = "";

            if (opcao == 1) lanche = "X-Burguer";
            if (opcao == 2) lanche = "X-Salada";
            if (opcao == 3) lanche = "Hot Dog";

            Pedido pedido = new Pedido(id++, nome, lanche);

            repository.salvar(pedido);

            System.out.println("Pedido registrado!");
            
        } else if (opcao == 4) {

            System.out.println("\nPedidos cadastrados:");

            for (Pedido p : repository.listarTodos()) {

                System.out.println(p);
            }
        }
    }

    System.out.println("Sistema encerrado.");
    }
}