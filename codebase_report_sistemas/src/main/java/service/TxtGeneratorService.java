package service;

import dao.SistemaDao;
import model.Sistema;
import util.FileGeneratorUtil;

public class TxtGeneratorService {
    private final SistemaDao sistemaDao;
    private final FileGeneratorUtil fileGeneratorUtil;

    public TxtGeneratorService() {
        this.sistemaDao = new SistemaDao();
        this.fileGeneratorUtil = new FileGeneratorUtil();
    }

    public void generateTxt() {

        try {
            StringBuilder text = new StringBuilder();

            for (Sistema sistema : sistemaDao.getAllSistemas()) {
                text.append(sistema.toString());
                text.append("\n");
            }

            fileGeneratorUtil.generateFile(text.toString());
        } catch (Exception e) {
            throw new RuntimeException("Erro ao gerar txt: " + e);
        }
    }
}
