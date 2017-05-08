package liujianrui.bawei.com.checbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {

    private CheckBox ch1;
    private Button but1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ch1 = (CheckBox) findViewById(R.id.ch);

        ch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked==true) {

                    Log.v("aaa", "read is checked");
                } else {
                    Log.v("aaa", "read is unchecked");
                }
            }
        });

        but1 = (Button) findViewById(R.id.but);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ch1.setChecked(true);
            }
        });

    }
}
