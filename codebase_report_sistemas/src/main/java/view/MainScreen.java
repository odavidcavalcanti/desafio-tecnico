package view;

import controller.TxtGeneratorController;

import javax.swing.*;
import java.awt.*;

public class MainScreen extends JFrame {
    private final TxtGeneratorController txtGeneratorController;

    public MainScreen() {
        this.txtGeneratorController = new TxtGeneratorController();

        setTitle("Report Sistemas");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setLocationRelativeTo(null);

        JButton generateBtn = new JButton("Gerar Arquivo .txt");

        generateBtn.addActionListener(event -> {

            new Thread(() -> {
                try {
                    txtGeneratorController.processFileGeneration();

                    JOptionPane.showMessageDialog(this, "Arquivo gerado com sucesso");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Erro ao gerar arquio: " + e);
                }
            }).start();
        });
        add(generateBtn);
    }
}
