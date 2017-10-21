package com.zavum.timekeep.containers.containerInterfaces;

import java.util.Iterator;

/**
 * Created by dakfu on 7/16/2017.
 */

public interface ObjectContainer {
    public void addItem(Object object);
    public void removeItem(Object object);
    public Iterator getIter();
}
