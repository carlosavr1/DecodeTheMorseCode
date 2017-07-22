package com.codewars;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by carlvarn on 20/07/2017.
 */
public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        String response = "";
        response = Stream.of(morseCode.trim().split("   ")).map(x -> Stream.of(x.split(" ")).map(y -> MorseCode.get(y)).collect(Collectors.joining(""))).collect(Collectors.joining(" "));
        return response.trim();
    }

}
