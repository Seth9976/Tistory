package com.kakao.tistory.presentation.common.utils;

import android.icu.text.CompactDecimalFormat.CompactStyle;
import android.icu.text.CompactDecimalFormat;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.MetricAffectingSpan;
import android.view.View;
import androidx.annotation.FontRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.AnnotatedString.Builder;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.core.text.HtmlCompat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000B\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u00C7\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0007\u0010\u0006J\u001F\u0010\r\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0015\u0010\u000F\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u001D\u0010\u0012\u001A\u00020\f2\u0006\u0010\u0003\u001A\u00020\f2\u0006\u0010\u0011\u001A\u00020\n\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\u0014\u0010\u0010J\u0017\u0010\u0016\u001A\u00020\u00042\b\u0010\u0015\u001A\u0004\u0018\u00010\f\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001A\u001A\u00020\u00182\u0006\u0010\u0019\u001A\u00020\u0018\u00A2\u0006\u0004\b\u001A\u0010\u001BJ1\u0010 \u001A\u00020\u00022\u0006\u0010\u001C\u001A\u00020\f2\u0006\u0010\u001D\u001A\u00020\n2\b\b\u0002\u0010\u001E\u001A\u00020\n2\b\b\u0002\u0010\u001F\u001A\u00020\n\u00A2\u0006\u0004\b \u0010!J3\u0010#\u001A\u00020\u00022\u0006\u0010\u001C\u001A\u00020\u00022\b\b\u0001\u0010\"\u001A\u00020\n2\b\b\u0002\u0010\u001E\u001A\u00020\n2\b\b\u0002\u0010\u001F\u001A\u00020\n\u00A2\u0006\u0004\b#\u0010$JI\u0010-\u001A\u00020,2\u0006\u0010\u001C\u001A\u00020\u00022\u0006\u0010%\u001A\u00020\f2\u0006\u0010&\u001A\u00020\n2\b\b\u0002\u0010\'\u001A\u00020\u00042\b\b\u0002\u0010(\u001A\u00020\u00042\u000E\b\u0002\u0010+\u001A\b\u0012\u0004\u0012\u00020*0)\u00A2\u0006\u0004\b-\u0010.J\u0015\u00100\u001A\u00020/2\u0006\u0010\u0003\u001A\u00020\f\u00A2\u0006\u0004\b0\u00101J\u0015\u00104\u001A\u00020\f2\u0006\u00103\u001A\u000202\u00A2\u0006\u0004\b4\u00105J\u0011\u00107\u001A\u000206*\u00020\f\u00A2\u0006\u0004\b7\u00108J\u0013\u00109\u001A\u000206*\u00020\fH\u0007\u00A2\u0006\u0004\b9\u0010:J\u0011\u0010;\u001A\u00020\f*\u00020\f\u00A2\u0006\u0004\b;\u0010<J\u001B\u0010>\u001A\u000206*\u00020\f2\u0006\u0010=\u001A\u00020\fH\u0007\u00A2\u0006\u0004\b>\u0010?J\u001B\u0010C\u001A\u0004\u0018\u00010@*\u0004\u0018\u00010\f\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bA\u0010BJ \u0010G\u001A\u00020@*\u0004\u0018\u00010\f2\b\b\u0002\u0010D\u001A\u00020@\u00F8\u0001\u0001\u00A2\u0006\u0004\bE\u0010FR\u0017\u0010M\u001A\u00020H8\u0006\u00A2\u0006\f\n\u0004\bI\u0010J\u001A\u0004\bK\u0010LR\u0017\u0010P\u001A\u00020H8\u0006\u00A2\u0006\f\n\u0004\bN\u0010J\u001A\u0004\bO\u0010LR\u0017\u0010S\u001A\u00020H8\u0006\u00A2\u0006\f\n\u0004\bQ\u0010J\u001A\u0004\bR\u0010L\u0082\u0002\u000B\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006T"}, d2 = {"Lcom/kakao/tistory/presentation/common/utils/StringUtils;", "", "", "text", "", "hasNewLine", "(Ljava/lang/CharSequence;)Z", "isNewLine", "", "number", "", "maxNumber", "", "getEllipsisNumber", "(Ljava/lang/Number;I)Ljava/lang/String;", "getAbbreviatedNumber", "(Ljava/lang/Number;)Ljava/lang/String;", "maxLength", "getEllipsisText", "(Ljava/lang/String;I)Ljava/lang/String;", "getNumberFormat", "password", "checkPasswordValidation", "(Ljava/lang/String;)Z", "", "byte", "convertToMB", "(J)J", "string", "color", "startIndex", "endIndex", "getForegroundSpanString", "(Ljava/lang/String;III)Ljava/lang/CharSequence;", "fontFamilyString", "getTypefaceSpanString", "(Ljava/lang/CharSequence;III)Ljava/lang/CharSequence;", "linkText", "linkColor", "needUnderLine", "fakeBold", "Lkotlin/Function0;", "", "callback", "Landroid/text/SpannableString;", "getStringWithClickableSpan", "(Ljava/lang/CharSequence;Ljava/lang/String;IZZLkotlin/jvm/functions/Function0;)Landroid/text/SpannableString;", "Landroid/text/Spanned;", "getHtmlText", "(Ljava/lang/String;)Landroid/text/Spanned;", "", "block", "toHexString", "([B)Ljava/lang/String;", "Landroidx/compose/ui/text/AnnotatedString;", "asAnnotationString", "(Ljava/lang/String;)Landroidx/compose/ui/text/AnnotatedString;", "toAnnotatedStringFromHtmlText", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/AnnotatedString;", "removeHtmlTag", "(Ljava/lang/String;)Ljava/lang/String;", "underlinedText", "toAnnotatedStringWithUnderline", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/graphics/Color;", "toColorOrNull-ijrfgN4", "(Ljava/lang/String;)Landroidx/compose/ui/graphics/Color;", "toColorOrNull", "defaultColor", "toColor-wrIjXm8", "(Ljava/lang/String;J)J", "toColor", "Lkotlin/text/Regex;", "a", "Lkotlin/text/Regex;", "getREGEX_URL", "()Lkotlin/text/Regex;", "REGEX_URL", "b", "getREGEX_NEW_LINE", "REGEX_NEW_LINE", "c", "getREGEX_NEW_LINES", "REGEX_NEW_LINES", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStringUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringUtils.kt\ncom/kakao/tistory/presentation/common/utils/StringUtils\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,206:1\n1240#2:207\n1039#2,6:210\n1240#2:217\n1864#3,2:208\n1866#3:216\n*S KotlinDebug\n*F\n+ 1 StringUtils.kt\ncom/kakao/tistory/presentation/common/utils/StringUtils\n*L\n158#1:207\n166#1:210,6\n176#1:217\n162#1:208,2\n162#1:216\n*E\n"})
public final class StringUtils {
    public static final int $stable;
    @NotNull
    public static final StringUtils INSTANCE;
    public static final Regex a;
    public static final Regex b;
    public static final Regex c;

