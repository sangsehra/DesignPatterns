package DesignPatterns.BehaviouralDesignPatterns.StateDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    int itemCount=0;
    List<Product> productList = new ArrayList<>();

    Inventory(int itemCount){
        this.itemCount=itemCount;
        updateDefaultInventory();
    }


    public void updateDefaultInventory(){
        productList.add(new Product(ProductType.PEPSI,10));
        productList.add(new Product(ProductType.COKE,10));
        productList.add(new Product(ProductType.WATER,20));
        productList.add(new Product(ProductType.SODA,15));

    }

    public Product updateAvailability(int productCode){
        for(Product product : productList){
            if (product.productType.productCode == productCode && product.isAvailable){
                product.setAvailable(false);
                return product;
            }
        }
        return new Product();
    }

    public boolean isProductAvailable(int productCode){
        for(Product product : productList){
            if (product.productType.productCode == productCode && product.isAvailable){
                return true;
            }
        }
        return false;
    }

    public int getProductPrice(int productCode){
        for(Product product : productList){
            if (product.productType.productCode == productCode && product.isAvailable){
                return product.getPrice();
            }
        }
        return -1;
    }

}
