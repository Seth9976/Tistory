package com.google.accompanist.swiperefresh;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u001A%\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u00012\u0006\u0010\u0006\u001A\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"MaxProgressArc", "", "rememberUpdatedSlingshot", "Lcom/google/accompanist/swiperefresh/Slingshot;", "offsetY", "maxOffsetY", "height", "", "(FFILandroidx/compose/runtime/Composer;I)Lcom/google/accompanist/swiperefresh/Slingshot;", "swiperefresh_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSlingshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slingshot.kt\ncom/google/accompanist/swiperefresh/SlingshotKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,89:1\n25#2:90\n1114#3,6:91\n*S KotlinDebug\n*F\n+ 1 Slingshot.kt\ncom/google/accompanist/swiperefresh/SlingshotKt\n*L\n70#1:90\n70#1:91,6\n*E\n"})
public final class SlingshotKt {
    public static final float MaxProgressArc = 0.8f;

    @Composable
    @NotNull
    public static final Slingshot rememberUpdatedSlingshot(float f, float f1, int v, @Nullable Composer composer0, int v1) {
        composer0.startReplaceableGroup(0x80A24BB5);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x80A24BB5, v1, -1, "com.google.accompanist.swiperefresh.rememberUpdatedSlingshot (Slingshot.kt:40)");
        }
        float f2 = Math.min(1.0f, f / f1);
        float f3 = Math.max(f2 - 0.4f, 0.0f) * 5.0f / 3.0f;
        float f4 = Math.max(0.0f, Math.min(Math.abs(f) - f1, f1 * 2.0f) / f1);
        float f5 = (f4 / 4.0f - ((float)Math.pow(f4 / 4.0f, 2.0))) * 2.0f;
        float f6 = c.coerceAtMost(f3 * 0.8f, 0.8f);
        float f7 = Math.min(1.0f, f3);
        composer0.startReplaceableGroup(0xE2A708A4);
        Slingshot slingshot0 = composer0.rememberedValue();
        if(slingshot0 == Composer.Companion.getEmpty()) {
            slingshot0 = new Slingshot();
            composer0.updateRememberedValue(slingshot0);
        }
        composer0.endReplaceableGroup();
        slingshot0.setOffset(((int)(f1 * f2 + f1 * f5 * 2.0f)));
        slingshot0.setStartTrim(0.0f);
        slingshot0.setEndTrim(f6);
        slingshot0.setRotation((f5 * 2.0f + (0.4f * f3 - 0.25f)) * 0.5f);
        slingshot0.setArrowScale(f7);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return slingshot0;
    }
}

