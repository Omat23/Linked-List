package org.example;

public class NodeLinkedList {

    private int dataNodeLinkedList;
    private NodeLinkedList nextPositionNodeLinkedList;

    public NodeLinkedList(int dataNodeLinkedList) {
        this.dataNodeLinkedList = dataNodeLinkedList;
        this.nextPositionNodeLinkedList = null;
    }

    public NodeLinkedList(int dataNodeLinkedList, NodeLinkedList nextPositionNodeLinkedList) {
        this.dataNodeLinkedList = dataNodeLinkedList;
        this.nextPositionNodeLinkedList = nextPositionNodeLinkedList;
    }

    public int getDataNodeLinkedList() {
        return dataNodeLinkedList;
    }

    public NodeLinkedList getNextPositionNodeLinkedList() {
        return nextPositionNodeLinkedList;
    }

    public void setNextPositionNodeLinkedList(NodeLinkedList nextPositionNodeLinkedList) {
        this.nextPositionNodeLinkedList = nextPositionNodeLinkedList;
    }
}
