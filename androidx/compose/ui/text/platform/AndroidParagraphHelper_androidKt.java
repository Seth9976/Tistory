package androidx.compose.ui.text.platform;

import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.platform.extensions.PlaceholderExtensions_androidKt;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000T\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\u001A\u0087\u0001\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0012\u0010\t\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0012\u0010\u000B\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00062\u0006\u0010\r\u001A\u00020\f2&\u0010\u0014\u001A\"\u0012\u0006\u0012\u0004\u0018\u00010\u000F\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u000E2\u0006\u0010\u0016\u001A\u00020\u0015H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001A\u0013\u0010\u001A\u001A\u00020\u0015*\u00020\u0004H\u0000¢\u0006\u0004\b\u001A\u0010\u001B¨\u0006\u001C"}, d2 = {"", "text", "", "contextFontSize", "Landroidx/compose/ui/text/TextStyle;", "contextTextStyle", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/unit/Density;", "density", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "resolveTypeface", "", "useEmojiCompat", "", "createCharSequence", "(Ljava/lang/String;FLandroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function4;Z)Ljava/lang/CharSequence;", "isIncludeFontPaddingEnabled", "(Landroidx/compose/ui/text/TextStyle;)Z", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidParagraphHelper_androidKt {
    public static final AndroidParagraphHelper_androidKt.NoopSpan.1 a;

    static {
        AndroidParagraphHelper_androidKt.a = new AndroidParagraphHelper_androidKt.NoopSpan.1();  // 初始化器: Landroid/text/style/CharacterStyle;-><init>()V
    }

    @NotNull
    public static final CharSequence createCharSequence(@NotNull String s, float f, @NotNull TextStyle textStyle0, @NotNull List list0, @NotNull List list1, @NotNull Density density0, @NotNull Function4 function40, boolean z) {
        if(list0.isEmpty() && list1.isEmpty() && Intrinsics.areEqual(textStyle0.getTextIndent(), TextIndent.Companion.getNone()) && TextUnitKt.isUnspecified--R2X_6o(textStyle0.getLineHeight-XSAIIZE())) {
            return s;
        }
        CharSequence charSequence0 = s instanceof Spannable ? ((Spannable)s) : new SpannableString(s);
        if(Intrinsics.areEqual(textStyle0.getTextDecoration(), TextDecoration.Companion.getUnderline())) {
            SpannableExtensions_androidKt.setSpan(((Spannable)charSequence0), AndroidParagraphHelper_androidKt.a, 0, s.length());
        }
        if(!AndroidParagraphHelper_androidKt.isIncludeFontPaddingEnabled(textStyle0) || textStyle0.getLineHeightStyle() != null) {
            LineHeightStyle lineHeightStyle0 = textStyle0.getLineHeightStyle();
            if(lineHeightStyle0 == null) {
                lineHeightStyle0 = LineHeightStyle.Companion.getDefault();
            }
            SpannableExtensions_androidKt.setLineHeight-KmRG4DE(((Spannable)charSequence0), textStyle0.getLineHeight-XSAIIZE(), f, density0, lineHeightStyle0);
        }
        else {
            SpannableExtensions_androidKt.setLineHeight-r9BaKPg(((Spannable)charSequence0), textStyle0.getLineHeight-XSAIIZE(), f, density0);
        }
        SpannableExtensions_androidKt.setTextIndent(((Spannable)charSequence0), textStyle0.getTextIndent(), f, density0);
        SpannableExtensions_androidKt.setSpanStyles(((Spannable)charSequence0), textStyle0, list0, density0, function40);
        PlaceholderExtensions_androidKt.setPlaceholders(((Spannable)charSequence0), list1, density0);
        return charSequence0;
    }

    public static final boolean isIncludeFontPaddingEnabled(@NotNull TextStyle textStyle0) {
        PlatformTextStyle platformTextStyle0 = textStyle0.getPlatformStyle();
        if(platformTextStyle0 != null) {
            PlatformParagraphStyle platformParagraphStyle0 = platformTextStyle0.getParagraphStyle();
            return platformParagraphStyle0 == null ? false : platformParagraphStyle0.getIncludeFontPadding();
        }
        return false;
    }
}

