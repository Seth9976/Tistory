package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP})
public class WindowUtils {
    @NonNull
    public static Rect getCurrentWindowBounds(@NonNull Context context0) {
        WindowManager windowManager0 = (WindowManager)context0.getSystemService("window");
        if(Build.VERSION.SDK_INT >= 30) {
            return windowManager0.getCurrentWindowMetrics().getBounds();
        }
        Display display0 = windowManager0.getDefaultDisplay();
        Point point0 = new Point();
        display0.getRealSize(point0);
        Rect rect0 = new Rect();
        rect0.right = point0.x;
        rect0.bottom = point0.y;
        return rect0;
    }
}

