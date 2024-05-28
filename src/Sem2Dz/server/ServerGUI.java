package Sem2Dz.server;

import Dz.ClientGUI;
import Sem2Dz.client.ClientView;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ServerGUI extends JFrame implements ServerView {

    public static final int WIDTH = 400;
    public static final int HEIGHT = 300;
    public static final String LOG_PATH = "src/Dz/log.txt";
    List<ClientView> clientViewList;
    JButton btnStart, btnStop;
    JTextArea log;
    boolean work;

    public ServerGUI() {
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

}
