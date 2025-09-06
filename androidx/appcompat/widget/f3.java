package androidx.appcompat.widget;

import android.content.res.TypedArray;
import androidx.annotation.DoNotInline;

public abstract class f3 {
    @DoNotInline
    public static int a(TypedArray typedArray0) {
        return typedArray0.getChangingConfigurations();
    }

    @DoNotInline
    public static int b(TypedArray typedArray0, int v) {
        return typedArray0.getType(v);
    }
}

