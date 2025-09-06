package androidx.compose.ui.text.style;

import androidx.compose.ui.text.SpanStyleKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001A\u001E\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u0005¨\u0006\u0006"}, d2 = {"lerp", "Landroidx/compose/ui/text/style/TextIndent;", "start", "stop", "fraction", "", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class TextIndentKt {
    @NotNull
    public static final TextIndent lerp(@NotNull TextIndent textIndent0, @NotNull TextIndent textIndent1, float f) {
        return new TextIndent(SpanStyleKt.lerpTextUnitInheritable-C3pnCVY(textIndent0.getFirstLine-XSAIIZE(), textIndent1.getFirstLine-XSAIIZE(), f), SpanStyleKt.lerpTextUnitInheritable-C3pnCVY(textIndent0.getRestLine-XSAIIZE(), textIndent1.getRestLine-XSAIIZE(), f), null);
    }
}

