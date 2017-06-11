package com.example.android.cookies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.android_cookie_image_view) ImageView androidCookieImageView;
    @BindView(R.id.status_text_view) TextView statusTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    /**
     * Called when the cookie should be eaten.
     */
    @OnClick(R.id.eat_cookie_button)
    public void eatCookie() {
        androidCookieImageView.setImageResource(R.drawable.after_cookie);
        statusTextView.setText(R.string.full);
    }
}
