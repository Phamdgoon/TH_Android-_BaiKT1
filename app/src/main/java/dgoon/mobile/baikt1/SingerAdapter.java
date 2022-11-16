package dgoon.mobile.baikt1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SingerAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Singer> singerList;

    public SingerAdapter(Context context, int layout, List<Singer> singerList) {
        this.context = context;
        this.layout = layout;
        this.singerList = singerList;
    }

    @Override
    public int getCount() {
        return singerList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder {
        ImageView img ;
        TextView txtName, txtStageName, txtNational, txtStar;

    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder = new ViewHolder();
            // Ánh xạ View
            holder.txtName = (TextView) view.findViewById(R.id.name);
            holder.txtStageName  = (TextView) view.findViewById(R.id.stageName);
            holder.txtNational = (TextView) view.findViewById(R.id.national);
            holder.txtStar  = (TextView) view.findViewById(R.id.star);
            holder.img = (ImageView) view.findViewById(R.id.img);

            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        Singer course = singerList.get(i);

        holder.txtName.setText(course.getName());
        holder.txtStageName.setText(course.getStagename());
        holder.txtNational.setText(course.getNational());
        holder.txtStar.setText(course.getStar());
        holder.img.setImageResource(course.getImage());
        return view;
    }
}
