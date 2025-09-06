package com.kakao.kandinsky.decoration;

import aa.e0;
import aa.f0;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment.Companion;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import com.kakao.kandinsky.core.kdphoto.TextData;
import com.kakao.kandinsky.designsystem.util.DpExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\'\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Text", "", "textData", "Lcom/kakao/kandinsky/core/kdphoto/TextData;", "scale", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/kakao/kandinsky/core/kdphoto/TextData;FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "decoration_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Text.kt\ncom/kakao/kandinsky/decoration/TextKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,35:1\n1223#2,6:36\n71#3:42\n69#3,5:43\n74#3:76\n78#3:80\n78#4,6:48\n85#4,4:63\n89#4,2:73\n93#4:79\n368#5,9:54\n377#5:75\n378#5,2:77\n4032#6,6:67\n*S KotlinDebug\n*F\n+ 1 Text.kt\ncom/kakao/kandinsky/decoration/TextKt\n*L\n22#1:36,6\n18#1:42\n18#1:43,5\n18#1:76\n18#1:80\n18#1:48,6\n18#1:63,4\n18#1:73,2\n18#1:79\n18#1:54,9\n18#1:75\n18#1:77,2\n18#1:67,6\n*E\n"})
public final class TextKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Text(@NotNull TextData textData0, float f, @Nullable Modifier modifier0, @Nullable Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Intrinsics.checkNotNullParameter(textData0, "textData");
        Composer composer1 = composer0.startRestartGroup(0xF20F94B0);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(textData0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(f) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v & 0x380) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 4) == 0 ? modifier1 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF20F94B0, v2, -1, "com.kakao.kandinsky.decoration.Text (Text.kt:16)");
            }
            Companion alignment$Companion0 = Alignment.Companion;
            boolean z = true;
            Modifier modifier3 = SizeKt.size-6HolHcs(SizeKt.wrapContentSize(modifier2, alignment$Companion0.getTopStart(), true), DpExtensionKt.toDpSize-Pq9zytI(textData0.getBoundsSize-NH-jbRc(), composer1, 0));
            composer1.startReplaceGroup(0x96FB4A2D);
            if((v2 & 0x70) != 0x20) {
                z = false;
            }
            e0 e00 = composer1.rememberedValue();
            if(z || e00 == Composer.Companion.getEmpty()) {
                e00 = new e0(f, 0);
                composer1.updateRememberedValue(e00);
            }
            composer1.endReplaceGroup();
            Modifier modifier4 = BackgroundKt.background-bw27NRU$default(GraphicsLayerModifierKt.graphicsLayer(modifier3, e00), textData0.getBackgroundWithAlpha-0d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getCenter(), false);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function00);
            }
            else {
                composer1.useNode();
            }
            Function2 function20 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                a.t(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
            BasicTextKt.BasicText-VhcvRP8(textData0.getText(), null, textData0.getTextStyle(composer1, v2 & 14), null, 0, false, 0, 0, null, composer1, 0, 506);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f0(textData0, f, modifier1, v, v1, 0));
        }
    }
}

