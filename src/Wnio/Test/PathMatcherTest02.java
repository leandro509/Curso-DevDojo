package Wnio.Test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;



class ListAllFiles2 extends SimpleFileVisitor<Path> {
    private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Test*}.{class,java}");

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        Path root = Paths.get(".");
        if(matcher.matches(file)) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }

}



public class PathMatcherTest02 {
    public static void main(String[] args) throws IOException {
        //procurar no diretorio maratonaJava todas os arquivos que tenha Test no name e .class ou .java
        Path root = Paths.get(".");
        Files.walkFileTree(root, new ListAllFiles2());


    }



}


