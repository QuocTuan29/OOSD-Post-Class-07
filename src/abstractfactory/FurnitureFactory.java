package abstractfactory;

/**
 * Abstract Factory - Giao diện nhà máy tạo gia đình sản phẩm nội thất
 */
public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
}
