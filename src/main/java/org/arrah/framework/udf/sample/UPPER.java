package org.arrah.framework.udf.sample;

import org.arrah.framework.udf.MapUdf;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A sample UDF to show how to implement custom to-upper function.
 * It takes maps of String as input and calls String::toUpperCase on each element
 * and returns the List on String with upper case text
 */
public class UPPER extends MapUdf<String> {


    @Override
    public List<String> eval(ArrayList<Object> input) {
        ArrayList<String> outputList = new ArrayList<>(input.size());
        return input.stream().map(e -> {return ((String)e).toUpperCase();}).collect(Collectors.toList());
    }
}
