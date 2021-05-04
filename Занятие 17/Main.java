package com.pvt;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println( "Товары к покупке:"+"\nМикрофон Shure sm58-2шт"+ "\nКабель XLR В размотке 20 метров-2шт."
        +" \nМикшерный пульт Behringer XR32"+"\nКомплект микрофонов AKG"+"\nСистема ушного мониторинга Shure PSM 300"+
                "\nСтойка для микрофона Журавль-6шт");
        System.out.println("На площадке Alliexpres не продаются товары надлежащего качества в этой категории!");
        System.out.println("Но Вы можете попробовать)");
        Server<String> server = new Server<>();
        List<String> list = server.getList();
        CompletableFuture future = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("Запрос товаров на сервере Alliexpres " + server.getProducts());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }).thenAccept(goods -> {
            Collections.reverse(list);
            System.out.println("Отображение товаров в обратном порядке " + list);
        });
        future.get();
    }
}
