package p1;

import java.util.List;

public class OrdemServico extends Veiculo {
    private int numeroOS;
    private String nomeResponsavelTecnico;
    private String nomeMecanico;
    private boolean isAutorizadoLavagem;
    private boolean isOSfinalizada;
    private String relatosDefeitosCliente;

    // Construtor padrão
    public OrdemServico() {}

    // Getters e Setters
    public int getNumeroOS() {
        return numeroOS;
    }

    public void setNumeroOS(int numeroOS) {
        this.numeroOS = numeroOS;
    }

    public String getNomeResponsavelTecnico() {
        return nomeResponsavelTecnico;
    }

    public void setNomeResponsavelTecnico(String nomeResponsavelTecnico) {
        this.nomeResponsavelTecnico = nomeResponsavelTecnico;
    }

    public String getNomeMecanico() {
        return nomeMecanico;
    }

    public void setNomeMecanico(String nomeMecanico) {
        this.nomeMecanico = nomeMecanico;
    }

    public boolean isAutorizadoLavagem() {
        return isAutorizadoLavagem;
    }

    public void setAutorizadoLavagem(boolean isAutorizadoLavagem) {
        this.isAutorizadoLavagem = isAutorizadoLavagem;
    }

    public boolean isOSfinalizada() {
        return isOSfinalizada;
    }

    public void setOSfinalizada(boolean isOSfinalizada) {
        this.isOSfinalizada = isOSfinalizada;
    }

    public String getRelatosDefeitosCliente() {
        return relatosDefeitosCliente;
    }

    public void setRelatosDefeitosCliente(String relatosDefeitosCliente) {
        this.relatosDefeitosCliente = relatosDefeitosCliente;
    }

    // Método para cadastrar uma Ordem de Serviço
    public static OrdemServico cadastrarOS(Veiculo veiculo, int numeroOS, String nomeResponsavelTecnico, 
                                            String nomeMecanico, boolean isAutorizadoLavagem, 
                                            boolean isOSfinalizada, String relatosDefeitosCliente) {
        OrdemServico os = new OrdemServico();
        os.setAno(veiculo.getAno());
        os.setMarca(veiculo.getMarca());
        os.setModelo(veiculo.getModelo());
        os.setPlaca(veiculo.getPlaca());
        os.setQuilometragemTotal(veiculo.getQuilometragemTotal());
        os.setNomeProprietario(veiculo.getNomeProprietario());
        os.setCpfProprietario(veiculo.getCpfProprietario());
        os.setNumeroOS(numeroOS);
        os.setNomeResponsavelTecnico(nomeResponsavelTecnico);
        os.setNomeMecanico(nomeMecanico);
        os.setAutorizadoLavagem(isAutorizadoLavagem);
        os.setOSfinalizada(isOSfinalizada);
        os.setRelatosDefeitosCliente(relatosDefeitosCliente);
        return os;
    }

    // Método para imprimir as informações de uma Ordem de Serviço pelo número da OS
    public static void printInformacoesOS(int numeroOS, List<OrdemServico> ordensServico) {
        for (OrdemServico os : ordensServico) {
            if (os.getNumeroOS() == numeroOS) {
                System.out.println("Informações da Ordem de Serviço:");
                System.out.println("Número da OS: " + os.getNumeroOS());
                System.out.println("Nome do Responsável Técnico: " + os.getNomeResponsavelTecnico());
                System.out.println("Nome do Mecânico: " + os.getNomeMecanico());
                System.out.println("Autorizado para Lavagem: " + (os.isAutorizadoLavagem() ? "Sim" : "Não"));
                System.out.println("Ordem de Serviço Finalizada: " + (os.isOSfinalizada() ? "Sim" : "Não"));
                System.out.println("Relatos de Defeitos do Cliente: " + os.getRelatosDefeitosCliente());
                System.out.println("Informações do Veículo:");
                System.out.println("Ano: " + os.getAno());
                System.out.println("Marca: " + os.getMarca());
                System.out.println("Modelo: " + os.getModelo());
                System.out.println("Placa: " + os.getPlaca());
                System.out.println("Quilometragem Total: " + os.getQuilometragemTotal());
                System.out.println("Nome do Proprietário: " + os.getNomeProprietario());
                System.out.println("CPF do Proprietário: " + os.getCpfProprietario());
                return;
            }
        }
        System.out.println("Ordem de Serviço não encontrada.");
    }
}
message.txt
5 KB
