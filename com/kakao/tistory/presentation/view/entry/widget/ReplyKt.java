package com.kakao.tistory.presentation.view.entry.widget;

import a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
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
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModel.Comment;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModel.Reply;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A\u0017\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Reply;", "reply", "", "Reply", "(Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Reply;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nReply.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reply.kt\ncom/kakao/tistory/presentation/view/entry/widget/ReplyKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,52:1\n98#2:53\n95#2,6:54\n101#2:88\n105#2:94\n78#3,6:60\n85#3,4:75\n89#3,2:85\n93#3:93\n368#4,9:66\n377#4:87\n378#4,2:91\n4032#5,6:79\n148#6:89\n148#6:90\n148#6:95\n1223#7,6:96\n*S KotlinDebug\n*F\n+ 1 Reply.kt\ncom/kakao/tistory/presentation/view/entry/widget/ReplyKt\n*L\n21#1:53\n21#1:54,6\n21#1:88\n21#1:94\n21#1:60,6\n21#1:75,4\n21#1:85,2\n21#1:93\n21#1:66,9\n21#1:87\n21#1:91,2\n21#1:79,6\n22#1:89\n27#1:90\n36#1:95\n36#1:96,6\n*E\n"})
public final class ReplyKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Reply(@NotNull Reply commentItemUIModel$Reply0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(commentItemUIModel$Reply0, "reply");
        Composer composer1 = composer0.startRestartGroup(1666819051);
        int v1 = (v & 14) == 0 ? (composer1.changed(commentItemUIModel$Reply0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1666819051, v1, -1, "com.kakao.tistory.presentation.view.entry.widget.Reply (Reply.kt:17)");
            }
            Comment commentItemUIModel$Comment0 = commentItemUIModel$Reply0.getComment();
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = BackgroundKt.background-bw27NRU$default(modifier$Companion0, ColorResources_androidKt.colorResource(color.white, composer1, 0), null, 2, null);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer1, 0);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                d.a(v2, composer1, v2, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            ReplyKt.a(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 20.0f, 32.0f, 10.0f, 0.0f, 8, null), composer1, 6, 0);
            CommentKt.Comment(PaddingKt.padding-qDBjuR0$default(BackgroundKt.background-bw27NRU$default(modifier$Companion0, ColorResources_androidKt.colorResource(color.white, composer1, 0), null, 2, null), 0.0f, 22.0f, 20.0f, 22.0f, 1, null), commentItemUIModel$Comment0, composer1, 0, 0);
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
            scopeUpdateScope0.updateScope(new t1(commentItemUIModel$Reply0, v));
        }
    }

    public static final void a(Modifier modifier0, Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x6EA843A3);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v2 & 11) != 2 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                modifier0 = Modifier.Companion;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x6EA843A3, v2, -1, "com.kakao.tistory.presentation.view.entry.widget.ReplyMark (Reply.kt:33)");
            }
            Modifier modifier1 = SizeKt.size-3ABfNKs(modifier0, 10.0f);
            composer1.startReplaceGroup(1986403993);
            u1 u10 = composer1.rememberedValue();
            if(u10 == Composer.Companion.getEmpty()) {
                u10 = new u1(0xFFE2E2E200000000L);
                composer1.updateRememberedValue(u10);
            }
            composer1.endReplaceGroup();
            CanvasKt.Canvas(modifier1, u10, composer1, 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v1(modifier0, v, v1));
        }
    }
}

