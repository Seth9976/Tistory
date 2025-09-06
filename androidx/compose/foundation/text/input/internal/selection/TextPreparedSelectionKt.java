package androidx.compose.foundation.text.input.internal.selection;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.input.internal.IndexTransformationType;
import androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A(\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH\u0001¨\u0006\t"}, d2 = {"calculateAdjacentCursorPosition", "", "transformedText", "", "cursor", "forward", "", "state", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt\n+ 2 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldStateKt\n*L\n1#1,545:1\n653#2,24:546\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt\n*L\n498#1:546,24\n*E\n"})
public final class TextPreparedSelectionKt {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[IndexTransformationType.values().length];
            try {
                arr_v[IndexTransformationType.Untransformed.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[IndexTransformationType.Deletion.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[IndexTransformationType.Replacement.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[IndexTransformationType.Insertion.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @VisibleForTesting
    public static final int calculateAdjacentCursorPosition(@NotNull String s, int v, boolean z, @NotNull TransformedTextFieldState transformedTextFieldState0) {
        IndexTransformationType indexTransformationType0;
        int v1 = z ? StringHelpers_androidKt.findFollowingBreak(s, v) : StringHelpers_androidKt.findPrecedingBreak(s, v);
        if(v1 == -1) {
            return v;
        }
        long v2 = transformedTextFieldState0.mapFromTransformed--jx7JFs(v1);
        long v3 = transformedTextFieldState0.mapToTransformed-GEjPoXI(v2);
        if(TextRange.getCollapsed-impl(v2) && TextRange.getCollapsed-impl(v3)) {
            indexTransformationType0 = IndexTransformationType.Untransformed;
        }
        else if(TextRange.getCollapsed-impl(v2) || TextRange.getCollapsed-impl(v3)) {
            indexTransformationType0 = !TextRange.getCollapsed-impl(v2) || TextRange.getCollapsed-impl(v3) ? IndexTransformationType.Deletion : IndexTransformationType.Insertion;
        }
        else {
            indexTransformationType0 = IndexTransformationType.Replacement;
        }
        switch(WhenMappings.$EnumSwitchMapping$0[indexTransformationType0.ordinal()]) {
            case 1: 
            case 2: {
                return v1;
            }
            case 3: {
                return z ? TextRange.getEnd-impl(v3) : TextRange.getStart-impl(v3);
            }
            case 4: {
                if(z) {
                    if(v1 == TextRange.getStart-impl(v3)) {
                        transformedTextFieldState0.setSelectionWedgeAffinity(new SelectionWedgeAffinity(WedgeAffinity.Start));
                        return v1;
                    }
                    transformedTextFieldState0.setSelectionWedgeAffinity(new SelectionWedgeAffinity(WedgeAffinity.End));
                    return v;
                }
                if(v1 == TextRange.getEnd-impl(v3)) {
                    transformedTextFieldState0.setSelectionWedgeAffinity(new SelectionWedgeAffinity(WedgeAffinity.End));
                    return v1;
                }
                transformedTextFieldState0.setSelectionWedgeAffinity(new SelectionWedgeAffinity(WedgeAffinity.Start));
                return v;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}

