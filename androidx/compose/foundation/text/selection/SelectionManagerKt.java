package androidx.compose.foundation.text.selection;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.text.Handle;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0004\u001A%\u0010\u0003\u001A\u0004\u0018\u00010\u00002\b\u0010\u0001\u001A\u0004\u0018\u00010\u00002\b\u0010\u0002\u001A\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001A1\u0010\f\u001A\u00020\u000B2\u0018\u0010\b\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00000\u00060\u00052\u0006\u0010\n\u001A\u00020\tH\u0001¢\u0006\u0004\b\f\u0010\r\u001A\"\u0010\u0015\u001A\u00020\u00122\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u0010H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001A\u0013\u0010\u0016\u001A\u00020\u000B*\u00020\tH\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001A\u001E\u0010\u001C\u001A\u00020\u0019*\u00020\u000B2\u0006\u0010\u0018\u001A\u00020\u0012H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001A\u0010\u001B\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001D"}, d2 = {"Landroidx/compose/foundation/text/selection/Selection;", "lhs", "rhs", "merge", "(Landroidx/compose/foundation/text/selection/Selection;Landroidx/compose/foundation/text/selection/Selection;)Landroidx/compose/foundation/text/selection/Selection;", "", "Lkotlin/Pair;", "Landroidx/compose/foundation/text/selection/Selectable;", "selectableSubSelectionPairs", "Landroidx/compose/ui/layout/LayoutCoordinates;", "containerCoordinates", "Landroidx/compose/ui/geometry/Rect;", "getSelectedRegionRect", "(Ljava/util/List;Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/foundation/text/selection/SelectionManager;", "manager", "Landroidx/compose/ui/unit/IntSize;", "magnifierSize", "Landroidx/compose/ui/geometry/Offset;", "calculateSelectionMagnifierCenterAndroid-O0kMr_c", "(Landroidx/compose/foundation/text/selection/SelectionManager;J)J", "calculateSelectionMagnifierCenterAndroid", "visibleBounds", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;", "offset", "", "containsInclusive-Uv8p0NA", "(Landroidx/compose/ui/geometry/Rect;J)Z", "containsInclusive", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManagerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1073:1\n33#2,6:1074\n*S KotlinDebug\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManagerKt\n*L\n945#1:1074,6\n*E\n"})
public final class SelectionManagerKt {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Handle.values().length];
            try {
                arr_v[Handle.SelectionStart.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Handle.SelectionEnd.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Handle.Cursor.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final Rect a;

    static {
        SelectionManagerKt.a = new Rect(Infinityf, Infinityf, -Infinityf, -Infinityf);
    }

    public static final long a(SelectionManager selectionManager0, long v, AnchorInfo selection$AnchorInfo0) {
        float f1;
        Selectable selectable0 = selectionManager0.getAnchorSelectable$foundation_release(selection$AnchorInfo0);
        if(selectable0 == null) {
            return 0x7FC000007FC00000L;
        }
        LayoutCoordinates layoutCoordinates0 = selectionManager0.getContainerLayoutCoordinates();
        if(layoutCoordinates0 == null) {
            return 0x7FC000007FC00000L;
        }
        LayoutCoordinates layoutCoordinates1 = selectable0.getLayoutCoordinates();
        if(layoutCoordinates1 == null) {
            return 0x7FC000007FC00000L;
        }
        int v1 = selection$AnchorInfo0.getOffset();
        if(v1 > selectable0.getLastVisibleOffset()) {
            return 0x7FC000007FC00000L;
        }
        Offset offset0 = selectionManager0.getCurrentDragPosition-_m7T9-E();
        Intrinsics.checkNotNull(offset0);
        float f = Offset.getX-impl(layoutCoordinates1.localPositionOf-R5De75A(layoutCoordinates0, offset0.unbox-impl()));
        long v2 = selectable0.getRangeOfLineContaining--jx7JFs(v1);
        if(TextRange.getCollapsed-impl(v2)) {
            f1 = selectable0.getLineLeft(v1);
        }
        else {
            float f2 = selectable0.getLineLeft(TextRange.getStart-impl(v2));
            float f3 = selectable0.getLineRight(TextRange.getEnd-impl(v2) - 1);
            f1 = c.coerceIn(f, Math.min(f2, f3), Math.max(f2, f3));
        }
        if(f1 == -1.0f) {
            return 0x7FC000007FC00000L;
        }
        if(!IntSize.equals-impl0(v, 0L) && Math.abs(f - f1) > ((float)(IntSize.getWidth-impl(v) / 2))) {
            return 0x7FC000007FC00000L;
        }
        float f4 = selectable0.getCenterYForOffset(v1);
        return f4 == -1.0f ? 0x7FC000007FC00000L : layoutCoordinates0.localPositionOf-R5De75A(layoutCoordinates1, OffsetKt.Offset(f1, f4));
    }

    public static final List access$firstAndLast(List list0) {
        switch(list0.size()) {
            case 0: 
            case 1: {
                return list0;
            }
            default: {
                return CollectionsKt__CollectionsKt.listOf(new Object[]{CollectionsKt___CollectionsKt.first(list0), CollectionsKt___CollectionsKt.last(list0)});
            }
        }
    }

    public static final long calculateSelectionMagnifierCenterAndroid-O0kMr_c(@NotNull SelectionManager selectionManager0, long v) {
        Selection selection0 = selectionManager0.getSelection();
        if(selection0 == null) {
            return 0x7FC000007FC00000L;
        }
        Handle handle0 = selectionManager0.getDraggingHandle();
        switch((handle0 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[handle0.ordinal()])) {
            case -1: {
                return 0x7FC000007FC00000L;
            }
            case 1: {
                return SelectionManagerKt.a(selectionManager0, v, selection0.getStart());
            }
            case 2: {
                return SelectionManagerKt.a(selectionManager0, v, selection0.getEnd());
            }
            case 3: {
                throw new IllegalStateException("SelectionContainer does not support cursor");
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static final boolean containsInclusive-Uv8p0NA(@NotNull Rect rect0, long v) {
        float f = Offset.getX-impl(v);
        if(rect0.getLeft() <= f && f <= rect0.getRight()) {
            float f1 = Offset.getY-impl(v);
            return rect0.getTop() <= f1 && f1 <= rect0.getBottom();
        }
        return false;
    }

    @VisibleForTesting
    @NotNull
    public static final Rect getSelectedRegionRect(@NotNull List list0, @NotNull LayoutCoordinates layoutCoordinates0) {
        int v6;
        Rect rect0 = SelectionManagerKt.a;
        if(list0.isEmpty()) {
            return rect0;
        }
        float f = rect0.component1();
        float f1 = rect0.component2();
        float f2 = rect0.component3();
        float f3 = rect0.component4();
        int v = list0.size();
        int v1 = 0;
        while(v1 < v) {
            Pair pair0 = (Pair)list0.get(v1);
            Selectable selectable0 = (Selectable)pair0.component1();
            Selection selection0 = (Selection)pair0.component2();
            int v2 = selection0.getStart().getOffset();
            int v3 = selection0.getEnd().getOffset();
            if(v2 == v3) {
                v6 = v;
            }
            else {
                LayoutCoordinates layoutCoordinates1 = selectable0.getLayoutCoordinates();
                if(layoutCoordinates1 != null) {
                    int v4 = Math.min(v2, v3);
                    int v5 = Math.max(v2, v3) - 1;
                    int[] arr_v = v4 == v5 ? new int[]{v4} : new int[]{v4, v5};
                    float f4 = rect0.component1();
                    float f5 = rect0.component2();
                    float f6 = rect0.component3();
                    v6 = v;
                    float f7 = rect0.component4();
                    for(int v7 = 0; v7 < arr_v.length; ++v7) {
                        Rect rect1 = selectable0.getBoundingBox(arr_v[v7]);
                        f4 = Math.min(f4, rect1.getLeft());
                        f5 = Math.min(f5, rect1.getTop());
                        f6 = Math.max(f6, rect1.getRight());
                        f7 = Math.max(f7, rect1.getBottom());
                    }
                    long v8 = layoutCoordinates0.localPositionOf-R5De75A(layoutCoordinates1, OffsetKt.Offset(f4, f5));
                    long v9 = layoutCoordinates0.localPositionOf-R5De75A(layoutCoordinates1, OffsetKt.Offset(f6, f7));
                    f = Math.min(f, Offset.getX-impl(v8));
                    f3 = Math.max(f3, Offset.getY-impl(v9));
                    f2 = Math.max(f2, Offset.getX-impl(v9));
                    f1 = Math.min(f1, Offset.getY-impl(v8));
                }
            }
            ++v1;
            v = v6;
        }
        return new Rect(f, f1, f2, f3);
    }

    @Nullable
    public static final Selection merge(@Nullable Selection selection0, @Nullable Selection selection1) {
        if(selection0 != null) {
            Selection selection2 = selection0.merge(selection1);
            return selection2 == null ? selection1 : selection2;
        }
        return selection1;
    }

    @NotNull
    public static final Rect visibleBounds(@NotNull LayoutCoordinates layoutCoordinates0) {
        Rect rect0 = LayoutCoordinatesKt.boundsInWindow(layoutCoordinates0);
        return RectKt.Rect-0a9Yr6o(layoutCoordinates0.windowToLocal-MK-Hz9U(rect0.getTopLeft-F1C5BW0()), layoutCoordinates0.windowToLocal-MK-Hz9U(rect0.getBottomRight-F1C5BW0()));
    }
}

