package coil.request;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000F\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000E\u001A\u00020\u000B8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\r¨\u0006\u000F"}, d2 = {"Lcoil/request/GlobalLifecycle;", "Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/LifecycleObserver;", "observer", "", "addObserver", "(Landroidx/lifecycle/LifecycleObserver;)V", "removeObserver", "", "toString", "()Ljava/lang/String;", "Landroidx/lifecycle/Lifecycle$State;", "getCurrentState", "()Landroidx/lifecycle/Lifecycle$State;", "currentState", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GlobalLifecycle extends Lifecycle {
    @NotNull
    public static final GlobalLifecycle INSTANCE;
    public static final GlobalLifecycle.owner.1 b;

    static {
        GlobalLifecycle.INSTANCE = new GlobalLifecycle();  // 初始化器: Landroidx/lifecycle/Lifecycle;-><init>()V
        GlobalLifecycle.b = new GlobalLifecycle.owner.1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.lifecycle.Lifecycle
    public void addObserver(@NotNull LifecycleObserver lifecycleObserver0) {
        if(!(lifecycleObserver0 instanceof DefaultLifecycleObserver)) {
            throw new IllegalArgumentException((lifecycleObserver0 + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        ((DefaultLifecycleObserver)lifecycleObserver0).onCreate(GlobalLifecycle.b);
        ((DefaultLifecycleObserver)lifecycleObserver0).onStart(GlobalLifecycle.b);
        ((DefaultLifecycleObserver)lifecycleObserver0).onResume(GlobalLifecycle.b);
    }

    @Override  // androidx.lifecycle.Lifecycle
    @NotNull
    public State getCurrentState() {
        return State.RESUMED;
    }

    @Override  // androidx.lifecycle.Lifecycle
    public void removeObserver(@NotNull LifecycleObserver lifecycleObserver0) {
    }

    @Override
    @NotNull
    public String toString() {
        return "coil.request.GlobalLifecycle";
    }
}

