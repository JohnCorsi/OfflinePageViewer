package enums;

/**
 *
 * @author JOTA
 */
public enum FrequenciaAudio {
    _22050HZ("22.050 Hz"),
    _44100HZ("44.100 Hz");
    
    private final String descricao;
    
    FrequenciaAudio(String descricao){
        this.descricao = descricao;
    }
}