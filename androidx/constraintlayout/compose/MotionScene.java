package androidx.constraintlayout.compose;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&J\u0012\u0010\u0002\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001A\u00020\u0003H&J\b\u0010\u0007\u001A\u00020\bH&J\b\u0010\t\u001A\u00020\nH&J\u0012\u0010\u000B\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001A\u00020\u0003H&J\b\u0010\f\u001A\u00020\rH&J\u0018\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0006\u001A\u00020\u00032\u0006\u0010\u000F\u001A\u00020\u0003H&J\u0012\u0010\u0010\u001A\u00020\r2\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003H&J\u0018\u0010\u0011\u001A\u00020\r2\u0006\u0010\u0006\u001A\u00020\u00032\u0006\u0010\u000F\u001A\u00020\u0003H&J\u0016\u0010\u0012\u001A\u00020\r2\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00150\u0014H&¨\u0006\u0016"}, d2 = {"Landroidx/constraintlayout/compose/MotionScene;", "", "getConstraintSet", "", "index", "", "name", "getForcedDrawDebug", "Landroidx/constraintlayout/compose/MotionLayoutDebugFlags;", "getForcedProgress", "", "getTransition", "resetForcedProgress", "", "setConstraintSetContent", "content", "setDebugName", "setTransitionContent", "setUpdateFlag", "needsUpdate", "Landroidx/compose/runtime/MutableState;", "", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface MotionScene {
    @Nullable
    String getConstraintSet(int arg1);

    @Nullable
    String getConstraintSet(@NotNull String arg1);

    @NotNull
    MotionLayoutDebugFlags getForcedDrawDebug();

    float getForcedProgress();

    @Nullable
    String getTransition(@NotNull String arg1);

    void resetForcedProgress();

    void setConstraintSetContent(@NotNull String arg1, @NotNull String arg2);

    void setDebugName(@Nullable String arg1);

    void setTransitionContent(@NotNull String arg1, @NotNull String arg2);

    void setUpdateFlag(@NotNull MutableState arg1);
}

