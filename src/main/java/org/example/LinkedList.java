package org.example;

import org.w3c.dom.Node;

import javax.swing.JOptionPane;

public class LinkedList {
    
    private NodeLinkedList startLinkedList;
    private NodeLinkedList endLinkedList;

    public LinkedList(){
        this.startLinkedList = null;
        this.endLinkedList = null;
    }

    public void addElementsAsStack(){
        int elementToSave = Integer.parseInt(JOptionPane.showInputDialog("Enter the element to save"));
        NodeLinkedList newNodeLinkedList = new NodeLinkedList(elementToSave, this.startLinkedList);
        this.startLinkedList = newNodeLinkedList;
        if(this.endLinkedList == null){
            this.endLinkedList = this.startLinkedList;
        }
    }

    public void addElementsAsQueue(){
        int elementToSave = Integer.parseInt(JOptionPane.showInputDialog("Enter the element to save"));
        NodeLinkedList newNodeLinkedList = new NodeLinkedList(elementToSave);
        if(this.endLinkedList == null){
            this.startLinkedList = newNodeLinkedList;
            this.endLinkedList = this.startLinkedList;
        }else{
            this.startLinkedList.setNextPositionNodeLinkedList(newNodeLinkedList);
            this.startLinkedList = this.startLinkedList.getNextPositionNodeLinkedList();
        }
    }

    public String showElementsFromLinkedList(NodeLinkedList startLinkedList){
        if(startLinkedList == null){
            return null;
        }else{
            if(startLinkedList.getNextPositionNodeLinkedList() != null){
                return String.valueOf(startLinkedList.getDataNodeLinkedList()) + " -> " + showElementsFromLinkedList(startLinkedList.getNextPositionNodeLinkedList());
            }else{
                return String.valueOf(startLinkedList.getDataNodeLinkedList()) + showElementsFromLinkedList(startLinkedList.getNextPositionNodeLinkedList());
            }
        }
    }

    public int deleteElementsLinkedList(int elementToDelete, NodeLinkedList beforeNode, NodeLinkedList afterPosition){
        if(this.startLinkedList == this.endLinkedList){
            this.startLinkedList = null;
            this.endLinkedList = null;
        }else if(this.startLinkedList != null){
            this.startLinkedList = this.startLinkedList.getNextPositionNodeLinkedList();
        }else{
            if(afterPosition != null && afterPosition.getDataNodeLinkedList() != elementToDelete){
                return deleteElementsLinkedList(elementToDelete, beforeNode.getNextPositionNodeLinkedList(), afterPosition.getNextPositionNodeLinkedList());
            }

            if(afterPosition != null){
                if(afterPosition.getNextPositionNodeLinkedList() != null){
                    beforeNode.setNextPositionNodeLinkedList(afterPosition.getNextPositionNodeLinkedList());
                }

                if(afterPosition.getNextPositionNodeLinkedList() == null){
                    this.endLinkedList = beforeNode;
                    this.endLinkedList.setNextPositionNodeLinkedList(null);
                }
            }
        }
        return elementToDelete;
    }

    public NodeLinkedList getStartLinkedList(){
        return this.startLinkedList;
    }
}
