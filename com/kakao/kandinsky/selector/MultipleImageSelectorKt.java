package com.kakao.kandinsky.selector;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.c3;
import androidx.compose.material3.g5;
import androidx.compose.material3.o9;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.room.a;
import ca.a1;
import com.kakao.kandinsky.base.ui.KDAsyncImageKt;
import com.kakao.kandinsky.designsystem.theme.ThemeKt;
import com.kakao.kdtracker.KDTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ra.f;
import ra.h;
import ra.i;
import ra.j;

@Metadata(d1 = {"\u00000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001Ah\u0010\u000F\u001A\u00020\u000B2\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001A\u00020\u00032\b\u0010\u0006\u001A\u0004\u0018\u00010\u00052\'\u0010\f\u001A#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00030\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000B0\u00072\u000E\b\u0002\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u000B0\rH\u0007¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"", "Lcom/kakao/kandinsky/selector/SelectorImageDate;", "imageList", "", "fixedImageIndex", "", "selectState", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "indexList", "", "onComplete", "Lkotlin/Function0;", "onDismiss", "MultipleImageSelector", "(Ljava/util/List;ILjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "selector_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMultipleImageSelector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipleImageSelector.kt\ncom/kakao/kandinsky/selector/MultipleImageSelectorKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,232:1\n1223#2,6:233\n1223#2,6:318\n148#3:239\n148#3:276\n148#3:277\n148#3:282\n148#3:364\n71#4:240\n68#4,6:241\n74#4:275\n78#4:281\n71#4:283\n69#4,5:284\n74#4:317\n78#4:327\n71#4:328\n68#4,6:329\n74#4:363\n78#4:368\n78#5,6:247\n85#5,4:262\n89#5,2:272\n93#5:280\n78#5,6:289\n85#5,4:304\n89#5,2:314\n93#5:326\n78#5,6:335\n85#5,4:350\n89#5,2:360\n93#5:367\n368#6,9:253\n377#6:274\n378#6,2:278\n368#6,9:295\n377#6:316\n378#6,2:324\n368#6,9:341\n377#6:362\n378#6,2:365\n4032#7,6:266\n4032#7,6:308\n4032#7,6:354\n*S KotlinDebug\n*F\n+ 1 MultipleImageSelector.kt\ncom/kakao/kandinsky/selector/MultipleImageSelectorKt\n*L\n42#1:233,6\n147#1:318,6\n101#1:239\n107#1:276\n127#1:277\n143#1:282\n189#1:364\n99#1:240\n99#1:241,6\n99#1:275\n99#1:281\n141#1:283\n141#1:284,5\n141#1:317\n141#1:327\n170#1:328\n170#1:329,6\n170#1:363\n170#1:368\n99#1:247,6\n99#1:262,4\n99#1:272,2\n99#1:280\n141#1:289,6\n141#1:304,4\n141#1:314,2\n141#1:326\n170#1:335,6\n170#1:350,4\n170#1:360,2\n170#1:367\n99#1:253,9\n99#1:274\n99#1:278,2\n141#1:295,9\n141#1:316\n141#1:324,2\n170#1:341,9\n170#1:362\n170#1:365,2\n99#1:266,6\n141#1:308,6\n170#1:354,6\n*E\n"})
public final class MultipleImageSelectorKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void MultipleImageSelector(@NotNull List list0, int v, @Nullable String s, @NotNull Function1 function10, @Nullable Function0 function00, @Nullable Composer composer0, int v1, int v2) {
        Intrinsics.checkNotNullParameter(list0, "imageList");
        Intrinsics.checkNotNullParameter(function10, "onComplete");
        Composer composer1 = composer0.startRestartGroup(0xF28D8CF0);
        Function0 function01 = (v2 & 16) == 0 ? function00 : f.w;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xF28D8CF0, v1, -1, "com.kakao.kandinsky.selector.MultipleImageSelector (MultipleImageSelector.kt:40)");
        }
        composer1.startReplaceGroup(0x6DE6FFA4);
        SnapshotStateList snapshotStateList0 = composer1.rememberedValue();
        if(snapshotStateList0 == Composer.Companion.getEmpty()) {
            snapshotStateList0 = SnapshotStateKt.mutableStateListOf(new Integer[]{v});
            composer1.updateRememberedValue(snapshotStateList0);
        }
        composer1.endReplaceGroup();
        SelectorBottomSheetKt.SelectorBottomSheet(function01, ComposableLambdaKt.rememberComposableLambda(-661769301, true, new a1(snapshotStateList0, s, 2, function10), composer1, 54), ComposableLambdaKt.rememberComposableLambda(0x75CA4B0A, true, new h(v, snapshotStateList0, s, list0), composer1, 54), ComposableLambdaKt.rememberComposableLambda(0x2F14E667, true, new i(v, snapshotStateList0, s, list0), composer1, 54), composer1, v1 >> 12 & 14 | 0xDB0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g5(list0, v, s, function10, function01, v1, v2));
        }
    }

    public static final void access$BottomBar(boolean z, Function1 function10, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(874163086);
        int v1 = (v & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(874163086, v1, -1, "com.kakao.kandinsky.selector.BottomBar (MultipleImageSelector.kt:139)");
            }
            Modifier modifier0 = SizeKt.fillMaxWidth$default(SizeKt.height-3ABfNKs(Modifier.Companion, 52.0f), 0.0f, 1, null);
            int v2 = 0;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenterStart(), false);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            r0.a.z(composeUiNode$Companion0, composer1, modifier1, composer1, 0xEAED47BE);
            if((v1 & 14) == 4) {
                v2 = 1;
            }
            c3 c30 = composer1.rememberedValue();
            if((((v1 & 0x70) == 0x20 ? 1 : 0) | v2) != 0 || c30 == Composer.Companion.getEmpty()) {
                c30 = new c3(5, z, function10);
                composer1.updateRememberedValue(c30);
            }
            composer1.endReplaceGroup();
            ButtonKt.TextButton(c30, null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(246064337, true, new c(z), composer1, 54), composer1, 0x30000000, 510);
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
            scopeUpdateScope0.updateScope(new eb.i(z, function10, v, 1));
        }
    }

    public static final void access$ImageItem(Modifier modifier0, String s, boolean z, Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x38390A01);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            modifier1 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x38390A01, v2, -1, "com.kakao.kandinsky.selector.ImageItem (MultipleImageSelector.kt:168)");
            }
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            Modifier modifier3 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
            KDAsyncImageKt.AsyncImage(s, false, null, modifier3, null, ContentScale.Companion.getCrop(), composer1, v2 >> 3 & 14 | 200064, 18);
            composer1.startReplaceGroup(0xE3B99BFC);
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            if(z) {
                BoxKt.Box(BackgroundKt.background-bw27NRU$default(SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getOnTertiaryContainer-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer1, 0);
            }
            composer1.endReplaceGroup();
            Modifier modifier4 = PaddingKt.padding-3ABfNKs(boxScopeInstance0.align(modifier$Companion0, alignment$Companion0.getTopEnd()), 8.0f);
            IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource((z ? drawable.icon_check_ok : drawable.icon_check_off), composer1, 0), null, modifier4, 0L, composer1, 0xC38, 0);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o9(modifier1, s, z, v, v1));
        }
    }

    public static final void access$PreviewMultipleImageSelector(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xCFDD185F);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xCFDD185F, v, -1, "com.kakao.kandinsky.selector.PreviewMultipleImageSelector (MultipleImageSelector.kt:27)");
            }
            ThemeKt.KandinskyTheme(ComposableSingletons.MultipleImageSelectorKt.INSTANCE.getLambda-1$selector_release(), composer1, 6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new ca.h(v, 11));
        }
    }

    public static final void access$TopBar(int v, Function0 function00, Function0 function01, Composer composer0, int v1, int v2) {
        Function0 function02;
        int v3;
        Composer composer1 = composer0.startRestartGroup(-947220590);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v3 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            v3 |= (composer1.changedInstance(function01) ? 0x100 : 0x80);
        }
        if((v3 & 731) != 0x92 || !composer1.getSkipping()) {
            function02 = (v2 & 2) == 0 ? function00 : j.w;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-947220590, v3, -1, "com.kakao.kandinsky.selector.TopBar (MultipleImageSelector.kt:97)");
            }
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = SizeKt.fillMaxWidth$default(SizeKt.height-3ABfNKs(modifier$Companion0, 50.0f), 0.0f, 1, null);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function03 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function03);
            }
            else {
                composer1.useNode();
            }
            Function2 function20 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                a.t(v4, composer1, v4, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            ButtonKt.TextButton(function02, PaddingKt.padding-qDBjuR0$default(BoxScopeInstance.INSTANCE.align(modifier$Companion0, alignment$Companion0.getCenterStart()), 6.0f, 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, null, null, null, ComposableSingletons.MultipleImageSelectorKt.INSTANCE.getLambda-2$selector_release(), composer1, v3 >> 3 & 14 | 0x30000000, 508);
            Modifier modifier2 = BoxScopeInstance.INSTANCE.align(modifier$Companion0, alignment$Companion0.getCenter());
            TextStyle textStyle0 = MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getHeadlineLarge();
            long v5 = MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getInverseOnSurface-0d7_KjU();
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(string.multiple_selector_title, composer1, 0), modifier2, v5, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle0, composer1, 0, 0, 0xFFF8);
            ButtonKt.TextButton(function01, PaddingKt.padding-qDBjuR0$default(BoxScopeInstance.INSTANCE.align(modifier$Companion0, alignment$Companion0.getCenterEnd()), 6.0f, 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(0xDE5EFF98, true, new d(v), composer1, 54), composer1, v3 >> 6 & 14 | 0x30000000, 508);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            function02 = function00;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new ca.a(v, function02, function01, v1, v2));
        }
    }

    public static final void access$cancelTrackerClickEvent(String s) {
        KDTracker.clickEvent$default(KDTracker.INSTANCE, "imagelist", "cancel-multi-" + s, null, null, 12, null);
    }

    public static final void access$confirmTrackerClickEvent(String s) {
        KDTracker.clickEvent$default(KDTracker.INSTANCE, "imagelist", a.j("applyall-multi-", s), null, "applyall", 4, null);
    }

    public static final void access$selectAllClickEvent(String s) {
        KDTracker.clickEvent$default(KDTracker.INSTANCE, "imagelist", "selectall-" + s, null, "selectall", 4, null);
    }

    public static final void access$selectImageClickEvent(String s) {
        KDTracker.clickEvent$default(KDTracker.INSTANCE, "imagelist", a.j("selectimage-", s), null, "selectimage", 4, null);
    }
}

