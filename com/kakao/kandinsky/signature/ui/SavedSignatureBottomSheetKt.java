package com.kakao.kandinsky.signature.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.room.a;
import ca.h;
import ca.k0;
import com.kakao.kandinsky.base.ui.KDAsyncImageKt;
import com.kakao.kandinsky.core.kdphoto.Signature.Image;
import com.kakao.kandinsky.core.kdphoto.Signature.Text;
import com.kakao.kandinsky.designsystem.common.KDButtonKt;
import com.kakao.kandinsky.designsystem.theme.Orientation;
import com.kakao.kandinsky.designsystem.theme.OrientationKt;
import com.kakao.kandinsky.designsystem.theme.ThemeKt;
import com.kakao.kandinsky.signature.R.string;
import f0.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import va.e;
import va.f;
import va.g;
import va.j;
import va.k;
import va.l;
import va.m;
import va.n;
import va.o;
import va.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\u001AY\u0010\n\u001A\u00020\u00042\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"", "Lcom/kakao/kandinsky/core/kdphoto/Signature;", "histories", "Lkotlin/Function1;", "", "onSelect", "", "onClickDelete", "", "onDismiss", "SavedSignatureBottomSheet", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "signature_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSavedSignatureBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedSignatureBottomSheet.kt\ncom/kakao/kandinsky/signature/ui/SavedSignatureBottomSheetKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,252:1\n488#2:253\n487#2,4:254\n491#2,2:261\n495#2:267\n1223#3,3:258\n1226#3,3:264\n487#4:263\n77#5:268\n77#5:269\n148#6:270\n148#6:271\n148#6:308\n148#6:313\n148#6:314\n148#6:350\n148#6:351\n148#6:352\n148#6:353\n148#6:354\n148#6:394\n148#6:399\n148#6:400\n71#7:272\n68#7,6:273\n74#7:307\n78#7:312\n71#7:315\n69#7,5:316\n74#7:349\n71#7:355\n69#7,5:356\n74#7:389\n78#7:393\n78#7:398\n78#8,6:279\n85#8,4:294\n89#8,2:304\n93#8:311\n78#8,6:321\n85#8,4:336\n89#8,2:346\n78#8,6:361\n85#8,4:376\n89#8,2:386\n93#8:392\n93#8:397\n368#9,9:285\n377#9:306\n378#9,2:309\n368#9,9:327\n377#9:348\n368#9,9:367\n377#9:388\n378#9,2:390\n378#9,2:395\n4032#10,6:298\n4032#10,6:340\n4032#10,6:380\n*S KotlinDebug\n*F\n+ 1 SavedSignatureBottomSheet.kt\ncom/kakao/kandinsky/signature/ui/SavedSignatureBottomSheetKt\n*L\n58#1:253\n58#1:254,4\n58#1:261,2\n58#1:267\n58#1:258,3\n58#1:264,3\n58#1:263\n70#1:268\n72#1:269\n77#1:270\n124#1:271\n130#1:308\n153#1:313\n155#1:314\n165#1:350\n166#1:351\n168#1:352\n170#1:353\n172#1:354\n185#1:394\n203#1:399\n216#1:400\n122#1:272\n122#1:273,6\n122#1:307\n122#1:312\n151#1:315\n151#1:316,5\n151#1:349\n162#1:355\n162#1:356,5\n162#1:389\n162#1:393\n151#1:398\n122#1:279,6\n122#1:294,4\n122#1:304,2\n122#1:311\n151#1:321,6\n151#1:336,4\n151#1:346,2\n162#1:361,6\n162#1:376,4\n162#1:386,2\n162#1:392\n151#1:397\n122#1:285,9\n122#1:306\n122#1:309,2\n151#1:327,9\n151#1:348\n162#1:367,9\n162#1:388\n162#1:390,2\n151#1:395,2\n122#1:298,6\n151#1:340,6\n162#1:380,6\n*E\n"})
public final class SavedSignatureBottomSheetKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void SavedSignatureBottomSheet(@NotNull List list0, @NotNull Function1 function10, @NotNull Function1 function11, @NotNull Function1 function12, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(list0, "histories");
        Intrinsics.checkNotNullParameter(function10, "onSelect");
        Intrinsics.checkNotNullParameter(function11, "onClickDelete");
        Intrinsics.checkNotNullParameter(function12, "onDismiss");
        Composer composer1 = composer0.startRestartGroup(0xFDF371B1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xFDF371B1, v, -1, "com.kakao.kandinsky.signature.ui.SavedSignatureBottomSheet (SavedSignatureBottomSheet.kt:56)");
        }
        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
        if(compositionScopedCoroutineScopeCanceller0 == Composer.Companion.getEmpty()) {
            compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
        }
        CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
        SheetState sheetState0 = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composer1, 6, 2);
        LazyGridState lazyGridState0 = LazyGridStateKt.rememberLazyGridState(0, 0, composer1, 0, 3);
        int v1 = composer1.consume(OrientationKt.getLocalOrientation()) == Orientation.Portrait ? 1 : 2;
        composer1.startMovableGroup(0x573076A8, composer1.consume(OrientationKt.getLocalOrientation()));
        long v2 = MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getScrim-0d7_KjU();
        long v3 = MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getInverseSurface-0d7_KjU();
        RoundedCornerShape roundedCornerShape0 = RoundedCornerShapeKt.RoundedCornerShape-a9UjIt4$default(12.0f, 12.0f, 0.0f, 0.0f, 12, null);
        f f0 = new f(coroutineScope0, sheetState0, function12, 0);
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0x221977B, true, new j(v1, lazyGridState0, coroutineScope0, sheetState0, function12, list0, function11, function10), composer1, 54);
        ModalBottomSheetKt.ModalBottomSheet-dYc4hso(f0, null, sheetState0, 0.0f, roundedCornerShape0, v3, 0L, 0.0f, v2, null, g.w, null, composableLambda0, composer1, 0x30000000, 0x180, 2250);
        composer1.endMovableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new aa.g(list0, function10, function11, function12, v));
        }
    }

    public static final void access$ImageType(Image signature$Image0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xE9AD40F3);
        int v1 = (v & 14) == 0 ? (composer1.changed(signature$Image0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE9AD40F3, v1, -1, "com.kakao.kandinsky.signature.ui.ImageType (SavedSignatureBottomSheet.kt:198)");
            }
            KDAsyncImageKt.AsyncImage(signature$Image0.getUri(), false, null, SizeKt.fillMaxSize$default(PaddingKt.padding-VpY3zN4(AlphaKt.alpha(Modifier.Companion, signature$Image0.getAlpha() / 100.0f), 50.0f, 30.0f), 0.0f, 1, null), null, ContentScale.Companion.getFit(), composer1, 0x30180, 18);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new e(signature$Image0, v));
        }
    }

    public static final void access$PreviewSavedSignatureBottomSheet(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x2820AE98);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x2820AE98, v, -1, "com.kakao.kandinsky.signature.ui.PreviewSavedSignatureBottomSheet (SavedSignatureBottomSheet.kt:43)");
            }
            ThemeKt.KandinskyTheme(ComposableSingletons.SavedSignatureBottomSheetKt.INSTANCE.getLambda-1$signature_release(), composer1, 6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h(v, 13));
        }
    }

    public static final void access$SavedSignatureBottomSheet$dismiss(CoroutineScope coroutineScope0, SheetState sheetState0, Function1 function10, boolean z) {
        BuildersKt.launch$default(coroutineScope0, null, null, new k(sheetState0, null), 3, null).invokeOnCompletion(new q(sheetState0, function10, z));
    }

    public static final void access$SignatureContainer(String s, Function0 function00, Function0 function01, Function2 function20, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xC79FA39F);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changedInstance(function01) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x800 : 0x400);
        }
        if((v1 & 5851) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xC79FA39F, v1, -1, "com.kakao.kandinsky.signature.ui.SignatureContainer (SavedSignatureBottomSheet.kt:149)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = ClickableKt.clickable-XHw0xAI$default(ClipKt.clip(SizeKt.fillMaxWidth$default(SizeKt.height-3ABfNKs(modifier$Companion0, 150.0f), 0.0f, 1, null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(8.0f)), false, null, null, function00, 7, null);
            MaterialTheme materialTheme0 = MaterialTheme.INSTANCE;
            int v2 = MaterialTheme.$stable;
            Modifier modifier1 = BackgroundKt.background-bw27NRU$default(modifier0, materialTheme0.getColorScheme(composer1, v2).getTertiaryContainer-0d7_KjU(), null, 2, null);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getCenter(), false);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function02 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function02);
            }
            else {
                composer1.useNode();
            }
            Function2 function21 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                a.t(v3, composer1, v3, function21);
            }
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
            function20.invoke(composer1, ((int)(v1 >> 9 & 14)));
            Modifier modifier3 = PaddingKt.padding-VpY3zN4$default(BorderKt.border-xT4_qwU(SizeKt.height-3ABfNKs(PaddingKt.padding-3ABfNKs(boxScopeInstance0.align(modifier$Companion0, alignment$Companion0.getTopStart()), 6.0f), 24.0f), 1.0f, materialTheme0.getColorScheme(composer1, v2).getOnTertiary-0d7_KjU(), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(4.0f)), 6.0f, 0.0f, 2, null);
            MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getCenter(), false);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
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
            Function2 function22 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                a.t(v4, composer1, v4, function22);
            }
            Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
            TextStyle textStyle0 = materialTheme0.getTypography(composer1, v2).getBodySmall();
            TextKt.Text--4IGK_g(s, null, materialTheme0.getColorScheme(composer1, v2).getTertiary-0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle0, composer1, v1 & 14, 0, 0xFFFA);
            composer1.endNode();
            KDButtonKt.KDIconButton(function01, SizeKt.size-3ABfNKs(boxScopeInstance0.align(modifier$Companion0, alignment$Companion0.getTopEnd()), 36.0f), false, null, null, ComposableSingletons.SavedSignatureBottomSheetKt.INSTANCE.getLambda-3$signature_release(), composer1, v1 >> 6 & 14 | 0x30000, 28);
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
            scopeUpdateScope0.updateScope(new aa.g(s, function00, function01, function20, v));
        }
    }

    public static final void access$TextType(Text signature$Text0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-248947015);
        int v1 = (v & 14) == 0 ? (composer1.changed(signature$Text0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-248947015, v1, -1, "com.kakao.kandinsky.signature.ui.TextType (SavedSignatureBottomSheet.kt:211)");
            }
            Modifier modifier0 = PaddingKt.padding-VpY3zN4(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), 50.0f, 30.0f);
            ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0x7F80130F, true, new l(signature$Text0), composer1, 54);
            BoxWithConstraintsKt.BoxWithConstraints(modifier0, Alignment.Companion.getTopStart(), false, composableLambda0, composer1, 0xC36, 4);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new m(signature$Text0, v));
        }
    }

    public static final void access$TopBar(Function0 function00, Composer composer0, int v, int v1) {
        Function0 function01;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x5A0AE895);
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
            Function0 function02 = (v1 & 1) == 0 ? function01 : n.w;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x5A0AE895, v2, -1, "com.kakao.kandinsky.signature.ui.TopBar (SavedSignatureBottomSheet.kt:120)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = SizeKt.fillMaxWidth$default(SizeKt.height-3ABfNKs(modifier$Companion0, 50.0f), 0.0f, 1, null);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
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
            ButtonKt.TextButton(function02, PaddingKt.padding-qDBjuR0$default(BoxScopeInstance.INSTANCE.align(modifier$Companion0, alignment$Companion0.getCenterStart()), 4.0f, 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, null, null, null, ComposableSingletons.SavedSignatureBottomSheetKt.INSTANCE.getLambda-2$signature_release(), composer1, v2 & 14 | 0x30000000, 508);
            Modifier modifier2 = BoxScopeInstance.INSTANCE.align(modifier$Companion0, alignment$Companion0.getCenter());
            String s = StringResources_androidKt.stringResource(string.saved_signature_title, composer1, 0);
            TextStyle textStyle0 = MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getHeadlineLarge();
            TextKt.Text--4IGK_g(s, modifier2, MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getInverseOnSurface-0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle0, composer1, 0, 0, 0xFFF8);
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
            scopeUpdateScope0.updateScope(new k0(v, v1, 2, function01));
        }
    }

    public static final void access$WatermarkType(Text signature$Text0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x129834FE);
        int v1 = (v & 14) == 0 ? (composer1.changed(signature$Text0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x129834FE, v1, -1, "com.kakao.kandinsky.signature.ui.WatermarkType (SavedSignatureBottomSheet.kt:241)");
            }
            BoxWithConstraintsKt.BoxWithConstraints(ClipKt.clipToBounds(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null)), null, false, ComposableLambdaKt.rememberComposableLambda(-988625304, true, new o(signature$Text0), composer1, 54), composer1, 0xC06, 6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new p(signature$Text0, v));
        }
    }
}

