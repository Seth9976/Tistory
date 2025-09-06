package androidx.window.layout;

import android.graphics.Rect;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.window.core.Bounds;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0017\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000F\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u001A\u0010\u000E\u001A\u00020\r2\b\u0010\f\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001A\u00020\u00068F¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/window/layout/WindowMetrics;", "", "Landroidx/window/core/Bounds;", "_bounds", "<init>", "(Landroidx/window/core/Bounds;)V", "Landroid/graphics/Rect;", "bounds", "(Landroid/graphics/Rect;)V", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getBounds", "()Landroid/graphics/Rect;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class WindowMetrics {
    public final Bounds a;

    @RestrictTo({Scope.TESTS})
    public WindowMetrics(@NotNull Rect rect0) {
        Intrinsics.checkNotNullParameter(rect0, "bounds");
        this(new Bounds(rect0));
    }

    public WindowMetrics(@NotNull Bounds bounds0) {
        Intrinsics.checkNotNullParameter(bounds0, "_bounds");
        super();
        this.a = bounds0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return Intrinsics.areEqual(WindowMetrics.class, class0) ? Intrinsics.areEqual(this.a, ((WindowMetrics)object0).a) : false;
        }
        return false;
    }

    @NotNull
    public final Rect getBounds() {
        return this.a.toRect();
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "WindowMetrics { bounds: " + this.getBounds() + " }";
    }
}

