package ru.ifmo.md.lesson4.engine;

import ru.ifmo.md.lesson4.exception.CalculationException;

public interface CalculationEngine {

    public double calculate(String expression) throws CalculationException;

}