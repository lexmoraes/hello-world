package model;

public class RadioRelogio implements iModel.IRadio, iModel.IRelogio {
    public int horario;
    public int despertador;

    @Override
    public int getHorario() {
        return horario;
    }

    @Override
    public void setEmissora(String emissora) {

    }

    @Override
    public String getEmissora() {
        return "";
    }

    @Override
    public void setTipoEmissora(String tipoEmissora) {
    }

    @Override
    public String getTipoEmissora() {
        return "";
    }

    @Override
    public void setVolumeRadio(int volume) {

    }

    @Override
    public int getVolumeRadio() {
        return 0;
    }

    @Override
    public void setHorario(int horario) {

    }

    @Override
    public void setHorarioAlarme(int horarioAlarme) {

    }

    @Override
    public int getHorarioAlarme() {
        return 0;
    }

    @Override
    public void setVolumeRelogio(int volume) {

    }

    @Override
    public int getVolumeRelogio() {
        return 0;
    }

    @Override
    public void ligarAlarme() {

    }

    @Override
    public void desligarAlarme() {

    }
}
