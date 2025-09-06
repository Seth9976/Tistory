package androidx.activity;

import android.view.Window;
import androidx.annotation.DoNotInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public class q extends o {
    @Override  // androidx.activity.o
    @DoNotInline
    public void adjustLayoutInDisplayCutoutMode(@NotNull Window window0) {
        Intrinsics.checkNotNullParameter(window0, "window");
        p.w(window0.getAttributes());
    }
}

