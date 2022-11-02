package task1;

import java.util.*;

public class ProductList {
    final Map<Product, Integer> food = new HashMap<>();
    final Set<Product> food1 = new HashSet<>();
    final Set<Product> food2 = new HashSet<>();

    public void addNewProduct(Product product, Integer amount) {
        if (amount<=0){
            amount=1;
        }else {
            food.put(product, amount);
        }
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductList that = (ProductList) o;
        return Objects.equals(food, that.food) && Objects.equals(food1, that.food1) && Objects.equals(food2, that.food2);
    }


}
