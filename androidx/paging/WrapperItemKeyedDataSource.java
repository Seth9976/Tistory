package androidx.paging;

import androidx.arch.core.util.Function;
import java.util.IdentityHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0005B;\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u001E\u0010\t\u001A\u001A\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u0017\u0010\u0011\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000F\u0010\u0012\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001A\b\u0012\u0004\u0012\u00028\u00020\b2\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001A\u001A\u00020\u000E2\f\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u00162\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00028\u00020\u0018H\u0016¢\u0006\u0004\b\u001A\u0010\u001BJ+\u0010\u001E\u001A\u00020\u000E2\f\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u001C2\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00028\u00020\u001DH\u0016¢\u0006\u0004\b\u001E\u0010\u001FJ+\u0010 \u001A\u00020\u000E2\f\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u001C2\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00028\u00020\u001DH\u0016¢\u0006\u0004\b \u0010\u001FJ\u0017\u0010\"\u001A\u00028\u00002\u0006\u0010!\u001A\u00028\u0002H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010%\u001A\u00020$8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b%\u0010&¨\u0006\'"}, d2 = {"Landroidx/paging/WrapperItemKeyedDataSource;", "", "K", "A", "B", "Landroidx/paging/ItemKeyedDataSource;", "source", "Landroidx/arch/core/util/Function;", "", "listFunction", "<init>", "(Landroidx/paging/ItemKeyedDataSource;Landroidx/arch/core/util/Function;)V", "Landroidx/paging/DataSource$InvalidatedCallback;", "onInvalidatedCallback", "", "addInvalidatedCallback", "(Landroidx/paging/DataSource$InvalidatedCallback;)V", "removeInvalidatedCallback", "invalidate", "()V", "convertWithStashedKeys", "(Ljava/util/List;)Ljava/util/List;", "Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;", "params", "Landroidx/paging/ItemKeyedDataSource$LoadInitialCallback;", "callback", "loadInitial", "(Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;Landroidx/paging/ItemKeyedDataSource$LoadInitialCallback;)V", "Landroidx/paging/ItemKeyedDataSource$LoadParams;", "Landroidx/paging/ItemKeyedDataSource$LoadCallback;", "loadAfter", "(Landroidx/paging/ItemKeyedDataSource$LoadParams;Landroidx/paging/ItemKeyedDataSource$LoadCallback;)V", "loadBefore", "item", "getKey", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "isInvalid", "()Z", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class WrapperItemKeyedDataSource extends ItemKeyedDataSource {
    public final ItemKeyedDataSource f;
    public final Function g;
    public final IdentityHashMap h;

    public WrapperItemKeyedDataSource(@NotNull ItemKeyedDataSource itemKeyedDataSource0, @NotNull Function function0) {
        Intrinsics.checkNotNullParameter(itemKeyedDataSource0, "source");
        Intrinsics.checkNotNullParameter(function0, "listFunction");
        super();
        this.f = itemKeyedDataSource0;
        this.g = function0;
        this.h = new IdentityHashMap();
    }

    @Override  // androidx.paging.DataSource
    public void addInvalidatedCallback(@NotNull InvalidatedCallback dataSource$InvalidatedCallback0) {
        Intrinsics.checkNotNullParameter(dataSource$InvalidatedCallback0, "onInvalidatedCallback");
        this.f.addInvalidatedCallback(dataSource$InvalidatedCallback0);
    }

    @NotNull
    public final List convertWithStashedKeys(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "source");
        List list1 = DataSource.Companion.convert$paging_common_release(this.g, list0);
        synchronized(this.h) {
            int v1 = list1.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                Object object0 = list1.get(v2);
                Object object1 = list0.get(v2);
                Object object2 = this.f.getKey(object1);
                this.h.put(object0, object2);
            }
            return list1;
        }
    }

    @Override  // androidx.paging.ItemKeyedDataSource
    @NotNull
    public Object getKey(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "item");
        synchronized(this.h) {
            Object object1 = this.h.get(object0);
            Intrinsics.checkNotNull(object1);
            return object1;
        }
    }

    @Override  // androidx.paging.DataSource
    public void invalidate() {
        this.f.invalidate();
    }

    @Override  // androidx.paging.DataSource
    public boolean isInvalid() {
        return this.f.isInvalid();
    }

    @Override  // androidx.paging.ItemKeyedDataSource
    public void loadAfter(@NotNull LoadParams itemKeyedDataSource$LoadParams0, @NotNull LoadCallback itemKeyedDataSource$LoadCallback0) {
        Intrinsics.checkNotNullParameter(itemKeyedDataSource$LoadParams0, "params");
        Intrinsics.checkNotNullParameter(itemKeyedDataSource$LoadCallback0, "callback");
        androidx.paging.WrapperItemKeyedDataSource.loadAfter.1 wrapperItemKeyedDataSource$loadAfter$10 = new LoadCallback() {
            @Override  // androidx.paging.ItemKeyedDataSource$LoadCallback
            public void onResult(@NotNull List list0) {
                Intrinsics.checkNotNullParameter(list0, "data");
                List list1 = this.b.convertWithStashedKeys(list0);
                this.onResult(list1);
            }
        };
        this.f.loadAfter(itemKeyedDataSource$LoadParams0, wrapperItemKeyedDataSource$loadAfter$10);
    }

    @Override  // androidx.paging.ItemKeyedDataSource
    public void loadBefore(@NotNull LoadParams itemKeyedDataSource$LoadParams0, @NotNull LoadCallback itemKeyedDataSource$LoadCallback0) {
        Intrinsics.checkNotNullParameter(itemKeyedDataSource$LoadParams0, "params");
        Intrinsics.checkNotNullParameter(itemKeyedDataSource$LoadCallback0, "callback");
        androidx.paging.WrapperItemKeyedDataSource.loadBefore.1 wrapperItemKeyedDataSource$loadBefore$10 = new LoadCallback() {
            @Override  // androidx.paging.ItemKeyedDataSource$LoadCallback
            public void onResult(@NotNull List list0) {
                Intrinsics.checkNotNullParameter(list0, "data");
                List list1 = this.b.convertWithStashedKeys(list0);
                this.onResult(list1);
            }
        };
        this.f.loadBefore(itemKeyedDataSource$LoadParams0, wrapperItemKeyedDataSource$loadBefore$10);
    }

    @Override  // androidx.paging.ItemKeyedDataSource
    public void loadInitial(@NotNull LoadInitialParams itemKeyedDataSource$LoadInitialParams0, @NotNull LoadInitialCallback itemKeyedDataSource$LoadInitialCallback0) {
        Intrinsics.checkNotNullParameter(itemKeyedDataSource$LoadInitialParams0, "params");
        Intrinsics.checkNotNullParameter(itemKeyedDataSource$LoadInitialCallback0, "callback");
        androidx.paging.WrapperItemKeyedDataSource.loadInitial.1 wrapperItemKeyedDataSource$loadInitial$10 = new LoadInitialCallback() {
            @Override  // androidx.paging.ItemKeyedDataSource$LoadCallback
            public void onResult(@NotNull List list0) {
                Intrinsics.checkNotNullParameter(list0, "data");
                List list1 = this.b.convertWithStashedKeys(list0);
                this.onResult(list1);
            }

            @Override  // androidx.paging.ItemKeyedDataSource$LoadInitialCallback
            public void onResult(@NotNull List list0, int v, int v1) {
                Intrinsics.checkNotNullParameter(list0, "data");
                List list1 = this.b.convertWithStashedKeys(list0);
                this.onResult(list1, v, v1);
            }
        };
        this.f.loadInitial(itemKeyedDataSource$LoadInitialParams0, wrapperItemKeyedDataSource$loadInitial$10);
    }

    @Override  // androidx.paging.DataSource
    public void removeInvalidatedCallback(@NotNull InvalidatedCallback dataSource$InvalidatedCallback0) {
        Intrinsics.checkNotNullParameter(dataSource$InvalidatedCallback0, "onInvalidatedCallback");
        this.f.removeInvalidatedCallback(dataSource$InvalidatedCallback0);
    }
}

