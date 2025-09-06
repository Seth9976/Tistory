package com.kakao.sdk.common.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001D\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0006\u0010\u0007\u001A\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001A\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001A\u00020\bHÆ\u0003J\'\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00042\b\b\u0002\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\bHÆ\u0001J\t\u0010\u0014\u001A\u00020\u0004HÖ\u0001J\u0013\u0010\u0015\u001A\u00020\u00162\b\u0010\u0017\u001A\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001A\u00020\u0004HÖ\u0001J\t\u0010\u001A\u001A\u00020\u001BHÖ\u0001J\u0019\u0010\u001C\u001A\u00020\u001D2\u0006\u0010\u001E\u001A\u00020\u001F2\u0006\u0010 \u001A\u00020\u0004HÖ\u0001R\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0007\u001A\u00020\b¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000F¨\u0006!"}, d2 = {"Lcom/kakao/sdk/common/model/AuthError;", "Lcom/kakao/sdk/common/model/KakaoSdkError;", "Landroid/os/Parcelable;", "statusCode", "", "reason", "Lcom/kakao/sdk/common/model/AuthErrorCause;", "response", "Lcom/kakao/sdk/common/model/AuthErrorResponse;", "(ILcom/kakao/sdk/common/model/AuthErrorCause;Lcom/kakao/sdk/common/model/AuthErrorResponse;)V", "getReason", "()Lcom/kakao/sdk/common/model/AuthErrorCause;", "getResponse", "()Lcom/kakao/sdk/common/model/AuthErrorResponse;", "getStatusCode", "()I", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "common_release"}, k = 1, mv = {1, 1, 15})
@Parcelize
public final class AuthError extends KakaoSdkError implements Parcelable {
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static final class Creator implements Parcelable.Creator {
        @Override  // android.os.Parcelable$Creator
        @NotNull
        public final Object createFromParcel(@NotNull Parcel parcel0) {
            Intrinsics.checkParameterIsNotNull(parcel0, "in");
            int v = parcel0.readInt();
            String s = parcel0.readString();
            AuthErrorResponse authErrorResponse0 = (AuthErrorResponse)AuthErrorResponse.CREATOR.createFromParcel(parcel0);
            return new AuthError(v, ((AuthErrorCause)Enum.valueOf(AuthErrorCause.class, s)), authErrorResponse0);
        }

        @Override  // android.os.Parcelable$Creator
        @NotNull
        public final Object[] newArray(int v) {
            return new AuthError[v];
        }
    }

    public static final Parcelable.Creator CREATOR;
    @NotNull
    private final AuthErrorCause reason;
    @NotNull
    private final AuthErrorResponse response;
    private final int statusCode;

    static {
        AuthError.CREATOR = new Creator();
    }

    public AuthError(int v, @NotNull AuthErrorCause authErrorCause0, @NotNull AuthErrorResponse authErrorResponse0) {
        Intrinsics.checkParameterIsNotNull(authErrorCause0, "reason");
        Intrinsics.checkParameterIsNotNull(authErrorResponse0, "response");
        String s = authErrorResponse0.getErrorDescription();
        if(s == null) {
            s = authErrorResponse0.getError();
        }
        super(s, null);
        this.statusCode = v;
        this.reason = authErrorCause0;
        this.response = authErrorResponse0;
    }

    public final int component1() {
        return this.statusCode;
    }

    @NotNull
    public final AuthErrorCause component2() {
        return this.reason;
    }

    @NotNull
    public final AuthErrorResponse component3() {
        return this.response;
    }

    @NotNull
    public final AuthError copy(int v, @NotNull AuthErrorCause authErrorCause0, @NotNull AuthErrorResponse authErrorResponse0) {
        Intrinsics.checkParameterIsNotNull(authErrorCause0, "reason");
        Intrinsics.checkParameterIsNotNull(authErrorResponse0, "response");
        return new AuthError(v, authErrorCause0, authErrorResponse0);
    }

    public static AuthError copy$default(AuthError authError0, int v, AuthErrorCause authErrorCause0, AuthErrorResponse authErrorResponse0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = authError0.statusCode;
        }
        if((v1 & 2) != 0) {
            authErrorCause0 = authError0.reason;
        }
        if((v1 & 4) != 0) {
            authErrorResponse0 = authError0.response;
        }
        return authError0.copy(v, authErrorCause0, authErrorResponse0);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 || object0 instanceof AuthError && this.statusCode == ((AuthError)object0).statusCode && Intrinsics.areEqual(this.reason, ((AuthError)object0).reason) && Intrinsics.areEqual(this.response, ((AuthError)object0).response);
    }

    @NotNull
    public final AuthErrorCause getReason() {
        return this.reason;
    }

    @NotNull
    public final AuthErrorResponse getResponse() {
        return this.response;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    @Override
    public int hashCode() {
        int v = this.statusCode;
        int v1 = 0;
        int v2 = this.reason == null ? 0 : this.reason.hashCode();
        AuthErrorResponse authErrorResponse0 = this.response;
        if(authErrorResponse0 != null) {
            v1 = authErrorResponse0.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    @Override
    @NotNull
    public String toString() {
        return "AuthError(statusCode=" + this.statusCode + ", reason=" + this.reason + ", response=" + this.response + ")";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel0, int v) {
        Intrinsics.checkParameterIsNotNull(parcel0, "parcel");
        parcel0.writeInt(this.statusCode);
        parcel0.writeString(this.reason.name());
        this.response.writeToParcel(parcel0, 0);
    }
}

