public class C4 extends C2 {
    private boolean atributoC4;

    // Construtor sobrecarregado
    public C4(String atributoBase, int atributoC2, boolean atributoC4) {
        super(atributoBase, atributoC2);
        this.atributoC4 = atributoC4;
    }

    // Sobrescrição de método
    @Override
    public void metodoAbstrato() {
        System.out.println("Implementação do método abstrato em C4");
    }

    // Método próprio de C4
    public void metodoC4() {
        System.out.println("Método próprio de C4");
    }
}
