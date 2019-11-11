package ichyass.basicfragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class DynamicFragmentActivity extends AppCompatActivity {
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_fragment);
        getSupportFragmentManager().beginTransaction().add(R.id.container, new MyDynamicFragment()).commit();
   }
}