package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A%\u0010\u0005\u001A\u00020\u00002\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00002\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001A\u001D\u0010\n\u001A\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u00002\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000B\u001A\"\u0010\u0011\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\b2\u0006\u0010\u000E\u001A\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/TextStyle;", "start", "stop", "", "fraction", "lerp", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;F)Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/unit/LayoutDirection;", "direction", "resolveDefaults", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/TextStyle;", "layoutDirection", "Landroidx/compose/ui/text/style/TextDirection;", "textDirection", "resolveTextDirection-IhaHGbI", "(Landroidx/compose/ui/unit/LayoutDirection;I)I", "resolveTextDirection", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class TextStyleKt {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[LayoutDirection.values().length];
            try {
                arr_v[LayoutDirection.Ltr.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LayoutDirection.Rtl.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final PlatformTextStyle access$createPlatformTextStyleInternal(PlatformSpanStyle platformSpanStyle0, PlatformParagraphStyle platformParagraphStyle0) {
        return platformSpanStyle0 != null || platformParagraphStyle0 != null ? AndroidTextStyle_androidKt.createPlatformTextStyle(platformSpanStyle0, platformParagraphStyle0) : null;
    }

    @NotNull
    public static final TextStyle lerp(@NotNull TextStyle textStyle0, @NotNull TextStyle textStyle1, float f) {
        return new TextStyle(SpanStyleKt.lerp(textStyle0.toSpanStyle(), textStyle1.toSpanStyle(), f), ParagraphStyleKt.lerp(textStyle0.toParagraphStyle(), textStyle1.toParagraphStyle(), f));
    }

    @NotNull
    public static final TextStyle resolveDefaults(@NotNull TextStyle textStyle0, @NotNull LayoutDirection layoutDirection0) {
        return new TextStyle(SpanStyleKt.resolveSpanStyleDefaults(textStyle0.getSpanStyle$ui_text_release()), ParagraphStyleKt.resolveParagraphStyleDefaults(textStyle0.getParagraphStyle$ui_text_release(), layoutDirection0), textStyle0.getPlatformStyle());
    }

    public static final int resolveTextDirection-IhaHGbI(@NotNull LayoutDirection layoutDirection0, int v) {
        if(TextDirection.equals-impl0(v, 3)) {
            switch(WhenMappings.$EnumSwitchMapping$0[layoutDirection0.ordinal()]) {
                case 1: {
                    return 4;
                }
                case 2: {
                    return 5;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        if(TextDirection.equals-impl0(v, 0x80000000)) {
            switch(WhenMappings.$EnumSwitchMapping$0[layoutDirection0.ordinal()]) {
                case 1: {
                    return 1;
                }
                case 2: {
                    return 2;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return v;
    }
}

