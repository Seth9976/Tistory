package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.semantics.CollectionInfo;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\b\u0010\u000E\u001A\u00020\u000FH&J\u0016\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0003H¦@¢\u0006\u0002\u0010\u0013R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001A\u00020\u0007X¦\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\tR\u0012\u0010\n\u001A\u00020\u0007X¦\u0004¢\u0006\u0006\u001A\u0004\b\u000B\u0010\tR\u0012\u0010\f\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\r\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "", "contentPadding", "", "getContentPadding", "()I", "maxScrollOffset", "", "getMaxScrollOffset", "()F", "scrollOffset", "getScrollOffset", "viewport", "getViewport", "collectionInfo", "Landroidx/compose/ui/semantics/CollectionInfo;", "scrollToItem", "", "index", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface LazyLayoutSemanticState {
    @NotNull
    CollectionInfo collectionInfo();

    int getContentPadding();

    float getMaxScrollOffset();

    float getScrollOffset();

    int getViewport();

    @Nullable
    Object scrollToItem(int arg1, @NotNull Continuation arg2);
}

