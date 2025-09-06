package androidx.core.view;

import android.view.ViewStructure;
import androidx.annotation.DoNotInline;

public abstract class c1 {
    @DoNotInline
    public static void a(ViewStructure viewStructure0, String s) {
        viewStructure0.setClassName(s);
    }

    @DoNotInline
    public static void b(ViewStructure viewStructure0, CharSequence charSequence0) {
        viewStructure0.setContentDescription(charSequence0);
    }

    @DoNotInline
    public static void c(ViewStructure viewStructure0, int v, int v1, int v2, int v3, int v4, int v5) {
        viewStructure0.setDimens(v, v1, v2, v3, v4, v5);
    }

    @DoNotInline
    public static void d(ViewStructure viewStructure0, CharSequence charSequence0) {
        viewStructure0.setText(charSequence0);
    }
}

