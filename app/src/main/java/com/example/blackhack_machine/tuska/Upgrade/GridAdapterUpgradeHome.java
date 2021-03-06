package com.example.blackhack_machine.tuska.Upgrade;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.blackhack_machine.tuska.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class GridAdapterUpgradeHome extends BaseAdapter {

    Context context;
    private final String [] values;
    private final int[] images;
    View view;
    LayoutInflater layoutInflater;


    public GridAdapterUpgradeHome(Context context, String[] values, int[] images) {
        this.values = values;
        this.context = context;
        this.images = images;
    }


    @Override
    public int getCount() {
        return values.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
           if (convertView == null){
               view = new View(context);
               view = layoutInflater.inflate(R.layout.upgradehome_single_item, null);
               CircleImageView circleImageView = (CircleImageView) view.findViewById(R.id.imageGridUpgradeHome);
               TextView textView = (TextView) view.findViewById(R.id.gridTextUpgradeHome);
               circleImageView.setImageResource(images[position]);
               textView.setText(values[position]);

           }


        return view;
    }
}
