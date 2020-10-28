import adidas.AdidasProduct;
import nike.NikeProduct;

public class Main {
    public static void main(String[] args) {
        AbstractFactory adidasFactory = FactoryGenerator.getFactory("Adidas");
        AdidasProduct adidasProduct = adidasFactory.getAdidasProduct("Adidas shoes");
        adidasProduct.makeAdidasProduct();


        AbstractFactory nikeFactory = FactoryGenerator.getFactory("Nike");
        NikeProduct nikeProduct = nikeFactory.getANikeProduct("Nike outerwear");
        nikeProduct.makeNikeProduct();
    }
}
