package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import android.text.Layout.Alignment;
import android.text.Layout;
import androidx.compose.ui.text.android.TextLayout_androidKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001A%\u0010\u0006\u001A\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\b\b\u0002\u0010\u0004\u001A\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001A%\u0010\b\u001A\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\b\b\u0002\u0010\u0004\u001A\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Landroid/text/Layout;", "", "lineIndex", "Landroid/graphics/Paint;", "paint", "", "getEllipsizedLeftPadding", "(Landroid/text/Layout;ILandroid/graphics/Paint;)F", "getEllipsizedRightPadding", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class IndentationFixSpan_androidKt {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Layout.Alignment.values().length];
            try {
                arr_v[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final float getEllipsizedLeftPadding(@NotNull Layout layout0, int v, @NotNull Paint paint0) {
        float f = layout0.getLineLeft(v);
        if(TextLayout_androidKt.isLineEllipsized(layout0, v) && layout0.getParagraphDirection(v) == 1 && f < 0.0f) {
            int v1 = layout0.getLineStart(v);
            float f1 = layout0.getPrimaryHorizontal(layout0.getEllipsisStart(v) + v1);
            float f2 = paint0.measureText("…") + (f1 - f);
            Layout.Alignment layout$Alignment0 = layout0.getParagraphAlignment(v);
            return (layout$Alignment0 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[layout$Alignment0.ordinal()]) == 1 ? (((float)layout0.getWidth()) - f2) / 2.0f + Math.abs(f) : ((float)layout0.getWidth()) - f2 + Math.abs(f);
        }
        return 0.0f;
    }

    public static float getEllipsizedLeftPadding$default(Layout layout0, int v, Paint paint0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            paint0 = layout0.getPaint();
        }
        return IndentationFixSpan_androidKt.getEllipsizedLeftPadding(layout0, v, paint0);
    }

    public static final float getEllipsizedRightPadding(@NotNull Layout layout0, int v, @NotNull Paint paint0) {
        int v1 = -1;
        if(TextLayout_androidKt.isLineEllipsized(layout0, v) && layout0.getParagraphDirection(v) == -1 && ((float)layout0.getWidth()) < layout0.getLineRight(v)) {
            int v2 = layout0.getLineStart(v);
            float f = layout0.getPrimaryHorizontal(layout0.getEllipsisStart(v) + v2);
            float f1 = layout0.getLineRight(v);
            float f2 = paint0.measureText("…") + (f1 - f);
            Layout.Alignment layout$Alignment0 = layout0.getParagraphAlignment(v);
            if(layout$Alignment0 != null) {
                v1 = WhenMappings.$EnumSwitchMapping$0[layout$Alignment0.ordinal()];
            }
            return v1 == 1 ? ((float)layout0.getWidth()) - layout0.getLineRight(v) - (((float)layout0.getWidth()) - f2) / 2.0f : ((float)layout0.getWidth()) - layout0.getLineRight(v) - (((float)layout0.getWidth()) - f2);
        }
        return 0.0f;
    }

    public static float getEllipsizedRightPadding$default(Layout layout0, int v, Paint paint0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            paint0 = layout0.getPaint();
        }
        return IndentationFixSpan_androidKt.getEllipsizedRightPadding(layout0, v, paint0);
    }
}

