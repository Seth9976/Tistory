package com.kakao.tistory.presentation.view.entry.widget;

import a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.MaterialTheme;
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
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModel.MoreButton;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0015\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"ReplyMore", "", "model", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$MoreButton;", "(Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$MoreButton;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nReplyMore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplyMore.kt\ncom/kakao/tistory/presentation/view/entry/widget/ReplyMoreKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,44:1\n148#2:45\n71#3:46\n69#3,5:47\n74#3:80\n78#3:84\n78#4,6:52\n85#4,4:67\n89#4,2:77\n93#4:83\n368#5,9:58\n377#5:79\n378#5,2:81\n4032#6,6:71\n*S KotlinDebug\n*F\n+ 1 ReplyMore.kt\ncom/kakao/tistory/presentation/view/entry/widget/ReplyMoreKt\n*L\n26#1:45\n24#1:46\n24#1:47,5\n24#1:80\n24#1:84\n24#1:52,6\n24#1:67,4\n24#1:77,2\n24#1:83\n24#1:58,9\n24#1:79\n24#1:81,2\n24#1:71,6\n*E\n"})
public final class ReplyMoreKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void ReplyMore(@NotNull MoreButton commentItemUIModel$MoreButton0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(commentItemUIModel$MoreButton0, "model");
        Composer composer1 = composer0.startRestartGroup(0xC5244CD6);
        int v1 = (v & 14) == 0 ? (composer1.changed(commentItemUIModel$MoreButton0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xC5244CD6, v1, -1, "com.kakao.tistory.presentation.view.entry.widget.ReplyMore (ReplyMore.kt:22)");
            }
            Modifier modifier0 = ClickableKt.clickable-XHw0xAI$default(BackgroundKt.background-bw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.height-3ABfNKs(Modifier.Companion, 40.0f), 0.0f, 1, null), ColorResources_androidKt.colorResource(color.white, composer1, 0), null, 2, null), false, null, null, commentItemUIModel$MoreButton0.getOnClick(), 7, null);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                d.a(v2, composer1, v2, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(StringResources_androidKt.stringResource(string.label_reply_load_more, new Object[]{commentItemUIModel$MoreButton0.getSize()}, composer1, 0x40), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, false, 1, 0, null, TextStyle.copy-p1EtxEg$default(TypeKt.getSubtext1(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable)), ColorResources_androidKt.colorResource(color.color_777777, composer1, 0), 0L, FontWeight.Companion.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFA, null), composer1, 0, 0x6C30, 0x197FE);
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
            scopeUpdateScope0.updateScope(new w1(commentItemUIModel$MoreButton0, v));
        }
    }
}

