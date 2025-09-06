package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.MutatePriority;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\n\u001A\u00020\u000BH&J\b\u0010\f\u001A\u00020\u000BH&J\u0018\u0010\r\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\u000FH¦@¢\u0006\u0002\u0010\u0010R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0004R\u0018\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00030\u0007X¦\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/TooltipState;", "", "isPersistent", "", "()Z", "isVisible", "transition", "Landroidx/compose/animation/core/MutableTransitionState;", "getTransition", "()Landroidx/compose/animation/core/MutableTransitionState;", "dismiss", "", "onDispose", "show", "mutatePriority", "Landroidx/compose/foundation/MutatePriority;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface TooltipState {
    void dismiss();

    @NotNull
    MutableTransitionState getTransition();

    boolean isPersistent();

    boolean isVisible();

    void onDispose();

    @Nullable
    Object show(@NotNull MutatePriority arg1, @NotNull Continuation arg2);

    static Object show$default(TooltipState tooltipState0, MutatePriority mutatePriority0, Continuation continuation0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
        }
        if((v & 1) != 0) {
            mutatePriority0 = MutatePriority.Default;
        }
        return tooltipState0.show(mutatePriority0, continuation0);
    }
}

