public class App {
    public static void main(String[] args) {

        // Observer
        EstacaoClimatica estacao = new EstacaoClimatica();
        estacao.registrar(new DisplayTemperatura());
        estacao.setMedidas(25, 60, 1013);

        // Template
        RelatorioTemplate pdf = new RelatorioPDF();
        pdf.gerar();

        // Adapter
        AreaCalculavel area = new RetanguloAdapter(5, 10);
        System.out.println("Área: " + area.calcularArea());

        // Decorator
        Sanduiche s = new SanduicheSimples();
        s = new Queijo(s);
        s = new Bacon(s);

        System.out.println(s.descricao());
        System.out.println(s.preco());
    }
}