package abstractfactory;

/**
 * Client - Cửa hàng nội thất
 * Chỉ làm việc với Abstract Factory và Abstract Products
 */
public class FurnitureShop {
    private final FurnitureFactory factory;
    private Chair chair;
    private Sofa sofa;
    private CoffeeTable table;

    public FurnitureShop(FurnitureFactory factory) {
        this.factory = factory;
    }

    public void orderFurnitureSet() {
        chair = factory.createChair();
        sofa = factory.createSofa();
        table = factory.createCoffeeTable();
    }

    public void showFurniture() {
        System.out.println("=== Bộ nội thất phong cách: " + chair.getStyle() + " ===");
        chair.sitOn();
        sofa.lieOn();
        table.putCoffee();
        System.out.println();
    }

    // Demo
    public static void main(String[] args) {
        System.out.println(">>> Khách hàng chọn phong cách Modern:");
        FurnitureShop modernShop = new FurnitureShop(new ModernFurnitureFactory());
        modernShop.orderFurnitureSet();
        modernShop.showFurniture();

        System.out.println(">>> Khách hàng chọn phong cách Victorian:");
        FurnitureShop victorianShop = new FurnitureShop(new VictorianFurnitureFactory());
        victorianShop.orderFurnitureSet();
        victorianShop.showFurniture();
    }
}
