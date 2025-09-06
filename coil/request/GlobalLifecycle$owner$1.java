package coil.request;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001A\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"coil/request/GlobalLifecycle$owner$1", "Landroidx/lifecycle/LifecycleOwner;", "lifecycle", "Lcoil/request/GlobalLifecycle;", "getLifecycle", "()Lcoil/request/GlobalLifecycle;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GlobalLifecycle.owner.1 implements LifecycleOwner {
    @Override  // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.getLifecycle();
    }

    @NotNull
    public GlobalLifecycle getLifecycle() {
        return GlobalLifecycle.INSTANCE;
    }
}

