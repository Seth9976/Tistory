package androidx.core.view;

import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;

public abstract class e1 {
    @DoNotInline
    public static void a(@NonNull Window window0, boolean z) {
        window0.setDecorFitsSystemWindows(z);
    }
}

