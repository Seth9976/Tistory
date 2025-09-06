package com.google.accompanist.pager;

import androidx.annotation.IntRange;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import ca.x0;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001A\u0017\u0010\u0000\u001A\u00020\u00012\b\b\u0003\u0010\u0002\u001A\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"rememberPagerState", "Lcom/google/accompanist/pager/PagerState;", "initialPage", "", "(ILandroidx/compose/runtime/Composer;II)Lcom/google/accompanist/pager/PagerState;", "pager_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\ncom/google/accompanist/pager/PagerStateKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,390:1\n36#2:391\n1114#3,6:392\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\ncom/google/accompanist/pager/PagerStateKt\n*L\n69#1:391\n69#1:392,6\n*E\n"})
public final class PagerStateKt {
    @Composable
    @Deprecated(message = "\naccompanist/pager is deprecated.\nThe androidx.compose equivalent of rememberPagerState is androidx.compose.foundation.pager.rememberPagerState().\nFor more migration information, please visit https://google.github.io/accompanist/pager/#migration\n", replaceWith = @ReplaceWith(expression = "androidx.compose.foundation.pager.rememberPagerState(initialPage = initialPage)", imports = {"androidx.compose.foundation.pager.rememberPagerState"}))
    @NotNull
    public static final PagerState rememberPagerState(@IntRange(from = 0L) int v, @Nullable Composer composer0, int v1, int v2) {
        composer0.startReplaceableGroup(0x509C4EE5);
        if((v2 & 1) != 0) {
            v = 0;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x509C4EE5, v1, -1, "com.google.accompanist.pager.rememberPagerState (PagerState.kt:66)");
        }
        Saver saver0 = PagerState.Companion.getSaver();
        composer0.startReplaceableGroup(0x44FAF204);
        boolean z = composer0.changed(v);
        x0 x00 = composer0.rememberedValue();
        if(z || x00 == Composer.Companion.getEmpty()) {
            x00 = new x0(v, 1);
            composer0.updateRememberedValue(x00);
        }
        composer0.endReplaceableGroup();
        PagerState pagerState0 = (PagerState)RememberSaveableKt.rememberSaveable(new Object[0], saver0, null, x00, composer0, 72, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return pagerState0;
    }
}

