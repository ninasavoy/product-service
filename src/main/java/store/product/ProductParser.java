package store.product;

public class ProductParser {

    public static Product to(ProductIn in) {
        return in == null ? null :
            Product.builder()
                .name(in.name())
                .price(in.price())
                .unit(in.unit())
                .build();
    }

    public static ProductOut to(Product p) {
        return p == null ? null :
            ProductOut.builder()
                .id(p.id())
                .name(p.name())
                .price(p.price())
                .unit(p.unit())
                .build();
    }
    
}
