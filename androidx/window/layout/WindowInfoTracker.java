package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0016\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u0006H&¨\u0006\b"}, d2 = {"Landroidx/window/layout/WindowInfoTracker;", "", "windowLayoutInfo", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/window/layout/WindowLayoutInfo;", "activity", "Landroid/app/Activity;", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public interface WindowInfoTracker {
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001A\u00020\u00072\u0006\u0010\u0003\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000E\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u000BH\u0007¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0010\u001A\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/window/layout/WindowInfoTracker$Companion;", "", "Landroid/content/Context;", "context", "Landroidx/window/layout/WindowInfoTracker;", "getOrCreate", "(Landroid/content/Context;)Landroidx/window/layout/WindowInfoTracker;", "Landroidx/window/layout/WindowBackend;", "windowBackend$window_release", "(Landroid/content/Context;)Landroidx/window/layout/WindowBackend;", "windowBackend", "Landroidx/window/layout/WindowInfoTrackerDecorator;", "overridingDecorator", "", "overrideDecorator", "(Landroidx/window/layout/WindowInfoTrackerDecorator;)V", "reset", "()V", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
    public static final class Companion {
        public static final Companion a;
        public static WindowInfoTrackerDecorator b;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
            Reflection.getOrCreateKotlinClass(WindowInfoTracker.class).getSimpleName();
            Companion.b = a.a;
        }

        @JvmName(name = "getOrCreate")
        @JvmStatic
        @NotNull
        public final WindowInfoTracker getOrCreate(@NotNull Context context0) {
            Intrinsics.checkNotNullParameter(context0, "context");
            WindowBackend windowBackend0 = this.windowBackend$window_release(context0);
            WindowInfoTrackerImpl windowInfoTrackerImpl0 = new WindowInfoTrackerImpl(WindowMetricsCalculatorCompat.INSTANCE, windowBackend0);
            return Companion.b.decorate(windowInfoTrackerImpl0);
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @JvmStatic
        public final void overrideDecorator(@NotNull WindowInfoTrackerDecorator windowInfoTrackerDecorator0) {
            Intrinsics.checkNotNullParameter(windowInfoTrackerDecorator0, "overridingDecorator");
            Companion.b = windowInfoTrackerDecorator0;
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @JvmStatic
        public final void reset() {
            Companion.b = a.a;
        }

        @NotNull
        public final WindowBackend windowBackend$window_release(@NotNull Context context0) {
            Intrinsics.checkNotNullParameter(context0, "context");
            WindowBackend windowBackend0 = null;
            try {
                WindowLayoutComponent windowLayoutComponent0 = SafeWindowLayoutComponentProvider.INSTANCE.getWindowLayoutComponent();
                if(windowLayoutComponent0 != null) {
                    windowBackend0 = new ExtensionWindowLayoutInfoBackend(windowLayoutComponent0);
                }
            }
            catch(Throwable unused_ex) {
            }
            return windowBackend0 == null ? SidecarWindowBackend.Companion.getInstance(context0) : windowBackend0;
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        WindowInfoTracker.Companion = Companion.a;
    }

    @JvmName(name = "getOrCreate")
    @JvmStatic
    @NotNull
    static WindowInfoTracker getOrCreate(@NotNull Context context0) {
        return WindowInfoTracker.Companion.getOrCreate(context0);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @JvmStatic
    static void overrideDecorator(@NotNull WindowInfoTrackerDecorator windowInfoTrackerDecorator0) {
        WindowInfoTracker.Companion.overrideDecorator(windowInfoTrackerDecorator0);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @JvmStatic
    static void reset() {
        WindowInfoTracker.Companion.reset();
    }

    @NotNull
    Flow windowLayoutInfo(@NotNull Activity arg1);
}

