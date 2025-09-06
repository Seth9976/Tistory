package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import d0.u;
import d0.v;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalFoundationApi
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0017B\u001D\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001A\u0004\u0018\u00010\u00012\b\u0010\t\u001A\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000BJ2\u0010\u0011\u001A\r\u0012\u0004\u0012\u00020\u000F0\u0004¢\u0006\u0002\b\u00102\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\u00012\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "saveableStateHolder", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "<init>", "(Landroidx/compose/runtime/saveable/SaveableStateHolder;Lkotlin/jvm/functions/Function0;)V", "key", "getContentType", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "index", "contentType", "", "Landroidx/compose/runtime/Composable;", "getContent", "(ILjava/lang/Object;Ljava/lang/Object;)Lkotlin/jvm/functions/Function2;", "b", "Lkotlin/jvm/functions/Function0;", "getItemProvider", "()Lkotlin/jvm/functions/Function0;", "d0/v", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LazyLayoutItemContentFactory {
    public static final int $stable = 8;
    public final SaveableStateHolder a;
    public final Function0 b;
    public final LinkedHashMap c;

    public LazyLayoutItemContentFactory(@NotNull SaveableStateHolder saveableStateHolder0, @NotNull Function0 function00) {
        this.a = saveableStateHolder0;
        this.b = function00;
        this.c = new LinkedHashMap();
    }

    @NotNull
    public final Function2 getContent(int v, @NotNull Object object0, @Nullable Object object1) {
        ComposableLambda composableLambda0;
        LinkedHashMap linkedHashMap0 = this.c;
        v v1 = (v)linkedHashMap0.get(object0);
        if(v1 == null || v1.c != v || !Intrinsics.areEqual(v1.b, object1)) {
            v v2 = new v(this, v, object0, object1);
            linkedHashMap0.put(object0, v2);
            composableLambda0 = v2.d;
            if(composableLambda0 == null) {
                composableLambda0 = ComposableLambdaKt.composableLambdaInstance(0x53AF4291, true, new u(this, v2));
                v2.d = composableLambda0;
            }
        }
        else {
            composableLambda0 = v1.d;
            if(composableLambda0 == null) {
                composableLambda0 = ComposableLambdaKt.composableLambdaInstance(0x53AF4291, true, new u(v1.e, v1));
                v1.d = composableLambda0;
                return composableLambda0;
            }
        }
        return composableLambda0;
    }

    @Nullable
    public final Object getContentType(@Nullable Object object0) {
        if(object0 == null) {
            return null;
        }
        v v0 = (v)this.c.get(object0);
        if(v0 != null) {
            return v0.b;
        }
        LazyLayoutItemProvider lazyLayoutItemProvider0 = (LazyLayoutItemProvider)this.b.invoke();
        int v1 = lazyLayoutItemProvider0.getIndex(object0);
        return v1 == -1 ? null : lazyLayoutItemProvider0.getContentType(v1);
    }

    @NotNull
    public final Function0 getItemProvider() {
        return this.b;
    }
}

