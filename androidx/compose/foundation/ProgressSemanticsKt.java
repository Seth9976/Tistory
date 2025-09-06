package androidx.compose.foundation;

import androidx.annotation.IntRange;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.constraintlayout.compose.j;
import ce.e;
import kotlin.Metadata;
import kotlin.ranges.ClosedFloatingPointRange;
import org.jetbrains.annotations.NotNull;
import u.w2;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001A\f\u0010\u0000\u001A\u00020\u0001*\u00020\u0001H\u0007\u001A.\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0003\u0010\u0006\u001A\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"progressSemantics", "Landroidx/compose/ui/Modifier;", "value", "", "valueRange", "Lkotlin/ranges/ClosedFloatingPointRange;", "steps", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ProgressSemanticsKt {
    @Stable
    @NotNull
    public static final Modifier progressSemantics(@NotNull Modifier modifier0) {
        return SemanticsModifierKt.semantics(modifier0, true, w2.w);
    }

    @Stable
    @NotNull
    public static final Modifier progressSemantics(@NotNull Modifier modifier0, float f, @NotNull ClosedFloatingPointRange closedFloatingPointRange0, @IntRange(from = 0L) int v) {
        return SemanticsModifierKt.semantics(modifier0, true, new j(f, closedFloatingPointRange0, v));
    }

    public static Modifier progressSemantics$default(Modifier modifier0, float f, ClosedFloatingPointRange closedFloatingPointRange0, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            closedFloatingPointRange0 = e.rangeTo(0.0f, 1.0f);
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        return ProgressSemanticsKt.progressSemantics(modifier0, f, closedFloatingPointRange0, v);
    }
}

