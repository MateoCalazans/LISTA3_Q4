public class App {
    public static void main(String[] args) {
        // Criando instâncias de cada classe concreta
        C1 c1 = new C2("Atributo Base C2", 10);
        C2 c2 = new C2("Atributo Base C2", 10);
        C3 c3 = new C3("Atributo Base C3", 20.5);
        C4 c4 = new C4("Atributo Base C4", 15, true);
        C5 c5 = new C5("Atributo Base C5", "Extra");

        // Testando os métodos de C2
        c2.metodoAbstrato();
        c2.metodoC2();

        // Testando os métodos de C3
        c3.metodoAbstrato();
        c3.metodoI1();
        c3.metodoI2();
        c3.metodoC3();

        // Testando os métodos de C4
        c4.metodoAbstrato();
        c4.metodoC2();
        c4.metodoC4();

        // Testando os métodos de C5
        c5.metodoI1();
        c5.metodoC5();
    }
}
