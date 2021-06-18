package boardsmarkscalculater.example.boardsmarkscalculater;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Arrays;

public class MarksCalculateActivity extends AppCompatActivity {



    private EditText editTexts_class_10[] = new EditText[7],editText_class_11[] = new EditText[10],editText_class_12[] = new EditText[10];
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marks_calculate);

        submit = findViewById(R.id.submit_button);



        for (int i = 1 ; i<=7;i++)
        {
            String string_discount = "class_10_marks_0"+i;

            int i_discount_id = getResources().getIdentifier(string_discount,"id",getPackageName());

            editTexts_class_10[i-1]= findViewById(i_discount_id);


        }


        for (int i = 1 ; i<=10;i++)
        {
            String string_discount = "eleven_marks_0"+i;
            String string_discount_12 = "twelve_marks_0"+i;

            int i_discount_id = getResources().getIdentifier(string_discount,"id",getPackageName());
            int i_discount_id_12 = getResources().getIdentifier(string_discount_12,"id",getPackageName());

            editText_class_11[i-1]= findViewById(i_discount_id);
            editText_class_12[i-1]= findViewById(i_discount_id_12);


        }


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OkLetsGO();
            }
        });




    }

    private void OkLetsGO() {


        // Class 10 th Marks Calculate

        String  String_class_10[] = new String[7];
        float  int_class_10[] = new float[7];
        float Class_10_total_marks = 0;
        float Class_10_donation;



        for (int i = 1 ; i<=7;i++)
        {

            String_class_10[i-1] = editTexts_class_10[i-1].getText().toString();

            if (TextUtils.isEmpty(String_class_10[i-1])){
                Toast.makeText(this, "Enter Value...", Toast.LENGTH_SHORT).show();
            }
            else {
                int_class_10[i-1] = Float.parseFloat(String_class_10[i-1]);

            }


        }

        Arrays.sort(int_class_10);

        int len = int_class_10.length;
        for(int p= 1;p<=4;p++){
            Class_10_total_marks = Class_10_total_marks + int_class_10[len-p];
        }

        float float_10th = (float) Class_10_total_marks / 400 ;







        // Class 11 th Marks Calculate


        String  String_class_11[] = new String[10];
        float  int_class_11[] = new float[10];

        for (int i = 1 ; i<=10;i++)
        {

            String_class_11[i-1] = editText_class_11[i-1].getText().toString();

            if (TextUtils.isEmpty(String_class_11[i-1])){
                Toast.makeText(this, "Enter Value...", Toast.LENGTH_SHORT).show();
            }
            else {
                int_class_11[i-1] = Float.parseFloat(String_class_11[i-1]);

            }


        }


        double eleven_total = 0;



        float bengali_12;
        bengali_12 = ((float) int_class_11[0] / int_class_11[1]);
        eleven_total = eleven_total + ( 0.4 * int_class_11[1] * float_10th) + ( 0.6 * int_class_11[1]*bengali_12) ;



        float bengali_13;
        bengali_13 = ((float) int_class_11[2] / int_class_11[3]);
        eleven_total = eleven_total + ( 0.4 * int_class_11[3] * float_10th) + ( 0.6 * int_class_11[3]*bengali_13) ;


        float bengali_14;
        bengali_14 = ((float) int_class_11[4] / int_class_11[5]);
        eleven_total = eleven_total + ( 0.4 * int_class_11[5] * float_10th) + ( 0.6 * int_class_11[5]*bengali_14) ;



        float bengali_15;
        bengali_15 = ((float) int_class_11[6] / int_class_11[7]);
        eleven_total = eleven_total + ( 0.4 * int_class_11[7] * float_10th) + ( 0.6 * int_class_11[7]*bengali_15) ;

        float bengali_16;
       bengali_16 = ((float) int_class_11[8] / int_class_11[9]);
       eleven_total = eleven_total + ( 0.4 * int_class_11[9] * float_10th) + ( 0.6 * int_class_11[9]*bengali_16) ;





        // Class 12 th Marks Calculate


        String  String_class_12[] = new String[10];
        float  int_class_12[] = new float[10];

        for (int i = 1 ; i<=10;i++)
        {

            String_class_12[i-1] = editText_class_12[i-1].getText().toString();

            if (TextUtils.isEmpty(String_class_12[i-1])){
                Toast.makeText(this, "Enter Value...", Toast.LENGTH_SHORT).show();
            }
            else {
                int_class_12[i-1] = Float.parseFloat(String_class_12[i-1]);

            }


        }


        double twelve_total = 0;



        twelve_total = int_class_12[0] + int_class_12[2] + int_class_12[4] + int_class_12[6] + int_class_12[8] + eleven_total ;











        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("")
                .setTitle(String.valueOf(" ! Congratulations ! \n\nYou will get: \n"+twelve_total  ));

        builder.create();
        builder.show();








    }
}