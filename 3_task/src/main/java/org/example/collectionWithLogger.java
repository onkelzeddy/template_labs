package org.example;

import java.io.IOException;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.*;

public class collectionWithLogger<E> implements Collection<E> {

    private Collection<E> collection;
    private FileHandler handler = new FileHandler("logs.log");
    private static Logger logger = Logger.getLogger(collectionWithLogger.class.getName());
    private boolean loggerOn = false;

    public collectionWithLogger() throws IOException {
        if(!loggerOn){
            handler.setFormatter(new XMLFormatter());
            logger.addHandler(handler);
            loggerOn = true;
        }
        logger.log(Level.INFO,"New collection created");
        collection = new ArrayList<E>();
    }

    public collectionWithLogger(String Type) throws IOException {
        if(!loggerOn) {
            handler.setFormatter(new XMLFormatter());
            logger.addHandler(handler);
            loggerOn = true;
        }
        logger.log(Level.INFO,"New collection created");
        if(Type.equals("ArrayList")) {
            this.collection = new ArrayList<E>();
            return;
        }
        if(Type.equals("LinkedList")) {
            this.collection = new LinkedList<E>();
            return;
        }
        if(Type.equals("Vector")) {
            this.collection = new Vector<E>();
            return;
        }
        System.err.println("Неверный тип коллекции");
    }

    public collectionWithLogger(Collection<E> a) throws IOException {
        if(!loggerOn) {
            handler.setFormatter(new XMLFormatter());
            logger.addHandler(handler);
            loggerOn = true;
        }
        logger.log(Level.INFO,"New collection created");
        this.collection = a;
    }

    public int size() {
        logger.log(Level.INFO, "HashCode:" + String.valueOf(this.hashCode()));
        return collection.size();
    }

    public boolean isEmpty() {
        logger.log(Level.INFO, "HashCode:" + String.valueOf(this.hashCode()));
        return collection.isEmpty();
    }

    public boolean contains(Object o) {
        logger.log(Level.INFO, "HashCode:" + String.valueOf(this.hashCode()));
        return collection.contains(o);
    }

    public Iterator<E> iterator() {
        logger.log(Level.INFO, "HashCode:" + String.valueOf(this.hashCode()));
        return collection.iterator();
    }

    public Object[] toArray() {
        logger.log(Level.INFO, "HashCode:" + String.valueOf(this.hashCode()));
        return collection.toArray();
    }

    public boolean add(E o) {
        logger.log(Level.INFO, "HashCode:" + String.valueOf(this.hashCode()));
        return collection.add(o);
    }

    public boolean remove(Object o) {
        logger.log(Level.INFO, "HashCode:" + String.valueOf(this.hashCode()));
        return collection.remove(o);
    }

    public boolean addAll(Collection c) {
        logger.log(Level.INFO, "HashCode:" + String.valueOf(this.hashCode()));
        return collection.addAll(c);
    }

    public void clear() {
        logger.log(Level.INFO, "HashCode:" + String.valueOf(this.hashCode()));
        collection.clear();
    }

    public boolean retainAll(Collection c) {
        logger.log(Level.INFO, "HashCode:" + String.valueOf(this.hashCode()));
        return collection.retainAll(c);
    }

    public boolean removeAll(Collection c) {
        logger.log(Level.INFO, "HashCode:" + String.valueOf(this.hashCode()));
        return collection.removeAll(c);
    }

    public boolean containsAll(Collection c) {
        logger.log(Level.INFO, "HashCode:" + String.valueOf(this.hashCode()));
        return collection.containsAll(c);
    }

    public Object[] toArray(Object[] a) {
        logger.log(Level.INFO, "HashCode:" + String.valueOf(this.hashCode()));
        return collection.toArray(a);
    }
}
