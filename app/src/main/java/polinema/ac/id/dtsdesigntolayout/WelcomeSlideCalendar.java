package polinema.ac.id.dtsdesigntolayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeSlideCalendar extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_slide);
    }

    public void clickGetStarted(View view) {
        Intent i = new Intent(WelcomeSlideCalendar.this, WelcomeSlideSuperhero.class);
        startActivity(i);
    }

    public void clickLogin(View view) {
        Intent i = new Intent(WelcomeSlideCalendar.this, WelcomeBack.class);
        startActivity(i);
    }

    public void clickContactUs(View view) {
        // Panggil inplicit intent
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_EMAIL, new String[]{"bayuf08@gmail.com"});
        i.putExtra(Intent.EXTRA_SUBJECT, "Testing");
        i.putExtra(Intent.EXTRA_TEXT, "Email Percobaan");

        startActivity(i.createChooser(i, "Select"));
    }
}
