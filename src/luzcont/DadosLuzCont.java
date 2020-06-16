
package luzcont;

import javax.swing.JOptionPane;

public class DadosLuzCont {

    public double mesante;
    public double mesatual;
    public double analise_a;
    public double analise_b;
    public double analise_d;
    public double analise_c;
    public double analisefinal;
    public double taxas;
    public double tolsemband;
    public double tolband;
    public double semband;
    public double band;
    
    public double getMesante() {
    return mesante;
    }
    public void setMesante(double mesante) {
        this.mesante = mesante;
    }
    
    public double getMesatual() {
    return mesatual;
    }
    public void setMesatual(double mesatual) {
        this.mesatual = mesatual;
    }
    
    public double getSemband() {
    return semband;
    }
    public void setSemband(double semband) {
        this.semband = semband;
    }
    
    public double getBand() {
    return band;
    }
    public void setBand(double band) {
        this.band = band;
    }
    
    public double getAnalisefinal() {
    return analisefinal;
    }
    public void setAnalisefinal(double analisefinal) {
        this.analisefinal = analisefinal;
    }
    
    public double getAnalise_a() {
    return analise_a;
    }
    public void setAnalise_a(double analise_a) {
        this.analise_a = analise_a;
    }
    
    public double getAnalise_b() {
    return analise_b;
    }
    public void setAnalise_b(double analise_b) {
        this.analise_b = analise_b;
    }
    
    public double tolsemband (double mesante, double mesatual) {
    analisefinal = mesatual - mesante;
        if (analisefinal < 0) {
          analisefinal = analisefinal * -1;
        }
    
    analise_d = analisefinal * 0.30;
    analise_d = analisefinal * 0.29;
    
    taxas = analise_c + analise_d;
    
    semband = (taxas * 0.25) + taxas;
    
    return semband;    
    }
    
    public double tolband (double leitsemband, double analisefinal, double leitcband, double analise_a, double analise_b, double leitant, double leitatual) {
        
        if (analisefinal < 100) {
          leitcband = analisefinal;
        } else if (analisefinal >= 101 && analisefinal <= 150) {
          analise_b = (0.013 * analisefinal);
          analise_b = (analise_a * 0.25) + (analise_a);   
          leitcband = analise_b;
        } else if(analisefinal >= 150 && analisefinal <= 200) {
          analise_a = (analisefinal * 0.042);
          analise_b = (analise_a * 0.25) + analise_a;  
          leitcband = analise_b;
        } else if (analisefinal > 200) {
          analise_a = (analisefinal * 0.062);
         analise_b = (analise_a * 0.25) + analise_a; 
          leitcband = analise_b;
        }
        
        leitcband = band + leitsemband;
        
        
        JOptionPane.showMessageDialog(null, "Gasto mensal anterior: R$" + mesante + "\n" +  "Gasto atual: R$" + mesatual + "\n" +  
                                      "Gasto final de R$" + analisefinal + "\n" +   "Valor a ser pago sem as bandeiras: R$" + semband + "\n" +
                                      "Valor a ser pago com as bandeiras: R$" + band);
        
        
        return band;
    }

}
     

