package com.kakao.tistory.presentation.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.tiara.data.ActionKind;
import com.kakao.tiara.data.Click;
import com.kakao.tistory.domain.entity.SearchItem.Bottom;
import com.kakao.tistory.domain.entity.SearchItem.Empty;
import com.kakao.tistory.domain.entity.SearchItem.Keyword;
import com.kakao.tistory.domain.entity.SearchKeywordItem;
import com.kakao.tistory.domain.repository.SearchRepository;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.common.extension.StringExtensionKt;
import com.kakao.tistory.presentation.common.tiara.TiaraActionType;
import com.kakao.tistory.presentation.view.search.SearchActivity.RedirectDestination;
import com.kakao.tistory.presentation.view.search.SearchActivity.SearchViewType;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.w;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u001B\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u001F\u0010\n\u001A\u00020\t2\b\u0010\u0007\u001A\u0004\u0018\u00010\u00062\u0006\u0010\b\u001A\u00020\u0006\u00A2\u0006\u0004\b\n\u0010\u000BJ\r\u0010\f\u001A\u00020\t\u00A2\u0006\u0004\b\f\u0010\rJ\r\u0010\u000E\u001A\u00020\t\u00A2\u0006\u0004\b\u000E\u0010\rJ\u0015\u0010\u0010\u001A\u00020\t2\u0006\u0010\u000F\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001A\u00020\t2\u0006\u0010\u0013\u001A\u00020\u0012\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u001D\u0010\u0019\u001A\u00020\t2\u0006\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u0013\u001A\u00020\u0018\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0015\u0010\u001D\u001A\u00020\u001C2\u0006\u0010\u001B\u001A\u00020\u0016\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\r\u0010\u001F\u001A\u00020\t\u00A2\u0006\u0004\b\u001F\u0010\rJ\u0015\u0010 \u001A\u00020\t2\u0006\u0010\u0013\u001A\u00020\u0012\u00A2\u0006\u0004\b \u0010\u0015J\r\u0010!\u001A\u00020\t\u00A2\u0006\u0004\b!\u0010\rJ\r\u0010\"\u001A\u00020\t\u00A2\u0006\u0004\b\"\u0010\rJ\r\u0010#\u001A\u00020\t\u00A2\u0006\u0004\b#\u0010\rJ\r\u0010$\u001A\u00020\t\u00A2\u0006\u0004\b$\u0010\rJ\r\u0010%\u001A\u00020\t\u00A2\u0006\u0004\b%\u0010\rJ\u0015\u0010\'\u001A\u00020\u001C2\u0006\u0010&\u001A\u00020\u0006\u00A2\u0006\u0004\b\'\u0010(J\r\u0010)\u001A\u00020\t\u00A2\u0006\u0004\b)\u0010\rJ\r\u0010*\u001A\u00020\t\u00A2\u0006\u0004\b*\u0010\rJ\r\u0010+\u001A\u00020\t\u00A2\u0006\u0004\b+\u0010\rJ\u0019\u0010,\u001A\u00020\t2\n\b\u0002\u0010&\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\u0004\b,\u0010\u0011J%\u00100\u001A\u00020\t2\u0006\u0010-\u001A\u00020\u00062\u0006\u0010.\u001A\u00020\u00062\u0006\u0010/\u001A\u00020\u001C\u00A2\u0006\u0004\b0\u00101R$\u00107\u001A\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b2\u00103\u001A\u0004\b4\u00105\"\u0004\b6\u0010\u0011R$\u0010?\u001A\u0004\u0018\u0001088\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b9\u0010:\u001A\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001D\u0010E\u001A\b\u0012\u0004\u0012\u00020\u00060@8\u0006\u00A2\u0006\f\n\u0004\bA\u0010B\u001A\u0004\bC\u0010DR#\u0010J\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0F0@8\u0006\u00A2\u0006\f\n\u0004\bH\u0010B\u001A\u0004\bI\u0010DR\u001D\u0010N\u001A\b\u0012\u0004\u0012\u00020K0@8\u0006\u00A2\u0006\f\n\u0004\bL\u0010B\u001A\u0004\bM\u0010DR\u0011\u0010O\u001A\u00020\u001C8F\u00A2\u0006\u0006\u001A\u0004\bO\u0010PR\u001D\u0010U\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0R0Q8F\u00A2\u0006\u0006\u001A\u0004\bS\u0010TR\u001D\u0010W\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0R0Q8F\u00A2\u0006\u0006\u001A\u0004\bV\u0010TR\u001D\u0010X\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0R0Q8F\u00A2\u0006\u0006\u001A\u0004\bX\u0010TR\u001D\u0010Y\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0R0Q8F\u00A2\u0006\u0006\u001A\u0004\bY\u0010T\u00A8\u0006Z"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/SearchViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "Lcom/kakao/tistory/domain/repository/SearchRepository;", "searchRepository", "<init>", "(Lcom/kakao/tistory/domain/repository/SearchRepository;)V", "", "section", "page", "", "updatePageInfo", "(Ljava/lang/String;Ljava/lang/String;)V", "clearText", "()V", "onClickInputField", "s", "onTextChanged", "(Ljava/lang/String;)V", "Lcom/kakao/tistory/domain/entity/SearchKeywordItem;", "item", "onClickKeywordAttach", "(Lcom/kakao/tistory/domain/entity/SearchKeywordItem;)V", "", "position", "Lcom/kakao/tistory/domain/entity/SearchItem$Keyword;", "onClickKeyword", "(ILcom/kakao/tistory/domain/entity/SearchItem$Keyword;)V", "actionId", "", "onEditorAction", "(I)Z", "onClickSearch", "onClickKeywordRemove", "onClickRemoveAll", "onClickGoToAllSearch", "onClickRecentOnOffSwitch", "onClickRecommendOnOffSwitch", "onClickBackButton", "keyword", "isSameCurrentKeyword", "(Ljava/lang/String;)Z", "doSearch", "removeAllRecentKeyword", "getRecentKeywords", "getSuggestKeywords", "from", "to", "isFromSwipe", "trackTiaraViewPager", "(Ljava/lang/String;Ljava/lang/String;Z)V", "h", "Ljava/lang/String;", "getBlogName", "()Ljava/lang/String;", "setBlogName", "blogName", "Lcom/kakao/tistory/presentation/view/search/SearchActivity$RedirectDestination;", "i", "Lcom/kakao/tistory/presentation/view/search/SearchActivity$RedirectDestination;", "getRedirectDestination", "()Lcom/kakao/tistory/presentation/view/search/SearchActivity$RedirectDestination;", "setRedirectDestination", "(Lcom/kakao/tistory/presentation/view/search/SearchActivity$RedirectDestination;)V", "redirectDestination", "Landroidx/lifecycle/MutableLiveData;", "j", "Landroidx/lifecycle/MutableLiveData;", "getSearchKeyword", "()Landroidx/lifecycle/MutableLiveData;", "searchKeyword", "", "Lcom/kakao/tistory/domain/entity/SearchItem;", "k", "getSuggestItems", "suggestItems", "Lcom/kakao/tistory/presentation/view/search/SearchActivity$SearchViewType;", "l", "getSearchViewType", "searchViewType", "isBlogSearch", "()Z", "Landroidx/lifecycle/LiveData;", "Lcom/kakao/tistory/presentation/common/extension/Event;", "getGoToAllSearchActivity", "()Landroidx/lifecycle/LiveData;", "goToAllSearchActivity", "getShowRemoveAllDialog", "showRemoveAllDialog", "isTextAttached", "isTextCleared", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSearchViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchViewModel.kt\ncom/kakao/tistory/presentation/viewmodel/SearchViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,299:1\n1#2:300\n*E\n"})
public final class SearchViewModel extends TistoryViewModel {
    public static final int $stable = 8;
    public final SearchRepository g;
    public String h;
    public RedirectDestination i;
    public final MutableLiveData j;
    public final MutableLiveData k;
    public final MutableLiveData l;
    public final MutableLiveData m;
    public final MutableLiveData n;
    public final MutableLiveData o;
    public final MutableLiveData p;

