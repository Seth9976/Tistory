package com.kakao.kandinsky.text;

import aa.w;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.room.a;
import com.kakao.kandinsky.base.ConsumeKDEventKt;
import com.kakao.kandinsky.core.kdphoto.TextData;
import com.kakao.kandinsky.designsystem.common.MenuListKt;
import com.kakao.kandinsky.designsystem.common.RotatableScreenKt;
import com.kakao.kandinsky.text.contract.TextMode.Input;
import com.kakao.kandinsky.text.contract.TextMode;
import com.kakao.kandinsky.text.contract.TextUiState;
import com.kakao.kandinsky.textedit.TextEditorKt;
import ea.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w0.i1;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A9\u0010\b\u001A\u00020\u00042\u0006\u0010\u0001\u001A\u00020\u00002\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\f²\u0006\f\u0010\u000B\u001A\u00020\n8\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/kandinsky/text/TextViewModel;", "viewModel", "Lkotlin/Function1;", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "", "onConfirm", "Lkotlin/Function0;", "goHomeState", "TextScreen", "(Lcom/kakao/kandinsky/text/TextViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lcom/kakao/kandinsky/text/contract/TextUiState;", "uiState", "text_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextScreen.kt\ncom/kakao/kandinsky/text/TextScreenKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,105:1\n1223#2,6:106\n1223#2,6:185\n1223#2,6:191\n71#3:112\n67#3,7:113\n74#3:148\n71#3:149\n68#3,6:150\n74#3:184\n78#3:200\n78#3:204\n78#4,6:120\n85#4,4:135\n89#4,2:145\n78#4,6:156\n85#4,4:171\n89#4,2:181\n93#4:199\n93#4:203\n368#5,9:126\n377#5:147\n368#5,9:162\n377#5:183\n378#5,2:197\n378#5,2:201\n4032#6,6:139\n4032#6,6:175\n81#7:205\n*S KotlinDebug\n*F\n+ 1 TextScreen.kt\ncom/kakao/kandinsky/text/TextScreenKt\n*L\n31#1:106,6\n86#1:185,6\n89#1:191,6\n41#1:112\n41#1:113,7\n41#1:148\n81#1:149\n81#1:150,6\n81#1:184\n81#1:200\n41#1:204\n41#1:120,6\n41#1:135,4\n41#1:145,2\n81#1:156,6\n81#1:171,4\n81#1:181,2\n81#1:199\n41#1:203\n41#1:126,9\n41#1:147\n81#1:162,9\n81#1:183\n81#1:197,2\n41#1:201,2\n41#1:139,6\n81#1:175,6\n28#1:205\n*E\n"})
public final class TextScreenKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void TextScreen(@NotNull TextViewModel textViewModel0, @NotNull Function1 function10, @NotNull Function0 function00, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(textViewModel0, "viewModel");
        Intrinsics.checkNotNullParameter(function10, "onConfirm");
        Intrinsics.checkNotNullParameter(function00, "goHomeState");
        Composer composer1 = composer0.startRestartGroup(-1300331833);
        int v1 = (v & 14) == 0 ? (composer1.changed(textViewModel0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v1 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1300331833, v1, -1, "com.kakao.kandinsky.text.TextScreen (TextScreen.kt:26)");
            }
            State state0 = FlowExtKt.collectAsStateWithLifecycle(textViewModel0.getUiState(), null, null, null, composer1, 8, 7);
            TextMode textMode0 = ((TextUiState)state0.getValue()).getTextMode();
            composer1.startReplaceGroup(0x73F6A55A);
            boolean z = composer1.changed(state0);
            i1 i10 = composer1.rememberedValue();
            if(z || i10 == Composer.Companion.getEmpty()) {
                i10 = new i1(state0, 9);
                composer1.updateRememberedValue(i10);
            }
            composer1.endReplaceGroup();
            BackHandlerKt.BackHandler(false, i10, composer1, 0, 1);
            ConsumeKDEventKt.ConsumeEvent(textViewModel0.getEvent(), function10, function00, composer1, v1 & 0x70 | 8 | v1 & 0x380);
            Companion modifier$Companion0 = Modifier.Companion;
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function01 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function01);
            }
            else {
                composer1.useNode();
            }
            Function2 function20 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                a.t(v2, composer1, v2, function20);
            }
            Updater.set-impl(composer1, modifier0, composeUiNode$Companion0.getSetModifier());
            Modifier modifier1 = textMode0 instanceof Input ? ClickableKt.clickable-XHw0xAI$default(AlphaKt.alpha(modifier$Companion0, 0.0f), false, null, null, za.a.w, 6, null) : modifier$Companion0;
            RotatableScreenKt.RotatableScreen-FHprtrg(modifier1, null, ((TextUiState)state0.getValue()).getOnChangedContentBounds(), null, 0L, ComposableLambdaKt.rememberComposableLambda(-1906187539, true, new c(state0, 7), composer1, 54), composer1, 0x30000, 26);
            composer1.startReplaceGroup(0x73F6ABF9);
            if(textMode0 instanceof Input) {
                Modifier modifier2 = SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null);
                MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
                int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
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
                Function2 function21 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                    a.t(v3, composer1, v3, function21);
                }
                Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
                List list0 = ((TextUiState)state0.getValue()).getFonts();
                TextData textData0 = ((Input)textMode0).getTextData();
                composer1.startReplaceGroup(1040274402);
                boolean z1 = composer1.changed(state0);
                w w0 = composer1.rememberedValue();
                if(z1 || w0 == Composer.Companion.getEmpty()) {
                    w0 = new w(state0, 23);
                    composer1.updateRememberedValue(w0);
                }
                composer1.endReplaceGroup();
                composer1.startReplaceGroup(1040274526);
                boolean z2 = composer1.changed(state0);
                i1 i11 = composer1.rememberedValue();
                if(z2 || i11 == Composer.Companion.getEmpty()) {
                    i11 = new i1(state0, 15);
                    composer1.updateRememberedValue(i11);
                }
                composer1.endReplaceGroup();
                TextEditorKt.TextDecorationEditor("text-tab", list0, textData0, w0, i11, composer1, 70);
                composer1.endNode();
            }
            if(a.x(composer1)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new androidx.compose.foundation.text.selection.a(v, 22, textViewModel0, function10, function00));
        }
    }

    public static final void access$TextMenu(Function0 function00, Function0 function01, Function0 function02, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x49DD6B74);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function01) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changedInstance(function02) ? 0x100 : 0x80);
        }
        if((v1 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x49DD6B74, v1, -1, "com.kakao.kandinsky.text.TextMenu (TextScreen.kt:98)");
            }
            MenuListKt.MenuList(null, null, ComposableLambdaKt.rememberComposableLambda(0x62549E20, true, new b(function00, function01, function02), composer1, 54), composer1, 0x180, 3);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new androidx.compose.foundation.text.selection.a(v, 21, function00, function01, function02));
        }
    }

    public static final TextUiState access$TextScreen$lambda$0(State state0) {
        return (TextUiState)state0.getValue();
    }
}

