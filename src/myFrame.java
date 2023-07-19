import jdk.dynalink.linker.support.SimpleLinkRequest;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class myFrame extends JFrame {


    Calendar calender;
    SimpleDateFormat timeFormat;

    SimpleDateFormat dayFormat;

    JLabel timeLable;
    JLabel dayLable;
    String time;
    String day;

    myFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Clock");
        this.setLayout(new FlowLayout());
        this.setSize(500, 300);
        this.setResizable(true);
        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE " + "dd MM YYYY");

        timeLable = new JLabel();
        timeLable.setFont(new Font("Verdana",Font.PLAIN,50));
        timeLable.setForeground(new Color(0x00ff00));
        timeLable.setBackground(Color.black);
        timeLable.setOpaque(true);

        dayLable = new JLabel();
        dayLable.setFont(new Font("Verdana",Font.BOLD,35));


        this.add(timeLable);
        this.add(dayLable);
        this.setVisible(true);

        setTime();
    }

    public void setTime() {
        while (true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLable.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLable.setText(day);


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}