package coil.request;

import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import coil.ImageLoader;
import coil.target.ViewTarget;
import coil.util.-Lifecycles;
import coil.util.-Utils;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\n\u0010\u0007\u001A\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0007¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0011\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000F\u0010\u0012\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u000F\u0010\u0013\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0016\u001A\u00020\u000E2\u0006\u0010\u0015\u001A\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcoil/request/ViewTargetRequestDelegate;", "Lcoil/request/RequestDelegate;", "Lcoil/ImageLoader;", "imageLoader", "Lcoil/request/ImageRequest;", "initialRequest", "Lcoil/target/ViewTarget;", "target", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lkotlinx/coroutines/Job;", "job", "<init>", "(Lcoil/ImageLoader;Lcoil/request/ImageRequest;Lcoil/target/ViewTarget;Landroidx/lifecycle/Lifecycle;Lkotlinx/coroutines/Job;)V", "", "restart", "()V", "assertActive", "start", "dispose", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onDestroy", "(Landroidx/lifecycle/LifecycleOwner;)V", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ViewTargetRequestDelegate implements RequestDelegate {
    public final ImageLoader a;
    public final ImageRequest b;
    public final ViewTarget c;
    public final Lifecycle d;
    public final Job e;

    public ViewTargetRequestDelegate(@NotNull ImageLoader imageLoader0, @NotNull ImageRequest imageRequest0, @NotNull ViewTarget viewTarget0, @NotNull Lifecycle lifecycle0, @NotNull Job job0) {
        this.a = imageLoader0;
        this.b = imageRequest0;
        this.c = viewTarget0;
        this.d = lifecycle0;
        this.e = job0;
    }

    @Override  // coil.request.RequestDelegate
    public void assertActive() {
        ViewTarget viewTarget0 = this.c;
        if(viewTarget0.getView().isAttachedToWindow()) {
            return;
        }
        -Utils.getRequestManager(viewTarget0.getView()).setRequest(this);
        throw new CancellationException("\'ViewTarget.view\' must be attached to a window.");
    }

    @Override  // coil.request.RequestDelegate
    public void dispose() {
        DefaultImpls.cancel$default(this.e, null, 1, null);
        ViewTarget viewTarget0 = this.c;
        Lifecycle lifecycle0 = this.d;
        if(viewTarget0 instanceof LifecycleObserver) {
            lifecycle0.removeObserver(((LifecycleObserver)viewTarget0));
        }
        lifecycle0.removeObserver(this);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner lifecycleOwner0) {
        -Utils.getRequestManager(this.c.getView()).dispose();
    }

    @MainThread
    public final void restart() {
        this.a.enqueue(this.b);
    }

    @Override  // coil.request.RequestDelegate
    public void start() {
        Lifecycle lifecycle0 = this.d;
        lifecycle0.addObserver(this);
        ViewTarget viewTarget0 = this.c;
        if(viewTarget0 instanceof LifecycleObserver) {
            -Lifecycles.removeAndAddObserver(lifecycle0, ((LifecycleObserver)viewTarget0));
        }
        -Utils.getRequestManager(viewTarget0.getView()).setRequest(this);
    }
}

