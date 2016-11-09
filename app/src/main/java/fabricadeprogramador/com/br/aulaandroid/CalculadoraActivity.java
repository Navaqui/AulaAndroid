package fabricadeprogramador.com.br.aulaandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CalculadoraActivity extends Activity {

    @Bind(R.id.ed1)
    EditText ed1;

    @Bind(R.id.ed2)
    EditText ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.bt_soma)
    public void somar(){
        Double n1 = Double.parseDouble(ed1.getText().toString());
        Double n2 = Double.parseDouble(ed2.getText().toString());
        Double soma = n1 + n2;
        Intent irParaResultado = new Intent(CalculadoraActivity.this, ResultadoActivity.class);

        Bundle bundle = new Bundle();
        bundle.putDouble("resultado", soma);

        irParaResultado.putExtras(bundle);
        startActivity(irParaResultado);
    }

    @OnClick(R.id.bt_sub)
    public void subtrair(){
        Double n1 = Double.parseDouble(ed1.getText().toString());
        Double n2 = Double.parseDouble(ed2.getText().toString());
        Double sub = n1 - n2;
        Intent irParaResultado = new Intent(CalculadoraActivity.this, ResultadoActivity.class);

        Bundle bundle = new Bundle();
        bundle.putDouble("resultado", sub);

        irParaResultado.putExtras(bundle);
        startActivity(irParaResultado);

    }
    @OnClick(R.id.bt_mult)
    public void multiplicar(){
        Double n1 = Double.parseDouble(ed1.getText().toString());
        Double n2 = Double.parseDouble(ed2.getText().toString());
        Double mult = n1 * n2;
        Intent irParaResultado = new Intent(CalculadoraActivity.this, ResultadoActivity.class);

        Bundle bundle = new Bundle();
        bundle.putDouble("resultado", mult);

        irParaResultado.putExtras(bundle);
        startActivity(irParaResultado);

    }
    @OnClick(R.id.bt_div)
    public void dividir(){
        Double n1 = Double.parseDouble(ed1.getText().toString());
        Double n2 = Double.parseDouble(ed2.getText().toString());
        Double div = n1 / n2;
        Intent irParaResultado = new Intent(CalculadoraActivity.this, ResultadoActivity.class);

        Bundle bundle = new Bundle();
        bundle.putDouble("resultado", div);

        irParaResultado.putExtras(bundle);
        startActivity(irParaResultado);

    }
}
