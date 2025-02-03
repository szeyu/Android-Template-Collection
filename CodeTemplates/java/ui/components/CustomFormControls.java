/**
 * Created by Sim Sze Yu
 * GitHub: https://github.com/szeyu/Awsome-Android-Code-Template
 * 
 * This template is part of the WIA2007 Mobile Application Development Course
 * Bachelor of Computer Science (Artificial Intelligence)
 * Universiti Malaya
 * 
 * Licensed under MIT License
 * Copyright (c) 2025 Sim Sze Yu
 * 
 * Custom form controls activity implementing various interactive UI components.
 * Features:
 * - RadioGroup with multiple radio buttons
 * - Checkbox group with multiple selections
 * - Switch component for toggling options
 * - AutoCompleteTextView with sample data
 * - Spinner dropdown with predefined options
 * - Button to submit selections
 * 
 * Usage:
 * 1. Inflate the layout `activity_custom_form_controls.xml`
 * 2. Call `setupRadio()`, `setupCheckbox()`, etc., in `onCreate()`
 * 3. Handle user interactions using event listeners
 */

package ${PACKAGE_NAME};

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import ${PACKAGE_NAME}.R;

import java.util.ArrayList;
import java.util.List;

public class CustomFormControls extends AppCompatActivity {

    private RadioGroup radioGroup;
    private CheckBox checkBox1, checkBox2, checkBox3;
    private Switch toggleSwitch;
    private AutoCompleteTextView autoCompleteTextView;
    private Spinner spinner;
    private Button submitButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_form_controls);

        // Initialize form controls
        setupRadio();
        setupCheckbox();
        setupSwitch();
        setupAutoComplete();
        setupSpinner();
        setupButton();
    }

    private void setupRadio() {
        radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton selected = findViewById(checkedId);
            Toast.makeText(this, "Selected: " + selected.getText(), Toast.LENGTH_SHORT).show();
        });
    }

    private void setupCheckbox() {
        checkBox1 = findViewById(R.id.checkbox1);
        checkBox2 = findViewById(R.id.checkbox2);
        checkBox3 = findViewById(R.id.checkbox3);

        View.OnClickListener listener = v -> {
            StringBuilder selected = new StringBuilder("Selected: ");
            if (checkBox1.isChecked()) selected.append(checkBox1.getText()).append(" ");
            if (checkBox2.isChecked()) selected.append(checkBox2.getText()).append(" ");
            if (checkBox3.isChecked()) selected.append(checkBox3.getText()).append(" ");
            Toast.makeText(this, selected.toString(), Toast.LENGTH_SHORT).show();
        };

        checkBox1.setOnClickListener(listener);
        checkBox2.setOnClickListener(listener);
        checkBox3.setOnClickListener(listener);
    }

    private void setupSwitch() {
        toggleSwitch = findViewById(R.id.toggleSwitch);
        toggleSwitch.setOnCheckedChangeListener((buttonView, isChecked) ->
                Toast.makeText(this, "Switch is " + (isChecked ? "ON" : "OFF"), Toast.LENGTH_SHORT).show());
    }

    private void setupAutoComplete() {
        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        String[] suggestions = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, suggestions);
        autoCompleteTextView.setAdapter(adapter);
    }

    private void setupSpinner() {
        spinner = findViewById(R.id.spinner);
        List<String> options = new ArrayList<>();
        options.add("Option 1");
        options.add("Option 2");
        options.add("Option 3");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, options);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(CustomFormControls.this, "Selected: " + options.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });
    }

    private void setupButton() {
        submitButton = findViewById(R.id.submitButton);
        submitButton.setOnClickListener(v -> Toast.makeText(this, "Form Submitted!", Toast.LENGTH_SHORT).show());
    }
}
