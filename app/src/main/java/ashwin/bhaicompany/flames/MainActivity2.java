package ashwin.bhaicompany.flames;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity{
    //String s = getIntent().getStringExtra("key");
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity2);
        Intent intent = getIntent();
        String S = intent.getStringExtra("key");
        if (S.equals("F"))
        {
            Toast.makeText(MainActivity2.this, "FRIENDS", Toast.LENGTH_SHORT).show();
        }
        if (S.equals("L"))
        {
            Toast.makeText(MainActivity2.this,"LOVE",Toast.LENGTH_SHORT).show();
        }
        if (S.equals("A"))
        {
            Toast.makeText(MainActivity2.this,"AFFECTION",Toast.LENGTH_SHORT).show();
        }
        if(S.equals("M"))
        {
            Toast.makeText(MainActivity2.this,"MARRIAGE",Toast.LENGTH_SHORT).show();
        }
        if(S.equals("E"))
        {
            Toast.makeText(MainActivity2.this,"LOVE",Toast.LENGTH_SHORT).show();
        }
        if(S.equals("S"))
        {
            Toast.makeText(MainActivity2.this,"SISTER/BROTHER",Toast.LENGTH_SHORT).show();
        }
    }

}
