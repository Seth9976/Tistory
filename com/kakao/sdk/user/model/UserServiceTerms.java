package com.kakao.sdk.user.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u000E\u0010\u0004\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001A\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\u0010\b\u0002\u0010\u0004\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0015HÖ\u0001R\u0019\u0010\u0004\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000B¨\u0006\u0016"}, d2 = {"Lcom/kakao/sdk/user/model/UserServiceTerms;", "", "userId", "", "allowedServiceTerms", "", "Lcom/kakao/sdk/user/model/ServiceTerms;", "(JLjava/util/List;)V", "getAllowedServiceTerms", "()Ljava/util/List;", "getUserId", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "user_release"}, k = 1, mv = {1, 1, 15})
public final class UserServiceTerms {
    @Nullable
    private final List allowedServiceTerms;
    private final long userId;

    public UserServiceTerms(long v, @Nullable List list0) {
        this.userId = v;
        this.allowedServiceTerms = list0;
    }

    public final long component1() {
        return this.userId;
    }

    @Nullable
    public final List component2() {
        return this.allowedServiceTerms;
    }

    @NotNull
    public final UserServiceTerms copy(long v, @Nullable List list0) {
        return new UserServiceTerms(v, list0);
    }

    public static UserServiceTerms copy$default(UserServiceTerms userServiceTerms0, long v, List list0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = userServiceTerms0.userId;
        }
        if((v1 & 2) != 0) {
            list0 = userServiceTerms0.allowedServiceTerms;
        }
        return userServiceTerms0.copy(v, list0);
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 || object0 instanceof UserServiceTerms && this.userId == ((UserServiceTerms)object0).userId && Intrinsics.areEqual(this.allowedServiceTerms, ((UserServiceTerms)object0).allowedServiceTerms);
    }

    @Nullable
    public final List getAllowedServiceTerms() {
        return this.allowedServiceTerms;
    }

    public final long getUserId() {
        return this.userId;
    }

    @Override
    public int hashCode() {
        int v = Long.hashCode(this.userId);
        return this.allowedServiceTerms == null ? v * 0x1F : v * 0x1F + this.allowedServiceTerms.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("UserServiceTerms(userId=");
        stringBuilder0.append(this.userId);
        stringBuilder0.append(", allowedServiceTerms=");
        return a.e(stringBuilder0, this.allowedServiceTerms, ")");
    }
}

