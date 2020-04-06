package com.slam.dunk.structure.facade;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class OrderFacade {
    private PickService pickService;
    private PackService packService;
    private SendService sendService;


    public OrderFacade() {
        pickService = new PickService();
        packService = new PackService();
        sendService = new SendService();
    }

    /**
     * handle the order
     */
    public void doOrder() {
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


}
