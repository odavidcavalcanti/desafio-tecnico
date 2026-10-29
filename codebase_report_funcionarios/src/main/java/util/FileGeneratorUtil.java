package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileGeneratorUtil {

    public void generateFile(String output) {
        Path path = Path.of("output", "arquivo_funcionarios.txt");

        try {
            if (path.getParent() != null) {
                Files.createDirectories(path.getParent());
            }
            Files.writeString(path, output);

        } catch (IOException e) {
            throw new RuntimeException("Erro ao gerar arquivo: " + e.getMessage());
        }
    }
}
