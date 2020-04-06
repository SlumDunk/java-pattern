package com.slam.dunk.structure.facade;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class CustomerClient {


    public static void main(String[] args) {
        doOrderFacade();
    }

    public static void doOrder() {

        PickService pickService = new PickService();
        PackService packService = new PackService();
        SendService sendService = new SendService();

        //pick service
        System.out.println("--------------");
        pickService.doPick();

        //pack service
        System.out.println("--------------");
        packService.doPack();
        //mail service
        System.out.println("--------------");
        sendService.doSend();

    }

    /**
     * use facade pattern
     */
    public static void doOrderFacade() {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.doOrder();
    }


}
