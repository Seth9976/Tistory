package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001E\u0010\u0002\u001A\u00020\u00032\u000E\u0010\u0004\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H§@¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001A\u00020\u00062\u0006\u0010\u0004\u001A\u00020\u0006H\'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "", "bringChildIntoView", "", "localRect", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calculateRectForParent", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface BringIntoViewResponder {
    @ExperimentalFoundationApi
    @Nullable
    Object bringChildIntoView(@NotNull Function0 arg1, @NotNull Continuation arg2);

    @ExperimentalFoundationApi
    @NotNull
    Rect calculateRectForParent(@NotNull Rect arg1);
}

