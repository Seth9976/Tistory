package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.StringHelpers_jvmKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m0.a0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001A\u0014\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0004H\u0001\u001A\u001C\u0010\u0005\u001A\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001A\u00020\u00012\u0006\u0010\t\u001A\u00020\nH\u0000¨\u0006\u000B"}, d2 = {"mask", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation$Companion;", "character", "", "toVisualText", "", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "codepointTransformation", "offsetMappingCalculator", "Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class CodepointTransformationKt {
    @Stable
    @NotNull
    public static final CodepointTransformation mask(@NotNull Companion codepointTransformation$Companion0, char c) {
        return new a0(c);
    }

    @NotNull
    public static final CharSequence toVisualText(@NotNull TextFieldCharSequence textFieldCharSequence0, @NotNull CodepointTransformation codepointTransformation0, @NotNull OffsetMappingCalculator offsetMappingCalculator0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = 0;
        boolean z = false;
        for(int v1 = 0; v < textFieldCharSequence0.length(); ++v1) {
            int v2 = CodepointHelpers_jvmKt.codePointAt(textFieldCharSequence0, v);
            int v3 = codepointTransformation0.transform(v1, v2);
            int v4 = CodepointHelpers_jvmKt.charCount(v2);
            if(v3 != v2) {
                offsetMappingCalculator0.recordEditOperation(stringBuilder0.length(), stringBuilder0.length() + v4, CodepointHelpers_jvmKt.charCount(v3));
                z = true;
            }
            StringHelpers_jvmKt.appendCodePointX(stringBuilder0, v3);
            v += v4;
        }
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return z ? s : textFieldCharSequence0;
    }
}

