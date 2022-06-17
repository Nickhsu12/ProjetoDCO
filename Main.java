
public class Main {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MigrantMatcher mm = new MigrantMatcher();
        IdentificarHandler identificarHandler = mm.getIdentificarHandler();
        // registar ajuda
        System.out.println("Introduza o seu contacto para se identificar como voluntário:");
        try {
            String numId = scan.next();
            identificarHandler.identCont(numId);

            System.out.println("Introduza se pretende ajudar com:\n1-Alojamento\n2-Item");
            int escolha = scan.nextInt();
            Random r = new Random();

            AjudaHandler ajudaHandler = null;

            if (escolha == 1) {
                Regiao reg = new Regiao("Lisboa");
                AlojamentoHandler alojamentoHandler = new Alojamento().getAlojamentoHandler();
                alojamentoHandler.numRes(r.nextInt(3) + 1);
                alojamentoHandler.indicaRegAloj(reg);
                ajudaHandler = alojamentoHandler;
            } else if (escolha == 2) {

                String desc = "Casaco";
                ItemHandler itemHandler = new Item().getItemHandler();
                itemHandler.indicaItem(desc);
                ajudaHandler = itemHandler;
            }
            verificarCodigo(numId, ajudaHandler, mm);
        } catch (InputMismatchException e) {
            System.out.println("Introduziu algo inesperado!");
        }
        scan.close();
    }

    public static void verificarCodigo(String numId, AjudaHandler ajudaHandler, MigrantMatcher mm) {
        PidgeonSMSSender smsText = new PidgeonSMSSender();
        smsText.send(numId, "O seu código de confirmação é: " + ajudaHandler.generateCode());

        if (ajudaHandler.verifCode()) {
            System.out.println("A sua ajuda foi registada com sucesso!");
            mm.addAjuda(ajudaHandler.getAjuda());
        } else {
            System.out.println("O código que introduziu está incorreto");
        }

    }
}
