package androidx.compose.material3;

import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;

public final class g7 extends Lambda implements Function1 {
    public final String A;
    public final int B;
    public final int C;
    public final Function1 D;
    public final SelectableDates E;
    public final DatePickerColors F;
    public final IntRange w;
    public final LazyGridState x;
    public final CoroutineScope y;
    public final String z;

    public g7(IntRange intRange0, LazyGridState lazyGridState0, CoroutineScope coroutineScope0, String s, String s1, int v, int v1, Function1 function10, SelectableDates selectableDates0, DatePickerColors datePickerColors0) {
        this.w = intRange0;
        this.x = lazyGridState0;
        this.y = coroutineScope0;
        this.z = s;
        this.A = s1;
        this.B = v;
        this.C = v1;
        this.D = function10;
        this.E = selectableDates0;
        this.F = datePickerColors0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        LazyGridScope.items$default(((LazyGridScope)object0), CollectionsKt___CollectionsKt.count(this.w), null, null, null, ComposableLambdaKt.composableLambdaInstance(0x3E06A802, true, new f7(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F)), 14, null);
        return Unit.INSTANCE;
    }
}

