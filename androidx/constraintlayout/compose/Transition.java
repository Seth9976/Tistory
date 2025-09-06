package androidx.constraintlayout.compose;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0007H&J\b\u0010\b\u001A\u00020\tH&J\b\u0010\n\u001A\u00020\tH&¨\u0006\u000B"}, d2 = {"Landroidx/constraintlayout/compose/Transition;", "", "applyTo", "", "transition", "Landroidx/constraintlayout/core/state/Transition;", "type", "", "getEndConstraintSetId", "", "getStartConstraintSetId", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface Transition {
    void applyTo(@NotNull androidx.constraintlayout.core.state.Transition arg1, int arg2);

    @NotNull
    String getEndConstraintSetId();

    @NotNull
    String getStartConstraintSetId();
}

