package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.OffsetMapping;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B5\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001A\u00020\t\u0012\b\b\u0002\u0010\n\u001A\u00020\u000B¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/text/selection/TextPreparedSelection;", "Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "originalText", "Landroidx/compose/ui/text/AnnotatedString;", "originalSelection", "Landroidx/compose/ui/text/TextRange;", "layoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "state", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextPreparedSelection extends BaseTextPreparedSelection {
    public static final int $stable;

    public TextPreparedSelection(AnnotatedString annotatedString0, long v, TextLayoutResult textLayoutResult0, OffsetMapping offsetMapping0, TextPreparedSelectionState textPreparedSelectionState0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this(annotatedString0, v, ((v1 & 4) == 0 ? textLayoutResult0 : null), ((v1 & 8) == 0 ? offsetMapping0 : OffsetMapping.Companion.getIdentity()), ((v1 & 16) == 0 ? textPreparedSelectionState0 : new TextPreparedSelectionState()), null);
    }

    public TextPreparedSelection(AnnotatedString annotatedString0, long v, TextLayoutResult textLayoutResult0, OffsetMapping offsetMapping0, TextPreparedSelectionState textPreparedSelectionState0, DefaultConstructorMarker defaultConstructorMarker0) {
        super(annotatedString0, v, textLayoutResult0, offsetMapping0, textPreparedSelectionState0, null);
    }
}

