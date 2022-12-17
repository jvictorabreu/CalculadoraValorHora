import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Profissional p1 = new Profissional();
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do desenvolvedor: ");
        String desenvolvedor = sc.next();
        p1.setNome(desenvolvedor);

        System.out.print("Digite o salário mensal desejado: ");
        int salMensal = sc.nextInt();
        p1.setSalMensal(salMensal); // salario mensal pretendido

        System.out.println("Nome: " + p1.getNome());
        System.out.printf("Sal. Pretendido: R$ %.2f", p1.getSalMensal());
        System.out.printf("%nHoras úteis mês: %.0f%n", p1.horasUteisMes);
        System.out.printf("Valor hora: R$ %.2f", p1.getSalHora());

        ItemSistema[] listaItensSistema = new ItemSistema[4];

        ItemSistema tela1 = new ItemSistema();
        tela1.setNomeItem("Tela de Login");
        tela1.setTipoItem("Login");
        tela1.setComplexidade(3);
        listaItensSistema[0] = tela1;


        ItemSistema tela2 = new ItemSistema();
        tela2.setNomeItem("Tela de Cadastro");
        tela2.setTipoItem("Tela Normal");
        tela2.setComplexidade(3);
        listaItensSistema[1] = tela2;


        ItemSistema tela3 = new ItemSistema();
        tela3.setNomeItem("Tela de Pesquisa");
        tela3.setTipoItem("Tela Normal");
        tela3.setComplexidade(2);
        listaItensSistema[2] = tela3;

        ItemSistema tela4 = new ItemSistema();
        tela4.setNomeItem("Saída com Filtro");
        tela4.setTipoItem("Tela Saída");
        tela4.setComplexidade(1);
        listaItensSistema[3] = tela4;

        int totalHorasTelas = 0;
        int numetoTela = 1;
        for (ItemSistema itemSistema: listaItensSistema) {
            totalHorasTelas = totalHorasTelas + itemSistema.calcularQuantidadeHoras();
            System.out.println("\n\nItem " + numetoTela + " do orçamento: " + itemSistema.getNomeItem());
            System.out.println("Tipo do Item: " + itemSistema.getTipoItem());
            System.out.println("Complexidade do Item: " + itemSistema.getComplexidade());
            System.out.println("Quantidade de Horas previstas: " + itemSistema.calcularQuantidadeHoras());
            numetoTela += 1;
        }

        double valorTotalSistema = p1.getSalHora() * totalHorasTelas;

        System.out.printf("\nVALOR TOTAL DO ORÇAMENTO: %.2f", valorTotalSistema);
    }
}
