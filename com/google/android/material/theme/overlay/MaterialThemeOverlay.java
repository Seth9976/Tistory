package com.google.android.material.theme.overlay;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.ContextThemeWrapper;
import com.google.android.material.R.attr;

public class MaterialThemeOverlay {
    public static final int[] a;
    public static final int[] b;

    static {
        MaterialThemeOverlay.a = new int[]{0x1010000, attr.theme};
        MaterialThemeOverlay.b = new int[]{attr.materialThemeOverlay};
    }

    @NonNull
    public static Context wrap(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v, @StyleRes int v1) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, MaterialThemeOverlay.b, v, v1);
        int v2 = typedArray0.getResourceId(0, 0);
        typedArray0.recycle();
        if(v2 != 0 && (!(context0 instanceof ContextThemeWrapper) || ((ContextThemeWrapper)context0).getThemeResId() != v2)) {
            Context context1 = new ContextThemeWrapper(context0, v2);
            TypedArray typedArray1 = context0.obtainStyledAttributes(attributeSet0, MaterialThemeOverlay.a);
            int v3 = typedArray1.getResourceId(0, 0);
            int v4 = typedArray1.getResourceId(1, 0);
            typedArray1.recycle();
            if(v3 == 0) {
                v3 = v4;
            }
            if(v3 != 0) {
                ((ContextThemeWrapper)context1).getTheme().applyStyle(v3, true);
            }
            return context1;
        }
        return context0;
    }
}

