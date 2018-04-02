package com.epam.lab.task6;

import com.epam.lab.task6.task1.viewtask1.ViewTask1;
import com.epam.lab.task6.task2.ViewTask2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Menu {
    private static final Logger LOGGER = LogManager.getLogger(ViewTask1.class);

    public void showMenu() {
        int tempForCheck;
        NewClassForBranch.printInNewBranch();
        do {
            LOGGER.info("Choose task1 - '1', task2 - '2'. For end enter '0'");
            tempForCheck = checkInput();
            if (tempForCheck == 1) {
                LOGGER.info("Generic class – ship with droids");
                ViewTask1 task1 = new ViewTask1();
                task1.startTask1();
            } else if (tempForCheck == 2) {
                LOGGER.info("LinkedList class for droids using generics");
                ViewTask2 task2 = new ViewTask2();
                task2.startTask2();
            } else if (tempForCheck < 0 || tempForCheck > 6) {
                System.out.println("Incorrect input! Choose menu option again");
            }
        } while (tempForCheck != 0);
    }

    private static int checkInput() {
        Scanner input = new Scanner(System.in);
        if (!input.hasNextInt()) {
            input.next();
            System.out.println("Incorrect data, try again");
            return checkInput();
        } else {
            return input.nextInt();
        }
    }
}
