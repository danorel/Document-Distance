package algo;

import java.util.*;

public class Algorithm {
    public static String getSimilarityRate(String document1, String document2){
        return getPercentageSimilarity(calculateSimilarityRate(clearDocument(document1), clearDocument(document2)));
    }

    private static String clearDocument(String content){
        return content.replaceAll("[?,.!\"\'%$#@*()-+]", "");
    }

    private static double calculateSimilarityRate(String document1, String document2){
        Hashtable<String, Integer> frequency = new Hashtable<>();
        List<String> firstDocumentWords = Arrays.asList(document1.split(" "));
        List<String> secondDocumentWords = Arrays.asList(document2.split(" "));
        firstDocumentWords
                .forEach(firstDocumentWord -> {
                    int counter = (int) secondDocumentWords.stream().filter(firstDocumentWord::equals).count();
                    frequency.put(firstDocumentWord, counter);
                });
        double []result = {0.0};
        for(Map.Entry<String, Integer> entry : frequency.entrySet()){
            result[0] += entry.getValue();
        }
        result[0] /= (firstDocumentWords.size());
        return result[0];
    }

    private static String getPercentageSimilarity(double result){
        return (result * 100) + "% similarity";
    }
}
