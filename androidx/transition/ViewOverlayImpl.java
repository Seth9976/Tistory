package androidx.transition;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

interface ViewOverlayImpl {
    void add(@NonNull Drawable arg1);

    void remove(@NonNull Drawable arg1);
}

