package calendar;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        main.showMenu();
    }

    void showMenu() {


        try {
            ImageIcon icon = new ImageIcon("src/main/java/Images/year.jpg");
            String str = new String();

            str = JOptionPane.showInputDialog(null, "Please type any month of the year",
                    "Greeting",JOptionPane.PLAIN_MESSAGE);


            if (str.equalsIgnoreCase("january")) {
                january();
            } else if (str.equalsIgnoreCase("february")) {
                february();
            } else if (str.equalsIgnoreCase("march")) {
                march();
            } else if (str.equalsIgnoreCase("april")) {
                april();
            } else if (str.equalsIgnoreCase("may")) {
                may();
            } else if (str.equalsIgnoreCase("june")) {
                june();
            } else if (str.equalsIgnoreCase("july")) {
                july();
            } else if (str.equalsIgnoreCase("august")) {
                august();
            } else if (str.equalsIgnoreCase("september")) {
                september();
            } else if (str.equalsIgnoreCase("october")) {
                october();
            } else if (str.equalsIgnoreCase("november")) {
                november();
            } else if (str.equalsIgnoreCase("december")) {
                december();
            } else if (str.equalsIgnoreCase("stop")) {
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Something is not right, try again! ", "Error message", JOptionPane.ERROR_MESSAGE);

            }
            showMenu();
        }
        catch (Exception mn) {

        }

    }


    public static void january() {
        HolidayMonths holidayMonths = new HolidayMonths();
        ImageIcon icon = new ImageIcon("src/main/java/Images/jan.jpg");
        JOptionPane.showMessageDialog(null, holidayMonths.january, "January holidays", JOptionPane.INFORMATION_MESSAGE, icon);
    }

    public static void february() {
        HolidayMonths holidayMonths = new HolidayMonths();
        ImageIcon icon = new ImageIcon("src/main/java/Images/feb.jpg");
        JOptionPane.showMessageDialog(null, holidayMonths.february, "February holidays", JOptionPane.INFORMATION_MESSAGE, icon);
    }

    public static void march() {
        HolidayMonths holidayMonths = new HolidayMonths();
        ImageIcon icon = new ImageIcon("src/main/java/Images/mar.jpg");
        JOptionPane.showMessageDialog(null, holidayMonths.march, "March holidays", JOptionPane.INFORMATION_MESSAGE, icon);
    }

    public static void april() {
        HolidayMonths holidayMonths = new HolidayMonths();
        ImageIcon icon = new ImageIcon("src/main/java/Images/apr.jpg");
        JOptionPane.showMessageDialog(null, holidayMonths.april, "April holidays", JOptionPane.INFORMATION_MESSAGE, icon);
    }

    public static void may() {
        HolidayMonths holidayMonths = new HolidayMonths();
        ImageIcon icon = new ImageIcon("src/main/java/Images/may.jpg");
        JOptionPane.showMessageDialog(null, holidayMonths.may, "May holidays", JOptionPane.INFORMATION_MESSAGE, icon);
    }

    public static void june() {
        HolidayMonths holidayMonths = new HolidayMonths();
        ImageIcon icon = new ImageIcon("src/main/java/Images/jun.jpg");
        JOptionPane.showMessageDialog(null, holidayMonths.june, "June holidays", JOptionPane.INFORMATION_MESSAGE, icon);
    }

    public static void july() {
        HolidayMonths holidayMonths = new HolidayMonths();
        ImageIcon icon = new ImageIcon("src/main/java/Images/jul.png");
        JOptionPane.showMessageDialog(null, holidayMonths.july, "July holidays", JOptionPane.INFORMATION_MESSAGE, icon);
    }

    public static void august() {
        HolidayMonths holidayMonths = new HolidayMonths();
        ImageIcon icon = new ImageIcon("src/main/java/Images/aug.jpg");
        JOptionPane.showMessageDialog(null, holidayMonths.august, "August holidays", JOptionPane.INFORMATION_MESSAGE, icon);
    }

    public static void september() {
        HolidayMonths holidayMonths = new HolidayMonths();
        ImageIcon icon = new ImageIcon("src/main/java/Images/sep.jpg");
        JOptionPane.showMessageDialog(null, holidayMonths.september, "September holidays", JOptionPane.INFORMATION_MESSAGE, icon);
    }

    public static void october() {
        HolidayMonths holidayMonths = new HolidayMonths();
        ImageIcon icon = new ImageIcon("src/main/java/Images/oct.jpg");
        JOptionPane.showMessageDialog(null, holidayMonths.october, "October holidays", JOptionPane.INFORMATION_MESSAGE, icon);
    }

    public static void november() {
        HolidayMonths holidayMonths = new HolidayMonths();
        ImageIcon icon = new ImageIcon("src/main/java/Images/nov.jpg");
        JOptionPane.showMessageDialog(null, holidayMonths.november, "November holidays", JOptionPane.INFORMATION_MESSAGE, icon);
    }

    public static void december() {
        HolidayMonths holidayMonths = new HolidayMonths();
        ImageIcon icon = new ImageIcon("src/main/java/Images/dec.jpg");
        JOptionPane.showMessageDialog(null, holidayMonths.december, "December holidays", JOptionPane.INFORMATION_MESSAGE, icon);
    }
}