    @Inject
    public SearchViewModel(@NotNull SearchRepository searchRepository0) {
        Intrinsics.checkNotNullParameter(searchRepository0, "searchRepository");
        super();
        this.g = searchRepository0;
        this.i = RedirectDestination.NONE;
        this.j = new MutableLiveData();
        this.k = new MutableLiveData();
        this.l = new MutableLiveData(SearchViewType.SUGGEST);
        this.m = new MutableLiveData();
        this.n = new MutableLiveData();
        this.o = new MutableLiveData();
        this.p = new MutableLiveData();
    }

    public final void a(TiaraActionType tiaraActionType0, String s, Integer integer0) {
        Object object0 = this.j.getValue();
        Click click0 = integer0 == null ? null : TiaraUtils.createClick$default(TiaraUtils.INSTANCE, null, null, null, null, null, String.valueOf(integer0.intValue()), null, null, null, null, 0x3DF, null);
        TiaraUtils.trackSearch$default(TiaraUtils.INSTANCE, this.getSection(), this.getPage(), tiaraActionType0, ActionKind.Search, ((String)object0), s, null, click0, 0x40, null);
    }

    public final void clearText() {
        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), this.getPage(), TiaraActionType.CLICK_SEARCH_INPUT_CLEAR, null, null, null, null, null, 0xF8, null);
        Event event0 = new Event(Unit.INSTANCE);
        this.p.setValue(event0);
        this.j.setValue("");
        this.l.setValue(SearchViewType.SUGGEST);
        this.getRecentKeywords();
    }

    public final void doSearch() {
        this.l.setValue(SearchViewType.RESULT);
        if(this.g.getRecentKeywordEnabled()) {
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new k4(this, null), 2, null);
        }
    }

    @Nullable
    public final String getBlogName() {
        return this.h;
    }

    @NotNull
    public final LiveData getGoToAllSearchActivity() {
        return this.m;
    }

    public final void getRecentKeywords() {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new e4(this, null), 3, null);
    }

    @Nullable
    public final RedirectDestination getRedirectDestination() {
        return this.i;
    }

    @NotNull
    public final MutableLiveData getSearchKeyword() {
        return this.j;
    }

    @NotNull
    public final MutableLiveData getSearchViewType() {
        return this.l;
    }

    @NotNull
    public final LiveData getShowRemoveAllDialog() {
        return this.n;
    }

    @NotNull
    public final MutableLiveData getSuggestItems() {
        return this.k;
    }

    public final void getSuggestKeywords(@Nullable String s) {
        if(s != null && s.length() != 0) {
            if(this.g.getRecommendKeywordEnabled()) {
                BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new g4(this, s, null), 3, null);
                return;
            }
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(new Empty(string.label_search_recommend_off_title));
            arrayList0.add(new Bottom(string.label_search_recommend_on, null, false, 6, null));
            this.k.setValue(arrayList0);
        }
    }

    public static void getSuggestKeywords$default(SearchViewModel searchViewModel0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = (String)searchViewModel0.j.getValue();
        }
        searchViewModel0.getSuggestKeywords(s);
    }

    public final boolean isBlogSearch() {
        return this.h == null || this.h.length() == 0 ? 0 : 1;
    }

    public final boolean isSameCurrentKeyword(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "keyword");
        return Intrinsics.areEqual(StringExtensionKt.getStringExcludeBold(s), this.j.getValue());
    }

    @NotNull
    public final LiveData isTextAttached() {
        return this.o;
    }

    @NotNull
    public final LiveData isTextCleared() {
        return this.p;
    }

    public final void onClickBackButton() {
        this.l.setValue(SearchViewType.PRE_RESULT);
    }

    public final void onClickGoToAllSearch() {
        this.a(TiaraActionType.CLICK_SEARCH_ALL_SEARCHING, "button", null);
        Event event0 = new Event(Unit.INSTANCE);
        this.m.setValue(event0);
    }

    public final void onClickInputField() {
        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), this.getPage(), TiaraActionType.CLICK_SEARCH_INPUT_FIELD, null, null, null, null, null, 0xF8, null);
    }

    public final void onClickKeyword(int v, @NotNull Keyword searchItem$Keyword0) {
        Intrinsics.checkNotNullParameter(searchItem$Keyword0, "item");
        String s = StringExtensionKt.getStringExcludeBold(searchItem$Keyword0.getKeywordItem().getKeyword());
        this.j.setValue(s);
        this.a((searchItem$Keyword0.isRecentKeyword() ? TiaraActionType.CLICK_SEARCH_RECENT_KEYWORD : TiaraActionType.CLICK_SEARCH_SUGGEST_KEYWORD), (searchItem$Keyword0.isRecentKeyword() ? "recent" : "suggest"), v);
        this.doSearch();
    }

    public final void onClickKeywordAttach(@NotNull SearchKeywordItem searchKeywordItem0) {
        Intrinsics.checkNotNullParameter(searchKeywordItem0, "item");
        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), this.getPage(), TiaraActionType.CLICK_SEARCH_SUGGEST_KEYWORD_ARROW, null, null, null, null, null, 0xF8, null);
        String s = StringExtensionKt.getStringExcludeBold(searchKeywordItem0.getKeyword());
        this.j.setValue(s);
    }

    public final void onClickKeywordRemove(@NotNull SearchKeywordItem searchKeywordItem0) {
        Intrinsics.checkNotNullParameter(searchKeywordItem0, "item");
        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), this.getPage(), TiaraActionType.CLICK_SEARCH_RECENT_KEYWORD_REMOVE, null, null, null, null, null, 0xF8, null);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new i4(this, searchKeywordItem0, null), 3, null);
    }

    public final void onClickRecentOnOffSwitch() {
        boolean z = this.g.getRecentKeywordEnabled();
        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), this.getPage(), (z ? TiaraActionType.CLICK_SEARCH_RECENT_KEYWORD_OFF : TiaraActionType.CLICK_SEARCH_RECENT_KEYWORD_ON), null, null, null, null, null, 0xF8, null);
        this.g.setRecentKeywordEnabled(!z);
        this.getRecentKeywords();
    }

    public final void onClickRecommendOnOffSwitch() {
        boolean z = this.g.getRecommendKeywordEnabled();
        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), this.getPage(), (z ? TiaraActionType.CLICK_SEARCH_SUGGEST_KEYWORD_OFF : TiaraActionType.CLICK_SEARCH_SUGGEST_KEYWORD_ON), null, null, null, null, null, 0xF8, null);
        this.g.setRecommendKeywordEnabled(!z);
        this.getSuggestKeywords(((String)this.j.getValue()));
    }

    public final void onClickRemoveAll() {
        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), this.getPage(), TiaraActionType.CLICK_SEARCH_RECENT_KEYWORD_REMOVE_ALL, null, null, null, null, null, 0xF8, null);
        Event event0 = new Event(Unit.INSTANCE);
        this.n.setValue(event0);
    }

    public final void onClickSearch() {
        this.a(TiaraActionType.CLICK_SEARCH_SEARCHING, "searchIcon", null);
        this.doSearch();
    }

    public final boolean onEditorAction(int v) {
        if(v == 3) {
            this.a(TiaraActionType.CLICK_SEARCH_SEARCHING_FROM_KEYBOARD, "keyboard", null);
            this.doSearch();
            return true;
        }
        return false;
    }

    public final void onTextChanged(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "s");
        if(Intrinsics.areEqual(this.j.getValue(), s)) {
            Event event0 = new Event(Unit.INSTANCE);
            this.o.setValue(event0);
        }
        else {
            this.j.setValue(s);
            this.l.setValue(SearchViewType.SUGGEST);
            if(p.isBlank(s)) {
                this.getRecentKeywords();
            }
        }
    }

    public final void removeAllRecentKeyword() {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new j4(this, null), 2, null);
    }

    public final void setBlogName(@Nullable String s) {
        this.h = s;
    }

    public final void setRedirectDestination(@Nullable RedirectDestination searchActivity$RedirectDestination0) {
        this.i = searchActivity$RedirectDestination0;
    }

    public final void trackTiaraViewPager(@NotNull String s, @NotNull String s1, boolean z) {
        Intrinsics.checkNotNullParameter(s, "from");
        Intrinsics.checkNotNullParameter(s1, "to");
        Map map0 = z ? x.mapOf(new Pair[]{TuplesKt.to("from", s), TuplesKt.to("to", s1)}) : w.mapOf(TuplesKt.to("type", s1));
        TiaraUtils.trackEvent$default(TiaraUtils.INSTANCE, this.getSection(), this.getPage(), (z ? TiaraActionType.SWIPE_SEARCH_RESULT_TAB : TiaraActionType.CLICK_SEARCH_RESULT_TAB), null, map0, 8, null);
    }

    public final void updatePageInfo(@Nullable String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s1, "page");
        this.setSection(s);
        this.setPage(s1);
    }
}

