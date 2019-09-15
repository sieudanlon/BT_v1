package hieu.bt.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    public void initView(){
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        ArrayList<Data> arrayList = new ArrayList<>();
        arrayList.add(new Data(1,"Nguyen Hieu","1994","Ha Noi"));
        arrayList.add(new Data(2,"Nguyen Trung","1993","Ha Nam"));
        arrayList.add(new Data(3,"Nguyen Van","1992","Ha Tay"));
        arrayList.add(new Data(4,"Nguyen Thang","1991","Hai Duong"));
        arrayList.add(new Data(5,"Nguyen Dat","1995","Yen Bai"));
        arrayList.add(new Data(6,"Nguyen Duy","1996","Binh Noi"));
        arrayList.add(new Data(7,"Nguyen Hai","1997","Hung Yen"));

        Adapter_SV adapter_sv = new Adapter_SV(arrayList,getApplicationContext());
        recyclerView.setAdapter(adapter_sv);


    }
}
