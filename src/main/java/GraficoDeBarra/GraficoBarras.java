package GraficoDeBarra;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;


public class GraficoBarras extends JFrame {

    public GraficoBarras(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Gráfico Barra");
        setSize(700, 700);

        criarGrafico();
        setVisible(true);
    }

    public void criarGrafico(){

        DefaultCategoryDataset barra = new DefaultCategoryDataset();
        barra.setValue(4, "1", "");
        barra.setValue(5, "2", "");
        barra.setValue(6, "4", "");
        barra.setValue(7, "7.", "");
        barra.setValue(8, "5", "");
        barra.setValue(9, "7", "");
        barra.setValue(10, "5.", "");

        JFreeChart grafico = ChartFactory.
                createBarChart3D("Frequência de notas semestral",
                        "Quantidade de alunos que tiraram tal nota",
                        "Notas",
                        barra,
                        PlotOrientation.VERTICAL,
                        true,
                        true,
                        false);
        ChartPanel painel = new ChartPanel(grafico);
        add(painel);


    }

    public static void main(String[] args){

        new GraficoBarras();
    }

}
