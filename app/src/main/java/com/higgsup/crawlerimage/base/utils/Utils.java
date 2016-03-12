package com.higgsup.crawlerimage.base.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.Camera;

import java.lang.reflect.Method;

/**
 * Created by Trung on 10/12/2015.
 */
public class Utils
{
    public static boolean checkCameraHardware(Context context)
    {
        if (context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}