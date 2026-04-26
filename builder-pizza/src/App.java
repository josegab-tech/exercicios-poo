class Pizza {
    private String tamanho;
    private boolean queijoExtra;
    private boolean bordaRecheada;
    private boolean molhoEspecial;

    private Pizza(Builder builder) {
        this.tamanho = builder.tamanho;
        this.queijoExtra = builder.queijoExtra;
        this.bordaRecheada = builder.bordaRecheada;
        this.molhoEspecial = builder.molhoEspecial;
    }

    public static class Builder {
        private String tamanho;
        private boolean queijoExtra;
        private boolean bordaRecheada;
        private boolean molhoEspecial;

        public Builder(String tamanho) {
            this.tamanho = tamanho;
        }

        public Builder queijoExtra() {
            this.queijoExtra = true;
            return this;
        }

        public Builder bordaRecheada() {
            this.bordaRecheada = true;
            return this;
        }

        public Builder molhoEspecial() {
            this.molhoEspecial = true;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}