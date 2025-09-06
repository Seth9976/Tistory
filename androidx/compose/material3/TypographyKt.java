package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\" \u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001A\u0004\b\u0004\u0010\u0005\"\u0018\u0010\u000B\u001A\u00020\b*\u00020\u00078AX\u0080\u0004¢\u0006\u0006\u001A\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material3/Typography;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalTypography", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalTypography", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "Landroidx/compose/ui/text/TextStyle;", "getValue", "(Landroidx/compose/material3/tokens/TypographyKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;", "value", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class TypographyKt {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[TypographyKeyTokens.values().length];
            try {
                arr_v[TypographyKeyTokens.DisplayLarge.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TypographyKeyTokens.DisplayMedium.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TypographyKeyTokens.DisplaySmall.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TypographyKeyTokens.HeadlineLarge.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TypographyKeyTokens.HeadlineMedium.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TypographyKeyTokens.HeadlineSmall.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TypographyKeyTokens.TitleLarge.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TypographyKeyTokens.TitleMedium.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TypographyKeyTokens.TitleSmall.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TypographyKeyTokens.BodyLarge.ordinal()] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TypographyKeyTokens.BodyMedium.ordinal()] = 11;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TypographyKeyTokens.BodySmall.ordinal()] = 12;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TypographyKeyTokens.LabelLarge.ordinal()] = 13;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TypographyKeyTokens.LabelMedium.ordinal()] = 14;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TypographyKeyTokens.LabelSmall.ordinal()] = 15;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final ProvidableCompositionLocal a;

    static {
        TypographyKt.a = CompositionLocalKt.staticCompositionLocalOf(m4.Q);
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalTypography() {
        return TypographyKt.a;
    }

    @Composable
    @ReadOnlyComposable
    @JvmName(name = "getValue")
    @NotNull
    public static final TextStyle getValue(@NotNull TypographyKeyTokens typographyKeyTokens0, @Nullable Composer composer0, int v) {
        TextStyle textStyle0;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1049072145, v, -1, "androidx.compose.material3.<get-value> (Typography.kt:209)");
        }
        Typography typography0 = MaterialTheme.INSTANCE.getTypography(composer0, 6);
        switch(WhenMappings.$EnumSwitchMapping$0[typographyKeyTokens0.ordinal()]) {
            case 1: {
                textStyle0 = typography0.getDisplayLarge();
                break;
            }
            case 2: {
                textStyle0 = typography0.getDisplayMedium();
                break;
            }
            case 3: {
                textStyle0 = typography0.getDisplaySmall();
                break;
            }
            case 4: {
                textStyle0 = typography0.getHeadlineLarge();
                break;
            }
            case 5: {
                textStyle0 = typography0.getHeadlineMedium();
                break;
            }
            case 6: {
                textStyle0 = typography0.getHeadlineSmall();
                break;
            }
            case 7: {
                textStyle0 = typography0.getTitleLarge();
                break;
            }
            case 8: {
                textStyle0 = typography0.getTitleMedium();
                break;
            }
            case 9: {
                textStyle0 = typography0.getTitleSmall();
                break;
            }
            case 10: {
                textStyle0 = typography0.getBodyLarge();
                break;
            }
            case 11: {
                textStyle0 = typography0.getBodyMedium();
                break;
            }
            case 12: {
                textStyle0 = typography0.getBodySmall();
                break;
            }
            case 13: {
                textStyle0 = typography0.getLabelLarge();
                break;
            }
            case 14: {
                textStyle0 = typography0.getLabelMedium();
                break;
            }
            case 15: {
                textStyle0 = typography0.getLabelSmall();
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textStyle0;
    }
}

