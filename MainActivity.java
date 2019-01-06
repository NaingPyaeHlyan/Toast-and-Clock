package mm.com.fairway.hellotoast;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import org.w3c.dom.Text;


import static android.widget.Toast.*;

public class MainActivity<textVeiw> extends AppCompatActivity {
    private int mCount=0;
    private TextView mShowCount;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView)findViewById(R.id.txtZero);
        findViewById(R.id.txtTime);
    }
    public void showToast(View view){
        Toast toast = Toast.makeText(this, R.string.toast_message, LENGTH_LONG);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if(mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void unCount(View view) {
        mCount--;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

    }

}

