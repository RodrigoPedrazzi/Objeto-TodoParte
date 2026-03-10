import java.util.Date;

public class Testa {
    public static void main(String[] args){
        Cliente cl1 = new Cliente(100,"Fulano","123", "rua 10");

        Pedido ped1 = new Pedido(1, new Date(), cl1);

        Produto prod1 = new Produto(3, "Shampoo", "Cosmético para cabelo", 24.9f  );
        Produto prod2 = new Produto(75, "Condicionador", "Cosmetico para cabelo", 31.9f);

        ped1.adicionaItemPedido(212, 2,  prod1 );
        ped1.adicionaItemPedido(75, 2, prod2);

        System.out.println(ped1.toString());
    }
}
