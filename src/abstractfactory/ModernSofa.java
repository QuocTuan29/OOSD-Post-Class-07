package abstractfactory;

public class ModernSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Nằm trên sofa Modern - đường nét sạch sẽ, hiện đại.");
    }

    @Override
    public String getStyle() {
        return "Modern";
    }
}
