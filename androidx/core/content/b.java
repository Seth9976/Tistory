package androidx.core.content;

import android.content.Context;
import androidx.annotation.DoNotInline;

public abstract class b {
    @DoNotInline
    public static int a(Context context0, int v) {
        return context0.getColor(v);
    }

    @DoNotInline
    public static Object b(Context context0, Class class0) {
        return context0.getSystemService(class0);
    }

    @DoNotInline
    public static String c(Context context0, Class class0) {
        return context0.getSystemServiceName(class0);
    }
}

