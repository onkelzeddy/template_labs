package org.example;

public class filmDirector {

    int shootScenes(int actorActing){
        int readyScenes = 0;
        if(actorActing > 0){
            readyScenes = actorActing;
        }
        System.out.println("Сцены сняты!");
        return readyScenes;
    }

}
