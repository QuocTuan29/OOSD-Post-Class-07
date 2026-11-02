package abstractfactory;

public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void putCoffee() {
        System.out.println("Đặt ly cà phê lên bàn Victorian - gỗ sồi chạm khắc.");
    }

    @Override
    public String getStyle() {
        return "Victorian";
    }
}
