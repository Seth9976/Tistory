package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.LayoutDirection;
import ce.e;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00C7\u0002\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0004Jv\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u00052\b\b\u0002\u0010\u000B\u001A\u00020\u00052\b\b\u0002\u0010\f\u001A\u00020\u00052\b\b\u0002\u0010\r\u001A\u00020\u00052\b\b\u0002\u0010\u000E\u001A\u00020\u00052\b\b\u0002\u0010\u000F\u001A\u00020\u0005H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u001D\u001A\u00020\u001A2\u0006\u0010\u0013\u001A\u00020\u00122\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0017\u001A\u00020\u00162\b\b\u0002\u0010\u0019\u001A\u00020\u0018H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001B\u0010\u001CJ5\u0010 \u001A\u00020\u001A2\u0006\u0010\u001F\u001A\u00020\u001E2\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0017\u001A\u00020\u0016H\u0007\u00A2\u0006\u0004\b \u0010!J5\u0010 \u001A\u00020\u001A2\u0006\u0010#\u001A\u00020\"2\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0017\u001A\u00020\u0016H\u0007\u00A2\u0006\u0004\b \u0010$J\u0096\u0001\u0010 \u001A\u00020\u001A2\u0006\u0010#\u001A\u00020\"2\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0017\u001A\u00020\u00162\b\b\u0002\u0010\u0003\u001A\u00020\u00022!\b\u0002\u0010)\u001A\u001B\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u001A\u0018\u00010%\u00A2\u0006\u0002\b(2%\b\u0002\u0010+\u001A\u001F\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001A0*\u00A2\u0006\u0002\b(2\b\b\u0002\u0010-\u001A\u00020,2\b\b\u0002\u0010.\u001A\u00020,H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b/\u00100J5\u0010 \u001A\u00020\u001A2\u0006\u00102\u001A\u0002012\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0017\u001A\u00020\u0016H\u0007\u00A2\u0006\u0004\b \u00103J\u0096\u0001\u0010 \u001A\u00020\u001A2\u0006\u00102\u001A\u0002012\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0017\u001A\u00020\u00162\b\b\u0002\u0010\u0003\u001A\u00020\u00022!\b\u0002\u0010)\u001A\u001B\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u001A\u0018\u00010%\u00A2\u0006\u0002\b(2%\b\u0002\u0010+\u001A\u001F\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001A0*\u00A2\u0006\u0002\b(2\b\b\u0002\u0010-\u001A\u00020,2\b\b\u0002\u0010.\u001A\u00020,H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b/\u00104R\u001D\u00109\u001A\u00020,8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u00108R\u001D\u0010<\u001A\u00020,8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b:\u00106\u001A\u0004\b;\u00108R\u0018\u0010@\u001A\u00020\u0002*\u00020=8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b>\u0010?\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006A"}, d2 = {"Landroidx/compose/material3/SliderDefaults;", "", "Landroidx/compose/material3/SliderColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SliderColors;", "Landroidx/compose/ui/graphics/Color;", "thumbColor", "activeTrackColor", "activeTickColor", "inactiveTrackColor", "inactiveTickColor", "disabledThumbColor", "disabledActiveTrackColor", "disabledActiveTickColor", "disabledInactiveTrackColor", "disabledInactiveTickColor", "colors-q0g_0yA", "(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SliderColors;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Landroidx/compose/ui/unit/DpSize;", "thumbSize", "", "Thumb-9LiSoMs", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZJLandroidx/compose/runtime/Composer;II)V", "Thumb", "Landroidx/compose/material3/SliderPositions;", "sliderPositions", "Track", "(Landroidx/compose/material3/SliderPositions;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material3/SliderState;", "sliderState", "(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ExtensionFunctionType;", "drawStopIndicator", "Lkotlin/Function3;", "drawTick", "Landroidx/compose/ui/unit/Dp;", "thumbTrackGapSize", "trackInsideCornerSize", "Track-4EFweAY", "(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material3/RangeSliderState;", "rangeSliderState", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/runtime/Composer;II)V", "a", "F", "getTrackStopIndicatorSize-D9Ej5fM", "()F", "TrackStopIndicatorSize", "b", "getTickSize-D9Ej5fM", "TickSize", "Landroidx/compose/material3/ColorScheme;", "getDefaultSliderColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SliderColors;", "defaultSliderColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,2263:1\n1#2:2264\n1223#3,6:2265\n1223#3,6:2271\n1223#3,6:2278\n1223#3,6:2284\n1223#3,6:2291\n1223#3,6:2297\n1223#3,6:2304\n71#4:2277\n77#5:2290\n77#5:2303\n148#6:2310\n13694#7,3:2311\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderDefaults\n*L\n952#1:2265,6\n953#1:2271,6\n1005#1:2278,6\n1116#1:2284,6\n1139#1:2291,6\n1224#1:2297,6\n1247#1:2304,6\n968#1:2277\n1138#1:2290\n1246#1:2303\n1299#1:2310\n1348#1:2311,3\n*E\n"})
public final class SliderDefaults {
    public static final int $stable;
    @NotNull
    public static final SliderDefaults INSTANCE;
    public static final float a;
    public static final float b;
    public static final Path c;

