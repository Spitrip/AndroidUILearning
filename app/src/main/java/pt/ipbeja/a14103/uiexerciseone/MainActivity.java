package pt.ipbeja.a14103.uiexerciseone;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private int posIndex = 0;
    private int [] positions = new int []
            {
                    Gravity.TOP | Gravity.RIGHT,
                    Gravity.BOTTOM | Gravity.RIGHT,
                    Gravity.BOTTOM | Gravity.LEFT,
                    Gravity.TOP | Gravity.LEFT,

            };

    public void btnNextPosition_onClick(View view)
    {
        ImageView img = (ImageView)findViewById(R.id.imageView);
        if(posIndex >= this.positions.length)
            posIndex = 0;
        posIndex++;
        // Add logic to keep old params and change the gravity only.
        ActionBar.LayoutParams var = new ActionBar.LayoutParams(this.positions[this.posIndex]);
        img.setLayoutParams(var);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img = (ImageView)findViewById(R.id.imageView);

        img.bringToFront();
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
    }

    public void quitApplication(View view)
    {
        this.onDestroy();
    }
}
