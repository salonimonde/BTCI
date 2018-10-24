package com.example.admin.bpalapplication.activity;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.admin.bpalapplication.R;

import org.w3c.dom.Text;

public class TechBitesDetailsActivity extends AppCompatActivity implements View.OnClickListener {

    private VideoView videoView;
    private int position = 0;
    private MediaController mediaController;
    private TextView txtLike, txtComment, txtSavePost;
    private ImageView imgLike, imgLikeFilled, imgComment, imgSavePost, imgSavePostFilled;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech_bites_details);

        mContext = this;

        txtLike = (TextView) findViewById(R.id.txt_like);
        txtLike.setOnClickListener(this);
        txtComment = (TextView) findViewById(R.id.txt_comment);
        txtComment.setOnClickListener(this);
        txtSavePost = (TextView) findViewById(R.id.txt_save_post);
        txtSavePost.setOnClickListener(this);

        imgLike = (ImageView) findViewById(R.id.img_like);
        imgLike.setOnClickListener(this);
        imgLikeFilled = (ImageView) findViewById(R.id.img_like_filled);
        imgLikeFilled.setOnClickListener(this);
        imgComment = (ImageView) findViewById(R.id.img_comment);
        imgComment.setOnClickListener(this);
        imgSavePost = (ImageView) findViewById(R.id.img_save_post);
        imgSavePost.setOnClickListener(this);
        imgSavePostFilled = (ImageView) findViewById(R.id.img_save_post_filled);
        imgSavePostFilled.setOnClickListener(this);

        videoView = (VideoView) findViewById(R.id.video_view);

        // Set the media controller buttons
        if (mediaController == null) {
            mediaController = new MediaController(TechBitesDetailsActivity.this);

            // Set the videoView that acts as the anchor for the MediaController.
            mediaController.setAnchorView(videoView);


            // Set MediaController for VideoView
            videoView.setMediaController(mediaController);

            try {
                // ID of video file.
                int id = this.getRawResIdByName("ic_tech_video");
                videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + id));

            } catch (Exception e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }

            videoView.requestFocus();
            videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {

                public void onPrepared(MediaPlayer mediaPlayer) {


                    videoView.seekTo(position);
                    if (position == 0) {
                        videoView.pause();

                    }

                    // When video Screen change size.
                    mediaPlayer.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() {
                        @Override
                        public void onVideoSizeChanged(MediaPlayer mp, int width, int height) {

                            // Re-Set the videoView that acts as the anchor for the MediaController
                            mediaController.setAnchorView(videoView);
                        }
                    });
                }
            });

        }
    }

    // Find ID corresponding to the name of the resource (in the directory raw).
    public int getRawResIdByName(String resName) {
        String pkgName = this.getPackageName();
        // Return 0 if not found.
        int resID = this.getResources().getIdentifier(resName, "raw", pkgName);
        Log.i("AndroidVideoView", "Res Name: " + resName + "==> Res ID = " + resID);
        return resID;
    }


    // When you change direction of phone, this method will be called.
    // It store the state of video (Current position)
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        // Store current position.
        savedInstanceState.putInt("CurrentPosition", videoView.getCurrentPosition());
        videoView.start();
    }


    // After rotating the phone. This method is called.
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        // Get saved position.
        position = savedInstanceState.getInt("CurrentPosition");
        videoView.seekTo(position);
    }

    @Override
    public void onClick(View view) {

        if (view == txtLike || view == imgLike) {
            imgLike.setVisibility(View.GONE);
            imgLikeFilled.setVisibility(View.VISIBLE);
        }
        if (view == txtSavePost || view == imgSavePost) {
            imgSavePost.setVisibility(View.GONE);
            imgSavePostFilled.setVisibility(View.VISIBLE);
        }
        if (view == imgLikeFilled) {
            imgLikeFilled.setVisibility(View.GONE);
            imgLike.setVisibility(View.VISIBLE);
        }
        if (view == imgSavePostFilled) {
            imgSavePostFilled.setVisibility(View.GONE);
            imgSavePost.setVisibility(View.VISIBLE);
        }


    }
}