package water.android.io.chainofresponsibility.example2;

public class PriceHandlerFactory {

    public static PriceHandler getPricehandler() {

        PriceHandler salesMan = new SalesMan();
        PriceHandler manager = new Manager();
        PriceHandler boss = new Boss();

        salesMan.setSuccessor(manager);
        manager.setSuccessor(boss);

        return salesMan;
    }
}
