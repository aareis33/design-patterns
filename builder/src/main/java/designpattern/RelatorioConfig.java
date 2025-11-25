package designpattern;

public class RelatorioConfig {
    private final String titulo;
    private final String usuario;
    private final String subtitulo;
    private final boolean incluirCabecalho;
    private final boolean incluirRodape;
    private final String orientacao;

    private RelatorioConfig(RelatorioConfigBuilder builder) {
        this.titulo = builder.titulo;
        this.usuario = builder.usuario;
        this.subtitulo = builder.subtitulo;
        this.incluirCabecalho = builder.incluirCabecalho;
        this.incluirRodape = builder.incluirRodape;
        this.orientacao = builder.orientacao;
    }

    @Override
    public String toString() {
        return "RelatorioConfig [titulo=" + titulo + ", subtitulo=" + subtitulo +
                ", incluirCabecalho=" + incluirCabecalho + ", incluirRodape=" + incluirRodape +
                ", orientacao=" + orientacao + ", usuario=" + usuario + "]";
    }

    public static class RelatorioConfigBuilder {
        private final String titulo;
        private final String usuario;
        private String subtitulo = null;
        private boolean incluirCabecalho = true;
        private boolean incluirRodape = true;
        private String orientacao = "RETRATO";

        public RelatorioConfigBuilder(String titulo, String usuario) {
            this.titulo = titulo;
            this.usuario = usuario;
        }

        public RelatorioConfigBuilder subtitulo(String subtitulo) {
            this.subtitulo = subtitulo;
            return this;
        }

        public RelatorioConfigBuilder incluirCabecalho(boolean incluir) {
            this.incluirCabecalho = incluir;
            return this;
        }

        public RelatorioConfigBuilder incluirRodape(boolean incluir) {
            this.incluirRodape = incluir;
            return this;
        }

        public RelatorioConfigBuilder orientacao(String orientacao) {
            this.orientacao = orientacao;
            return this;
        }

        public RelatorioConfig build() {
            return new RelatorioConfig(this);
        }
    }
}
