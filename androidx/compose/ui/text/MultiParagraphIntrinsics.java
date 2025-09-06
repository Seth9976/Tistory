package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.SourceDebugExtension;
import md.c;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0012\u0010\t\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\r\u001A\u00020\f¢\u0006\u0004\b\u000E\u0010\u000FB=\b\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0012\u0010\t\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\u0011\u001A\u00020\u0010¢\u0006\u0004\b\u000E\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R#\u0010\t\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001AR\u001B\u0010 \u001A\u00020\u001B8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001FR\u001B\u0010#\u001A\u00020\u001B8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001D\u001A\u0004\b\"\u0010\u001FR \u0010\'\u001A\b\u0012\u0004\u0012\u00020$0\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010\u0018\u001A\u0004\b&\u0010\u001AR\u0014\u0010+\u001A\u00020(8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b)\u0010*¨\u0006,"}, d2 = {"Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "Landroidx/compose/ui/text/TextStyle;", "style", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "resourceLoader", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/Font$ResourceLoader;)V", "a", "Landroidx/compose/ui/text/AnnotatedString;", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "b", "Ljava/util/List;", "getPlaceholders", "()Ljava/util/List;", "", "c", "Lkotlin/Lazy;", "getMinIntrinsicWidth", "()F", "minIntrinsicWidth", "d", "getMaxIntrinsicWidth", "maxIntrinsicWidth", "Landroidx/compose/ui/text/ParagraphIntrinsicInfo;", "e", "getInfoList$ui_text_release", "infoList", "", "getHasStaleResolvedFonts", "()Z", "hasStaleResolvedFonts", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMultiParagraphIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,154:1\n915#2:155\n916#2,5:164\n151#3,3:156\n33#3,4:159\n154#3:163\n155#3:169\n38#3:170\n156#3:171\n101#3,2:172\n33#3,6:174\n103#3:180\n*S KotlinDebug\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics\n*L\n96#1:155\n96#1:164,5\n96#1:156,3\n96#1:159,4\n96#1:163\n96#1:169\n96#1:170\n96#1:171\n121#1:172,2\n121#1:174,6\n121#1:180\n*E\n"})
public final class MultiParagraphIntrinsics implements ParagraphIntrinsics {
    public static final int $stable = 8;
    public final AnnotatedString a;
    public final List b;
    public final Lazy c;
    public final Lazy d;
    public final ArrayList e;

    @Deprecated(message = "Font.ResourceLoader is deprecated, call with fontFamilyResolver", replaceWith = @ReplaceWith(expression = "MultiParagraphIntrinsics(annotatedString, style, placeholders, density, fontFamilyResolver)", imports = {}))
    public MultiParagraphIntrinsics(@NotNull AnnotatedString annotatedString0, @NotNull TextStyle textStyle0, @NotNull List list0, @NotNull Density density0, @NotNull ResourceLoader font$ResourceLoader0) {
        this(annotatedString0, textStyle0, list0, density0, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(font$ResourceLoader0));
    }

    public MultiParagraphIntrinsics(@NotNull AnnotatedString annotatedString0, @NotNull TextStyle textStyle0, @NotNull List list0, @NotNull Density density0, @NotNull Resolver fontFamily$Resolver0) {
        this.a = annotatedString0;
        this.b = list0;
        k k0 = new k(this);
        this.c = c.lazy(LazyThreadSafetyMode.NONE, k0);
        j j0 = new j(this);
        this.d = c.lazy(LazyThreadSafetyMode.NONE, j0);
        ParagraphStyle paragraphStyle0 = textStyle0.toParagraphStyle();
        List list1 = AnnotatedStringKt.normalizedParagraphStyles(annotatedString0, paragraphStyle0);
        ArrayList arrayList0 = new ArrayList(list1.size());
        int v = list1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Range annotatedString$Range0 = (Range)list1.get(v1);
            AnnotatedString annotatedString1 = AnnotatedStringKt.access$substringWithoutParagraphStyles(annotatedString0, annotatedString$Range0.getStart(), annotatedString$Range0.getEnd());
            arrayList0.add(new ParagraphIntrinsicInfo(ParagraphIntrinsicsKt.ParagraphIntrinsics(annotatedString1.getText(), textStyle0.merge(MultiParagraphIntrinsics.access$resolveTextDirection(this, ((ParagraphStyle)annotatedString$Range0.getItem()), paragraphStyle0)), annotatedString1.getSpanStyles(), MultiParagraphIntrinsicsKt.access$getLocalPlaceholders(this.getPlaceholders(), annotatedString$Range0.getStart(), annotatedString$Range0.getEnd()), density0, fontFamily$Resolver0), annotatedString$Range0.getStart(), annotatedString$Range0.getEnd()));
        }
        this.e = arrayList0;
    }

    // 去混淆评级： 低(20)
    public static final ParagraphStyle access$resolveTextDirection(MultiParagraphIntrinsics multiParagraphIntrinsics0, ParagraphStyle paragraphStyle0, ParagraphStyle paragraphStyle1) {
        multiParagraphIntrinsics0.getClass();
        return TextDirection.equals-impl0(paragraphStyle0.getTextDirection-s_7X-co(), 0x80000000) ? ParagraphStyle.copy-ykzQM6k$default(paragraphStyle0, 0, paragraphStyle1.getTextDirection-s_7X-co(), 0L, null, null, null, 0, 0, null, 509, null) : paragraphStyle0;
    }

    @NotNull
    public final AnnotatedString getAnnotatedString() {
        return this.a;
    }

    @Override  // androidx.compose.ui.text.ParagraphIntrinsics
    public boolean getHasStaleResolvedFonts() {
        ArrayList arrayList0 = this.e;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(((ParagraphIntrinsicInfo)arrayList0.get(v1)).getIntrinsics().getHasStaleResolvedFonts()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final List getInfoList$ui_text_release() {
        return this.e;
    }

    @Override  // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMaxIntrinsicWidth() {
        return ((Number)this.d.getValue()).floatValue();
    }

    @Override  // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMinIntrinsicWidth() {
        return ((Number)this.c.getValue()).floatValue();
    }

    @NotNull
    public final List getPlaceholders() {
        return this.b;
    }
}

