package abstractfactory;

public class VictorianSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Nằm trên sofa Victorian - nệm êm, họa tiết hoa văn.");
    }

    @Override
    public String getStyle() {
        return "Victorian";
    }
}
