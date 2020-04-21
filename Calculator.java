public class Calculator {
    private int result;

    public void add(int ... params) {
        this.result = params[0] + params[1]; 
    }

    public void subtrac(int ... params) {
        this.result = params[0] - params[1]; 
    }

    public void multip(int ... params) {
        this.result = params[0] * params[1];
    }

    public void divis(int ... params) {
        this.result = params[0] / params[1];
    }

    public int getResult() {
        return this.result;
    }

    public void cleanResult() {
        this.result = 0;
    }
}