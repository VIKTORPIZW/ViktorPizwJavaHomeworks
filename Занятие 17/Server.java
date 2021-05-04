package com.pvt;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Server <T> {
    private ArrayList<T> list;
    public List<T> getProducts() throws InterruptedException {
        this.list = new ArrayList<T>();
        list.add((T)"Микрофон Shure sm58-2шт");
        list.add((T)"Кабель XLR В размотке 20 метров-2шт.");
        list.add((T)"Микшерный пульт Behringer XR32");
        list.add((T)"Комплект микрофонов AKG");
        list.add((T)"Система ушного мониторинга Shure PSM 300");
        list.add((T)"Стойка для микрофона Журавль-6шт");
        TimeUnit.SECONDS.sleep(6);
        return this.list;
    }
    public List<T> getList() throws InterruptedException {
        this.list = new ArrayList<T>();
        list.add((T)"Микрофон Shure sm58-2шт");
        list.add((T)"Кабель XLR В размотке 20 метров-2шт.");
        list.add((T)"Микшерный пульт Behringer XR32");
        list.add((T)"Комплект микрофонов AKG");
        list.add((T)"Система ушного мониторинга Shure PSM 300");
        list.add((T)"Стойка для микрофона Журавль-6шт");
        TimeUnit.SECONDS.sleep(6);
        return this.list;
    }
}
