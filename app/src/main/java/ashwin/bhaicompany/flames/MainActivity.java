package ashwin.bhaicompany.flames;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
//import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText m1;
    EditText m2;
    Button results;
   // TextView txt; //  alt+ enter

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setViews();

    }

    public void setViews()
    {
        m1 = (EditText) findViewById(R.id.member1);
        m2 = (EditText) findViewById(R.id.member2);
        results = (Button) findViewById(R.id.results);
    }

    public void onClicked(View v)
    {
        String member = m1.getText().toString();
        String member2 = m2.getText().toString();
        String FLAMES = "FLAMES";
        System.out.println(member);
        System.out.println(member2);
        // logic here
        char[] memberArray = member.toCharArray();
        char[] memberArray2 = member2.toCharArray();
        for (char aMemberArray : memberArray) {
            for (char aMemberArray2 : memberArray2) {
                if (aMemberArray == aMemberArray2) {
                    System.out.println(aMemberArray);
                    member = member.replaceAll(aMemberArray+"", "");
                    member2 = member2.replaceAll(aMemberArray2+"", "");
                }
            }
        }
        String rem = member + member2;
        System.out.println(rem);
        int cancelLength = rem.length();

        while(FLAMES.length() >1)
        {
            if(cancelLength > FLAMES.length())
            {
                cancelLength = cancelLength % FLAMES.length();
            }
            System.out.println(cancelLength);
            System.out.println(FLAMES.length());
            FLAMES = FLAMES.substring(cancelLength, FLAMES.length()) + FLAMES.substring(0, cancelLength - 1);
            System.out.println(FLAMES);
        }
        //Toast.makeText(MainActivity.this, FLAMES, Toast.LENGTH_SHORT).show();
        // Intent class to switch activity or interaction state
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        i.putExtra("key",FLAMES);
        startActivity(i);
    }
}
























