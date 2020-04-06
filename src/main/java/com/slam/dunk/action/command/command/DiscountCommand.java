package com.slam.dunk.action.command.command;


import com.slam.dunk.action.command.Command;
import com.slam.dunk.action.command.handler.DiscountHandler;

public class DiscountCommand extends Command {

    private DiscountHandler handler = new DiscountHandler();

    @Override
    public String execute() {
        return handler.getDiscounts();
    }
}