    static {
        StringUtils.INSTANCE = new StringUtils();
        StringUtils.a = new Regex("[(http(s)?)://(www.)?a-zA-Z0-9@:%._+~#=-]{2,256}\\.[a-z]{2,6}\\b([-a-zA-Z0-9가-힣@:%_+.~#?&//=;]*)");
        StringUtils.b = new Regex("[\r|\n]");
        StringUtils.c = new Regex("[\r|\n]+");
        StringUtils.$stable = 8;
    }

    @NotNull
    public final AnnotatedString asAnnotationString(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        return new AnnotatedString(s, null, null, 6, null);
    }

    public final boolean checkPasswordValidation(@Nullable String s) {
        return s == null || s.length() == 0 ? false : new Regex("^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[ -/]|[:-@]|[\\[-`]|[{-~])(?=\\S+$).{10,}$").matches(s);
    }

    public final long convertToMB(long v) [...] // Inlined contents

    @NotNull
    public final String getAbbreviatedNumber(@NotNull Number number0) {
        Intrinsics.checkNotNullParameter(number0, "number");
        CompactDecimalFormat compactDecimalFormat0 = CompactDecimalFormat.getInstance(Locale.ENGLISH, CompactDecimalFormat.CompactStyle.SHORT);
        compactDecimalFormat0.setMaximumFractionDigits(1);
        String s = compactDecimalFormat0.format(number0);
        Intrinsics.checkNotNullExpressionValue(s, "format(...)");
        return s;
    }

    @NotNull
    public final String getEllipsisNumber(@NotNull Number number0, int v) {
        Intrinsics.checkNotNullParameter(number0, "number");
        return number0.longValue() <= ((long)v) ? number0.toString() : v + "+";
    }

