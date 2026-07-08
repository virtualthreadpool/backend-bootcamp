package com.aeropelican;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
    public class OrderProcessorMain {

        public static void main(String[] args) throws InterruptedException {

            int totalOrders = 1000;
            int totalThreads = 20;

            int ordersPerThread = totalOrders / totalThreads;

            ExecutorService executor = Executors.newFixedThreadPool(totalThreads);

            int startOrder = 1001;

            for (int i = 0; i < totalThreads; i++) {

                int endOrder = startOrder + ordersPerThread - 1;

                OrderProcessor processor = new OrderProcessor(startOrder, endOrder);

                executor.submit(processor);

                startOrder = endOrder + 1;
            }
            System.out.println("All 1000 Orders Processed Successfully.");
        }
    }

