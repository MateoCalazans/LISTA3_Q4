public class C3 extends C1 implements I1, I2 {
    private double atributoC3;

    // Construtor sobrecarregado
    public C3(String atributoBase, double atributoC3) {
        super(atributoBase);
        this.atributoC3 = atributoC3;
    }

    // Implementação de métodos das interfaces
    @Override
    public void metodoI1() {
        System.out.println("Implementação do método I1 em C3");
    }

    @Override
    public void metodoI2() {
        System.out.println("Implementação do método I2 em C3");
    }

    @Override
    public void metodoAbstrato() {
        System.out.println("Implementação do método abstrato em C3");
    }

    public void metodoC3() {
        System.out.println("Método próprio de C3");
    }
}
