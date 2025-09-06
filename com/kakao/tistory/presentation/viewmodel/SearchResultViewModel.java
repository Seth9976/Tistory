package com.kakao.tistory.presentation.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import com.kakao.android.base.BaseKt;
import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.tiara.data.ActionKind;
import com.kakao.tiara.data.Click;
import com.kakao.tiara.data.Meta;
import com.kakao.tistory.data.datasource.BaseSearchDataSource.DataType;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.domain.entity.SortItem.SearchSortItem;
import com.kakao.tistory.domain.entity.Thumbnail;
import com.kakao.tistory.domain.entity.User;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.repository.EntryRepository;
import com.kakao.tistory.domain.repository.OldBlogRepository;
import com.kakao.tistory.domain.repository.SearchRepository;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.common.extension.StringExtensionKt;
import com.kakao.tistory.presentation.common.livedata.ChangedEntryLiveData;
import com.kakao.tistory.presentation.common.tiara.TiaraActionType;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.w;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000\u009E\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001WB)\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\n\u0010\u000BJ=\u0010\u0015\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u000E2\b\u0010\u0010\u001A\u0004\u0018\u00010\u000E2\b\u0010\u0011\u001A\u0004\u0018\u00010\u000E\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u001F\u0010\u001A\u001A\u00020\u00192\b\u0010\u0017\u001A\u0004\u0018\u00010\u000E2\u0006\u0010\u0018\u001A\u00020\u000E\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0017\u0010\u001D\u001A\u00020\u001C2\b\u0010\u0010\u001A\u0004\u0018\u00010\u000E\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0013\u0010!\u001A\b\u0012\u0004\u0012\u00020 0\u001F\u00A2\u0006\u0004\b!\u0010\"J\u001D\u0010\'\u001A\u00020\u00192\u0006\u0010$\u001A\u00020#2\u0006\u0010&\u001A\u00020%\u00A2\u0006\u0004\b\'\u0010(J\u001D\u0010,\u001A\u00020\u00192\u0006\u0010*\u001A\u00020)2\u0006\u0010+\u001A\u00020\u001C\u00A2\u0006\u0004\b,\u0010-J\u0015\u0010.\u001A\u00020\u00192\u0006\u0010*\u001A\u00020)\u00A2\u0006\u0004\b.\u0010/R\u001D\u00106\u001A\b\u0012\u0004\u0012\u000201008\u0006\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u00105R\u001D\u0010:\u001A\b\u0012\u0004\u0012\u000207008\u0006\u00A2\u0006\f\n\u0004\b8\u00103\u001A\u0004\b9\u00105R+\u0010A\u001A\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u000107\u0012\u0004\u0012\u00020\u001C0<0;8\u0006\u00A2\u0006\f\n\u0004\b=\u0010>\u001A\u0004\b?\u0010@R\"\u0010D\u001A\u00020\u001C8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bB\u0010C\u001A\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010\r\u001A\u00020\f8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bH\u0010I\u001A\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001D\u0010R\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0O0N8F\u00A2\u0006\u0006\u001A\u0004\bP\u0010QR\u001F\u0010T\u001A\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000E0O0N8F\u00A2\u0006\u0006\u001A\u0004\bS\u0010QR\u001F\u0010V\u001A\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010#0O0N8F\u00A2\u0006\u0006\u001A\u0004\bU\u0010Q\u00A8\u0006X"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/SearchResultViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "accountRepository", "Lcom/kakao/tistory/domain/repository/EntryRepository;", "entryRepository", "Lcom/kakao/tistory/domain/repository/OldBlogRepository;", "oldBlogRepository", "Lcom/kakao/tistory/domain/repository/SearchRepository;", "searchRepository", "<init>", "(Lcom/kakao/tistory/domain/repository/AccountRepository;Lcom/kakao/tistory/domain/repository/EntryRepository;Lcom/kakao/tistory/domain/repository/OldBlogRepository;Lcom/kakao/tistory/domain/repository/SearchRepository;)V", "Lcom/kakao/tistory/data/datasource/BaseSearchDataSource$DataType;", "dataFactoryType", "", "keyword", "blogName", "sortType", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/kakao/tistory/domain/entity/SearchResultItem;", "getSearchResultFlow", "(Lcom/kakao/tistory/data/datasource/BaseSearchDataSource$DataType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "section", "page", "", "updatePageInfo", "(Ljava/lang/String;Ljava/lang/String;)V", "", "hasBlogRole", "(Ljava/lang/String;)Z", "", "Lcom/kakao/tistory/domain/entity/SortItem;", "getSortItem", "()Ljava/util/List;", "", "position", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "entryItem", "onClickEntryItem", "(ILcom/kakao/tistory/domain/entity/entry/EntryItem;)V", "Lcom/kakao/tistory/domain/entity/Blog;", "blog", "isFromEntry", "onClickBlog", "(Lcom/kakao/tistory/domain/entity/Blog;Z)V", "onClickFollow", "(Lcom/kakao/tistory/domain/entity/Blog;)V", "Lcom/kakao/tistory/presentation/common/livedata/ChangedEntryLiveData;", "Lcom/kakao/tistory/domain/entity/entry/LikeState;", "j", "Lcom/kakao/tistory/presentation/common/livedata/ChangedEntryLiveData;", "getUpdatedLikeStates", "()Lcom/kakao/tistory/presentation/common/livedata/ChangedEntryLiveData;", "updatedLikeStates", "", "k", "getUpdatedCommentCounts", "updatedCommentCounts", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "l", "Landroidx/lifecycle/MutableLiveData;", "getUpdatedBlog", "()Landroidx/lifecycle/MutableLiveData;", "updatedBlog", "p", "Z", "isBlogSearch", "()Z", "setBlogSearch", "(Z)V", "q", "Lcom/kakao/tistory/data/datasource/BaseSearchDataSource$DataType;", "getDataFactoryType", "()Lcom/kakao/tistory/data/datasource/BaseSearchDataSource$DataType;", "setDataFactoryType", "(Lcom/kakao/tistory/data/datasource/BaseSearchDataSource$DataType;)V", "Landroidx/lifecycle/LiveData;", "Lcom/kakao/tistory/presentation/common/extension/Event;", "getGoToEntry", "()Landroidx/lifecycle/LiveData;", "goToEntry", "getGoToBlog", "goToBlog", "getShowToast", "showToast", "SearchResultSortType", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSearchResultViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchResultViewModel.kt\ncom/kakao/tistory/presentation/viewmodel/SearchResultViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,202:1\n288#2,2:203\n288#2,2:205\n13309#3,2:207\n*S KotlinDebug\n*F\n+ 1 SearchResultViewModel.kt\ncom/kakao/tistory/presentation/viewmodel/SearchResultViewModel\n*L\n110#1:203,2\n111#1:205,2\n117#1:207,2\n*E\n"})
public final class SearchResultViewModel extends TistoryViewModel {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fj\u0002\b\u000Ej\u0002\b\u000F¨\u0006\u0010"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/SearchResultViewModel$SearchResultSortType;", "", "", "a", "I", "getTitle", "()I", "title", "", "b", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "ACCURACY", "RECENT", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum SearchResultSortType {
        ACCURACY(string.label_search_result_accuracy_title, "accuracy"),
        RECENT(string.label_search_result_recent_title, "recent");

        public final int a;
        public final String b;
        public static final SearchResultSortType[] c;
        public static final EnumEntries d;

        static {
            SearchResultSortType.c = arr_searchResultViewModel$SearchResultSortType;
            Intrinsics.checkNotNullParameter(arr_searchResultViewModel$SearchResultSortType, "entries");
            SearchResultSortType.d = new a(arr_searchResultViewModel$SearchResultSortType);
        }

        public SearchResultSortType(int v1, String s1) {
            this.a = v1;
            this.b = s1;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return SearchResultSortType.d;
        }

        public final int getTitle() {
            return this.a;
        }

        @NotNull
        public final String getValue() {
            return this.b;
        }
    }

    public static final int $stable = 8;
    public final AccountRepository g;
    public final OldBlogRepository h;
    public final SearchRepository i;
    public final ChangedEntryLiveData j;
    public final ChangedEntryLiveData k;
    public final MutableLiveData l;
    public final MutableLiveData m;
    public final MutableLiveData n;
    public final MutableLiveData o;
    public boolean p;
    public DataType q;

    @Inject
    public SearchResultViewModel(@NotNull AccountRepository accountRepository0, @NotNull EntryRepository entryRepository0, @NotNull OldBlogRepository oldBlogRepository0, @NotNull SearchRepository searchRepository0) {
        Intrinsics.checkNotNullParameter(accountRepository0, "accountRepository");
        Intrinsics.checkNotNullParameter(entryRepository0, "entryRepository");
        Intrinsics.checkNotNullParameter(oldBlogRepository0, "oldBlogRepository");
        Intrinsics.checkNotNullParameter(searchRepository0, "searchRepository");
        super();
        this.g = accountRepository0;
        this.h = oldBlogRepository0;
        this.i = searchRepository0;
        this.j = new ChangedEntryLiveData(entryRepository0.getUpdatedLikeStates());
        this.k = new ChangedEntryLiveData(entryRepository0.getUpdatedCommentCounts());
        this.l = new MutableLiveData();
        this.m = new MutableLiveData();
        this.n = new MutableLiveData();
        this.o = new MutableLiveData();
        this.q = DataType.POST;
    }

    @NotNull
    public final DataType getDataFactoryType() {
        return this.q;
    }

    @NotNull
    public final LiveData getGoToBlog() {
        return this.n;
    }

    @NotNull
    public final LiveData getGoToEntry() {
        return this.m;
    }

    @NotNull
    public final Flow getSearchResultFlow(@NotNull DataType baseSearchDataSource$DataType0, @NotNull String s, @Nullable String s1, @Nullable String s2) {
        boolean z = true;
        Intrinsics.checkNotNullParameter(baseSearchDataSource$DataType0, "dataFactoryType");
        Intrinsics.checkNotNullParameter(s, "keyword");
        if(s1 == null || !p.isBlank(s1) != 1) {
            z = false;
        }
        this.p = z;
        return CachedPagingDataKt.cachedIn(new Pager(new PagingConfig(30, 10, false, 30, 0, 0, 52, null), null, new y3(baseSearchDataSource$DataType0, this, s1, s, s2), 2, null).getFlow(), ViewModelKt.getViewModelScope(this));
    }

    @NotNull
    public final LiveData getShowToast() {
        return this.o;
    }

    @NotNull
    public final List getSortItem() {
        List list0 = new ArrayList();
        SearchResultSortType[] arr_searchResultViewModel$SearchResultSortType = SearchResultSortType.values();
        for(int v = 0; v < arr_searchResultViewModel$SearchResultSortType.length; ++v) {
            SearchResultSortType searchResultViewModel$SearchResultSortType0 = arr_searchResultViewModel$SearchResultSortType[v];
            String s = BaseKt.getAppContext().getString(searchResultViewModel$SearchResultSortType0.getTitle());
            Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
            ((ArrayList)list0).add(new SearchSortItem(searchResultViewModel$SearchResultSortType0.getValue(), s));
        }
        return list0;
    }

    @NotNull
    public final MutableLiveData getUpdatedBlog() {
        return this.l;
    }

    @NotNull
    public final ChangedEntryLiveData getUpdatedCommentCounts() {
        return this.k;
    }

    @NotNull
    public final ChangedEntryLiveData getUpdatedLikeStates() {
        return this.j;
    }

    public final boolean hasBlogRole(@Nullable String s) {
        Blog blog0;
        User user0 = (User)this.g.getOldUser().getValue();
        if(user0 != null) {
            List list0 = user0.getOwnerBlogs();
            if(list0 == null) {
                blog0 = null;
            }
            else {
                Object object0 = null;
                for(Object object1: list0) {
                    if(Intrinsics.areEqual(((Blog)object1).getName(), s)) {
                        object0 = object1;
                        break;
                    }
                }
                blog0 = (Blog)object0;
            }
            List list1 = user0.getJoinedBlogs();
            if(list1 != null) {
                for(Object object2: list1) {
                    if(Intrinsics.areEqual(((Blog)object2).getName(), s)) {
                        return object2 != null || blog0 != null;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            return blog0 != null;
        }
        return false;
    }

    public final boolean isBlogSearch() {
        return this.p;
    }

    public final void onClickBlog(@NotNull Blog blog0, boolean z) {
        Intrinsics.checkNotNullParameter(blog0, "blog");
        String s = blog0.getTitle();
        String s1 = s == null ? null : StringExtensionKt.getStringExcludeBold(s);
        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), this.getPage(), (z ? TiaraActionType.CLICK_BLOG_OF_ENTRY : TiaraActionType.CLICK_BLOG), null, TiaraUtils.createClick$default(TiaraUtils.INSTANCE, null, null, null, "https://" + blog0.getServiceDomain(), null, null, s1, null, null, null, 951, null), null, null, null, 0xE8, null);
        Event event0 = new Event(blog0.getName());
        this.n.postValue(event0);
    }

    public final void onClickEntryItem(int v, @NotNull EntryItem entryItem0) {
        Meta meta0;
        Map map0;
        Intrinsics.checkNotNullParameter(entryItem0, "entryItem");
        String s = null;
        if(this.p) {
            map0 = w.mapOf(TuplesKt.to("type", (this.q == DataType.POST ? "onEntryTab" : "onTagTab")));
            meta0 = null;
        }
        else {
            Blog blog0 = entryItem0.getBlog();
            meta0 = TiaraUtils.createMeta$default(TiaraUtils.INSTANCE, String.valueOf(entryItem0.getId()), null, entryItem0.getTitle(), null, null, entryItem0.getBlogName(), String.valueOf((blog0 == null ? null : blog0.getId())), null, null, null, null, null, null, entryItem0.getPermalink(), null, 0x5F9A, null);
            map0 = null;
        }
        TiaraUtils tiaraUtils0 = TiaraUtils.INSTANCE;
        String s1 = this.getSection();
        String s2 = this.getPage();
        TiaraActionType tiaraActionType0 = TiaraActionType.CLICK_ENTRY_ITEM;
        String s3 = entryItem0.getTitle();
        Thumbnail thumbnail0 = entryItem0.getThumbnail();
        if(thumbnail0 != null) {
            s = thumbnail0.getOrigin();
        }
        Click click0 = TiaraUtils.createClick$default(tiaraUtils0, null, null, null, entryItem0.getPermalink(), null, String.valueOf(v), s3, s, null, null, 791, null);
        TiaraUtils.trackClick$default(tiaraUtils0, s1, s2, tiaraActionType0, ActionKind.ClickContent, click0, meta0, map0, null, 0x80, null);
        Event event0 = new Event(entryItem0);
        this.m.postValue(event0);
    }

    public final void onClickFollow(@NotNull Blog blog0) {
        Intrinsics.checkNotNullParameter(blog0, "blog");
        if(blog0.isBlocked()) {
            Event event0 = new Event(string.label_blocked_not_follow_message);
            this.o.setValue(event0);
            return;
        }
        boolean z = blog0.isSubscriber();
        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), this.getPage(), (z ? TiaraActionType.CLICK_FOLLOW_CANCEL : TiaraActionType.CLICK_FOLLOW), (z ? null : ActionKind.Follow), null, null, null, null, 0xF0, null);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new b4(blog0.getName(), z, this, blog0, null), 3, null);
    }

    public final void setBlogSearch(boolean z) {
        this.p = z;
    }

    public final void setDataFactoryType(@NotNull DataType baseSearchDataSource$DataType0) {
        Intrinsics.checkNotNullParameter(baseSearchDataSource$DataType0, "<set-?>");
        this.q = baseSearchDataSource$DataType0;
    }

    public final void updatePageInfo(@Nullable String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s1, "page");
        this.setSection(s);
        this.setPage(s1);
    }
}

