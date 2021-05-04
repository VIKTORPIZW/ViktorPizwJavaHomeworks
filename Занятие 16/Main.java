package com.pvt;

	import java.util.concurrent.Semaphore;

        class Main {
            private static final boolean[] PRINTER = new boolean[2];
            private static final Semaphore SEMAPHORE = new Semaphore(19, true);

            public static void main(String[] args) throws InterruptedException {
                for (int i = 0; i <= 19; i++) {
                    new Thread(new Worker(i)).start();
                    Thread.sleep(3000);
                }
            }

            public static class Worker implements Runnable {
                private final int workerNumber;

                public Worker(int workerNumber) {
                    this.workerNumber = workerNumber;
                }

                @Override
                public void run() {
                    System.out.printf("Сотрудник №%d отправил файл на печать.\n", workerNumber);
                    try {
                        SEMAPHORE.acquire();

                        int printerNumber = 0;

                        synchronized (PRINTER) {
                            for (int i = 0; i <=1; i++) {
                                if (!PRINTER[i]) {
                                    PRINTER[i] = true;
                                    printerNumber = i;
                                    System.out.printf("Сотрудник №%d печатает документ  на принтере %d.\n", workerNumber, i);
                                    break;
                                }
                            }
                        }

                        Thread.sleep(5000);

                        synchronized (PRINTER) {
                            PRINTER[printerNumber] = false;
                        }
                        SEMAPHORE.release();
                        System.out.printf("Сотрудник №%d напечатал документ.\n", workerNumber);
                    } catch (InterruptedException ignored) {
                    }
                }
            }

        }

