package abstractfactory;

public class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Ngồi trên ghế Victorian - chạm khắc tinh xảo, cổ điển.");
    }

    @Override
    public String getStyle() {
        return "Victorian";
    }
}
