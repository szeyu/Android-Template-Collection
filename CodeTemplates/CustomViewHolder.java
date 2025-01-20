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
        textViewTitle = itemView.findViewById(R.id.text_view_title);
        textViewSubtitle = itemView.findViewById(R.id.text_view_subtitle);
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