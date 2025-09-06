package com.kakao.tistory.presentation.view.entry.widget;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import com.kakao.tistory.presentation.view.comment.BaseCommentTiara;
import com.kakao.tistory.presentation.view.comment.contract.CommentModifyModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u001D\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"CommentModifyPage", "", "model", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyModel;", "commentTiara", "Lcom/kakao/tistory/presentation/view/comment/BaseCommentTiara;", "(Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyModel;Lcom/kakao/tistory/presentation/view/comment/BaseCommentTiara;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCommentModifyPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommentModifyPage.kt\ncom/kakao/tistory/presentation/view/entry/widget/CommentModifyPageKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,95:1\n1223#2,6:96\n*S KotlinDebug\n*F\n+ 1 CommentModifyPage.kt\ncom/kakao/tistory/presentation/view/entry/widget/CommentModifyPageKt\n*L\n28#1:96,6\n*E\n"})
public final class CommentModifyPageKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void CommentModifyPage(@NotNull CommentModifyModel commentModifyModel0, @NotNull BaseCommentTiara baseCommentTiara0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(commentModifyModel0, "model");
        Intrinsics.checkNotNullParameter(baseCommentTiara0, "commentTiara");
        Composer composer1 = composer0.startRestartGroup(0x1CC7A36A);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x1CC7A36A, v, -1, "com.kakao.tistory.presentation.view.entry.widget.CommentModifyPage (CommentModifyPage.kt:26)");
        }
        composer1.startReplaceGroup(0x26055CAB);
        boolean z = composer1.changed(commentModifyModel0.getOrigin());
        MutableState mutableState0 = composer1.rememberedValue();
        if(z || mutableState0 == Composer.Companion.getEmpty()) {
            String s = commentModifyModel0.getOrigin().getContent();
            if(s == null) {
                s = "";
            }
            mutableState0 = SnapshotStateKt.mutableStateOf$default(new TextFieldValue(s, TextRangeKt.TextRange(0), null, 4, null), null, 2, null);
            composer1.updateRememberedValue(mutableState0);
        }
        composer1.endReplaceGroup();
        TextFieldValue textFieldValue0 = (TextFieldValue)mutableState0.component1();
        Function1 function10 = mutableState0.component2();
        ScaffoldKt.Scaffold-27mzLpw(null, null, ComposableLambdaKt.rememberComposableLambda(1370212015, true, new z0(commentModifyModel0, textFieldValue0), composer1, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(0x2C980B28, true, new d1(textFieldValue0, commentModifyModel0, function10), composer1, 54), composer1, 0x180, 0xC00000, 0x1FFFB);
        e1 e10 = new e1(baseCommentTiara0, null);
        EffectsKt.LaunchedEffect(Unit.INSTANCE, e10, composer1, 70);
        BackHandlerKt.BackHandler(false, new f1(commentModifyModel0, textFieldValue0), composer1, 0, 1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g1(commentModifyModel0, baseCommentTiara0, v));
        }
    }
}

