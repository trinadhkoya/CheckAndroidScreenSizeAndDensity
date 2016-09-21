package trinadhkoya.github.io;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.image);
        Utill utill = new Utill();
        utill.loadDisplayMetrics(getApplicationContext());
        imageView.getLayoutParams().height=utill.convertPxtoDp(102,getApplicationContext());
        imageView.getLayoutParams().width=utill.convertPxtoDp(102,getApplicationContext());



    }
}
