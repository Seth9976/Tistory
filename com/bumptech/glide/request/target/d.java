package com.bumptech.glide.request.target;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.bumptech.glide.util.Preconditions;
import java.util.ArrayList;

public final class d {
    public final View a;
    public final ArrayList b;
    public boolean c;
    public a d;
    public static Integer e;

    public d(View view0) {
        this.b = new ArrayList();
        this.a = view0;
    }

    public final int a(int v, int v1, int v2) {
        int v3 = v1 - v2;
        if(v3 > 0) {
            return v3;
        }
        View view0 = this.a;
        if(this.c && view0.isLayoutRequested()) {
            return 0;
        }
        int v4 = v - v2;
        if(v4 > 0) {
            return v4;
        }
        if(!view0.isLayoutRequested() && v1 == -2) {
            if(Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device\'s screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context0 = view0.getContext();
            if(d.e == null) {
                Display display0 = ((WindowManager)Preconditions.checkNotNull(((WindowManager)context0.getSystemService("window")))).getDefaultDisplay();
                Point point0 = new Point();
                display0.getSize(point0);
                d.e = Math.max(point0.x, point0.y);
            }
            return (int)d.e;
        }
        return 0;
    }
}

