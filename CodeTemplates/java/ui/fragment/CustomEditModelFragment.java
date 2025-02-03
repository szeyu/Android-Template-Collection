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
 * A fully customizable fragment for editing a model.
 * 
 * Features:
 * - Supports dynamic model (`${MODEL_NAME}`)
 * - Allows updating and deleting entities
 * - Uses ViewModel for data binding
 * - Supports NavigationUtil for smooth transitions
 * 
 * Usage:
 * 1. Replace `${MODEL_NAME}` with your model class (e.g., `Person`, `Task`)
 * 2. Define necessary attributes (name, description, etc.)
 * 3. Ensure the corresponding ViewModel (`${MODEL_NAME}ViewModel`) exists
 */

package ${PACKAGE_NAME}.ui.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import ${PACKAGE_NAME}.R;
import ${PACKAGE_NAME}.model.${MODEL_NAME};
import ${PACKAGE_NAME}.ui.navigation.NavigationUtil;
import ${PACKAGE_NAME}.ui.viewModel.${MODEL_NAME}ViewModel;

public class CustomEditModelFragment extends Fragment {

    private ${MODEL_NAME}ViewModel viewModel;
    private int modelId; // ID passed as an argument

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                            Bundle savedInstanceState) {
        // Inflate your layout for editing a model
        return inflater.inflate(R.layout.fragment_edit_${MODEL_NAME}.toLowerCase(), container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Retrieve modelId from arguments (use Safe Args if available)
        if (getArguments() != null) {
            modelId = getArguments().getInt("${MODEL_NAME}Id", -1);
        }

        // Initialize ViewModel
        viewModel = new ViewModelProvider(this).get(${MODEL_NAME}ViewModel.class);

        // Setup UI components
        EditText etName = view.findViewById(R.id.et_edit_${MODEL_NAME.toLowerCase()}_name);
        EditText etDescription = view.findViewById(R.id.et_edit_${MODEL_NAME.toLowerCase()}_description);
        Button btnSave = view.findViewById(R.id.btn_save_changes);
        Button btnDelete = view.findViewById(R.id.btn_delete_${MODEL_NAME.toLowerCase()});

        // Fetch and display existing ${MODEL_NAME} data
        viewModel.getItemById(modelId).observe(getViewLifecycleOwner(), model -> {
            if (model != null) {
                etName.setText(model.getName());
                etDescription.setText(model.getDescription());
            }
        });

        // Handle Save button click
        btnSave.setOnClickListener(v -> {
            String name = etName.getText().toString().trim();
            String description = etDescription.getText().toString().trim();
            
            if (TextUtils.isEmpty(name)) {
                Toast.makeText(getContext(), "Name cannot be empty", Toast.LENGTH_SHORT).show();
                return;
            }

            // Update model object
            ${MODEL_NAME} updatedModel = new ${MODEL_NAME}(name, description);
            updatedModel.setId(modelId);
            viewModel.update(updatedModel);

            Toast.makeText(getContext(), "${MODEL_NAME} updated", Toast.LENGTH_SHORT).show();

            // Navigate back
            NavigationUtil.navigateBack(this);
        });

        // Handle Delete button click
        btnDelete.setOnClickListener(v -> {
            // Delete model
            ${MODEL_NAME} modelToDelete = new ${MODEL_NAME}();
            modelToDelete.setId(modelId);
            viewModel.delete(modelToDelete);

            Toast.makeText(getContext(), "${MODEL_NAME} deleted", Toast.LENGTH_SHORT).show();

            // Navigate back
            NavigationUtil.navigateBack(this);
        });
    }
}
