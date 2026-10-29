package controller;

import service.TxtGeneratorService;

public class TxtGeneratorController {
    private final TxtGeneratorService txtGeneratorService;

    public TxtGeneratorController() {
        this.txtGeneratorService = new TxtGeneratorService();
    }

    public void processFileGeneration() {
        txtGeneratorService.generateTxt();
    }
}
