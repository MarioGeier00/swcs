package swcs.gof.structural.composite.organizationchart;

public class CTO extends DisciplinaryLeadership {

    @Override
    public void draw() {
        System.out.println(CTO.class.getSimpleName());
        super.draw();
    }
}
