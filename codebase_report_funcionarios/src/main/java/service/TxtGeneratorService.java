package service;

import dao.FuncionarioDao;
import model.Funcionario;
import util.FileGeneratorUtil;

public class TxtGeneratorService {
    private final FuncionarioDao funcionarioDao;
    private final FileGeneratorUtil fileGeneratorUtil;

    public TxtGeneratorService() {
        this.funcionarioDao = new FuncionarioDao();
        this.fileGeneratorUtil = new FileGeneratorUtil();
    }

    public void generateTxt() {
        try {
            StringBuilder text = new StringBuilder();

            for (Funcionario funcionario : funcionarioDao.getAllFuncionarios()) {
                text.append(funcionario.toString());
                text.append("\n");
            }

            fileGeneratorUtil.generateFile(text.toString());
        } catch (Exception e) {
            throw new RuntimeException("Erro ao gerar txt: " + e);
        }
    }
}
