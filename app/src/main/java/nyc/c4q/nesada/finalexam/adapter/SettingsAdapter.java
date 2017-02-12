package nyc.c4q.nesada.finalexam.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import nyc.c4q.nesada.finalexam.R;

/**
 * Created by Nesada on 2/12/2017.
 */

public class SettingsAdapter extends RecyclerView.Adapter<SettingsAdapter.SettingsViewHolder> {

    ArrayList<Integer> arrayList = new ArrayList();

    public SettingsAdapter(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;

    }

    @Override
    public SettingsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_settings, parent, false);
        SettingsViewHolder vHolder = new SettingsViewHolder(view);

        return vHolder;
    }

    @Override
    public void onBindViewHolder(SettingsViewHolder holder, int position) {

        holder.textView.setText("Setting " + arrayList.get(position));

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    public static class SettingsViewHolder extends RecyclerView.ViewHolder {

        TextView textView;


        public SettingsViewHolder(View view) {
            super(view);

            textView = (TextView) view.findViewById(R.id.tv_sett_item);


        }


    }
}
