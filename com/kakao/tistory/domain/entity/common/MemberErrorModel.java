package com.kakao.tistory.domain.entity.common;

import com.kakao.android.base.model.ErrorModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\f\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\r\u001A\u0004\u0018\u00010\u0006HÆ\u0003J\'\u0010\u000E\u001A\u00020\u00002\u0010\b\u0002\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001A\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001A\u00020\u0004HÖ\u0001R\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0019\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000B¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/domain/entity/common/MemberErrorModel;", "Lcom/kakao/android/base/model/ErrorModel;", "emails", "", "", "data", "Lcom/kakao/tistory/domain/entity/common/RecommendedBlogNameList;", "(Ljava/util/List;Lcom/kakao/tistory/domain/entity/common/RecommendedBlogNameList;)V", "getData", "()Lcom/kakao/tistory/domain/entity/common/RecommendedBlogNameList;", "getEmails", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class MemberErrorModel extends ErrorModel {
    @Nullable
    private final RecommendedBlogNameList data;
    @Nullable
    private final List emails;

    public MemberErrorModel() {
        this(null, null, 3, null);
    }

    public MemberErrorModel(@Nullable List list0, @Nullable RecommendedBlogNameList recommendedBlogNameList0) {
        this.emails = list0;
        this.data = recommendedBlogNameList0;
    }

    public MemberErrorModel(List list0, RecommendedBlogNameList recommendedBlogNameList0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            list0 = null;
        }
        if((v & 2) != 0) {
            recommendedBlogNameList0 = null;
        }
        this(list0, recommendedBlogNameList0);
    }

    @Nullable
    public final List component1() {
        return this.emails;
    }

    @Nullable
    public final RecommendedBlogNameList component2() {
        return this.data;
    }

    @NotNull
    public final MemberErrorModel copy(@Nullable List list0, @Nullable RecommendedBlogNameList recommendedBlogNameList0) {
        return new MemberErrorModel(list0, recommendedBlogNameList0);
    }

    public static MemberErrorModel copy$default(MemberErrorModel memberErrorModel0, List list0, RecommendedBlogNameList recommendedBlogNameList0, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = memberErrorModel0.emails;
        }
        if((v & 2) != 0) {
            recommendedBlogNameList0 = memberErrorModel0.data;
        }
        return memberErrorModel0.copy(list0, recommendedBlogNameList0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof MemberErrorModel)) {
            return false;
        }
        return Intrinsics.areEqual(this.emails, ((MemberErrorModel)object0).emails) ? Intrinsics.areEqual(this.data, ((MemberErrorModel)object0).data) : false;
    }

    @Nullable
    public final RecommendedBlogNameList getData() {
        return this.data;
    }

    @Nullable
    public final List getEmails() {
        return this.emails;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.emails == null ? 0 : this.emails.hashCode();
        RecommendedBlogNameList recommendedBlogNameList0 = this.data;
        if(recommendedBlogNameList0 != null) {
            v = recommendedBlogNameList0.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    @NotNull
    public String toString() {
        return "MemberErrorModel(emails=" + this.emails + ", data=" + this.data + ")";
    }
}

