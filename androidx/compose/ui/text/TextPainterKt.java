package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u0080\u0001\u0010\u001A\u001A\u00020\u0017*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\u0014\b\u0002\u0010\u0012\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000F2\b\b\u0002\u0010\u0014\u001A\u00020\u00132\b\b\u0002\u0010\u0016\u001A\u00020\u0015\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0018\u0010\u0019\u001Aj\u0010\u001A\u001A\u00020\u0017*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u001B2\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u0014\u001A\u00020\u00132\b\b\u0002\u0010\u0016\u001A\u00020\u0015\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001C\u0010\u001D\u001Ah\u0010\u001A\u001A\u00020\u0017*\u00020\u00002\u0006\u0010\u001F\u001A\u00020\u001E2\b\b\u0002\u0010!\u001A\u00020 2\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010#\u001A\u00020\"2\n\b\u0002\u0010%\u001A\u0004\u0018\u00010$2\n\b\u0002\u0010\'\u001A\u0004\u0018\u00010&2\n\b\u0002\u0010)\u001A\u0004\u0018\u00010(2\b\b\u0002\u0010\u0016\u001A\u00020\u0015\u00F8\u0001\u0000\u00A2\u0006\u0004\b*\u0010+\u001Af\u0010\u001A\u001A\u00020\u0017*\u00020\u00002\u0006\u0010\u001F\u001A\u00020\u001E2\u0006\u0010-\u001A\u00020,2\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010#\u001A\u00020\"2\n\b\u0002\u0010%\u001A\u0004\u0018\u00010$2\n\b\u0002\u0010\'\u001A\u0004\u0018\u00010&2\n\b\u0002\u0010)\u001A\u0004\u0018\u00010(2\b\b\u0002\u0010\u0016\u001A\u00020\u0015\u00F8\u0001\u0000\u00A2\u0006\u0004\b.\u0010/\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u00060"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/text/TextMeasurer;", "textMeasurer", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/geometry/Offset;", "topLeft", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "", "drawText-JFhB2K4", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextStyle;IZILjava/util/List;JI)V", "drawText", "", "drawText-TPWCCtM", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Ljava/lang/String;JLandroidx/compose/ui/text/TextStyle;IZIJI)V", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroidx/compose/ui/graphics/Color;", "color", "", "alpha", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "drawText-d8-rzKo", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;JJFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/graphics/Brush;", "brush", "drawText-LVfH_YU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/graphics/Brush;JFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPainter.kt\nandroidx/compose/ui/text/TextPainterKt\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,399:1\n272#2,14:400\n272#2,14:414\n272#2,9:428\n282#2,4:440\n272#2,14:444\n702#3:437\n708#3:438\n696#3:439\n205#4:458\n205#4:461\n26#5:459\n26#5:460\n26#5:462\n26#5:463\n*S KotlinDebug\n*F\n+ 1 TextPainter.kt\nandroidx/compose/ui/text/TextPainterKt\n*L\n167#1:400,14\n233#1:414,14\n277#1:428,9\n277#1:440,4\n337#1:444,14\n284#1:437\n297#1:438\n297#1:439\n375#1:458\n387#1:461\n378#1:459\n380#1:460\n390#1:462\n392#1:463\n*E\n"})
public final class TextPainterKt {
    public static final void a(DrawTransform drawTransform0, TextLayoutResult textLayoutResult0) {
        if(textLayoutResult0.getHasVisualOverflow() && !TextOverflow.equals-impl0(textLayoutResult0.getLayoutInput().getOverflow-gIe3tQ8(), 3)) {
            DrawTransform.clipRect-N_I0leg$default(drawTransform0, 0.0f, 0.0f, ((float)IntSize.getWidth-impl(textLayoutResult0.getSize-YbymL2g())), ((float)IntSize.getHeight-impl(textLayoutResult0.getSize-YbymL2g())), 0, 16, null);
        }
    }

    public static final long b(DrawScope drawScope0, long v, long v1) {
        int v4;
        int v3;
        int v2 = Long.compare(v, 0x7FC000007FC00000L);
        if(v2 != 0 && !Float.isNaN(Size.getWidth-impl(v))) {
            v4 = Math.round(((float)Math.ceil(Size.getWidth-impl(v))));
            v3 = v4;
        }
        else {
            v3 = Math.round(((float)Math.ceil(Size.getWidth-impl(drawScope0.getSize-NH-jbRc()) - Offset.getX-impl(v1))));
            v4 = 0;
        }
        if(v2 == 0 || Float.isNaN(Size.getHeight-impl(v))) {
            return ConstraintsKt.Constraints(v4, v3, 0, Math.round(((float)Math.ceil(Size.getHeight-impl(drawScope0.getSize-NH-jbRc()) - Offset.getY-impl(v1)))));
        }
        int v5 = Math.round(((float)Math.ceil(Size.getHeight-impl(v))));
        return ConstraintsKt.Constraints(v4, v3, v5, v5);
    }

