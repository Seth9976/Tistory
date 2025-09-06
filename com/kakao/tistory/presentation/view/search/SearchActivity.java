package com.kakao.tistory.presentation.view.search;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.lifecycle.ViewModelLazy;
import com.kakao.android.base.tiara.TiaraListener;
import com.kakao.android.base.tiara.TiaraSection;
import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.viewmodel.SearchResultViewModel;
import com.kakao.tistory.presentation.viewmodel.SearchViewModel;
import com.kakao.tistory.presentation.viewmodel.TopViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

@StabilityInferred(parameters = 0)
@TiaraSection(section = "검색")
@AndroidEntryPoint
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0003\u0012\u0013\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000B\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\tH\u0017¢\u0006\u0004\b\u000B\u0010\fJ\u0017\u0010\u000F\u001A\u00020\u00062\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0011\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0003¨\u0006\u001C²\u0006\u0014\u0010\u0017\u001A\n \u0016*\u0004\u0018\u00010\u00150\u00158\nX\u008A\u0084\u0002²\u0006\f\u0010\u0019\u001A\u00020\u00188\nX\u008A\u0084\u0002²\u0006\u000E\u0010\u001B\u001A\u0004\u0018\u00010\u001A8\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/search/SearchActivity;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryComposeActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroidx/compose/ui/Modifier;", "modifier", "Content", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Lcom/kakao/android/base/tiara/TiaraListener;", "tiaraListener", "trackPage", "(Lcom/kakao/android/base/tiara/TiaraListener;)V", "onBackPressed", "Companion", "RedirectDestination", "SearchViewType", "", "kotlin.jvm.PlatformType", "search", "", "isTextAttached", "Lcom/kakao/tistory/presentation/view/search/SearchActivity$SearchViewType;", "searchViewType", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchActivity.kt\ncom/kakao/tistory/presentation/view/search/SearchActivity\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,263:1\n10#2,2:264\n10#2,2:280\n10#2,2:296\n1#3:266\n1#3:282\n1#3:298\n75#4,13:267\n75#4,13:283\n75#4,13:299\n77#5:312\n77#5:313\n*S KotlinDebug\n*F\n+ 1 SearchActivity.kt\ncom/kakao/tistory/presentation/view/search/SearchActivity\n*L\n74#1:264,2\n75#1:280,2\n76#1:296,2\n74#1:266\n75#1:282\n76#1:298\n74#1:267,13\n75#1:283,13\n76#1:299,13\n91#1:312\n92#1:313\n*E\n"})
public final class SearchActivity extends Hilt_SearchActivity {
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001J7\u0010\n\u001A\u00020\t2\u0006\u0010\u0003\u001A\u00020\u00022\b\u0010\u0005\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000BR\u0014\u0010\f\u001A\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000E\u001A\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000E\u0010\rR\u0014\u0010\u000F\u001A\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000F\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/kakao/tistory/presentation/view/search/SearchActivity$Companion;", "", "Landroid/content/Context;", "context", "", "searchKeyword", "blogName", "Lcom/kakao/tistory/presentation/view/search/SearchActivity$RedirectDestination;", "destination", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/presentation/view/search/SearchActivity$RedirectDestination;)Landroid/content/Intent;", "EXTRA_BLOG_NAME", "Ljava/lang/String;", "EXTRA_REDIRECT_DESTINATION", "EXTRA_SEARCH_KEYWORD", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Intent createIntent(@NotNull Context context0, @Nullable String s, @Nullable String s1, @Nullable RedirectDestination searchActivity$RedirectDestination0) {
            Intrinsics.checkNotNullParameter(context0, "context");
            Intent intent0 = new Intent(context0, SearchActivity.class);
            intent0.putExtra("EXTRA_SEARCH_KEYWORD", s);
            intent0.putExtra("EXTRA_BLOG_NAME", s1);
            if(searchActivity$RedirectDestination0 == null) {
                searchActivity$RedirectDestination0 = RedirectDestination.NONE;
            }
            intent0.putExtra("EXTRA_REDIRECT_DESTINATION", searchActivity$RedirectDestination0);
            return intent0;
        }

