package com.maximiliano.lira.tareamultimedios.adater;

/**
 * Created by max on 19-12-14.
 */
import com.maximiliano.lira.tareamultimedios.R;
import com.maximiliano.lira.tareamultimedios.app.AppController;
import com.maximiliano.lira.tareamultimedios.model.Parser;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

public class CustomListAdapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<Parser> parserItems;
    ImageLoader imageLoader = AppController.getInstance().getImageLoader();

    public CustomListAdapter(Activity activity, List<Parser> parserItems) {
        this.activity = activity;
        this.parserItems = parserItems;
    }

    @Override
    public int getCount() {
        return parserItems.size();
    }

    @Override
    public Object getItem(int location) {
        return parserItems.get(location);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.list_row, null);

        if (imageLoader == null)
            imageLoader = AppController.getInstance().getImageLoader();
        NetworkImageView thumbNail = (NetworkImageView) convertView
                .findViewById(R.id.thumbnail);
        TextView title = (TextView) convertView.findViewById(R.id.title);
        TextView rating = (TextView) convertView.findViewById(R.id.points);


        // getting movie data for the row
        Parser m = parserItems.get(position);

        // thumbnail image
        thumbNail.setImageUrl(m.getThumbnailUrl(), imageLoader);

        // title
        title.setText(m.getTitle());

        // rating
        rating.setText(String.valueOf(m.getPoints()));



        return convertView;
    }

}
