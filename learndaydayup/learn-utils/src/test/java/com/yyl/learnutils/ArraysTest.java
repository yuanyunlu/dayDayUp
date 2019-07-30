package com.yyl.learnutils;

import org.junit.Test;
import org.springframework.cglib.core.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysTest {

    @Test
    public void testArrays(){
        String[] myArray1 = { "Apple", "Banana", "Orange" };

//        List<String> myList0 = Arrays.asList(myArray1);
//        List<String> myList1 = Arrays.asList("Apple","Banana", "Orange");
//
//
//        Integer [] myArray = { 1, 2, 3 };
//        List myList = Arrays.asList(myArray);
//        System.out.println(myList.size());//1
//        System.out.println(myList.get(0));//数组地址值
//        System.out.println(myList.get(1));//报错：ArrayIndexOutOfBoundsException
//        Integer [] array=(Integer[]) myList.get(0);
//        System.out.println(array[0]);//1

//        Integer[] myArray2= { 1, 2, 3 };
//        List myList2 = Arrays.asList(myArray2);
//        myList2.add(4);//运行时报错：UnsupportedOperationException
//        myList2.remove(1);//运行时报错：UnsupportedOperationException
//        myList2.clear();//运行时报错：UnsupportedOperationException

    }

    public static void main(String[] args) {
        String[] myArray = { "Apple", "Banana", "Orange" };
//        System.out.println(arrayToList(myArray1));
//        System.out.println(arrayToList(myArray1).getClass());
//        List list = new ArrayList<>(Arrays.asList("a", "b", "c"))
        List<String> collect = Arrays.stream(myArray).collect(Collectors.toList());
        System.out.println(collect.getClass());
        int [] myArray2 = { 1, 2, 3 };
        List<Integer> collect1 = Arrays.stream(myArray2).boxed().collect(Collectors.toList());
        System.out.println(collect1.getClass());

        String[] str = { "Apple", "Banana", "Orange" };
        List<String> list = new ArrayList<String>();
    }



    public static  <T> List<T> arrayToList(final T[] array){
        final ArrayList<T> arrayList = new ArrayList<T>(array.length);
        for (T t : array) {
            arrayList.add(t);
        }
        return  (arrayList);
    }
}
