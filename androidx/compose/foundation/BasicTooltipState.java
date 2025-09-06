package androidx.compose.foundation;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalFoundationApi
@Stable
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001A\u00020\u0007H&J\b\u0010\b\u001A\u00020\u0007H&J\u0018\u0010\t\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\u000BH¦@¢\u0006\u0002\u0010\fR\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/BasicTooltipState;", "", "isPersistent", "", "()Z", "isVisible", "dismiss", "", "onDispose", "show", "mutatePriority", "Landroidx/compose/foundation/MutatePriority;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface BasicTooltipState {
    void dismiss();

    boolean isPersistent();

    boolean isVisible();

    void onDispose();

    @Nullable
    Object show(@NotNull MutatePriority arg1, @NotNull Continuation arg2);

    static Object show$default(BasicTooltipState basicTooltipState0, MutatePriority mutatePriority0, Continuation continuation0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
        }
        if((v & 1) != 0) {
            mutatePriority0 = MutatePriority.Default;
        }
        return basicTooltipState0.show(mutatePriority0, continuation0);
    }
}

