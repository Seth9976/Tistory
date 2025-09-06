package coil.request;

import android.view.View;
import coil.util.-Utils;
import kotlin.Metadata;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000BR(\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016@\u0016X\u0096\u000E¢\u0006\u0012\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001A\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcoil/request/ViewTargetDisposable;", "Lcoil/request/Disposable;", "Landroid/view/View;", "view", "Lkotlinx/coroutines/Deferred;", "Lcoil/request/ImageResult;", "job", "<init>", "(Landroid/view/View;Lkotlinx/coroutines/Deferred;)V", "", "dispose", "()V", "b", "Lkotlinx/coroutines/Deferred;", "getJob", "()Lkotlinx/coroutines/Deferred;", "setJob", "(Lkotlinx/coroutines/Deferred;)V", "", "isDisposed", "()Z", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ViewTargetDisposable implements Disposable {
    public final View a;
    public volatile Deferred b;

    public ViewTargetDisposable(@NotNull View view0, @NotNull Deferred deferred0) {
        this.a = view0;
        this.b = deferred0;
    }

    @Override  // coil.request.Disposable
    public void dispose() {
        if(this.isDisposed()) {
            return;
        }
        -Utils.getRequestManager(this.a).dispose();
    }

    @Override  // coil.request.Disposable
    @NotNull
    public Deferred getJob() {
        return this.b;
    }

    @Override  // coil.request.Disposable
    public boolean isDisposed() {
        return -Utils.getRequestManager(this.a).isDisposed(this);
    }

    public void setJob(@NotNull Deferred deferred0) {
        this.b = deferred0;
    }
}

