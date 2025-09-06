package androidx.lifecycle;

import aa.o;
import androidx.annotation.CheckResult;
import androidx.annotation.MainThread;
import androidx.arch.core.util.Function;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlin.jvm.internal.Ref.ObjectRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u001E\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0007\u001AB\u0010\u0003\u001A\b\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u001C\u0010\u0005\u001A\u0018\u0012\t\u0012\u0007H\u0002¢\u0006\u0002\b\u0007\u0012\t\u0012\u0007H\u0004¢\u0006\u0002\b\u00070\u0006H\u0007\u001A8\u0010\u0003\u001A\b\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\tH\u0007\u001AJ\u0010\n\u001A\b\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00012$\u0010\u0005\u001A \u0012\t\u0012\u0007H\u0002¢\u0006\u0002\b\u0007\u0012\u0011\u0012\u000F\u0012\u0004\u0012\u0002H\u0004\u0018\u00010\u0001¢\u0006\u0002\b\u00070\u0006H\u0007\u001A>\u0010\n\u001A\b\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0018\u0010\u000B\u001A\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00010\tH\u0007¨\u0006\f"}, d2 = {"distinctUntilChanged", "Landroidx/lifecycle/LiveData;", "X", "map", "Y", "transform", "Lkotlin/Function1;", "Lkotlin/jvm/JvmSuppressWildcards;", "mapFunction", "Landroidx/arch/core/util/Function;", "switchMap", "switchMapFunction", "lifecycle-livedata_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "Transformations")
public final class Transformations {
    @CheckResult
    @MainThread
    @JvmName(name = "distinctUntilChanged")
    @NotNull
    public static final LiveData distinctUntilChanged(@NotNull LiveData liveData0) {
        LiveData liveData1;
        Intrinsics.checkNotNullParameter(liveData0, "<this>");
        BooleanRef ref$BooleanRef0 = new BooleanRef();
        ref$BooleanRef0.element = true;
        if(liveData0.isInitialized()) {
            ref$BooleanRef0.element = false;
            liveData1 = new MediatorLiveData(liveData0.getValue());
        }
        else {
            liveData1 = new MediatorLiveData();
        }
        ((MediatorLiveData)liveData1).addSource(liveData0, new o0(new n0(((MediatorLiveData)liveData1), ref$BooleanRef0), 0));
        return liveData1;
    }

    @CheckResult
    @MainThread
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    @JvmName(name = "map")
    public static final LiveData map(LiveData liveData0, Function function0) {
        Intrinsics.checkNotNullParameter(liveData0, "<this>");
        Intrinsics.checkNotNullParameter(function0, "mapFunction");
        LiveData liveData1 = new MediatorLiveData();
        ((MediatorLiveData)liveData1).addSource(liveData0, new o0(new o(20, liveData1, function0), 0));
        return liveData1;
    }

    @CheckResult
    @MainThread
    @JvmName(name = "map")
    @NotNull
    public static final LiveData map(@NotNull LiveData liveData0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(liveData0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        LiveData liveData1 = liveData0.isInitialized() ? new MediatorLiveData(function10.invoke(liveData0.getValue())) : new MediatorLiveData();
        ((MediatorLiveData)liveData1).addSource(liveData0, new o0(new o(19, liveData1, function10), 0));
        return liveData1;
    }

    @CheckResult
    @MainThread
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    @JvmName(name = "switchMap")
    public static final LiveData switchMap(LiveData liveData0, Function function0) {
        Intrinsics.checkNotNullParameter(liveData0, "<this>");
        Intrinsics.checkNotNullParameter(function0, "switchMapFunction");
        LiveData liveData1 = new MediatorLiveData();
        ((MediatorLiveData)liveData1).addSource(liveData0, new Observer() {
            public LiveData a;
            public final Function b;
            public final MediatorLiveData c;

            {
                Function function0 = function0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                MediatorLiveData mediatorLiveData0 = (MediatorLiveData)liveData1;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.b = function0;
                this.c = mediatorLiveData0;
            }

            @Nullable
            public final LiveData getLiveData() {
                return this.a;
            }

            @Override  // androidx.lifecycle.Observer
            public void onChanged(Object object0) {
                LiveData liveData0 = (LiveData)this.b.apply(object0);
                LiveData liveData1 = this.a;
                if(liveData1 == liveData0) {
                    return;
                }
                MediatorLiveData mediatorLiveData0 = this.c;
                if(liveData1 != null) {
                    Intrinsics.checkNotNull(liveData1);
                    mediatorLiveData0.removeSource(liveData1);
                }
                this.a = liveData0;
                if(liveData0 != null) {
                    Intrinsics.checkNotNull(liveData0);
                    mediatorLiveData0.addSource(liveData0, new o0(new i(mediatorLiveData0, 2), 0));
                }
            }

            public final void setLiveData(@Nullable LiveData liveData0) {
                this.a = liveData0;
            }
        });
        return liveData1;
    }

    @CheckResult
    @MainThread
    @JvmName(name = "switchMap")
    @NotNull
    public static final LiveData switchMap(@NotNull LiveData liveData0, @NotNull Function1 function10) {
        LiveData liveData2;
        Intrinsics.checkNotNullParameter(liveData0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        ObjectRef ref$ObjectRef0 = new ObjectRef();
        if(liveData0.isInitialized()) {
            LiveData liveData1 = (LiveData)function10.invoke(liveData0.getValue());
            liveData2 = liveData1 == null || !liveData1.isInitialized() ? new MediatorLiveData() : new MediatorLiveData(liveData1.getValue());
        }
        else {
            liveData2 = new MediatorLiveData();
        }
        ((MediatorLiveData)liveData2).addSource(liveData0, new o0(new p0(function10, ref$ObjectRef0, ((MediatorLiveData)liveData2)), 0));
        return liveData2;
    }
}

