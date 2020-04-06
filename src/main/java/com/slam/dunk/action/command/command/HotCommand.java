package com.slam.dunk.action.command.command;

import com.slam.dunk.action.command.Command;
import com.slam.dunk.action.command.handler.HotHandler;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public class HotCommand extends Command {
    private HotHandler handler = new HotHandler();

    @Override
    public String execute() {
        return handler.getHots();
    }
}
