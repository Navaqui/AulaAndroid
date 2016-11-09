package fabricadeprogramador.com.br.aulaandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by crisnfp on 05/11/16.
 */
public class MenuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.bt_calculadora)
    public void calculadora(){
        Intent irCalculadora = new Intent(MenuActivity.this,CalculadoraActivity.class);
        startActivity(irCalculadora);
    }
    @OnClick(R.id.bt_agenda)
    public void agenda(){
        Intent irAgenda = new Intent(MenuActivity.this, AgendaActivity.class);
        startActivity(irAgenda);
    }
}
