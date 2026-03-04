package Wnio.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        //Paths.get("pasta"); -- Equivale a new File(pasta);
        Path pastaPath = Paths.get("pasta3");
        if(Files.notExists(pastaPath)){
           Path pastaDirectory = Files.createDirectory(pastaPath);
        }
        Path subPastaPath = Paths.get("pasta3/subpasta/subsubpasta");
        Path pastaDirectory = Files.createDirectories(subPastaPath);
        Path filePath = Paths.get(subPastaPath.toString(),"file.txt");// Path com o arquivo que eu quero criar, file.txt

        if(Files.notExists(filePath)) {
            Path filePathCreated = Files.createFile(filePath);
        }

        Path source = filePath;//Origem
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

    }
}
