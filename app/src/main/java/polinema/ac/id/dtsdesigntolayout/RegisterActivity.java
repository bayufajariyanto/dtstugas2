package polinema.ac.id.dtsdesigntolayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class RegisterActivity extends AppCompatActivity {

    // Tambahkan variabel di sini
    private final String TAG = RegisterActivity.class.getName();
    public static final String Key_RegisterActivity = "Key_RegisterActivity";

    EditText editTextNama, editTextTanggalLahir, editTextUserName, editTextPassword;
    RadioButton radioButtonLaki, radioButtonPerempuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        // Inisialisasi variabel
        editTextNama = findViewById(R.id.edt_txt_nama);
        editTextTanggalLahir = findViewById(R.id.edt_tanggal_lahir);
        editTextUserName = findViewById(R.id.edt_username);
        editTextPassword = findViewById(R.id.edt_password);
        radioButtonLaki = findViewById(R.id.rb_laki);
        radioButtonPerempuan = findViewById(R.id.rb_perempuan);
    }

    public void postSignUp(View view) {
        // Tambahkan kode untuk proses sign up
        String password = editTextPassword.getText().toString();
        String username = editTextUserName.getText().toString();
        String nama = editTextNama.getText().toString();
        String jk = radioButtonPerempuan.isChecked() ? "Perempuan" : "Laki-laki";
        String tanggal_lahir = editTextTanggalLahir.getText().toString();
        Log.d(TAG, "postSignUp: " + password);
        Log.d(TAG, "postSignUp: " + username);
        Log.d(TAG, "postSignUp: " + nama);
        Log.d(TAG, "postSignUp: " + jk);
        Log.d(TAG, "postSignUp: " + tanggal_lahir);
        Intent intent = new Intent(RegisterActivity.this, RegisterResultActivity.class);
        intent.putExtra(Key_RegisterActivity, new String[]{nama, tanggal_lahir, jk, username});
        startActivity(intent);
    }


}
