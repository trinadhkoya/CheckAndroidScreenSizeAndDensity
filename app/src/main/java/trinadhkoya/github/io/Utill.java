package trinadhkoya.github.io;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;

/**
 * Created by trina on 9/21/2016.
 */

public class Utill {


    private static final String TAG = Utill.class.getCanonicalName();

    public String loadDisplayMetrics(Context context) {

        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();

        Log.d(TAG, "density " + displayMetrics.density);
        Log.d(TAG, "densitydpi " + displayMetrics.densityDpi);
        Log.d(TAG, "height " + displayMetrics.heightPixels);
        Log.d(TAG, "widtch " + displayMetrics.widthPixels);

        if(displayMetrics.density==0.75){
            Log.d(TAG, "LOW it is ");
        }else if(displayMetrics.density==1.0){
            Log.d(TAG,"MDPI it is ");
        }else  if(displayMetrics.density==1.5){
            Log.d(TAG,"HDPI it is ");
        }else if(displayMetrics.density==2.0){
            Log.d(TAG,"XHDPI it is ");
        }else if(displayMetrics.density==3.0){
            Log.d(TAG,"XXHDPI it is ");
        }else if(displayMetrics.density==4.0){
            Log.d(TAG,"XXXHDPI it is ");
        }





        return displayMetrics.toString() + "density  " + displayMetrics.density + " Density dpi" + displayMetrics.densityDpi;


    }


    public static int convertPxtoDp(float dp, Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        float pixels = dp *(displayMetrics.densityDpi)/160.0f;
        Log.d(TAG, "pixels " + pixels);

        return (int) pixels;
    }


}
