package coil.intercept;

import coil.annotation.ExperimentalCoilApi;
import coil.request.ImageRequest;
import coil.size.Size;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0007J\u0016\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcoil/intercept/Interceptor;", "", "intercept", "Lcoil/request/ImageResult;", "chain", "Lcoil/intercept/Interceptor$Chain;", "(Lcoil/intercept/Interceptor$Chain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Chain", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface Interceptor {
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\n\u001A\u00020\u000B2\u0006\u0010\u0002\u001A\u00020\u0003H¦@¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0003H\'J\u0010\u0010\u000E\u001A\u00020\u00002\u0006\u0010\u0006\u001A\u00020\u0007H&R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001A\u00020\u0007X¦\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000FÀ\u0006\u0001"}, d2 = {"Lcoil/intercept/Interceptor$Chain;", "", "request", "Lcoil/request/ImageRequest;", "getRequest", "()Lcoil/request/ImageRequest;", "size", "Lcoil/size/Size;", "getSize", "()Lcoil/size/Size;", "proceed", "Lcoil/request/ImageResult;", "(Lcoil/request/ImageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withRequest", "withSize", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public interface Chain {
        @NotNull
        ImageRequest getRequest();

        @NotNull
        Size getSize();

        @Nullable
        Object proceed(@NotNull ImageRequest arg1, @NotNull Continuation arg2);

        @ExperimentalCoilApi
        @NotNull
        Chain withRequest(@NotNull ImageRequest arg1);

        @NotNull
        Chain withSize(@NotNull Size arg1);
    }

    @Nullable
    Object intercept(@NotNull Chain arg1, @NotNull Continuation arg2);
}

