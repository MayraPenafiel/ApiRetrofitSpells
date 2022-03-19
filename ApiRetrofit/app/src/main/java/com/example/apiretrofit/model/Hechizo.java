package com.example.apiretrofit.model;

public class Hechizo {

//Atributos

    private String id;
    private String name;
    private String incantation;
    private String effect;
    private Boolean canBeVerbal;
    private String type;
    private String light;
    private String creator;

    //Metodos getter y setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIncantation() {
        return incantation;
    }

    public void setIncantation(String incantation) {
        this.incantation = incantation;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public Boolean getCanBeVerbal() {
        return canBeVerbal;
    }

    public void setCanBeVerbal(Boolean canBeVerbal) {
        this.canBeVerbal = canBeVerbal;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLight() {
        return light;
    }

    public void setLight(String light) {
        this.light = light;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    
}