    public static final void drawText-JFhB2K4(@NotNull DrawScope drawScope0, @NotNull TextMeasurer textMeasurer0, @NotNull AnnotatedString annotatedString0, long v, @NotNull TextStyle textStyle0, int v1, boolean z, int v2, @NotNull List list0, long v3, int v4) {
        TextLayoutResult textLayoutResult0 = TextMeasurer.measure-xDpz5zY$default(textMeasurer0, annotatedString0, textStyle0, v1, z, v2, list0, TextPainterKt.b(drawScope0, v3, v), drawScope0.getLayoutDirection(), drawScope0, null, false, 0x600, null);
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v5 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        try {
            DrawTransform drawTransform0 = drawContext0.getTransform();
            drawTransform0.translate(Offset.getX-impl(v), Offset.getY-impl(v));
            TextPainterKt.a(drawTransform0, textLayoutResult0);
            MultiParagraph.paint-LG529CI$default(textLayoutResult0.getMultiParagraph(), drawScope0.getDrawContext().getCanvas(), 0L, null, null, null, v4, 30, null);
        }
        finally {
            a.y(drawContext0, v5);
        }
    }

    // 去混淆评级： 低(40)
    public static void drawText-JFhB2K4$default(DrawScope drawScope0, TextMeasurer textMeasurer0, AnnotatedString annotatedString0, long v, TextStyle textStyle0, int v1, boolean z, int v2, List list0, long v3, int v4, int v5, Object object0) {
        TextPainterKt.drawText-JFhB2K4(drawScope0, textMeasurer0, annotatedString0, ((v5 & 4) == 0 ? v : 0L), ((v5 & 8) == 0 ? textStyle0 : TextStyle.Companion.getDefault()), ((v5 & 16) == 0 ? v1 : 1), ((v5 & 0x20) == 0 ? z : true), ((v5 & 0x40) == 0 ? v2 : 0x7FFFFFFF), ((v5 & 0x80) == 0 ? list0 : CollectionsKt__CollectionsKt.emptyList()), ((v5 & 0x100) == 0 ? v3 : 0x7FC000007FC00000L), ((v5 & 0x200) == 0 ? v4 : 3));
    }

    public static final void drawText-LVfH_YU(@NotNull DrawScope drawScope0, @NotNull TextLayoutResult textLayoutResult0, @NotNull Brush brush0, long v, float f, @Nullable Shadow shadow0, @Nullable TextDecoration textDecoration0, @Nullable DrawStyle drawStyle0, int v1) {
        Shadow shadow1 = shadow0 == null ? textLayoutResult0.getLayoutInput().getStyle().getShadow() : shadow0;
        TextDecoration textDecoration1 = textDecoration0 == null ? textLayoutResult0.getLayoutInput().getStyle().getTextDecoration() : textDecoration0;
        DrawStyle drawStyle1 = drawStyle0 == null ? textLayoutResult0.getLayoutInput().getStyle().getDrawStyle() : drawStyle0;
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v2 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        try {
            DrawTransform drawTransform0 = drawContext0.getTransform();
            drawTransform0.translate(Offset.getX-impl(v), Offset.getY-impl(v));
            TextPainterKt.a(drawTransform0, textLayoutResult0);
            textLayoutResult0.getMultiParagraph().paint-hn5TExg(drawScope0.getDrawContext().getCanvas(), brush0, (Float.isNaN(f) ? textLayoutResult0.getLayoutInput().getStyle().getAlpha() : f), shadow1, textDecoration1, drawStyle1, v1);
        }
        finally {
            a.y(drawContext0, v2);
        }
    }

    // 去混淆评级： 低(20)
    public static void drawText-LVfH_YU$default(DrawScope drawScope0, TextLayoutResult textLayoutResult0, Brush brush0, long v, float f, Shadow shadow0, TextDecoration textDecoration0, DrawStyle drawStyle0, int v1, int v2, Object object0) {
        TextPainterKt.drawText-LVfH_YU(drawScope0, textLayoutResult0, brush0, ((v2 & 4) == 0 ? v : 0L), ((v2 & 8) == 0 ? f : NaNf), ((v2 & 16) == 0 ? shadow0 : null), ((v2 & 0x20) == 0 ? textDecoration0 : null), ((v2 & 0x40) == 0 ? drawStyle0 : null), ((v2 & 0x80) == 0 ? v1 : 3));
    }

