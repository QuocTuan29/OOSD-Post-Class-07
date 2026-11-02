package abstractfactory;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void putCoffee() {
        System.out.println("Đặt ly cà phê lên bàn Modern - mặt kính cường lực.");
    }

    @Override
    public String getStyle() {
        return "Modern";
    }
}
