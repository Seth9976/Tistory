package androidx.appcompat.widget;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;

public abstract class l0 {
    @DoNotInline
    public static int a(@NonNull View view0) {
        return view0.getTextAlignment();
    }

    @DoNotInline
    public static int b(@NonNull View view0) {
        return view0.getTextDirection();
    }

    @DoNotInline
    public static void c(@NonNull View view0, int v) {
        view0.setTextAlignment(v);
    }

    @DoNotInline
    public static void d(@NonNull View view0, int v) {
        view0.setTextDirection(v);
    }
}

