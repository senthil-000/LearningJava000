import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args)  {

            ProductList plist = new ProductList();
            
            List<Product> products = plist.getProductList();
    
        //  Lambda expressions, passed in sort		
            products.sort((p1,p2) -> p1.getName().compareTo(p2.getName()));
            
            ProductPriceComparator  pComp = new ProductPriceComparator();
     
        // Comparator Options
            Collections.sort(products,pComp);
            
            for (Product product : products) {
                
                System.out.println(product.getName() + " " + product.getCategory() + " " + product.getPrice());
            }
            
        }
}

