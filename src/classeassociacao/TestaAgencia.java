package classeassociacao;

import java.time.LocalDateTime;

public class TestaAgencia {
    public static void main(String[] args){
        Passageiro pas1 = new Passageiro("123", "fulano");
        System.out.println(pas1.toString());

        LocalDateTime data = LocalDateTime.of(2026,10 ,14 ,10, 15 );
        voo vo1 = new voo(999, "Guarulhos", "Salvador", data);
        System .out.println(vo1.toString());

        LocalDateTime data2 = LocalDateTime.of(2026,03,17,20,27);
        Reserva res1 = new Reserva(99, LocalDateTime.now(), 18, pas1, vo1);
        System.out.println(res1.toString());
    }
}
