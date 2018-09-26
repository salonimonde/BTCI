package com.example.admin.bpalapplication.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.admin.bpalapplication.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class WhatsUpFragmentAdapter extends RecyclerView.Adapter<WhatsUpFragmentAdapter.WhatsUpFragmentHolder>{

    private Context mContext;

    public WhatsUpFragmentAdapter(Context context){
        this.mContext = context;
    }
    @Override
    public WhatsUpFragmentHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_whats_up_card,null);
        WhatsUpFragmentAdapter.WhatsUpFragmentHolder viewHolder = new WhatsUpFragmentAdapter.WhatsUpFragmentHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(WhatsUpFragmentHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class WhatsUpFragmentHolder extends RecyclerView.ViewHolder {

        public LinearLayout linearLayoutWhatsUp;
        public CircleImageView circleImageViewProfile;
        public TextView txtName,txtPostType,txtDate,txtPostHeading;
        public ImageView imgPhotoOne,imgPhotoTwo,imgPhotoThree,imgPhotofour;
        public WhatsUpFragmentHolder(View itemView) {
            super(itemView);

            linearLayoutWhatsUp = (LinearLayout) itemView.findViewById(R.id.recycler_view_whats_up);
            circleImageViewProfile = (CircleImageView) itemView.findViewById(R.id.circle_img_profile);
            txtName = (TextView) itemView.findViewById(R.id.txt_card_name);
            txtPostType = (TextView) itemView.findViewById(R.id.txt_card_post_type);
            txtDate = (TextView) itemView.findViewById(R.id.txt_card_date);
            txtPostHeading = (TextView) itemView.findViewById(R.id.txt_post_heading);
        }
    }
}
