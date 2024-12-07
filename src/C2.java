public class C2 extends C1 {
    private int atributoC2;

    // Construtor sobrecarregado
    public C2(String atributoBase, int atributoC2) {
        super(atributoBase);
        this.atributoC2 = atributoC2;
    }

    // Método próprio
    public void metodoC2() {
        System.out.println("Método próprio de C2");
    }

    @Override
    public void metodoAbstrato() {
        System.out.println("Implementação do método abstrato em C2");
    }
}

