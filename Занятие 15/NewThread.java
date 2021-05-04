package com.pvt;
class NewClass implements Runnable {
    int y = (int) Math.random();
    @Override
    public void run() {
        for (int i=0; i<=7; i++){
            System.out.println("Числа потока 2: "+ i+ " Но это другой поток");
            try {
                Thread.sleep(y);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}






