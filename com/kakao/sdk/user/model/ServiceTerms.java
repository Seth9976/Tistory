package com.kakao.sdk.user.model;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0005HÆ\u0003J\u001D\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\u000E\u001A\u00020\u000F2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001A\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/kakao/sdk/user/model/ServiceTerms;", "", "tag", "", "agreedAt", "Ljava/util/Date;", "(Ljava/lang/String;Ljava/util/Date;)V", "getAgreedAt", "()Ljava/util/Date;", "getTag", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "user_release"}, k = 1, mv = {1, 1, 15})
public final class ServiceTerms {
    @NotNull
    private final Date agreedAt;
    @NotNull
    private final String tag;

    public ServiceTerms(@NotNull String s, @NotNull Date date0) {
        Intrinsics.checkParameterIsNotNull(s, "tag");
        Intrinsics.checkParameterIsNotNull(date0, "agreedAt");
        super();
        this.tag = s;
        this.agreedAt = date0;
    }

    @NotNull
    public final String component1() {
        return this.tag;
    }

    @NotNull
    public final Date component2() {
        return this.agreedAt;
    }

    @NotNull
    public final ServiceTerms copy(@NotNull String s, @NotNull Date date0) {
        Intrinsics.checkParameterIsNotNull(s, "tag");
        Intrinsics.checkParameterIsNotNull(date0, "agreedAt");
        return new ServiceTerms(s, date0);
    }

    public static ServiceTerms copy$default(ServiceTerms serviceTerms0, String s, Date date0, int v, Object object0) {
        if((v & 1) != 0) {
            s = serviceTerms0.tag;
        }
        if((v & 2) != 0) {
            date0 = serviceTerms0.agreedAt;
        }
        return serviceTerms0.copy(s, date0);
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 || object0 instanceof ServiceTerms && Intrinsics.areEqual(this.tag, ((ServiceTerms)object0).tag) && Intrinsics.areEqual(this.agreedAt, ((ServiceTerms)object0).agreedAt);
    }

    @NotNull
    public final Date getAgreedAt() {
        return this.agreedAt;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.tag == null ? 0 : this.tag.hashCode();
        Date date0 = this.agreedAt;
        if(date0 != null) {
            v = date0.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    @NotNull
    public String toString() {
        return "ServiceTerms(tag=" + this.tag + ", agreedAt=" + this.agreedAt + ")";
    }
}

