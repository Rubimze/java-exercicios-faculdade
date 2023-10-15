package pratica09;

public class Exercicio02 {
    private float altura, largura;

    public Exercicio02() {
        altura = 0;
        largura = 0;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float alt) {
        altura = alt;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float larg) {
        largura = larg;
    }

    public float calculaArea() {
        return altura * largura;
    }

    public float calculaPerimetro() {
        return 2 * altura + 2 * largura;
    }

    /**
     * Retorna as informações do retângulo.
     *
     * Exemplo:
     * Altura: 2,00
     * Largura: 3,00
     * Área: 6,00
     * Perímetro: 10,00.
     */
    public void exibe() {
        System.out.printf("Altura: %.2f\n", altura);
        System.out.printf("Largura: %.2f\n", largura);
        System.out.printf("Área: %.2f\n", calculaArea());
        System.out.printf("Perímetro: %.2f.\n", calculaPerimetro());
    }
}

