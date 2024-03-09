package com.naman14.timber.timely.model;

import com.naman14.timber.timely.model.number.*;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;

public class NumberUtils {

    private static final Map<Integer, float[][]> numberMap = new HashMap<>();

    static {
        numberMap.put(-1, Null.getInstance().getControlPoints());
        numberMap.put(0, Zero.getInstance().getControlPoints());
        numberMap.put(1, One.getInstance().getControlPoints());
        numberMap.put(2, Two.getInstance().getControlPoints());
        numberMap.put(3, Three.getInstance().getControlPoints());
        numberMap.put(4, Four.getInstance().getControlPoints());
        numberMap.put(5, Five.getInstance().getControlPoints());
        numberMap.put(6, Six.getInstance().getControlPoints());
        numberMap.put(7, Seven.getInstance().getControlPoints());
        numberMap.put(8, Eight.getInstance().getControlPoints());
        numberMap.put(9, Nine.getInstance().getControlPoints());
    }

    public static float[][] getControlPointsFor(int start) {
        if (numberMap.containsKey(start)) {
            return numberMap.get(start);
        } else {
            throw new InvalidParameterException("Unsupported number requested");
        }
    }
}
