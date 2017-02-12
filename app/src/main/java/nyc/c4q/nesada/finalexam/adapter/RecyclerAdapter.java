package nyc.c4q.nesada.finalexam.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import nyc.c4q.nesada.finalexam.R;
import nyc.c4q.nesada.finalexam.Settings;

/**
 * Created by NesadaKoca on 2/12/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    ArrayList<String> arrayList = new ArrayList();
    int[] imgList = {R.drawable.heart, R.drawable.sms, R.drawable.contact, R.drawable.logout};

    public RecyclerAdapter(ArrayList<String> arrayList, int[] imgList) {
        this.arrayList = arrayList;
        this.imgList = imgList;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
        RecyclerViewHolder viewHolder = new RecyclerViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        holder.mTextView.setText(arrayList.get(position));
        holder.mImageView.setImageResource(imgList[position]);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    public static class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView mTextView;
        ImageView mImageView;

        public RecyclerViewHolder(View view) {
            super(view);

            mTextView = (TextView) view.findViewById(R.id.tx_item);
            mImageView = (ImageView) view.findViewById(R.id.img_item);

            mTextView.setOnClickListener(this);


        }

        @Override
        public void onClick(View view) {

            switch (getAdapterPosition()) {

                case 0:
                    Toast.makeText(view.getContext(), "Selected Heart Activity", Toast.LENGTH_SHORT).show();
                    break;
                case 1:
                    Toast.makeText(view.getContext(), "Selected Message Activity", Toast.LENGTH_SHORT).show();
                    break;
                case 2:
                    Intent settings = new Intent(view.getContext(), Settings.class);
                    view.getContext().startActivity(settings);
                    break;
                case 3:
                    Toast.makeText(view.getContext(), "Selected Logout Activity", Toast.LENGTH_SHORT).show();
                    System.exit(0);
                    break;

            }



        }
    }

}
