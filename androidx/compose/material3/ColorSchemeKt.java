package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\u001A\u00F8\u0002\u0010(\u001A\u00020%2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00002\b\b\u0002\u0010\u0005\u001A\u00020\u00002\b\b\u0002\u0010\u0006\u001A\u00020\u00002\b\b\u0002\u0010\u0007\u001A\u00020\u00002\b\b\u0002\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\t\u001A\u00020\u00002\b\b\u0002\u0010\n\u001A\u00020\u00002\b\b\u0002\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u000F\u001A\u00020\u00002\b\b\u0002\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0012\u001A\u00020\u00002\b\b\u0002\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\u0015\u001A\u00020\u00002\b\b\u0002\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0017\u001A\u00020\u00002\b\b\u0002\u0010\u0018\u001A\u00020\u00002\b\b\u0002\u0010\u0019\u001A\u00020\u00002\b\b\u0002\u0010\u001A\u001A\u00020\u00002\b\b\u0002\u0010\u001B\u001A\u00020\u00002\b\b\u0002\u0010\u001C\u001A\u00020\u00002\b\b\u0002\u0010\u001D\u001A\u00020\u00002\b\b\u0002\u0010\u001E\u001A\u00020\u00002\b\b\u0002\u0010\u001F\u001A\u00020\u00002\b\b\u0002\u0010 \u001A\u00020\u00002\b\b\u0002\u0010!\u001A\u00020\u00002\b\b\u0002\u0010\"\u001A\u00020\u00002\b\b\u0002\u0010#\u001A\u00020\u00002\b\b\u0002\u0010$\u001A\u00020\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b&\u0010\'\u001A\u00B4\u0002\u0010(\u001A\u00020%2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00002\b\b\u0002\u0010\u0005\u001A\u00020\u00002\b\b\u0002\u0010\u0006\u001A\u00020\u00002\b\b\u0002\u0010\u0007\u001A\u00020\u00002\b\b\u0002\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\t\u001A\u00020\u00002\b\b\u0002\u0010\n\u001A\u00020\u00002\b\b\u0002\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u000F\u001A\u00020\u00002\b\b\u0002\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0012\u001A\u00020\u00002\b\b\u0002\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\u0015\u001A\u00020\u00002\b\b\u0002\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0017\u001A\u00020\u00002\b\b\u0002\u0010\u0018\u001A\u00020\u00002\b\b\u0002\u0010\u0019\u001A\u00020\u00002\b\b\u0002\u0010\u001A\u001A\u00020\u00002\b\b\u0002\u0010\u001B\u001A\u00020\u00002\b\b\u0002\u0010\u001C\u001A\u00020\u00002\b\b\u0002\u0010\u001D\u001A\u00020\u0000H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b)\u0010*\u001A\u00F8\u0002\u0010,\u001A\u00020%2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00002\b\b\u0002\u0010\u0005\u001A\u00020\u00002\b\b\u0002\u0010\u0006\u001A\u00020\u00002\b\b\u0002\u0010\u0007\u001A\u00020\u00002\b\b\u0002\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\t\u001A\u00020\u00002\b\b\u0002\u0010\n\u001A\u00020\u00002\b\b\u0002\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u000F\u001A\u00020\u00002\b\b\u0002\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0012\u001A\u00020\u00002\b\b\u0002\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\u0015\u001A\u00020\u00002\b\b\u0002\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0017\u001A\u00020\u00002\b\b\u0002\u0010\u0018\u001A\u00020\u00002\b\b\u0002\u0010\u0019\u001A\u00020\u00002\b\b\u0002\u0010\u001A\u001A\u00020\u00002\b\b\u0002\u0010\u001B\u001A\u00020\u00002\b\b\u0002\u0010\u001C\u001A\u00020\u00002\b\b\u0002\u0010\u001D\u001A\u00020\u00002\b\b\u0002\u0010\u001E\u001A\u00020\u00002\b\b\u0002\u0010\u001F\u001A\u00020\u00002\b\b\u0002\u0010 \u001A\u00020\u00002\b\b\u0002\u0010!\u001A\u00020\u00002\b\b\u0002\u0010\"\u001A\u00020\u00002\b\b\u0002\u0010#\u001A\u00020\u00002\b\b\u0002\u0010$\u001A\u00020\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b+\u0010\'\u001A\u00B4\u0002\u0010,\u001A\u00020%2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00002\b\b\u0002\u0010\u0005\u001A\u00020\u00002\b\b\u0002\u0010\u0006\u001A\u00020\u00002\b\b\u0002\u0010\u0007\u001A\u00020\u00002\b\b\u0002\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\t\u001A\u00020\u00002\b\b\u0002\u0010\n\u001A\u00020\u00002\b\b\u0002\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u000F\u001A\u00020\u00002\b\b\u0002\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0012\u001A\u00020\u00002\b\b\u0002\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\u0015\u001A\u00020\u00002\b\b\u0002\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0017\u001A\u00020\u00002\b\b\u0002\u0010\u0018\u001A\u00020\u00002\b\b\u0002\u0010\u0019\u001A\u00020\u00002\b\b\u0002\u0010\u001A\u001A\u00020\u00002\b\b\u0002\u0010\u001B\u001A\u00020\u00002\b\b\u0002\u0010\u001C\u001A\u00020\u00002\b\b\u0002\u0010\u001D\u001A\u00020\u0000H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b-\u0010*\u001A\u001E\u00101\u001A\u00020\u0000*\u00020%2\u0006\u0010.\u001A\u00020\u0000H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b/\u00100\u001A\u001A\u00101\u001A\u00020\u00002\u0006\u0010.\u001A\u00020\u0000H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b2\u00103\u001A&\u00108\u001A\u00020\u0000*\u00020%2\u0006\u0010.\u001A\u00020\u00002\u0006\u00105\u001A\u000204H\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b6\u00107\u001A\u001E\u0010;\u001A\u00020\u0000*\u00020%2\u0006\u00105\u001A\u000204H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b9\u0010:\u001A\u000F\u0010<\u001A\u00020%H\u0000\u00A2\u0006\u0004\b<\u0010=\u001A\u001B\u0010@\u001A\u00020\u0000*\u00020%2\u0006\u0010?\u001A\u00020>H\u0001\u00A2\u0006\u0004\b@\u0010A\" \u0010G\u001A\b\u0012\u0004\u0012\u00020%0B8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bC\u0010D\u001A\u0004\bE\u0010F\"\u001D\u0010K\u001A\b\u0012\u0004\u0012\u00020H0B8\u0006\u00A2\u0006\f\n\u0004\bI\u0010D\u001A\u0004\bJ\u0010F\"\u0014\u0010M\u001A\u00020L8\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\bM\u0010N\"\u0018\u0010?\u001A\u00020\u0000*\u00020>8AX\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bO\u0010P\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006Q"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", "error", "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "surfaceBright", "surfaceContainer", "surfaceContainerHigh", "surfaceContainerHighest", "surfaceContainerLow", "surfaceContainerLowest", "surfaceDim", "Landroidx/compose/material3/ColorScheme;", "lightColorScheme-C-Xl9yA", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "lightColorScheme", "lightColorScheme-G1PFc-w", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "darkColorScheme-C-Xl9yA", "darkColorScheme", "darkColorScheme-G1PFc-w", "backgroundColor", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material3/ColorScheme;J)J", "contentColorFor", "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "Landroidx/compose/ui/unit/Dp;", "elevation", "applyTonalElevation-RFCenO8", "(Landroidx/compose/material3/ColorScheme;JFLandroidx/compose/runtime/Composer;I)J", "applyTonalElevation", "surfaceColorAtElevation-3ABfNKs", "(Landroidx/compose/material3/ColorScheme;F)J", "surfaceColorAtElevation", "expressiveLightColorScheme", "()Landroidx/compose/material3/ColorScheme;", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "value", "fromToken", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalColorScheme", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalColorScheme", "", "b", "getLocalTonalElevationEnabled", "LocalTonalElevationEnabled", "", "DisabledAlpha", "F", "getValue", "(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nColorScheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorScheme.kt\nandroidx/compose/material3/ColorSchemeKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1011:1\n708#2:1012\n696#2:1013\n77#3:1014\n77#3:1015\n148#4:1016\n*S KotlinDebug\n*F\n+ 1 ColorScheme.kt\nandroidx/compose/material3/ColorSchemeKt\n*L\n879#1:1012\n879#1:1013\n880#1:1014\n897#1:1015\n916#1:1016\n*E\n"})
public final class ColorSchemeKt {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[ColorSchemeKeyTokens.values().length];
            try {
                arr_v[ColorSchemeKeyTokens.Background.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.Error.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.ErrorContainer.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.InverseOnSurface.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.InversePrimary.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.InverseSurface.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.OnBackground.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.OnError.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.OnErrorContainer.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.OnPrimary.ordinal()] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.OnPrimaryContainer.ordinal()] = 11;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.OnSecondary.ordinal()] = 12;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.OnSecondaryContainer.ordinal()] = 13;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.OnSurface.ordinal()] = 14;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.OnSurfaceVariant.ordinal()] = 15;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.SurfaceTint.ordinal()] = 16;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.OnTertiary.ordinal()] = 17;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.OnTertiaryContainer.ordinal()] = 18;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.Outline.ordinal()] = 19;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.OutlineVariant.ordinal()] = 20;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.Primary.ordinal()] = 21;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.PrimaryContainer.ordinal()] = 22;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.Scrim.ordinal()] = 23;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.Secondary.ordinal()] = 24;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.SecondaryContainer.ordinal()] = 25;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.Surface.ordinal()] = 26;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.SurfaceVariant.ordinal()] = 27;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.SurfaceBright.ordinal()] = 28;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.SurfaceContainer.ordinal()] = 29;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.SurfaceContainerHigh.ordinal()] = 30;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.SurfaceContainerHighest.ordinal()] = 0x1F;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.SurfaceContainerLow.ordinal()] = 0x20;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.SurfaceContainerLowest.ordinal()] = 33;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.SurfaceDim.ordinal()] = 34;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.Tertiary.ordinal()] = 35;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ColorSchemeKeyTokens.TertiaryContainer.ordinal()] = 36;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final float DisabledAlpha = 0.38f;
    public static final ProvidableCompositionLocal a;
    public static final ProvidableCompositionLocal b;

    static {
        ColorSchemeKt.a = CompositionLocalKt.staticCompositionLocalOf(m4.x);
        ColorSchemeKt.b = CompositionLocalKt.staticCompositionLocalOf(m4.y);
    }

    @Composable
    @ReadOnlyComposable
    public static final long applyTonalElevation-RFCenO8(@NotNull ColorScheme colorScheme0, long v, float f, @Nullable Composer composer0, int v1) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x9FFA6E6E, v1, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:895)");
        }
        if(Color.equals-impl0(v, colorScheme0.getSurface-0d7_KjU()) && ((Boolean)composer0.consume(ColorSchemeKt.b)).booleanValue()) {
            v = ColorSchemeKt.surfaceColorAtElevation-3ABfNKs(colorScheme0, f);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v;
    }

    @Stable
    public static final long contentColorFor-4WTKRHQ(@NotNull ColorScheme colorScheme0, long v) {
        if(Color.equals-impl0(v, colorScheme0.getPrimary-0d7_KjU())) {
            return colorScheme0.getOnPrimary-0d7_KjU();
        }
        if(Color.equals-impl0(v, colorScheme0.getSecondary-0d7_KjU())) {
            return colorScheme0.getOnSecondary-0d7_KjU();
        }
        if(Color.equals-impl0(v, colorScheme0.getTertiary-0d7_KjU())) {
            return colorScheme0.getOnTertiary-0d7_KjU();
        }
        if(Color.equals-impl0(v, colorScheme0.getBackground-0d7_KjU())) {
            return colorScheme0.getOnBackground-0d7_KjU();
        }
        if(Color.equals-impl0(v, colorScheme0.getError-0d7_KjU())) {
            return colorScheme0.getOnError-0d7_KjU();
        }
        if(Color.equals-impl0(v, colorScheme0.getPrimaryContainer-0d7_KjU())) {
            return colorScheme0.getOnPrimaryContainer-0d7_KjU();
        }
        if(Color.equals-impl0(v, colorScheme0.getSecondaryContainer-0d7_KjU())) {
            return colorScheme0.getOnSecondaryContainer-0d7_KjU();
        }
        if(Color.equals-impl0(v, colorScheme0.getTertiaryContainer-0d7_KjU())) {
            return colorScheme0.getOnTertiaryContainer-0d7_KjU();
        }
        if(Color.equals-impl0(v, colorScheme0.getErrorContainer-0d7_KjU())) {
            return colorScheme0.getOnErrorContainer-0d7_KjU();
        }
        if(Color.equals-impl0(v, colorScheme0.getInverseSurface-0d7_KjU())) {
            return colorScheme0.getInverseOnSurface-0d7_KjU();
        }
        if(Color.equals-impl0(v, colorScheme0.getSurface-0d7_KjU())) {
            return colorScheme0.getOnSurface-0d7_KjU();
        }
        if(Color.equals-impl0(v, colorScheme0.getSurfaceVariant-0d7_KjU())) {
            return colorScheme0.getOnSurfaceVariant-0d7_KjU();
        }
        if(Color.equals-impl0(v, colorScheme0.getSurfaceBright-0d7_KjU())) {
            return colorScheme0.getOnSurface-0d7_KjU();
        }
        if(Color.equals-impl0(v, colorScheme0.getSurfaceContainer-0d7_KjU())) {
            return colorScheme0.getOnSurface-0d7_KjU();
        }
        if(Color.equals-impl0(v, colorScheme0.getSurfaceContainerHigh-0d7_KjU())) {
            return colorScheme0.getOnSurface-0d7_KjU();
        }
        if(Color.equals-impl0(v, colorScheme0.getSurfaceContainerHighest-0d7_KjU())) {
            return colorScheme0.getOnSurface-0d7_KjU();
        }
        if(Color.equals-impl0(v, colorScheme0.getSurfaceContainerLow-0d7_KjU())) {
            return colorScheme0.getOnSurface-0d7_KjU();
        }
        return Color.equals-impl0(v, colorScheme0.getSurfaceContainerLowest-0d7_KjU()) ? colorScheme0.getOnSurface-0d7_KjU() : 0L;
    }

    @Composable
    @ReadOnlyComposable
    public static final long contentColorFor-ek8zF_U(long v, @Nullable Composer composer0, int v1) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x1E5FB886, v1, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:878)");
        }
        composer0.startReplaceGroup(0x9BCEF150);
        long v2 = ColorSchemeKt.contentColorFor-4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composer0, 6), v);
        if(v2 == 16L) {
            v2 = ((Color)composer0.consume(ContentColorKt.getLocalContentColor())).unbox-impl();
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v2;
    }

    @NotNull
    public static final ColorScheme darkColorScheme-C-Xl9yA(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, long v13, long v14, long v15, long v16, long v17, long v18, long v19, long v20, long v21, long v22, long v23, long v24, long v25, long v26, long v27, long v28, long v29, long v30, long v31, long v32, long v33, long v34, long v35) {
        return new ColorScheme(v, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23, v24, v25, v26, v27, v28, v29, v35, v30, v31, v32, v33, v34, null);
    }

    public static ColorScheme darkColorScheme-C-Xl9yA$default(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, long v13, long v14, long v15, long v16, long v17, long v18, long v19, long v20, long v21, long v22, long v23, long v24, long v25, long v26, long v27, long v28, long v29, long v30, long v31, long v32, long v33, long v34, long v35, int v36, int v37, Object object0) {
        long v38 = (v36 & 1) == 0 ? v : 0L;
        long v39 = (v36 & 2) == 0 ? v1 : 0L;
        long v40 = (v36 & 4) == 0 ? v2 : 0L;
        long v41 = (v36 & 8) == 0 ? v3 : 0L;
        long v42 = (v36 & 16) == 0 ? v4 : 0L;
        long v43 = (v36 & 0x20) == 0 ? v5 : 0L;
        long v44 = (v36 & 0x40) == 0 ? v6 : 0L;
        long v45 = (v36 & 0x80) == 0 ? v7 : 0L;
        long v46 = (v36 & 0x100) == 0 ? v8 : 0L;
        long v47 = (v36 & 0x200) == 0 ? v9 : 0L;
        long v48 = (v36 & 0x400) == 0 ? v10 : 0L;
        long v49 = (v36 & 0x800) == 0 ? v11 : 0L;
        long v50 = (v36 & 0x1000) == 0 ? v12 : 0L;
        long v51 = (v36 & 0x2000) == 0 ? v13 : 0L;
        long v52 = (v36 & 0x4000) == 0 ? v14 : 0L;
        long v53 = (v36 & 0x8000) == 0 ? v15 : 0L;
        long v54 = (v36 & 0x10000) == 0 ? v16 : 0L;
        long v55 = (v36 & 0x20000) == 0 ? v17 : 0L;
        long v56 = (v36 & 0x40000) == 0 ? v18 : 0L;
        long v57 = (v36 & 0x80000) == 0 ? v19 : v38;
        long v58 = (v36 & 0x100000) == 0 ? v20 : 0L;
        long v59 = (v36 & 0x200000) == 0 ? v21 : 0L;
        long v60 = (v36 & 0x400000) == 0 ? v22 : 0L;
        long v61 = (v36 & 0x800000) == 0 ? v23 : 0L;
        long v62 = (v36 & 0x1000000) == 0 ? v24 : 0L;
        long v63 = (v36 & 0x2000000) == 0 ? v25 : 0L;
        long v64 = (v36 & 0x4000000) == 0 ? v26 : 0L;
        long v65 = (v36 & 0x8000000) == 0 ? v27 : 0L;
        long v66 = (v36 & 0x10000000) == 0 ? v28 : 0L;
        long v67 = (v36 & 0x20000000) == 0 ? v29 : 0L;
        long v68 = (v36 & 0x40000000) == 0 ? v30 : 0L;
        long v69 = (v36 & 0x80000000) == 0 ? v31 : 0L;
        long v70 = (v37 & 1) == 0 ? v32 : 0L;
        long v71 = (v37 & 2) == 0 ? v33 : 0L;
        long v72 = (v37 & 4) == 0 ? v34 : 0L;
        return (v37 & 8) == 0 ? ColorSchemeKt.darkColorScheme-C-Xl9yA(v38, v39, v40, v41, v42, v43, v44, v45, v46, v47, v48, v49, v50, v51, v52, v53, v54, v55, v56, v57, v58, v59, v60, v61, v62, v63, v64, v65, v66, v67, v68, v69, v70, v71, v72, v35) : ColorSchemeKt.darkColorScheme-C-Xl9yA(v38, v39, v40, v41, v42, v43, v44, v45, v46, v47, v48, v49, v50, v51, v52, v53, v54, v55, v56, v57, v58, v59, v60, v61, v62, v63, v64, v65, v66, v67, v68, v69, v70, v71, v72, 0L);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional surface roles instead")
    public static final ColorScheme darkColorScheme-G1PFc-w(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, long v13, long v14, long v15, long v16, long v17, long v18, long v19, long v20, long v21, long v22, long v23, long v24, long v25, long v26, long v27, long v28) {
        return ColorSchemeKt.darkColorScheme-C-Xl9yA$default(v, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23, v24, v25, v26, v27, v28, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0xE0000000, 15, null);
    }

    public static ColorScheme darkColorScheme-G1PFc-w$default(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, long v13, long v14, long v15, long v16, long v17, long v18, long v19, long v20, long v21, long v22, long v23, long v24, long v25, long v26, long v27, long v28, int v29, Object object0) {
        long v30 = (v29 & 1) == 0 ? v : 0L;
        long v31 = (v29 & 2) == 0 ? v1 : 0L;
        long v32 = (v29 & 4) == 0 ? v2 : 0L;
        long v33 = (v29 & 8) == 0 ? v3 : 0L;
        long v34 = (v29 & 16) == 0 ? v4 : 0L;
        long v35 = (v29 & 0x20) == 0 ? v5 : 0L;
        long v36 = (v29 & 0x40) == 0 ? v6 : 0L;
        long v37 = (v29 & 0x80) == 0 ? v7 : 0L;
        long v38 = (v29 & 0x100) == 0 ? v8 : 0L;
        long v39 = (v29 & 0x200) == 0 ? v9 : 0L;
        long v40 = (v29 & 0x400) == 0 ? v10 : 0L;
        long v41 = (v29 & 0x800) == 0 ? v11 : 0L;
        long v42 = (v29 & 0x1000) == 0 ? v12 : 0L;
        long v43 = (v29 & 0x2000) == 0 ? v13 : 0L;
        long v44 = (v29 & 0x4000) == 0 ? v14 : 0L;
        long v45 = (v29 & 0x8000) == 0 ? v15 : 0L;
        long v46 = (v29 & 0x10000) == 0 ? v16 : 0L;
        long v47 = (v29 & 0x20000) == 0 ? v17 : 0L;
        long v48 = (v29 & 0x40000) == 0 ? v18 : 0L;
        long v49 = (v29 & 0x80000) == 0 ? v19 : v30;
        long v50 = (v29 & 0x100000) == 0 ? v20 : 0L;
        long v51 = (v29 & 0x200000) == 0 ? v21 : 0L;
        long v52 = (v29 & 0x400000) == 0 ? v22 : 0L;
        long v53 = (v29 & 0x800000) == 0 ? v23 : 0L;
        long v54 = (v29 & 0x1000000) == 0 ? v24 : 0L;
        long v55 = (v29 & 0x2000000) == 0 ? v25 : 0L;
        long v56 = (v29 & 0x4000000) == 0 ? v26 : 0L;
        long v57 = (v29 & 0x8000000) == 0 ? v27 : 0L;
        return (v29 & 0x10000000) == 0 ? ColorSchemeKt.darkColorScheme-G1PFc-w(v30, v31, v32, v33, v34, v35, v36, v37, v38, v39, v40, v41, v42, v43, v44, v45, v46, v47, v48, v49, v50, v51, v52, v53, v54, v55, v56, v57, v28) : ColorSchemeKt.darkColorScheme-G1PFc-w(v30, v31, v32, v33, v34, v35, v36, v37, v38, v39, v40, v41, v42, v43, v44, v45, v46, v47, v48, v49, v50, v51, v52, v53, v54, v55, v56, v57, 0L);
    }

    // 去混淆评级： 中等(60)
    @NotNull
    public static final ColorScheme expressiveLightColorScheme() {
        return ColorSchemeKt.lightColorScheme-C-Xl9yA$default(0L, 0L, 0L, 0xFF4F378B00000000L, 0L, 0L, 0L, 0L, 0xFF4A445800000000L, 0L, 0L, 0L, 0xFF4A445800000000L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0xFFFFEEF7, 15, null);
    }

    @Stable
    public static final long fromToken(@NotNull ColorScheme colorScheme0, @NotNull ColorSchemeKeyTokens colorSchemeKeyTokens0) {
        switch(WhenMappings.$EnumSwitchMapping$0[colorSchemeKeyTokens0.ordinal()]) {
            case 1: {
                return colorScheme0.getBackground-0d7_KjU();
            }
            case 2: {
                return colorScheme0.getError-0d7_KjU();
            }
            case 3: {
                return colorScheme0.getErrorContainer-0d7_KjU();
            }
            case 4: {
                return colorScheme0.getInverseOnSurface-0d7_KjU();
            }
            case 5: {
                return colorScheme0.getInversePrimary-0d7_KjU();
            }
            case 6: {
                return colorScheme0.getInverseSurface-0d7_KjU();
            }
            case 7: {
                return colorScheme0.getOnBackground-0d7_KjU();
            }
            case 8: {
                return colorScheme0.getOnError-0d7_KjU();
            }
            case 9: {
                return colorScheme0.getOnErrorContainer-0d7_KjU();
            }
            case 10: {
                return colorScheme0.getOnPrimary-0d7_KjU();
            }
            case 11: {
                return colorScheme0.getOnPrimaryContainer-0d7_KjU();
            }
            case 12: {
                return colorScheme0.getOnSecondary-0d7_KjU();
            }
            case 13: {
                return colorScheme0.getOnSecondaryContainer-0d7_KjU();
            }
            case 14: {
                return colorScheme0.getOnSurface-0d7_KjU();
            }
            case 15: {
                return colorScheme0.getOnSurfaceVariant-0d7_KjU();
            }
            case 16: {
                return colorScheme0.getSurfaceTint-0d7_KjU();
            }
            case 17: {
                return colorScheme0.getOnTertiary-0d7_KjU();
            }
            case 18: {
                return colorScheme0.getOnTertiaryContainer-0d7_KjU();
            }
            case 19: {
                return colorScheme0.getOutline-0d7_KjU();
            }
            case 20: {
                return colorScheme0.getOutlineVariant-0d7_KjU();
            }
            case 21: {
                return colorScheme0.getPrimary-0d7_KjU();
            }
            case 22: {
                return colorScheme0.getPrimaryContainer-0d7_KjU();
            }
            case 23: {
                return colorScheme0.getScrim-0d7_KjU();
            }
            case 24: {
                return colorScheme0.getSecondary-0d7_KjU();
            }
            case 25: {
                return colorScheme0.getSecondaryContainer-0d7_KjU();
            }
            case 26: {
                return colorScheme0.getSurface-0d7_KjU();
            }
            case 27: {
                return colorScheme0.getSurfaceVariant-0d7_KjU();
            }
            case 28: {
                return colorScheme0.getSurfaceBright-0d7_KjU();
            }
            case 29: {
                return colorScheme0.getSurfaceContainer-0d7_KjU();
            }
            case 30: {
                return colorScheme0.getSurfaceContainerHigh-0d7_KjU();
            }
            case 0x1F: {
                return colorScheme0.getSurfaceContainerHighest-0d7_KjU();
            }
            case 0x20: {
                return colorScheme0.getSurfaceContainerLow-0d7_KjU();
            }
            case 33: {
                return colorScheme0.getSurfaceContainerLowest-0d7_KjU();
            }
            case 34: {
                return colorScheme0.getSurfaceDim-0d7_KjU();
            }
            case 35: {
                return colorScheme0.getTertiary-0d7_KjU();
            }
            case 36: {
                return colorScheme0.getTertiaryContainer-0d7_KjU();
            }
            default: {
                return 0L;
            }
        }
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalColorScheme() {
        return ColorSchemeKt.a;
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalTonalElevationEnabled() {
        return ColorSchemeKt.b;
    }

    @Composable
    @ReadOnlyComposable
    @JvmName(name = "getValue")
    public static final long getValue(@NotNull ColorSchemeKeyTokens colorSchemeKeyTokens0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-810780884, v, -1, "androidx.compose.material3.<get-value> (ColorScheme.kt:1009)");
        }
        long v1 = ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composer0, 6), colorSchemeKeyTokens0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    @NotNull
    public static final ColorScheme lightColorScheme-C-Xl9yA(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, long v13, long v14, long v15, long v16, long v17, long v18, long v19, long v20, long v21, long v22, long v23, long v24, long v25, long v26, long v27, long v28, long v29, long v30, long v31, long v32, long v33, long v34, long v35) {
        return new ColorScheme(v, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23, v24, v25, v26, v27, v28, v29, v35, v30, v31, v32, v33, v34, null);
    }

    public static ColorScheme lightColorScheme-C-Xl9yA$default(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, long v13, long v14, long v15, long v16, long v17, long v18, long v19, long v20, long v21, long v22, long v23, long v24, long v25, long v26, long v27, long v28, long v29, long v30, long v31, long v32, long v33, long v34, long v35, int v36, int v37, Object object0) {
        long v38 = (v36 & 1) == 0 ? v : 0L;
        long v39 = (v36 & 2) == 0 ? v1 : 0L;
        long v40 = (v36 & 4) == 0 ? v2 : 0L;
        long v41 = (v36 & 8) == 0 ? v3 : 0L;
        long v42 = (v36 & 16) == 0 ? v4 : 0L;
        long v43 = (v36 & 0x20) == 0 ? v5 : 0L;
        long v44 = (v36 & 0x40) == 0 ? v6 : 0L;
        long v45 = (v36 & 0x80) == 0 ? v7 : 0L;
        long v46 = (v36 & 0x100) == 0 ? v8 : 0L;
        long v47 = (v36 & 0x200) == 0 ? v9 : 0L;
        long v48 = (v36 & 0x400) == 0 ? v10 : 0L;
        long v49 = (v36 & 0x800) == 0 ? v11 : 0L;
        long v50 = (v36 & 0x1000) == 0 ? v12 : 0L;
        long v51 = (v36 & 0x2000) == 0 ? v13 : 0L;
        long v52 = (v36 & 0x4000) == 0 ? v14 : 0L;
        long v53 = (v36 & 0x8000) == 0 ? v15 : 0L;
        long v54 = (v36 & 0x10000) == 0 ? v16 : 0L;
        long v55 = (v36 & 0x20000) == 0 ? v17 : 0L;
        long v56 = (v36 & 0x40000) == 0 ? v18 : 0L;
        long v57 = (v36 & 0x80000) == 0 ? v19 : v38;
        long v58 = (v36 & 0x100000) == 0 ? v20 : 0L;
        long v59 = (v36 & 0x200000) == 0 ? v21 : 0L;
        long v60 = (v36 & 0x400000) == 0 ? v22 : 0L;
        long v61 = (v36 & 0x800000) == 0 ? v23 : 0L;
        long v62 = (v36 & 0x1000000) == 0 ? v24 : 0L;
        long v63 = (v36 & 0x2000000) == 0 ? v25 : 0L;
        long v64 = (v36 & 0x4000000) == 0 ? v26 : 0L;
        long v65 = (v36 & 0x8000000) == 0 ? v27 : 0L;
        long v66 = (v36 & 0x10000000) == 0 ? v28 : 0L;
        long v67 = (v36 & 0x20000000) == 0 ? v29 : 0L;
        long v68 = (v36 & 0x40000000) == 0 ? v30 : 0L;
        long v69 = (v36 & 0x80000000) == 0 ? v31 : 0L;
        long v70 = (v37 & 1) == 0 ? v32 : 0L;
        long v71 = (v37 & 2) == 0 ? v33 : 0L;
        long v72 = (v37 & 4) == 0 ? v34 : 0L;
        return (v37 & 8) == 0 ? ColorSchemeKt.lightColorScheme-C-Xl9yA(v38, v39, v40, v41, v42, v43, v44, v45, v46, v47, v48, v49, v50, v51, v52, v53, v54, v55, v56, v57, v58, v59, v60, v61, v62, v63, v64, v65, v66, v67, v68, v69, v70, v71, v72, v35) : ColorSchemeKt.lightColorScheme-C-Xl9yA(v38, v39, v40, v41, v42, v43, v44, v45, v46, v47, v48, v49, v50, v51, v52, v53, v54, v55, v56, v57, v58, v59, v60, v61, v62, v63, v64, v65, v66, v67, v68, v69, v70, v71, v72, 0L);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional surface roles instead")
    public static final ColorScheme lightColorScheme-G1PFc-w(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, long v13, long v14, long v15, long v16, long v17, long v18, long v19, long v20, long v21, long v22, long v23, long v24, long v25, long v26, long v27, long v28) {
        return ColorSchemeKt.lightColorScheme-C-Xl9yA$default(v, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23, v24, v25, v26, v27, v28, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0xE0000000, 15, null);
    }

    public static ColorScheme lightColorScheme-G1PFc-w$default(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, long v13, long v14, long v15, long v16, long v17, long v18, long v19, long v20, long v21, long v22, long v23, long v24, long v25, long v26, long v27, long v28, int v29, Object object0) {
        long v30 = (v29 & 1) == 0 ? v : 0L;
        long v31 = (v29 & 2) == 0 ? v1 : 0L;
        long v32 = (v29 & 4) == 0 ? v2 : 0L;
        long v33 = (v29 & 8) == 0 ? v3 : 0L;
        long v34 = (v29 & 16) == 0 ? v4 : 0L;
        long v35 = (v29 & 0x20) == 0 ? v5 : 0L;
        long v36 = (v29 & 0x40) == 0 ? v6 : 0L;
        long v37 = (v29 & 0x80) == 0 ? v7 : 0L;
        long v38 = (v29 & 0x100) == 0 ? v8 : 0L;
        long v39 = (v29 & 0x200) == 0 ? v9 : 0L;
        long v40 = (v29 & 0x400) == 0 ? v10 : 0L;
        long v41 = (v29 & 0x800) == 0 ? v11 : 0L;
        long v42 = (v29 & 0x1000) == 0 ? v12 : 0L;
        long v43 = (v29 & 0x2000) == 0 ? v13 : 0L;
        long v44 = (v29 & 0x4000) == 0 ? v14 : 0L;
        long v45 = (v29 & 0x8000) == 0 ? v15 : 0L;
        long v46 = (v29 & 0x10000) == 0 ? v16 : 0L;
        long v47 = (v29 & 0x20000) == 0 ? v17 : 0L;
        long v48 = (v29 & 0x40000) == 0 ? v18 : 0L;
        long v49 = (v29 & 0x80000) == 0 ? v19 : v30;
        long v50 = (v29 & 0x100000) == 0 ? v20 : 0L;
        long v51 = (v29 & 0x200000) == 0 ? v21 : 0L;
        long v52 = (v29 & 0x400000) == 0 ? v22 : 0L;
        long v53 = (v29 & 0x800000) == 0 ? v23 : 0L;
        long v54 = (v29 & 0x1000000) == 0 ? v24 : 0L;
        long v55 = (v29 & 0x2000000) == 0 ? v25 : 0L;
        long v56 = (v29 & 0x4000000) == 0 ? v26 : 0L;
        long v57 = (v29 & 0x8000000) == 0 ? v27 : 0L;
        return (v29 & 0x10000000) == 0 ? ColorSchemeKt.lightColorScheme-G1PFc-w(v30, v31, v32, v33, v34, v35, v36, v37, v38, v39, v40, v41, v42, v43, v44, v45, v46, v47, v48, v49, v50, v51, v52, v53, v54, v55, v56, v57, v28) : ColorSchemeKt.lightColorScheme-G1PFc-w(v30, v31, v32, v33, v34, v35, v36, v37, v38, v39, v40, v41, v42, v43, v44, v45, v46, v47, v48, v49, v50, v51, v52, v53, v54, v55, v56, v57, 0L);
    }

    // 去混淆评级： 低(20)
    @Stable
    public static final long surfaceColorAtElevation-3ABfNKs(@NotNull ColorScheme colorScheme0, float f) {
        return Dp.equals-impl0(f, 0.0f) ? colorScheme0.getSurface-0d7_KjU() : ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(colorScheme0.getSurfaceTint-0d7_KjU(), (((float)Math.log(f + 1.0f)) * 4.5f + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme0.getSurface-0d7_KjU());
    }
}

