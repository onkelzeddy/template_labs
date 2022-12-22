package org.example;

public class Scriptwriter {
    private actor actor = new actor();
    int writeScript(){
        int script = 0;
        for(int i=0;i < 100;i++){
            script += 1;
        }
        System.out.println("Сценарист написал сценарий!");
        return script;
    }
}
