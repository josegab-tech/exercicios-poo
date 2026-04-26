interface FormaGeometrica {
    void desenhar();
}

class Circulo implements FormaGeometrica {
    public void desenhar() {
        System.out.println("Desenhando círculo");
    }
}

class Quadrado implements FormaGeometrica {
    public void desenhar() {
        System.out.println("Desenhando quadrado");
    }
}

class Triangulo implements FormaGeometrica {
    public void desenhar() {
        System.out.println("Desenhando triângulo");
    }
}

// Factory
class FormaFactory {
    public static FormaGeometrica criarForma(String tipo) {
        if (tipo.equalsIgnoreCase("circulo")) return new Circulo();
        if (tipo.equalsIgnoreCase("quadrado")) return new Quadrado();
        if (tipo.equalsIgnoreCase("triangulo")) return new Triangulo();
        return null;
    }
}