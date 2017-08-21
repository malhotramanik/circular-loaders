package ca.cannabisfastexpress.loaders;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

/**
 * Created by Manik on 7/25/2017.
 */

public class RotateImageLoader
{
    private final Dialog dialog;
    private final ImageView imageView;
    private final RotateAnimation rotate;
    private Context context;

    public RotateImageLoader(Context context, Drawable drawable)
    {
        this.context = context;

        View view = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.rotate_image_loader, null);
        imageView = (ImageView) view.findViewById(R.id.imageView);
        dialog = new Dialog(context, android.R.style.Theme_DeviceDefault_Light_NoActionBar_Fullscreen);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialog.setContentView(view);
        imageView.setImageDrawable(drawable);
        rotate = new RotateAnimation(0, 180, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotate.setRepeatCount(Animation.INFINITE);
        rotate.setRepeatMode(Animation.RESTART);
        rotate.setInterpolator(new LinearInterpolator());
        rotate.setDuration(1000);

//        imageView.startAnimation(rotate);
    }

    public void show()
    {
        if (dialog != null)
        {
            imageView.startAnimation(rotate);
            dialog.show();
        }
    }

    public void dismiss()
    {
        if (dialog != null && dialog.isShowing())
            dialog.dismiss();
    }

    public void setCancelable(Boolean cancelable)
    {

        if (dialog != null)
            dialog.setCancelable(cancelable);
    }

    public void setRotateDuration(int duration)
    {
        if (rotate != null)
        {
            rotate.setDuration(duration);
        }
    }

//    public void changeLoaderColor()
//    {
//    }

}
