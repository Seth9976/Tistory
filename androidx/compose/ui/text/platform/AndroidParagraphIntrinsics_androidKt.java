package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.Density;
import androidx.core.text.TextUtilsCompat;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A&\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0001\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001AW\u0010\u0017\u001A\u00020\u00162\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n2\u0012\u0010\u000F\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000E0\r0\f2\u0012\u0010\u0011\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\f2\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0015\u001A\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/style/TextDirection;", "textDirection", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "", "resolveTextDirectionHeuristics-HklW4sA", "(ILandroidx/compose/ui/text/intl/LocaleList;)I", "resolveTextDirectionHeuristics", "", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "ActualParagraphIntrinsics", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;)Landroidx/compose/ui/text/ParagraphIntrinsics;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidParagraphIntrinsics_androidKt {
    @NotNull
    public static final ParagraphIntrinsics ActualParagraphIntrinsics(@NotNull String s, @NotNull TextStyle textStyle0, @NotNull List list0, @NotNull List list1, @NotNull Density density0, @NotNull Resolver fontFamily$Resolver0) {
        return new AndroidParagraphIntrinsics(s, textStyle0, list0, list1, fontFamily$Resolver0, density0);
    }

    public static final boolean access$getHasEmojiCompat(TextStyle textStyle0) {
        PlatformTextStyle platformTextStyle0 = textStyle0.getPlatformStyle();
        if(platformTextStyle0 != null) {
            PlatformParagraphStyle platformParagraphStyle0 = platformTextStyle0.getParagraphStyle();
            if(platformParagraphStyle0 != null) {
                EmojiSupportMatch emojiSupportMatch0 = EmojiSupportMatch.box-impl(platformParagraphStyle0.getEmojiSupportMatch-_3YsG6Y());
                return emojiSupportMatch0 == null ? true : !EmojiSupportMatch.equals-impl0(emojiSupportMatch0.unbox-impl(), 1);
            }
        }
        throw new NullPointerException();
    }

    public static final int resolveTextDirectionHeuristics-HklW4sA(int v, @Nullable LocaleList localeList0) {
        Locale locale0;
        if(!TextDirection.equals-impl0(v, 4)) {
            if(TextDirection.equals-impl0(v, 5)) {
                return 3;
            }
            if(TextDirection.equals-impl0(v, 1)) {
                return 0;
            }
            if(TextDirection.equals-impl0(v, 2)) {
                return 1;
            }
            if(!(TextDirection.equals-impl0(v, 3) ? true : TextDirection.equals-impl0(v, 0x80000000))) {
                throw new IllegalStateException("Invalid TextDirection.");
            }
            if(localeList0 == null) {
                locale0 = Locale.getDefault();
            }
            else {
                locale0 = localeList0.get(0).getPlatformLocale();
                if(locale0 == null) {
                    locale0 = Locale.getDefault();
                }
            }
            int v1 = TextUtilsCompat.getLayoutDirectionFromLocale(locale0);
            return v1 != 0 && v1 == 1 ? 3 : 2;
        }
        return 2;
    }

    public static int resolveTextDirectionHeuristics-HklW4sA$default(int v, LocaleList localeList0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            localeList0 = null;
        }
        return AndroidParagraphIntrinsics_androidKt.resolveTextDirectionHeuristics-HklW4sA(v, localeList0);
    }
}

