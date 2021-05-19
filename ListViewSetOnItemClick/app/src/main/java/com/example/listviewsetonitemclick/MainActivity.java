package com.example.listviewsetonitemclick;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    private List<One_msg> list = new ArrayList<>();
    private String[] res = {"设备1","设备2","设备3","设备4","设备5","设备6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv_one);
        BaseAdapter adapter = new One_adapter(this,list);
        lv.setAdapter(adapter);
        init();
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Bundle bundle = new Bundle();
                bundle.putString("shebei",res[position]);
                Intent intent =new Intent();
                intent.putExtras(bundle);
                intent.setClass(MainActivity.this,EmptyActivity.class);
                startActivity(intent);
            }
        });
    }
    //初始化数据源
    private void init() {
        for (int i=1;i<=6;i++){
            One_msg m = new One_msg(res[i-1]);
            //将Msg中的数据传给list
            list.add(m);
        }
    }
}