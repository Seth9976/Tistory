package coil.request;

import kotlin.Metadata;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\n\u001A\u00020\u000BH&R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0004R\u0018\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006X¦\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcoil/request/Disposable;", "", "isDisposed", "", "()Z", "job", "Lkotlinx/coroutines/Deferred;", "Lcoil/request/ImageResult;", "getJob", "()Lkotlinx/coroutines/Deferred;", "dispose", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface Disposable {
    void dispose();

    @NotNull
    Deferred getJob();

    boolean isDisposed();
}

