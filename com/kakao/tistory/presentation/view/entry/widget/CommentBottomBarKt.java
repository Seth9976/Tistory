package com.kakao.tistory.presentation.view.entry.widget;

import a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.common.graph.b;
import com.kakao.tistory.presentation.view.comment.contract.CommentListModel;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import d;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001A/\u0010\b\u001A\u00020\u00072\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\"\u001D\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000B0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0012²\u0006\u000E\u0010\u0011\u001A\u00020\u00008\n@\nX\u008A\u008E\u0002"}, d2 = {"", "editAccepted", "", "hintText", "notAcceptedTitle", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentListModel;", "model", "", "CommentBottomBar", "(ZLjava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/presentation/view/comment/contract/CommentListModel;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/focus/FocusRequester;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalCommentFocusRequester", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalCommentFocusRequester", "editFieldEnabled", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCommentBottomBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommentBottomBar.kt\ncom/kakao/tistory/presentation/view/entry/widget/CommentBottomBarKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,86:1\n71#2:87\n68#2,6:88\n74#2:122\n78#2:157\n78#3,6:94\n85#3,4:109\n89#3,2:119\n93#3:156\n368#4,9:100\n377#4:121\n378#4,2:154\n4032#5,6:113\n488#6:123\n487#6,4:124\n491#6,2:131\n495#6:137\n1223#7,3:128\n1226#7,3:134\n1223#7,6:139\n1223#7,6:145\n487#8:133\n77#9:138\n148#10:151\n148#10:152\n148#10:153\n81#11:158\n107#11,2:159\n*S KotlinDebug\n*F\n+ 1 CommentBottomBar.kt\ncom/kakao/tistory/presentation/view/entry/widget/CommentBottomBarKt\n*L\n31#1:87\n31#1:88,6\n31#1:122\n31#1:157\n31#1:94,6\n31#1:109,4\n31#1:119,2\n31#1:156\n31#1:100,9\n31#1:121\n31#1:154,2\n31#1:113,6\n33#1:123\n33#1:124,4\n33#1:131,2\n33#1:137\n33#1:128,3\n33#1:134,3\n37#1:139,6\n39#1:145,6\n33#1:133\n35#1:138\n71#1:151\n72#1:152\n82#1:153\n37#1:158\n37#1:159,2\n*E\n"})
public final class CommentBottomBarKt {
    public static final ProvidableCompositionLocal a;

    static {
        CommentBottomBarKt.a = CompositionLocalKt.compositionLocalOf$default(null, k.a, 1, null);
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void CommentBottomBar(boolean z, @NotNull String s, @NotNull String s1, @NotNull CommentListModel commentListModel0, @Nullable Composer composer0, int v) {
        BoxScopeInstance boxScopeInstance1;
        Intrinsics.checkNotNullParameter(s, "hintText");
        Intrinsics.checkNotNullParameter(s1, "notAcceptedTitle");
        Intrinsics.checkNotNullParameter(commentListModel0, "model");
        Composer composer1 = composer0.startRestartGroup(0x157816D);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x157816D, v, -1, "com.kakao.tistory.presentation.view.entry.widget.CommentBottomBar (CommentBottomBar.kt:29)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = BackgroundKt.background-bw27NRU$default(modifier$Companion0, ColorResources_androidKt.colorResource(color.white, composer1, 0), null, 2, null);
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
        BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
        if(z) {
            composer1.startReplaceGroup(0x89340CFF);
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
            androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
            if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
                compositionScopedCoroutineScopeCanceller0 = androidx.room.a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
            }
            CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
            Object object0 = composer1.consume(CommentBottomBarKt.a);
            composer1.startReplaceGroup(0x6FC7EE5C);
            MutableState mutableState0 = composer1.rememberedValue();
            if(mutableState0 == composer$Companion0.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            MutableState mutableState1 = b.a(composer1, 0x6FC7F9A6);
            if(mutableState1 == composer$Companion0.getEmpty()) {
                mutableState1 = SnapshotStateKt.mutableStateOf$default(new TextFieldValue("", 0L, null, 6, null), null, 2, null);
                composer1.updateRememberedValue(mutableState1);
            }
            composer1.endReplaceGroup();
            TextFieldValue textFieldValue0 = (TextFieldValue)mutableState1.component1();
            Function1 function10 = mutableState1.component2();
            boxScopeInstance1 = boxScopeInstance0;
            CommentEditFieldKt.CommentEditField(textFieldValue0, new g(commentListModel0, function10, mutableState0), commentListModel0.getParent(), commentListModel0.getMention(), false, s, ((Boolean)mutableState0.getValue()).booleanValue(), ((FocusRequester)object0), commentListModel0.getOnClickRemove(), new i(commentListModel0, function10, coroutineScope0, mutableState0), composer1, v << 12 & 0x70000 | 0x7200, 0);
        }
        else {
            boxScopeInstance1 = boxScopeInstance0;
            composer1.startReplaceGroup(0x894822E1);
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s1, PaddingKt.padding-qDBjuR0$default(SizeKt.height-3ABfNKs(modifier$Companion0, 52.0f), 20.0f, 16.0f, 0.0f, 0.0f, 12, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, TextStyle.copy-p1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getH6(), ColorResources_androidKt.colorResource(color.gray2, composer1, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null), composer1, v >> 6 & 14 | 0x30, 0xC00, 0x1DFFC);
        }
        composer1.endReplaceGroup();
        DividerKt.Divider-oMI9zvI(boxScopeInstance1.align(modifier$Companion0, alignment$Companion0.getTopCenter()), ColorResources_androidKt.colorResource(color.gray4, composer1, 0), 1.0f, 0.0f, composer1, 0x180, 8);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j(z, s, s1, commentListModel0, v));
        }
    }

    public static final boolean access$CommentBottomBar$lambda$4$lambda$1(MutableState mutableState0) {
        return ((Boolean)mutableState0.getValue()).booleanValue();
    }

    public static final void access$CommentBottomBar$lambda$4$lambda$2(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalCommentFocusRequester() {
        return CommentBottomBarKt.a;
    }
}

