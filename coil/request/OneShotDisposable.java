package coil.request;

import kotlin.Metadata;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job.DefaultImpls;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR \u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\rR\u0014\u0010\u000F\u001A\u00020\u000E8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcoil/request/OneShotDisposable;", "Lcoil/request/Disposable;", "Lkotlinx/coroutines/Deferred;", "Lcoil/request/ImageResult;", "job", "<init>", "(Lkotlinx/coroutines/Deferred;)V", "", "dispose", "()V", "a", "Lkotlinx/coroutines/Deferred;", "getJob", "()Lkotlinx/coroutines/Deferred;", "", "isDisposed", "()Z", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class OneShotDisposable implements Disposable {
    public final Deferred a;

    public OneShotDisposable(@NotNull Deferred deferred0) {
        this.a = deferred0;
    }

    @Override  // coil.request.Disposable
    public void dispose() {
        if(this.isDisposed()) {
            return;
        }
        DefaultImpls.cancel$default(this.getJob(), null, 1, null);
    }

    @Override  // coil.request.Disposable
    @NotNull
    public Deferred getJob() {
        return this.a;
    }

    @Override  // coil.request.Disposable
    public boolean isDisposed() {
        return !this.getJob().isActive();
    }
}

