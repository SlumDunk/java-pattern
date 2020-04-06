package com.slam.dunk.action.command;


import com.slam.dunk.action.command.command.DiscountCommand;
import com.slam.dunk.action.command.command.HotCommand;
import com.slam.dunk.action.command.command.NewerCommand;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class CommandClient {

    public static void main(String[] args) {
        // three commands, three types of requests
        Command command1, command2, command3;
        command1 = new HotCommand();
        command2 = new NewerCommand();
        command3 = new DiscountCommand();

        ListView listView;
        listView = new ListView();
        //set the command
        listView.setCommand(command2);
        //call the request and get the goods list
        listView.getList();


    }
}
