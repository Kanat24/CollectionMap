package task1;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Product eggs = new Product("Яйца", 60, 3);
        Product milk = new Product("Молоко", 90, 1);
        Product chicken = new Product("Курица", 180, 1);
        Product bread = new Product("Хлеб", 40, 1);
        Product cheese = new Product("Сыр", 180, 1);
        Product oil = new Product("масло", 170, 1);
        Product sol = new Product("Соль", 10, 1);
        Product iceСream = new Product("Мороженое", 100, 1);
        ProductList productList = new ProductList();
        productList.addNewProduct(eggs, 3);
        productList.addNewProduct(milk, 2);
        productList.addNewProduct(bread, 3);
        productList.addNewProduct(oil, 1);

        System.out.println(productList.food);
        System.out.println(productList.food.size());

        Recipe recipe1 = new Recipe(productList.food, Recipe.sumProduct(productList.food), "Сендвич");
        System.out.println(recipe1);
    }
}