        public static Intent createIntent$default(Companion searchActivity$Companion0, Context context0, String s, String s1, RedirectDestination searchActivity$RedirectDestination0, int v, Object object0) {
            if((v & 4) != 0) {
                s1 = null;
            }
            if((v & 8) != 0) {
                searchActivity$RedirectDestination0 = null;
            }
            return searchActivity$Companion0.createIntent(context0, s, s1, searchActivity$RedirectDestination0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/presentation/view/search/SearchActivity$RedirectDestination;", "", "NONE", "POST", "TAG", "BLOG", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum RedirectDestination {
        NONE,
        POST,
        TAG,
        BLOG;

        public static final RedirectDestination[] a;
        public static final EnumEntries b;

        static {
            RedirectDestination.a = arr_searchActivity$RedirectDestination;
            Intrinsics.checkNotNullParameter(arr_searchActivity$RedirectDestination, "entries");
            RedirectDestination.b = new a(arr_searchActivity$RedirectDestination);
        }

        @NotNull
        public static EnumEntries getEntries() {
            return RedirectDestination.b;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000E\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000B"}, d2 = {"Lcom/kakao/tistory/presentation/view/search/SearchActivity$SearchViewType;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "SUGGEST", "RESULT", "PRE_RESULT", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum SearchViewType {
        SUGGEST("suggest"),
        RESULT("result"),
        PRE_RESULT("result");

        public final String a;
        public static final SearchViewType[] b;
        public static final EnumEntries c;

        static {
            SearchViewType.b = arr_searchActivity$SearchViewType;
            Intrinsics.checkNotNullParameter(arr_searchActivity$SearchViewType, "entries");
            SearchViewType.c = new a(arr_searchActivity$SearchViewType);
        }

        public SearchViewType(String s1) {
            this.a = s1;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return SearchViewType.c;
        }

        @NotNull
        public final String getValue() {
            return this.a;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final BaseViewModelLazy k;
    public final BaseViewModelLazy l;
    public final BaseViewModelLazy m;
    public final FocusRequester n;

    static {
        SearchActivity.Companion = new Companion(null);
        SearchActivity.$stable = 8;
    }

    public SearchActivity() {
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1(this);
        this.k = new BaseViewModelLazy(this, new ViewModelLazy(Reflection.getOrCreateKotlinClass(SearchViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.2(this), tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10, new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.3(null, this)));
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$11 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1(this);
        this.l = new BaseViewModelLazy(this, new ViewModelLazy(Reflection.getOrCreateKotlinClass(SearchResultViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.2(this), tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$11, new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.3(null, this)));
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$12 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1(this);
        this.m = new BaseViewModelLazy(this, new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.2(this), tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$12, new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.3(null, this)));
        this.n = new FocusRequester();
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryComposeActivity
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public void Content(@NotNull Modifier modifier0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(modifier0, "modifier");
        Composer composer1 = composer0.startRestartGroup(0x9AF9256D);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x9AF9256D, v, -1, "com.kakao.tistory.presentation.view.search.SearchActivity.Content (SearchActivity.kt:89)");
        }
        SoftwareKeyboardController softwareKeyboardController0 = (SoftwareKeyboardController)composer1.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
        FocusManager focusManager0 = (FocusManager)composer1.consume(CompositionLocalsKt.getLocalFocusManager());
        ScaffoldKt.Scaffold-27mzLpw(null, null, ComposableLambdaKt.rememberComposableLambda(0x3EBE688, true, new q(this), composer1, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(0x1D80B3EF, true, new t(this, focusManager0, softwareKeyboardController0), composer1, 54), composer1, 0x180, 0xC00000, 0x1FFFB);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new u(this, modifier0, v));
        }
    }

    public static final SearchViewModel access$getSearchViewModel(SearchActivity searchActivity0) {
        return (SearchViewModel)searchActivity0.k.getValue();
    }

    public static final void access$updatePageView(SearchActivity searchActivity0, SearchViewType searchActivity$SearchViewType0) {
        boolean z = ((SearchViewModel)searchActivity0.k.getValue()).isBlogSearch();
        if(searchActivity$SearchViewType0 == SearchViewType.SUGGEST) {
            searchActivity0.setPage((z ? "개별검색입력" : "전체검색입력"));
        }
        else if(searchActivity$SearchViewType0 == SearchViewType.RESULT) {
            searchActivity0.setPage((z ? "개별검색결과" : "전체검색결과"));
        }
        searchActivity0.setAction("");
        ((SearchViewModel)searchActivity0.k.getValue()).updatePageInfo(searchActivity0.getSection(), searchActivity0.getPage());
        ((SearchResultViewModel)searchActivity0.l.getValue()).updatePageInfo(searchActivity0.getSection(), searchActivity0.getPage());
        ((TopViewModel)searchActivity0.m.getValue()).updatePageInfo(searchActivity0.getSection(), searchActivity0.getPage());
        TiaraUtils.trackPage$default(TiaraUtils.INSTANCE, searchActivity0, null, null, null, 14, null);
    }

    @Override  // androidx.activity.ComponentActivity
    public void onBackPressed() {
        ((SearchViewModel)this.k.getValue()).onClickBackButton();
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryComposeActivity
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        Bundle bundle1 = this.getIntent().getExtras();
        if(bundle1 != null) {
            String s = bundle1.getString("EXTRA_SEARCH_KEYWORD");
            if(s != null) {
                ((SearchViewModel)this.k.getValue()).getSearchKeyword().setValue(s);
            }
            ((SearchViewModel)this.k.getValue()).setBlogName(bundle1.getString("EXTRA_BLOG_NAME", null));
            SearchViewModel searchViewModel0 = (SearchViewModel)this.k.getValue();
            Serializable serializable0 = bundle1.getSerializable("EXTRA_REDIRECT_DESTINATION");
            Intrinsics.checkNotNull(serializable0, "null cannot be cast to non-null type com.kakao.tistory.presentation.view.search.SearchActivity.RedirectDestination");
            searchViewModel0.setRedirectDestination(((RedirectDestination)serializable0));
        }
        if(((SearchViewModel)this.k.getValue()).getRedirectDestination() == RedirectDestination.NONE) {
            Window window0 = this.getWindow();
            if(window0 != null) {
                window0.setSoftInputMode(52);
            }
            ((SearchViewModel)this.k.getValue()).setRedirectDestination(null);
        }
        else {
            ((SearchViewModel)this.k.getValue()).doSearch();
        }
        SearchViewModel searchViewModel1 = (SearchViewModel)this.k.getValue();
        LiveDataExtensionKt.observeEvent(searchViewModel1.getGoToAllSearchActivity(), this, new v(this, searchViewModel1));
        LiveDataExtensionKt.observeEvent(searchViewModel1.getShowRemoveAllDialog(), this, new x(this));
        SearchResultViewModel searchResultViewModel0 = (SearchResultViewModel)this.l.getValue();
        LiveDataExtensionKt.observeEvent(searchResultViewModel0.getGoToEntry(), this, new y(searchResultViewModel0, this));
        LiveDataExtensionKt.observeEvent(searchResultViewModel0.getGoToBlog(), this, new z(this));
        LiveDataExtensionKt.observeEvent(searchResultViewModel0.getShowToast(), this, new a0(this));
        LiveDataExtensionKt.observeEvent(searchResultViewModel0.getShowErrorDialog(), this, new c0(this));
        TopViewModel topViewModel0 = (TopViewModel)this.m.getValue();
        TopViewModel.setTopView$default(topViewModel0, "", null, ((SearchResultViewModel)this.l.getValue()).getSortItem(), null, 10, null);
        topViewModel0.getShowBottomSortDialog().observe(this, new f0(new e0(topViewModel0, this)));
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryActivity
    public void trackPage(@NotNull TiaraListener tiaraListener0) {
        Intrinsics.checkNotNullParameter(tiaraListener0, "tiaraListener");
    }
}

