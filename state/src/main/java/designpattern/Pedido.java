package designpattern;

public class Pedido {

    EstadoPedido estadoAtual;

    public Pedido() {
        this.estadoAtual = (EstadoPedido) new EstadoRascunho();
        System.out.println("Pedido criado em Rascunho.");
    }

    public void submeterPedido() {
        estadoAtual.submeter(this);
    }

    public void aprovarPagamento() {
        estadoAtual.aprovarPagamento(this);
    }

    public void enviarPedido() {
        estadoAtual.enviar(this);
    }

    public void cancelarPedido() {
        estadoAtual.cancelar(this);
    }

    public void mudarEstado(EstadoAguardandoPagamento novoEstado) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mudarEstado'");
    }

    public void mudarEstado(EstadoEnviado novoEstado) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mudarEstado'");
    }

    public void mudarEstado(EstadoCancelado estadoCancelado) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mudarEstado'");
    }

    public void mudarEstado(EstadoPagamentoAprovado estadoPagamentoAprovado) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mudarEstado'");
    }
}
