package SwingObserver;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AngelListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("하지마! 아마 후회할걸?");
    }
}
