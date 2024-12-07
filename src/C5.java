public class C5 implements I1 {
    private String atributoC5;

    // Construtor sobrecarregado
    public C5(String atributoBase, String atributoC5) {
        this.atributoC5 = atributoC5;
    }

    // Implementação do método I1
    @Override
    public void metodoI1() {
        System.out.println("Implementação do método I1 em C5");
    }

    // Método próprio de C5
    public void metodoC5() {
        System.out.println("Método próprio de C5");
    }
}
