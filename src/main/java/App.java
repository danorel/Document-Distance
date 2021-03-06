import algo.Algorithm;
import file.FileManager;
import finder.Finder;

public class App {
    public static void main(String[] args) {
        // Testing the files with similar content
        FileManager.createFile("data/similar/doc-1.txt");
        FileManager.writeFile("data/similar/doc-1.txt", "Text is approximately the same as in doc-2.txt!");
        FileManager.createFile("data/similar/doc-2.txt");
        FileManager.writeFile("data/similar/doc-2.txt", "Text is approximately the same as in doc-1.txt?");
        FileManager.createFile("data/output/similar/result.txt");
        FileManager.writeFile("data/output/similar/result.txt", Algorithm.getSimilarityRate(FileManager.readFile("data/similar/doc-1.txt"), FileManager.readFile("data/similar/doc-2.txt")));
        // Testing the files with non-similar content
        FileManager.createFile("data/non-similar/doc-1.txt");
        FileManager.writeFile("data/non-similar/doc-1.txt", "Text is very different from the second one! Don't know why?");
        FileManager.createFile("data/non-similar/doc-2.txt");
        FileManager.writeFile("data/non-similar/doc-2.txt", "Woohoo, such an non-traditional text. This is awesome!");
        FileManager.createFile("data/output/non-similar/result.txt");
        FileManager.writeFile("data/output/non-similar/result.txt", Algorithm.getSimilarityRate(FileManager.readFile("data/non-similar/doc-1.txt"), FileManager.readFile("data/non-similar/doc-2.txt")));
        // Testing the files with identical content
        FileManager.createFile("data/identical/doc-1.txt");
        FileManager.writeFile("data/identical/doc-1.txt", "" +
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed eu odio cursus, tristique eros dapibus, pharetra ligula. Integer accumsan, nisl sed tempor efficitur, nisi lorem consequat felis, non hendrerit ligula odio vitae arcu. Vestibulum posuere lobortis dui ornare pretium. Integer sagittis ullamcorper diam, eu convallis leo egestas at. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Morbi id lacinia erat. Vivamus ligula arcu, convallis a tellus quis, tempor sollicitudin leo. Nunc at sapien enim. Sed aliquet, lectus sit amet bibendum malesuada, sem sapien consectetur metus, id viverra massa turpis quis massa. Proin convallis dapibus ex, nec convallis lorem lacinia et. Nam dictum erat a magna euismod fermentum. Maecenas lobortis massa id tortor imperdiet euismod. Maecenas in mauris eget felis fringilla cursus. Nulla facilisi. Ut ante ante, vestibulum sit amet ligula non, posuere pellentesque quam.\n" +
                "\n" +
                "Pellentesque ornare tellus at finibus condimentum. Cras posuere a urna nec ultricies. Suspendisse a metus ut leo blandit luctus nec in tortor. Pellentesque laoreet quam quis accumsan consequat. Sed fringilla luctus malesuada. Nulla elementum velit velit, sed ultrices neque porta in. Nunc hendrerit felis vel mattis tincidunt. Maecenas interdum purus eget quam fermentum cursus. Maecenas et molestie dolor. Fusce sed consectetur tortor. Sed tempor pretium dui gravida aliquet.\n" +
                "\n" +
                "Proin posuere purus vel vestibulum fringilla. Sed ornare, nunc a eleifend mattis, diam metus aliquet ipsum, porttitor interdum justo elit id lacus. Suspendisse potenti. Nunc vel magna ac magna suscipit posuere eu vitae dui. Nam nec malesuada tellus. In vel dolor luctus, pretium risus eget, lacinia justo. Vivamus arcu tellus, tempor vitae libero sit amet, placerat faucibus quam. Duis quis pulvinar metus. Pellentesque sed tortor eros. Curabitur interdum augue a rutrum gravida. Vestibulum non blandit risus, nec fringilla eros. Aliquam imperdiet mattis vulputate. In consectetur, justo ac gravida auctor, nisi nunc elementum tortor, eu commodo turpis quam nec felis. Nunc viverra ex id auctor pretium. Morbi fringilla eu neque ac vulputate.\n" +
                "\n" +
                "Vivamus dapibus nec purus at consectetur. Aliquam sit amet dignissim nibh, sed sollicitudin tortor. Quisque viverra nibh nec nulla dictum, at ornare lectus varius. Nulla a elit eget augue dignissim consectetur. Curabitur fermentum ante nec neque imperdiet maximus. Ut quam nisl, fermentum in nibh sit amet, sagittis cursus nibh. Quisque ornare sollicitudin turpis. Proin laoreet sem vitae volutpat euismod. Interdum et malesuada fames ac ante ipsum primis in faucibus. Aliquam sit amet libero vel ex fringilla scelerisque. Mauris sed sagittis lacus, vel aliquam tellus. Aliquam augue dui, suscipit tempor ante a, luctus hendrerit libero. Donec feugiat varius sapien, in mollis ligula gravida eget. Mauris vel tellus consectetur, vulputate magna id, fringilla urna. Aliquam mattis maximus urna, ac sagittis metus mollis et.\n" +
                "\n" +
                "Integer efficitur dolor et augue aliquam, volutpat lobortis libero mollis. Vestibulum posuere nisl ac aliquet ornare. Vivamus felis magna, fringilla eget odio vel, laoreet scelerisque est. In bibendum turpis vel pharetra malesuada. Proin sit amet leo quis velit porttitor fermentum. In enim dolor, commodo vitae mi a, rhoncus dictum justo. Nullam accumsan arcu nec metus malesuada luctus.");
        FileManager.createFile("data/identical/doc-2.txt");
        FileManager.writeFile("data/identical/doc-2.txt", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed eu odio cursus, tristique eros dapibus, pharetra ligula. Integer accumsan, nisl sed tempor efficitur, nisi lorem consequat felis, non hendrerit ligula odio vitae arcu. Vestibulum posuere lobortis dui ornare pretium. Integer sagittis ullamcorper diam, eu convallis leo egestas at. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Morbi id lacinia erat. Vivamus ligula arcu, convallis a tellus quis, tempor sollicitudin leo. Nunc at sapien enim. Sed aliquet, lectus sit amet bibendum malesuada, sem sapien consectetur metus, id viverra massa turpis quis massa. Proin convallis dapibus ex, nec convallis lorem lacinia et. Nam dictum erat a magna euismod fermentum. Maecenas lobortis massa id tortor imperdiet euismod. Maecenas in mauris eget felis fringilla cursus. Nulla facilisi. Ut ante ante, vestibulum sit amet ligula non, posuere pellentesque quam.\n" +
                "\n" +
                "Pellentesque ornare tellus at finibus condimentum. Cras posuere a urna nec ultricies. Suspendisse a metus ut leo blandit luctus nec in tortor. Pellentesque laoreet quam quis accumsan consequat. Sed fringilla luctus malesuada. Nulla elementum velit velit, sed ultrices neque porta in. Nunc hendrerit felis vel mattis tincidunt. Maecenas interdum purus eget quam fermentum cursus. Maecenas et molestie dolor. Fusce sed consectetur tortor. Sed tempor pretium dui gravida aliquet.\n" +
                "\n" +
                "Proin posuere purus vel vestibulum fringilla. Sed ornare, nunc a eleifend mattis, diam metus aliquet ipsum, porttitor interdum justo elit id lacus. Suspendisse potenti. Nunc vel magna ac magna suscipit posuere eu vitae dui. Nam nec malesuada tellus. In vel dolor luctus, pretium risus eget, lacinia justo. Vivamus arcu tellus, tempor vitae libero sit amet, placerat faucibus quam. Duis quis pulvinar metus. Pellentesque sed tortor eros. Curabitur interdum augue a rutrum gravida. Vestibulum non blandit risus, nec fringilla eros. Aliquam imperdiet mattis vulputate. In consectetur, justo ac gravida auctor, nisi nunc elementum tortor, eu commodo turpis quam nec felis. Nunc viverra ex id auctor pretium. Morbi fringilla eu neque ac vulputate.\n" +
                "\n" +
                "Vivamus dapibus nec purus at consectetur. Aliquam sit amet dignissim nibh, sed sollicitudin tortor. Quisque viverra nibh nec nulla dictum, at ornare lectus varius. Nulla a elit eget augue dignissim consectetur. Curabitur fermentum ante nec neque imperdiet maximus. Ut quam nisl, fermentum in nibh sit amet, sagittis cursus nibh. Quisque ornare sollicitudin turpis. Proin laoreet sem vitae volutpat euismod. Interdum et malesuada fames ac ante ipsum primis in faucibus. Aliquam sit amet libero vel ex fringilla scelerisque. Mauris sed sagittis lacus, vel aliquam tellus. Aliquam augue dui, suscipit tempor ante a, luctus hendrerit libero. Donec feugiat varius sapien, in mollis ligula gravida eget. Mauris vel tellus consectetur, vulputate magna id, fringilla urna. Aliquam mattis maximus urna, ac sagittis metus mollis et.\n" +
                "\n" +
                "Integer efficitur dolor et augue aliquam, volutpat lobortis libero mollis. Vestibulum posuere nisl ac aliquet ornare. Vivamus felis magna, fringilla eget odio vel, laoreet scelerisque est. In bibendum turpis vel pharetra malesuada. Proin sit amet leo quis velit porttitor fermentum. In enim dolor, commodo vitae mi a, rhoncus dictum justo. Nullam accumsan arcu nec metus malesuada luctus.");
        FileManager.createFile("data/output/identical/result.txt");
        FileManager.writeFile("data/output/identical/result.txt", Algorithm.getSimilarityRate(FileManager.readFile("data/identical/doc-1.txt"), FileManager.readFile("data/identical/doc-2.txt")));
        Finder.makeQuery("data/database","cell phone");
    }
}
