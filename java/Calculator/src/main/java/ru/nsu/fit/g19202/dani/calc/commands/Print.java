package ru.nsu.fit.g19202.dani.calc.commands;

import ru.nsu.fit.g19202.dani.calc.CalcContext;
import ru.nsu.fit.g19202.dani.calc.Command;

public class Print implements Command {

    @Override
    @StackSize(1)
    public void execute(String[] args, CalcContext ctx) {
        System.out.println(ctx.getStack().getFirst());
    }
}
