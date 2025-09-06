package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import b0.f;
import b0.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B \u0012\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006¢\u0006\u0004\b\b\u0010\tJ\u0094\u0001\u0010\u0016\u001A\u00020\u00052\u0006\u0010\u000B\u001A\u00020\n2#\u0010\u0010\u001A\u001F\u0012\u0013\u0012\u00110\n¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u00020\u000F\u0018\u00010\u00042#\u0010\u0011\u001A\u001F\u0012\u0013\u0012\u00110\n¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000E\u0012\u0006\u0012\u0004\u0018\u00010\u000F0\u000421\u0010\u0015\u001A-\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\n¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u00020\u00050\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017JA\u0010\u0018\u001A\u00020\u00052\b\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\b\u0010\u0011\u001A\u0004\u0018\u00010\u000F2\u001C\u0010\u0007\u001A\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JA\u0010\u001A\u001A\u00020\u00052\b\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\b\u0010\u0011\u001A\u0004\u0018\u00010\u000F2\u001C\u0010\u0007\u001A\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0006H\u0017¢\u0006\u0004\b\u001A\u0010\u0019R \u0010 \u001A\b\u0012\u0004\u0012\u00020\u00020\u001B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001FR\u0017\u0010$\u001A\b\u0012\u0004\u0012\u00020\n0!8F¢\u0006\u0006\u001A\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListIntervalContent;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Landroidx/compose/foundation/lazy/LazyListInterval;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "content", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "count", "Lkotlin/ParameterName;", "name", "index", "", "key", "contentType", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Landroidx/compose/runtime/Composable;", "itemContent", "items", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "item", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "stickyHeader", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "a", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "getIntervals", "()Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "intervals", "", "getHeaderIndexes", "()Ljava/util/List;", "headerIndexes", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LazyListIntervalContent extends LazyLayoutIntervalContent implements LazyListScope {
    public static final int $stable = 8;
    public final MutableIntervalList a;
    public ArrayList b;

    public LazyListIntervalContent(@NotNull Function1 function10) {
        this.a = new MutableIntervalList();
        function10.invoke(this);
    }

    @NotNull
    public final List getHeaderIndexes() {
        return this.b == null ? CollectionsKt__CollectionsKt.emptyList() : this.b;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public IntervalList getIntervals() {
        return this.getIntervals();
    }

    @NotNull
    public MutableIntervalList getIntervals() {
        return this.a;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListScope
    public void item(@Nullable Object object0, @Nullable Object object1, @NotNull Function3 function30) {
        this.getIntervals().addInterval(1, new LazyListInterval((object0 == null ? null : new f(object0, 0)), new f(object1, 1), ComposableLambdaKt.composableLambdaInstance(-1010194746, true, new g(0, function30))));
    }

    @Override  // androidx.compose.foundation.lazy.LazyListScope
    public void items(int v, @Nullable Function1 function10, @NotNull Function1 function11, @NotNull Function4 function40) {
        this.getIntervals().addInterval(v, new LazyListInterval(function10, function11, function40));
    }

    @Override  // androidx.compose.foundation.lazy.LazyListScope
    @ExperimentalFoundationApi
    public void stickyHeader(@Nullable Object object0, @Nullable Object object1, @NotNull Function3 function30) {
        ArrayList arrayList0 = this.b;
        if(arrayList0 == null) {
            arrayList0 = new ArrayList();
            this.b = arrayList0;
        }
        arrayList0.add(this.getIntervals().getSize());
        this.item(object0, object1, function30);
    }
}

