package org.example;

public class actor {

    boolean readScript(int script){
        int scriptKnowlage = 0;
        if(script == 100){
            scriptKnowlage = script;
            System.out.println("Актер прочитал сценарий!");
            return true;
        }
        System.out.println("Актер не прочитал сценарий!");
        return false;
    }
    int act(boolean scriptWellKnown){
        int playedScens = 0;
        System.out.println("Актер играет!");
        if(scriptWellKnown){
            for(int i = 0; i < 139; i++){
                playedScens += 1;
            }
        }
        System.out.println("Актер сыграл свои сцены!");
        return playedScens;
    }

}
