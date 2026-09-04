package jp.ac.meijou.android.a20260903teamwork;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.ViewHolder> {
    private List<SerachItem> itemList;

    public SearchAdapter(List<SerachItem> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_result, parent, false);
        return new ViewHolder(view);
    }

    public void onBindViewHolder(@NonNull ViewHolder holder, int position){
        SerachItem item = itemList.get(position);
        holder.imageTop.setImageResource(item.getImageTop());
        holder.imageUser.setImageResource(item.getImageUser());
        holder.User.setText(item.getUser());
        holder.Title.setText(item.getTitle());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageTop;
        ImageView imageUser;
        TextView User;
        TextView Title;

        public ViewHolder(@NonNull View itemview) {
            super(itemview);
            imageTop = itemview.findViewById(R.id.imageTop);
            imageUser = itemview.findViewById(R.id.imageUser);
            User = itemview.findViewById(R.id.textUser);
            Title = itemview.findViewById(R.id.textTitle);
        }
    }
}