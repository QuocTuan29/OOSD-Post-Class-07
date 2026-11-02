package abstractfactory;

public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Ngồi trên ghế Modern - thiết kế tối giản, thoải mái.");
    }

    @Override
    public String getStyle() {
        return "Modern";
    }
}
