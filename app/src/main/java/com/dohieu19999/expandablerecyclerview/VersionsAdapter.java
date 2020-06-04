package com.dohieu19999.expandablerecyclerview;

import android.graphics.drawable.AnimationDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VersionsAdapter extends RecyclerView.Adapter<VersionsAdapter.ViewHolder> {
    List<Versions> versionsList;

    public VersionsAdapter(List<Versions> versionsList) {
        this.versionsList = versionsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Versions versions = versionsList.get(position);
        holder.codeNameTxt.setText(versions.getCodeName());
        holder.versionTxt.setText(versions.getVersion());
        holder.apiLeverTxt.setText(versions.getApilevar());
        holder.descriptionTxt.setText(versions.getDescription());

        boolean isExpandable = versionsList.get(position).getExpandable();
        holder.expandableLayout.setVisibility(isExpandable ? View.VISIBLE : View.GONE);
        holder.imgArrow.setRotation(isExpandable ? 180 : 360);
    }

    @Override
    public int getItemCount() {
        return versionsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView codeNameTxt, versionTxt, apiLeverTxt, descriptionTxt;
        LinearLayout linearLayout;
        RelativeLayout expandableLayout;
        ImageView imgArrow;

        public ViewHolder(@NonNull final View itemView) {
            super(itemView);
            codeNameTxt = itemView.findViewById(R.id.code_name);
            versionTxt = itemView.findViewById(R.id.version);
            apiLeverTxt = itemView.findViewById(R.id.api_lever);
            descriptionTxt = itemView.findViewById(R.id.description);
            imgArrow = itemView.findViewById(R.id.imgArrow);

            linearLayout = itemView.findViewById(R.id.linear_layout);
            expandableLayout = itemView.findViewById(R.id.expandable_layout);
            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Versions versions = versionsList.get(getAdapterPosition());
                    versions.setExpandable(!versions.getExpandable());
                    notifyItemChanged(getAdapterPosition());
                    final RotateAnimation rotateAnim = new RotateAnimation(1f, 1f,
                            RotateAnimation.RELATIVE_TO_SELF, 1f,
                            RotateAnimation.RELATIVE_TO_SELF, 1f);
                    rotateAnim.setDuration(0);
                    rotateAnim.setFillAfter(true);
                    imgArrow.startAnimation(rotateAnim);
                }
            });
        }
    }
}
