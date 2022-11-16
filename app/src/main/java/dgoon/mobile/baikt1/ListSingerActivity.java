package dgoon.mobile.baikt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListSingerActivity extends AppCompatActivity {

    ListView lvSinger;
    ArrayList<Singer> arraySinger;
    SingerAdapter adapter;

    int vitri = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_singer);

        lvSinger = (ListView) findViewById(R.id.lvSinger);

        mapping();

        adapter = new SingerAdapter(this, R.layout.activity_item, arraySinger);
        lvSinger.setAdapter(adapter);

        ArrayAdapter adapter = new ArrayAdapter(
                ListSingerActivity.this,
                android.R.layout.simple_list_item_1,
                arraySinger
        );

//        lvSinger.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Singer course = arraySinger.get(position);
//                Intent intent = new Intent(ListSingerActivity.this, DetailActivity.class);
//
//                intent.putExtra("img", course.getImage());
//                intent.putExtra("playerName", course.getName());
//                intent.putExtra("detail", course.getDetail());
//
//                startActivity(intent);
//            }
//        });
    }

    private void mapping() {
        lvSinger = (ListView) findViewById(R.id.lvSinger);
        arraySinger = new ArrayList<>();

        arraySinger.add(new Singer("Nguyễn Thanh Tùng", "Sơn Tùng MTP" , "Việt Nam","*****",R.drawable.sontung));
        arraySinger.add(new Singer("Phương Tuấn", "J97" , "Việt Nam","*****",R.drawable.j97));
        arraySinger.add(new Singer("Phạm Dgoon", "Cọp Phú Yên" , "Việt Nam","*****",R.drawable.profile_img));
        arraySinger.add(new Singer("Lê Gia Hân", "Mèo Quảng Nam" ,"Việt Nam","*",R.drawable.han));
        arraySinger.add(new Singer("Nguyễn Minh Danh", "Danh làm hết", "Việt Nam","*****",R.drawable.danh));
    }
}