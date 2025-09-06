package com.kakao.tistory.presentation.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.tiara.data.Click;
import com.kakao.tistory.domain.entity.SortItem;
import com.kakao.tistory.presentation.common.tiara.TiaraActionType;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001E\n\u0002\u0010\u000B\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00A2\u0006\u0004\b\u0002\u0010\u0003J\u001F\u0010\b\u001A\u00020\u00072\b\u0010\u0005\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001A\u00020\u0004\u00A2\u0006\u0004\b\b\u0010\tJE\u0010\u0010\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\u00042\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u000E\u001A\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0010\b\u0002\u0010\u000F\u001A\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0012\u001A\u00020\u0007H\u0007\u00A2\u0006\u0004\b\u0012\u0010\u0003J\u001B\u0010\u0012\u001A\u00020\u00072\f\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00070\u0013\u00A2\u0006\u0004\b\u0012\u0010\u0015J\r\u0010\u0016\u001A\u00020\u0007\u00A2\u0006\u0004\b\u0016\u0010\u0003J\'\u0010\u0018\u001A\u00020\u00072\u0006\u0010\u0017\u001A\u00020\r2\u0010\b\u0002\u0010\u0014\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0013\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001A\u001A\u00020\u00072\u0006\u0010\u0017\u001A\u00020\r\u00A2\u0006\u0004\b\u001A\u0010\u001BJ)\u0010\u001D\u001A\u00020\u00072\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\r0\f\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0015\u0010\u001F\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00020\u0004\u00A2\u0006\u0004\b\u001F\u0010 R(\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00040!8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%\"\u0004\b&\u0010\'R(\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00040!8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b(\u0010#\u001A\u0004\b)\u0010%\"\u0004\b*\u0010\'R0\u0010\u000E\u001A\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0!8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b+\u0010#\u001A\u0004\b,\u0010%\"\u0004\b-\u0010\'R*\u0010\u0017\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\r0!8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b.\u0010#\u001A\u0004\b/\u0010%\"\u0004\b0\u0010\'R*\u00104\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040!8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b1\u0010#\u001A\u0004\b2\u0010%\"\u0004\b3\u0010\'R0\u0010\u000F\u001A\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0!8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b5\u0010#\u001A\u0004\b6\u0010%\"\u0004\b7\u0010\'R*\u0010;\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\r0!8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b8\u0010#\u001A\u0004\b9\u0010%\"\u0004\b:\u0010\'R*\u0010?\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040!8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b<\u0010#\u001A\u0004\b=\u0010%\"\u0004\b>\u0010\'R(\u0010D\u001A\b\u0012\u0004\u0012\u00020@0!8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bA\u0010#\u001A\u0004\bB\u0010%\"\u0004\bC\u0010\'R(\u0010H\u001A\b\u0012\u0004\u0012\u00020@0!8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bE\u0010#\u001A\u0004\bF\u0010%\"\u0004\bG\u0010\'\u00A8\u0006I"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/TopViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "<init>", "()V", "", "section", "page", "", "updatePageInfo", "(Ljava/lang/String;Ljava/lang/String;)V", "title", "titleInfo", "", "Lcom/kakao/tistory/domain/entity/SortItem;", "sortItems", "metricSortItem", "setTopView", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "onClickSort", "Lkotlin/Function0;", "clickTiara", "(Lkotlin/jvm/functions/Function0;)V", "onClickMetricSort", "selectedSortItem", "updateSort", "(Lcom/kakao/tistory/domain/entity/SortItem;Lkotlin/jvm/functions/Function0;)V", "updateMetricSort", "(Lcom/kakao/tistory/domain/entity/SortItem;)V", "metricSortItems", "updateSortItems", "(Ljava/util/List;Ljava/util/List;)V", "updateTitleInfo", "(Ljava/lang/String;)V", "Landroidx/lifecycle/MutableLiveData;", "g", "Landroidx/lifecycle/MutableLiveData;", "getTitle", "()Landroidx/lifecycle/MutableLiveData;", "setTitle", "(Landroidx/lifecycle/MutableLiveData;)V", "h", "getTitleInfo", "setTitleInfo", "i", "getSortItems", "setSortItems", "j", "getSelectedSortItem", "setSelectedSortItem", "k", "getSelectedSortTitle", "setSelectedSortTitle", "selectedSortTitle", "l", "getMetricSortItem", "setMetricSortItem", "m", "getSelectedMetricSortItem", "setSelectedMetricSortItem", "selectedMetricSortItem", "n", "getSelectedMetricSortTitle", "setSelectedMetricSortTitle", "selectedMetricSortTitle", "", "o", "getShowBottomSortDialog", "setShowBottomSortDialog", "showBottomSortDialog", "p", "getShowBottomMetricSortDialog", "setShowBottomMetricSortDialog", "showBottomMetricSortDialog", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTopViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopViewModel.kt\ncom/kakao/tistory/presentation/viewmodel/TopViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n1#2:120\n*E\n"})
public final class TopViewModel extends TistoryViewModel {
    public static final int $stable = 8;
    public MutableLiveData g;
    public MutableLiveData h;
    public MutableLiveData i;
    public MutableLiveData j;
    public MutableLiveData k;
    public MutableLiveData l;
    public MutableLiveData m;
    public MutableLiveData n;
    public MutableLiveData o;
    public MutableLiveData p;

