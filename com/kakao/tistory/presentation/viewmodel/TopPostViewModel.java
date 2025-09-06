package com.kakao.tistory.presentation.viewmodel;

import a5.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kakao.android.base.BaseKt;
import com.kakao.android.base.utils.DateUtils;
import com.kakao.tiara.data.Click;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.domain.statistics.entity.TopEntry;
import com.kakao.tistory.domain.statistics.usecase.GetTopEntriesUseCase;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.common.tiara.TistoryTiara;
import com.kakao.tistory.presentation.common.tiara.TistoryTiaraActionType;
import com.kakao.tistory.presentation.design.ui.list.EntryListUiState.Entry;
import com.kakao.tistory.presentation.design.ui.list.EntryListUiState.EntryInfo.DefaultImpls;
import com.kakao.tistory.presentation.design.ui.list.EntryListUiState.EntryInfo;
import com.kakao.tistory.presentation.design.ui.list.EntryListUiState.Visibility;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import com.kakao.tistory.presentation.screen.blog.common.contract.a;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.text.ParseException;
import java.util.Arrays;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 22\u00020\u0001:\u000223B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000F\u001A\u00020\b2\u0006\u0010\f\u001A\u00020\u000B2\b\u0010\r\u001A\u0004\u0018\u00010\u000B2\b\u0010\u000E\u001A\u0004\u0018\u00010\u000B¢\u0006\u0004\b\u000F\u0010\u0010J\r\u0010\u0011\u001A\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001A\u00020\b¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0016\u001A\u00020\b2\u0006\u0010\u0015\u001A\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R%\u0010\u001F\u001A\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001A0\u00190\u00188\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001ER#\u0010\"\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001A0\u00190\u00188\u0006¢\u0006\f\n\u0004\b \u0010\u001C\u001A\u0004\b!\u0010\u001ER\u001D\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00060\u00188\u0006¢\u0006\f\n\u0004\b#\u0010\u001C\u001A\u0004\b$\u0010\u001ER\u001D\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00140\u00188\u0006¢\u0006\f\n\u0004\b%\u0010\u001C\u001A\u0004\b&\u0010\u001ER#\u0010+\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\'0\u00188\u0006¢\u0006\f\n\u0004\b)\u0010\u001C\u001A\u0004\b*\u0010\u001ER\u001F\u00101\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u000B0,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b/\u00100¨\u00064"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/TopPostViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "Lcom/kakao/tistory/domain/statistics/usecase/GetTopEntriesUseCase;", "getTopEntriesUseCase", "<init>", "(Lcom/kakao/tistory/domain/statistics/usecase/GetTopEntriesUseCase;)V", "", "isMine", "", "init", "(Z)V", "", "blogName", "date", "granularity", "getTopPosts", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "showSortBottomSheet", "()V", "hideSortBottomSheet", "Lcom/kakao/tistory/presentation/viewmodel/TopEntriesSortType;", "sortType", "onClickSortItem", "(Lcom/kakao/tistory/presentation/viewmodel/TopEntriesSortType;)V", "Landroidx/lifecycle/LiveData;", "Lcom/kakao/tistory/presentation/common/extension/Event;", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "j", "Landroidx/lifecycle/LiveData;", "getGoToStatisticsActivity", "()Landroidx/lifecycle/LiveData;", "goToStatisticsActivity", "l", "getGoToEntryActivity", "goToEntryActivity", "n", "getShowSortBottomSheet", "p", "getSortType", "", "Lcom/kakao/tistory/presentation/viewmodel/TopPostViewModel$TopEntryItem;", "r", "getTopEntries", "topEntries", "Landroidx/lifecycle/MutableLiveData;", "s", "Landroidx/lifecycle/MutableLiveData;", "getTitleInfo", "()Landroidx/lifecycle/MutableLiveData;", "titleInfo", "Companion", "TopEntryItem", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TopPostViewModel extends TistoryViewModel {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/TopPostViewModel$Companion;", "", "", "PAGE", "Ljava/lang/String;", "SECTION", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\f\u001A\u00020\n\u0012\u0006\u0010\r\u001A\u00020\n\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u0003H\u00C6\u0003\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\b0\u0007H\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001A\u00020\nH\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001A\u00020\nH\u00C6\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001A\u00020\nH\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u0017JT\u0010\u001A\u001A\u00020\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\u000E\b\u0002\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\f\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\nH\u00C6\u0001\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0010\u0010\u001C\u001A\u00020\u0003H\u00D6\u0001\u00A2\u0006\u0004\b\u001C\u0010\u0011J\u0010\u0010\u001D\u001A\u00020\nH\u00D6\u0001\u00A2\u0006\u0004\b\u001D\u0010\u0017J\u001A\u0010!\u001A\u00020 2\b\u0010\u001F\u001A\u0004\u0018\u00010\u001EH\u00D6\u0003\u00A2\u0006\u0004\b!\u0010\"R\u001A\u0010\u0004\u001A\u00020\u00038\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010\u0011R\u001C\u0010\u0006\u001A\u0004\u0018\u00010\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010\u0013R \u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010\u0015R\u001A\u0010\u000B\u001A\u00020\n8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b,\u0010-\u001A\u0004\b.\u0010\u0017R\u001A\u0010\f\u001A\u00020\n8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b/\u0010-\u001A\u0004\b0\u0010\u0017R\u001A\u0010\r\u001A\u00020\n8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b1\u0010-\u001A\u0004\b2\u00103\u00A8\u00064"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/TopPostViewModel$TopEntryItem;", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Entry;", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$EntryInfo;", "", "title", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "thumbnail", "Lkotlin/Function0;", "", "onClickEntry", "", "likeCount", "commentCount", "count", "<init>", "(Ljava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Lkotlin/jvm/functions/Function0;III)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "component3", "()Lkotlin/jvm/functions/Function0;", "component4", "()I", "component5", "component6", "copy", "(Ljava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Lkotlin/jvm/functions/Function0;III)Lcom/kakao/tistory/presentation/viewmodel/TopPostViewModel$TopEntryItem;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTitle", "b", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "getThumbnail", "c", "Lkotlin/jvm/functions/Function0;", "getOnClickEntry", "d", "I", "getLikeCount", "e", "getCommentCount", "f", "getCount", "()Ljava/lang/Integer;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class TopEntryItem implements Entry, EntryInfo {
        public static final int $stable;
        public final String a;
        public final ThumbnailUiState b;
        public final Function0 c;
        public final int d;
        public final int e;
        public final int f;

        public TopEntryItem(@NotNull String s, @Nullable ThumbnailUiState thumbnailUiState0, @NotNull Function0 function00, int v, int v1, int v2) {
            Intrinsics.checkNotNullParameter(s, "title");
            Intrinsics.checkNotNullParameter(function00, "onClickEntry");
            super();
            this.a = s;
            this.b = thumbnailUiState0;
            this.c = function00;
            this.d = v;
            this.e = v1;
            this.f = v2;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @Nullable
        public final ThumbnailUiState component2() {
            return this.b;
        }

        @NotNull
        public final Function0 component3() {
            return this.c;
        }

        public final int component4() {
            return this.d;
        }

        public final int component5() {
            return this.e;
        }

        public final int component6() {
            return this.f;
        }

        @NotNull
        public final TopEntryItem copy(@NotNull String s, @Nullable ThumbnailUiState thumbnailUiState0, @NotNull Function0 function00, int v, int v1, int v2) {
            Intrinsics.checkNotNullParameter(s, "title");
            Intrinsics.checkNotNullParameter(function00, "onClickEntry");
            return new TopEntryItem(s, thumbnailUiState0, function00, v, v1, v2);
        }

        public static TopEntryItem copy$default(TopEntryItem topPostViewModel$TopEntryItem0, String s, ThumbnailUiState thumbnailUiState0, Function0 function00, int v, int v1, int v2, int v3, Object object0) {
            if((v3 & 1) != 0) {
                s = topPostViewModel$TopEntryItem0.a;
            }
            if((v3 & 2) != 0) {
                thumbnailUiState0 = topPostViewModel$TopEntryItem0.b;
            }
            if((v3 & 4) != 0) {
                function00 = topPostViewModel$TopEntryItem0.c;
            }
            if((v3 & 8) != 0) {
                v = topPostViewModel$TopEntryItem0.d;
            }
            if((v3 & 16) != 0) {
                v1 = topPostViewModel$TopEntryItem0.e;
            }
            if((v3 & 0x20) != 0) {
                v2 = topPostViewModel$TopEntryItem0.f;
            }
            return topPostViewModel$TopEntryItem0.copy(s, thumbnailUiState0, function00, v, v1, v2);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof TopEntryItem)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((TopEntryItem)object0).a)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.b, ((TopEntryItem)object0).b)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((TopEntryItem)object0).c)) {
                return false;
            }
            if(this.d != ((TopEntryItem)object0).d) {
                return false;
            }
            return this.e == ((TopEntryItem)object0).e ? this.f == ((TopEntryItem)object0).f : false;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$EntryInfo
        public int getCommentCount() {
            return this.e;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$EntryInfo
        @NotNull
        public Integer getCount() {
            return this.f;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$EntryInfo
        public int getLikeCount() {
            return this.d;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @NotNull
        public Function0 getOnClickEntry() {
            return this.c;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @Nullable
        public Function0 getOnLongClickEntry() {
            return null;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$EntryInfo
        @Nullable
        public String getPublishedDate() {
            return null;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$EntryInfo
        public boolean getScheduled() {
            return false;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @Nullable
        public String getSummary() {
            return null;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @Nullable
        public ThumbnailUiState getThumbnail() {
            return this.b;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @NotNull
        public String getTitle() {
            return this.a;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$EntryInfo
        @NotNull
        public Visibility getVisibility() {
            return DefaultImpls.getVisibility(this);
        }

        @Override
        public int hashCode() {
            int v = this.a.hashCode();
            return this.b == null ? this.f + a.a(this.e, a.a(this.d, com.kakao.tistory.presentation.main.contract.a.a(this.c, v * 961, 0x1F), 0x1F), 0x1F) : this.f + a.a(this.e, a.a(this.d, com.kakao.tistory.presentation.main.contract.a.a(this.c, (v * 0x1F + this.b.hashCode()) * 0x1F, 0x1F), 0x1F), 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            return "TopEntryItem(title=" + this.a + ", thumbnail=" + this.b + ", onClickEntry=" + this.c + ", likeCount=" + this.d + ", commentCount=" + this.e + ", count=" + this.f + ")";
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = null;
    @NotNull
    public static final String PAGE = "인기글목록";
    @NotNull
    public static final String SECTION = "통계";
    public final GetTopEntriesUseCase g;
    public boolean h;
    public final MutableLiveData i;
    public final LiveData j;
    public final MutableLiveData k;
    public final LiveData l;
    public final MutableLiveData m;
    public final LiveData n;
    public final MutableStateFlow o;
    public final LiveData p;
    public final MutableStateFlow q;
    public final LiveData r;
    public final MutableLiveData s;

    static {
        TopPostViewModel.Companion = new Companion(null);
        TopPostViewModel.$stable = 8;
    }

    @Inject
    public TopPostViewModel(@NotNull GetTopEntriesUseCase getTopEntriesUseCase0) {
        Intrinsics.checkNotNullParameter(getTopEntriesUseCase0, "getTopEntriesUseCase");
        super();
        this.g = getTopEntriesUseCase0;
        MutableLiveData mutableLiveData0 = new MutableLiveData();
        this.i = mutableLiveData0;
        this.j = LiveDataExtensionKt.asLiveData(mutableLiveData0);
        MutableLiveData mutableLiveData1 = new MutableLiveData();
        this.k = mutableLiveData1;
        this.l = LiveDataExtensionKt.asLiveData(mutableLiveData1);
        MutableLiveData mutableLiveData2 = new MutableLiveData(Boolean.FALSE);
        this.m = mutableLiveData2;
        this.n = LiveDataExtensionKt.asLiveData(mutableLiveData2);
        MutableStateFlow mutableStateFlow0 = StateFlowKt.MutableStateFlow(TopEntriesSortType.VIEW);
        this.o = mutableStateFlow0;
        this.p = FlowLiveDataConversions.asLiveData$default(mutableStateFlow0, null, 0L, 3, null);
        MutableStateFlow mutableStateFlow1 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.q = mutableStateFlow1;
        this.r = FlowLiveDataConversions.asLiveData$default(FlowKt.combine(mutableStateFlow0, mutableStateFlow1, new m7(null)), null, 0L, 3, null);
        this.s = new MutableLiveData();
    }

    // 去混淆评级： 低(46)
    public static String a(String s, String s1) {
        if(Intrinsics.areEqual(s, "day")) {
            return DateUtils.getDisplayDateTime$default(DateUtils.INSTANCE, s1, "yyyy-MM-dd", "M. d.", "yyyy. M. d.", false, 16, null);
        }
        if(Intrinsics.areEqual(s, "week")) {
            String[] arr_s = DateUtils.INSTANCE.getDisplayWeekDateTime(s1, "yyyy-MM-dd", "M. d.", "yyyy. M. d.");
            return b.m(arr_s[0], " ~ ", arr_s[1]);
        }
        return Intrinsics.areEqual(s, "month") ? DateUtils.getDisplayDateTime$default(DateUtils.INSTANCE, s1, "yyyy-MM-dd", "M월", "yyyy년 M월", false, 16, null) : "";
    }

    public static final void access$onClickTopPost(TopPostViewModel topPostViewModel0, int v, TopEntry topEntry0) {
        topPostViewModel0.getClass();
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, null, null, null, null, null, String.valueOf(v), null, null, null, null, 0x3DF, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "통계", "인기글목록", TistoryTiaraActionType.CLICK_TOP_ENTRY, null, click0, null, null, null, 0xE8, null);
        if(topPostViewModel0.h) {
            Event event0 = new Event(new EntryItem(topEntry0.getId(), null, null, null, false, null, false, topEntry0.getTitle(), null, null, null, null, null, null, null, null, null, null, null, null, 0L, 0L, false, 0L, false, 0x1FFFF7E, null));
            topPostViewModel0.i.setValue(event0);
            return;
        }
        Event event1 = new Event(new EntryItem(topEntry0.getId(), null, null, null, false, null, false, topEntry0.getTitle(), null, null, null, null, null, null, null, null, null, null, null, null, 0L, 0L, false, 0L, false, 0x1FFFF7E, null));
        topPostViewModel0.k.setValue(event1);
    }

    @NotNull
    public final LiveData getGoToEntryActivity() {
        return this.l;
    }

    @NotNull
    public final LiveData getGoToStatisticsActivity() {
        return this.j;
    }

    @NotNull
    public final LiveData getShowSortBottomSheet() {
        return this.n;
    }

    @NotNull
    public final LiveData getSortType() {
        return this.p;
    }

    @NotNull
    public final MutableLiveData getTitleInfo() {
        return this.s;
    }

    @NotNull
    public final LiveData getTopEntries() {
        return this.r;
    }

    public final void getTopPosts(@NotNull String s, @Nullable String s1, @Nullable String s2) {
        String s4;
        Intrinsics.checkNotNullParameter(s, "blogName");
        String s3 = null;
        if(s1 == null || s2 == null) {
            String s6 = BaseKt.getAppContext().getString(string.label_latest_days);
            Intrinsics.checkNotNullExpressionValue(s6, "getString(...)");
            String s7 = String.format(s6, Arrays.copyOf(new Object[]{"7"}, 1));
            Intrinsics.checkNotNullExpressionValue(s7, "format(...)");
            this.s.setValue(s7);
        }
        else {
            try {
                if(Intrinsics.areEqual(s2, "day")) {
                    s4 = DateUtils.getDateTimeFormat$default(DateUtils.INSTANCE, s1, null, null, 6, null);
                }
                else if(Intrinsics.areEqual(s2, "week")) {
                    s4 = DateUtils.getMondayDateTimeOfWeek$default(DateUtils.INSTANCE, s1, null, null, false, 14, null);
                }
                else {
                    s4 = Intrinsics.areEqual(s2, "month") ? DateUtils.getFirstDateTimeOfMonth$default(DateUtils.INSTANCE, s1, null, null, 6, null) : DateUtils.getCurrentDateTime$default(DateUtils.INSTANCE, null, 1, null);
                }
            }
            catch(ParseException unused_ex) {
                s4 = DateUtils.getCurrentDateTime$default(DateUtils.INSTANCE, null, 1, null);
            }
            s3 = s4;
            String s5 = TopPostViewModel.a(s2, s3);
            this.s.setValue(s5);
        }
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new l7(this, s, s3, s2, null), 3, null);
    }

    public final void hideSortBottomSheet() {
        this.m.setValue(Boolean.FALSE);
    }

    public final void init(boolean z) {
        this.h = z;
    }

    public final void onClickSortItem(@NotNull TopEntriesSortType topEntriesSortType0) {
        Intrinsics.checkNotNullParameter(topEntriesSortType0, "sortType");
        this.o.setValue(topEntriesSortType0);
        this.hideSortBottomSheet();
    }

    public final void showSortBottomSheet() {
        this.m.setValue(Boolean.TRUE);
    }
}

