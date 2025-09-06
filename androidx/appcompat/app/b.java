package androidx.appcompat.app;

import android.app.ActionBar;
import android.graphics.drawable.Drawable;
import androidx.annotation.DoNotInline;

public abstract class b {
    @DoNotInline
    public static void a(ActionBar actionBar0, int v) {
        actionBar0.setHomeActionContentDescription(v);
    }

    @DoNotInline
    public static void b(ActionBar actionBar0, Drawable drawable0) {
        actionBar0.setHomeAsUpIndicator(drawable0);
    }
}

