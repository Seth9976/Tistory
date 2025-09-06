package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle.Unspecified;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u001D\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/TextPainter;", "", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "", "paint", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/text/TextLayoutResult;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextPainter {
    public static final int $stable;
    @NotNull
    public static final TextPainter INSTANCE;

    static {
        TextPainter.INSTANCE = new TextPainter();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final void paint(@NotNull Canvas canvas0, @NotNull TextLayoutResult textLayoutResult0) {
        boolean z = textLayoutResult0.getHasVisualOverflow() && !TextOverflow.equals-impl0(textLayoutResult0.getLayoutInput().getOverflow-gIe3tQ8(), 3);
        if(z) {
            Rect rect0 = RectKt.Rect-tz77jQw(0L, SizeKt.Size(IntSize.getWidth-impl(textLayoutResult0.getSize-YbymL2g()), IntSize.getHeight-impl(textLayoutResult0.getSize-YbymL2g())));
            canvas0.save();
            Canvas.clipRect-mtrdD-E$default(canvas0, rect0, 0, 2, null);
        }
        SpanStyle spanStyle0 = textLayoutResult0.getLayoutInput().getStyle().getSpanStyle$ui_text_release();
        TextDecoration textDecoration0 = spanStyle0.getTextDecoration();
        if(textDecoration0 == null) {
            textDecoration0 = TextDecoration.Companion.getNone();
        }
        Shadow shadow0 = spanStyle0.getShadow() == null ? Shadow.Companion.getNone() : spanStyle0.getShadow();
        DrawStyle drawStyle0 = spanStyle0.getDrawStyle();
        if(drawStyle0 == null) {
            drawStyle0 = Fill.INSTANCE;
        }
        try {
            Brush brush0 = spanStyle0.getBrush();
            if(brush0 == null) {
                MultiParagraph.paint-LG529CI$default(textLayoutResult0.getMultiParagraph(), canvas0, (spanStyle0.getTextForegroundStyle$ui_text_release() == Unspecified.INSTANCE ? 0xFF00000000000000L : spanStyle0.getTextForegroundStyle$ui_text_release().getColor-0d7_KjU()), shadow0, textDecoration0, drawStyle0, 0, 0x20, null);
            }
            else {
                MultiParagraph.paint-hn5TExg$default(textLayoutResult0.getMultiParagraph(), canvas0, brush0, (spanStyle0.getTextForegroundStyle$ui_text_release() == Unspecified.INSTANCE ? 1.0f : spanStyle0.getTextForegroundStyle$ui_text_release().getAlpha()), shadow0, textDecoration0, drawStyle0, 0, 0x40, null);
            }
        }
        finally {
            if(z) {
                canvas0.restore();
            }
        }
    }
}

