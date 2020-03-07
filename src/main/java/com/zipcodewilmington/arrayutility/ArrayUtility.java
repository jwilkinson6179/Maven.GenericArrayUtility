package com.zipcodewilmington.arrayutility;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {
    T[] array;

    public ArrayUtility(T[] array) {
        this.array = array;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate)
    {
        Integer occurrences = 0;

        for(T element : array)
        {
            if(element.equals(valueToEvaluate))
            {
                occurrences++;
            }
        }

        return occurrences;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate)
    {
        return null;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge)
    {
        return null;
    }

    public T[] removeValue(T valueToRemove)
    {
//        T[] = new T[0];
        return array;
    }
}
