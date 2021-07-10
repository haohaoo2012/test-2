package com.haohao.haostore.global;

import com.haohao.haostore.model.Product;

import java.util.ArrayList;
import java.util.List;

public class GlobalData {
    public static List<Product> cart;

    static {
        cart = new ArrayList<>();
    }

}
