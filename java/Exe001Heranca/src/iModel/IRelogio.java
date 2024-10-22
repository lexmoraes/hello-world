package iModel;

public interface IRelogio {
    public void setHorario(int horario);
    public int getHorario();
    public void setHorarioAlarme(int horarioAlarme);
    public int getHorarioAlarme();
    public void setVolumeRelogio(int volume);
    public int getVolumeRelogio();
    public void ligarAlarme();
    public void desligarAlarme();
}
