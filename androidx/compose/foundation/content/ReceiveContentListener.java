package androidx.compose.foundation.content;

import androidx.compose.foundation.ExperimentalFoundationApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bç\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H\u0016J\b\u0010\u0004\u001A\u00020\u0003H\u0016J\b\u0010\u0005\u001A\u00020\u0003H\u0016J\b\u0010\u0006\u001A\u00020\u0003H\u0016J\u0012\u0010\u0007\u001A\u0004\u0018\u00010\b2\u0006\u0010\t\u001A\u00020\bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/content/ReceiveContentListener;", "", "onDragEnd", "", "onDragEnter", "onDragExit", "onDragStart", "onReceive", "Landroidx/compose/foundation/content/TransferableContent;", "transferableContent", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface ReceiveContentListener {
    default void onDragEnd() {
    }

    default void onDragEnter() {
    }

    default void onDragExit() {
    }

    default void onDragStart() {
    }

    @Nullable
    TransferableContent onReceive(@NotNull TransferableContent arg1);
}

