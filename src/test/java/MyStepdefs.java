import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class MyStepdefs {
    @Dado("que eu tenho uma calculadora")
    public void queEuTenhoUmaCalculadora() {
    }

    @Quando("eu somo {int} e {int}")
    public void euSomoE(int arg0, int arg1) {
    }

    @Então("o resultado deve ser {int}")
    public void oResultadoDeveSer(int arg0) {
    }
}
