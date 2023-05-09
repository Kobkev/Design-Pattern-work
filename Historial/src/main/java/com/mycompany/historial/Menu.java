package com.mycompany.historial;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Kevin Verelst
 */
public class Menu {

    Command[] commands;
    Command undoCommand;
    Command redoCommand;

    public Menu() {
        commands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            commands[i] = noCommand;

        }
        undoCommand = noCommand;
        redoCommand = noCommand;
    }

    public void setCommand(int slot, Command command) {
        commands[slot] = command;
    }

    public void onButtonWasPushed(int slot) {
        commands[slot].execute();
        undoCommand = commands[slot];
        commands[slot] = redoCommand;
    }

    public void undoButtonWasPushed() {
        undoCommand.unexecute();
    }
    
    public void redoButtonWasPushed() {
        redoCommand.redo();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Menu -------\n");
        for (int i = 0; i < commands.length; i++) {
            stringBuff.append("[slot " + i + "] " + commands[i].getClass().getName() + "\n");
        }
        stringBuff.append("[undo] " + undoCommand.getClass().getName() + "\n");
        return stringBuff.toString();
    }
}
