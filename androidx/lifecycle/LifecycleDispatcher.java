package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/lifecycle/LifecycleDispatcher;", "", "Landroid/content/Context;", "context", "", "init", "(Landroid/content/Context;)V", "DispatcherActivityCallback", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LifecycleDispatcher {
    @VisibleForTesting
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001A\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\b\u0010\u0007\u001A\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Landroidx/lifecycle/LifecycleDispatcher$DispatcherActivityCallback;", "Landroidx/lifecycle/EmptyActivityLifecycleCallbacks;", "()V", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class DispatcherActivityCallback extends EmptyActivityLifecycleCallbacks {
        @Override  // androidx.lifecycle.EmptyActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity0, @Nullable Bundle bundle0) {
            Intrinsics.checkNotNullParameter(activity0, "activity");
            ReportFragment.Companion.injectIfNeededIn(activity0);
        }
    }

    @NotNull
    public static final LifecycleDispatcher INSTANCE;
    public static final AtomicBoolean a;

    static {
        LifecycleDispatcher.INSTANCE = new LifecycleDispatcher();  // 初始化器: Ljava/lang/Object;-><init>()V
        LifecycleDispatcher.a = new AtomicBoolean(false);
    }

    @JvmStatic
    public static final void init(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        if(LifecycleDispatcher.a.getAndSet(true)) {
            return;
        }
        Context context1 = context0.getApplicationContext();
        Intrinsics.checkNotNull(context1, "null cannot be cast to non-null type android.app.Application");
        ((Application)context1).registerActivityLifecycleCallbacks(new DispatcherActivityCallback());
    }
}

