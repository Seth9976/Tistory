package com.kakao.tistory.presentation.view.blog;

import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.q;
import androidx.paging.CombinedLoadStates;
import androidx.paging.LoadState.Loading;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItemsKt;
import com.google.accompanist.swiperefresh.SwipeRefreshKt;
import com.google.accompanist.swiperefresh.SwipeRefreshState;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.common.extension.StringExtensionKt;
import com.kakao.tistory.presentation.viewmodel.BlogFollowViewModel.Type;
import com.kakao.tistory.presentation.viewmodel.BlogFollowViewModel;
import com.kakao.tistory.presentation.viewmodel.TopViewModel;
import com.kakao.tistory.presentation.widget.dialog.LoadingDialogKt;
import dagger.hilt.android.AndroidEntryPoint;
import gc.b;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@AndroidEntryPoint
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00042\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\bH\u0017¢\u0006\u0004\b\u000B\u0010\f¨\u0006\u0014²\u0006\u001A\u0010\u0011\u001A\u0010\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000E8\nX\u008A\u0084\u0002²\u0006\f\u0010\u0012\u001A\u00020\u00108\nX\u008A\u0084\u0002²\u0006\f\u0010\u0013\u001A\u00020\u00108\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/blog/BlogFollowingFragment;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryComposeFragment;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Content", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "Lkotlin/Pair;", "", "", "updatedBlog", "isEmpty", "isSubscriber", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogFollowingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogFollowingFragment.kt\ncom/kakao/tistory/presentation/view/blog/BlogFollowingFragment\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,196:1\n14#2,4:197\n14#2,4:217\n1#3:201\n1#3:221\n106#4,15:202\n106#4,15:222\n1223#5,6:237\n81#6:243\n81#6:244\n*S KotlinDebug\n*F\n+ 1 BlogFollowingFragment.kt\ncom/kakao/tistory/presentation/view/blog/BlogFollowingFragment\n*L\n55#1:197,4\n56#1:217,4\n55#1:201\n56#1:221\n55#1:202,15\n56#1:222,15\n88#1:237,6\n87#1:243\n88#1:244\n*E\n"})
public final class BlogFollowingFragment extends Hilt_BlogFollowingFragment {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/view/blog/BlogFollowingFragment$Companion;", "", "Lcom/kakao/tistory/presentation/view/blog/BlogFollowingFragment;", "newInstance", "()Lcom/kakao/tistory/presentation/view/blog/BlogFollowingFragment;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final BlogFollowingFragment newInstance() {
            return new BlogFollowingFragment();
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final BaseViewModelLazy k;
    public final BaseViewModelLazy l;

    static {
        BlogFollowingFragment.Companion = new Companion(null);
        BlogFollowingFragment.$stable = 8;
    }

