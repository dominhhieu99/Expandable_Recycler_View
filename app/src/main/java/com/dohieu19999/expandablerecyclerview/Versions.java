package com.dohieu19999.expandablerecyclerview;

public class Versions {
    private String codeName, version, apilevar, description;
    private Boolean expandable;

    public Versions(String codeName, String version, String apilevar, String description) {
        this.codeName = codeName;
        this.version = version;
        this.apilevar = apilevar;
        this.description = description;
        this.expandable = false;
    }

    public Boolean getExpandable() {
        return expandable;
    }

    public void setExpandable(Boolean expandable) {
        this.expandable = expandable;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getApilevar() {
        return apilevar;
    }

    public void setApilevar(String apilevar) {
        this.apilevar = apilevar;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Versions{" +
                "codeName='" + codeName + '\'' +
                ", version='" + version + '\'' +
                ", apilevar='" + apilevar + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
