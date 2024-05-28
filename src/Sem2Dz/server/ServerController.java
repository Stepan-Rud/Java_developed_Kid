package Sem2Dz.server;

import Dz.ClientGUI;
import Sem2Dz.client.ClientController;
import Sem2Dz.client.ClientView;

public class ServerController {
    private ServerView serverView;
    private boolean connected = false;
    private String name;
    private ClientView clientView;

    public ServerController(ServerView serverView) {
        this.serverView = serverView;
    }
    private void appendLog(ServerView serverView, String text) {
        serverView.getLog(text).append(text + "\n");
    }

    public boolean connectUser(ClientController clientController) {
    }

    public String getHistory() {
    }

    public void disconnectUser(ClientController clientController) {
    }

    public void message(String s) {
    }
}