    public static String getEllipsisNumber$default(StringUtils stringUtils0, Number number0, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 999;
        }
        return stringUtils0.getEllipsisNumber(number0, v);
    }

    @NotNull
    public final String getEllipsisText(@NotNull String s, int v) {
        Intrinsics.checkNotNullParameter(s, "text");
        if(s.length() > v) {
            String s1 = s.substring(0, v);
            Intrinsics.checkNotNullExpressionValue(s1, "substring(...)");
            return s1 + "…";
        }
        return s;
    }

    @NotNull
    public final CharSequence getForegroundSpanString(@NotNull String s, int v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(s, "string");
        if(v2 >= v1 && v1 <= s.length() && v2 <= s.length() && v1 >= 0 && v2 >= 0) {
            SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder(s);
            spannableStringBuilder0.setSpan(new ForegroundColorSpan(v), v1, v2, 33);
            return spannableStringBuilder0;
        }
        return s;
    }

    public static CharSequence getForegroundSpanString$default(StringUtils stringUtils0, String s, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 4) != 0) {
            v1 = 0;
        }
        if((v3 & 8) != 0) {
            v2 = s.length();
        }
        return stringUtils0.getForegroundSpanString(s, v, v1, v2);
    }

    @NotNull
    public final Spanned getHtmlText(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "text");
        Spanned spanned0 = HtmlCompat.fromHtml(s, 0);
        Intrinsics.checkNotNullExpressionValue(spanned0, "fromHtml(...)");
        return spanned0;
    }

    @NotNull
    public final String getNumberFormat(@NotNull Number number0) {
        Intrinsics.checkNotNullParameter(number0, "number");
        String s = NumberFormat.getInstance().format(number0);
        Intrinsics.checkNotNullExpressionValue(s, "format(...)");
        return s;
    }

    @NotNull
    public final Regex getREGEX_NEW_LINE() {
        return StringUtils.b;
    }

    @NotNull
    public final Regex getREGEX_NEW_LINES() {
        return StringUtils.c;
    }

    @NotNull
    public final Regex getREGEX_URL() {
        return StringUtils.a;
    }

    @NotNull
    public final SpannableString getStringWithClickableSpan(@NotNull CharSequence charSequence0, @NotNull String s, int v, boolean z, boolean z1, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(charSequence0, "string");
        Intrinsics.checkNotNullParameter(s, "linkText");
        Intrinsics.checkNotNullParameter(function00, "callback");
        SpannableString spannableString0 = new SpannableString(charSequence0);
        com.kakao.tistory.presentation.common.utils.StringUtils.getStringWithClickableSpan.clickSpan.1 stringUtils$getStringWithClickableSpan$clickSpan$10 = new ClickableSpan() {
            @Override  // android.text.style.ClickableSpan
            public void onClick(@NotNull View view0) {
                Intrinsics.checkNotNullParameter(view0, "widget");
                v.invoke();
            }

            @Override  // android.text.style.ClickableSpan
            public void updateDrawState(@NotNull TextPaint textPaint0) {
                Intrinsics.checkNotNullParameter(textPaint0, "ds");
                textPaint0.setColor(z);
                textPaint0.linkColor = z;
                textPaint0.setUnderlineText(z1);
                textPaint0.setFakeBoldText(this.d);
            }
        };
        int v1 = StringsKt__StringsKt.indexOf$default(spannableString0, s, 0, false, 6, null);
        spannableString0.setSpan(stringUtils$getStringWithClickableSpan$clickSpan$10, v1, s.length() + v1, 33);
        return spannableString0;
    }

    public static SpannableString getStringWithClickableSpan$default(StringUtils stringUtils0, CharSequence charSequence0, String s, int v, boolean z, boolean z1, Function0 function00, int v1, Object object0) {
        if((v1 & 8) != 0) {
            z = false;
        }
        if((v1 & 16) != 0) {
            z1 = true;
        }
        if((v1 & 0x20) != 0) {
            function00 = a.a;
        }
        return stringUtils0.getStringWithClickableSpan(charSequence0, s, v, z, z1, function00);
    }

    @NotNull
    public final CharSequence getTypefaceSpanString(@NotNull CharSequence charSequence0, @FontRes int v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(charSequence0, "string");
        if(v2 >= v1 && v1 <= charSequence0.length() && v2 <= charSequence0.length() && v1 >= 0 && v2 >= 0) {
            com.kakao.tistory.presentation.common.utils.StringUtils.getTypefaceSpanString.typeFaceSpan.1 stringUtils$getTypefaceSpanString$typeFaceSpan$10 = new MetricAffectingSpan() {
                @Override  // android.text.style.CharacterStyle
                public void updateDrawState(@NotNull TextPaint textPaint0) {
                    Intrinsics.checkNotNullParameter(textPaint0, "paint");
                    textPaint0.setTypeface(this.a);
                }

                @Override  // android.text.style.MetricAffectingSpan
                public void updateMeasureState(@NotNull TextPaint textPaint0) {
                    Intrinsics.checkNotNullParameter(textPaint0, "paint");
                    textPaint0.setTypeface(this.a);
                }
            };
            CharSequence charSequence1 = new SpannableString(charSequence0);
            ((SpannableString)charSequence1).setSpan(stringUtils$getTypefaceSpanString$typeFaceSpan$10, v1, v2, 33);
            return charSequence1;
        }
        return charSequence0;
    }

    public static CharSequence getTypefaceSpanString$default(StringUtils stringUtils0, CharSequence charSequence0, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 4) != 0) {
            v1 = 0;
        }
        if((v3 & 8) != 0) {
            v2 = charSequence0.length();
        }
        return stringUtils0.getTypefaceSpanString(charSequence0, v, v1, v2);
    }

    public final boolean hasNewLine(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "text");
        return StringUtils.c.containsMatchIn(charSequence0);
    }

    public final boolean isNewLine(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "text");
        return StringUtils.c.matches(charSequence0);
    }

    @NotNull
    public final String removeHtmlTag(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        return new Regex("<b>|</b>|<br>").replace(s, "");
    }

    @Composable
    @NotNull
    public final AnnotatedString toAnnotatedStringFromHtmlText(@NotNull String s, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        composer0.startReplaceGroup(0x700FF988);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x700FF988, v, -1, "com.kakao.tistory.presentation.common.utils.StringUtils.toAnnotatedStringFromHtmlText (StringUtils.kt:157)");
        }
        int v1 = 0;
        Builder annotatedString$Builder0 = new Builder(0, 1, null);
        String s1 = p.replace$default(s, "<br>", "\n", false, 4, null);
        for(Object object0: new Regex("<b>|</b>").split(s1, 0)) {
            if(v1 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if(v1 % 2 == 0) {
                annotatedString$Builder0.append(((String)object0));
            }
            else {
                int v2 = annotatedString$Builder0.pushStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0xFFFB, null));
                try {
                    annotatedString$Builder0.append(((String)object0));
                }
                finally {
                    annotatedString$Builder0.pop(v2);
                }
            }
            ++v1;
        }
        AnnotatedString annotatedString0 = annotatedString$Builder0.toAnnotatedString();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return annotatedString0;
    }

    @Composable
    @NotNull
    public final AnnotatedString toAnnotatedStringWithUnderline(@NotNull String s, @NotNull String s1, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(s1, "underlinedText");
        composer0.startReplaceGroup(0x295BAB33);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x295BAB33, v, -1, "com.kakao.tistory.presentation.common.utils.StringUtils.toAnnotatedStringWithUnderline (StringUtils.kt:175)");
        }
        Builder annotatedString$Builder0 = new Builder(0, 1, null);
        annotatedString$Builder0.append(s);
        int v1 = StringsKt__StringsKt.indexOf$default(s, s1, 0, false, 6, null);
        int v2 = s1.length();
        if(v1 != -1) {
            annotatedString$Builder0.addStyle(new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, TextDecoration.Companion.getUnderline(), null, null, null, 0xEFFF, null), v1, v2 + v1);
        }
        AnnotatedString annotatedString0 = annotatedString$Builder0.toAnnotatedString();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return annotatedString0;
    }

    public final long toColor-wrIjXm8(@Nullable String s, long v) {
        Color color0 = this.toColorOrNull-ijrfgN4(s);
        return color0 == null ? v : color0.unbox-impl();
    }

    public static long toColor-wrIjXm8$default(StringUtils stringUtils0, String s, long v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = Color.Companion.getTransparent-0d7_KjU();
        }
        return stringUtils0.toColor-wrIjXm8(s, v);
    }

    @Nullable
    public final Color toColorOrNull-ijrfgN4(@Nullable String s) {
        String s1 = "#";
        if(s != null) {
            try {
                if(!p.isBlank(s)) {
                    if(p.startsWith$default(s, "#", false, 2, null)) {
                        s1 = "";
                    }
                    return Color.box-impl(ColorKt.Color(android.graphics.Color.parseColor((s1 + s))));
                }
                return null;
            }
            catch(IllegalArgumentException illegalArgumentException0) {
            }
            CrashlyticsUtils.INSTANCE.logException(illegalArgumentException0);
        }
        return null;
    }

    @NotNull
    public final String toHexString(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "block");
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; v < arr_b.length; ++v) {
            String s = String.format("%02x", Arrays.copyOf(new Object[]{((byte)arr_b[v])}, 1));
            Intrinsics.checkNotNullExpressionValue(s, "format(...)");
            stringBuilder0.append(s);
        }
        String s1 = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s1, "toString(...)");
        return s1;
    }
}

