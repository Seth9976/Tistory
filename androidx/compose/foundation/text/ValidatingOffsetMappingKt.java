package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import i6.b;
import kotlin.Metadata;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.VisibleForTesting;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A\u001B\u0010\u0004\u001A\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001A%\u0010\n\u001A\u00020\t*\u00020\u00032\u0006\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000B\"\u001A\u0010\u0011\u001A\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/input/VisualTransformation;", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/input/TransformedText;", "filterWithValidation", "(Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/input/TransformedText;", "", "originalLength", "limit", "", "throwIfNotValidTransform", "(Landroidx/compose/ui/text/input/TransformedText;II)V", "Landroidx/compose/ui/text/input/OffsetMapping;", "a", "Landroidx/compose/ui/text/input/OffsetMapping;", "getValidatingEmptyOffsetMappingIdentity", "()Landroidx/compose/ui/text/input/OffsetMapping;", "ValidatingEmptyOffsetMappingIdentity", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ValidatingOffsetMappingKt {
    public static final b a;

    static {
        ValidatingOffsetMappingKt.a = new b(OffsetMapping.Companion.getIdentity(), 0, 0);
    }

    public static final void a(int v, int v1, int v2) {
        if(v < 0 || v > v1) {
            throw new IllegalStateException(a5.b.p(q.u("OffsetMapping.originalToTransformed returned invalid mapping: ", v2, " -> ", v, " is not in range of transformed text [0, "), v1, ']').toString());
        }
    }

    public static final void b(int v, int v1, int v2) {
        if(v < 0 || v > v1) {
            throw new IllegalStateException(a5.b.p(q.u("OffsetMapping.transformedToOriginal returned invalid mapping: ", v2, " -> ", v, " is not in range of original text [0, "), v1, ']').toString());
        }
    }

    @NotNull
    public static final TransformedText filterWithValidation(@NotNull VisualTransformation visualTransformation0, @NotNull AnnotatedString annotatedString0) {
        TransformedText transformedText0 = visualTransformation0.filter(annotatedString0);
        ValidatingOffsetMappingKt.throwIfNotValidTransform$default(transformedText0, annotatedString0.length(), 0, 2, null);
        return new TransformedText(transformedText0.getText(), new b(transformedText0.getOffsetMapping(), annotatedString0.length(), transformedText0.getText().length()));
    }

    @NotNull
    public static final OffsetMapping getValidatingEmptyOffsetMappingIdentity() {
        return ValidatingOffsetMappingKt.a;
    }

    @VisibleForTesting
    public static final void throwIfNotValidTransform(@NotNull TransformedText transformedText0, int v, int v1) {
        int v2 = transformedText0.getText().length();
        int v3 = Math.min(v, v1);
        for(int v5 = 0; v5 < v3; ++v5) {
            ValidatingOffsetMappingKt.a(transformedText0.getOffsetMapping().originalToTransformed(v5), v2, v5);
        }
        ValidatingOffsetMappingKt.a(transformedText0.getOffsetMapping().originalToTransformed(v), v2, v);
        int v6 = Math.min(v2, v1);
        for(int v4 = 0; v4 < v6; ++v4) {
            ValidatingOffsetMappingKt.b(transformedText0.getOffsetMapping().transformedToOriginal(v4), v, v4);
        }
        ValidatingOffsetMappingKt.b(transformedText0.getOffsetMapping().transformedToOriginal(v2), v, v2);
    }

    public static void throwIfNotValidTransform$default(TransformedText transformedText0, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 100;
        }
        ValidatingOffsetMappingKt.throwIfNotValidTransform(transformedText0, v, v1);
    }
}

