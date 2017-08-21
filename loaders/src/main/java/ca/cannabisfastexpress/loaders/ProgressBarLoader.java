package ca.cannabisfastexpress.loaders;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

/**
 * Created by Manik on 7/25/2017.
 */

public class ProgressBarLoader
{
    private final Dialog dialog;
    private final View progressBar;
    private Context context;

    public ProgressBarLoader(Context context)
    {
        this.context = context;

        View view= ((LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.progress_bar_loader,null);
        progressBar=view.findViewById(R.id.progressBar);
        dialog = new Dialog(context, android.R.style.Theme_DeviceDefault_Light_NoActionBar_Fullscreen);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialog.setContentView(view);
    }

    public void show()
    {
        if (dialog != null)
            dialog.show();
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

//    public void changeLoaderColor()
//    {
//    }

}
