package p1;

import java.util.Date;
import java.util.List;

public class EntregaVeiculoCliente {
    private int numeroEntrega;
    private Date dataEntrega;
    private String nomeCliente;
    private OrdemServico ordemServico; // Associação com OrdemServico
    private boolean isEntregaConcluida;

    // Construtor padrão
    public EntregaVeiculoCliente() {}

    // Getters e Setters
    public int getNumeroEntrega() {
        return numeroEntrega;
    }

    public void setNumeroEntrega(int numeroEntrega) {
        this.numeroEntrega = numeroEntrega;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public OrdemServico getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(OrdemServico ordemServico) {
        this.ordemServico = ordemServico;
    }

    public boolean isEntregaConcluida() {
        return isEntregaConcluida;
    }

    public void setEntregaConcluida(boolean isEntregaConcluida) {
        this.isEntregaConcluida = isEntregaConcluida;
    }

    // Método para cadastrar uma nova entrega de veículo
    public static EntregaVeiculoCliente cadastrarEntrega(int numeroEntrega, Date dataEntrega, 
                                                         String nomeCliente, OrdemServico ordemServico, 
                                                         boolean isEntregaConcluida) {
        EntregaVeiculoCliente entrega = new EntregaVeiculoCliente();
        entrega.setNumeroEntrega(numeroEntrega);
        entrega.setDataEntrega(dataEntrega);
        entrega.setNomeCliente(nomeCliente);
        entrega.setOrdemServico(ordemServico);
        entrega.setEntregaConcluida(isEntregaConcluida);
        return entrega;
    }

    // Método para imprimir as informações de uma entrega pelo número da entrega
    public static void printInformacoesEntrega(int numeroEntrega, List<EntregaVeiculoCliente> entregas) {
        for (EntregaVeiculoCliente entrega : entregas) {
            if (entrega.getNumeroEntrega() == numeroEntrega) {
                System.out.println("Informações da Entrega de Veículo:");
                System.out.println("Número da Entrega: " + entrega.getNumeroEntrega());
                System.out.println("Data da Entrega: " + entrega.getDataEntrega());
                System.out.println("Nome do Cliente: " + entrega.getNomeCliente());
                System.out.println("Entrega Concluída: " + (entrega.isEntregaConcluida() ? "Sim" : "Não"));

                // Imprimindo informações da Ordem de Serviço associada
                if (entrega.getOrdemServico() != null) {
                    System.out.println("Informações da Ordem de Serviço Associada:");
                    System.out.println("Número da OS: " + entrega.getOrdemServico().getNumeroOS());
                    System.out.println("Nome do Responsável Técnico: " + entrega.getOrdemServico().getNomeResponsavelTecnico());
                    System.out.println("Nome do Mecânico: " + entrega.getOrdemServico().getNomeMecanico());
                    System.out.println("Autorizado para Lavagem: " + (entrega.getOrdemServico().isAutorizadoLavagem() ? "Sim" : "Não"));
                    System.out.println("Ordem de Serviço Finalizada: " + (entrega.getOrdemServico().isOSfinalizada() ? "Sim" : "Não"));
                    System.out.println("Relatos de Defeitos do Cliente: " + entrega.getOrdemServico().getRelatosDefeitosCliente());
                }
                return;
            }
        }
        System.out.println("Entrega não encontrada.");
    }

    // Método para verificar se a entrega está concluída
    public static boolean verificarEntregaConcluida(int numeroEntrega, List<EntregaVeiculoCliente> entregas) {
        for (EntregaVeiculoCliente entrega : entregas) {
            if (entrega.getNumeroEntrega() == numeroEntrega) {
                return entrega.isEntregaConcluida();
            }
        }
        return false;
    }
}
message.txt
5 KB
