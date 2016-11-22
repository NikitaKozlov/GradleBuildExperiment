package com.nikitakozlov.fifthmodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.nikitakozlov.fifthmodule.generated.package_0.Foo149;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FifthActivity extends AppCompatActivity {

    @BindView(R2.id.fifth_text_view)
    TextView textView;

    public void doSmth() {
        new Foo149().foo4();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        ButterKnife.bind(this);
    }
}
