package com.satyam.recyclerviewexample;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.GmailVH> {
    public RecyclerAdapter() {
    }

    @Override
    public GmailVH onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.single_listitem, viewGroup, false);
        return new GmailVH(view);
    }

    @Override
    public void onBindViewHolder(GmailVH gmailVH, int i) {
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public class GmailVH extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgtitle, imgcalltype;

        public GmailVH(View itemView) {
            super(itemView);
            //  imgtitle=(ImageView) itemView.findViewById(R.id.imgtitle);
        }

        @Override
        public void onClick(View v) {

        }
    }
}