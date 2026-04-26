interface DescontoStrategy {
    double aplicar(double valor);
}

class DescontoNatal implements DescontoStrategy {
    public double aplicar(double valor) {
        return valor * 0.8;
    }
}

class DescontoBlackFriday implements DescontoStrategy {
    public double aplicar(double valor) {
        return valor * 0.7;
    }
}

class SemDesconto implements DescontoStrategy {
    public double aplicar(double valor) {
        return valor;
    }
}

class CarrinhoCompras {
    private double total;
    private DescontoStrategy strategy;

    public CarrinhoCompras(double total) {
        this.total = total;
    }

    public void setStrategy(DescontoStrategy strategy) {
        this.strategy = strategy;
    }

    public double calcularTotal() {
        return strategy.aplicar(total);
    }
}