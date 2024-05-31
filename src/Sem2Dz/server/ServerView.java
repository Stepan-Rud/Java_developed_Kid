package Sem2Dz.server;

import Dz.ClientGUI;
import Sem2Dz.client.ClientView;

import javax.swing.*;

public interface ServerView {
    JTextArea getLog(String text);
    void disconnectUser(ClientView clientView);
    void connectUser(ClientView clientView);
    void message(String text);
    void saveLog(String text);
    void readLog();
    String historyLog();

}
