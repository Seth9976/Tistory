package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.foundation.text.selection.g1;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import b0.f;
import b0.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B \u0012\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006¢\u0006\u0004\b\b\u0010\tJK\u0010\u0011\u001A\u00020\u00052\b\u0010\u000B\u001A\u0004\u0018\u00010\n2\b\u0010\f\u001A\u0004\u0018\u00010\n2\b\u0010\u000E\u001A\u0004\u0018\u00010\r2\u001C\u0010\u0007\u001A\u0018\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J¹\u0001\u0010\u001A\u001A\u00020\u00052\u0006\u0010\u0014\u001A\u00020\u00132#\u0010\u000B\u001A\u001F\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\n\u0018\u00010\u00042#\u0010\f\u001A\u001F\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00042#\u0010\u000E\u001A\u001F\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\r\u0018\u00010\u000421\u0010\u0019\u001A-\u0012\u0004\u0012\u00020\u000F\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00050\u0018¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0006H\u0016¢\u0006\u0004\b\u001A\u0010\u001BR \u0010!\u001A\b\u0012\u0004\u0012\u00020\u00030\u001C8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 R\u0017\u0010\'\u001A\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&¨\u0006("}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridIntervalContent;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridInterval;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "content", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "key", "contentType", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "span", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "Landroidx/compose/runtime/Composable;", "item", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;Lkotlin/jvm/functions/Function3;)V", "", "count", "Lkotlin/ParameterName;", "name", "index", "Lkotlin/Function2;", "itemContent", "items", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "a", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "getIntervals", "()Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "intervals", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "b", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "getSpanProvider", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "spanProvider", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridIntervalContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridIntervalContent.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridIntervalContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1#2:79\n*E\n"})
public final class LazyStaggeredGridIntervalContent extends LazyLayoutIntervalContent implements LazyStaggeredGridScope {
    public static final int $stable = 8;
    public final MutableIntervalList a;
    public final LazyStaggeredGridSpanProvider b;

    public LazyStaggeredGridIntervalContent(@NotNull Function1 function10) {
        this.a = new MutableIntervalList();
        this.b = new LazyStaggeredGridSpanProvider(this.getIntervals());
        function10.invoke(this);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public IntervalList getIntervals() {
        return this.getIntervals();
    }

    @NotNull
    public MutableIntervalList getIntervals() {
        return this.a;
    }

    @NotNull
    public final LazyStaggeredGridSpanProvider getSpanProvider() {
        return this.b;
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope
    public void item(@Nullable Object object0, @Nullable Object object1, @Nullable StaggeredGridItemSpan staggeredGridItemSpan0, @NotNull Function3 function30) {
        g1 g10 = null;
        f f0 = object0 == null ? null : new f(object0, 4);
        f f1 = new f(object1, 5);
        if(staggeredGridItemSpan0 != null) {
            g10 = new g1(staggeredGridItemSpan0, 22);
        }
        this.items(1, f0, f1, g10, ComposableLambdaKt.composableLambdaInstance(0x273583E4, true, new g(2, function30)));
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope
    public void items(int v, @Nullable Function1 function10, @NotNull Function1 function11, @Nullable Function1 function12, @NotNull Function4 function40) {
        this.getIntervals().addInterval(v, new LazyStaggeredGridInterval(function10, function11, function12, function40));
    }
}

