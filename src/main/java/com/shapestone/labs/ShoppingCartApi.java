package com.shapestone.labs;

import java.util.List;

/**
 * User: msundell
 */
public class ShoppingCartApi {
    public void add(ProductItem item) {
        throw new NetworkException("Can't connect to remote host");
    }

    public List<ProductItem> getAllItems() {
        throw new NetworkException("Can't connect to remote host");
    }

    public void emptyCart() {
        throw new NetworkException("Can't connect to remote host");
    }

    public void remove(ProductItem item) {
        throw new NetworkException("Can't connect to remote host");
    }
}
