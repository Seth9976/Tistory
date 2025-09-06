package androidx.concurrent.futures;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.ListenableFuture;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public final class ResolvableFuture extends AbstractResolvableFuture {
    public static ResolvableFuture create() {
        return new ResolvableFuture();  // 初始化器: Landroidx/concurrent/futures/AbstractResolvableFuture;-><init>()V
    }

    @Override  // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean set(@Nullable Object object0) {
        return super.set(object0);
    }

    @Override  // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean setException(Throwable throwable0) {
        return super.setException(throwable0);
    }

    @Override  // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean setFuture(ListenableFuture listenableFuture0) {
        return super.setFuture(listenableFuture0);
    }
}

