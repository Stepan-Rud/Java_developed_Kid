package Sem1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingWindow extends JFrame {
    private static final int WIDTH = 230;
    private static final int HEIGHT = 350;

    private JButton btnStart;

    JPanel panel1(){
        Label labelGameMode = new Label("Выберите режим игры:");
        JRadioButton radioButton1 = new JRadioButton("Игрок против компьютера");
        JRadioButton radioButton2 = new JRadioButton("Игрок против игрока");
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.add(labelGameMode);
        panel.add(radioButton1);
        panel.add(radioButton2);
        return panel;
    }

    private JPanel fieldSizePanel(){
        JSlider slider = new JSlider(3, 10, 3);
        slider.getValue();
        Label labelSizeField = new Label("Размер поля:");
        Label labelSizeFieldCurrent = new Label("Установленный размер поля: " + slider.getValue());
        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.add(labelSizeField);
        panel.add(labelSizeFieldCurrent);
        panel.add(slider);
        slider.addChangeListener(e -> labelSizeFieldCurrent.setText("Установленный размер поля: " + slider.getValue()));
        return panel;
    }

    private JPanel lenghtCountForVictoryPanel(){
        JSlider jSlider1 = new JSlider(3, 10, 3);
        jSlider1.getValue();
        Label labelLineLenghtWinCurrent = new Label("Установленная длина линии для победы: " + jSlider1.getValue());
        Label labelLineLenghtWin = new Label("Длина линии для победы:");
        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.add(labelLineLenghtWin);
        panel.add(labelLineLenghtWinCurrent);
        panel.add(jSlider1);
        jSlider1.addChangeListener(e -> labelLineLenghtWinCurrent.setText("Установленная длина поля: " + jSlider1.getValue()));
        return panel;
    }
    SettingWindow(GameWindow gameWindow){
        btnStart = new JButton("Start new game");
        setLocationRelativeTo(gameWindow);
        setSize(WIDTH, HEIGHT);
        JPanel panelSetting = new JPanel(new GridLayout(3, 1));
        panelSetting.add(panel1());
        panelSetting.add(fieldSizePanel());
        panelSetting.add(lenghtCountForVictoryPanel());
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                gameWindow.startNewGame(0, 3, 3, 3);
            }
        });

        add(btnStart, BorderLayout.SOUTH);
        add(panelSetting, BorderLayout.CENTER);
        setVisible(true);
    }
}
