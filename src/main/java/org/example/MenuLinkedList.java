package org.example;

import javax.swing.*;

public class MenuLinkedList {

    private LinkedList linkedList;

    public MenuLinkedList() {
        this.linkedList = new LinkedList();
    }

    public int chooseOperation(){
        return Integer.parseInt(JOptionPane.showInputDialog("""
                                                            1.- Add Elements As Stack
                                                            2.- Add Elements As Queue
                                                            3.- Show Elements
                                                            4,- Delete Elements
                                                            """));
    }

    public void executeOperation(){
        int opc = 0;
        while(opc < 5){
            opc = chooseOperation();
            switch (opc){
                case 1: this.linkedList.addElementsAsStack();
                break;

                case 2: this.linkedList.addElementsAsQueue();
                break;

                case 3: JOptionPane.showMessageDialog(null, this.linkedList.showElementsFromLinkedList(this.linkedList.getStartLinkedList()));
                break;

                case 4: this.linkedList.deleteElementsLinkedList(Integer.parseInt(JOptionPane.showInputDialog("Enter the element to delete")),
                                                                this.linkedList.getStartLinkedList(), this.linkedList.getStartLinkedList().getNextPositionNodeLinkedList());
                break;
            }
        }
    }
}
