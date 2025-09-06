package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;
import y0.p0;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\u001AT\u0010\u000B\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00002<\u0010\n\u001A8\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0001¢\u0006\u0002\b\tH\u0086@¢\u0006\u0004\b\u000B\u0010\f\u001AA\u0010\u0014\u001A\u00020\u0013\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000E*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100\u000F2\u0006\u0010\u0011\u001A\u00028\u00002\u0006\u0010\u0012\u001A\u00028\u0001H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001A;\u0010\u0016\u001A\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000E*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100\u000F2\u0006\u0010\u0011\u001A\u00028\u0000H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"R", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/runtime/Recomposer;", "Lkotlin/ParameterName;", "name", "recomposer", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "withRunningRecomposer", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "K", "V", "", "", "key", "value", "", "addMultiValue", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z", "removeLastMultiValue", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/RecomposerKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1646:1\n361#2,7:1647\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/RecomposerKt\n*L\n1637#1:1647,7\n*E\n"})
public final class RecomposerKt {
    public static final Object a;
    public static final Object b;

    static {
        RecomposerKt.a = new Object();
        RecomposerKt.b = new Object();
    }

    public static final boolean addMultiValue(@NotNull Map map0, Object object0, Object object1) {
        ArrayList arrayList0 = map0.get(object0);
        if(arrayList0 == null) {
            arrayList0 = a.g(map0, object0);
        }
        return arrayList0.add(object1);
    }

    @Nullable
    public static final Object removeLastMultiValue(@NotNull Map map0, Object object0) {
        List list0 = (List)map0.get(object0);
        if(list0 != null) {
            Object object1 = o.removeFirst(list0);
            if(list0.isEmpty()) {
                map0.remove(object0);
                return object1;
            }
            return object1;
        }
        return null;
    }

    @Nullable
    public static final Object withRunningRecomposer(@NotNull Function3 function30, @NotNull Continuation continuation0) {
        return CoroutineScopeKt.coroutineScope(new p0(function30, null), continuation0);
    }
}

