package bkm.com.airpodsbattery.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import bkm.com.airpodsbattery.R;
import bkm.com.airpodsbattery.ui.SettingsViewModel;
import butterknife.BindView;

import android.os.Bundle;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity {

    private SettingsViewModel viewModel;

    @BindView(R.id.text)
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = ViewModelProviders.of(this).get(SettingsViewModel.class);
        viewModel.getUserId().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                text.setText(s);
            }
        });
    }
}
