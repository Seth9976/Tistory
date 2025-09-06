package androidx.appcompat.widget;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class k0 {
    @DoNotInline
    public static void a(@NonNull ViewTreeObserver viewTreeObserver0, @Nullable ViewTreeObserver.OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener0) {
        viewTreeObserver0.removeOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListener0);
    }
}