    public static final void drawText-TPWCCtM(@NotNull DrawScope drawScope0, @NotNull TextMeasurer textMeasurer0, @NotNull String s, long v, @NotNull TextStyle textStyle0, int v1, boolean z, int v2, long v3, int v4) {
        TextLayoutResult textLayoutResult0 = TextMeasurer.measure-xDpz5zY$default(textMeasurer0, new AnnotatedString(s, null, null, 6, null), textStyle0, v1, z, v2, null, TextPainterKt.b(drawScope0, v3, v), drawScope0.getLayoutDirection(), drawScope0, null, false, 0x620, null);
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v5 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        try {
            DrawTransform drawTransform0 = drawContext0.getTransform();
            drawTransform0.translate(Offset.getX-impl(v), Offset.getY-impl(v));
            TextPainterKt.a(drawTransform0, textLayoutResult0);
            MultiParagraph.paint-LG529CI$default(textLayoutResult0.getMultiParagraph(), drawScope0.getDrawContext().getCanvas(), 0L, null, null, null, v4, 30, null);
        }
        finally {
            a.y(drawContext0, v5);
        }
    }

    // 去混淆评级： 低(40)
    public static void drawText-TPWCCtM$default(DrawScope drawScope0, TextMeasurer textMeasurer0, String s, long v, TextStyle textStyle0, int v1, boolean z, int v2, long v3, int v4, int v5, Object object0) {
        TextPainterKt.drawText-TPWCCtM(drawScope0, textMeasurer0, s, ((v5 & 4) == 0 ? v : 0L), ((v5 & 8) == 0 ? textStyle0 : TextStyle.Companion.getDefault()), ((v5 & 16) == 0 ? v1 : 1), ((v5 & 0x20) == 0 ? z : true), ((v5 & 0x40) == 0 ? v2 : 0x7FFFFFFF), ((v5 & 0x80) == 0 ? v3 : 0x7FC000007FC00000L), ((v5 & 0x100) == 0 ? v4 : 3));
    }

    public static final void drawText-d8-rzKo(@NotNull DrawScope drawScope0, @NotNull TextLayoutResult textLayoutResult0, long v, long v1, float f, @Nullable Shadow shadow0, @Nullable TextDecoration textDecoration0, @Nullable DrawStyle drawStyle0, int v2) {
        Shadow shadow1 = shadow0 == null ? textLayoutResult0.getLayoutInput().getStyle().getShadow() : shadow0;
        TextDecoration textDecoration1 = textDecoration0 == null ? textLayoutResult0.getLayoutInput().getStyle().getTextDecoration() : textDecoration0;
        DrawStyle drawStyle1 = drawStyle0 == null ? textLayoutResult0.getLayoutInput().getStyle().getDrawStyle() : drawStyle0;
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v3 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        try {
            DrawTransform drawTransform0 = drawContext0.getTransform();
            drawTransform0.translate(Offset.getX-impl(v1), Offset.getY-impl(v1));
            TextPainterKt.a(drawTransform0, textLayoutResult0);
            Brush brush0 = textLayoutResult0.getLayoutInput().getStyle().getBrush();
            if(brush0 == null || v != 16L) {
                textLayoutResult0.getMultiParagraph().paint-LG529CI(drawScope0.getDrawContext().getCanvas(), TextDrawStyleKt.modulate-DxMtmZc((v == 16L ? textLayoutResult0.getLayoutInput().getStyle().getColor-0d7_KjU() : v), f), shadow1, textDecoration1, drawStyle1, v2);
            }
            else {
                textLayoutResult0.getMultiParagraph().paint-hn5TExg(drawScope0.getDrawContext().getCanvas(), brush0, (Float.isNaN(f) ? textLayoutResult0.getLayoutInput().getStyle().getAlpha() : f), shadow1, textDecoration1, drawStyle1, v2);
            }
        }
        finally {
            a.y(drawContext0, v3);
        }
    }

    // 去混淆评级： 低(35)
    public static void drawText-d8-rzKo$default(DrawScope drawScope0, TextLayoutResult textLayoutResult0, long v, long v1, float f, Shadow shadow0, TextDecoration textDecoration0, DrawStyle drawStyle0, int v2, int v3, Object object0) {
        TextPainterKt.drawText-d8-rzKo(drawScope0, textLayoutResult0, ((v3 & 2) == 0 ? v : 0L), ((v3 & 4) == 0 ? v1 : 0L), ((v3 & 8) == 0 ? f : NaNf), ((v3 & 16) == 0 ? shadow0 : null), ((v3 & 0x20) == 0 ? textDecoration0 : null), ((v3 & 0x40) == 0 ? drawStyle0 : null), ((v3 & 0x80) == 0 ? v2 : 3));
    }
}

