package com.kakao.tistory.presentation.view;

import a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.drawable;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSplashActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplashActivity.kt\ncom/kakao/tistory/presentation/view/SplashActivityKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,258:1\n71#2:259\n68#2,6:260\n74#2:294\n78#2:301\n78#3,6:266\n85#3,4:281\n89#3,2:291\n93#3:300\n368#4,9:272\n377#4:293\n378#4,2:298\n4032#5,6:285\n148#6:295\n148#6:296\n148#6:297\n*S KotlinDebug\n*F\n+ 1 SplashActivity.kt\ncom/kakao/tistory/presentation/view/SplashActivityKt\n*L\n236#1:259\n236#1:260,6\n236#1:294\n236#1:301\n236#1:266,6\n236#1:281,4\n236#1:291,2\n236#1:300\n236#1:272,9\n236#1:293\n236#1:298,2\n236#1:285,6\n243#1:295\n252#1:296\n253#1:297\n*E\n"})
public final class SplashActivityKt {
    public static final void access$TistorySplash(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xD2BF15FE);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xD2BF15FE, v, -1, "com.kakao.tistory.presentation.view.TistorySplash (SplashActivity.kt:234)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = BackgroundKt.background-bw27NRU$default(SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null), ColorResources_androidKt.colorResource(color.point1, composer1, 0), null, 2, null);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
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
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
                d.a(v1, composer1, v1, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            Modifier modifier2 = SizeKt.size-3ABfNKs(modifier$Companion0, 288.0f);
            Modifier modifier3 = BoxScopeInstance.INSTANCE.align(modifier2, alignment$Companion0.getCenter());
            ImageKt.Image(PainterResources_androidKt.painterResource(drawable.ic_img_applogo_splash, composer1, 0), null, modifier3, null, null, 0.0f, null, composer1, 56, 120);
            Modifier modifier4 = SizeKt.size-VpY3zN4(PaddingKt.padding-qDBjuR0$default(BoxScopeInstance.INSTANCE.align(modifier$Companion0, alignment$Companion0.getBottomCenter()), 0.0f, 0.0f, 0.0f, 60.0f, 7, null), 200.0f, 80.0f);
            ImageKt.Image(PainterResources_androidKt.painterResource(drawable.ic_img_wordmark_splash, composer1, 0), null, modifier4, null, null, 0.0f, null, composer1, 56, 120);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new r(v));
        }
    }
}

