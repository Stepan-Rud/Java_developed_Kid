package Sem2Dz.server;

import Dz.ClientGUI;
import Sem2Dz.client.ClientController;
import Sem2Dz.client.ClientView;

import java.util.List;

public class ServerController {
    private ServerView serverView;
    private boolean connected = false;
    private String name;
    private List<ClientView> clientViewList;
    private ClientView clientView;

    public ServerController(ServerView serverView) {
        this.serverView = serverView;
    }
    private void appendLog(ServerView serverView, String text) {
        serverView.getLog(text).append(text + "\n");
    }

    public boolean connectUser(ClientView clientView) {
        if (connected) {
            return false;
        } else {
            connected = true;
            clientViewList.add(clientView);
            appendLog(serverView, "Вы подключились!");
            return true;
        }
    }

    public String getHistory() {
        if (connected) {
            return serverView.historyLog();
        } else {
            return null;
        }
    }

    public void disconnectUser(ClientView clientView) {
        if (connected) {
            connected = false;
            clientViewList.remove(clientView);
            appendLog(serverView, "Вы отключились!");
        }
    }

    public void message(String s) {
        if (connected) {
            for (ClientView client : clientViewList) {
                client.answer(s);
            }

        }
        else {
            appendLog(serverView, "Нет подключения к серверу");
        }
        showOnWindow(s);
    }

    private void showOnWindow(String s) {
        serverView.message(s);
    }
}
