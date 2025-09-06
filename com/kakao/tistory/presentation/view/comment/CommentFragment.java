package com.kakao.tistory.presentation.view.comment;

import a;
import android.os.Bundle;
import android.view.View;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.pullrefresh.PullRefreshIndicatorKt;
import androidx.compose.material.pullrefresh.PullRefreshKt;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.material.pullrefresh.PullRefreshStateKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.paging.LoadState;
import androidx.paging.compose.LazyPagingItems;
import com.kakao.android.base.tiara.TiaraListener;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tistory.data.model.common.EmojiErrorModel.Emoji;
import com.kakao.tistory.data.model.common.EmojiErrorModel;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.common.IllegalFilmType;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModel.Header;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModel.Pin;
import com.kakao.tistory.presentation.view.comment.contract.CommentListModel;
import com.kakao.tistory.presentation.view.comment.contract.CommentModifyModel;
import com.kakao.tistory.presentation.view.common.base.TistoryComposeFragment;
import com.kakao.tistory.presentation.view.entry.widget.CommentBottomBarKt;
import com.kakao.tistory.presentation.view.entry.widget.CommentModifyPageKt;
import com.kakao.tistory.presentation.widget.dialog.LoadingDialogKt;
import d;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\'\u0018\u00002\u00020\u0001B\u0007\u00A2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t2\b\u0010\f\u001A\u0004\u0018\u00010\u000BH\u0016\u00A2\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00020\u0006H\u0017\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0017\u0010\u0013\u001A\u00020\u00062\u0006\u0010\u0012\u001A\u00020\u0011H\u0007\u00A2\u0006\u0004\b\u0013\u0010\u0014J?\u0010\u001E\u001A\u00020\u00062\b\b\u0002\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u0012\u001A\u00020\u00112\f\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u001A0\u00192\u0006\u0010\u001D\u001A\u00020\u001CH\u0007\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u000F\u0010 \u001A\u00020\u0006H\u0015\u00A2\u0006\u0004\b \u0010\u0010R\u0014\u0010$\u001A\u00020!8&X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\"\u0010#R\u0014\u0010(\u001A\u00020%8&X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b&\u0010\'R\u0014\u0010,\u001A\u00020)8&X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b*\u0010+R\u0014\u00100\u001A\u00020-8&X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b.\u0010/R\u0014\u00102\u001A\u00020)8&X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b1\u0010+R\u0014\u00104\u001A\u00020)8&X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b3\u0010+\u00A8\u0006<\u00B2\u0006\f\u00106\u001A\u0002058\nX\u008A\u0084\u0002\u00B2\u0006\f\u0010\u0012\u001A\u00020\u00118\nX\u008A\u0084\u0002\u00B2\u0006\f\u0010\u0012\u001A\u0002078\nX\u008A\u0084\u0002\u00B2\u0006\f\u0010\u001D\u001A\u00020\u001C8\nX\u008A\u0084\u0002\u00B2\u0006\f\u00109\u001A\u0002088\nX\u008A\u0084\u0002\u00B2\u0006\u000E\u0010:\u001A\u00020\u001C8\n@\nX\u008A\u008E\u0002\u00B2\u0006\u000E\u0010;\u001A\u00020\u001C8\n@\nX\u008A\u008E\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/CommentFragment;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryComposeFragment;", "<init>", "()V", "Lcom/kakao/android/base/tiara/TiaraListener;", "tiaraListener", "", "trackPage", "(Lcom/kakao/android/base/tiara/TiaraListener;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Content", "(Landroidx/compose/runtime/Composer;I)V", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentListModel;", "model", "CommentListPage", "(Lcom/kakao/tistory/presentation/view/comment/contract/CommentListModel;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "Landroidx/paging/compose/LazyPagingItems;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel;", "comments", "", "showLoading", "CommentListContent", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Lcom/kakao/tistory/presentation/view/comment/contract/CommentListModel;Landroidx/paging/compose/LazyPagingItems;ZLandroidx/compose/runtime/Composer;II)V", "CommentEmptyView", "Lcom/kakao/tistory/presentation/view/comment/CommentListViewModel;", "getCommentListViewModel", "()Lcom/kakao/tistory/presentation/view/comment/CommentListViewModel;", "commentListViewModel", "Lcom/kakao/tistory/presentation/view/comment/CommentModifyViewModel;", "getCommentModifyViewModel", "()Lcom/kakao/tistory/presentation/view/comment/CommentModifyViewModel;", "commentModifyViewModel", "", "getTopViewTitleRes", "()I", "topViewTitleRes", "Lcom/kakao/tistory/presentation/common/IllegalFilmType;", "getIllegalFilmType", "()Lcom/kakao/tistory/presentation/common/IllegalFilmType;", "illegalFilmType", "getCommentEmptyTitleRes", "commentEmptyTitleRes", "getCommentEmptyMessageRes", "commentEmptyMessageRes", "Lcom/kakao/tistory/presentation/view/comment/CommentPageType;", "screenType", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyModel;", "", "inputAcceptType", "isRefreshing", "isLoadStarted", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCommentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommentFragment.kt\ncom/kakao/tistory/presentation/view/comment/CommentFragment\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,626:1\n14#2,4:627\n1#3:631\n106#4,15:632\n71#5:647\n67#5,7:648\n74#5:683\n78#5:693\n71#5:702\n68#5,6:703\n74#5:737\n71#5:744\n68#5,6:745\n74#5:779\n78#5:783\n78#5:787\n71#5:794\n69#5,5:795\n74#5:828\n78#5:832\n78#6,6:655\n85#6,4:670\n89#6,2:680\n93#6:692\n78#6,6:709\n85#6,4:724\n89#6,2:734\n78#6,6:751\n85#6,4:766\n89#6,2:776\n93#6:782\n93#6:786\n78#6,6:800\n85#6,4:815\n89#6,2:825\n93#6:831\n368#7,9:661\n377#7:682\n378#7,2:690\n368#7,9:715\n377#7:736\n368#7,9:757\n377#7:778\n378#7,2:780\n378#7,2:784\n368#7,9:806\n377#7:827\n378#7,2:829\n4032#8,6:674\n4032#8,6:728\n4032#8,6:770\n4032#8,6:819\n1223#9,6:684\n1223#9,6:696\n1223#9,6:738\n1223#9,6:788\n1223#9,6:836\n1223#9,6:842\n1223#9,6:848\n148#10:694\n148#10:695\n148#10:835\n77#11:833\n77#11:834\n81#12:854\n81#12:855\n81#12:856\n81#12:857\n107#12,2:858\n81#12:860\n107#12,2:861\n*S KotlinDebug\n*F\n+ 1 CommentFragment.kt\ncom/kakao/tistory/presentation/view/comment/CommentFragment\n*L\n65#1:627,4\n65#1:631\n65#1:632,15\n88#1:647\n88#1:648,7\n88#1:683\n88#1:693\n249#1:702\n249#1:703,6\n249#1:737\n296#1:744\n296#1:745,6\n296#1:779\n296#1:783\n249#1:787\n360#1:794\n360#1:795,5\n360#1:828\n360#1:832\n88#1:655,6\n88#1:670,4\n88#1:680,2\n88#1:692\n249#1:709,6\n249#1:724,4\n249#1:734,2\n296#1:751,6\n296#1:766,4\n296#1:776,2\n296#1:782\n249#1:786\n360#1:800,6\n360#1:815,4\n360#1:825,2\n360#1:831\n88#1:661,9\n88#1:682\n88#1:690,2\n249#1:715,9\n249#1:736\n296#1:757,9\n296#1:778\n296#1:780,2\n249#1:784,2\n360#1:806,9\n360#1:827\n360#1:829,2\n88#1:674,6\n249#1:728,6\n296#1:770,6\n360#1:819,6\n95#1:684,6\n244#1:696,6\n273#1:738,6\n305#1:788,6\n498#1:836,6\n525#1:842,6\n527#1:848,6\n145#1:694\n146#1:695\n476#1:835\n379#1:833\n380#1:834\n89#1:854\n94#1:855\n107#1:856\n244#1:857\n244#1:858,2\n498#1:860\n498#1:861,2\n*E\n"})
public abstract class CommentFragment extends TistoryComposeFragment {
    public static final int $stable = 8;
    public final BaseViewModelLazy f;
    public int g;
    public int h;

