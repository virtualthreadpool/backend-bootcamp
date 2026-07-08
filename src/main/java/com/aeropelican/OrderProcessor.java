package com.aeropelican;
    public class OrderProcessor extends Thread {
        private Integer startOrder;
        private Integer endOrder;

        ValidateOrder validate = new ValidateOrder();
        GenerateInvoice invoice = new GenerateInvoice();

        public OrderProcessor(Integer startOrder, Integer endOrder) {
            this.startOrder = startOrder;
            this.endOrder = endOrder;
        }

        @Override
        public void run() {

            for (int orderId = startOrder; orderId <= endOrder; orderId++) {

                System.out.println(Thread.currentThread().getName()
                        + " processing Order-" + orderId);

                validate.validateOrder(orderId);
                validate.reserveInventory(orderId);

                invoice.calculateTax(orderId);
                invoice.generateInvoice(orderId);
                invoice.sendConfirmationEmail(orderId);

                System.out.println("--------------------------------");
            }
        }
    }

