package androidx.compose.foundation.lazy.grid;

import aa.e;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import b0.f;
import c0.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B \u0012\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004\u00A2\u0006\u0002\b\u0006\u00A2\u0006\u0004\b\b\u0010\tJ\\\u0010\u0012\u001A\u00020\u00052\b\u0010\u000B\u001A\u0004\u0018\u00010\n2\u0019\u0010\u000E\u001A\u0015\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0004\u00A2\u0006\u0002\b\u00062\b\u0010\u000F\u001A\u0004\u0018\u00010\n2\u001C\u0010\u0007\u001A\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u0004\u00A2\u0006\u0002\b\u0011\u00A2\u0006\u0002\b\u0006H\u0016\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u00B5\u0001\u0010\u001B\u001A\u00020\u00052\u0006\u0010\u0015\u001A\u00020\u00142#\u0010\u000B\u001A\u001F\u0012\u0013\u0012\u00110\u0014\u00A2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\n\u0018\u00010\u00042\u001F\u0010\u000E\u001A\u001B\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r\u0018\u00010\u0019\u00A2\u0006\u0002\b\u00062#\u0010\u000F\u001A\u001F\u0012\u0013\u0012\u00110\u0014\u00A2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000421\u0010\u001A\u001A-\u0012\u0004\u0012\u00020\u0010\u0012\u0013\u0012\u00110\u0014\u00A2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00050\u0019\u00A2\u0006\u0002\b\u0011\u00A2\u0006\u0002\b\u0006H\u0016\u00A2\u0006\u0004\b\u001B\u0010\u001CR\u001A\u0010\"\u001A\u00020\u001D8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!R \u0010(\u001A\b\u0012\u0004\u0012\u00020\u00030#8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\'R\"\u00100\u001A\u00020)8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b*\u0010+\u001A\u0004\b,\u0010-\"\u0004\b.\u0010/\u00A8\u00061"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Landroidx/compose/foundation/lazy/grid/LazyGridInterval;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "content", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "key", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "span", "contentType", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "Landroidx/compose/runtime/Composable;", "item", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "", "count", "Lkotlin/ParameterName;", "name", "index", "Lkotlin/Function2;", "itemContent", "items", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "a", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "getSpanLayoutProvider$foundation_release", "()Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "spanLayoutProvider", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "b", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "getIntervals", "()Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "intervals", "", "c", "Z", "getHasCustomSpans$foundation_release", "()Z", "setHasCustomSpans$foundation_release", "(Z)V", "hasCustomSpans", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyGridIntervalContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridIntervalContent.kt\nandroidx/compose/foundation/lazy/grid/LazyGridIntervalContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
public final class LazyGridIntervalContent extends LazyLayoutIntervalContent implements LazyGridScope {
    public static final int $stable = 8;
    public final LazyGridSpanLayoutProvider a;
    public final MutableIntervalList b;
    public boolean c;
    public static final g d;

    static {
        LazyGridIntervalContent.d = g.x;
    }

    public LazyGridIntervalContent(@NotNull Function1 function10) {
        this.a = new LazyGridSpanLayoutProvider(this);
        this.b = new MutableIntervalList();
        function10.invoke(this);
    }

    public static final Function2 access$getDefaultSpan$cp() {
        return LazyGridIntervalContent.d;
    }

    public final boolean getHasCustomSpans$foundation_release() {
        return this.c;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public IntervalList getIntervals() {
        return this.getIntervals();
    }

    @NotNull
    public MutableIntervalList getIntervals() {
        return this.b;
    }

    @NotNull
    public final LazyGridSpanLayoutProvider getSpanLayoutProvider$foundation_release() {
        return this.a;
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void item(@Nullable Object object0, @Nullable Function1 function10, @Nullable Object object1, @NotNull Function3 function30) {
        MutableIntervalList mutableIntervalList0 = this.getIntervals();
        f f0 = object0 == null ? null : new f(object0, 2);
        e e0 = function10 == null ? LazyGridIntervalContent.d : new e(function10, 1);
        mutableIntervalList0.addInterval(1, new LazyGridInterval(f0, e0, new f(object1, 3), ComposableLambdaKt.composableLambdaInstance(0xFDEFEC08, true, new b0.g(1, function30))));
        if(function10 != null) {
            this.c = true;
        }
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void items(int v, @Nullable Function1 function10, @Nullable Function2 function20, @NotNull Function1 function11, @NotNull Function4 function40) {
        MutableIntervalList mutableIntervalList0 = this.getIntervals();
        Function2 function21 = function20 == null ? LazyGridIntervalContent.d : function20;
        mutableIntervalList0.addInterval(v, new LazyGridInterval(function10, function21, function11, function40));
        if(function20 != null) {
            this.c = true;
        }
    }

    public final void setHasCustomSpans$foundation_release(boolean z) {
        this.c = z;
    }
}

