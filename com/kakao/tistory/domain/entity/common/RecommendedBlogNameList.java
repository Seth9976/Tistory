package com.kakao.tistory.domain.entity.common;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001B\u0010\t\u001A\u00020\u00002\u0010\b\u0002\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001A\u00020\u000B2\b\u0010\f\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001A\u00020\u000EHÖ\u0001J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001R\u001E\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/kakao/tistory/domain/entity/common/RecommendedBlogNameList;", "", "blogNameInfoList", "", "Lcom/kakao/tistory/domain/entity/common/RecommendedBlogNameInfo;", "(Ljava/util/List;)V", "getBlogNameInfoList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class RecommendedBlogNameList {
    @SerializedName("alternatives")
    @Nullable
    private final List blogNameInfoList;

    public RecommendedBlogNameList() {
        this(null, 1, null);
    }

    public RecommendedBlogNameList(@Nullable List list0) {
        this.blogNameInfoList = list0;
    }

    public RecommendedBlogNameList(List list0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            list0 = null;
        }
        this(list0);
    }

    @Nullable
    public final List component1() {
        return this.blogNameInfoList;
    }

    @NotNull
    public final RecommendedBlogNameList copy(@Nullable List list0) {
        return new RecommendedBlogNameList(list0);
    }

    public static RecommendedBlogNameList copy$default(RecommendedBlogNameList recommendedBlogNameList0, List list0, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = recommendedBlogNameList0.blogNameInfoList;
        }
        return recommendedBlogNameList0.copy(list0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof RecommendedBlogNameList ? Intrinsics.areEqual(this.blogNameInfoList, ((RecommendedBlogNameList)object0).blogNameInfoList) : false;
    }

    @Nullable
    public final List getBlogNameInfoList() {
        return this.blogNameInfoList;
    }

    @Override
    public int hashCode() {
        return this.blogNameInfoList == null ? 0 : this.blogNameInfoList.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "RecommendedBlogNameList(blogNameInfoList=" + this.blogNameInfoList + ")";
    }
}

