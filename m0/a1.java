package m0;

import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.runtime.snapshots.StateRecord;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Intrinsics;

public final class a1 extends StateRecord {
    public TextFieldCharSequence c;
    public TextRange d;
    public TextStyle e;
    public boolean f;
    public boolean g;
    public float h;
    public float i;
    public LayoutDirection j;
    public Resolver k;
    public long l;
    public TextLayoutResult m;

    public a1() {
        this.h = NaNf;
        this.i = NaNf;
        this.l = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    }

    @Override  // androidx.compose.runtime.snapshots.StateRecord
    public final void assign(StateRecord stateRecord0) {
        Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.CacheRecord");
        this.c = ((a1)stateRecord0).c;
        this.d = ((a1)stateRecord0).d;
        this.e = ((a1)stateRecord0).e;
        this.f = ((a1)stateRecord0).f;
        this.g = ((a1)stateRecord0).g;
        this.h = ((a1)stateRecord0).h;
        this.i = ((a1)stateRecord0).i;
        this.j = ((a1)stateRecord0).j;
        this.k = ((a1)stateRecord0).k;
        this.l = ((a1)stateRecord0).l;
        this.m = ((a1)stateRecord0).m;
    }

    @Override  // androidx.compose.runtime.snapshots.StateRecord
    public final StateRecord create() {
        return new a1();
    }

    @Override
    public final String toString() {
        return "CacheRecord(visualText=" + this.c + ", composition=" + this.d + ", textStyle=" + this.e + ", singleLine=" + this.f + ", softWrap=" + this.g + ", densityValue=" + this.h + ", fontScale=" + this.i + ", layoutDirection=" + this.j + ", fontFamilyResolver=" + this.k + ", constraints=" + Constraints.toString-impl(this.l) + ", layoutResult=" + this.m + ')';
    }
}

