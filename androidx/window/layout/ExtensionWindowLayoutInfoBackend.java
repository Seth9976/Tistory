package androidx.window.layout;

import android.app.Activity;
import androidx.core.util.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0012B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u001D\u0010\u0010\u001A\u00020\r2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/window/layout/ExtensionWindowLayoutInfoBackend;", "Landroidx/window/layout/WindowBackend;", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "component", "<init>", "(Landroidx/window/extensions/layout/WindowLayoutComponent;)V", "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/Consumer;", "Landroidx/window/layout/WindowLayoutInfo;", "callback", "", "registerLayoutChangeCallback", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)V", "unregisterLayoutChangeCallback", "(Landroidx/core/util/Consumer;)V", "androidx/window/layout/b", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class ExtensionWindowLayoutInfoBackend implements WindowBackend {
    public final WindowLayoutComponent a;
    public final ReentrantLock b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;

    public ExtensionWindowLayoutInfoBackend(@NotNull WindowLayoutComponent windowLayoutComponent0) {
        Intrinsics.checkNotNullParameter(windowLayoutComponent0, "component");
        super();
        this.a = windowLayoutComponent0;
        this.b = new ReentrantLock();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    @Override  // androidx.window.layout.WindowBackend
    public void registerLayoutChangeCallback(@NotNull Activity activity0, @NotNull Executor executor0, @NotNull Consumer consumer0) {
        Unit unit0;
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Intrinsics.checkNotNullParameter(executor0, "executor");
        Intrinsics.checkNotNullParameter(consumer0, "callback");
        ReentrantLock reentrantLock0 = this.b;
        reentrantLock0.lock();
        LinkedHashMap linkedHashMap0 = this.c;
        try {
            b b0 = (b)linkedHashMap0.get(activity0);
            LinkedHashMap linkedHashMap1 = this.d;
            if(b0 == null) {
                unit0 = null;
            }
            else {
                b0.a(consumer0);
                linkedHashMap1.put(consumer0, activity0);
                unit0 = Unit.INSTANCE;
            }
            if(unit0 == null) {
                b b1 = new b(activity0);
                linkedHashMap0.put(activity0, b1);
                linkedHashMap1.put(consumer0, activity0);
                b1.a(consumer0);
                this.a.addWindowLayoutInfoListener(activity0, b1);
            }
        }
        finally {
            reentrantLock0.unlock();
        }
    }

    @Override  // androidx.window.layout.WindowBackend
    public void unregisterLayoutChangeCallback(@NotNull Consumer consumer0) {
        Intrinsics.checkNotNullParameter(consumer0, "callback");
        ReentrantLock reentrantLock0 = this.b;
        reentrantLock0.lock();
        try {
            Activity activity0 = (Activity)this.d.get(consumer0);
            if(activity0 == null) {
                return;
            }
            b b0 = (b)this.c.get(activity0);
            if(b0 == null) {
                return;
            }
            b0.c(consumer0);
            if(b0.b()) {
                this.a.removeWindowLayoutInfoListener(b0);
            }
        }
        finally {
            reentrantLock0.unlock();
        }
    }
}

