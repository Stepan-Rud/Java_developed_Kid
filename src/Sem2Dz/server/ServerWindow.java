package Sem2Dz.server;

import Sem2Dz.client.ClientView;

import javax.swing.*;
import java.awt.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ServerWindow extends JFrame implements ServerView {

    public static final int WIDTH = 400;
    public static final int HEIGHT = 300;
    public static final String LOG_PATH = "src/Sem2Dz/log.txt";
    List<ClientView> clientViewList;
    JButton btnStart, btnStop;
    JTextArea log;
    boolean work;

    public ServerWindow() {
        clientViewList = new ArrayList<>();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        settings();
    }

    public void settings() {
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setTitle("Chat server");
        setLocationRelativeTo(null);
        createPanel();
        setVisible(true);
    }

    private void createPanel() {
        log = new JTextArea();
        add(log);
        add(createButtons(), BorderLayout.SOUTH);
    }

    private Component createButtons() {
        JPanel panelButtons = new JPanel(new GridLayout(1, 2));
        btnStart = new JButton("Start");
        btnStop = new JButton("Stop");
        panelButtons.add(btnStart);
        panelButtons.add(btnStop);
        return panelButtons;

    }

    @Override
    public JTextArea getLog(String text) {
        return log;
    }

    @Override
    public void disconnectUser(ClientView clientView) {
        clientViewList.remove(clientView);
        if (clientView != null) {
            clientView.disconnectedFromServer();
        }
    }

    @Override
    public void connectUser(ClientView clientView) {
        if (!work) {
            return;
        }
        clientViewList.add(clientView);
    }

    @Override
    public void message(String text) {
        if (!work) {
            return;
        }
        text += "";
        log.append(text + "\n");
        for (ClientView clientView : clientViewList) {
            clientView.answer(text);
        }
    }

    @Override
    public void saveLog(String text) {
        try (FileWriter writer = new FileWriter(LOG_PATH, true)) {
            writer.write(text);
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void readLog() {
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader reader = new FileReader(LOG_PATH)) {
            int c;
            while ((c = reader.read()) != -1) {
                stringBuilder.append((char) c);
            }
            stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
            log.setText(stringBuilder.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public String historyLog() {
        return log.getText();
    }

}
