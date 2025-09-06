package androidx.paging;

import androidx.arch.core.util.Function;
import java.util.IdentityHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0005B;\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u001E\u0010\t\u001A\u001A\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u0017\u0010\u0011\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000F\u0010\u0012\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001A\u00028\u00002\u0006\u0010\u0014\u001A\u00028\u0002H\u0010¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0019\u001A\u00020\u000E2\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00010\b2\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00020\b¢\u0006\u0004\b\u0019\u0010\u001AJ$\u0010 \u001A\b\u0012\u0004\u0012\u00028\u00020\u001D2\f\u0010\u001C\u001A\b\u0012\u0004\u0012\u00028\u00000\u001BH\u0090@¢\u0006\u0004\b\u001E\u0010\u001FR\u0014\u0010\"\u001A\u00020!8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/paging/WrapperDataSource;", "", "Key", "ValueFrom", "ValueTo", "Landroidx/paging/DataSource;", "source", "Landroidx/arch/core/util/Function;", "", "listFunction", "<init>", "(Landroidx/paging/DataSource;Landroidx/arch/core/util/Function;)V", "Landroidx/paging/DataSource$InvalidatedCallback;", "onInvalidatedCallback", "", "addInvalidatedCallback", "(Landroidx/paging/DataSource$InvalidatedCallback;)V", "removeInvalidatedCallback", "invalidate", "()V", "item", "getKeyInternal$paging_common_release", "(Ljava/lang/Object;)Ljava/lang/Object;", "getKeyInternal", "dest", "stashKeysIfNeeded", "(Ljava/util/List;Ljava/util/List;)V", "Landroidx/paging/DataSource$Params;", "params", "Landroidx/paging/DataSource$BaseResult;", "load$paging_common_release", "(Landroidx/paging/DataSource$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "", "isInvalid", "()Z", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class WrapperDataSource extends DataSource {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[KeyType.values().length];
            try {
                arr_v[KeyType.ITEM_KEYED.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public final DataSource e;
    public final Function f;
    public final IdentityHashMap g;

    public WrapperDataSource(@NotNull DataSource dataSource0, @NotNull Function function0) {
        Intrinsics.checkNotNullParameter(dataSource0, "source");
        Intrinsics.checkNotNullParameter(function0, "listFunction");
        super(dataSource0.getType$paging_common_release());
        this.e = dataSource0;
        this.f = function0;
        this.g = WhenMappings.$EnumSwitchMapping$0[dataSource0.getType$paging_common_release().ordinal()] == 1 ? new IdentityHashMap() : null;
    }

    public static Object a(WrapperDataSource wrapperDataSource0, Params dataSource$Params0, Continuation continuation0) {
        k1 k10;
        if(continuation0 instanceof k1) {
            k10 = (k1)continuation0;
            int v = k10.r;
            if((v & 0x80000000) == 0) {
                k10 = new k1(wrapperDataSource0, continuation0);
            }
            else {
                k10.r = v ^ 0x80000000;
            }
        }
        else {
            k10 = new k1(wrapperDataSource0, continuation0);
        }
        Object object0 = k10.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(k10.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                k10.o = wrapperDataSource0;
                k10.r = 1;
                object0 = wrapperDataSource0.e.load$paging_common_release(dataSource$Params0, k10);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                wrapperDataSource0 = k10.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        BaseResult dataSource$BaseResult0 = BaseResult.Companion.convert$paging_common_release(((BaseResult)object0), wrapperDataSource0.f);
        wrapperDataSource0.stashKeysIfNeeded(((BaseResult)object0).data, dataSource$BaseResult0.data);
        return dataSource$BaseResult0;
    }

    @Override  // androidx.paging.DataSource
    public void addInvalidatedCallback(@NotNull InvalidatedCallback dataSource$InvalidatedCallback0) {
        Intrinsics.checkNotNullParameter(dataSource$InvalidatedCallback0, "onInvalidatedCallback");
        this.e.addInvalidatedCallback(dataSource$InvalidatedCallback0);
    }

    @Override  // androidx.paging.DataSource
    @NotNull
    public Object getKeyInternal$paging_common_release(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "item");
        IdentityHashMap identityHashMap0 = this.g;
        if(identityHashMap0 != null) {
            synchronized(identityHashMap0) {
                Object object1 = this.g.get(object0);
                Intrinsics.checkNotNull(object1);
                return object1;
            }
        }
        throw new IllegalStateException("Cannot get key by item in non-item keyed DataSource");
    }

    @Override  // androidx.paging.DataSource
    public void invalidate() {
        this.e.invalidate();
    }

    @Override  // androidx.paging.DataSource
    public boolean isInvalid() {
        return this.e.isInvalid();
    }

    @Override  // androidx.paging.DataSource
    @Nullable
    public Object load$paging_common_release(@NotNull Params dataSource$Params0, @NotNull Continuation continuation0) {
        return WrapperDataSource.a(this, dataSource$Params0, continuation0);
    }

    @Override  // androidx.paging.DataSource
    public void removeInvalidatedCallback(@NotNull InvalidatedCallback dataSource$InvalidatedCallback0) {
        Intrinsics.checkNotNullParameter(dataSource$InvalidatedCallback0, "onInvalidatedCallback");
        this.e.removeInvalidatedCallback(dataSource$InvalidatedCallback0);
    }

    public final void stashKeysIfNeeded(@NotNull List list0, @NotNull List list1) {
        Intrinsics.checkNotNullParameter(list0, "source");
        Intrinsics.checkNotNullParameter(list1, "dest");
        IdentityHashMap identityHashMap0 = this.g;
        if(identityHashMap0 != null) {
            synchronized(identityHashMap0) {
                int v1 = list1.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    Object object0 = list1.get(v2);
                    Intrinsics.checkNotNull(this.e, "null cannot be cast to non-null type androidx.paging.ItemKeyedDataSource<Key of androidx.paging.WrapperDataSource.stashKeysIfNeeded$lambda$1, ValueFrom of androidx.paging.WrapperDataSource.stashKeysIfNeeded$lambda$1>");
                    Object object1 = list0.get(v2);
                    Object object2 = ((ItemKeyedDataSource)this.e).getKey(object1);
                    this.g.put(object0, object2);
                }
            }
        }
    }
}

