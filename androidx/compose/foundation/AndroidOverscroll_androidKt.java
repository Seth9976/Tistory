package androidx.compose.foundation;

import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\r\u0010\u0000\u001A\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"rememberOverscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/OverscrollEffect;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidOverscroll_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,875:1\n77#2:876\n77#2:877\n1223#3,6:878\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidOverscroll_androidKt\n*L\n65#1:876\n66#1:877\n68#1:878,6\n*E\n"})
public final class AndroidOverscroll_androidKt {
    @Composable
    @NotNull
    public static final OverscrollEffect rememberOverscrollEffect(@Nullable Composer composer0, int v) {
        OverscrollEffect overscrollEffect0;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA800B56C, v, -1, "androidx.compose.foundation.rememberOverscrollEffect (AndroidOverscroll.android.kt:63)");
        }
        Context context0 = (Context)composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        OverscrollConfiguration overscrollConfiguration0 = (OverscrollConfiguration)composer0.consume(OverscrollConfiguration_androidKt.getLocalOverscrollConfiguration());
        if(overscrollConfiguration0 == null) {
            composer0.startReplaceGroup(1586120933);
            composer0.endReplaceGroup();
            overscrollEffect0 = NoOpOverscrollEffect.INSTANCE;
        }
        else {
            composer0.startReplaceGroup(1586021609);
            boolean z = composer0.changed(context0);
            boolean z1 = composer0.changed(overscrollConfiguration0);
            AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect0 = composer0.rememberedValue();
            if(z || z1 || androidEdgeEffectOverscrollEffect0 == Composer.Companion.getEmpty()) {
                androidEdgeEffectOverscrollEffect0 = new AndroidEdgeEffectOverscrollEffect(context0, overscrollConfiguration0);
                composer0.updateRememberedValue(androidEdgeEffectOverscrollEffect0);
            }
            overscrollEffect0 = androidEdgeEffectOverscrollEffect0;
            composer0.endReplaceGroup();
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return overscrollEffect0;
    }
}