    public CommentFragment() {
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.4 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$40 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.4(new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels.2(this));
        Lazy lazy0 = c.lazy(LazyThreadSafetyMode.NONE, tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$40);
        this.f = new BaseViewModelLazy(this, FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(CommentNavViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.5(lazy0), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.6(null, lazy0), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.7(this, lazy0)));
        this.g = -1;
    }

    @Composable
    public void CommentEmptyView(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-1222270673);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1222270673, v, -1, "com.kakao.tistory.presentation.view.comment.CommentFragment.CommentEmptyView (CommentFragment.kt:480)");
        }
        EmojiErrorModel emojiErrorModel0 = new EmojiErrorModel();
        String s = this.getString(this.getCommentEmptyTitleRes());
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        emojiErrorModel0.setTitle(s);
        emojiErrorModel0.setMessage(this.getString(this.getCommentEmptyMessageRes()));
        emojiErrorModel0.setEmoji(Emoji.Finger);
        this.CommonExceptionView(emojiErrorModel0, composer1, 72);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new q(this, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void CommentListContent(@Nullable Modifier modifier0, @NotNull LazyListState lazyListState0, @NotNull CommentListModel commentListModel0, @NotNull LazyPagingItems lazyPagingItems0, boolean z, @Nullable Composer composer0, int v, int v1) {
        Modifier modifier2;
        MutableState mutableState1;
        Intrinsics.checkNotNullParameter(lazyListState0, "lazyListState");
        Intrinsics.checkNotNullParameter(commentListModel0, "model");
        Intrinsics.checkNotNullParameter(lazyPagingItems0, "comments");
        Composer composer1 = composer0.startRestartGroup(0x2C111456);
        Modifier modifier1 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x2C111456, v, -1, "com.kakao.tistory.presentation.view.comment.CommentFragment.CommentListContent (CommentFragment.kt:242)");
        }
        composer1.startReplaceGroup(1948052871);
        MutableState mutableState0 = composer1.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer1.updateRememberedValue(mutableState0);
        }
        composer1.endReplaceGroup();
        if(commentListModel0.isEmpty()) {
            composer1.startReplaceGroup(260159603);
            this.CommentEmptyView(composer1, 8);
            composer1.endReplaceGroup();
            mutableState1 = mutableState0;
            modifier2 = modifier1;
        }
        else {
            composer1.startReplaceGroup(0xF837423);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier1);
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
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            mutableState1 = mutableState0;
            this.a(modifier$Companion0, ((Boolean)mutableState0.getValue()).booleanValue(), !z, new b0(this, mutableState0), ComposableLambdaKt.rememberComposableLambda(303587208, true, new c0(this, lazyListState0, commentListModel0, lazyPagingItems0), composer1, 54), composer1, 0x46006, 0);
            Pin commentItemUIModel$Pin0 = commentListModel0.getPinComment();
            composer1.startReplaceGroup(0xAB9ECF3D);
            if(commentItemUIModel$Pin0 == null) {
                modifier2 = modifier1;
            }
            else {
                composer1.startReplaceGroup(0x251D726B);
                State state0 = composer1.rememberedValue();
                if(state0 == composer$Companion0.getEmpty()) {
                    state0 = SnapshotStateKt.derivedStateOf(new e0(lazyListState0));
                    composer1.updateRememberedValue(state0);
                }
                composer1.endReplaceGroup();
                modifier2 = modifier1;
                AnimatedVisibilityKt.AnimatedVisibility(((Boolean)state0.getValue()).booleanValue() || !lazyPagingItems0.getLoadState().getSource().getPrepend().getEndOfPaginationReached(), null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), null, ComposableLambdaKt.rememberComposableLambda(-1683110328, true, new d0(commentItemUIModel$Pin0), composer1, 54), composer1, 200064, 18);
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(0xAB9F3E8B);
            if(z || !commentListModel0.isInitialized()) {
                composer1.startReplaceGroup(0xAB9F4B2D);
                long v3 = commentListModel0.isInitialized() ? 0L : ColorResources_androidKt.colorResource(color.white, composer1, 0);
                composer1.endReplaceGroup();
                Modifier modifier4 = BackgroundKt.background-bw27NRU$default(modifier$Companion0, v3, null, 2, null);
                MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
                int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
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
                Function2 function21 = a.a(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                    d.a(v4, composer1, v4, function21);
                }
                Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
                LoadingDialogKt.LoadingDialog(composer1, 0);
                composer1.endNode();
            }
            composer1.endReplaceGroup();
            composer1.endNode();
            composer1.endReplaceGroup();
        }
        LoadState loadState0 = lazyPagingItems0.getLoadState().getRefresh();
        composer1.startReplaceGroup(0x741E175D);
        f0 f00 = composer1.rememberedValue();
        if(f00 == composer$Companion0.getEmpty()) {
            f00 = new f0(mutableState1);
            composer1.updateRememberedValue(f00);
        }
        composer1.endReplaceGroup();
        this.a(loadState0, f00, new g0(lazyListState0, lazyPagingItems0, commentListModel0, this, null), composer1, 4664);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h0(this, modifier2, lazyListState0, commentListModel0, lazyPagingItems0, z, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void CommentListPage(@NotNull CommentListModel commentListModel0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(commentListModel0, "model");
        Composer composer1 = composer0.startRestartGroup(2067188800);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2067188800, v, -1, "com.kakao.tistory.presentation.view.comment.CommentFragment.CommentListPage (CommentFragment.kt:138)");
        }
        ModalBottomSheetState modalBottomSheetState0 = ModalBottomSheetKt.rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, null, null, true, composer1, 0xC06, 6);
        RoundedCornerShape roundedCornerShape0 = RoundedCornerShapeKt.RoundedCornerShape-a9UjIt4$default(12.0f, 12.0f, 0.0f, 0.0f, 12, null);
        ModalBottomSheetKt.ModalBottomSheetLayout-Gs3lGvM(ComposableLambdaKt.rememberComposableLambda(0x9E90AB6E, true, new i0(modalBottomSheetState0, this), composer1, 54), null, modalBottomSheetState0, false, roundedCornerShape0, 0.0f, 0L, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(0xA4F6B367, true, new s0(commentListModel0, this), composer1, 54), composer1, ModalBottomSheetState.$stable << 6 | 0x30030006, 458);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new t0(this, commentListModel0, v));
        }
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryComposeFragment
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public void Content(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-695044711);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-695044711, v, -1, "com.kakao.tistory.presentation.view.comment.CommentFragment.Content (CommentFragment.kt:86)");
        }
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, Modifier.Companion);
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
        Updater.set-impl(composer1, modifier0, composeUiNode$Companion0.getSetModifier());
        State state0 = SnapshotStateKt.collectAsState(((CommentNavViewModel)this.f.getValue()).getCurrentState(), new List(null, 1, null), null, composer1, 8, 2);
        composer1.startReplaceGroup(1306343985);
        CommentPageType commentPageType0 = (CommentPageType)state0.getValue();
        if(commentPageType0 instanceof List) {
            composer1.startReplaceGroup(0xF5F982A6);
            State state1 = SnapshotStateKt.collectAsState(this.getCommentListViewModel().getUiState(), null, composer1, 8, 1);
            ProvidableCompositionLocal providableCompositionLocal0 = CommentBottomBarKt.getLocalCommentFocusRequester();
            composer1.startReplaceGroup(0x3139ABEB);
            FocusRequester focusRequester0 = composer1.rememberedValue();
            if(focusRequester0 == Composer.Companion.getEmpty()) {
                focusRequester0 = new FocusRequester();
                composer1.updateRememberedValue(focusRequester0);
            }
            composer1.endReplaceGroup();
            CompositionLocalKt.CompositionLocalProvider(providableCompositionLocal0.provides(focusRequester0), ComposableLambdaKt.rememberComposableLambda(1096330777, true, new v0(this, state1), composer1, 54), composer1, ProvidedValue.$stable | 0x30);
            w0 w00 = new w0(this, ((List)commentPageType0), state1, null);
            EffectsKt.LaunchedEffect(Unit.INSTANCE, w00, composer1, 70);
        }
        else if(commentPageType0 instanceof Modify) {
            composer1.startReplaceGroup(0xF6030D5A);
            State state2 = SnapshotStateKt.collectAsState(this.getCommentModifyViewModel().getUiState(), null, composer1, 8, 1);
            BaseCommentTiara baseCommentTiara0 = this.getCommentModifyViewModel().getCommentTiara();
            CommentModifyPageKt.CommentModifyPage(((CommentModifyModel)state2.getValue()), baseCommentTiara0, composer1, 8);
        }
        else {
            composer1.startReplaceGroup(0xF606FD94);
        }
        composer1.endReplaceGroup();
        composer1.endReplaceGroup();
        EffectsKt.LaunchedEffect(((CommentPageType)state0.getValue()), new x0(state0, this, null), composer1, 0x40);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new y0(this, v));
        }
    }

    public final void a(Modifier modifier0, boolean z, boolean z1, Function0 function00, Function2 function20, Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xF890F38C);
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
            v2 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(z1) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v2) != 9362 || !composer1.getSkipping()) {
            modifier1 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF890F38C, v2, -1, "com.kakao.tistory.presentation.view.comment.CommentFragment.CommentPullRefresh (CommentFragment.kt:351)");
            }
            int v3 = v2 >> 3 & 14;
            PullRefreshState pullRefreshState0 = PullRefreshStateKt.rememberPullRefreshState-UuyPYSY(z, function00, 0.0f, 0.0f, composer1, v3 | v2 >> 6 & 0x70, 12);
            Modifier modifier2 = ClipKt.clipToBounds(PullRefreshKt.pullRefresh(modifier1, pullRefreshState0, z1));
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopCenter(), false);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
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
            Function2 function21 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                d.a(v4, composer1, v4, function21);
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            function20.invoke(composer1, ((int)(v2 >> 12 & 14)));
            PullRefreshIndicatorKt.PullRefreshIndicator-jB83MbM(z, pullRefreshState0, Modifier.Companion, 0L, 0L, false, composer1, v3 | 0x180 | PullRefreshState.$stable << 3, 56);
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
            scopeUpdateScope0.updateScope(new u0(this, modifier1, z, z1, function00, function20, v, v1));
        }
    }

    public final void a(LoadState loadState0, Function0 function00, Function1 function10, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xE970CCA2);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE970CCA2, v, -1, "com.kakao.tistory.presentation.view.comment.CommentFragment.ListStateHandler (CommentFragment.kt:496)");
        }
        composer1.startReplaceGroup(0xF5EAEF22);
        MutableState mutableState0 = composer1.rememberedValue();
        if(mutableState0 == Composer.Companion.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer1.updateRememberedValue(mutableState0);
        }
        composer1.endReplaceGroup();
        EffectsKt.LaunchedEffect(loadState0, new z0(loadState0, this, function10, function00, mutableState0, null), composer1, 72);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a1(this, loadState0, function00, function10, v));
        }
    }

    public static final void access$CommentDivider-kHDZbjc(CommentFragment commentFragment0, float f, Composer composer0, int v, int v1) {
        int v2;
        commentFragment0.getClass();
        Composer composer1 = composer0.startRestartGroup(2081939146);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(f) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v2 & 11) != 2 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                f = 1.0f;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2081939146, v2, -1, "com.kakao.tistory.presentation.view.comment.CommentFragment.CommentDivider (CommentFragment.kt:475)");
            }
            DividerKt.Divider-oMI9zvI(null, ColorResources_androidKt.colorResource(color.color_f5f5f5, composer1, 0), f, 0.0f, composer1, v2 << 6 & 0x380, 9);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new p(commentFragment0, f, v, v1));
        }
    }

    public static final void access$CommentList(CommentFragment commentFragment0, LazyListState lazyListState0, int v, long v1, Pin commentItemUIModel$Pin0, LazyPagingItems lazyPagingItems0, Composer composer0, int v2) {
        commentFragment0.getClass();
        Composer composer1 = composer0.startRestartGroup(907985818);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(907985818, v2, -1, "com.kakao.tistory.presentation.view.comment.CommentFragment.CommentList (CommentFragment.kt:377)");
        }
        Object object0 = composer1.consume(CommentBottomBarKt.getLocalCommentFocusRequester());
        Object object1 = composer1.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
        LazyDslKt.LazyColumn(null, lazyListState0, null, false, null, null, null, false, new z(CollectionsKt___CollectionsKt.getOrNull(lazyPagingItems0.getItemSnapshotList(), 0) instanceof Header, lazyPagingItems0, v, v1, commentItemUIModel$Pin0, ((SoftwareKeyboardController)object1), commentFragment0, ((FocusRequester)object0)), composer1, v2 << 3 & 0x70, 0xFD);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a0(commentFragment0, lazyListState0, v, v1, commentItemUIModel$Pin0, lazyPagingItems0, v2));
        }
    }

    public static final void access$CommentListContent$lambda$8(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }

    public static final CommentPageType access$Content$lambda$5$lambda$0(State state0) {
        return (CommentPageType)state0.getValue();
    }

    public static final CommentListModel access$Content$lambda$5$lambda$4$lambda$1(State state0) {
        return (CommentListModel)state0.getValue();
    }

    public static final boolean access$ListStateHandler$lambda$17(MutableState mutableState0) {
        return ((Boolean)mutableState0.getValue()).booleanValue();
    }

    public static final void access$ListStateHandler$lambda$18(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }

    public static final CommentNavViewModel access$getNavViewModel(CommentFragment commentFragment0) {
        return (CommentNavViewModel)commentFragment0.f.getValue();
    }

    public static final void access$saveListPosition(CommentFragment commentFragment0, LazyListState lazyListState0, Composer composer0, int v) {
        commentFragment0.getClass();
        Composer composer1 = composer0.startRestartGroup(0xB1B8CE4D);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB1B8CE4D, v, -1, "com.kakao.tistory.presentation.view.comment.CommentFragment.saveListPosition (CommentFragment.kt:523)");
        }
        composer1.startReplaceGroup(0xCE6073B0);
        State state0 = composer1.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(state0 == composer$Companion0.getEmpty()) {
            state0 = SnapshotStateKt.derivedStateOf(new m1(lazyListState0));
            composer1.updateRememberedValue(state0);
        }
        composer1.endReplaceGroup();
        commentFragment0.g = ((Number)state0.getValue()).intValue();
        composer1.startReplaceGroup(0xCE6081F7);
        State state1 = composer1.rememberedValue();
        if(state1 == composer$Companion0.getEmpty()) {
            state1 = SnapshotStateKt.derivedStateOf(new n1(lazyListState0));
            composer1.updateRememberedValue(state1);
        }
        composer1.endReplaceGroup();
        commentFragment0.h = ((Number)state1.getValue()).intValue();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o1(commentFragment0, lazyListState0, v));
        }
    }

    public abstract int getCommentEmptyMessageRes();

    public abstract int getCommentEmptyTitleRes();

    @NotNull
    public abstract CommentListViewModel getCommentListViewModel();

    @NotNull
    public abstract CommentModifyViewModel getCommentModifyViewModel();

    @NotNull
    public abstract IllegalFilmType getIllegalFilmType();

    public abstract int getTopViewTitleRes();

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryComposeFragment
    public void onViewCreated(@NotNull View view0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        super.onViewCreated(view0, bundle0);
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new c1(this, null));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new e1(this, null));
        CommentListViewModel commentListViewModel0 = this.getCommentListViewModel();
        LifecycleOwner lifecycleOwner0 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner0, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(commentListViewModel0.getShowErrorDialog(), lifecycleOwner0, new g1(this));
        LifecycleOwner lifecycleOwner1 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner1, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(commentListViewModel0.getShowReportCommentDialog(), lifecycleOwner1, new h1(commentListViewModel0, this));
        LifecycleOwner lifecycleOwner2 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner2, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(commentListViewModel0.getGoToRedirect(), lifecycleOwner2, new i1(this));
        LifecycleOwner lifecycleOwner3 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner3, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(commentListViewModel0.getGoToBlogActivity(), lifecycleOwner3, new j1(this));
        LiveData liveData0 = this.getCommentModifyViewModel().getShowErrorDialog();
        LifecycleOwner lifecycleOwner4 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner4, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(liveData0, lifecycleOwner4, new l1(this));
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryComposeFragment
    public void trackPage(@NotNull TiaraListener tiaraListener0) {
        Intrinsics.checkNotNullParameter(tiaraListener0, "tiaraListener");
    }
}

