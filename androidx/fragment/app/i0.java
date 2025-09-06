package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;

public abstract class i0 {
    public static int a(Context context0, int v) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(0x1030001, new int[]{v});
        int v1 = typedArray0.getResourceId(0, -1);
        typedArray0.recycle();
        return v1;
    }
}

