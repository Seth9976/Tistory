package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b1\b\u0007\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000F\u001A\u00020\u000E\u0012\b\b\u0002\u0010\u0011\u001A\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u0012\u00A2\u0006\u0004\b\u0014\u0010\u0015Bs\b\u0017\u0012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E\u0012\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u0012\u00A2\u0006\u0004\b\u0014\u0010\u0016B7\b\u0017\u0012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b\u00A2\u0006\u0004\b\u0014\u0010\u0017BO\b\u0017\u0012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\f\u00A2\u0006\u0004\b\u0014\u0010\u0018Bg\b\u0017\u0012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E\u0012\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u0010\u00A2\u0006\u0004\b\u0014\u0010\u0019J\u001B\u0010\u001B\u001A\u00020\u00002\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u0000H\u0007\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0018\u0010\u001D\u001A\u00020\u00002\u0006\u0010\u001A\u001A\u00020\u0000H\u0087\u0002\u00A2\u0006\u0004\b\u001D\u0010\u001CJ@\u0010 \u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\bH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001E\u0010\u001FJX\u0010 \u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\fH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b!\u0010\"Jp\u0010 \u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u0010H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b#\u0010$J|\u0010 \u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u0012H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b%\u0010&Jr\u0010 \u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u0012\u00F8\u0001\u0000\u00A2\u0006\u0004\b\'\u0010(J\u001A\u0010*\u001A\u00020)2\b\u0010\u001A\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b*\u0010+J\u000F\u0010-\u001A\u00020,H\u0016\u00A2\u0006\u0004\b-\u0010.J\u000F\u00100\u001A\u00020/H\u0016\u00A2\u0006\u0004\b0\u00101R\u001D\u0010\u0003\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u0010.R\u001D\u0010\u0005\u001A\u00020\u00048\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b5\u00103\u001A\u0004\b6\u0010.R\u001D\u0010\u0007\u001A\u00020\u00068\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b7\u00108\u001A\u0004\b9\u0010:R\u0019\u0010\t\u001A\u0004\u0018\u00010\b8\u0006\u00A2\u0006\f\n\u0004\b;\u0010<\u001A\u0004\b=\u0010>R\u0019\u0010\u000B\u001A\u0004\u0018\u00010\n8\u0006\u00A2\u0006\f\n\u0004\b?\u0010@\u001A\u0004\bA\u0010BR\u0019\u0010\r\u001A\u0004\u0018\u00010\f8\u0006\u00A2\u0006\f\n\u0004\bC\u0010D\u001A\u0004\bE\u0010FR\u001D\u0010\u000F\u001A\u00020\u000E8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bG\u00103\u001A\u0004\bH\u0010.R\u001D\u0010\u0011\u001A\u00020\u00108\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bI\u00103\u001A\u0004\bJ\u0010.R\u0019\u0010\u0013\u001A\u0004\u0018\u00010\u00128\u0006\u00A2\u0006\f\n\u0004\bK\u0010L\u001A\u0004\bM\u0010NR\"\u0010S\u001A\u0004\u0018\u00010\u00028GX\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u0012\u0004\bQ\u0010R\u001A\u0004\bO\u0010PR\"\u0010W\u001A\u0004\u0018\u00010\u00048GX\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u0012\u0004\bV\u0010R\u001A\u0004\bT\u0010UR\"\u0010[\u001A\u0004\u0018\u00010\u00108GX\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u0012\u0004\bZ\u0010R\u001A\u0004\bX\u0010YR\"\u0010_\u001A\u0004\u0018\u00010\u000E8GX\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u0012\u0004\b^\u0010R\u001A\u0004\b\\\u0010]\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006`"}, d2 = {"Landroidx/compose/ui/text/ParagraphStyle;", "", "Landroidx/compose/ui/text/style/TextAlign;", "textAlign", "Landroidx/compose/ui/text/style/TextDirection;", "textDirection", "Landroidx/compose/ui/unit/TextUnit;", "lineHeight", "Landroidx/compose/ui/text/style/TextIndent;", "textIndent", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "platformStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "lineHeightStyle", "Landroidx/compose/ui/text/style/LineBreak;", "lineBreak", "Landroidx/compose/ui/text/style/Hyphens;", "hyphens", "Landroidx/compose/ui/text/style/TextMotion;", "textMotion", "<init>", "(IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "merge", "(Landroidx/compose/ui/text/ParagraphStyle;)Landroidx/compose/ui/text/ParagraphStyle;", "plus", "copy-Elsmlbk", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;)Landroidx/compose/ui/text/ParagraphStyle;", "copy", "copy-xPh5V4g", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-ciSxzs0", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-NH1kkwU", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-ykzQM6k", "(IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/ParagraphStyle;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "getTextAlign-e0LSkKk", "b", "getTextDirection-s_7X-co", "c", "J", "getLineHeight-XSAIIZE", "()J", "d", "Landroidx/compose/ui/text/style/TextIndent;", "getTextIndent", "()Landroidx/compose/ui/text/style/TextIndent;", "e", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "getPlatformStyle", "()Landroidx/compose/ui/text/PlatformParagraphStyle;", "f", "Landroidx/compose/ui/text/style/LineHeightStyle;", "getLineHeightStyle", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "g", "getLineBreak-rAG3T2k", "h", "getHyphens-vmbZdU8", "i", "Landroidx/compose/ui/text/style/TextMotion;", "getTextMotion", "()Landroidx/compose/ui/text/style/TextMotion;", "getTextAlign-buA522U", "()Landroidx/compose/ui/text/style/TextAlign;", "getTextAlign-buA522U$annotations", "()V", "deprecated_boxing_textAlign", "getTextDirection-mmuk1to", "()Landroidx/compose/ui/text/style/TextDirection;", "getTextDirection-mmuk1to$annotations", "deprecated_boxing_textDirection", "getHyphens-EaSxIns", "()Landroidx/compose/ui/text/style/Hyphens;", "getHyphens-EaSxIns$annotations", "deprecated_boxing_hyphens", "getLineBreak-LgCVezo", "()Landroidx/compose/ui/text/style/LineBreak;", "getLineBreak-LgCVezo$annotations", "deprecated_boxing_lineBreak", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ParagraphStyle {
    public static final int $stable;
    public final int a;
    public final int b;
    public final long c;
    public final TextIndent d;
    public final PlatformParagraphStyle e;
    public final LineHeightStyle f;
    public final int g;
    public final int h;
    public final TextMotion i;

    // 去混淆评级： 中等(55)
    public ParagraphStyle(int v, int v1, long v2, TextIndent textIndent0, PlatformParagraphStyle platformParagraphStyle0, LineHeightStyle lineHeightStyle0, int v3, int v4, TextMotion textMotion0, int v5, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v5 & 1) == 0 ? v : 0x80000000), ((v5 & 2) == 0 ? v1 : 0x80000000), ((v5 & 4) == 0 ? v2 : 0x7FC00000L), ((v5 & 8) == 0 ? textIndent0 : null), ((v5 & 16) == 0 ? platformParagraphStyle0 : null), ((v5 & 0x20) == 0 ? lineHeightStyle0 : null), ((v5 & 0x40) == 0 ? v3 : 0), ((v5 & 0x80) == 0 ? v4 : 0x80000000), ((v5 & 0x100) == 0 ? textMotion0 : null), null);
    }

    public ParagraphStyle(int v, int v1, long v2, TextIndent textIndent0, PlatformParagraphStyle platformParagraphStyle0, LineHeightStyle lineHeightStyle0, int v3, int v4, TextMotion textMotion0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = textIndent0;
        this.e = platformParagraphStyle0;
        this.f = lineHeightStyle0;
        this.g = v3;
        this.h = v4;
        this.i = textMotion0;
        if(!TextUnit.equals-impl0(v2, 0x7FC00000L) && TextUnit.getValue-impl(v2) < 0.0f) {
            throw new IllegalStateException(("lineHeight can\'t be negative (" + TextUnit.getValue-impl(v2) + ')').toString());
        }
    }

    public ParagraphStyle(TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 4) != 0) {
            v = 0x7FC00000L;
        }
        this(((v1 & 1) == 0 ? textAlign0 : null), ((v1 & 2) == 0 ? textDirection0 : null), v, ((v1 & 8) == 0 ? textIndent0 : null), null);
    }

    public ParagraphStyle(TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0, PlatformParagraphStyle platformParagraphStyle0, LineHeightStyle lineHeightStyle0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v1 & 1) == 0 ? textAlign0 : null), ((v1 & 2) == 0 ? textDirection0 : null), ((v1 & 4) == 0 ? v : 0x7FC00000L), ((v1 & 8) == 0 ? textIndent0 : null), ((v1 & 16) == 0 ? platformParagraphStyle0 : null), ((v1 & 0x20) == 0 ? lineHeightStyle0 : null), null);
    }

    public ParagraphStyle(TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0, PlatformParagraphStyle platformParagraphStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v1 & 1) == 0 ? textAlign0 : null), ((v1 & 2) == 0 ? textDirection0 : null), ((v1 & 4) == 0 ? v : 0x7FC00000L), ((v1 & 8) == 0 ? textIndent0 : null), ((v1 & 16) == 0 ? platformParagraphStyle0 : null), ((v1 & 0x20) == 0 ? lineHeightStyle0 : null), ((v1 & 0x40) == 0 ? lineBreak0 : null), ((v1 & 0x80) == 0 ? hyphens0 : null), null);
    }

    public ParagraphStyle(TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0, PlatformParagraphStyle platformParagraphStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, TextMotion textMotion0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v1 & 1) == 0 ? textAlign0 : null), ((v1 & 2) == 0 ? textDirection0 : null), ((v1 & 4) == 0 ? v : 0x7FC00000L), ((v1 & 8) == 0 ? textIndent0 : null), ((v1 & 16) == 0 ? platformParagraphStyle0 : null), ((v1 & 0x20) == 0 ? lineHeightStyle0 : null), ((v1 & 0x40) == 0 ? lineBreak0 : null), ((v1 & 0x80) == 0 ? hyphens0 : null), ((v1 & 0x100) == 0 ? textMotion0 : null), null);
    }

    // 去混淆评级： 低(40)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public ParagraphStyle(TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0, PlatformParagraphStyle platformParagraphStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, TextMotion textMotion0, DefaultConstructorMarker defaultConstructorMarker0) {
        this((textAlign0 == null ? 0x80000000 : textAlign0.unbox-impl()), (textDirection0 == null ? 0x80000000 : textDirection0.unbox-impl()), v, textIndent0, platformParagraphStyle0, lineHeightStyle0, (lineBreak0 == null ? 0 : lineBreak0.unbox-impl()), (hyphens0 == null ? 0x80000000 : hyphens0.unbox-impl()), textMotion0, null);
    }

    // 去混淆评级： 低(40)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineBreak, Hyphens, TextMotion are deprecated. Please use the new stable constructors.")
    public ParagraphStyle(TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0, PlatformParagraphStyle platformParagraphStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, DefaultConstructorMarker defaultConstructorMarker0) {
        this((textAlign0 == null ? 0x80000000 : textAlign0.unbox-impl()), (textDirection0 == null ? 0x80000000 : textDirection0.unbox-impl()), v, textIndent0, platformParagraphStyle0, lineHeightStyle0, (lineBreak0 == null ? 0 : lineBreak0.unbox-impl()), (hyphens0 == null ? 0x80000000 : hyphens0.unbox-impl()), null, null);
    }

    // 去混淆评级： 低(40)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructors.")
    public ParagraphStyle(TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0, PlatformParagraphStyle platformParagraphStyle0, LineHeightStyle lineHeightStyle0, DefaultConstructorMarker defaultConstructorMarker0) {
        this((textAlign0 == null ? 0x80000000 : textAlign0.unbox-impl()), (textDirection0 == null ? 0x80000000 : textDirection0.unbox-impl()), v, textIndent0, platformParagraphStyle0, lineHeightStyle0, 0, 0x80000000, null, null);
    }

    // 去混淆评级： 低(40)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public ParagraphStyle(TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0, DefaultConstructorMarker defaultConstructorMarker0) {
        this((textAlign0 == null ? 0x80000000 : textAlign0.unbox-impl()), (textDirection0 == null ? 0x80000000 : textDirection0.unbox-impl()), v, textIndent0, null, null, 0, 0x80000000, null, null);
    }

    // 去混淆评级： 低(20)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    public final ParagraphStyle copy-Elsmlbk(TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0) {
        int v1 = textAlign0 == null ? 0x80000000 : textAlign0.unbox-impl();
        return textDirection0 == null ? new ParagraphStyle(v1, 0x80000000, v, textIndent0, this.e, this.f, this.g, this.h, this.i, null) : new ParagraphStyle(v1, textDirection0.unbox-impl(), v, textIndent0, this.e, this.f, this.g, this.h, this.i, null);
    }

    public static ParagraphStyle copy-Elsmlbk$default(ParagraphStyle paragraphStyle0, TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            textAlign0 = TextAlign.box-impl(paragraphStyle0.a);
        }
        if((v1 & 2) != 0) {
            textDirection0 = TextDirection.box-impl(paragraphStyle0.b);
        }
        if((v1 & 4) != 0) {
            v = paragraphStyle0.c;
        }
        if((v1 & 8) != 0) {
            textIndent0 = paragraphStyle0.d;
        }
        return paragraphStyle0.copy-Elsmlbk(textAlign0, textDirection0, v, textIndent0);
    }

    // 去混淆评级： 低(20)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public final ParagraphStyle copy-NH1kkwU(TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0, PlatformParagraphStyle platformParagraphStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, TextMotion textMotion0) {
        int v1 = textAlign0 == null ? 0x80000000 : textAlign0.unbox-impl();
        int v2 = textDirection0 == null ? 0x80000000 : textDirection0.unbox-impl();
        int v3 = lineBreak0 == null ? 0 : lineBreak0.unbox-impl();
        return hyphens0 == null ? new ParagraphStyle(v1, v2, v, textIndent0, platformParagraphStyle0, lineHeightStyle0, v3, 0x80000000, textMotion0, null) : new ParagraphStyle(v1, v2, v, textIndent0, platformParagraphStyle0, lineHeightStyle0, v3, hyphens0.unbox-impl(), textMotion0, null);
    }

    public static ParagraphStyle copy-NH1kkwU$default(ParagraphStyle paragraphStyle0, TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0, PlatformParagraphStyle platformParagraphStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, TextMotion textMotion0, int v1, Object object0) {
        TextAlign textAlign1 = (v1 & 1) == 0 ? textAlign0 : TextAlign.box-impl(paragraphStyle0.a);
        TextDirection textDirection1 = (v1 & 2) == 0 ? textDirection0 : TextDirection.box-impl(paragraphStyle0.b);
        long v2 = (v1 & 4) == 0 ? v : paragraphStyle0.c;
        TextIndent textIndent1 = (v1 & 8) == 0 ? textIndent0 : paragraphStyle0.d;
        PlatformParagraphStyle platformParagraphStyle1 = (v1 & 16) == 0 ? platformParagraphStyle0 : paragraphStyle0.e;
        LineHeightStyle lineHeightStyle1 = (v1 & 0x20) == 0 ? lineHeightStyle0 : paragraphStyle0.f;
        LineBreak lineBreak1 = (v1 & 0x40) == 0 ? lineBreak0 : LineBreak.box-impl(paragraphStyle0.g);
        Hyphens hyphens1 = (v1 & 0x80) == 0 ? hyphens0 : Hyphens.box-impl(paragraphStyle0.h);
        return (v1 & 0x100) == 0 ? paragraphStyle0.copy-NH1kkwU(textAlign1, textDirection1, v2, textIndent1, platformParagraphStyle1, lineHeightStyle1, lineBreak1, hyphens1, textMotion0) : paragraphStyle0.copy-NH1kkwU(textAlign1, textDirection1, v2, textIndent1, platformParagraphStyle1, lineHeightStyle1, lineBreak1, hyphens1, paragraphStyle0.i);
    }

    // 去混淆评级： 低(20)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineBreak, Hyphens, TextMotion are deprecated. Please use the new stable copy constructor.")
    public final ParagraphStyle copy-ciSxzs0(TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0, PlatformParagraphStyle platformParagraphStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0) {
        int v1 = textAlign0 == null ? 0x80000000 : textAlign0.unbox-impl();
        int v2 = textDirection0 == null ? 0x80000000 : textDirection0.unbox-impl();
        int v3 = lineBreak0 == null ? 0 : lineBreak0.unbox-impl();
        return hyphens0 == null ? new ParagraphStyle(v1, v2, v, textIndent0, platformParagraphStyle0, lineHeightStyle0, v3, 0x80000000, this.i, null) : new ParagraphStyle(v1, v2, v, textIndent0, platformParagraphStyle0, lineHeightStyle0, v3, hyphens0.unbox-impl(), this.i, null);
    }

    public static ParagraphStyle copy-ciSxzs0$default(ParagraphStyle paragraphStyle0, TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0, PlatformParagraphStyle platformParagraphStyle0, LineHeightStyle lineHeightStyle0, LineBreak lineBreak0, Hyphens hyphens0, int v1, Object object0) {
        TextAlign textAlign1 = (v1 & 1) == 0 ? textAlign0 : TextAlign.box-impl(paragraphStyle0.a);
        TextDirection textDirection1 = (v1 & 2) == 0 ? textDirection0 : TextDirection.box-impl(paragraphStyle0.b);
        long v2 = (v1 & 4) == 0 ? v : paragraphStyle0.c;
        TextIndent textIndent1 = (v1 & 8) == 0 ? textIndent0 : paragraphStyle0.d;
        PlatformParagraphStyle platformParagraphStyle1 = (v1 & 16) == 0 ? platformParagraphStyle0 : paragraphStyle0.e;
        LineHeightStyle lineHeightStyle1 = (v1 & 0x20) == 0 ? lineHeightStyle0 : paragraphStyle0.f;
        LineBreak lineBreak1 = (v1 & 0x40) == 0 ? lineBreak0 : LineBreak.box-impl(paragraphStyle0.g);
        return (v1 & 0x80) == 0 ? paragraphStyle0.copy-ciSxzs0(textAlign1, textDirection1, v2, textIndent1, platformParagraphStyle1, lineHeightStyle1, lineBreak1, hyphens0) : paragraphStyle0.copy-ciSxzs0(textAlign1, textDirection1, v2, textIndent1, platformParagraphStyle1, lineHeightStyle1, lineBreak1, Hyphens.box-impl(paragraphStyle0.h));
    }

    // 去混淆评级： 低(20)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    public final ParagraphStyle copy-xPh5V4g(TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0, PlatformParagraphStyle platformParagraphStyle0, LineHeightStyle lineHeightStyle0) {
        int v1 = textAlign0 == null ? 0x80000000 : textAlign0.unbox-impl();
        return textDirection0 == null ? new ParagraphStyle(v1, 0x80000000, v, textIndent0, platformParagraphStyle0, lineHeightStyle0, this.g, this.h, this.i, null) : new ParagraphStyle(v1, textDirection0.unbox-impl(), v, textIndent0, platformParagraphStyle0, lineHeightStyle0, this.g, this.h, this.i, null);
    }

    public static ParagraphStyle copy-xPh5V4g$default(ParagraphStyle paragraphStyle0, TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0, PlatformParagraphStyle platformParagraphStyle0, LineHeightStyle lineHeightStyle0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            textAlign0 = TextAlign.box-impl(paragraphStyle0.a);
        }
        if((v1 & 2) != 0) {
            textDirection0 = TextDirection.box-impl(paragraphStyle0.b);
        }
        if((v1 & 4) != 0) {
            v = paragraphStyle0.c;
        }
        if((v1 & 8) != 0) {
            textIndent0 = paragraphStyle0.d;
        }
        if((v1 & 16) != 0) {
            platformParagraphStyle0 = paragraphStyle0.e;
        }
        if((v1 & 0x20) != 0) {
            lineHeightStyle0 = paragraphStyle0.f;
        }
        return paragraphStyle0.copy-xPh5V4g(textAlign0, textDirection0, v, textIndent0, platformParagraphStyle0, lineHeightStyle0);
    }

    @NotNull
    public final ParagraphStyle copy-ykzQM6k(int v, int v1, long v2, @Nullable TextIndent textIndent0, @Nullable PlatformParagraphStyle platformParagraphStyle0, @Nullable LineHeightStyle lineHeightStyle0, int v3, int v4, @Nullable TextMotion textMotion0) {
        return new ParagraphStyle(v, v1, v2, textIndent0, platformParagraphStyle0, lineHeightStyle0, v3, v4, textMotion0, null);
    }

    public static ParagraphStyle copy-ykzQM6k$default(ParagraphStyle paragraphStyle0, int v, int v1, long v2, TextIndent textIndent0, PlatformParagraphStyle platformParagraphStyle0, LineHeightStyle lineHeightStyle0, int v3, int v4, TextMotion textMotion0, int v5, Object object0) {
        int v6 = (v5 & 1) == 0 ? v : paragraphStyle0.a;
        int v7 = (v5 & 2) == 0 ? v1 : paragraphStyle0.b;
        long v8 = (v5 & 4) == 0 ? v2 : paragraphStyle0.c;
        TextIndent textIndent1 = (v5 & 8) == 0 ? textIndent0 : paragraphStyle0.d;
        PlatformParagraphStyle platformParagraphStyle1 = (v5 & 16) == 0 ? platformParagraphStyle0 : paragraphStyle0.e;
        LineHeightStyle lineHeightStyle1 = (v5 & 0x20) == 0 ? lineHeightStyle0 : paragraphStyle0.f;
        int v9 = (v5 & 0x40) == 0 ? v3 : paragraphStyle0.g;
        int v10 = (v5 & 0x80) == 0 ? v4 : paragraphStyle0.h;
        return (v5 & 0x100) == 0 ? paragraphStyle0.copy-ykzQM6k(v6, v7, v8, textIndent1, platformParagraphStyle1, lineHeightStyle1, v9, v10, textMotion0) : paragraphStyle0.copy-ykzQM6k(v6, v7, v8, textIndent1, platformParagraphStyle1, lineHeightStyle1, v9, v10, paragraphStyle0.i);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ParagraphStyle)) {
            return false;
        }
        if(!TextAlign.equals-impl0(this.a, ((ParagraphStyle)object0).a)) {
            return false;
        }
        if(!TextDirection.equals-impl0(this.b, ((ParagraphStyle)object0).b)) {
            return false;
        }
        if(!TextUnit.equals-impl0(this.c, ((ParagraphStyle)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((ParagraphStyle)object0).d)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, ((ParagraphStyle)object0).e)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.f, ((ParagraphStyle)object0).f)) {
            return false;
        }
        if(!LineBreak.equals-impl0(this.g, ((ParagraphStyle)object0).g)) {
            return false;
        }
        return Hyphens.equals-impl0(this.h, ((ParagraphStyle)object0).h) ? Intrinsics.areEqual(this.i, ((ParagraphStyle)object0).i) : false;
    }

    @JvmName(name = "getHyphens-EaSxIns")
    @Nullable
    public final Hyphens getHyphens-EaSxIns() {
        return Hyphens.box-impl(this.h);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    public static void getHyphens-EaSxIns$annotations() {
    }

    public final int getHyphens-vmbZdU8() {
        return this.h;
    }

    @JvmName(name = "getLineBreak-LgCVezo")
    @Nullable
    public final LineBreak getLineBreak-LgCVezo() {
        return LineBreak.box-impl(this.g);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    public static void getLineBreak-LgCVezo$annotations() {
    }

    public final int getLineBreak-rAG3T2k() {
        return this.g;
    }

    public final long getLineHeight-XSAIIZE() {
        return this.c;
    }

    @Nullable
    public final LineHeightStyle getLineHeightStyle() {
        return this.f;
    }

    @Nullable
    public final PlatformParagraphStyle getPlatformStyle() {
        return this.e;
    }

    @JvmName(name = "getTextAlign-buA522U")
    @Nullable
    public final TextAlign getTextAlign-buA522U() {
        return TextAlign.box-impl(this.a);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    public static void getTextAlign-buA522U$annotations() {
    }

    public final int getTextAlign-e0LSkKk() {
        return this.a;
    }

    @JvmName(name = "getTextDirection-mmuk1to")
    @Nullable
    public final TextDirection getTextDirection-mmuk1to() {
        return TextDirection.box-impl(this.b);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    public static void getTextDirection-mmuk1to$annotations() {
    }

    public final int getTextDirection-s_7X-co() {
        return this.b;
    }

    @Nullable
    public final TextIndent getTextIndent() {
        return this.d;
    }

    @Nullable
    public final TextMotion getTextMotion() {
        return this.i;
    }

    @Override
    public int hashCode() {
        int v = TextAlign.hashCode-impl(this.a);
        int v1 = TextDirection.hashCode-impl(this.b);
        int v2 = TextUnit.hashCode-impl(this.c);
        int v3 = 0;
        int v4 = this.d == null ? 0 : this.d.hashCode();
        int v5 = this.e == null ? 0 : this.e.hashCode();
        int v6 = this.f == null ? 0 : this.f.hashCode();
        int v7 = LineBreak.hashCode-impl(this.g);
        int v8 = Hyphens.hashCode-impl(this.h);
        TextMotion textMotion0 = this.i;
        if(textMotion0 != null) {
            v3 = textMotion0.hashCode();
        }
        return (v8 + (v7 + ((((v2 + (v1 + v * 0x1F) * 0x1F) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F) * 0x1F) * 0x1F + v3;
    }

    @Stable
    @NotNull
    public final ParagraphStyle merge(@Nullable ParagraphStyle paragraphStyle0) {
        return paragraphStyle0 == null ? this : ParagraphStyleKt.fastMerge-j5T8yCg(this, paragraphStyle0.a, paragraphStyle0.b, paragraphStyle0.c, paragraphStyle0.d, paragraphStyle0.e, paragraphStyle0.f, paragraphStyle0.g, paragraphStyle0.h, paragraphStyle0.i);
    }

    public static ParagraphStyle merge$default(ParagraphStyle paragraphStyle0, ParagraphStyle paragraphStyle1, int v, Object object0) {
        if((v & 1) != 0) {
            paragraphStyle1 = null;
        }
        return paragraphStyle0.merge(paragraphStyle1);
    }

    @Stable
    @NotNull
    public final ParagraphStyle plus(@NotNull ParagraphStyle paragraphStyle0) {
        return this.merge(paragraphStyle0);
    }

    @Override
    @NotNull
    public String toString() {
        return "ParagraphStyle(textAlign=" + TextAlign.toString-impl(this.a) + ", textDirection=" + TextDirection.toString-impl(this.b) + ", lineHeight=" + TextUnit.toString-impl(this.c) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + LineBreak.toString-impl(this.g) + ", hyphens=" + Hyphens.toString-impl(this.h) + ", textMotion=" + this.i + ')';
    }
}

