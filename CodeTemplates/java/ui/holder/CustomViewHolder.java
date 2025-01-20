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
 * RecyclerView ViewHolder template for item views.
 * Features:
 * - View binding implementation
 * - Click handling
 * - Data binding methods
 * - Efficient view recycling
 * 
 * Usage:
 * 1. Define item layout
 * 2. Implement bind method
 * 3. Use with RecyclerView adapter
 */

package ${PACKAGE_NAME};

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

// Replace ${PACKAGE_NAME} with your actual package name
// Replace ${VIEW_HOLDER_NAME} with the name of your ViewHolder class
// Replace ${ITEM_LAYOUT_NAME} with the layout resource ID for your item view

public class ${VIEW_HOLDER_NAME} extends RecyclerView.ViewHolder {

    // Define your view components here
    private final TextView textViewTitle;
    private final TextView textViewSubtitle;

    public ${VIEW_HOLDER_NAME}(@NonNull View itemView) {
        super(itemView);
        // Initialize your view components
        textViewTitle = itemView.findViewById(R.id.tv_card_title);
        textViewSubtitle = itemView.findViewById(R.id.tv_card_subtitle);
    }

    /**
     * Bind data to the views.
     *
     * @param item The data item to bind
     */
    public void bind(${MODEL_NAME} item) {
        // Set data to your views
        textViewTitle.setText(item.getTitle());
        textViewSubtitle.setText(item.getSubtitle());
    }
}