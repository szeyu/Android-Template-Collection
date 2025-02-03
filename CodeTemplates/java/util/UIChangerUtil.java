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
 * A utility class for quick UI modifications in Android.
 * 
 * Features:
 * - Change text and text color of a TextView.
 * - Change background color of a View.
 * - Toggle visibility (VISIBLE, INVISIBLE, GONE).
 * - Enable or disable any View.
 * - Change an ImageView’s resource dynamically.
 * - Set click and long-click listeners easily.
 *
 * Usage Example:
 * UIChangerUtil.changeText(myTextView, "Hello, World!");
 * UIChangerUtil.changeTextColor(myTextView, Color.RED);
 * UIChangerUtil.changeBackgroundColor(myView, Color.BLUE);
 * UIChangerUtil.setVisibility(myButton, View.GONE);
 * UIChangerUtil.setEnabled(myEditText, false);
 * UIChangerUtil.changeImage(myImageView, R.drawable.new_image);
 * UIChangerUtil.setClickListener(myButton, () -> Toast.makeText(context, "Clicked!", Toast.LENGTH_SHORT).show());
 * UIChangerUtil.setLongClickListener(myTextView, () -> {  return true; });
 */

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;
import android.widget.Toast;

import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;

public class UIChangerUtil {

    // Change the text of a TextView
    public static void changeText(TextView textView, String text) {
        if (textView != null) {
            textView.setText(text);
        }
    }

    // Change the text color of a TextView
    public static void changeTextColor(TextView textView, @ColorInt int color) {
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    // Change the background color of any View
    public static void changeBackgroundColor(View view, @ColorInt int color) {
        if (view != null) {
            view.setBackgroundColor(color);
        }
    }

    // Set visibility of a View (VISIBLE, INVISIBLE, GONE)
    public static void setVisibility(View view, int visibility) {
        if (view != null) {
            view.setVisibility(visibility);
        }
    }

    // Enable or disable a View
    public static void setEnabled(View view, boolean isEnabled) {
        if (view != null) {
            view.setEnabled(isEnabled);
        }
    }

    // Change the image of an ImageView
    public static void changeImage(ImageView imageView, @DrawableRes int drawableRes) {
        if (imageView != null) {
            imageView.setImageResource(drawableRes);
        }
    }

    // Set click listener using lambda (Java 8+)
    public static void setClickListener(View view, Runnable action) {
        if (view != null && action != null) {
            view.setOnClickListener(v -> action.run());
        }
    }

    // Set long-click listener using lambda (Java 8+)
    public static void setLongClickListener(View view, Runnable action) {
        if (view != null && action != null) {
            view.setOnLongClickListener(v -> {
                action.run();
                return true;
            });
        }
    }

    // Show a Toast message (quick feedback)
    public static void showToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
