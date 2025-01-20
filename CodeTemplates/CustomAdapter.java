package ${PACKAGE_NAME};

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

// Replace ${PACKAGE_NAME} with your package name
// Replace ${ADAPTER_NAME} with your Adapter class name
// Replace ${VIEW_HOLDER_NAME} with your ViewHolder class name

public class ${ADAPTER_NAME} extends RecyclerView.Adapter<${ADAPTER_NAME}.${VIEW_HOLDER_NAME}> {

    private List<${MODEL_NAME}> itemList;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(${MODEL_NAME} item);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    public ${ADAPTER_NAME}(List<${MODEL_NAME}> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public ${VIEW_HOLDER_NAME} onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.${ITEM_LAYOUT_NAME}, parent, false);
        return new ${VIEW_HOLDER_NAME}(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ${VIEW_HOLDER_NAME} holder, int position) {
        ${MODEL_NAME} item = itemList.get(position);
        holder.bind(item, listener);
    }

    @Override
    public int getItemCount() {
        return itemList != null ? itemList.size() : 0;
    }

    public void setItemList(List<${MODEL_NAME}> itemList) {
        this.itemList = itemList;
        notifyDataSetChanged();
    }

    public static class ${VIEW_HOLDER_NAME} extends RecyclerView.ViewHolder {
        // Define your view components here

        public ${VIEW_HOLDER_NAME}(View itemView) {
            super(itemView);
            // Initialize your view components
        }

        public void bind(final ${MODEL_NAME} item, final OnItemClickListener listener) {
            // Bind data to your views
            // Example: textView.setText(item.getTitle());

            itemView.setOnClickListener(v -> {
                if (listener != null) {
                    listener.onItemClick(item);
                }
            });
        }
    }
}