    public BlogFollowingFragment() {
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.4 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$40 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.4(new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels.2(this));
        Lazy lazy0 = c.lazy(LazyThreadSafetyMode.NONE, tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$40);
        this.k = new BaseViewModelLazy(this, FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TopViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.5(lazy0), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.6(null, lazy0), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.7(this, lazy0)));
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.4 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$41 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.4(new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels.2(this));
        Lazy lazy1 = c.lazy(LazyThreadSafetyMode.NONE, tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$41);
        this.l = new BaseViewModelLazy(this, FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BlogFollowViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.5(lazy1), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.6(null, lazy1), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.7(this, lazy1)));
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryComposeFragment
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public void Content(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-1050713636);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1050713636, v, -1, "com.kakao.tistory.presentation.view.blog.BlogFollowingFragment.Content (BlogFollowingFragment.kt:64)");
        }
        u u0 = new u(null);
        EffectsKt.LaunchedEffect(Unit.INSTANCE, u0, composer1, 70);
        LazyPagingItems lazyPagingItems0 = LazyPagingItemsKt.collectAsLazyPagingItems(((BlogFollowViewModel)this.l.getValue()).getBlogFollowings(), null, composer1, 8, 1);
        SwipeRefreshState swipeRefreshState0 = SwipeRefreshKt.rememberSwipeRefreshState(false, composer1, 6);
        LazyListState lazyListState0 = LazyListStateKt.rememberLazyListState(0, 0, composer1, 0, 3);
        SwipeRefreshKt.SwipeRefresh-Fsagccs(swipeRefreshState0, new v(lazyPagingItems0), null, false, 0.0f, null, null, null, false, ComposableLambdaKt.rememberComposableLambda(0xF4F72A25, true, new w(this, lazyListState0, lazyPagingItems0), composer1, 54), composer1, 0x30000000, 508);
        this.a(lazyPagingItems0.getLoadState(), new x(((BlogFollowViewModel)this.l.getValue())), composer1, 520);
        this.ToolbarVisibilityHandler(lazyListState0, composer1, 0x40);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new y(this, v));
        }
    }

    public static final void a(BlogFollowingFragment blogFollowingFragment0, Long long0) {
        Intrinsics.checkNotNullParameter(blogFollowingFragment0, "this$0");
        TopViewModel topViewModel0 = (TopViewModel)blogFollowingFragment0.k.getValue();
        Intrinsics.checkNotNull(long0);
        topViewModel0.updateTitleInfo(StringExtensionKt.toFormattedString$default(((long)long0), 0, 1, null));
    }

    public static final void a(BlogFollowViewModel blogFollowViewModel0, BlogFollowingFragment blogFollowingFragment0, Long long0) {
        Intrinsics.checkNotNullParameter(blogFollowViewModel0, "$this_apply");
        Intrinsics.checkNotNullParameter(blogFollowingFragment0, "this$0");
        Intrinsics.checkNotNull(long0);
        blogFollowViewModel0.updateFollowingTotalCount(((long)long0));
        ((TopViewModel)blogFollowingFragment0.k.getValue()).updateTitleInfo(StringExtensionKt.toFormattedString$default(((long)long0), 0, 1, null));
    }

    public final void a() {
        TopViewModel topViewModel0 = (TopViewModel)this.k.getValue();
        String s = this.getString(Type.FOLLOWING.getTitleStringId());
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        TopViewModel.setTopView$default(topViewModel0, s, null, ((BlogFollowViewModel)this.l.getValue()).getSortItems(Type.FOLLOWING), null, 10, null);
        topViewModel0.getSelectedSortItem().observe(this.getViewLifecycleOwner(), new s0(new k0(this)));
        topViewModel0.getShowBottomSortDialog().observe(this.getViewLifecycleOwner(), new s0(new n0(topViewModel0, this)));
        BlogFollowViewModel blogFollowViewModel0 = (BlogFollowViewModel)this.l.getValue();
        blogFollowViewModel0.getBlogFollowingTotalCount().observe(this.getViewLifecycleOwner(), new q(this, 3));
        LifecycleOwner lifecycleOwner0 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner0, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(blogFollowViewModel0.getGoToBlogActivity(), lifecycleOwner0, new o0(this));
        LifecycleOwner lifecycleOwner1 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner1, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(blogFollowViewModel0.getShowToast(), lifecycleOwner1, new p0(this));
        blogFollowViewModel0.getUpdatedTotalCount().observe(this.getViewLifecycleOwner(), new b(1, blogFollowViewModel0, this));
        LifecycleOwner lifecycleOwner2 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner2, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(blogFollowViewModel0.getShowErrorDialog(), lifecycleOwner2, new r0(this));
        BlogFollowViewModel.init$default(blogFollowViewModel0, null, 1, null);
    }

    public final void a(CombinedLoadStates combinedLoadStates0, Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x12FBFEBF);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x12FBFEBF, v, -1, "com.kakao.tistory.presentation.view.blog.BlogFollowingFragment.FollowingLoadingDialog (BlogFollowingFragment.kt:189)");
        }
        if(combinedLoadStates0.getRefresh() instanceof Loading) {
            LoadingDialogKt.LoadingDialog(composer1, 0);
        }
        else {
            function00.invoke();
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j0(this, combinedLoadStates0, function00, v));
        }
    }

    public static final void access$FollowingList(BlogFollowingFragment blogFollowingFragment0, LazyListState lazyListState0, LazyPagingItems lazyPagingItems0, Composer composer0, int v) {
        blogFollowingFragment0.getClass();
        Composer composer1 = composer0.startRestartGroup(0x63A044EB);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x63A044EB, v, -1, "com.kakao.tistory.presentation.view.blog.BlogFollowingFragment.FollowingList (BlogFollowingFragment.kt:85)");
        }
        State state0 = LiveDataAdapterKt.observeAsState(((BlogFollowViewModel)blogFollowingFragment0.l.getValue()).getUpdatedBlog(), null, composer1, 56);
        composer1.startReplaceGroup(0x67F1CF0C);
        State state1 = composer1.rememberedValue();
        if(state1 == Composer.Companion.getEmpty()) {
            state1 = SnapshotStateKt.derivedStateOf(new i0(lazyPagingItems0));
            composer1.updateRememberedValue(state1);
        }
        composer1.endReplaceGroup();
        LazyDslKt.LazyColumn(null, lazyListState0, null, false, null, null, null, false, new g0(lazyPagingItems0, blogFollowingFragment0, state1, state0), composer1, v << 3 & 0x70, 0xFD);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h0(blogFollowingFragment0, lazyListState0, lazyPagingItems0, v));
        }
    }

    public static final Pair access$FollowingList$lambda$0(State state0) {
        return (Pair)state0.getValue();
    }

    public static final boolean access$FollowingList$lambda$2(State state0) {
        return ((Boolean)state0.getValue()).booleanValue();
    }

    public static final BlogFollowViewModel access$getBlogFollowViewModel(BlogFollowingFragment blogFollowingFragment0) {
        return (BlogFollowViewModel)blogFollowingFragment0.l.getValue();
    }

    public static final TopViewModel access$getTopViewModel(BlogFollowingFragment blogFollowingFragment0) {
        return (TopViewModel)blogFollowingFragment0.k.getValue();
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryComposeFragment
    public void onViewCreated(@NotNull View view0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        super.onViewCreated(view0, bundle0);
        this.a();
    }
}

