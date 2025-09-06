package androidx.paging;

import androidx.arch.core.util.Function;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0004B5\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u001E\u0010\b\u001A\u001A\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000E\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u0017\u0010\u0010\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u0010\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0017\u001A\u00020\r2\u0006\u0010\u0014\u001A\u00020\u00132\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001B\u001A\u00020\r2\u0006\u0010\u0014\u001A\u00020\u00192\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00010\u001AH\u0016¢\u0006\u0004\b\u001B\u0010\u001CR/\u0010\b\u001A\u001A\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 R\u0014\u0010\"\u001A\u00020!8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/paging/WrapperPositionalDataSource;", "", "A", "B", "Landroidx/paging/PositionalDataSource;", "source", "Landroidx/arch/core/util/Function;", "", "listFunction", "<init>", "(Landroidx/paging/PositionalDataSource;Landroidx/arch/core/util/Function;)V", "Landroidx/paging/DataSource$InvalidatedCallback;", "onInvalidatedCallback", "", "addInvalidatedCallback", "(Landroidx/paging/DataSource$InvalidatedCallback;)V", "removeInvalidatedCallback", "invalidate", "()V", "Landroidx/paging/PositionalDataSource$LoadInitialParams;", "params", "Landroidx/paging/PositionalDataSource$LoadInitialCallback;", "callback", "loadInitial", "(Landroidx/paging/PositionalDataSource$LoadInitialParams;Landroidx/paging/PositionalDataSource$LoadInitialCallback;)V", "Landroidx/paging/PositionalDataSource$LoadRangeParams;", "Landroidx/paging/PositionalDataSource$LoadRangeCallback;", "loadRange", "(Landroidx/paging/PositionalDataSource$LoadRangeParams;Landroidx/paging/PositionalDataSource$LoadRangeCallback;)V", "f", "Landroidx/arch/core/util/Function;", "getListFunction", "()Landroidx/arch/core/util/Function;", "", "isInvalid", "()Z", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class WrapperPositionalDataSource extends PositionalDataSource {
    public final PositionalDataSource e;
    public final Function f;

    public WrapperPositionalDataSource(@NotNull PositionalDataSource positionalDataSource0, @NotNull Function function0) {
        Intrinsics.checkNotNullParameter(positionalDataSource0, "source");
        Intrinsics.checkNotNullParameter(function0, "listFunction");
        super();
        this.e = positionalDataSource0;
        this.f = function0;
    }

    @Override  // androidx.paging.DataSource
    public void addInvalidatedCallback(@NotNull InvalidatedCallback dataSource$InvalidatedCallback0) {
        Intrinsics.checkNotNullParameter(dataSource$InvalidatedCallback0, "onInvalidatedCallback");
        this.e.addInvalidatedCallback(dataSource$InvalidatedCallback0);
    }

    @NotNull
    public final Function getListFunction() {
        return this.f;
    }

    @Override  // androidx.paging.DataSource
    public void invalidate() {
        this.e.invalidate();
    }

    @Override  // androidx.paging.DataSource
    public boolean isInvalid() {
        return this.e.isInvalid();
    }

    @Override  // androidx.paging.PositionalDataSource
    public void loadInitial(@NotNull LoadInitialParams positionalDataSource$LoadInitialParams0, @NotNull LoadInitialCallback positionalDataSource$LoadInitialCallback0) {
        Intrinsics.checkNotNullParameter(positionalDataSource$LoadInitialParams0, "params");
        Intrinsics.checkNotNullParameter(positionalDataSource$LoadInitialCallback0, "callback");
        androidx.paging.WrapperPositionalDataSource.loadInitial.1 wrapperPositionalDataSource$loadInitial$10 = new LoadInitialCallback() {
            @Override  // androidx.paging.PositionalDataSource$LoadInitialCallback
            public void onResult(@NotNull List list0, int v) {
                Intrinsics.checkNotNullParameter(list0, "data");
                Function function0 = this.b.getListFunction();
                List list1 = DataSource.Companion.convert$paging_common_release(function0, list0);
                this.onResult(list1, v);
            }

            @Override  // androidx.paging.PositionalDataSource$LoadInitialCallback
            public void onResult(@NotNull List list0, int v, int v1) {
                Intrinsics.checkNotNullParameter(list0, "data");
                Function function0 = this.b.getListFunction();
                List list1 = DataSource.Companion.convert$paging_common_release(function0, list0);
                this.onResult(list1, v, v1);
            }
        };
        this.e.loadInitial(positionalDataSource$LoadInitialParams0, wrapperPositionalDataSource$loadInitial$10);
    }

    @Override  // androidx.paging.PositionalDataSource
    public void loadRange(@NotNull LoadRangeParams positionalDataSource$LoadRangeParams0, @NotNull LoadRangeCallback positionalDataSource$LoadRangeCallback0) {
        Intrinsics.checkNotNullParameter(positionalDataSource$LoadRangeParams0, "params");
        Intrinsics.checkNotNullParameter(positionalDataSource$LoadRangeCallback0, "callback");
        androidx.paging.WrapperPositionalDataSource.loadRange.1 wrapperPositionalDataSource$loadRange$10 = new LoadRangeCallback() {
            @Override  // androidx.paging.PositionalDataSource$LoadRangeCallback
            public void onResult(@NotNull List list0) {
                Intrinsics.checkNotNullParameter(list0, "data");
                List list1 = DataSource.Companion.convert$paging_common_release(this.b.getListFunction(), list0);
                this.onResult(list1);
            }
        };
        this.e.loadRange(positionalDataSource$LoadRangeParams0, wrapperPositionalDataSource$loadRange$10);
    }

    @Override  // androidx.paging.DataSource
    public void removeInvalidatedCallback(@NotNull InvalidatedCallback dataSource$InvalidatedCallback0) {
        Intrinsics.checkNotNullParameter(dataSource$InvalidatedCallback0, "onInvalidatedCallback");
        this.e.removeInvalidatedCallback(dataSource$InvalidatedCallback0);
    }
}

