package ru.mirea.task29;

import java.io.Serializable;
import java.util.Arrays;

public class CurrencyInfo implements Serializable{
    private static final long serialVersionUID = 1L;

    private String[] territoryInfo;
    private String[] resourcesInfo;
    private String[] diplomacyInfo;

    public CurrencyInfo(String[] territoryInfo, String[] resourcesInfo, String[] diplomacyInfo){
        this.territoryInfo = territoryInfo;
        this.resourcesInfo = resourcesInfo;
        this.diplomacyInfo = diplomacyInfo;
    }

    public String[] getTerritoryInfo() {
        return territoryInfo;
    }

    public void setTerritoryInfo(String[] territoryInfo) {
        this.territoryInfo = territoryInfo;
    }

    public String[] getResourcesInfo() {
        return resourcesInfo;
    }

    public void setResourcesInfo(String[] resourcesInfo) {
        this.resourcesInfo = resourcesInfo;
    }

    public String[] getDiplomacyInfo() {
        return diplomacyInfo;
    }

    public void setDiplomacyInfo(String[] diplomacyInfo) {
        this.diplomacyInfo = diplomacyInfo;
    }

    @Override
    public String toString() {
        return "SavedGame{" +
                "territoryInfo=" + Arrays.toString(territoryInfo) +
                ",\nresourcesInfo=" + Arrays.toString(resourcesInfo) +
                ",\ndiplomacyInfo=" + Arrays.toString(diplomacyInfo) +
                '}';
    }
}
