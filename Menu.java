public class Menu {
    private String menuEntrada = """
            !!! Seja bem vido a Central de Atendimento e Serviços !!!
            !!! Preste atenção nas opções a seguir!!!
            #########################################################
            """;
    private String menuPrincipal = """
            1. cadastrar nova solicitação
            2. inserir a solicitação na Fila
            3. consultar a próxima solicitação
            4. remover a próxima solicitação para atendimento
            5. verificar se a Fila está vazia
            6. mostrar a quantidade de solicitações aguardando
            7. exibir as solicitações presentes na Fila
            """;

    public String getMenuEntrada() {
        return menuEntrada;
    }

    public String getMenuPrincipal() {
        return menuPrincipal;
    }
}
