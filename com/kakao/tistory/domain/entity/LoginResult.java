package com.kakao.tistory.domain.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\u0010\u0010\f\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ$\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000EJ\u0013\u0010\u000F\u001A\u00020\u00032\b\u0010\u0010\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001A\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001A\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0002\u0010\u0007R\u0015\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\n\u001A\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/kakao/tistory/domain/entity/LoginResult;", "", "isTistoryAccount", "", "userId", "", "(ZLjava/lang/Long;)V", "()Z", "getUserId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(ZLjava/lang/Long;)Lcom/kakao/tistory/domain/entity/LoginResult;", "equals", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class LoginResult {
    private final boolean isTistoryAccount;
    @Nullable
    private final Long userId;

    public LoginResult(boolean z, @Nullable Long long0) {
        this.isTistoryAccount = z;
        this.userId = long0;
    }

    public final boolean component1() {
        return this.isTistoryAccount;
    }

    @Nullable
    public final Long component2() {
        return this.userId;
    }

    @NotNull
    public final LoginResult copy(boolean z, @Nullable Long long0) {
        return new LoginResult(z, long0);
    }

    public static LoginResult copy$default(LoginResult loginResult0, boolean z, Long long0, int v, Object object0) {
        if((v & 1) != 0) {
            z = loginResult0.isTistoryAccount;
        }
        if((v & 2) != 0) {
            long0 = loginResult0.userId;
        }
        return loginResult0.copy(z, long0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof LoginResult)) {
            return false;
        }
        return this.isTistoryAccount == ((LoginResult)object0).isTistoryAccount ? Intrinsics.areEqual(this.userId, ((LoginResult)object0).userId) : false;
    }

    @Nullable
    public final Long getUserId() {
        return this.userId;
    }

    @Override
    public int hashCode() {
        int v = Boolean.hashCode(this.isTistoryAccount);
        return this.userId == null ? v * 0x1F : v * 0x1F + this.userId.hashCode();
    }

    public final boolean isTistoryAccount() {
        return this.isTistoryAccount;
    }

    @Override
    @NotNull
    public String toString() {
        return "LoginResult(isTistoryAccount=" + this.isTistoryAccount + ", userId=" + this.userId + ")";
    }
}

