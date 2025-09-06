package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.CallSuper;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000F\u0010\u0006\u001A\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\n\u001A\u0004\u0018\u00010\t2\u0006\u0010\b\u001A\u00020\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000BJ!\u0010\u000E\u001A\u00020\u00052\b\u0010\b\u001A\u0004\u0018\u00010\u00072\u0006\u0010\r\u001A\u00020\fH\u0017¢\u0006\u0004\b\u000E\u0010\u000FJ)\u0010\u0011\u001A\u00020\f2\b\u0010\b\u001A\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0013\u001A\u00020\u0005H\u0017¢\u0006\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0017\u001A\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/lifecycle/LifecycleService;", "Landroid/app/Service;", "Landroidx/lifecycle/LifecycleOwner;", "<init>", "()V", "", "onCreate", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "", "startId", "onStart", "(Landroid/content/Intent;I)V", "flags", "onStartCommand", "(Landroid/content/Intent;II)I", "onDestroy", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "lifecycle-service_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class LifecycleService extends Service implements LifecycleOwner {
    public final ServiceLifecycleDispatcher a;

    public LifecycleService() {
        this.a = new ServiceLifecycleDispatcher(this);
    }

    @Override  // androidx.lifecycle.LifecycleOwner
    @NotNull
    public Lifecycle getLifecycle() {
        return this.a.getLifecycle();
    }

    @Override  // android.app.Service
    @CallSuper
    @Nullable
    public IBinder onBind(@NotNull Intent intent0) {
        Intrinsics.checkNotNullParameter(intent0, "intent");
        this.a.onServicePreSuperOnBind();
        return null;
    }

    @Override  // android.app.Service
    @CallSuper
    public void onCreate() {
        this.a.onServicePreSuperOnCreate();
        super.onCreate();
    }

    @Override  // android.app.Service
    @CallSuper
    public void onDestroy() {
        this.a.onServicePreSuperOnDestroy();
        super.onDestroy();
    }

    @Override  // android.app.Service
    @CallSuper
    @Deprecated(message = "Deprecated in Java")
    public void onStart(@Nullable Intent intent0, int v) {
        this.a.onServicePreSuperOnStart();
        super.onStart(intent0, v);
    }

    @Override  // android.app.Service
    @CallSuper
    public int onStartCommand(@Nullable Intent intent0, int v, int v1) {
        return super.onStartCommand(intent0, v, v1);
    }
}