    static {
        SliderDefaults.INSTANCE = new SliderDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        SliderDefaults.a = 0.0f;
        SliderDefaults.b = 0.0f;
        SliderDefaults.c = AndroidPath_androidKt.Path();
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void Thumb-9LiSoMs(@NotNull MutableInteractionSource mutableInteractionSource0, @Nullable Modifier modifier0, @Nullable SliderColors sliderColors0, boolean z, long v, @Nullable Composer composer0, int v1, int v2) {
        long v5;
        boolean z1;
        int v4;
        SliderColors sliderColors1;
        Modifier modifier1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(-290277409);
        if((v2 & 1) == 0) {
            v3 = (v1 & 6) == 0 ? (composer1.changed(mutableInteractionSource0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v1 & 0x30) == 0) {
            modifier1 = modifier0;
            v3 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v1 & 0x180) == 0) {
            if((v2 & 4) == 0) {
                sliderColors1 = sliderColors0;
                v4 = composer1.changed(sliderColors1) ? 0x100 : 0x80;
            }
            else {
                sliderColors1 = sliderColors0;
                v4 = 0x80;
            }
            v3 |= v4;
        }
        else {
            sliderColors1 = sliderColors0;
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
            z1 = z;
        }
        else if((v1 & 0xC00) == 0) {
            z1 = z;
            v3 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        else {
            z1 = z;
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
            v5 = v;
        }
        else if((v1 & 0x6000) == 0) {
            v5 = v;
            v3 |= (composer1.changed(v5) ? 0x4000 : 0x2000);
        }
        else {
            v5 = v;
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((v1 & 0x30000) == 0) {
            v3 |= (composer1.changed(this) ? 0x20000 : 0x10000);
        }
        if((v3 & 74899) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            boolean z2 = true;
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v2 & 2) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v2 & 4) != 0) {
                    SliderColors sliderColors2 = this.colors(composer1, v3 >> 15 & 14);
                    v3 &= -897;
                    sliderColors1 = sliderColors2;
                }
                if((v2 & 8) != 0) {
                    z1 = true;
                }
                if((v2 & 16) != 0) {
                    v5 = 0L;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 4) != 0) {
                    v3 &= -897;
                }
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-290277409, v3, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:950)");
            }
            SnapshotStateList snapshotStateList0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(snapshotStateList0 == composer$Companion0.getEmpty()) {
                snapshotStateList0 = SnapshotStateKt.mutableStateListOf();
                composer1.updateRememberedValue(snapshotStateList0);
            }
            if((v3 & 14) != 4) {
                z2 = false;
            }
            nk nk0 = composer1.rememberedValue();
            if(z2 || nk0 == composer$Companion0.getEmpty()) {
                nk0 = new nk(mutableInteractionSource0, snapshotStateList0, null);
                composer1.updateRememberedValue(nk0);
            }
            EffectsKt.LaunchedEffect(mutableInteractionSource0, nk0, composer1, v3 & 14);
            SpacerKt.Spacer(BackgroundKt.background-bw27NRU(HoverableKt.hoverable$default(SizeKt.size-6HolHcs(modifier1, (snapshotStateList0.isEmpty() ? v5 : DpSize.copy-DwJknco$default(v5, DpSize.getWidth-D9Ej5fM(v5) / 2.0f, 0.0f, 2, null))), mutableInteractionSource0, false, 2, null), sliderColors1.thumbColor-vNxB06k$material3_release(z1), ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), composer1, 6)), composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new pf(this, mutableInteractionSource0, modifier1, sliderColors1, z1, v5, v1, v2));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the overload that takes `drawStopIndicator`, `drawTick`, `thumbTrackGapSize` and `trackInsideCornerSize`, see `LegacyRangeSliderSample` on how to restore the previous behavior", replaceWith = @ReplaceWith(expression = "Track(rangeSliderState, modifier, colors, enabled, drawStopIndicator, drawTick, thumbTrackGapSize, trackInsideCornerSize)", imports = {}))
    public final void Track(RangeSliderState rangeSliderState0, Modifier modifier0, SliderColors sliderColors0, boolean z, Composer composer0, int v, int v1) {
        boolean z1;
        boolean z2;
        SliderColors sliderColors2;
        Modifier modifier2;
        SliderColors sliderColors3;
        int v3;
        SliderColors sliderColors1;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x9F9146D7);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(rangeSliderState0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v & 0x30) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v & 0x180) == 0) {
            if((v1 & 4) == 0) {
                sliderColors1 = sliderColors0;
                v3 = composer1.changed(sliderColors1) ? 0x100 : 0x80;
            }
            else {
                sliderColors1 = sliderColors0;
                v3 = 0x80;
            }
            v2 |= v3;
        }
        else {
            sliderColors1 = sliderColors0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (composer1.changed(this) ? 0x4000 : 0x2000);
        }
        if((v2 & 9363) != 9362 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v1 & 2) == 0 ? modifier1 : Modifier.Companion;
                if((v1 & 4) == 0) {
                    sliderColors3 = sliderColors1;
                }
                else {
                    sliderColors3 = this.colors(composer1, v2 >> 12 & 14);
                    v2 &= -897;
                }
                if((v1 & 8) == 0) {
                    modifier2 = modifier3;
                    sliderColors2 = sliderColors3;
                    z2 = z;
                }
                else {
                    modifier2 = modifier3;
                    sliderColors2 = sliderColors3;
                    z2 = true;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 4) != 0) {
                    v2 &= -897;
                }
                modifier2 = modifier1;
                sliderColors2 = sliderColors1;
                z2 = z;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x9F9146D7, v2, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1189)");
            }
            this.Track-4EFweAY(rangeSliderState0, modifier2, z2, sliderColors2, null, null, 0.0f, 0.0f, composer1, v2 & 14 | 0xD80000 | v2 & 0x70 | v2 >> 3 & 0x380 | v2 << 3 & 0x1C00 | v2 << 12 & 0xE000000, 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            sliderColors1 = sliderColors2;
            z1 = z2;
        }
        else {
            composer1.skipToGroupEnd();
            z1 = z;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new vb(this, rangeSliderState0, modifier1, sliderColors1, z1, v, v1, 4));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(message = "Use version that supports slider state")
    public final void Track(@NotNull SliderPositions sliderPositions0, @Nullable Modifier modifier0, @Nullable SliderColors sliderColors0, boolean z, @Nullable Composer composer0, int v, int v1) {
        Modifier modifier1;
        boolean z2;
        int v4;
        boolean z1;
        int v3;
        SliderColors sliderColors1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xA3CF0637);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(sliderPositions0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            if((v1 & 4) == 0) {
                sliderColors1 = sliderColors0;
                v3 = composer1.changed(sliderColors1) ? 0x100 : 0x80;
            }
            else {
                sliderColors1 = sliderColors0;
                v3 = 0x80;
            }
            v2 |= v3;
        }
        else {
            sliderColors1 = sliderColors0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            z1 = z;
        }
        else if((v & 0xC00) == 0) {
            z1 = z;
            v2 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        else {
            z1 = z;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (composer1.changed(this) ? 0x4000 : 0x2000);
        }
        if((v2 & 9363) != 9362 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v1 & 4) != 0) {
                    SliderColors sliderColors2 = this.colors(composer1, v2 >> 12 & 14);
                    v2 &= -897;
                    sliderColors1 = sliderColors2;
                }
                v4 = v2;
                z2 = (v1 & 8) == 0 ? z1 : true;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 4) != 0) {
                    v2 &= -897;
                }
                modifier1 = modifier0;
                v4 = v2;
                z2 = z1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xA3CF0637, v4, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:999)");
            }
            long v5 = sliderColors1.trackColor-WaAFU9c$material3_release(z2, false);
            long v6 = sliderColors1.trackColor-WaAFU9c$material3_release(z2, true);
            long v7 = sliderColors1.tickColor-WaAFU9c$material3_release(z2, false);
            long v8 = sliderColors1.tickColor-WaAFU9c$material3_release(z2, true);
            Modifier modifier2 = SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(modifier1, 0.0f, 1, null), 0.0f);
            boolean z3 = composer1.changed(v5);
            boolean z4 = composer1.changed(v6);
            boolean z5 = composer1.changed(v7);
            boolean z6 = composer1.changed(v8);
            ok ok0 = composer1.rememberedValue();
            if((z3 | (v4 & 14) == 4 | z4 | z5 | z6) != 0 || ok0 == Composer.Companion.getEmpty()) {
                ok ok1 = new ok(v5, sliderPositions0, v6, v7, v8);
                composer1.updateRememberedValue(ok1);
                ok0 = ok1;
            }
            CanvasKt.Canvas(modifier2, ok0, composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z1 = z2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new vb(this, sliderPositions0, modifier1, sliderColors1, z1, v, v1, 2));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the overload that takes `drawStopIndicator`, `drawTick`, `thumbTrackGapSize` and `trackInsideCornerSize`, see `LegacySliderSample` on how to restore the previous behavior", replaceWith = @ReplaceWith(expression = "Track(sliderState, modifier, enabled, colors, drawStopIndicator, drawTick, thumbTrackGapSize, trackInsideCornerSize)", imports = {}))
    public final void Track(SliderState sliderState0, Modifier modifier0, SliderColors sliderColors0, boolean z, Composer composer0, int v, int v1) {
        boolean z1;
        boolean z2;
        SliderColors sliderColors2;
        Modifier modifier2;
        SliderColors sliderColors3;
        int v3;
        SliderColors sliderColors1;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x2360EB1E);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(sliderState0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v & 0x30) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v & 0x180) == 0) {
            if((v1 & 4) == 0) {
                sliderColors1 = sliderColors0;
                v3 = composer1.changed(sliderColors1) ? 0x100 : 0x80;
            }
            else {
                sliderColors1 = sliderColors0;
                v3 = 0x80;
            }
            v2 |= v3;
        }
        else {
            sliderColors1 = sliderColors0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (composer1.changed(this) ? 0x4000 : 0x2000);
        }
        if((v2 & 9363) != 9362 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v1 & 2) == 0 ? modifier1 : Modifier.Companion;
                if((v1 & 4) == 0) {
                    sliderColors3 = sliderColors1;
                }
                else {
                    sliderColors3 = this.colors(composer1, v2 >> 12 & 14);
                    v2 &= -897;
                }
                if((v1 & 8) == 0) {
                    modifier2 = modifier3;
                    sliderColors2 = sliderColors3;
                    z2 = z;
                }
                else {
                    modifier2 = modifier3;
                    sliderColors2 = sliderColors3;
                    z2 = true;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 4) != 0) {
                    v2 &= -897;
                }
                modifier2 = modifier1;
                sliderColors2 = sliderColors1;
                z2 = z;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x2360EB1E, v2, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1081)");
            }
            this.Track-4EFweAY(sliderState0, modifier2, z2, sliderColors2, null, null, 0.0f, 0.0f, composer1, v2 & 14 | 0xD80000 | v2 & 0x70 | v2 >> 3 & 0x380 | v2 << 3 & 0x1C00 | v2 << 12 & 0xE000000, 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            sliderColors1 = sliderColors2;
            z1 = z2;
        }
        else {
            composer1.skipToGroupEnd();
            z1 = z;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new vb(this, sliderState0, modifier1, sliderColors1, z1, v, v1, 3));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void Track-4EFweAY(@NotNull RangeSliderState rangeSliderState0, @Nullable Modifier modifier0, boolean z, @Nullable SliderColors sliderColors0, @Nullable Function2 function20, @Nullable Function3 function30, float f, float f1, @Nullable Composer composer0, int v, int v1) {
        float f4;
        Function3 function31;
        Function2 function21;
        float f3;
        SliderColors sliderColors1;
        boolean z2;
        Modifier modifier1;
        int v10;
        int v9;
        boolean z8;
        Function2 function23;
        float f5;
        Function3 function32;
        Function2 function22;
        SliderColors sliderColors2;
        int v3;
        Modifier modifier2;
        float f2;
        boolean z1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xDFB46B7C);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(rangeSliderState0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            z1 = z;
        }
        else if((v & 0x180) == 0) {
            z1 = z;
            v2 |= (composer1.changed(z1) ? 0x100 : 0x80);
        }
        else {
            z1 = z;
        }
        if((v & 0xC00) == 0) {
            v2 |= ((v1 & 8) != 0 || !composer1.changed(sliderColors0) ? 0x400 : 0x800);
        }
        if((v & 0x6000) == 0) {
            v2 |= ((v1 & 16) != 0 || !composer1.changedInstance(function20) ? 0x2000 : 0x4000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v2 |= (composer1.changed(f) ? 0x100000 : 0x80000);
        }
        if((v1 & 0x80) == 0) {
            f2 = f1;
            if((v & 0xC00000) == 0) {
                v2 |= (composer1.changed(f2) ? 0x800000 : 0x400000);
            }
        }
        else {
            v2 |= 0xC00000;
            f2 = f1;
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((0x6000000 & v) == 0) {
            v2 |= (composer1.changed(this) ? 0x4000000 : 0x2000000);
        }
        if((0x2492493 & v2) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v1 & 4) != 0) {
                    z1 = true;
                }
                if((v1 & 8) == 0) {
                    sliderColors2 = sliderColors0;
                }
                else {
                    sliderColors2 = this.colors(composer1, v2 >> 24 & 14);
                    v2 &= 0xFFFFE3FF;
                }
                if((v1 & 16) == 0) {
                    function22 = function20;
                }
                else {
                    int v4 = ((v2 & 0x1C00 ^ 0xC00) <= 0x800 || !composer1.changed(sliderColors2)) && (v2 & 0xC00) != 0x800 ? 0 : 1;
                    rk rk0 = composer1.rememberedValue();
                    if((v4 | ((v2 & 0x380) == 0x100 ? 1 : 0)) != 0 || rk0 == Composer.Companion.getEmpty()) {
                        rk0 = new rk(1, sliderColors2, z1);
                        composer1.updateRememberedValue(rk0);
                    }
                    function22 = rk0;
                    v2 &= 0xFFFF1FFF;
                }
                function32 = (v1 & 0x20) == 0 ? function30 : pk.w;
                if((v1 & 0x80) != 0) {
                    f2 = 0.0f;
                }
                v3 = v2;
                f5 = (v1 & 0x40) == 0 ? f : 0.0f;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                modifier2 = modifier0;
                v3 = v2;
                sliderColors2 = sliderColors0;
                function22 = function20;
                function32 = function30;
                f5 = f;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xDFB46B7C, v3, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1236)");
            }
            long v5 = sliderColors2.trackColor-WaAFU9c$material3_release(z1, false);
            long v6 = sliderColors2.trackColor-WaAFU9c$material3_release(z1, true);
            long v7 = sliderColors2.tickColor-WaAFU9c$material3_release(z1, false);
            long v8 = sliderColors2.tickColor-WaAFU9c$material3_release(z1, true);
            Modifier modifier3 = RotateKt.rotate(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), 0.0f), (composer1.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl ? 180.0f : 0.0f));
            boolean z3 = composer1.changedInstance(rangeSliderState0);
            boolean z4 = composer1.changed(v5);
            boolean z5 = composer1.changed(v6);
            boolean z6 = composer1.changed(v7);
            boolean z7 = composer1.changed(v8);
            if((v3 & 0xE000 ^ 0x6000) > 0x4000) {
                function23 = function22;
                if(composer1.changed(function23)) {
                    z8 = z1;
                    v9 = v3;
                    v10 = 1;
                }
                else {
                    z8 = z1;
                    v9 = v3;
                    v10 = (v9 & 0x6000) == 0x4000 ? 1 : 0;
                }
            }
            else {
                function23 = function22;
                z8 = z1;
                v9 = v3;
                v10 = (v9 & 0x6000) == 0x4000 ? 1 : 0;
            }
            qk qk0 = composer1.rememberedValue();
            if((((v3 & 0x380000) == 0x100000 ? 1 : 0) | (z3 | z4 | z5 | z6 | z7) | ((v3 & 0x1C00000) == 0x800000 ? 1 : 0) | v10 | ((0x70000 & v9) == 0x20000 ? 1 : 0)) != 0 || qk0 == Composer.Companion.getEmpty()) {
                qk0 = new qk(rangeSliderState0, v5, v6, v7, v8, f5, f2, function23, function32, 0);
                composer1.updateRememberedValue(qk0);
            }
            CanvasKt.Canvas(modifier3, qk0, composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f3 = f2;
            z2 = z8;
            sliderColors1 = sliderColors2;
            function31 = function32;
            function21 = function23;
            f4 = f5;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z2 = z1;
            sliderColors1 = sliderColors0;
            f3 = f2;
            function21 = function20;
            function31 = function30;
            f4 = f;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new bj(this, rangeSliderState0, modifier1, z2, sliderColors1, function21, function31, f4, f3, v, v1, 1));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void Track-4EFweAY(@NotNull SliderState sliderState0, @Nullable Modifier modifier0, boolean z, @Nullable SliderColors sliderColors0, @Nullable Function2 function20, @Nullable Function3 function30, float f, float f1, @Nullable Composer composer0, int v, int v1) {
        float f4;
        Function3 function31;
        Function2 function21;
        float f3;
        SliderColors sliderColors1;
        boolean z2;
        Modifier modifier1;
        int v10;
        int v9;
        boolean z8;
        Function2 function23;
        float f5;
        Function3 function32;
        Function2 function22;
        SliderColors sliderColors2;
        int v3;
        Modifier modifier2;
        float f2;
        boolean z1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x2FAB503);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(sliderState0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            z1 = z;
        }
        else if((v & 0x180) == 0) {
            z1 = z;
            v2 |= (composer1.changed(z1) ? 0x100 : 0x80);
        }
        else {
            z1 = z;
        }
        if((v & 0xC00) == 0) {
            v2 |= ((v1 & 8) != 0 || !composer1.changed(sliderColors0) ? 0x400 : 0x800);
        }
        if((v & 0x6000) == 0) {
            v2 |= ((v1 & 16) != 0 || !composer1.changedInstance(function20) ? 0x2000 : 0x4000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v2 |= (composer1.changed(f) ? 0x100000 : 0x80000);
        }
        if((v1 & 0x80) == 0) {
            f2 = f1;
            if((v & 0xC00000) == 0) {
                v2 |= (composer1.changed(f2) ? 0x800000 : 0x400000);
            }
        }
        else {
            v2 |= 0xC00000;
            f2 = f1;
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((0x6000000 & v) == 0) {
            v2 |= (composer1.changed(this) ? 0x4000000 : 0x2000000);
        }
        if((0x2492493 & v2) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v1 & 4) != 0) {
                    z1 = true;
                }
                if((v1 & 8) == 0) {
                    sliderColors2 = sliderColors0;
                }
                else {
                    sliderColors2 = this.colors(composer1, v2 >> 24 & 14);
                    v2 &= 0xFFFFE3FF;
                }
                if((v1 & 16) == 0) {
                    function22 = function20;
                }
                else {
                    int v4 = ((v2 & 0x1C00 ^ 0xC00) <= 0x800 || !composer1.changed(sliderColors2)) && (v2 & 0xC00) != 0x800 ? 0 : 1;
                    rk rk0 = composer1.rememberedValue();
                    if((v4 | ((v2 & 0x380) == 0x100 ? 1 : 0)) != 0 || rk0 == Composer.Companion.getEmpty()) {
                        rk0 = new rk(0, sliderColors2, z1);
                        composer1.updateRememberedValue(rk0);
                    }
                    function22 = rk0;
                    v2 &= 0xFFFF1FFF;
                }
                function32 = (v1 & 0x20) == 0 ? function30 : sk.w;
                if((v1 & 0x80) != 0) {
                    f2 = 0.0f;
                }
                v3 = v2;
                f5 = (v1 & 0x40) == 0 ? f : 0.0f;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                modifier2 = modifier0;
                v3 = v2;
                sliderColors2 = sliderColors0;
                function22 = function20;
                function32 = function30;
                f5 = f;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x2FAB503, v3, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1128)");
            }
            long v5 = sliderColors2.trackColor-WaAFU9c$material3_release(z1, false);
            long v6 = sliderColors2.trackColor-WaAFU9c$material3_release(z1, true);
            long v7 = sliderColors2.tickColor-WaAFU9c$material3_release(z1, false);
            long v8 = sliderColors2.tickColor-WaAFU9c$material3_release(z1, true);
            Modifier modifier3 = RotateKt.rotate(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), 0.0f), (composer1.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl ? 180.0f : 0.0f));
            boolean z3 = composer1.changedInstance(sliderState0);
            boolean z4 = composer1.changed(v5);
            boolean z5 = composer1.changed(v6);
            boolean z6 = composer1.changed(v7);
            boolean z7 = composer1.changed(v8);
            if((v3 & 0xE000 ^ 0x6000) > 0x4000) {
                function23 = function22;
                if(composer1.changed(function23)) {
                    z8 = z1;
                    v9 = v3;
                    v10 = 1;
                }
                else {
                    z8 = z1;
                    v9 = v3;
                    v10 = (v9 & 0x6000) == 0x4000 ? 1 : 0;
                }
            }
            else {
                function23 = function22;
                z8 = z1;
                v9 = v3;
                v10 = (v9 & 0x6000) == 0x4000 ? 1 : 0;
            }
            qk qk0 = composer1.rememberedValue();
            if((((v3 & 0x380000) == 0x100000 ? 1 : 0) | (z3 | z4 | z5 | z6 | z7) | ((v3 & 0x1C00000) == 0x800000 ? 1 : 0) | v10 | ((0x70000 & v9) == 0x20000 ? 1 : 0)) != 0 || qk0 == Composer.Companion.getEmpty()) {
                qk0 = new qk(sliderState0, v5, v6, v7, v8, f5, f2, function23, function32, 1);
                composer1.updateRememberedValue(qk0);
            }
            CanvasKt.Canvas(modifier3, qk0, composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f3 = f2;
            z2 = z8;
            sliderColors1 = sliderColors2;
            function31 = function32;
            function21 = function23;
            f4 = f5;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z2 = z1;
            sliderColors1 = sliderColors0;
            f3 = f2;
            function21 = function20;
            function31 = function30;
            f4 = f;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new bj(this, sliderState0, modifier1, z2, sliderColors1, function21, function31, f4, f3, v, v1, 2));
        }
    }

    public static void a(DrawScope drawScope0, long v, long v1, long v2, float f, float f1) {
        long v3 = CornerRadiusKt.CornerRadius(f, f);
        long v4 = CornerRadiusKt.CornerRadius(f1, f1);
        RoundRect roundRect0 = RoundRectKt.RoundRect-ZAM2FJo(RectKt.Rect-tz77jQw(OffsetKt.Offset(Offset.getX-impl(v), 0.0f), androidx.compose.ui.geometry.SizeKt.Size(Size.getWidth-impl(v1), Size.getHeight-impl(v1))), v3, v4, v4, v3);
        Path.addRoundRect$default(SliderDefaults.c, roundRect0, null, 2, null);
        DrawScope.drawPath-LG529CI$default(drawScope0, SliderDefaults.c, v2, 0.0f, null, null, 0, 60, null);
        SliderDefaults.c.rewind();
    }

    public static final void access$drawStopIndicator-x3O1jOs(SliderDefaults sliderDefaults0, DrawScope drawScope0, long v, float f, long v1) {
        sliderDefaults0.getClass();
        DrawScope.drawCircle-VaOC9Bg$default(drawScope0, v1, drawScope0.toPx-0680j_4(f) / 2.0f, v, 0.0f, null, null, 0, 120, null);
    }

    public static final void access$drawTrack-ngJ0SCU(SliderDefaults sliderDefaults0, DrawScope drawScope0, float[] arr_f, float f, float f1, long v, long v1, long v2, long v3, float f2, float f3, float f4, float f5, float f6, Function2 function20, Function3 function30, boolean z) {
        float f13;
        float f12;
        sliderDefaults0.getClass();
        long v4 = OffsetKt.Offset(0.0f, Offset.getY-impl(drawScope0.getCenter-F1C5BW0()));
        long v5 = OffsetKt.Offset(Size.getWidth-impl(drawScope0.getSize-NH-jbRc()), Offset.getY-impl(drawScope0.getCenter-F1C5BW0()));
        float f7 = drawScope0.toPx-0680j_4(f2);
        long v6 = OffsetKt.Offset((Offset.getX-impl(v5) - Offset.getX-impl(v4)) * f1 + Offset.getX-impl(v4), Offset.getY-impl(drawScope0.getCenter-F1C5BW0()));
        long v7 = OffsetKt.Offset((Offset.getX-impl(v5) - Offset.getX-impl(v4)) * f + Offset.getX-impl(v4), Offset.getY-impl(drawScope0.getCenter-F1C5BW0()));
        float f8 = drawScope0.toPx-0680j_4(f6);
        if(Dp.compareTo-0680j_4(f5, 0.0f) > 0) {
            float f9 = drawScope0.toPx-0680j_4(f3);
            float f10 = drawScope0.toPx-0680j_4(f5);
            float f11 = drawScope0.toPx-0680j_4(f4);
            f12 = drawScope0.toPx-0680j_4(f5) + f11 / 2.0f;
            f13 = f10 + f9 / 2.0f;
        }
        else {
            f12 = 0.0f;
            f13 = 0.0f;
        }
        if(z && Offset.getX-impl(v7) > Offset.getX-impl(v4) + f13 + f7 / 2.0f) {
            float f14 = Offset.getX-impl(v4);
            SliderDefaults.a(drawScope0, 0L, androidx.compose.ui.geometry.SizeKt.Size(Offset.getX-impl(v7) - f13 - f14, f7), v, f7 / 2.0f, f8);
            if(function20 != null) {
                function20.invoke(drawScope0, Offset.box-impl(OffsetKt.Offset(f14 + f7 / 2.0f, Offset.getY-impl(drawScope0.getCenter-F1C5BW0()))));
            }
        }
        if(Offset.getX-impl(v6) < Offset.getX-impl(v5) - f12 - f7 / 2.0f) {
            float f15 = Offset.getX-impl(v6) + f12;
            float f16 = Offset.getX-impl(v5);
            SliderDefaults.a(drawScope0, OffsetKt.Offset(f15, 0.0f), androidx.compose.ui.geometry.SizeKt.Size(f16 - f15, f7), v, f8, f7 / 2.0f);
            if(function20 != null) {
                function20.invoke(drawScope0, Offset.box-impl(OffsetKt.Offset(f16 - f7 / 2.0f, Offset.getY-impl(drawScope0.getCenter-F1C5BW0()))));
            }
        }
        float f17 = z ? Offset.getX-impl(v7) + f13 : 0.0f;
        float f18 = z ? f8 : f7 / 2.0f;
        float f19 = Offset.getX-impl(v6) - f12 - f17;
        if(f19 > f18) {
            SliderDefaults.a(drawScope0, OffsetKt.Offset(f17, 0.0f), androidx.compose.ui.geometry.SizeKt.Size(f19, f7), v1, f18, f8);
        }
        long v8 = OffsetKt.Offset(Offset.getX-impl(v4) + f7 / 2.0f, Offset.getY-impl(v4));
        long v9 = OffsetKt.Offset(Offset.getX-impl(v5) - f7 / 2.0f, Offset.getY-impl(v5));
        ClosedFloatingPointRange closedFloatingPointRange0 = e.rangeTo(Offset.getX-impl(v7) - f13, Offset.getX-impl(v7) + f13);
        ClosedFloatingPointRange closedFloatingPointRange1 = e.rangeTo(Offset.getX-impl(v6) - f12, Offset.getX-impl(v6) + f12);
        int v10 = 0;
        for(int v11 = 0; v10 < arr_f.length; ++v11) {
            float f20 = arr_f[v10];
            boolean z1 = true;
            if(function20 == null || (!z || v11 != 0) && v11 != arr_f.length - 1) {
                if(f20 <= f1 && f20 >= f) {
                    z1 = false;
                }
                long v12 = OffsetKt.Offset(Offset.getX-impl(OffsetKt.lerp-Wko1d7g(v8, v9, f20)), Offset.getY-impl(drawScope0.getCenter-F1C5BW0()));
                if((!z || !closedFloatingPointRange0.contains(Offset.getX-impl(v12))) && !closedFloatingPointRange1.contains(Offset.getX-impl(v12))) {
                    function30.invoke(drawScope0, Offset.box-impl(v12), Color.box-impl((z1 ? v2 : v3)));
                }
            }
            ++v10;
        }
    }

    @Composable
    @NotNull
    public final SliderColors colors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x52089C20, v, -1, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:845)");
        }
        SliderColors sliderColors0 = this.getDefaultSliderColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return sliderColors0;
    }

    // 去混淆评级： 低(36)
    @Composable
    @NotNull
    public final SliderColors colors-q0g_0yA(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, @Nullable Composer composer0, int v10, int v11, int v12) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x34C9025E, v10, v11, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:887)");
        }
        SliderColors sliderColors0 = this.getDefaultSliderColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer0, 6)).copy--K518z4(((v12 & 1) == 0 ? v : 0L), ((v12 & 2) == 0 ? v1 : 0L), ((v12 & 4) == 0 ? v2 : 0L), ((v12 & 8) == 0 ? v3 : 0L), ((v12 & 16) == 0 ? v4 : 0L), ((v12 & 0x20) == 0 ? v5 : 0L), ((v12 & 0x40) == 0 ? v6 : 0L), ((v12 & 0x80) == 0 ? v7 : 0L), ((v12 & 0x100) == 0 ? v8 : 0L), ((v12 & 0x200) == 0 ? v9 : 0L));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return sliderColors0;
    }

    // 去混淆评级： 低(20)
    @NotNull
    public final SliderColors getDefaultSliderColors$material3_release(@NotNull ColorScheme colorScheme0) {
        SliderColors sliderColors0 = colorScheme0.getDefaultSliderColorsCached$material3_release();
        if(sliderColors0 == null) {
            sliderColors0 = new SliderColors(ColorSchemeKt.fromToken(colorScheme0, SliderTokens.INSTANCE.getHandleColor()), ColorSchemeKt.fromToken(colorScheme0, SliderTokens.INSTANCE.getActiveTrackColor()), ColorSchemeKt.fromToken(colorScheme0, SliderTokens.INSTANCE.getInactiveTrackColor()), ColorSchemeKt.fromToken(colorScheme0, SliderTokens.INSTANCE.getInactiveTrackColor()), ColorSchemeKt.fromToken(colorScheme0, SliderTokens.INSTANCE.getActiveTrackColor()), ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, SliderTokens.INSTANCE.getDisabledHandleColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme0.getSurface-0d7_KjU()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, SliderTokens.INSTANCE.getDisabledActiveTrackColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, SliderTokens.INSTANCE.getDisabledInactiveTrackColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, SliderTokens.INSTANCE.getDisabledInactiveTrackColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, SliderTokens.INSTANCE.getDisabledActiveTrackColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme0.setDefaultSliderColorsCached$material3_release(sliderColors0);
        }
        return sliderColors0;
    }

    public final float getTickSize-D9Ej5fM() [...] // 潜在的解密器

    public final float getTrackStopIndicatorSize-D9Ej5fM() [...] // 潜在的解密器
}

