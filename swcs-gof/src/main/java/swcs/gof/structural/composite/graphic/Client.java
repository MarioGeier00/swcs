package swcs.gof.structural.composite.graphic;

public class Client {
    public static void main(String[] args) {
        Composite sheet = new Sheet();

        Composite r1 = new Row();
        r1.add(new Column());
        r1.add(new Column());
        sheet.add(r1);

        Composite r2 = new Row();
        r2.add(new Column());
        r2.add(new Column());
        sheet.add(r2);

        sheet.paint();
    }
}
