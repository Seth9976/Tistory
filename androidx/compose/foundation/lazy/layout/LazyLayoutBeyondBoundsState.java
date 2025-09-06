package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u000E\u001A\u00020\u000FH&R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001A\u00020\u0007X¦\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\tR\u0012\u0010\n\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u000B\u0010\u0005R\u0012\u0010\f\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\r\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "", "firstPlacedIndex", "", "getFirstPlacedIndex", "()I", "hasVisibleItems", "", "getHasVisibleItems", "()Z", "itemCount", "getItemCount", "lastPlacedIndex", "getLastPlacedIndex", "remeasure", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface LazyLayoutBeyondBoundsState {
    int getFirstPlacedIndex();

    boolean getHasVisibleItems();

    int getItemCount();

    int getLastPlacedIndex();

    void remeasure();
}

