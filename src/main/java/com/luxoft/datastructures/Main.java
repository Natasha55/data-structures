package com.luxoft.datastructures;

import com.luxoft.datastructures.list.ArrayList;
import com.luxoft.datastructures.queue.ArrayQueue;
import com.luxoft.datastructures.stack.ArrayStack;

public class Main {

    public static void main(String[] args) {


        ArrayQueue <String> arrayQueue = new ArrayQueue<>();

        ArrayList arrayList = new ArrayList();

        ArrayStack arrayStack = new ArrayStack();

//        Method[] method  = arrayQueue.getClass().getMethods();
//
//        Arrays.stream(method).forEach(m -> System.out.println(m.getName()));

//        try {
//            Method dequeue = arrayQueue.getClass().getMethod("dequeue");
//            System.out.println(dequeue.getName());
//            System.out.println(dequeue.getDeclaredAnnotations());
//            System.out.println(dequeue.getExceptionTypes());
//            System.out.println(dequeue.getGenericReturnType());
//            System.out.println(dequeue.getGenericExceptionTypes());
//            System.out.println(dequeue.getGenericParameterTypes());
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//    }

    }
}