    public TopViewModel() {
        this.g = new MutableLiveData();
        this.h = new MutableLiveData();
        this.i = new MutableLiveData();
        this.j = new MutableLiveData();
        this.k = new MutableLiveData();
        this.l = new MutableLiveData();
        this.m = new MutableLiveData();
        this.n = new MutableLiveData();
        this.o = new MutableLiveData();
        this.p = new MutableLiveData();
    }

    @NotNull
    public final MutableLiveData getMetricSortItem() {
        return this.l;
    }

    @NotNull
    public final MutableLiveData getSelectedMetricSortItem() {
        return this.m;
    }

    @NotNull
    public final MutableLiveData getSelectedMetricSortTitle() {
        return this.n;
    }

    @NotNull
    public final MutableLiveData getSelectedSortItem() {
        return this.j;
    }

    @NotNull
    public final MutableLiveData getSelectedSortTitle() {
        return this.k;
    }

    @NotNull
    public final MutableLiveData getShowBottomMetricSortDialog() {
        return this.p;
    }

    @NotNull
    public final MutableLiveData getShowBottomSortDialog() {
        return this.o;
    }

    @NotNull
    public final MutableLiveData getSortItems() {
        return this.i;
    }

    @NotNull
    public final MutableLiveData getTitle() {
        return this.g;
    }

    @NotNull
    public final MutableLiveData getTitleInfo() {
        return this.h;
    }

    public final void onClickMetricSort() {
        this.p.setValue(Boolean.TRUE);
    }

