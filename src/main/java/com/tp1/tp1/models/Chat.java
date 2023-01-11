package com.tp1.tp1.models;

public class Chat extends Animal{

    public Chat(String nomAnimal) {
        super(nomAnimal, TypeAnimal.CHAT);
    }

    @Override
    public String getNomAnimal() {
        return "Chat";
    }
    
}
