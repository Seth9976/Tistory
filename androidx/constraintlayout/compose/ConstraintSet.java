package androidx.constraintlayout.compose;

import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.core.state.Transition;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0007\n\u0000\bg\u0018\u00002\u00020\u0001J\u001E\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0018\u0010\u0002\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\fH\u0016J\u0016\u0010\r\u001A\u00020\u000E2\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0018\u0010\u000F\u001A\u00020\u00002\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0013H\u0016¨\u0006\u0014"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintSet;", "", "applyTo", "", "state", "Landroidx/constraintlayout/compose/State;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "transition", "Landroidx/constraintlayout/core/state/Transition;", "type", "", "isDirty", "", "override", "name", "", "value", "", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface ConstraintSet {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static void applyTo(@NotNull ConstraintSet constraintSet0, @NotNull Transition transition0, int v) {
            Intrinsics.checkNotNullParameter(constraintSet0, "this");
            Intrinsics.checkNotNullParameter(transition0, "transition");
        }

        public static boolean isDirty(@NotNull ConstraintSet constraintSet0, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(constraintSet0, "this");
            Intrinsics.checkNotNullParameter(list0, "measurables");
            return true;
        }

        @NotNull
        public static ConstraintSet override(@NotNull ConstraintSet constraintSet0, @NotNull String s, float f) {
            Intrinsics.checkNotNullParameter(constraintSet0, "this");
            Intrinsics.checkNotNullParameter(s, "name");
            return constraintSet0;
        }
    }

    void applyTo(@NotNull State arg1, @NotNull List arg2);

    void applyTo(@NotNull Transition arg1, int arg2);

    boolean isDirty(@NotNull List arg1);

    @NotNull
    ConstraintSet override(@NotNull String arg1, float arg2);
}

