package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref.BooleanRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001AJ\u0010\u000E\u001A\u00020\u000B2\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001A\u001F\u0010\u0012\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0011\u001A\u00020\u000FH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001A\u001F\u0010\u0016\u001A\u00020\b*\u0004\u0018\u00010\u00142\b\u0010\u0015\u001A\u0004\u0018\u00010\u000BH\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0018\u001A\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001A"}, d2 = {"Landroidx/compose/ui/text/TextLayoutResult;", "layoutResult", "", "rawStartHandleOffset", "rawEndHandleOffset", "rawPreviousHandleOffset", "Landroidx/compose/ui/text/TextRange;", "previousSelectionRange", "", "isStartOfSelection", "isStartHandle", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "getTextFieldSelectionLayout-RcvT-LA", "(Landroidx/compose/ui/text/TextLayoutResult;IIIJZZ)Landroidx/compose/foundation/text/selection/SelectionLayout;", "getTextFieldSelectionLayout", "Landroidx/compose/foundation/text/selection/Direction;", "x", "y", "resolve2dDirection", "(Landroidx/compose/foundation/text/selection/Direction;Landroidx/compose/foundation/text/selection/Direction;)Landroidx/compose/foundation/text/selection/Direction;", "Landroidx/compose/foundation/text/selection/Selection;", "layout", "isCollapsed", "(Landroidx/compose/foundation/text/selection/Selection;Landroidx/compose/foundation/text/selection/SelectionLayout;)Z", "UNASSIGNED_SLOT", "I", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class SelectionLayoutKt {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Direction.values().length];
            try {
                arr_v[Direction.BEFORE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Direction.ON.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Direction.AFTER.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int UNASSIGNED_SLOT = -1;

    public static final ResolvedTextDirection a(TextLayoutResult textLayoutResult0, int v) {
        if(textLayoutResult0.getLayoutInput().getText().length() != 0) {
            int v1 = textLayoutResult0.getLineForOffset(v);
            return (v == 0 || v1 != textLayoutResult0.getLineForOffset(v - 1)) && (v == textLayoutResult0.getLayoutInput().getText().length() || v1 != textLayoutResult0.getLineForOffset(v + 1)) ? textLayoutResult0.getParagraphDirection(v) : textLayoutResult0.getBidiRunDirection(v);
        }
        return textLayoutResult0.getParagraphDirection(v);
    }

    public static final ResolvedTextDirection access$getTextDirectionForOffset(TextLayoutResult textLayoutResult0, int v) {
        return SelectionLayoutKt.a(textLayoutResult0, v);
    }

    // 去混淆评级： 低(20)
    @NotNull
    public static final SelectionLayout getTextFieldSelectionLayout-RcvT-LA(@NotNull TextLayoutResult textLayoutResult0, int v, int v1, int v2, long v3, boolean z, boolean z1) {
        return z ? new s1(z1, 1, 1, null, new SelectableInfo(1L, 1, v, v1, v2, textLayoutResult0)) : new s1(z1, 1, 1, new Selection(new AnchorInfo(SelectionLayoutKt.a(textLayoutResult0, TextRange.getStart-impl(v3)), TextRange.getStart-impl(v3), 1L), new AnchorInfo(SelectionLayoutKt.a(textLayoutResult0, TextRange.getEnd-impl(v3)), TextRange.getEnd-impl(v3), 1L), TextRange.getReversed-impl(v3)), new SelectableInfo(1L, 1, v, v1, v2, textLayoutResult0));
    }

    public static final boolean isCollapsed(@Nullable Selection selection0, @Nullable SelectionLayout selectionLayout0) {
        if(selection0 == null) {
            return true;
        }
        if(selectionLayout0 == null) {
            return true;
        }
        if(Long.compare(selection0.getStart().getSelectableId(), selection0.getEnd().getSelectableId()) == 0) {
            return selection0.getStart().getOffset() == selection0.getEnd().getOffset();
        }
        if((selection0.getHandlesCrossed() ? selection0.getStart() : selection0.getEnd()).getOffset() != 0) {
            return false;
        }
        if(selectionLayout0.getFirstInfo().getTextLength() != (selection0.getHandlesCrossed() ? selection0.getEnd() : selection0.getStart()).getOffset()) {
            return false;
        }
        BooleanRef ref$BooleanRef0 = new BooleanRef();
        ref$BooleanRef0.element = true;
        selectionLayout0.forEachMiddleInfo(new u0(ref$BooleanRef0));
        return ref$BooleanRef0.element;
    }

    @NotNull
    public static final Direction resolve2dDirection(@NotNull Direction direction0, @NotNull Direction direction1) {
        int[] arr_v = WhenMappings.$EnumSwitchMapping$0;
        int v = arr_v[direction1.ordinal()];
        if(v != 1) {
            switch(v) {
                case 2: {
                    switch(arr_v[direction0.ordinal()]) {
                        case 1: {
                            return Direction.BEFORE;
                        }
                        case 2: {
                            return Direction.ON;
                        }
                        case 3: {
                            return Direction.AFTER;
                        }
                        default: {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                case 3: {
                    return Direction.AFTER;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return Direction.BEFORE;
    }
}

