package androidx.compose.ui.text.android.style;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0000\u0018\u0000 /2\u00020\u0001:\u0001/B7\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0004\u0012\u0006\u0010\b\u001A\u00020\u0002\u0012\u0006\u0010\t\u001A\u00020\u0004¢\u0006\u0004\b\n\u0010\u000BJ;\u0010\u0014\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\f2\b\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\u0006\u0010\u0010\u001A\u00020\u00042\u0006\u0010\u0011\u001A\u00020\u00042\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015JY\u0010\u001D\u001A\u00020\u001C2\u0006\u0010\u0017\u001A\u00020\u00162\b\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\u0006\u0010\u0010\u001A\u00020\u00042\u0006\u0010\u0011\u001A\u00020\u00042\u0006\u0010\u0018\u001A\u00020\u00022\u0006\u0010\u0019\u001A\u00020\u00042\u0006\u0010\u001A\u001A\u00020\u00042\u0006\u0010\u001B\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\u001D\u0010\u001ER\u0017\u0010\t\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"R$\u0010(\u001A\u00020\u00122\u0006\u0010#\u001A\u00020\u00128\u0006@BX\u0086.¢\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\'R$\u0010+\u001A\u00020\u00042\u0006\u0010#\u001A\u00020\u00048F@BX\u0086\u000E¢\u0006\f\n\u0004\b)\u0010 \u001A\u0004\b*\u0010\"R$\u0010.\u001A\u00020\u00042\u0006\u0010#\u001A\u00020\u00048F@BX\u0086\u000E¢\u0006\f\n\u0004\b,\u0010 \u001A\u0004\b-\u0010\"¨\u00060"}, d2 = {"Landroidx/compose/ui/text/android/style/PlaceholderSpan;", "Landroid/text/style/ReplacementSpan;", "", "width", "", "widthUnit", "height", "heightUnit", "pxPerSp", "verticalAlign", "<init>", "(FIFIFI)V", "Landroid/graphics/Paint;", "paint", "", "text", "start", "end", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Canvas;", "canvas", "x", "top", "y", "bottom", "", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "f", "I", "getVerticalAlign", "()I", "<set-?>", "g", "Landroid/graphics/Paint$FontMetricsInt;", "getFontMetrics", "()Landroid/graphics/Paint$FontMetricsInt;", "fontMetrics", "h", "getWidthPx", "widthPx", "i", "getHeightPx", "heightPx", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPlaceholderSpan.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceholderSpan.android.kt\nandroidx/compose/ui/text/android/style/PlaceholderSpan\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1#2:187\n*E\n"})
public final class PlaceholderSpan extends ReplacementSpan {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000E\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\u000E\u000FR\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000B\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000B\u0010\u0004R\u0014\u0010\f\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/android/style/PlaceholderSpan$Companion;", "", "", "ALIGN_ABOVE_BASELINE", "I", "ALIGN_BOTTOM", "ALIGN_CENTER", "ALIGN_TEXT_BOTTOM", "ALIGN_TEXT_CENTER", "ALIGN_TEXT_TOP", "ALIGN_TOP", "UNIT_EM", "UNIT_SP", "UNIT_UNSPECIFIED", "Unit", "VerticalAlign", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        @Retention(RetentionPolicy.SOURCE)
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/style/PlaceholderSpan$Companion$Unit;", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        public @interface Unit {
        }

        @Retention(RetentionPolicy.SOURCE)
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/style/PlaceholderSpan$Companion$VerticalAlign;", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        public @interface VerticalAlign {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable = 0;
    public static final int ALIGN_ABOVE_BASELINE = 0;
    public static final int ALIGN_BOTTOM = 2;
    public static final int ALIGN_CENTER = 3;
    public static final int ALIGN_TEXT_BOTTOM = 5;
    public static final int ALIGN_TEXT_CENTER = 6;
    public static final int ALIGN_TEXT_TOP = 4;
    public static final int ALIGN_TOP = 1;
    @NotNull
    public static final Companion Companion = null;
    public static final int UNIT_EM = 1;
    public static final int UNIT_SP = 0;
    public static final int UNIT_UNSPECIFIED = 2;
    public final float a;
    public final int b;
    public final float c;
    public final int d;
    public final float e;
    public final int f;
    public Paint.FontMetricsInt g;
    public int h;
    public int i;
    public boolean j;

    static {
        PlaceholderSpan.Companion = new Companion(null);
        PlaceholderSpan.$stable = 8;
    }

    public PlaceholderSpan(float f, int v, float f1, int v1, float f2, int v2) {
        this.a = f;
        this.b = v;
        this.c = f1;
        this.d = v1;
        this.e = f2;
        this.f = v2;
    }

    @Override  // android.text.style.ReplacementSpan
    public void draw(@NotNull Canvas canvas0, @Nullable CharSequence charSequence0, int v, int v1, float f, int v2, int v3, int v4, @NotNull Paint paint0) {
    }

    @NotNull
    public final Paint.FontMetricsInt getFontMetrics() {
        Paint.FontMetricsInt paint$FontMetricsInt0 = this.g;
        if(paint$FontMetricsInt0 != null) {
            return paint$FontMetricsInt0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fontMetrics");
        return null;
    }

    public final int getHeightPx() {
        if(!this.j) {
            throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
        }
        return this.i;
    }

    @Override  // android.text.style.ReplacementSpan
    @SuppressLint({"DocumentExceptions"})
    public int getSize(@NotNull Paint paint0, @Nullable CharSequence charSequence0, int v, int v1, @Nullable Paint.FontMetricsInt paint$FontMetricsInt0) {
        int v2;
        float f3;
        this.j = true;
        float f = paint0.getTextSize();
        this.g = paint0.getFontMetricsInt();
        if(this.getFontMetrics().descent <= this.getFontMetrics().ascent) {
            throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.");
        }
        float f1 = this.e;
        float f2 = this.a;
        switch(this.b) {
            case 0: {
                f3 = f2 * f1;
                break;
            }
            case 1: {
                f3 = f2 * f;
                break;
            }
            default: {
                throw new IllegalArgumentException("Unsupported unit.");
            }
        }
        this.h = PlaceholderSpan_androidKt.ceilToInt(f3);
        float f4 = this.c;
        switch(this.d) {
            case 0: {
                v2 = PlaceholderSpan_androidKt.ceilToInt(f4 * f1);
                break;
            }
            case 1: {
                v2 = PlaceholderSpan_androidKt.ceilToInt(f4 * f);
                break;
            }
            default: {
                throw new IllegalArgumentException("Unsupported unit.");
            }
        }
        this.i = v2;
        if(paint$FontMetricsInt0 != null) {
            paint$FontMetricsInt0.ascent = this.getFontMetrics().ascent;
            paint$FontMetricsInt0.descent = this.getFontMetrics().descent;
            paint$FontMetricsInt0.leading = this.getFontMetrics().leading;
            switch(this.f) {
                case 0: {
                    if(paint$FontMetricsInt0.ascent > -this.getHeightPx()) {
                        paint$FontMetricsInt0.ascent = -this.getHeightPx();
                    }
                    break;
                }
                case 1: 
                case 4: {
                    int v3 = paint$FontMetricsInt0.ascent;
                    if(this.getHeightPx() + v3 > paint$FontMetricsInt0.descent) {
                        int v4 = paint$FontMetricsInt0.ascent;
                        paint$FontMetricsInt0.descent = this.getHeightPx() + v4;
                    }
                    break;
                }
                case 2: 
                case 5: {
                    if(paint$FontMetricsInt0.ascent > paint$FontMetricsInt0.descent - this.getHeightPx()) {
                        paint$FontMetricsInt0.ascent = paint$FontMetricsInt0.descent - this.getHeightPx();
                    }
                    break;
                }
                case 3: 
                case 6: {
                    if(paint$FontMetricsInt0.descent - paint$FontMetricsInt0.ascent < this.getHeightPx()) {
                        int v5 = paint$FontMetricsInt0.ascent - (this.getHeightPx() - (paint$FontMetricsInt0.descent - paint$FontMetricsInt0.ascent)) / 2;
                        paint$FontMetricsInt0.ascent = v5;
                        paint$FontMetricsInt0.descent = this.getHeightPx() + v5;
                    }
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unknown verticalAlign.");
                }
            }
            paint$FontMetricsInt0.top = Math.min(this.getFontMetrics().top, paint$FontMetricsInt0.ascent);
            paint$FontMetricsInt0.bottom = Math.max(this.getFontMetrics().bottom, paint$FontMetricsInt0.descent);
        }
        return this.getWidthPx();
    }

    public final int getVerticalAlign() {
        return this.f;
    }

    public final int getWidthPx() {
        if(!this.j) {
            throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
        }
        return this.h;
    }
}

