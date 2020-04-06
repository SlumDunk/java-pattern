package com.slam.dunk.action.command.command;

import com.slam.dunk.action.command.Command;
import com.slam.dunk.action.command.handler.NewerHandler;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class NewerCommand extends Command {
    private NewerHandler handler = new NewerHandler();

    @Override
    public String execute() {
        return handler.getNewestGoods();
    }
}
