package androidx.compose.ui.text;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\u001A\u001C\u0010\u0002\u001A\u00020\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u00052\b\u0010\u0006\u001A\u0004\u0018\u00010\u0007H\u0000\u001A\u001E\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00020\f\u001A\u001E\u0010\b\u001A\u00020\u00052\u0006\u0010\t\u001A\u00020\u00052\u0006\u0010\n\u001A\u00020\u00052\u0006\u0010\u000B\u001A\u00020\f\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"DefaultIncludeFontPadding", "", "createPlatformTextStyle", "Landroidx/compose/ui/text/PlatformTextStyle;", "spanStyle", "Landroidx/compose/ui/text/PlatformSpanStyle;", "paragraphStyle", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "lerp", "start", "stop", "fraction", "", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidTextStyle_androidKt {
    public static final boolean DefaultIncludeFontPadding = false;

    @NotNull
    public static final PlatformTextStyle createPlatformTextStyle(@Nullable PlatformSpanStyle platformSpanStyle0, @Nullable PlatformParagraphStyle platformParagraphStyle0) {
        return new PlatformTextStyle(platformSpanStyle0, platformParagraphStyle0);
    }

    @NotNull
    public static final PlatformParagraphStyle lerp(@NotNull PlatformParagraphStyle platformParagraphStyle0, @NotNull PlatformParagraphStyle platformParagraphStyle1, float f) {
        return platformParagraphStyle0.getIncludeFontPadding() == platformParagraphStyle1.getIncludeFontPadding() ? platformParagraphStyle0 : new PlatformParagraphStyle(((EmojiSupportMatch)SpanStyleKt.lerpDiscrete(EmojiSupportMatch.box-impl(platformParagraphStyle0.getEmojiSupportMatch-_3YsG6Y()), EmojiSupportMatch.box-impl(platformParagraphStyle1.getEmojiSupportMatch-_3YsG6Y()), f)).unbox-impl(), ((Boolean)SpanStyleKt.lerpDiscrete(Boolean.valueOf(platformParagraphStyle0.getIncludeFontPadding()), Boolean.valueOf(platformParagraphStyle1.getIncludeFontPadding()), f)).booleanValue(), null);
    }

    @NotNull
    public static final PlatformSpanStyle lerp(@NotNull PlatformSpanStyle platformSpanStyle0, @NotNull PlatformSpanStyle platformSpanStyle1, float f) [...] // Inlined contents
}

