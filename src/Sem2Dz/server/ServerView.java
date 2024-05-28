package Sem2Dz.server;

import Dz.ClientGUI;
import Sem2Dz.client.ClientView;

import javax.swing.*;

public interface ServerView {
    JTextArea getLog(String text);
    public void disconnectUser(ClientView clientView);
    public void connectUser(ClientView clientView);
    public void message(String text);
}
