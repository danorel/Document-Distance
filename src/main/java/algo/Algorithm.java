package algo;

import java.util.*;
import java.util.function.BiFunction;

public class Algorithm {
    public static double getSimilarityRate(String document1, String document2){
        return calculateVectorMultiplication(clearDocument(document1), clearDocument(document2));
    }

    private static String clearDocument(String content){
        return content.replaceAll("[?,.!\"\'%$#@*()-+]", " ");
    }

    private static double calculateVectorMultiplication(String document1, String document2){
        Hashtable<String, Integer> frequency = new Hashtable<>();
        List<String> firstDocumentWords = Arrays.asList(document1.split(" "));
        List<String> secondDocumentWords = Arrays.asList(document2.split(" "));
        Vector<String> vector = new Vector<>(firstDocumentWords);
        vector
                .forEach(firstDocumentWord -> {
                    int counter = (int) secondDocumentWords.stream().filter(firstDocumentWord::equals).count();
                    frequency.put(firstDocumentWord, counter);
                });
        frequency
                .forEach((key, value) -> System.out.println(key + "->" + value));
        return 0.0;
    }
}
