package org.example;

public class filmingProcess {
    private Scriptwriter scriptwriter = new Scriptwriter();
    private actor actor = new actor();
    private filmDirector dir = new filmDirector();
    private  videoeditor vid = new videoeditor();
    private producer prod = new producer();
    public void start() {
        int script = scriptwriter.writeScript();
        boolean scriptReaded =  actor.readScript(script);
        int readyScenes = dir.shootScenes(actor.act(scriptReaded));
        int montScenes = vid.montageScens(readyScenes);
        int film = vid.makeEffects(montScenes);
        prod.procFilm(film);

    }
}
