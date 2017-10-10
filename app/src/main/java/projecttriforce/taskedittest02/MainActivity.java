package projecttriforce.taskedittest02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    //着手日をタップした時
    public void DateTapped(View view) {
        Intent intent = new Intent(this, projecttriforce.taskedittest02.DatePickerT.class);
        //完全修飾名でないとできないかも
        startActivity(intent);
        //アクティビティを起動
    }

    public void Get(View view){
        Intent intent = getIntent();
        String str = intent.getStringExtra("DateOK");
        TextView txt = (TextView)findViewById(R.id.StarDate02);
        TextView txt1 = (TextView)findViewById(R.id.DeadDate);
        txt.setText(str);
        txt1.setText(str);
    }


}
