package t9;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.room.a;
import com.kakao.kandinsky.base.ui.KDAsyncImageKt;
import com.kakao.kandinsky.core.kdphoto.Border;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ImmutableList;

public final class c extends Lambda implements Function4 {
    public final String w;
    public final ImmutableList x;

    public c(String s, ImmutableList immutableList0) {
        this.w = s;
        this.x = immutableList0;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        boolean z = ((Boolean)object0).booleanValue();
        int v = ((Number)object1).intValue();
        Composer composer0 = (Composer)object2;
        int v1 = ((Number)object3).intValue();
        int v2 = (v1 & 14) == 0 ? (composer0.changed(z) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer0.changed(v) ? 0x20 : 16);
        }
        if((v2 & 731) == 0x92 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x5441953A, v2, -1, "com.kakao.kandinsky.border.BorderList.<anonymous> (BorderScreen.kt:116)");
        }
        if(v == 0) {
            composer0.startReplaceGroup(0xD1504E00);
            Modifier modifier0 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            KDAsyncImageKt.AsyncImage(this.w, false, null, modifier0, null, ContentScale.Companion.getCrop(), composer0, 200064, 18);
            composer0.endReplaceGroup();
            goto label_48;
        }
        else {
            composer0.startReplaceGroup(0xD1504EB7);
            Border border0 = (Border)CollectionsKt___CollectionsKt.getOrNull(this.x, v - 1);
            if(border0 == null) {
                composer0.endReplaceGroup();
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return Unit.INSTANCE;
                }
            }
            else {
                Companion modifier$Companion0 = Modifier.Companion;
                MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
                CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
                Modifier modifier1 = ComposedModifierKt.materializeModifier(composer0, modifier$Companion0);
                androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
                Function0 function00 = composeUiNode$Companion0.getConstructor();
                if(composer0.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer0.startReusableNode();
                if(composer0.getInserting()) {
                    composer0.createNode(function00);
                }
                else {
                    composer0.useNode();
                }
                Function2 function20 = a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
                if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v3)) {
                    a.t(v3, composer0, v3, function20);
                }
                Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
                Modifier modifier2 = SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null);
                KDAsyncImageKt.AsyncImage(this.w, false, null, modifier2, null, ContentScale.Companion.getCrop(), composer0, 200064, 18);
                ImageKt.Image(PainterResources_androidKt.painterResource(border0.getIconLeftTop(), composer0, 0), null, SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null), null, ContentScale.Companion.getCrop(), 0.0f, null, composer0, 25016, 104);
                composer0.endNode();
                composer0.endReplaceGroup();
            label_48:
                if(z) {
                    BoxKt.Box(BackgroundKt.background-bw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer0, MaterialTheme.$stable).getScrim-0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer0, 0);
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }
        return Unit.INSTANCE;
    }
}

