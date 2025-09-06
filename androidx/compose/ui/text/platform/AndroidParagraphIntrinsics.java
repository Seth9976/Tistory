package androidx.compose.ui.text.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString.Range;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.LayoutIntrinsics;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.List;
import k2.a;
import k2.g;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0012\u0010\t\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0012\u0010\u000B\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000F\u001A\u00020\u000E\u00A2\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019R#\u0010\t\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0006\u00A2\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001DR#\u0010\u000B\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00068\u0006\u00A2\u0006\f\n\u0004\b\u001E\u0010\u001B\u001A\u0004\b\u001F\u0010\u001DR\u0017\u0010\r\u001A\u00020\f8\u0006\u00A2\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010#R\u0017\u0010\u000F\u001A\u00020\u000E8\u0006\u00A2\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\'R\u001A\u0010-\u001A\u00020(8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010,R\u001A\u00103\u001A\u00020.8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b/\u00100\u001A\u0004\b1\u00102R\u001A\u00109\u001A\u0002048\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u00108R\u001A\u0010?\u001A\u00020:8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b;\u0010<\u001A\u0004\b=\u0010>R\u0014\u0010C\u001A\u00020@8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bA\u0010BR\u0014\u0010E\u001A\u00020@8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bD\u0010BR\u0014\u0010I\u001A\u00020F8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bG\u0010H\u00A8\u0006J"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/unit/Density;", "density", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;)V", "a", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "b", "Landroidx/compose/ui/text/TextStyle;", "getStyle", "()Landroidx/compose/ui/text/TextStyle;", "c", "Ljava/util/List;", "getSpanStyles", "()Ljava/util/List;", "d", "getPlaceholders", "e", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "f", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "g", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "getTextPaint$ui_text_release", "()Landroidx/compose/ui/text/platform/AndroidTextPaint;", "textPaint", "", "h", "Ljava/lang/CharSequence;", "getCharSequence$ui_text_release", "()Ljava/lang/CharSequence;", "charSequence", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "i", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "getLayoutIntrinsics$ui_text_release", "()Landroidx/compose/ui/text/android/LayoutIntrinsics;", "layoutIntrinsics", "", "l", "I", "getTextDirectionHeuristic$ui_text_release", "()I", "textDirectionHeuristic", "", "getMaxIntrinsicWidth", "()F", "maxIntrinsicWidth", "getMinIntrinsicWidth", "minIntrinsicWidth", "", "getHasStaleResolvedFonts", "()Z", "hasStaleResolvedFonts", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidParagraphIntrinsics implements ParagraphIntrinsics {
    public static final int $stable = 8;
    public final String a;
    public final TextStyle b;
    public final List c;
    public final List d;
    public final Resolver e;
    public final Density f;
    public final AndroidTextPaint g;
    public final CharSequence h;
    public final LayoutIntrinsics i;
    public g j;
    public final boolean k;
    public final int l;

    public AndroidParagraphIntrinsics(@NotNull String s, @NotNull TextStyle textStyle0, @NotNull List list0, @NotNull List list1, @NotNull Resolver fontFamily$Resolver0, @NotNull Density density0) {
        this.a = s;
        this.b = textStyle0;
        this.c = list0;
        this.d = list1;
        this.e = fontFamily$Resolver0;
        this.f = density0;
        AndroidTextPaint androidTextPaint0 = new AndroidTextPaint(1, density0.getDensity());
        this.g = androidTextPaint0;
        this.k = AndroidParagraphIntrinsics_androidKt.access$getHasEmojiCompat(textStyle0) ? ((Boolean)EmojiCompatStatus.INSTANCE.getFontLoaded().getValue()).booleanValue() : false;
        this.l = AndroidParagraphIntrinsics_androidKt.resolveTextDirectionHeuristics-HklW4sA(textStyle0.getTextDirection-s_7X-co(), textStyle0.getLocaleList());
        a a0 = new a(this);
        TextPaintExtensions_androidKt.setTextMotion(androidTextPaint0, textStyle0.getTextMotion());
        SpanStyle spanStyle0 = TextPaintExtensions_androidKt.applySpanStyle(androidTextPaint0, textStyle0.toSpanStyle(), a0, density0, !list0.isEmpty());
        if(spanStyle0 != null) {
            int v = list0.size();
            list0 = new ArrayList(v + 1);
            for(int v1 = 0; v1 < v + 1; ++v1) {
                ((ArrayList)list0).add((v1 == 0 ? new Range(spanStyle0, 0, this.a.length()) : ((Range)this.c.get(v1 - 1))));
            }
        }
        float f = this.g.getTextSize();
        CharSequence charSequence0 = AndroidParagraphHelper_androidKt.createCharSequence(this.a, f, this.b, list0, this.d, this.f, a0, this.k);
        this.h = charSequence0;
        this.i = new LayoutIntrinsics(charSequence0, this.g, this.l);
    }

    @NotNull
    public final CharSequence getCharSequence$ui_text_release() {
        return this.h;
    }

    @NotNull
    public final Density getDensity() {
        return this.f;
    }

    @NotNull
    public final Resolver getFontFamilyResolver() {
        return this.e;
    }

    // 去混淆评级： 低(40)
    @Override  // androidx.compose.ui.text.ParagraphIntrinsics
    public boolean getHasStaleResolvedFonts() {
        return (this.j == null ? false : this.j.a()) || !this.k && AndroidParagraphIntrinsics_androidKt.access$getHasEmojiCompat(this.b) && ((Boolean)EmojiCompatStatus.INSTANCE.getFontLoaded().getValue()).booleanValue();
    }

    @NotNull
    public final LayoutIntrinsics getLayoutIntrinsics$ui_text_release() {
        return this.i;
    }

    @Override  // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMaxIntrinsicWidth() {
        return this.i.getMaxIntrinsicWidth();
    }

    @Override  // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMinIntrinsicWidth() {
        return this.i.getMinIntrinsicWidth();
    }

    @NotNull
    public final List getPlaceholders() {
        return this.d;
    }

    @NotNull
    public final List getSpanStyles() {
        return this.c;
    }

    @NotNull
    public final TextStyle getStyle() {
        return this.b;
    }

    @NotNull
    public final String getText() {
        return this.a;
    }

    public final int getTextDirectionHeuristic$ui_text_release() {
        return this.l;
    }

    @NotNull
    public final AndroidTextPaint getTextPaint$ui_text_release() {
        return this.g;
    }
}

