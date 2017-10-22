package projecttriforce.taskedittest02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    //着手日をタップした時
    public void DateTapped(View view) {
        Intent intent = new Intent(this, projecttriforce.taskedittest02.DatePickerT.class);
        startActivity(intent);

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
