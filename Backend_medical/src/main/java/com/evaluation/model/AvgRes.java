package com.evaluation.model;

public class AvgRes {
    private int[] windowPrevState = new int[]{};
    private int[] windowCurrState;
    private int[] numbers;
    private double avg;

    public int[] getWindowPrevState() { return windowPrevState; }
    public void setWindowPrevState(int[] windowPrevState) { this.windowPrevState = windowPrevState; }

    public int[] getWindowCurrState() { return windowCurrState; }
    public void setWindowCurrState(int[] windowCurrState) { this.windowCurrState = windowCurrState; }

    public int[] getNumbers() { return numbers; }
    public void setNumbers(int[] numbers) { this.numbers = numbers; }

    public double getAvg() { return avg; }
    public void setAvg(double avg) { this.avg = avg; }
}