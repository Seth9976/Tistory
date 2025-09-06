package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A2\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000B\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\f"}, d2 = {"calculateSelectionMagnifierCenterAndroid", "Landroidx/compose/ui/geometry/Offset;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "selectionState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "magnifierSize", "Landroidx/compose/ui/unit/IntSize;", "calculateSelectionMagnifierCenterAndroid-hUlJWOE", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;J)J", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextFieldMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldMagnifier.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldMagnifierKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
public final class TextFieldMagnifierKt {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Handle.values().length];
            try {
                arr_v[Handle.Cursor.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Handle.SelectionStart.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Handle.SelectionEnd.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final long calculateSelectionMagnifierCenterAndroid-hUlJWOE(@NotNull TransformedTextFieldState transformedTextFieldState0, @NotNull TextFieldSelectionState textFieldSelectionState0, @NotNull TextLayoutState textLayoutState0, long v) {
        int v4;
        long v1 = textFieldSelectionState0.getHandleDragPosition-F1C5BW0();
        if(!OffsetKt.isUnspecified-k-4lQ0M(v1) && transformedTextFieldState0.getVisualText().length() != 0) {
            long v2 = transformedTextFieldState0.getVisualText().getSelection-d9O1mEE();
            Handle handle0 = textFieldSelectionState0.getDraggingHandle();
            int v3 = handle0 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[handle0.ordinal()];
            if(v3 != -1) {
                if(v3 == 1 || v3 == 2) {
                    v4 = TextRange.getStart-impl(v2);
                }
                else {
                    if(v3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    v4 = TextRange.getEnd-impl(v2);
                }
                TextLayoutResult textLayoutResult0 = textLayoutState0.getLayoutResult();
                if(textLayoutResult0 == null) {
                    return 0x7FC000007FC00000L;
                }
                float f = Offset.getX-impl(v1);
                int v5 = textLayoutResult0.getLineForOffset(v4);
                float f1 = textLayoutResult0.getLineLeft(v5);
                float f2 = textLayoutResult0.getLineRight(v5);
                float f3 = c.coerceIn(f, Math.min(f1, f2), Math.max(f1, f2));
                if(!IntSize.equals-impl0(v, 0L) && Math.abs(f - f3) > ((float)(IntSize.getWidth-impl(v) / 2))) {
                    return 0x7FC000007FC00000L;
                }
                float f4 = textLayoutResult0.getLineTop(v5);
                long v6 = OffsetKt.Offset(f3, (textLayoutResult0.getLineBottom(v5) - f4) / 2.0f + f4);
                LayoutCoordinates layoutCoordinates0 = textLayoutState0.getTextLayoutNodeCoordinates();
                if(layoutCoordinates0 != null) {
                    if(!layoutCoordinates0.isAttached()) {
                        layoutCoordinates0 = null;
                    }
                    if(layoutCoordinates0 != null) {
                        v6 = TextLayoutStateKt.coerceIn-3MmeM6k(v6, SelectionManagerKt.visibleBounds(layoutCoordinates0));
                    }
                }
                return TextLayoutStateKt.fromTextLayoutToCore-Uv8p0NA(textLayoutState0, v6);
            }
            return 0x7FC000007FC00000L;
        }
        return 0x7FC000007FC00000L;
    }
}

