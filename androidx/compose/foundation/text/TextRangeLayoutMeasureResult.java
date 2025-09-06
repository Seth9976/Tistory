package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000E\b\u0000\u0018\u00002\u00020\u0001B\'\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000E\u0010\u000B\u001A\u0004\b\u000F\u0010\rR\u001D\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/text/TextRangeLayoutMeasureResult;", "", "", "width", "height", "Lkotlin/Function0;", "Landroidx/compose/ui/unit/IntOffset;", "place", "<init>", "(IILkotlin/jvm/functions/Function0;)V", "a", "I", "getWidth", "()I", "b", "getHeight", "c", "Lkotlin/jvm/functions/Function0;", "getPlace", "()Lkotlin/jvm/functions/Function0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextRangeLayoutMeasureResult {
    public static final int $stable;
    public final int a;
    public final int b;
    public final Function0 c;

    public TextRangeLayoutMeasureResult(int v, int v1, @NotNull Function0 function00) {
        this.a = v;
        this.b = v1;
        this.c = function00;
    }

    public final int getHeight() {
        return this.b;
    }

    @NotNull
    public final Function0 getPlace() {
        return this.c;
    }

    public final int getWidth() {
        return this.a;
    }
}

