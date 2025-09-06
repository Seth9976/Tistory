package com.kakao.sdk.common.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u001D\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0006\u0010\u0007\u001A\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001A\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001A\u00020\bHÆ\u0003J\'\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00042\b\b\u0002\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\bHÆ\u0001J\t\u0010\u0014\u001A\u00020\u0004HÖ\u0001J\u0013\u0010\u0015\u001A\u00020\u00162\b\u0010\u0017\u001A\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001A\u00020\u0004HÖ\u0001J\t\u0010\u001A\u001A\u00020\u001BHÖ\u0001J\u0019\u0010\u001C\u001A\u00020\u001D2\u0006\u0010\u001E\u001A\u00020\u001F2\u0006\u0010 \u001A\u00020\u0004HÖ\u0001R\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0007\u001A\u00020\b¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000F¨\u0006\""}, d2 = {"Lcom/kakao/sdk/common/model/ApiError;", "Lcom/kakao/sdk/common/model/KakaoSdkError;", "Landroid/os/Parcelable;", "statusCode", "", "reason", "Lcom/kakao/sdk/common/model/ApiErrorCause;", "response", "Lcom/kakao/sdk/common/model/ApiErrorResponse;", "(ILcom/kakao/sdk/common/model/ApiErrorCause;Lcom/kakao/sdk/common/model/ApiErrorResponse;)V", "getReason", "()Lcom/kakao/sdk/common/model/ApiErrorCause;", "getResponse", "()Lcom/kakao/sdk/common/model/ApiErrorResponse;", "getStatusCode", "()I", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "common_release"}, k = 1, mv = {1, 1, 15})
@Parcelize
public final class ApiError extends KakaoSdkError implements Parcelable {
    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001B\u0010\u0006\u001A\u00020\u00052\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/kakao/sdk/common/model/ApiError$Companion;", "", "", "", "scopes", "Lcom/kakao/sdk/common/model/ApiError;", "fromScopes", "(Ljava/util/List;)Lcom/kakao/sdk/common/model/ApiError;", "common_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final ApiError fromScopes(@NotNull List list0) {
            Intrinsics.checkParameterIsNotNull(list0, "scopes");
            ApiErrorResponse apiErrorResponse0 = new ApiErrorResponse(ApiErrorCause.InsufficientScope.getErrorCode(), "", null, list0, null, 20, null);
            return new ApiError(403, ApiErrorCause.InsufficientScope, apiErrorResponse0);
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static final class Creator implements Parcelable.Creator {
        @Override  // android.os.Parcelable$Creator
        @NotNull
        public final Object createFromParcel(@NotNull Parcel parcel0) {
            Intrinsics.checkParameterIsNotNull(parcel0, "in");
            int v = parcel0.readInt();
            String s = parcel0.readString();
            ApiErrorResponse apiErrorResponse0 = (ApiErrorResponse)ApiErrorResponse.CREATOR.createFromParcel(parcel0);
            return new ApiError(v, ((ApiErrorCause)Enum.valueOf(ApiErrorCause.class, s)), apiErrorResponse0);
        }

        @Override  // android.os.Parcelable$Creator
        @NotNull
        public final Object[] newArray(int v) {
            return new ApiError[v];
        }
    }

    public static final Parcelable.Creator CREATOR;
    public static final Companion Companion;
    @NotNull
    private final ApiErrorCause reason;
    @NotNull
    private final ApiErrorResponse response;
    private final int statusCode;

    static {
        ApiError.Companion = new Companion(null);
        ApiError.CREATOR = new Creator();
    }

    public ApiError(int v, @NotNull ApiErrorCause apiErrorCause0, @NotNull ApiErrorResponse apiErrorResponse0) {
        Intrinsics.checkParameterIsNotNull(apiErrorCause0, "reason");
        Intrinsics.checkParameterIsNotNull(apiErrorResponse0, "response");
        super(apiErrorResponse0.getMsg(), null);
        this.statusCode = v;
        this.reason = apiErrorCause0;
        this.response = apiErrorResponse0;
    }

    public final int component1() {
        return this.statusCode;
    }

    @NotNull
    public final ApiErrorCause component2() {
        return this.reason;
    }

    @NotNull
    public final ApiErrorResponse component3() {
        return this.response;
    }

    @NotNull
    public final ApiError copy(int v, @NotNull ApiErrorCause apiErrorCause0, @NotNull ApiErrorResponse apiErrorResponse0) {
        Intrinsics.checkParameterIsNotNull(apiErrorCause0, "reason");
        Intrinsics.checkParameterIsNotNull(apiErrorResponse0, "response");
        return new ApiError(v, apiErrorCause0, apiErrorResponse0);
    }

    public static ApiError copy$default(ApiError apiError0, int v, ApiErrorCause apiErrorCause0, ApiErrorResponse apiErrorResponse0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = apiError0.statusCode;
        }
        if((v1 & 2) != 0) {
            apiErrorCause0 = apiError0.reason;
        }
        if((v1 & 4) != 0) {
            apiErrorResponse0 = apiError0.response;
        }
        return apiError0.copy(v, apiErrorCause0, apiErrorResponse0);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 || object0 instanceof ApiError && this.statusCode == ((ApiError)object0).statusCode && Intrinsics.areEqual(this.reason, ((ApiError)object0).reason) && Intrinsics.areEqual(this.response, ((ApiError)object0).response);
    }

    @NotNull
    public final ApiErrorCause getReason() {
        return this.reason;
    }

    @NotNull
    public final ApiErrorResponse getResponse() {
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
        ApiErrorResponse apiErrorResponse0 = this.response;
        if(apiErrorResponse0 != null) {
            v1 = apiErrorResponse0.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    @Override
    @NotNull
    public String toString() {
        return "ApiError(statusCode=" + this.statusCode + ", reason=" + this.reason + ", response=" + this.response + ")";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel0, int v) {
        Intrinsics.checkParameterIsNotNull(parcel0, "parcel");
        parcel0.writeInt(this.statusCode);
        parcel0.writeString(this.reason.name());
        this.response.writeToParcel(parcel0, 0);
    }
}

