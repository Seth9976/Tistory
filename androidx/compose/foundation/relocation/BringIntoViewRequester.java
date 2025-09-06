package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J\u001C\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "", "Landroidx/compose/ui/geometry/Rect;", "rect", "", "bringIntoView", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lg0/b;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface BringIntoViewRequester {
    @Nullable
    Object bringIntoView(@Nullable Rect arg1, @NotNull Continuation arg2);

    static Object bringIntoView$default(BringIntoViewRequester bringIntoViewRequester0, Rect rect0, Continuation continuation0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bringIntoView");
        }
        if((v & 1) != 0) {
            rect0 = null;
        }
        return bringIntoViewRequester0.bringIntoView(rect0, continuation0);
    }
}

