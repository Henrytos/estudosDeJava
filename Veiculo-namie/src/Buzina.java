import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.*;

public class Buzina {

    private static Clip clip; // Declarar o Clip como uma variável de classe para que ele possa ser acessado em métodos diferentes

    public static void tocarBuzina() {
        try {
            // Carrega o arquivo de som da buzina
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(
                    Buzina.class.getResourceAsStream("/AfterDark.wav")
            );

            // Obtém o clip de áudio
            clip = AudioSystem.getClip();

            // Abre o arquivo de som no clip
            clip.open(audioInputStream);

            // Inicia a reprodução
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void pararBuzina() {
        if (clip != null && clip.isRunning()) {
            clip.stop(); // Pare a reprodução
            clip.close(); // Feche o clip
        }
    }
}