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
import androidx.compose.material3.sf;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment.Companion;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.room.a;
import ca.h;
import ca.k0;
import ca.z;
import com.kakao.kandinsky.base.ui.KDAsyncImageKt;
import com.kakao.kandinsky.designsystem.theme.ThemeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ra.p;
import ra.q;

@Metadata(d1 = {"\u0000*\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001AV\u0010\r\u001A\u00020\t2\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001A\u00020\u00032!\u0010\n\u001A\u001D\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00052\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\t0\u000BH\u0007¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"", "Lcom/kakao/kandinsky/selector/SelectorImageDate;", "imageList", "", "selectedIndex", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "", "onSelect", "Lkotlin/Function0;", "onDismiss", "SingleImageSelector", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "selector_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSingleImageSelector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleImageSelector.kt\ncom/kakao/kandinsky/selector/SingleImageSelectorKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,134:1\n148#2:135\n148#2:172\n148#2:213\n71#3:136\n68#3,6:137\n74#3:171\n78#3:176\n71#3:177\n68#3,6:178\n74#3:212\n78#3:217\n78#4,6:143\n85#4,4:158\n89#4,2:168\n93#4:175\n78#4,6:184\n85#4,4:199\n89#4,2:209\n93#4:216\n368#5,9:149\n377#5:170\n378#5,2:173\n368#5,9:190\n377#5:211\n378#5,2:214\n4032#6,6:162\n4032#6,6:203\n*S KotlinDebug\n*F\n+ 1 SingleImageSelector.kt\ncom/kakao/kandinsky/selector/SingleImageSelectorKt\n*L\n73#1:135\n79#1:172\n126#1:213\n71#1:136\n71#1:137,6\n71#1:171\n71#1:176\n99#1:177\n99#1:178,6\n99#1:212\n99#1:217\n71#1:143,6\n71#1:158,4\n71#1:168,2\n71#1:175\n99#1:184,6\n99#1:199,4\n99#1:209,2\n99#1:216\n71#1:149,9\n71#1:170\n71#1:173,2\n99#1:190,9\n99#1:211\n99#1:214,2\n71#1:162,6\n99#1:203,6\n*E\n"})
public final class SingleImageSelectorKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void SingleImageSelector(@NotNull List list0, int v, @NotNull Function1 function10, @NotNull Function0 function00, @Nullable Composer composer0, int v1) {
        Intrinsics.checkNotNullParameter(list0, "imageList");
        Intrinsics.checkNotNullParameter(function10, "onSelect");
        Intrinsics.checkNotNullParameter(function00, "onDismiss");
        Composer composer1 = composer0.startRestartGroup(0xE5F801BD);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE5F801BD, v1, -1, "com.kakao.kandinsky.selector.SingleImageSelector (SingleImageSelector.kt:32)");
        }
        SelectorBottomSheetKt.SelectorBottomSheet(function00, ComposableSingletons.SingleImageSelectorKt.INSTANCE.getLambda-2$selector_release(), ComposableLambdaKt.rememberComposableLambda(0xE4050FE3, true, new p(list0, function10, v), composer1, 54), null, composer1, v1 >> 9 & 14 | 0x1B0, 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new sf(list0, v, function10, function00, v1));
        }
    }

    public static final void access$ImageItem(Modifier modifier0, String s, boolean z, boolean z1, Composer composer0, int v, int v1) {
        Modifier modifier1;
        BoxScopeInstance boxScopeInstance1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x1B5DB695);
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
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        if((v2 & 5851) != 1170 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x1B5DB695, v2, -1, "com.kakao.kandinsky.selector.ImageItem (SingleImageSelector.kt:97)");
            }
            Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
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
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            Modifier modifier4 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
            modifier1 = modifier2;
            KDAsyncImageKt.AsyncImage(s, false, null, modifier4, null, ContentScale.Companion.getCrop(), composer1, v2 >> 3 & 14 | 200064, 18);
            composer1.startReplaceGroup(0xE3B992CA);
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            if(z) {
                BoxKt.Box(BackgroundKt.background-bw27NRU$default(SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer1, 0);
                Modifier modifier5 = boxScopeInstance0.align(modifier$Companion0, alignment$Companion0.getCenter());
                boxScopeInstance1 = boxScopeInstance0;
                IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(drawable.icon_action_check_color_white, composer1, 0), null, modifier5, 0L, composer1, 0xC38, 0);
            }
            else {
                boxScopeInstance1 = boxScopeInstance0;
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(0xB02B16);
            if(z1) {
                Modifier modifier6 = PaddingKt.padding-3ABfNKs(boxScopeInstance1.align(modifier$Companion0, alignment$Companion0.getBottomEnd()), 7.0f);
                IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(drawable.icon_edited_notice_dot, composer1, 0), null, modifier6, 0L, composer1, 0xC38, 0);
            }
            if(a.x(composer1)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new z(modifier1, s, z, z1, v, v1));
        }
    }

    public static final void access$PreviewSingleImageSelector(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x41C34FCF);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x41C34FCF, v, -1, "com.kakao.kandinsky.selector.PreviewSingleImageSelector (SingleImageSelector.kt:25)");
            }
            ThemeKt.KandinskyTheme(ComposableSingletons.SingleImageSelectorKt.INSTANCE.getLambda-1$selector_release(), composer1, 6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h(v, 12));
        }
    }

    public static final void access$TopBar(Function0 function00, Composer composer0, int v, int v1) {
        Function0 function01;
        int v2;
        Composer composer1 = composer0.startRestartGroup(1946600603);
        if((v1 & 1) != 0) {
            v2 = v | 6;
            function01 = function00;
        }
        else if((v & 14) == 0) {
            function01 = function00;
            v2 = (composer1.changedInstance(function01) ? 4 : 2) | v;
        }
        else {
            function01 = function00;
            v2 = v;
        }
        if((v2 & 11) != 2 || !composer1.getSkipping()) {
            Function0 function02 = (v1 & 1) == 0 ? function01 : q.w;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1946600603, v2, -1, "com.kakao.kandinsky.selector.TopBar (SingleImageSelector.kt:69)");
            }
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = SizeKt.fillMaxWidth$default(SizeKt.height-3ABfNKs(modifier$Companion0, 50.0f), 0.0f, 1, null);
            Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                a.t(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            ButtonKt.TextButton(function02, PaddingKt.padding-qDBjuR0$default(BoxScopeInstance.INSTANCE.align(modifier$Companion0, alignment$Companion0.getCenterStart()), 6.0f, 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, null, null, null, ComposableSingletons.SingleImageSelectorKt.INSTANCE.getLambda-3$selector_release(), composer1, v2 & 14 | 0x30000000, 508);
            Modifier modifier2 = BoxScopeInstance.INSTANCE.align(modifier$Companion0, alignment$Companion0.getCenter());
            TextStyle textStyle0 = MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getHeadlineLarge();
            long v4 = MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getInverseOnSurface-0d7_KjU();
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(string.single_selector_title, composer1, 0), modifier2, v4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle0, composer1, 0, 0, 0xFFF8);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function01 = function02;
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k0(v, v1, 1, function01));
        }
    }
}

