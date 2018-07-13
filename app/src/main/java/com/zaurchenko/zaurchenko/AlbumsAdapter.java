package com.zaurchenko.zaurchenko;

import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

/**
 * Created by Mr Nersesyan on 13/07/2018.
 */

public class AlbumsAdapter extends RecyclerView.Adapter <AlbumsAdapter.ViewHolder> {
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_album, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //todo add item parameter in bind method
        holder.bind();
    }

    @Override
    public int getItemCount() {
        //todo return correct count
        return 8;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private SimpleDraweeView image;
        private TextView albumTitleTextView;
        private TextView photoCountTextView;
        private ImageView lock;

        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.album_main_image);
            albumTitleTextView = itemView.findViewById(R.id.album_title);
            photoCountTextView = itemView.findViewById(R.id.album_image_count);
            lock = itemView.findViewById(R.id.lock_imageView);
        }

        private void bind () {
            //sample url
            image.setImageURI("http://bomdia.eu/luxemburgo/wp-content/uploads/sites/7/2015/07/grand-place-night.jpg");
        }
    }
}
