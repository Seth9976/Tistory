package androidx.core.content;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.util.Log;
import android.view.Display;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class f {
    @DoNotInline
    @NonNull
    public static Context a(@NonNull Context context0, @Nullable String s) {
        return context0.createAttributionContext(s);
    }

    @DoNotInline
    public static String b(Context context0) {
        return context0.getAttributionTag();
    }

    @DoNotInline
    public static Display c(Context context0) {
        try {
            return context0.getDisplay();
        }
        catch(UnsupportedOperationException unused_ex) {
            Log.w("ContextCompat", "The context:" + context0 + " is not associated with any display. Return a fallback display instead.");
            return ((DisplayManager)context0.getSystemService(DisplayManager.class)).getDisplay(0);
        }
    }
}

