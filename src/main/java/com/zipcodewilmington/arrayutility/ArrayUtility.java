package com.zipcodewilmington.arrayutility;

import java.lang.reflect.Array;
import java.util.Arrays;

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

    public T[] mergeWithArray(T[] mergingArray)
    {
        T[] result = Arrays.copyOf(array, array.length + mergingArray.length);
        System.arraycopy(mergingArray, 0, result, array.length, mergingArray.length);
        return result;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate)
    {
        Integer occurrences = 0;
        T[] merged = mergeWithArray(arrayToMerge);

        for(T element : merged)
        {
            if(element.equals(valueToEvaluate))
            {
                occurrences++;
            }
        }

        return occurrences;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge)
    {
        T[] merged = mergeWithArray(arrayToMerge);
        T mostCommon = null;
        Integer occurrencesOfMostCommon = 0;

        for(Integer i = 0; i < merged.length; i++)
        {
            T currentlyEvaluating = merged[i];
            Integer occurrences = 0;
            for(Integer k = 0; k < merged.length; k++)
            {
                if(merged[i].equals(merged[k]))
                {
                    occurrences++;
                }
            }
            if(occurrences > occurrencesOfMostCommon)
            {
                occurrencesOfMostCommon = occurrences;
                mostCommon = currentlyEvaluating;
            }
        }

        return mostCommon;
    }

    public T[] removeValue(T valueToRemove)
    {
//        T[] = new T[0];
        return array;
    }
}
