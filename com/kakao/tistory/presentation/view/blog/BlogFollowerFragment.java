package com.kakao.tistory.presentation.view.blog;

import a5.b;
import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString.Builder;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.paging.CombinedLoadStates;
import androidx.paging.LoadState.Loading;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItemsKt;
import com.google.accompanist.swiperefresh.SwipeRefreshKt;
import com.google.accompanist.swiperefresh.SwipeRefreshState;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.domain.entity.SortItem;
import com.kakao.tistory.domain.entity.User;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.common.extension.StringExtensionKt;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import com.kakao.tistory.presentation.design.ui.thumbnail.BlogThumbnailKt;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiStateKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.view.common.bottomsheet.CommonBottomDialogFragment;
import com.kakao.tistory.presentation.viewmodel.BlogFollowViewModel.Type;
import com.kakao.tistory.presentation.viewmodel.BlogFollowViewModel;
import com.kakao.tistory.presentation.viewmodel.TopViewModel;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import com.kakao.tistory.presentation.widget.dialog.LoadingDialogKt;
import d;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@AndroidEntryPoint
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00042\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\bH\u0017¢\u0006\u0004\b\u000B\u0010\fJ+\u0010\u0011\u001A\u00020\b2\u0006\u0010\u000E\u001A\u00020\r2\u0012\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u000FH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0016²\u0006\f\u0010\u0015\u001A\u00020\u00148\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/blog/BlogFollowerFragment;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryComposeFragment;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Content", "(Landroidx/compose/runtime/Composer;I)V", "Lcom/kakao/tistory/domain/entity/User;", "user", "Lkotlin/Function1;", "onClickFollower", "BlogFollow", "(Lcom/kakao/tistory/domain/entity/User;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Companion", "", "isEmpty", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogFollowerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogFollowerFragment.kt\ncom/kakao/tistory/presentation/view/blog/BlogFollowerFragment\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 10 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 11 Composer.kt\nandroidx/compose/runtime/Updater\n+ 12 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 13 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n+ 14 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,266:1\n14#2,4:267\n14#2,4:287\n1#3:271\n1#3:291\n1#3:313\n106#4,15:272\n106#4,15:292\n1223#5,6:307\n1240#6:314\n148#7:315\n148#7:316\n148#7:353\n148#7:354\n148#7:397\n98#8:317\n95#8,6:318\n101#8:352\n105#8:401\n78#9,6:324\n85#9,4:339\n89#9,2:349\n78#9,6:362\n85#9,4:377\n89#9,2:387\n93#9:395\n93#9:400\n368#10,9:330\n377#10:351\n368#10,9:368\n377#10:389\n378#10,2:393\n378#10,2:398\n4032#11,6:343\n4032#11,6:381\n85#12:355\n82#12,6:356\n88#12:390\n92#12:396\n95#13,2:391\n81#14:402\n*S KotlinDebug\n*F\n+ 1 BlogFollowerFragment.kt\ncom/kakao/tistory/presentation/view/blog/BlogFollowerFragment\n*L\n76#1:267,4\n77#1:287,4\n76#1:271\n77#1:291\n76#1:272,15\n77#1:292,15\n118#1:307,6\n168#1:314\n181#1:315\n184#1:316\n189#1:353\n194#1:354\n217#1:397\n179#1:317\n179#1:318,6\n179#1:352\n179#1:401\n179#1:324,6\n179#1:339,4\n179#1:349,2\n192#1:362,6\n192#1:377,4\n192#1:387,2\n192#1:395\n179#1:400\n179#1:330,9\n179#1:351\n192#1:368,9\n192#1:389\n192#1:393,2\n179#1:398,2\n179#1:343,6\n192#1:381,6\n192#1:355\n192#1:356,6\n192#1:390\n192#1:396\n200#1:391,2\n118#1:402\n*E\n"})
public final class BlogFollowerFragment extends Hilt_BlogFollowerFragment {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/kakao/tistory/presentation/view/blog/BlogFollowerFragment$Companion;", "", "", "blogName", "Lcom/kakao/tistory/presentation/view/blog/BlogFollowerFragment;", "newInstance", "(Ljava/lang/String;)Lcom/kakao/tistory/presentation/view/blog/BlogFollowerFragment;", "BUNDLE_BLOG_NAME", "Ljava/lang/String;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final BlogFollowerFragment newInstance(@Nullable String s) {
            BlogFollowerFragment blogFollowerFragment0 = new BlogFollowerFragment();
            Bundle bundle0 = new Bundle();
            bundle0.putString("BUNDLE_BLOG_NAME", s);
            blogFollowerFragment0.setArguments(bundle0);
            return blogFollowerFragment0;
        }

