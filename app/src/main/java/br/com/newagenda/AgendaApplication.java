package br.com.newagenda;

import android.app.Application;

import br.com.newagenda.dao.AlunoDAO;
import br.com.newagenda.model.Aluno;

@SuppressWarnings("ALL")
public class AgendaApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        AlunoDAO dao = new AlunoDAO();
        criaAlunosDeTeste(dao);

    }

    private void criaAlunosDeTeste(AlunoDAO dao) {
        dao.salva(new Aluno("José Arlan", "984350068", "ze_harlan@icloud.com"));
        dao.salva(new Aluno("Fran", "984350068", "fran@gmail.com"));
    }
}
