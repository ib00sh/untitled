import adidas.AdidasOuterwear;
import adidas.AdidasProduct;
import adidas.AdidasShoes;
import nike.NikeProduct;

public class AdidasFactory extends AbstractFactory {
    @Override
    AdidasProduct getAdidasProduct(String product) {
        if(product == null) return null;
        if(product.equalsIgnoreCase("ADIDAS OUTERWEAR")) return new AdidasOuterwear();
        if(product.equalsIgnoreCase("ADIDAS SHOES")) return new AdidasShoes();
        return null;
    }

    @Override
    NikeProduct getANikeProduct(String product) {
        return null;
    }
}
