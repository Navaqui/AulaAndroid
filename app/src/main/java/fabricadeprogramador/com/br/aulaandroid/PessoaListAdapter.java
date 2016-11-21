package fabricadeprogramador.com.br.aulaandroid;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by crisnfp on 10/11/16.
 */

public class PessoaListAdapter extends ArrayAdapter<Pessoa> {

    public PessoaListAdapter(Context context, List<Pessoa> pessoaList) {
        super(context, R.layout.item_pessoa_list, pessoaList);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final ViewHolder holder;

        if (convertView == null) {
            convertView = View.inflate(getContext(), R.layout.item_pessoa_list, null);
            holder = new ViewHolder();
            ButterKnife.bind(holder, convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Pessoa pessoa = getItem(position);
        if(pessoa != null){
            holder.itemTv.setText(pessoa.getNome());
            //holder.itemImg.setImageResource(pessoa.getImagem());
        }

        return convertView;
    }

    class ViewHolder {
        @Bind(R.id.item_img)
        ImageView itemImg;

        @Bind(R.id.item_tv)
        TextView itemTv;

    }
}
