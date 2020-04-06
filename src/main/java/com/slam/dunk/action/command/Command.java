package com.slam.dunk.action.command;

/**
 * @Author: zerongliu
 * @Date: 4/5/20 17:28
 * @Description:
 */
public abstract class Command {
    /**
     * execute the concrete logic handler
     *
     * @return
     */
    public abstract String execute();
}
