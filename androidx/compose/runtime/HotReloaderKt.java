package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.l;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;
import y0.o;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u001A\b\u0010\u0000\u001A\u00020\u0001H\u0007\u001A\u001E\u0010\u0002\u001A\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u00040\u0003H\u0007\u001A\u0010\u0010\b\u001A\u00020\u00012\u0006\u0010\t\u001A\u00020\nH\u0007\u001A\u0010\u0010\u000B\u001A\u00020\u00012\u0006\u0010\f\u001A\u00020\rH\u0007¨\u0006\u000E"}, d2 = {"clearCompositionErrors", "", "currentCompositionErrors", "", "Lkotlin/Pair;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "invalidateGroupsWithKey", "key", "", "simulateHotReload", "context", "", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nHotReloader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HotReloader.kt\nandroidx/compose/runtime/HotReloaderKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,103:1\n1549#2:104\n1620#2,3:105\n*S KotlinDebug\n*F\n+ 1 HotReloader.kt\nandroidx/compose/runtime/HotReloaderKt\n*L\n95#1:104\n95#1:105,3\n*E\n"})
public final class HotReloaderKt {
    @TestOnly
    public static final void clearCompositionErrors() {
        o.a.clearErrors$runtime_release();
    }

    @NotNull
    @TestOnly
    public static final List currentCompositionErrors() {
        Iterable iterable0 = o.a.getCurrentErrors$runtime_release();
        List list0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            list0.add(TuplesKt.to(((RecomposerErrorInfo)object0).getCause(), Boolean.valueOf(((RecomposerErrorInfo)object0).getRecoverable())));
        }
        return list0;
    }

    @TestOnly
    public static final void invalidateGroupsWithKey(int v) {
        o.a.invalidateGroupsWithKey$runtime_release(v);
    }

    @TestOnly
    public static final void simulateHotReload(@NotNull Object object0) {
        o.a.simulateHotReload$runtime_release(object0);
    }
}

