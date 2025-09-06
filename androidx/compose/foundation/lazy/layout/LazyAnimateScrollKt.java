package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.unit.Density;
import d0.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A\u001B\u0010\u0004\u001A\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001A4\u0010\u000B\u001A\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0006\u001A\u00020\u00012\u0006\u0010\u0007\u001A\u00020\u00012\u0006\u0010\t\u001A\u00020\bH\u0080@¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;", "", "index", "", "isItemVisible", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;I)Z", "scrollOffset", "numOfItemsForTeleport", "Landroidx/compose/ui/unit/Density;", "density", "", "animateScrollToItem", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;IIILandroidx/compose/ui/unit/Density;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,309:1\n148#2:310\n148#2:311\n148#2:312\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n36#1:310\n37#1:311\n38#1:312\n*E\n"})
public final class LazyAnimateScrollKt {
    public static final float a;
    public static final float b;
    public static final float c;

    static {
        LazyAnimateScrollKt.a = 2500.0f;
        LazyAnimateScrollKt.b = 1500.0f;
        LazyAnimateScrollKt.c = 50.0f;
    }

    public static final float access$getBoundDistance$p() [...] // 潜在的解密器

    public static final float access$getMinimumDistance$p() [...] // 潜在的解密器

    public static final float access$getTargetDistance$p() [...] // 潜在的解密器

    @Nullable
    public static final Object animateScrollToItem(@NotNull LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope0, int v, int v1, int v2, @NotNull Density density0, @NotNull Continuation continuation0) {
        Object object0 = lazyLayoutAnimateScrollScope0.scroll(new f(lazyLayoutAnimateScrollScope0, v, v1, v2, density0, null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static final boolean isItemVisible(@NotNull LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope0, int v) {
        int v1 = lazyLayoutAnimateScrollScope0.getFirstVisibleItemIndex();
        return v <= lazyLayoutAnimateScrollScope0.getLastVisibleItemIndex() && v1 <= v;
    }
}

