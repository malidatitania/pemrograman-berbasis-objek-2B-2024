/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg230441100110_beliaekaasukmamentari;

/**
 *
 * @author asus
 */
public class Kerucut extends BangunRuang implements Dimensi {
    private double jariJari;
    private double tinggi;

    Kerucut(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    protected double hitungVolume() {
        return (1.0/3.0) * Math.PI * Math.pow(jariJari, 2) * tinggi;
    }

    @Override
    protected void info() {
        System.out.println("Kerucut dengan jari-jari " + jariJari + " dan tinggi " + tinggi);
    }

    @Override
    public double getJariJari() {
        return jariJari;
    }

    @Override
    public double getLebar() {
        return 0; // Tidak diperlukan untuk kerucut
    }

    @Override
    public double getTinggi() {
        return tinggi;
    }
}
