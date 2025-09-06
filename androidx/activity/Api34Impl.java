package androidx.activity;

import android.window.BackEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RequiresApi(34)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001J/\u0010\t\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0005\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\bH\u0007¢\u0006\u0004\b\u0005\u0010\fJ\u0017\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\bH\u0007¢\u0006\u0004\b\u0003\u0010\fJ\u0017\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\bH\u0007¢\u0006\u0004\b\u0004\u0010\fJ\u0017\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u000B\u001A\u00020\bH\u0007¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u000E"}, d2 = {"Landroidx/activity/Api34Impl;", "", "", "touchX", "touchY", "progress", "", "swipeEdge", "Landroid/window/BackEvent;", "createOnBackEvent", "(FFFI)Landroid/window/BackEvent;", "backEvent", "(Landroid/window/BackEvent;)F", "(Landroid/window/BackEvent;)I", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Api34Impl {
    @NotNull
    public static final Api34Impl INSTANCE;

    static {
        Api34Impl.INSTANCE = new Api34Impl();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    @NotNull
    public final BackEvent createOnBackEvent(float f, float f1, float f2, int v) {
        return new BackEvent(f, f1, f2, v);
    }

    @DoNotInline
    public final float progress(@NotNull BackEvent backEvent0) {
        Intrinsics.checkNotNullParameter(backEvent0, "backEvent");
        return backEvent0.getProgress();
    }

    @DoNotInline
    public final int swipeEdge(@NotNull BackEvent backEvent0) {
        Intrinsics.checkNotNullParameter(backEvent0, "backEvent");
        return backEvent0.getSwipeEdge();
    }

    @DoNotInline
    public final float touchX(@NotNull BackEvent backEvent0) {
        Intrinsics.checkNotNullParameter(backEvent0, "backEvent");
        return backEvent0.getTouchX();
    }

    @DoNotInline
    public final float touchY(@NotNull BackEvent backEvent0) {
        Intrinsics.checkNotNullParameter(backEvent0, "backEvent");
        return backEvent0.getTouchY();
    }
}

