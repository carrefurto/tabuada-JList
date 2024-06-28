package br.senai.sp.jandira.tabuada.view;

import javax.swing.*;
import java.awt.*;

public class CustomPanel extends JPanel {
    private Image painel;

    public CustomPanel(String imagemPainel) {
        try {
            painel = new ImageIcon(getClass().getResource(imagemPainel)).getImage();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        if (painel != null) {
            graphics.drawImage(painel, 0, 0, getWidth(), getHeight(), this);

        }
    }
 }
