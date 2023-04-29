package project_04.Modeller.Departmanlar;

public class YonetimDepartmani implements Departman {

    final String departmanKodu = "YD";

    // Zam oranini belirlemeyi unutmayalim.
    final int zamOrani = 25;

    @Override
    public int getZamOrani() {
        return zamOrani;
    }

    @Override
    public String getDepartmanKodu() {
        return departmanKodu;
    }
}
