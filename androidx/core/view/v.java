package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;
import androidx.annotation.DoNotInline;

public abstract class v {
    @DoNotInline
    public static PointerIcon a(Bitmap bitmap0, float f, float f1) {
        return PointerIcon.create(bitmap0, f, f1);
    }

    @DoNotInline
    public static PointerIcon b(Context context0, int v) {
        return PointerIcon.getSystemIcon(context0, v);
    }

    @DoNotInline
    public static PointerIcon c(Resources resources0, int v) {
        return PointerIcon.load(resources0, v);
    }
}

