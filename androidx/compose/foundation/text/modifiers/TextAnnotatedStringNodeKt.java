package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0000\u001A\f\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"hasLinks", "", "Landroidx/compose/ui/text/AnnotatedString;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class TextAnnotatedStringNodeKt {
    public static final boolean hasLinks(@NotNull AnnotatedString annotatedString0) {
        return annotatedString0.hasLinkAnnotations(0, annotatedString0.length());
    }
}

