package p1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CentroAutomotivoMain {
    public static void main(String[] args) {
        // Criar listas para armazenar ordens de serviço e entregas
        List<OrdemServico> ordensServico = new ArrayList<>();
        List<EntregaVeiculoCliente> entregas = new ArrayList<>();

        // Criar um veículo
        Veiculo veiculo = new Veiculo();
        veiculo.setAno(2020);
        veiculo.setMarca("Toyota");
        veiculo.setModelo("Corolla");
        veiculo.setPlaca("ABC1234");
        veiculo.setQuilometragemTotal(25000.5f);
        veiculo.setNomeProprietario("Carlos Silva");
        veiculo.setCpfProprietario("123.456.789-00");

        // Criar uma ordem de serviço
        OrdemServico os = OrdemServico.cadastrarOS(
            veiculo,
            1001,
            "João Pereira",
            "Ana Costa",
            true,
            false,
            "Troca de óleo e revisão"
        );

        // Adicionar a ordem de serviço à lista
        ordensServico.add(os);

        // Imprimir as informações da ordem de serviço
        OrdemServico.printInformacoesOS(1001, ordensServico);

        // Criar uma entrega de veículo
        EntregaVeiculoCliente entrega = EntregaVeiculoCliente.cadastrarEntrega(
            2001,
            new Date(),
            "Carlos Silva",
            os,
            true
        );

        // Adicionar a entrega à lista
        entregas.add(entrega);

        // Imprimir as informações da entrega de veículo
        EntregaVeiculoCliente.printInformacoesEntrega(2001, entregas);

        // Verificar se a entrega está concluída
        boolean entregaConcluida = EntregaVeiculoCliente.verificarEntregaConcluida(2001, entregas);
        System.out.println("Entrega concluída: " + (entregaConcluida ? "Sim" : "Não"));
    }
}
﻿
