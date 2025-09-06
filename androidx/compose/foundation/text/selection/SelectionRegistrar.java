package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 $2\u00020\u0001:\u0001$J\b\u0010\u0007\u001A\u00020\bH&J\u0010\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\bH&J\u0010\u0010\f\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\bH&JB\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0014\u001A\u00020\u000E2\u0006\u0010\u0015\u001A\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u000EH&ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001A\u001A\u00020\nH&J\u0018\u0010\u001B\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0017\u001A\u00020\u000EH&J2\u0010\u001C\u001A\u00020\n2\u0006\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u001D\u001A\u00020\u00122\u0006\u0010\u0015\u001A\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u000EH&ø\u0001\u0000¢\u0006\u0004\b\u001E\u0010\u001FJ\u0010\u0010 \u001A\u00020!2\u0006\u0010\"\u001A\u00020!H&J\u0010\u0010#\u001A\u00020\n2\u0006\u0010\"\u001A\u00020!H&R\u0018\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006%À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "", "subselections", "Landroidx/collection/LongObjectMap;", "Landroidx/compose/foundation/text/selection/Selection;", "getSubselections", "()Landroidx/collection/LongObjectMap;", "nextSelectableId", "", "notifyPositionChange", "", "selectableId", "notifySelectableChange", "notifySelectionUpdate", "", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "newPosition", "Landroidx/compose/ui/geometry/Offset;", "previousPosition", "isStartHandle", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "isInTouchMode", "notifySelectionUpdate-njBpvok", "(Landroidx/compose/ui/layout/LayoutCoordinates;JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)Z", "notifySelectionUpdateEnd", "notifySelectionUpdateSelectAll", "notifySelectionUpdateStart", "startPosition", "notifySelectionUpdateStart-ubNVwUQ", "(Landroidx/compose/ui/layout/LayoutCoordinates;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)V", "subscribe", "Landroidx/compose/foundation/text/selection/Selectable;", "selectable", "unsubscribe", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface SelectionRegistrar {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrar$Companion;", "", "", "InvalidSelectableId", "J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public static final long InvalidSelectableId;
        public static final Companion a;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
    }

    @NotNull
    public static final Companion Companion;
    public static final long InvalidSelectableId;

    static {
        SelectionRegistrar.Companion = Companion.a;
    }

    @NotNull
    LongObjectMap getSubselections();

    long nextSelectableId();

    void notifyPositionChange(long arg1);

    void notifySelectableChange(long arg1);

    boolean notifySelectionUpdate-njBpvok(@NotNull LayoutCoordinates arg1, long arg2, long arg3, boolean arg4, @NotNull SelectionAdjustment arg5, boolean arg6);

    void notifySelectionUpdateEnd();

    void notifySelectionUpdateSelectAll(long arg1, boolean arg2);

    void notifySelectionUpdateStart-ubNVwUQ(@NotNull LayoutCoordinates arg1, long arg2, @NotNull SelectionAdjustment arg3, boolean arg4);

    @NotNull
    Selectable subscribe(@NotNull Selectable arg1);

    void unsubscribe(@NotNull Selectable arg1);
}

