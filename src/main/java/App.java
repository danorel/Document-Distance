import algo.Algorithm;
import file.FileManager;

public class App {
    public static void main(String[] args) {
        FileManager.createFile("data/doc-1.txt");
        FileManager.writeFile("data/doc-1.txt", "Text is approximately the same as in doc-2.txt!");
        FileManager.createFile("data/doc-2.txt");
        FileManager.writeFile("data/doc-2.txt", "Text is approximately the same as in doc-1.txt?");
        System.out.println(Algorithm.getSimilarityRate(FileManager.readFile("data/doc-1.txt"), FileManager.readFile("data/doc-2.txt")));
    }
}
