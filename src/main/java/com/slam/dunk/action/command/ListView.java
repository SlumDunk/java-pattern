package com.slam.dunk.action.command;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class ListView {

    private Command command;

    /**
     * set the command
     *
     * @param command
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     *
     */
    public void getList() {
        System.out.print("request by Home Page");
        String result = command.execute();
        System.out.println("the current list is: " + result);
    }
}
