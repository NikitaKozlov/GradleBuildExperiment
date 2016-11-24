package com.nikitakozlov.sixthmodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.nikitakozlov.sixthmodule.generated.package_0.Foo149;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SixthActivity extends AppCompatActivity {

    @BindView(R2.id.sixth_text_view)
    TextView textView;

    public void doSmth() {
        new Foo149().foo2();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        ButterKnife.bind(this);
    }
}
