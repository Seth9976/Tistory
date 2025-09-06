package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A^\u0010\u0000\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042<\u0010\u0005\u001A8\u0012\u0004\u0012\u00020\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000B\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00010\u0006H\u0080\b¢\u0006\u0002\u0010\r¨\u0006\u000E"}, d2 = {"getIndexTransformationType", "R", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "transformedQueryIndex", "", "onResult", "Lkotlin/Function3;", "Landroidx/compose/foundation/text/input/internal/IndexTransformationType;", "Landroidx/compose/ui/text/TextRange;", "Lkotlin/ParameterName;", "name", "untransformed", "retransformed", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;ILkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class TransformedTextFieldStateKt {
    public static final Object getIndexTransformationType(@NotNull TransformedTextFieldState transformedTextFieldState0, int v, @NotNull Function3 function30) {
        long v1 = transformedTextFieldState0.mapFromTransformed--jx7JFs(v);
        long v2 = transformedTextFieldState0.mapToTransformed-GEjPoXI(v1);
        if(TextRange.getCollapsed-impl(v1) && TextRange.getCollapsed-impl(v2)) {
            return function30.invoke(IndexTransformationType.Untransformed, TextRange.box-impl(v1), TextRange.box-impl(v2));
        }
        if(!TextRange.getCollapsed-impl(v1) && !TextRange.getCollapsed-impl(v2)) {
            return function30.invoke(IndexTransformationType.Replacement, TextRange.box-impl(v1), TextRange.box-impl(v2));
        }
        return !TextRange.getCollapsed-impl(v1) || TextRange.getCollapsed-impl(v2) ? function30.invoke(IndexTransformationType.Deletion, TextRange.box-impl(v1), TextRange.box-impl(v2)) : function30.invoke(IndexTransformationType.Insertion, TextRange.box-impl(v1), TextRange.box-impl(v2));
    }
}

