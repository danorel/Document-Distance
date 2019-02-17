package finder;

import algo.Algorithm;
import file.FileManager;

import java.io.File;
import java.util.*;

public class Finder {
    public static String makeQuery(String path, String query){
        FileManager.createFile(path + "/result.txt");
        File folder = new File(path);
        ArrayList<String> results = new ArrayList<>();
        List<File> files = Arrays.asList(Objects.requireNonNull(folder.listFiles()));
        files
                .forEach(file -> {
                    results.add(file.getName() + " " + Algorithm.getSimilarityRate(query, FileManager.readFile(file.getPath())));
                });
        StringBuilder content = new StringBuilder();
        StringBuilder finalContent = content;
        results
                .forEach(result -> finalContent.append(result).append("\n"));
        FileManager.writeFile(path + "/result.txt", content.toString());
        content = new StringBuilder(sortedResults(FileManager.readFile(path + "/result.txt")));
        FileManager.writeFile(path + "/result.txt", content.toString());
        return content.toString();
    }

    private static String sortedResults(String unsortedContent){
        List<String> list = Arrays.asList(unsortedContent.split("[%\n ]"));
        List<Double> values = new ArrayList<>();
        for(int index = 0; index < list.size(); index++){
            if(index % 4 == 1) values.add(Double.valueOf(list.get(index)));
        }
        Collections.sort(values, (first, second) -> (int)(second - first));
        StringBuilder sortedContent = new StringBuilder();
        for(int index = 0; index < list.size(); index++){
            if(index % 4 == 0) sortedContent.append(values.get(index / 4)).append("%").append(" ").append(list.get(index)).append("\n");
        }
        return sortedContent.toString();
    }
}