    @Deprecated(message = "use onClickSort(section: String, page: String)")
    public final void onClickSort() {
        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), this.getPage(), TiaraActionType.CLICK_SORT, null, null, null, null, null, 0xF8, null);
        this.o.setValue(Boolean.TRUE);
    }

    public final void onClickSort(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "clickTiara");
        function00.invoke();
        this.o.setValue(Boolean.TRUE);
    }

    public final void setMetricSortItem(@NotNull MutableLiveData mutableLiveData0) {
        Intrinsics.checkNotNullParameter(mutableLiveData0, "<set-?>");
        this.l = mutableLiveData0;
    }

    public final void setSelectedMetricSortItem(@NotNull MutableLiveData mutableLiveData0) {
        Intrinsics.checkNotNullParameter(mutableLiveData0, "<set-?>");
        this.m = mutableLiveData0;
    }

    public final void setSelectedMetricSortTitle(@NotNull MutableLiveData mutableLiveData0) {
        Intrinsics.checkNotNullParameter(mutableLiveData0, "<set-?>");
        this.n = mutableLiveData0;
    }

    public final void setSelectedSortItem(@NotNull MutableLiveData mutableLiveData0) {
        Intrinsics.checkNotNullParameter(mutableLiveData0, "<set-?>");
        this.j = mutableLiveData0;
    }

    public final void setSelectedSortTitle(@NotNull MutableLiveData mutableLiveData0) {
        Intrinsics.checkNotNullParameter(mutableLiveData0, "<set-?>");
        this.k = mutableLiveData0;
    }

    public final void setShowBottomMetricSortDialog(@NotNull MutableLiveData mutableLiveData0) {
        Intrinsics.checkNotNullParameter(mutableLiveData0, "<set-?>");
        this.p = mutableLiveData0;
    }

    public final void setShowBottomSortDialog(@NotNull MutableLiveData mutableLiveData0) {
        Intrinsics.checkNotNullParameter(mutableLiveData0, "<set-?>");
        this.o = mutableLiveData0;
    }

    public final void setSortItems(@NotNull MutableLiveData mutableLiveData0) {
        Intrinsics.checkNotNullParameter(mutableLiveData0, "<set-?>");
        this.i = mutableLiveData0;
    }

    public final void setTitle(@NotNull MutableLiveData mutableLiveData0) {
        Intrinsics.checkNotNullParameter(mutableLiveData0, "<set-?>");
        this.g = mutableLiveData0;
    }

    public final void setTitleInfo(@NotNull MutableLiveData mutableLiveData0) {
        Intrinsics.checkNotNullParameter(mutableLiveData0, "<set-?>");
        this.h = mutableLiveData0;
    }

    public final void setTopView(@NotNull String s, @Nullable String s1, @Nullable List list0, @Nullable List list1) {
        SortItem sortItem1;
        Intrinsics.checkNotNullParameter(s, "title");
        this.g.setValue(s);
        this.h.setValue(s1);
        this.i.setValue(list0);
        this.l.setValue(list1);
        MutableLiveData mutableLiveData0 = this.j;
        SortItem sortItem0 = null;
        if(list0 == null || list0.isEmpty()) {
            this.k.setValue(null);
            sortItem1 = null;
        }
        else {
            this.k.setValue(((SortItem)list0.get(0)).getTitle());
            sortItem1 = (SortItem)list0.get(0);
            sortItem1.setSelected(true);
        }
        mutableLiveData0.setValue(sortItem1);
        MutableLiveData mutableLiveData1 = this.m;
        if(list1 == null || list1.isEmpty()) {
            this.n.setValue(null);
        }
        else {
            this.n.setValue(((SortItem)list1.get(0)).getTitle());
            sortItem0 = (SortItem)list1.get(0);
            sortItem0.setSelected(true);
        }
        mutableLiveData1.setValue(sortItem0);
    }

    public static void setTopView$default(TopViewModel topViewModel0, String s, String s1, List list0, List list1, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = null;
        }
        if((v & 4) != 0) {
            list0 = null;
        }
        if((v & 8) != 0) {
            list1 = null;
        }
        topViewModel0.setTopView(s, s1, list0, list1);
    }

    public final void updateMetricSort(@NotNull SortItem sortItem0) {
        Intrinsics.checkNotNullParameter(sortItem0, "selectedSortItem");
        List list0 = (List)this.l.getValue();
        if(list0 != null) {
            for(Object object0: list0) {
                ((SortItem)object0).setSelected(Intrinsics.areEqual(((SortItem)object0), sortItem0));
            }
            this.n.setValue(sortItem0.getTitle());
            this.m.setValue(sortItem0);
        }
    }

    public final void updatePageInfo(@Nullable String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s1, "page");
        this.setSection(s);
        this.setPage(s1);
    }

    public final void updateSort(@NotNull SortItem sortItem0, @Nullable Function0 function00) {
        Intrinsics.checkNotNullParameter(sortItem0, "selectedSortItem");
        if(function00 == null) {
            Click click0 = TiaraUtils.createClick$default(TiaraUtils.INSTANCE, null, null, null, null, null, null, sortItem0.getTitle(), null, null, null, 0x3BF, null);
            TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), this.getPage(), TiaraActionType.CLICK_SORT_ITEM, null, click0, null, null, null, 0xE8, null);
        }
        else {
            function00.invoke();
        }
        List list0 = (List)this.i.getValue();
        if(list0 != null) {
            for(Object object0: list0) {
                ((SortItem)object0).setSelected(Intrinsics.areEqual(((SortItem)object0), sortItem0));
            }
            this.k.setValue(sortItem0.getTitle());
            this.j.setValue(sortItem0);
        }
    }

    public static void updateSort$default(TopViewModel topViewModel0, SortItem sortItem0, Function0 function00, int v, Object object0) {
        if((v & 2) != 0) {
            function00 = null;
        }
        topViewModel0.updateSort(sortItem0, function00);
    }

    public final void updateSortItems(@NotNull List list0, @NotNull List list1) {
        Intrinsics.checkNotNullParameter(list0, "sortItems");
        Intrinsics.checkNotNullParameter(list1, "metricSortItems");
        this.i.setValue(list0);
        this.l.setValue(list1);
    }

    public final void updateTitleInfo(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "titleInfo");
        this.h.setValue(s);
    }
}

