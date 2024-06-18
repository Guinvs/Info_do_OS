public class Main{
    public static void main(String[] args) {
        // Obtém o nome do sistema operacional
        String osName = System.getProperty("os.name");
        // Obtém a versão do sistema operacional
        String osVersion = System.getProperty("os.version");
        // Obtém a arquitetura do sistema operacional
        String osArch = System.getProperty("os.arch");

        // Exibe as informações do sistema operacional
        System.out.println("Nome do Sistema Operacional: " + osName);
        System.out.println("Versão do Sistema Operacional: " + osVersion);
        System.out.println("Arquitetura do Sistema Operacional: " + osArch);
       System.out.println("Versão do Java: " + System.getProperty("java.version"));
        System.out.println("Fornecedor do Java: " + System.getProperty("java.vendor"));
        System.out.println("Diretório do Java: " + System.getProperty("java.home"));
        System.out.println("Nome do Usuário: " + System.getProperty("user.name"));
        System.out.println("Diretório Home do Usuário: " + System.getProperty("user.home"));
        System.out.println("Diretório de Trabalho Atual: " + System.getProperty("user.dir"));
}}

