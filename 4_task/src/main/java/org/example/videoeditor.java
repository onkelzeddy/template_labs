package org.example;

public class videoeditor {

    int montageScens(int filmedScenes){
        int readyForEffectsScenes = 0;
        if(filmedScenes > 0){
            readyForEffectsScenes = filmedScenes;
        }
        System.out.println("Сцены монтажены монтажером!");
        return readyForEffectsScenes;
    }

    int makeEffects(int readyForEfffectsScenes){
        int effectedScenes = 0;
        int film = 0;
        if(readyForEfffectsScenes > 0){
            effectedScenes = readyForEfffectsScenes;
        }
        if (effectedScenes > 0){
            film = 1;
        }
        System.out.println("Эффекты наложены и фильм готов к прокату!");

        return film;

    }

}
