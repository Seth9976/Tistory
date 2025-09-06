package androidx.activity;

import android.view.Window;
import androidx.annotation.DoNotInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class u extends t {
    @Override  // androidx.activity.q
    @DoNotInline
    public void adjustLayoutInDisplayCutoutMode(@NotNull Window window0) {
        Intrinsics.checkNotNullParameter(window0, "window");
        p.D(window0.getAttributes());
    }
}

