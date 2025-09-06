package androidx.compose.ui.text.platform;

import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.ParagraphInfo;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001A^\u0010\u0012\u001A\u00020\u000F*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/MultiParagraph;", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/graphics/Brush;", "brush", "", "alpha", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/style/TextDecoration;", "decoration", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "", "drawMultiParagraph-7AXcY_I", "(Landroidx/compose/ui/text/MultiParagraph;Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "drawMultiParagraph", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidMultiParagraphDraw.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidMultiParagraphDraw.android.kt\nandroidx/compose/ui/text/platform/AndroidMultiParagraphDraw_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,95:1\n33#2,6:96\n33#2,6:102\n33#2,6:108\n*S KotlinDebug\n*F\n+ 1 AndroidMultiParagraphDraw.android.kt\nandroidx/compose/ui/text/platform/AndroidMultiParagraphDraw_androidKt\n*L\n53#1:96,6\n60#1:102,6\n90#1:108,6\n*E\n"})
public final class AndroidMultiParagraphDraw_androidKt {
    public static final void a(MultiParagraph multiParagraph0, Canvas canvas0, Brush brush0, float f, Shadow shadow0, TextDecoration textDecoration0, DrawStyle drawStyle0, int v) {
        List list0 = multiParagraph0.getParagraphInfoList$ui_text_release();
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            ParagraphInfo paragraphInfo0 = (ParagraphInfo)list0.get(v2);
            paragraphInfo0.getParagraph().paint-hn5TExg(canvas0, brush0, f, shadow0, textDecoration0, drawStyle0, v);
            canvas0.translate(0.0f, paragraphInfo0.getParagraph().getHeight());
        }
    }

    public static final void drawMultiParagraph-7AXcY_I(@NotNull MultiParagraph multiParagraph0, @NotNull Canvas canvas0, @NotNull Brush brush0, float f, @Nullable Shadow shadow0, @Nullable TextDecoration textDecoration0, @Nullable DrawStyle drawStyle0, int v) {
        canvas0.save();
        if(multiParagraph0.getParagraphInfoList$ui_text_release().size() <= 1) {
            AndroidMultiParagraphDraw_androidKt.a(multiParagraph0, canvas0, brush0, f, shadow0, textDecoration0, drawStyle0, v);
        }
        else if(brush0 instanceof SolidColor) {
            AndroidMultiParagraphDraw_androidKt.a(multiParagraph0, canvas0, brush0, f, shadow0, textDecoration0, drawStyle0, v);
        }
        else if(brush0 instanceof ShaderBrush) {
            List list0 = multiParagraph0.getParagraphInfoList$ui_text_release();
            int v1 = list0.size();
            float f1 = 0.0f;
            float f2 = 0.0f;
            for(int v3 = 0; v3 < v1; ++v3) {
                ParagraphInfo paragraphInfo0 = (ParagraphInfo)list0.get(v3);
                f2 += paragraphInfo0.getParagraph().getHeight();
                f1 = Math.max(f1, paragraphInfo0.getParagraph().getWidth());
            }
            Shader shader0 = ((ShaderBrush)brush0).createShader-uvyYCjk(SizeKt.Size(f1, f2));
            Matrix matrix0 = new Matrix();
            shader0.getLocalMatrix(matrix0);
            List list1 = multiParagraph0.getParagraphInfoList$ui_text_release();
            int v4 = list1.size();
            for(int v2 = 0; v2 < v4; ++v2) {
                ParagraphInfo paragraphInfo1 = (ParagraphInfo)list1.get(v2);
                paragraphInfo1.getParagraph().paint-hn5TExg(canvas0, BrushKt.ShaderBrush(shader0), f, shadow0, textDecoration0, drawStyle0, v);
                canvas0.translate(0.0f, paragraphInfo1.getParagraph().getHeight());
                matrix0.setTranslate(0.0f, -paragraphInfo1.getParagraph().getHeight());
                shader0.setLocalMatrix(matrix0);
            }
        }
        canvas0.restore();
    }

    public static void drawMultiParagraph-7AXcY_I$default(MultiParagraph multiParagraph0, Canvas canvas0, Brush brush0, float f, Shadow shadow0, TextDecoration textDecoration0, DrawStyle drawStyle0, int v, int v1, Object object0) {
        AndroidMultiParagraphDraw_androidKt.drawMultiParagraph-7AXcY_I(multiParagraph0, canvas0, brush0, ((v1 & 4) == 0 ? f : NaNf), ((v1 & 8) == 0 ? shadow0 : null), ((v1 & 16) == 0 ? textDecoration0 : null), ((v1 & 0x20) == 0 ? drawStyle0 : null), ((v1 & 0x40) == 0 ? v : 3));
    }
}

