package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import r0.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\u000B\u0010\fR\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010R\u001D\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000E\u001A\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/semantics/ScrollAxisRange;", "", "Lkotlin/Function0;", "", "value", "maxValue", "", "reverseScrolling", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)V", "", "toString", "()Ljava/lang/String;", "a", "Lkotlin/jvm/functions/Function0;", "getValue", "()Lkotlin/jvm/functions/Function0;", "b", "getMaxValue", "c", "Z", "getReverseScrolling", "()Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ScrollAxisRange {
    public static final int $stable;
    public final Function0 a;
    public final Function0 b;
    public final boolean c;

    public ScrollAxisRange(@NotNull Function0 function00, @NotNull Function0 function01, boolean z) {
        this.a = function00;
        this.b = function01;
        this.c = z;
    }

    public ScrollAxisRange(Function0 function00, Function0 function01, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            z = false;
        }
        this(function00, function01, z);
    }

    @NotNull
    public final Function0 getMaxValue() {
        return this.b;
    }

    public final boolean getReverseScrolling() {
        return this.c;
    }

    @NotNull
    public final Function0 getValue() {
        return this.a;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ScrollAxisRange(value=");
        stringBuilder0.append(((Number)this.a.invoke()).floatValue());
        stringBuilder0.append(", maxValue=");
        stringBuilder0.append(((Number)this.b.invoke()).floatValue());
        stringBuilder0.append(", reverseScrolling=");
        return a.p(stringBuilder0, this.c, ')');
    }
}

