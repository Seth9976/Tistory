package androidx.window.layout;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000E2\u00020\u0001:\u0001\u000EB\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001D\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\n2\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000F"}, d2 = {"Landroidx/window/layout/WindowInfoTrackerImpl;", "Landroidx/window/layout/WindowInfoTracker;", "Landroidx/window/layout/WindowMetricsCalculator;", "windowMetricsCalculator", "Landroidx/window/layout/WindowBackend;", "windowBackend", "<init>", "(Landroidx/window/layout/WindowMetricsCalculator;Landroidx/window/layout/WindowBackend;)V", "Landroid/app/Activity;", "activity", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/window/layout/WindowLayoutInfo;", "windowLayoutInfo", "(Landroid/app/Activity;)Lkotlinx/coroutines/flow/Flow;", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class WindowInfoTrackerImpl implements WindowInfoTracker {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/window/layout/WindowInfoTrackerImpl$Companion;", "", "", "BUFFER_CAPACITY", "I", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final WindowMetricsCalculator a;
    public final WindowBackend b;

    static {
        WindowInfoTrackerImpl.Companion = new Companion(null);
    }

    public WindowInfoTrackerImpl(@NotNull WindowMetricsCalculator windowMetricsCalculator0, @NotNull WindowBackend windowBackend0) {
        Intrinsics.checkNotNullParameter(windowMetricsCalculator0, "windowMetricsCalculator");
        Intrinsics.checkNotNullParameter(windowBackend0, "windowBackend");
        super();
        this.a = windowMetricsCalculator0;
        this.b = windowBackend0;
    }

    @Override  // androidx.window.layout.WindowInfoTracker
    @NotNull
    public Flow windowLayoutInfo(@NotNull Activity activity0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        return FlowKt.flow(new k(this, activity0, null));
    }
}

