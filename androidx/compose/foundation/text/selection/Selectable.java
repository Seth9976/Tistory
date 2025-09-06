package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\tH&J\u0010\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\rH&J\u0010\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\f\u001A\u00020\rH&J%\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u00132\u0006\u0010\u0014\u001A\u00020\u0015H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0018\u001A\u00020\rH&J\n\u0010\u0019\u001A\u0004\u0018\u00010\u001AH&J\u0010\u0010\u001B\u001A\u00020\u000F2\u0006\u0010\f\u001A\u00020\rH&J\u0010\u0010\u001C\u001A\u00020\u000F2\u0006\u0010\f\u001A\u00020\rH&J\u001D\u0010\u001D\u001A\u00020\u001E2\u0006\u0010\f\u001A\u00020\rH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001F\u0010 J\n\u0010!\u001A\u0004\u0018\u00010\u0013H&J\b\u0010\"\u001A\u00020#H&R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006$À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/Selectable;", "", "selectableId", "", "getSelectableId", "()J", "appendSelectableInfoToBuilder", "", "builder", "Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;", "getBoundingBox", "Landroidx/compose/ui/geometry/Rect;", "offset", "", "getCenterYForOffset", "", "getHandlePosition", "Landroidx/compose/ui/geometry/Offset;", "selection", "Landroidx/compose/foundation/text/selection/Selection;", "isStartHandle", "", "getHandlePosition-dBAh8RU", "(Landroidx/compose/foundation/text/selection/Selection;Z)J", "getLastVisibleOffset", "getLayoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getLineLeft", "getLineRight", "getRangeOfLineContaining", "Landroidx/compose/ui/text/TextRange;", "getRangeOfLineContaining--jx7JFs", "(I)J", "getSelectAllSelection", "getText", "Landroidx/compose/ui/text/AnnotatedString;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface Selectable {
    void appendSelectableInfoToBuilder(@NotNull SelectionLayoutBuilder arg1);

    @NotNull
    Rect getBoundingBox(int arg1);

    float getCenterYForOffset(int arg1);

    long getHandlePosition-dBAh8RU(@NotNull Selection arg1, boolean arg2);

    int getLastVisibleOffset();

    @Nullable
    LayoutCoordinates getLayoutCoordinates();

    float getLineLeft(int arg1);

    float getLineRight(int arg1);

    long getRangeOfLineContaining--jx7JFs(int arg1);

    @Nullable
    Selection getSelectAllSelection();

    long getSelectableId();

    @NotNull
    AnnotatedString getText();
}

