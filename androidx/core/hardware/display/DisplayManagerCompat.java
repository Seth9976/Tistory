package androidx.core.hardware.display;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class DisplayManagerCompat {
    public static final String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
    public final Context a;

    public DisplayManagerCompat(Context context0) {
        this.a = context0;
    }

    @Nullable
    public Display getDisplay(int v) {
        return ((DisplayManager)this.a.getSystemService("display")).getDisplay(v);
    }

    @NonNull
    public Display[] getDisplays() {
        return ((DisplayManager)this.a.getSystemService("display")).getDisplays();
    }

    @NonNull
    public Display[] getDisplays(@Nullable String s) {
        return ((DisplayManager)this.a.getSystemService("display")).getDisplays();
    }

    @NonNull
    public static DisplayManagerCompat getInstance(@NonNull Context context0) {
        return new DisplayManagerCompat(context0);
    }
}

