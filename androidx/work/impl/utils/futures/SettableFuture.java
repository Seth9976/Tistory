package androidx.work.impl.utils.futures;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.ListenableFuture;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class SettableFuture extends AbstractFuture {
    public static SettableFuture create() {
        return new SettableFuture();  // 初始化器: Landroidx/work/impl/utils/futures/AbstractFuture;-><init>()V
    }

    @Override  // androidx.work.impl.utils.futures.AbstractFuture
    public boolean set(@Nullable Object object0) {
        return super.set(object0);
    }

    @Override  // androidx.work.impl.utils.futures.AbstractFuture
    public boolean setException(Throwable throwable0) {
        return super.setException(throwable0);
    }

    @Override  // androidx.work.impl.utils.futures.AbstractFuture
    public boolean setFuture(ListenableFuture listenableFuture0) {
        return super.setFuture(listenableFuture0);
    }
}

