package boardsmarkscalculater.example.boardsmarkscalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OkDOne(View view) {

        Intent intent = new Intent(MainActivity.this,MarksCalculateActivity.class);
        startActivity(intent);
    }
}