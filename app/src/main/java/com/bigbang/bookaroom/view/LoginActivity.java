package com.bigbang.bookaroom.view;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ContextThemeWrapper;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.bigbang.bookaroom.R;
import com.bigbang.bookaroom.presenter.Contract;
import com.bigbang.bookaroom.presenter.Presenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity implements Contract.View {

    private Contract.Presenter mainPresenter;

    @BindView(R.id.username_edittext)
    EditText usernameEditText;

    @BindView(R.id.password_edittext)
    EditText passwordEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_layout);
        ButterKnife.bind(this);

        mainPresenter = new Presenter(this);
    }

    @OnClick(R.id.login_button)
    public void loginClick(View view) {
        String name = usernameEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();

        mainPresenter.loginUser(name, password);

        Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
        startActivity(intent);
    }

    @Override
    public void userLoginSuccess() {

    }

    @Override
    public void userLoginFailed() {
        new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AppTheme))
                .setTitle("Login failed")
                .setMessage("Username or password is invalid.  Please re-enter.")
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        System.exit(0);
                    }
                })
                .setPositiveButton("Try again", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        usernameEditText.setText("");
                        passwordEditText.setText("");
                    }
                })
                .create()
                .show();
    }

    @Override
    public void userLoggedOut() {

    }

    @Override
    public void displayResults() {

    }
}
