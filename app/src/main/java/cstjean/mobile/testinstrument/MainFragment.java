package cstjean.mobile.testinstrument;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainFragment extends Fragment {
    private TextInputEditText editText;
    private Button button;
    private TextView textView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        editText = v.findViewById(R.id.input_entree);
        textView = v.findViewById(R.id.txt_resultat);
        button = v.findViewById(R.id.btn_action);
        button.setOnClickListener(view -> textView.setText(editText.getText()));
        return v;
    }
}