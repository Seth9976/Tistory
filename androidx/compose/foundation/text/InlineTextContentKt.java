package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString.Builder;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001A#\u0010\u0005\u001A\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\b\b\u0002\u0010\u0003\u001A\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u0007\u001A\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder;", "", "id", "alternateText", "", "appendInlineContent", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Ljava/lang/String;Ljava/lang/String;)V", "INLINE_CONTENT_TAG", "Ljava/lang/String;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class InlineTextContentKt {
    @NotNull
    public static final String INLINE_CONTENT_TAG = "androidx.compose.foundation.text.inlineContent";

    public static final void appendInlineContent(@NotNull Builder annotatedString$Builder0, @NotNull String s, @NotNull String s1) {
        if(s1.length() <= 0) {
            throw new IllegalArgumentException("alternateText can\'t be an empty string.");
        }
        annotatedString$Builder0.pushStringAnnotation("androidx.compose.foundation.text.inlineContent", s);
        annotatedString$Builder0.append(s1);
        annotatedString$Builder0.pop();
    }

    public static void appendInlineContent$default(Builder annotatedString$Builder0, String s, String s1, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = "\uFFFD";
        }
        InlineTextContentKt.appendInlineContent(annotatedString$Builder0, s, s1);
    }
}

