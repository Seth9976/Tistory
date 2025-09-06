package androidx.paging;

import androidx.arch.core.util.Function;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0005B;\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u001E\u0010\t\u001A\u001A\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u0017\u0010\u0011\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000F\u0010\u0012\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0018\u001A\u00020\u000E2\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u00142\u0012\u0010\u0017\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001C\u001A\u00020\u000E2\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u001A2\u0012\u0010\u0017\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u001BH\u0016¢\u0006\u0004\b\u001C\u0010\u001DJ1\u0010\u001E\u001A\u00020\u000E2\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u001A2\u0012\u0010\u0017\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u001BH\u0016¢\u0006\u0004\b\u001E\u0010\u001DR\u0014\u0010 \u001A\u00020\u001F8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/paging/WrapperPageKeyedDataSource;", "", "K", "A", "B", "Landroidx/paging/PageKeyedDataSource;", "source", "Landroidx/arch/core/util/Function;", "", "listFunction", "<init>", "(Landroidx/paging/PageKeyedDataSource;Landroidx/arch/core/util/Function;)V", "Landroidx/paging/DataSource$InvalidatedCallback;", "onInvalidatedCallback", "", "addInvalidatedCallback", "(Landroidx/paging/DataSource$InvalidatedCallback;)V", "removeInvalidatedCallback", "invalidate", "()V", "Landroidx/paging/PageKeyedDataSource$LoadInitialParams;", "params", "Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;", "callback", "loadInitial", "(Landroidx/paging/PageKeyedDataSource$LoadInitialParams;Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;)V", "Landroidx/paging/PageKeyedDataSource$LoadParams;", "Landroidx/paging/PageKeyedDataSource$LoadCallback;", "loadBefore", "(Landroidx/paging/PageKeyedDataSource$LoadParams;Landroidx/paging/PageKeyedDataSource$LoadCallback;)V", "loadAfter", "", "isInvalid", "()Z", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class WrapperPageKeyedDataSource extends PageKeyedDataSource {
    public final PageKeyedDataSource f;
    public final Function g;

    public WrapperPageKeyedDataSource(@NotNull PageKeyedDataSource pageKeyedDataSource0, @NotNull Function function0) {
        Intrinsics.checkNotNullParameter(pageKeyedDataSource0, "source");
        Intrinsics.checkNotNullParameter(function0, "listFunction");
        super();
        this.f = pageKeyedDataSource0;
        this.g = function0;
    }

    @Override  // androidx.paging.DataSource
    public void addInvalidatedCallback(@NotNull InvalidatedCallback dataSource$InvalidatedCallback0) {
        Intrinsics.checkNotNullParameter(dataSource$InvalidatedCallback0, "onInvalidatedCallback");
        this.f.addInvalidatedCallback(dataSource$InvalidatedCallback0);
    }

    @Override  // androidx.paging.DataSource
    public void invalidate() {
        this.f.invalidate();
    }

    @Override  // androidx.paging.DataSource
    public boolean isInvalid() {
        return this.f.isInvalid();
    }

    @Override  // androidx.paging.PageKeyedDataSource
    public void loadAfter(@NotNull LoadParams pageKeyedDataSource$LoadParams0, @NotNull LoadCallback pageKeyedDataSource$LoadCallback0) {
        Intrinsics.checkNotNullParameter(pageKeyedDataSource$LoadParams0, "params");
        Intrinsics.checkNotNullParameter(pageKeyedDataSource$LoadCallback0, "callback");
        androidx.paging.WrapperPageKeyedDataSource.loadAfter.1 wrapperPageKeyedDataSource$loadAfter$10 = new LoadCallback() {
            @Override  // androidx.paging.PageKeyedDataSource$LoadCallback
            public void onResult(@NotNull List list0, @Nullable Object object0) {
                Intrinsics.checkNotNullParameter(list0, "data");
                Function function0 = this.b.g;
                List list1 = DataSource.Companion.convert$paging_common_release(function0, list0);
                this.onResult(list1, object0);
            }
        };
        this.f.loadAfter(pageKeyedDataSource$LoadParams0, wrapperPageKeyedDataSource$loadAfter$10);
    }

    @Override  // androidx.paging.PageKeyedDataSource
    public void loadBefore(@NotNull LoadParams pageKeyedDataSource$LoadParams0, @NotNull LoadCallback pageKeyedDataSource$LoadCallback0) {
        Intrinsics.checkNotNullParameter(pageKeyedDataSource$LoadParams0, "params");
        Intrinsics.checkNotNullParameter(pageKeyedDataSource$LoadCallback0, "callback");
        androidx.paging.WrapperPageKeyedDataSource.loadBefore.1 wrapperPageKeyedDataSource$loadBefore$10 = new LoadCallback() {
            @Override  // androidx.paging.PageKeyedDataSource$LoadCallback
            public void onResult(@NotNull List list0, @Nullable Object object0) {
                Intrinsics.checkNotNullParameter(list0, "data");
                List list1 = DataSource.Companion.convert$paging_common_release(this.b.g, list0);
                this.onResult(list1, object0);
            }
        };
        this.f.loadBefore(pageKeyedDataSource$LoadParams0, wrapperPageKeyedDataSource$loadBefore$10);
    }

    @Override  // androidx.paging.PageKeyedDataSource
    public void loadInitial(@NotNull LoadInitialParams pageKeyedDataSource$LoadInitialParams0, @NotNull LoadInitialCallback pageKeyedDataSource$LoadInitialCallback0) {
        Intrinsics.checkNotNullParameter(pageKeyedDataSource$LoadInitialParams0, "params");
        Intrinsics.checkNotNullParameter(pageKeyedDataSource$LoadInitialCallback0, "callback");
        androidx.paging.WrapperPageKeyedDataSource.loadInitial.1 wrapperPageKeyedDataSource$loadInitial$10 = new LoadInitialCallback() {
            @Override  // androidx.paging.PageKeyedDataSource$LoadInitialCallback
            public void onResult(@NotNull List list0, int v, int v1, @Nullable Object object0, @Nullable Object object1) {
                Intrinsics.checkNotNullParameter(list0, "data");
                List list1 = DataSource.Companion.convert$paging_common_release(pageKeyedDataSource$LoadInitialCallback0.g, list0);
                this.b.onResult(list1, v, v1, object0, object1);
            }

            @Override  // androidx.paging.PageKeyedDataSource$LoadInitialCallback
            public void onResult(@NotNull List list0, @Nullable Object object0, @Nullable Object object1) {
                Intrinsics.checkNotNullParameter(list0, "data");
                List list1 = DataSource.Companion.convert$paging_common_release(pageKeyedDataSource$LoadInitialCallback0.g, list0);
                this.b.onResult(list1, object0, object1);
            }
        };
        this.f.loadInitial(pageKeyedDataSource$LoadInitialParams0, wrapperPageKeyedDataSource$loadInitial$10);
    }

    @Override  // androidx.paging.DataSource
    public void removeInvalidatedCallback(@NotNull InvalidatedCallback dataSource$InvalidatedCallback0) {
        Intrinsics.checkNotNullParameter(dataSource$InvalidatedCallback0, "onInvalidatedCallback");
        this.f.removeInvalidatedCallback(dataSource$InvalidatedCallback0);
    }
}