        public static BlogFollowerFragment newInstance$default(Companion blogFollowerFragment$Companion0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                s = null;
            }
            return blogFollowerFragment$Companion0.newInstance(s);
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public String k;
    public final BaseViewModelLazy l;
    public final BaseViewModelLazy m;

    static {
        BlogFollowerFragment.Companion = new Companion(null);
        BlogFollowerFragment.$stable = 8;
    }

    public BlogFollowerFragment() {
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.4 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$40 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.4(new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels.2(this));
        Lazy lazy0 = c.lazy(LazyThreadSafetyMode.NONE, tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$40);
        this.l = new BaseViewModelLazy(this, FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TopViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.5(lazy0), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.6(null, lazy0), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.7(this, lazy0)));
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.4 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$41 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.4(new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels.2(this));
        Lazy lazy1 = c.lazy(LazyThreadSafetyMode.NONE, tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$41);
        this.m = new BaseViewModelLazy(this, FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BlogFollowViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.5(lazy1), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.6(null, lazy1), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.7(this, lazy1)));
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void BlogFollow(@NotNull User user0, @NotNull Function1 function10, @Nullable Composer composer0, int v) {
        String s6;
        AnnotatedString annotatedString0;
        int v1;
        Intrinsics.checkNotNullParameter(user0, "user");
        Intrinsics.checkNotNullParameter(function10, "onClickFollower");
        Composer composer1 = composer0.startRestartGroup(0xFC7067FE);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xFC7067FE, v, -1, "com.kakao.tistory.presentation.view.blog.BlogFollowerFragment.BlogFollow (BlogFollowerFragment.kt:157)");
        }
        Blog blog0 = user0.getDefaultBlog();
        if(blog0 == null) {
            v1 = string.label_blog_name_with_sub_text1;
        }
        else {
            String s = blog0.getName();
            if(s == null) {
                v1 = string.label_blog_name_with_sub_text1;
            }
            else {
                if(p.isBlank(s)) {
                    s = null;
                }
                v1 = s == null ? string.label_blog_name_with_sub_text1 : string.label_blog_name_with_sub_text2;
            }
        }
        String s1 = StringResources_androidKt.stringResource(v1, composer1, 0);
        String s2 = user0.getName();
        String s3 = s2 == null ? null : StringUtils.INSTANCE.getEllipsisText(s2, 14);
        composer1.startReplaceGroup(-1675797028);
        if(s3 == null) {
            annotatedString0 = null;
        }
        else {
            String s4 = b.f(1, s1, "format(...)", new Object[]{s3});
            composer1.startReplaceGroup(-1675794004);
            Builder annotatedString$Builder0 = new Builder(0, 1, null);
            annotatedString$Builder0.append(s4);
            annotatedString$Builder0.addStyle(new SpanStyle(ColorResources_androidKt.colorResource(color.gray1, composer1, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0xFFFE, null), 0, s3.length());
            annotatedString$Builder0.addStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0xFFFB, null), 0, s3.length());
            annotatedString0 = annotatedString$Builder0.toAnnotatedString();
            composer1.endReplaceGroup();
        }
        composer1.endReplaceGroup();
        if(annotatedString0 == null) {
            annotatedString0 = new AnnotatedString("", null, null, 6, null);
        }
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(ClickableKt.clickable-XHw0xAI$default(SizeKt.fillMaxWidth$default(SizeKt.height-3ABfNKs(modifier$Companion0, 80.0f), 0.0f, 1, null), false, null, null, new a(function10, user0), 7, null), 20.0f, 0.0f, 4.0f, 0.0f, 10, null);
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        Arrangement arrangement0 = Arrangement.INSTANCE;
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
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
        String s5 = user0.getProfileImageUrl();
        BlogThumbnailKt.BlogThumbnail-EUb7tLY((s5 == null ? null : ThumbnailUiStateKt.toBlogThumbnailItem(s5)), 48.0f, null, false, null, composer1, 0x30, 28);
        Modifier modifier2 = RowScope.weight$default(RowScopeInstance.INSTANCE, PaddingKt.padding-VpY3zN4$default(modifier$Companion0, 15.0f, 0.0f, 2, null), 1.0f, false, 2, null);
        MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
        int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
            d.a(v3, composer1, v3, function21);
        }
        Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
        TextUnitKt.checkArithmetic--R2X_6o(5303949066L);
        TextStyle textStyle0 = MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getH5();
        long v4 = ColorResources_androidKt.colorResource(color.gray2, composer1, 0);
        int v5 = MaterialTheme.$stable;
        MaterialTheme materialTheme0 = MaterialTheme.INSTANCE;
        ExcludeFontPaddingTextKt.Text-edWjEy0(annotatedString0, null, v4, 0L, null, null, null, 0x1BC23D70AL, null, null, 0L, 2, false, false, 1, 0, null, null, textStyle0, composer1, 0, 0x6C30, 0x3977A);
        Blog blog1 = user0.getDefaultBlog();
        if(blog1 == null) {
            s6 = "";
        }
        else {
            s6 = blog1.getTitle();
            if(s6 == null) {
                s6 = "";
            }
        }
        ExcludeFontPaddingTextKt.Text-IbK3jfQ(s6, null, 0L, 0x141600000L, null, null, null, 0L, null, null, 0L, 2, false, false, 1, 0, null, TypeKt.getSubtext2(materialTheme0.getTypography(composer1, v5)), composer1, 0xC00, 0x6C30, 0x197F6);
        composer1.endNode();
        Modifier modifier4 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 7.0f, 0.0f, 0.0f, 1.0f, 6, null);
        IconButtonKt.IconButton(new com.kakao.tistory.presentation.view.blog.b(function10, user0), modifier4, false, null, ComposableSingletons.BlogFollowerFragmentKt.INSTANCE.getLambda-2$presentation_prodRelease(), composer1, 0x6030, 12);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new com.kakao.tistory.presentation.view.blog.c(this, user0, function10, v));
        }
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryComposeFragment
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public void Content(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x63024E5C);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x63024E5C, v, -1, "com.kakao.tistory.presentation.view.blog.BlogFollowerFragment.Content (BlogFollowerFragment.kt:87)");
        }
        com.kakao.tistory.presentation.view.blog.d d0 = new com.kakao.tistory.presentation.view.blog.d(null);
        EffectsKt.LaunchedEffect(Unit.INSTANCE, d0, composer1, 70);
        LazyPagingItems lazyPagingItems0 = LazyPagingItemsKt.collectAsLazyPagingItems(((BlogFollowViewModel)this.m.getValue()).getBlogFollowers(), null, composer1, 8, 1);
        SwipeRefreshState swipeRefreshState0 = SwipeRefreshKt.rememberSwipeRefreshState(false, composer1, 6);
        LazyListState lazyListState0 = LazyListStateKt.rememberLazyListState(0, 0, composer1, 0, 3);
        SwipeRefreshKt.SwipeRefresh-Fsagccs(swipeRefreshState0, new e(lazyPagingItems0), null, false, 0.0f, null, null, null, false, ComposableLambdaKt.rememberComposableLambda(-313420571, true, new f(this, lazyListState0, lazyPagingItems0), composer1, 54), composer1, 0x30000000, 508);
        this.a(lazyPagingItems0.getLoadState(), new g(((BlogFollowViewModel)this.m.getValue())), composer1, 520);
        this.ToolbarVisibilityHandler(lazyListState0, composer1, 0x40);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h(this, v));
        }
    }

    public static final void a(BlogFollowerFragment blogFollowerFragment0, SortItem sortItem0) {
        Intrinsics.checkNotNullParameter(blogFollowerFragment0, "this$0");
        if(sortItem0 != null) {
            ((BlogFollowViewModel)blogFollowerFragment0.m.getValue()).updateBlogFollowerSortType(sortItem0);
        }
    }

    public static final void a(BlogFollowerFragment blogFollowerFragment0, Long long0) {
        Intrinsics.checkNotNullParameter(blogFollowerFragment0, "this$0");
        TopViewModel topViewModel0 = (TopViewModel)blogFollowerFragment0.l.getValue();
        Intrinsics.checkNotNull(long0);
        topViewModel0.updateTitleInfo(StringExtensionKt.toFormattedString$default(((long)long0), 0, 1, null));
    }

    public static final void a(TopViewModel topViewModel0, BlogFollowerFragment blogFollowerFragment0, Boolean boolean0) {
        Intrinsics.checkNotNullParameter(topViewModel0, "$this_apply");
        Intrinsics.checkNotNullParameter(blogFollowerFragment0, "this$0");
        List list0 = (List)topViewModel0.getSortItems().getValue();
        if(list0 != null) {
            CommonBottomDialogFragment commonBottomDialogFragment0 = CommonBottomDialogFragment.Companion.newInstance();
            commonBottomDialogFragment0.setItems(list0);
            commonBottomDialogFragment0.setOnSelectedItem(new s(topViewModel0));
            commonBottomDialogFragment0.show(blogFollowerFragment0.getChildFragmentManager(), "CommonBottomDialogFragment");
        }
    }

    public final void a() {
        TopViewModel topViewModel0 = (TopViewModel)this.l.getValue();
        String s = this.getString(Type.FOLLOWER.getTitleStringId());
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        TopViewModel.setTopView$default(topViewModel0, s, null, ((BlogFollowViewModel)this.m.getValue()).getSortItems(Type.FOLLOWER), null, 10, null);
        topViewModel0.getSelectedSortItem().observe(this.getViewLifecycleOwner(), new gc.a(this, 0));
        topViewModel0.getShowBottomSortDialog().observe(this.getViewLifecycleOwner(), new gc.b(0, topViewModel0, this));
        BlogFollowViewModel blogFollowViewModel0 = (BlogFollowViewModel)this.m.getValue();
        blogFollowViewModel0.getBlogFollowerTotalCount().observe(this.getViewLifecycleOwner(), new gc.a(this, 1));
        LifecycleOwner lifecycleOwner0 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner0, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(blogFollowViewModel0.getGoToBlogActivity(), lifecycleOwner0, new t(this));
        ((BlogFollowViewModel)this.m.getValue()).init(this.k);
    }

    public final void a(CombinedLoadStates combinedLoadStates0, Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(2018726568);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2018726568, v, -1, "com.kakao.tistory.presentation.view.blog.BlogFollowerFragment.FollowerLoadingDialog (BlogFollowerFragment.kt:108)");
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
            scopeUpdateScope0.updateScope(new q(this, combinedLoadStates0, function00, v));
        }
    }

    public static final void access$FollowerList(BlogFollowerFragment blogFollowerFragment0, LazyListState lazyListState0, LazyPagingItems lazyPagingItems0, Composer composer0, int v) {
        blogFollowerFragment0.getClass();
        Composer composer1 = composer0.startRestartGroup(0xC730ECD4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xC730ECD4, v, -1, "com.kakao.tistory.presentation.view.blog.BlogFollowerFragment.FollowerList (BlogFollowerFragment.kt:116)");
        }
        composer1.startReplaceGroup(0xE81E285);
        State state0 = composer1.rememberedValue();
        if(state0 == Composer.Companion.getEmpty()) {
            state0 = SnapshotStateKt.derivedStateOf(new com.kakao.tistory.presentation.view.blog.p(lazyPagingItems0));
            composer1.updateRememberedValue(state0);
        }
        composer1.endReplaceGroup();
        LazyDslKt.LazyColumn(null, lazyListState0, null, false, null, null, null, false, new n(lazyPagingItems0, blogFollowerFragment0, state0), composer1, v << 3 & 0x70, 0xFD);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o(blogFollowerFragment0, lazyListState0, lazyPagingItems0, v));
        }
    }

    public static final boolean access$FollowerList$lambda$1(State state0) {
        return ((Boolean)state0.getValue()).booleanValue();
    }

    public static final BlogFollowViewModel access$getBlogFollowViewModel(BlogFollowerFragment blogFollowerFragment0) {
        return (BlogFollowViewModel)blogFollowerFragment0.m.getValue();
    }

    public static final TopViewModel access$getTopViewModel(BlogFollowerFragment blogFollowerFragment0) {
        return (TopViewModel)blogFollowerFragment0.l.getValue();
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryComposeFragment
    public void onViewCreated(@NotNull View view0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        super.onViewCreated(view0, bundle0);
        Bundle bundle1 = this.getArguments();
        this.k = bundle1 == null ? null : bundle1.getString("BUNDLE_BLOG_NAME");
        this.a();
    }
}

