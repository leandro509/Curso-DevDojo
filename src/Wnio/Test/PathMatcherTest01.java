package Wnio.Test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path01 = Paths.get("pasta/subpasta/file.bkp");
        Path path02 = Paths.get("pasta/subpasta/file.txt");
        Path path03 = Paths.get("pasta/subpasta/file.java");
        matches(path01, "glob:*.bkp");
        matches(path01, "glob:**/*.bkp");
        matches(path01, "glob:**/*.{bkp,java,txt}");
        matches(path02, "glob:**/*.{bkp,java,txt}");
        matches(path03, "glob:**/*.{bkp,java,txt}");
        matches(path01, "glob:**/*.???");
        matches(path02, "glob:**/*.???");
        matches(path03, "glob:**/*.???");
        matches(path03, "glob:**/file.????");
    }
    private static void matches(Path path, String glob) {
        //glob seria uma versao simplificado do regex
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " +  matcher.matches(path));
    }
}
