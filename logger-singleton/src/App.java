import java.io.FileWriter;
import java.io.IOException;

class Logger {
    private static Logger instancia;

    private Logger() {}

    public static Logger getInstance() {
        if (instancia == null) {
            instancia = new Logger();
        }
        return instancia;
    }

    public void log(String mensagem) {
        try (FileWriter fw = new FileWriter("log.txt", true)) {
            fw.write(mensagem + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}