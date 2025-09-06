package com.kakao.tistory.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000F\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001A\u00020\u00002\u000E\b\u0002\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001A\u00020\u000B2\b\u0010\f\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001A\u00020\u000EHÖ\u0001J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001R\u001C\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/kakao/tistory/data/model/IllegalFilmReportContentList;", "", "contentList", "", "Lcom/kakao/tistory/data/model/IllegalFilmReportContent;", "(Ljava/util/List;)V", "getContentList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class IllegalFilmReportContentList {
    @SerializedName("contents")
    @NotNull
    private final List contentList;

    public IllegalFilmReportContentList(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "contentList");
        super();
        this.contentList = list0;
    }

    @NotNull
    public final List component1() {
        return this.contentList;
    }

    @NotNull
    public final IllegalFilmReportContentList copy(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "contentList");
        return new IllegalFilmReportContentList(list0);
    }

    public static IllegalFilmReportContentList copy$default(IllegalFilmReportContentList illegalFilmReportContentList0, List list0, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = illegalFilmReportContentList0.contentList;
        }
        return illegalFilmReportContentList0.copy(list0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof IllegalFilmReportContentList ? Intrinsics.areEqual(this.contentList, ((IllegalFilmReportContentList)object0).contentList) : false;
    }

    @NotNull
    public final List getContentList() {
        return this.contentList;
    }

    @Override
    public int hashCode() {
        return this.contentList.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "IllegalFilmReportContentList(contentList=" + this.contentList + ")";
    }
}

