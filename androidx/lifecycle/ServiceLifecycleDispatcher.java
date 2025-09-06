package androidx.lifecycle;

import android.os.Handler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0010B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000F\u0010\n\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000F\u0010\u000B\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u000B\u0010\bR\u0014\u0010\u000F\u001A\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\r\u0010\u000E¨\u0006\u0011"}, d2 = {"Landroidx/lifecycle/ServiceLifecycleDispatcher;", "", "Landroidx/lifecycle/LifecycleOwner;", "provider", "<init>", "(Landroidx/lifecycle/LifecycleOwner;)V", "", "onServicePreSuperOnCreate", "()V", "onServicePreSuperOnBind", "onServicePreSuperOnStart", "onServicePreSuperOnDestroy", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "DispatchRunnable", "lifecycle-service_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class ServiceLifecycleDispatcher {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Landroidx/lifecycle/ServiceLifecycleDispatcher$DispatchRunnable;", "Ljava/lang/Runnable;", "Landroidx/lifecycle/LifecycleRegistry;", "registry", "Landroidx/lifecycle/Lifecycle$Event;", "event", "<init>", "(Landroidx/lifecycle/LifecycleRegistry;Landroidx/lifecycle/Lifecycle$Event;)V", "", "run", "()V", "b", "Landroidx/lifecycle/Lifecycle$Event;", "getEvent", "()Landroidx/lifecycle/Lifecycle$Event;", "lifecycle-service_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class DispatchRunnable implements Runnable {
        public final LifecycleRegistry a;
        public final Event b;
        public boolean c;

        public DispatchRunnable(@NotNull LifecycleRegistry lifecycleRegistry0, @NotNull Event lifecycle$Event0) {
            Intrinsics.checkNotNullParameter(lifecycleRegistry0, "registry");
            Intrinsics.checkNotNullParameter(lifecycle$Event0, "event");
            super();
            this.a = lifecycleRegistry0;
            this.b = lifecycle$Event0;
        }

        @NotNull
        public final Event getEvent() {
            return this.b;
        }

        @Override
        public void run() {
            if(!this.c) {
                this.a.handleLifecycleEvent(this.b);
                this.c = true;
            }
        }
    }

    public final LifecycleRegistry a;
    public final Handler b;
    public DispatchRunnable c;

    public ServiceLifecycleDispatcher(@NotNull LifecycleOwner lifecycleOwner0) {
        Intrinsics.checkNotNullParameter(lifecycleOwner0, "provider");
        super();
        this.a = new LifecycleRegistry(lifecycleOwner0);
        this.b = new Handler();
    }

    public final void a(Event lifecycle$Event0) {
        DispatchRunnable serviceLifecycleDispatcher$DispatchRunnable0 = this.c;
        if(serviceLifecycleDispatcher$DispatchRunnable0 != null) {
            serviceLifecycleDispatcher$DispatchRunnable0.run();
        }
        DispatchRunnable serviceLifecycleDispatcher$DispatchRunnable1 = new DispatchRunnable(this.a, lifecycle$Event0);
        this.c = serviceLifecycleDispatcher$DispatchRunnable1;
        Intrinsics.checkNotNull(serviceLifecycleDispatcher$DispatchRunnable1);
        this.b.postAtFrontOfQueue(serviceLifecycleDispatcher$DispatchRunnable1);
    }

    @NotNull
    public Lifecycle getLifecycle() {
        return this.a;
    }

    public void onServicePreSuperOnBind() {
        this.a(Event.ON_START);
    }

    public void onServicePreSuperOnCreate() {
        this.a(Event.ON_CREATE);
    }

    public void onServicePreSuperOnDestroy() {
        this.a(Event.ON_STOP);
        this.a(Event.ON_DESTROY);
    }

    public void onServicePreSuperOnStart() {
        this.a(Event.ON_START);
    }
}

