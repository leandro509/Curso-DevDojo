package Wnio.Test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path arquivoZip = Paths.get("pasta3/arquivo.zip");
        Path arquivosParaZipar = Paths.get("pasta3/subpasta/subsubpasta");
        zip(arquivoZip, arquivosParaZipar);
    }
    private static void zip(Path arquivoZip, Path arquivosParaZipar) {
        try(ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosParaZipar)) {
            for(Path file : directoryStream) {
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());//1 passo, vou mandar esse arquivo
                zipStream.putNextEntry(zipEntry);//coloque essa proxima entrada
                Files.copy(file, zipStream);//copia o que tem no arquivo antes de zipar
                zipStream.closeEntry();
            }
            System.out.println("Arquivo criado com sucesso!");
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
