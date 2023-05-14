package exerciciospoo;

public class ContaPessoas {
    public static void main(String[] args) {
        Conta p1 = new Conta();
        Conta p2 = new Conta();

        System.out.println("-------------------------------------------------------------------------");
        p1.setNumConta(1515);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.depositar(300);
        p1.pagarMensal();
        p1.sacar(338);
        p1.fecharConta();
        p1.estadoAtual();
        System.out.println("-------------------------------------------------------------------------");


        p2.setNumConta(2020);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(100);
        p2.pagarMensal();
        p2.estadoAtual();
        System.out.println("-------------------------------------------------------------------------");



    }
}
