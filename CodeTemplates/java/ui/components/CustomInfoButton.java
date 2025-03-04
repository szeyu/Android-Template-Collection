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
 * Custom ImageButton implementation for information display.
 * Features:
 * - Material Design integration
 * - Built-in click handling
 * - Customizable appearance
 * - Easy integration with activities and fragments
 * 
 * Usage:
 * 1. Add to your layout XML
 * 2. Customize appearance through attributes
 * 3. Set click listener for actions
 */

package ${PACKAGE_NAME};

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatImageButton;

// Replace ${PACKAGE_NAME} with your package name

public class InfoButton extends AppCompatImageButton implements View.OnClickListener {

    public InfoButton(Context context) {
        super(context);
        init();
    }

    public InfoButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public InfoButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        // Set up the button (e.g., set image resource)
        setImageResource(R.drawable.baseline_info_24); // Replace with your actual drawable
        setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // Handle the click event, e.g., show a dialog or toast
        // You can also define an interface to communicate back to the activity
    }
}