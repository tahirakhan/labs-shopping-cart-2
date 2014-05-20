package com.shapestone.labs;

import java.util.List;

/**
 * User: msundell
 */
public class ShoppingCartImpl implements ShoppingCart {
    private ShoppingCartApi shoppingCartApi;

    @Override
    public void addItem(ProductItem item) {
        shoppingCartApi.add(item);
    }

    @Override
    public void removeItem(ProductItem item) {
        shoppingCartApi.remove(item);
    }

    @Override
    public double calculateTotal() {
        List<ProductItem> items = shoppingCartApi.getAllItems();
        double total = 0D;
        for(ProductItem item : items) {
            total += item.getCount() * item.getPrice();
        }
        return total;
    }

    @Override
    public void emptyShoppingCart() {
        shoppingCartApi.emptyCart();
    }

    @Override
    public int getOrderItemCount() {
        List<ProductItem> items = shoppingCartApi.getAllItems();
        int count = 0;
        for(ProductItem item : items) {
            count += item.getCount();
        }
        return count;
    }

    @Override
    public int getProductItemCount() {
        List<ProductItem> items = shoppingCartApi.getAllItems();
        return items.size();
    }

    public void setShoppingCartApi(ShoppingCartApi shoppingCartApi) {
        this.shoppingCartApi = shoppingCartApi;
    }
}
