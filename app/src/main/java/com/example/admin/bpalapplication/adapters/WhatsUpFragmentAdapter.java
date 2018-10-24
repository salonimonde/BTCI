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

import org.w3c.dom.Text;

import de.hdodenhof.circleimageview.CircleImageView;

public class WhatsUpFragmentAdapter extends RecyclerView.Adapter<WhatsUpFragmentAdapter.WhatsUpFragmentHolder> {

    private Context mContext;

    public WhatsUpFragmentAdapter(Context context) {
        this.mContext = context;
    }

    @Override
    public WhatsUpFragmentHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_whats_up_card, null);
        WhatsUpFragmentAdapter.WhatsUpFragmentHolder viewHolder = new WhatsUpFragmentAdapter.WhatsUpFragmentHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(WhatsUpFragmentHolder holder, int position) {

        holder.txtName.setText(R.string.alok_dekhane);
        holder.txtDate.setText(R.string._1st_july_2017);
        holder.txtPostHeading.setText(R.string.worth_visiting_place_mahabaleshwar);
        holder.circleImageViewProfile.setImageResource(R.drawable.ic_action_profile_picture);
        holder.imgPhotoOne.setImageResource(R.drawable.ic_action_group_photo_one);
        holder.imgPhotoTwo.setImageResource(R.drawable.ic_action_group_photo_two);
        holder.imgPhotoThree.setImageResource(R.drawable.ic_action_group_photo_three);
        holder.imgPhotofour.setImageResource(R.drawable.ic_action_group_photo_four);
        if (holder.linearPost.getVisibility() == View.VISIBLE){

            holder.txtPostMain.setText(R.string.looking_for_html_css_expertise_no_of_req_5);

        }





    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class WhatsUpFragmentHolder extends RecyclerView.ViewHolder {

        public LinearLayout linearLayoutWhatsUp, linearRowOne, linearRowTwo, linearPost;
        public CircleImageView circleImageViewProfile;
        public TextView txtName, txtPostType, txtDate, txtPostHeading, txtPostOne, txtPostMain;
        public ImageView imgPhotoOne, imgPhotoTwo, imgPhotoThree, imgPhotofour;

        public WhatsUpFragmentHolder(View itemView) {
            super(itemView);

            linearLayoutWhatsUp = (LinearLayout) itemView.findViewById(R.id.recycler_view_whats_up);
            linearRowOne = (LinearLayout) itemView.findViewById(R.id.linear_row_one);
            linearRowTwo = (LinearLayout) itemView.findViewById(R.id.linear_row_two);
            linearPost = (LinearLayout) itemView.findViewById(R.id.linear_post);
            circleImageViewProfile = (CircleImageView) itemView.findViewById(R.id.circle_img_profile_one);
            txtName = (TextView) itemView.findViewById(R.id.txt_card_name_one);
            txtPostType = (TextView) itemView.findViewById(R.id.txt_card_post_type_one);
            txtDate = (TextView) itemView.findViewById(R.id.txt_card_date_one);
            txtPostHeading = (TextView) itemView.findViewById(R.id.txt_post_heading_one);
            txtPostOne = (TextView) itemView.findViewById(R.id.txt_post_one);
            txtPostMain = (TextView) itemView.findViewById(R.id.txt_post_main);
            imgPhotoOne = (ImageView) itemView.findViewById(R.id.img_one_group_photo_one);
            imgPhotoTwo = (ImageView) itemView.findViewById(R.id.img_one_group_photo_two);
            imgPhotoThree = (ImageView) itemView.findViewById(R.id.img_one_group_photo_three);
            imgPhotofour = (ImageView) itemView.findViewById(R.id.img_one_group_photo_four);
        }
    }
}
