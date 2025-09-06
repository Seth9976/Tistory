package androidx.transition;

import android.view.View;
import androidx.annotation.NonNull;

interface ViewGroupOverlayImpl extends ViewOverlayImpl {
    void add(@NonNull View arg1);

    void remove(@NonNull View arg1);
}

