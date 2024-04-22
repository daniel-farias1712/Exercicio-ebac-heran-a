import java.util.Scanner;
public class Main extends Pessoa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PessoaFisica p1 = new PessoaFisica();
        Pessoa_Juridica p2 = new Pessoa_Juridica();


        System.out.println("Selecione o tipo de pessoa:");
        System.out.println("1 - Pessoa Física");
        System.out.println("2 - Pessoa Jurídica");
        int p12 = scan.nextInt();
        scan.nextLine();

        switch (p12) {
            case 1:

                System.out.println("Digite seu nome");
                p1.setNome(scan.nextLine());
                System.out.println("Digite onde você mora");
                p1.setLocalizacao(scan.nextLine());

                System.out.println("Se quiser digitar seu RG digite 1\nse quiser digitar seu cpf digite 2\nDigite 3 se quiser inserir a CNH");
                int esc1 = scan.nextInt();
                scan.nextLine();
                switch (esc1) {
                    case 1:
                        System.out.println("didite seu RG");
                        p1.setrg(scan.nextLine());
                        break;
                    case 2:
                        System.out.println("Digite seu CPF");
                        p1.setcpf(scan.nextLine());
                        break;
                    case 3:
                        System.out.println("Digite sua cnh");
                        p1.setcnh(scan.nextLine());
                        break;
                }
                String infoPessoaFisica = String.format("Cadastro completo\nNome: %s\nLocalização: %s\nRG: %s\nCPF: %s\nCNH:%s", p1.getNome(), p1.getLocalizacao(), p1.getrg(), p1.getcpf(), p1.getcnh());
                System.out.println(infoPessoaFisica);
                break;
            case 2:

                System.out.println("Digite O nome da sua empresa");
                p2.setNome(scan.nextLine());
                System.out.println("Digite a localização da sua empresa");
                p2.setLocalizacao(scan.nextLine());
                System.out.println("Digite seu RG");
                p2.setrg(scan.nextLine());
                System.out.println("Digite seu CNPJ");
                p2.setCnpj(scan.nextLine());
                System.out.println("Digite O ramo da sua empresa");
                p2.setTipodeempresa(scan.nextLine());
                System.out.println(p2.toString());
                String infoPessoaJuridica = String.format("Cadastro completo\nNome da empresa: %s\nLocalização da empresa: %s\nRG da empresa: %s\nCNPJ da empresa:%s\nRamo de atividade: %s", p2.getNome(), p2.getLocalizacao(), p2.getrg(), p2.getCnpj(), p2.getTipodeempresa());
                System.out.println(infoPessoaJuridica);
                break;


        }




    }

}
