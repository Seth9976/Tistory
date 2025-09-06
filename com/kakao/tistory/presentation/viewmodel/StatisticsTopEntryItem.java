package com.kakao.tistory.presentation.viewmodel;

import androidx.compose.runtime.Immutable;
import com.kakao.tistory.presentation.common.graph.a;
import com.kakao.tistory.presentation.design.ui.list.EntryListUiState.Entry;
import com.kakao.tistory.presentation.design.ui.list.EntryListUiState.EntryInfo.DefaultImpls;
import com.kakao.tistory.presentation.design.ui.list.EntryListUiState.EntryInfo;
import com.kakao.tistory.presentation.design.ui.list.EntryListUiState.Visibility;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u001D\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B[\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\b\u0010\n\u001A\u0004\u0018\u00010\t\u0012\u000E\b\u0002\u0010\r\u001A\b\u0012\u0004\u0012\u00020\f0\u000B\u0012\u0006\u0010\u000E\u001A\u00020\u0003\u0012\u0006\u0010\u000F\u001A\u00020\u0003\u0012\u0006\u0010\u0010\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001A\u00020\u0011\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\u0003H\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001A\u00020\u0007H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0012\u0010\u001B\u001A\u0004\u0018\u00010\tH\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0016\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\f0\u000BH\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0010\u0010\u001F\u001A\u00020\u0003H\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010\u0016J\u0010\u0010 \u001A\u00020\u0003H\u00C6\u0003\u00A2\u0006\u0004\b \u0010\u0016J\u0010\u0010!\u001A\u00020\u0003H\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\u0016J\u0010\u0010\"\u001A\u00020\u0011H\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010#Jr\u0010$\u001A\u00020\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t2\u000E\b\u0002\u0010\r\u001A\b\u0012\u0004\u0012\u00020\f0\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\u00032\b\b\u0002\u0010\u000F\u001A\u00020\u00032\b\b\u0002\u0010\u0010\u001A\u00020\u00032\b\b\u0002\u0010\u0012\u001A\u00020\u0011H\u00C6\u0001\u00A2\u0006\u0004\b$\u0010%J\u0010\u0010&\u001A\u00020\u0007H\u00D6\u0001\u00A2\u0006\u0004\b&\u0010\u001AJ\u0010\u0010\'\u001A\u00020\u0003H\u00D6\u0001\u00A2\u0006\u0004\b\'\u0010\u0016J\u001A\u0010*\u001A\u00020\u00112\b\u0010)\u001A\u0004\u0018\u00010(H\u00D6\u0003\u00A2\u0006\u0004\b*\u0010+R\u0017\u0010\u0004\u001A\u00020\u00038\u0006\u00A2\u0006\f\n\u0004\b,\u0010-\u001A\u0004\b.\u0010\u0016R\u0017\u0010\u0006\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b/\u00100\u001A\u0004\b1\u0010\u0018R\u001A\u0010\b\u001A\u00020\u00078\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u0010\u001AR\u001C\u0010\n\u001A\u0004\u0018\u00010\t8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u0010\u001CR \u0010\r\u001A\b\u0012\u0004\u0012\u00020\f0\u000B8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b8\u00109\u001A\u0004\b:\u0010\u001ER\u001A\u0010\u000E\u001A\u00020\u00038\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b;\u0010-\u001A\u0004\b<\u0010\u0016R\u001A\u0010\u000F\u001A\u00020\u00038\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b=\u0010-\u001A\u0004\b>\u0010\u0016R\u001A\u0010\u0010\u001A\u00020\u00038\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b?\u0010-\u001A\u0004\b@\u0010AR\u0017\u0010\u0012\u001A\u00020\u00118\u0006\u00A2\u0006\f\n\u0004\bB\u0010C\u001A\u0004\bD\u0010#\u00A8\u0006E"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/StatisticsTopEntryItem;", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$EntryInfo;", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Entry;", "", "rank", "", "id", "", "title", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "thumbnail", "Lkotlin/Function0;", "", "onClickEntry", "likeCount", "commentCount", "count", "", "showTopDivider", "<init>", "(IJLjava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Lkotlin/jvm/functions/Function0;IIIZ)V", "component1", "()I", "component2", "()J", "component3", "()Ljava/lang/String;", "component4", "()Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "component5", "()Lkotlin/jvm/functions/Function0;", "component6", "component7", "component8", "component9", "()Z", "copy", "(IJLjava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Lkotlin/jvm/functions/Function0;IIIZ)Lcom/kakao/tistory/presentation/viewmodel/StatisticsTopEntryItem;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getRank", "b", "J", "getId", "c", "Ljava/lang/String;", "getTitle", "d", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "getThumbnail", "e", "Lkotlin/jvm/functions/Function0;", "getOnClickEntry", "f", "getLikeCount", "g", "getCommentCount", "h", "getCount", "()Ljava/lang/Integer;", "i", "Z", "getShowTopDivider", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class StatisticsTopEntryItem implements Entry, EntryInfo {
    public static final int $stable;
    public final int a;
    public final long b;
    public final String c;
    public final ThumbnailUiState d;
    public final Function0 e;
    public final int f;
    public final int g;
    public final int h;
    public final boolean i;

    public StatisticsTopEntryItem(int v, long v1, @NotNull String s, @Nullable ThumbnailUiState thumbnailUiState0, @NotNull Function0 function00, int v2, int v3, int v4, boolean z) {
        Intrinsics.checkNotNullParameter(s, "title");
        Intrinsics.checkNotNullParameter(function00, "onClickEntry");
        super();
        this.a = v;
        this.b = v1;
        this.c = s;
        this.d = thumbnailUiState0;
        this.e = function00;
        this.f = v2;
        this.g = v3;
        this.h = v4;
        this.i = z;
    }

    public StatisticsTopEntryItem(int v, long v1, String s, ThumbnailUiState thumbnailUiState0, Function0 function00, int v2, int v3, int v4, boolean z, int v5, DefaultConstructorMarker defaultConstructorMarker0) {
        Function0 function01 = (v5 & 16) == 0 ? function00 : f6.a;
        this(v, v1, s, thumbnailUiState0, function01, v2, v3, v4, ((v5 & 0x100) == 0 ? z : true));
    }

    public final int component1() {
        return this.a;
    }

    public final long component2() {
        return this.b;
    }

    @NotNull
    public final String component3() {
        return this.c;
    }

    @Nullable
    public final ThumbnailUiState component4() {
        return this.d;
    }

    @NotNull
    public final Function0 component5() {
        return this.e;
    }

    public final int component6() {
        return this.f;
    }

    public final int component7() {
        return this.g;
    }

    public final int component8() {
        return this.h;
    }

    public final boolean component9() {
        return this.i;
    }

    @NotNull
    public final StatisticsTopEntryItem copy(int v, long v1, @NotNull String s, @Nullable ThumbnailUiState thumbnailUiState0, @NotNull Function0 function00, int v2, int v3, int v4, boolean z) {
        Intrinsics.checkNotNullParameter(s, "title");
        Intrinsics.checkNotNullParameter(function00, "onClickEntry");
        return new StatisticsTopEntryItem(v, v1, s, thumbnailUiState0, function00, v2, v3, v4, z);
    }

    public static StatisticsTopEntryItem copy$default(StatisticsTopEntryItem statisticsTopEntryItem0, int v, long v1, String s, ThumbnailUiState thumbnailUiState0, Function0 function00, int v2, int v3, int v4, boolean z, int v5, Object object0) {
        int v6 = (v5 & 1) == 0 ? v : statisticsTopEntryItem0.a;
        long v7 = (v5 & 2) == 0 ? v1 : statisticsTopEntryItem0.b;
        String s1 = (v5 & 4) == 0 ? s : statisticsTopEntryItem0.c;
        ThumbnailUiState thumbnailUiState1 = (v5 & 8) == 0 ? thumbnailUiState0 : statisticsTopEntryItem0.d;
        Function0 function01 = (v5 & 16) == 0 ? function00 : statisticsTopEntryItem0.e;
        int v8 = (v5 & 0x20) == 0 ? v2 : statisticsTopEntryItem0.f;
        int v9 = (v5 & 0x40) == 0 ? v3 : statisticsTopEntryItem0.g;
        int v10 = (v5 & 0x80) == 0 ? v4 : statisticsTopEntryItem0.h;
        return (v5 & 0x100) == 0 ? statisticsTopEntryItem0.copy(v6, v7, s1, thumbnailUiState1, function01, v8, v9, v10, z) : statisticsTopEntryItem0.copy(v6, v7, s1, thumbnailUiState1, function01, v8, v9, v10, statisticsTopEntryItem0.i);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof StatisticsTopEntryItem)) {
            return false;
        }
        if(this.a != ((StatisticsTopEntryItem)object0).a) {
            return false;
        }
        if(this.b != ((StatisticsTopEntryItem)object0).b) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((StatisticsTopEntryItem)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((StatisticsTopEntryItem)object0).d)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, ((StatisticsTopEntryItem)object0).e)) {
            return false;
        }
        if(this.f != ((StatisticsTopEntryItem)object0).f) {
            return false;
        }
        if(this.g != ((StatisticsTopEntryItem)object0).g) {
            return false;
        }
        return this.h == ((StatisticsTopEntryItem)object0).h ? this.i == ((StatisticsTopEntryItem)object0).i : false;
    }

    @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$EntryInfo
    public int getCommentCount() {
        return this.g;
    }

    @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$EntryInfo
    @NotNull
    public Integer getCount() {
        return this.h;
    }

    public final long getId() {
        return this.b;
    }

    @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$EntryInfo
    public int getLikeCount() {
        return this.f;
    }

    @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
    @NotNull
    public Function0 getOnClickEntry() {
        return this.e;
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

    public final int getRank() {
        return this.a;
    }

    @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$EntryInfo
    public boolean getScheduled() {
        return false;
    }

    public final boolean getShowTopDivider() {
        return this.i;
    }

    @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
    @Nullable
    public String getSummary() {
        return null;
    }

    @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
    @Nullable
    public ThumbnailUiState getThumbnail() {
        return this.d;
    }

    @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
    @NotNull
    public String getTitle() {
        return this.c;
    }

    @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$EntryInfo
    @NotNull
    public Visibility getVisibility() {
        return DefaultImpls.getVisibility(this);
    }

    @Override
    public int hashCode() {
        int v = a.a(this.c, wb.a.k(this.b, this.a * 0x1F, 0x1F), 0x1F);
        return this.d == null ? Boolean.hashCode(this.i) + com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.h, com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.g, com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.f, com.kakao.tistory.presentation.main.contract.a.a(this.e, v * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F) : Boolean.hashCode(this.i) + com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.h, com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.g, com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.f, com.kakao.tistory.presentation.main.contract.a.a(this.e, (v + this.d.hashCode()) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        return "StatisticsTopEntryItem(rank=" + this.a + ", id=" + this.b + ", title=" + this.c + ", thumbnail=" + this.d + ", onClickEntry=" + this.e + ", likeCount=" + this.f + ", commentCount=" + this.g + ", count=" + this.h + ", showTopDivider=" + this.i + ")";
    }
}

