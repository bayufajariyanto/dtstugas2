package polinema.ac.id.dtsdesigntolayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ResetPassword extends AppCompatActivity {

    // Deklarasi EditText
    EditText editTextCode, editNewPassword, editConfirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        // Binding EditText
        editTextCode = findViewById(R.id.edt_txt_code);
        editNewPassword = findViewById(R.id.edt_new_password);
        editConfirmPassword = findViewById(R.id.edt_confirm_password);
    }

    public void postChangePassword(View view) {
        String password = editNewPassword.getText().toString();
        String konfirmasiPassword = editConfirmPassword.getText().toString();

        // Validasi kosong
        if(TextUtils.isEmpty(editTextCode.getText()) && TextUtils.isEmpty(password)
        && TextUtils.isEmpty(konfirmasiPassword)){
            Toast.makeText(view.getContext(), "Semua bidang harus diisi!", Toast.LENGTH_SHORT).show();
        } else if(TextUtils.isEmpty(editTextCode.getText()) && TextUtils.isEmpty(password)) {
            Toast.makeText(view.getContext(), "Kode dan Password harus diisi!", Toast.LENGTH_SHORT).show();
        } else if(TextUtils.isEmpty(editTextCode.getText()) && TextUtils.isEmpty(konfirmasiPassword)) {
            Toast.makeText(view.getContext(), "Kode dan Konfirmasi Password harus diisi!", Toast.LENGTH_SHORT).show();
        } else if(TextUtils.isEmpty(password) && TextUtils.isEmpty(konfirmasiPassword)) {
            Toast.makeText(view.getContext(), "Password dan Konfirmasi Password harus diisi!", Toast.LENGTH_SHORT).show();
        } else if(TextUtils.isEmpty(editTextCode.getText())){
            Toast.makeText(view.getContext(), "Kode tidak boleh kosong!", Toast.LENGTH_SHORT).show();
        }
        // Cek inputan new dan confirm
        else if(TextUtils.isEmpty(password)){
            Toast.makeText(view.getContext(), "Password harus diisi!", Toast.LENGTH_SHORT).show();
        }else if(TextUtils.isEmpty(konfirmasiPassword)) {
            Toast.makeText(view.getContext(), "Konfirmasi Password harus diisi!", Toast.LENGTH_SHORT).show();
        }else if(!password.equals(konfirmasiPassword)){
            Toast.makeText(view.getContext(), "Password dan Konfirmasi Password harus sama!", Toast.LENGTH_SHORT).show();
        }
        // jika semua validasi lolos maka akan berpindah halaman ke SuccessActivity
        else{
            Intent i = new Intent(ResetPassword.this, SuccessActivity.class);
            startActivity(i);
        }
    }
}
