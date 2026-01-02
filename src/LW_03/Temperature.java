package LW_03;

public class Temperature {
    private double celsius;

    public Temperature() {
        this.celsius = 0.0;
    }

    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    public double toFahrenheit() {
        return celsius * 9 / 5 + 32;
    }

    public double toCelsius() {
        return celsius;
    }

    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
}
