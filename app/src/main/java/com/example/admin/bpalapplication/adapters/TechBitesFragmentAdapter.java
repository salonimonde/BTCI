package com.example.admin.bpalapplication.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.bpalapplication.R;

public class TechBitesFragmentAdapter extends RecyclerView.Adapter<TechBitesFragmentAdapter.TechBitesFragmentHolder> {
    private Context mContext;

    public TechBitesFragmentAdapter(Context context) {
        this.mContext = context;
    }

    @Override
    public TechBitesFragmentAdapter.TechBitesFragmentHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_tech_bites_card, null);
        TechBitesFragmentAdapter.TechBitesFragmentHolder viewHolder = new TechBitesFragmentAdapter.TechBitesFragmentHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(TechBitesFragmentAdapter.TechBitesFragmentHolder holder, int position) {

        holder.imgOne.setImageResource(R.drawable.ic_action_tech_one);
        holder.txtHeadingOne.setText(R.string.economic_concepts_consumers_need_to_know);
        holder.txtMainOne.setText(R.string.the_over_the_counter_is_not_an_actual_exchange_like_the_nyse_or_nasdaq_instead_it_is_a_network_of_companies_that);
        holder.imgTwo.setImageResource(R.drawable.ic_action_tech_two);
        holder.txtHeadingTwo.setText(R.string._6_technology_trends_that_arent_ai_blockchain_or_vr);
        holder.txtMainTwo.setText(R.string.it_is_a_long_established_fact_that_a_reader_will_be_distracted_by_the_readable_content_of_a_page_when_looking_at_its);
        holder.imgThree.setImageResource(R.drawable.ic_action_tech_three);
        holder.txtHeadingThree.setText(R.string.the_near_future_of_technology);
        holder.txtMainThree.setText(R.string.it_is_a_long_established_fact_that_a_reader_will_be_distracted_by_the_readable_content_of_a_page_when_looking_at_its);

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class TechBitesFragmentHolder extends RecyclerView.ViewHolder {

        public ImageView imgOne, imgTwo, imgThree;
        public TextView txtHeadingOne, txtHeadingTwo, txtHeadingThree;
        public TextView txtMainOne, txtMainTwo, txtMainThree;

        public TechBitesFragmentHolder(View itemView) {
            super(itemView);

            imgOne = (ImageView) itemView.findViewById(R.id.img_one);
            imgTwo = (ImageView) itemView.findViewById(R.id.img_two);
            imgThree = (ImageView) itemView.findViewById(R.id.img_three);
            txtHeadingOne = (TextView) itemView.findViewById(R.id.txt_heading_one);
            txtHeadingTwo = (TextView) itemView.findViewById(R.id.txt_heading_two);
            txtHeadingThree = (TextView) itemView.findViewById(R.id.txt_heading_three);
            txtMainOne = (TextView) itemView.findViewById(R.id.txt_main_one);
            txtMainTwo = (TextView) itemView.findViewById(R.id.txt_main_two);
            txtMainThree = (TextView) itemView.findViewById(R.id.txt_main_three);
        }
    }
}
