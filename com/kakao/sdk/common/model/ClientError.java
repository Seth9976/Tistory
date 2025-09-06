package com.kakao.sdk.common.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001A\u00020\u0004HÆ\u0003J\t\u0010\r\u001A\u00020\u0006HÆ\u0003J\u001D\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00042\b\b\u0002\u0010\u0005\u001A\u00020\u0006HÆ\u0001J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001A\u00020\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001A\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001A\u00020\u0006HÖ\u0001J\u0019\u0010\u0017\u001A\u00020\u00182\u0006\u0010\u0019\u001A\u00020\u001A2\u0006\u0010\u001B\u001A\u00020\u0010HÖ\u0001R\u0014\u0010\u0005\u001A\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000B¨\u0006\u001C"}, d2 = {"Lcom/kakao/sdk/common/model/ClientError;", "Lcom/kakao/sdk/common/model/KakaoSdkError;", "Landroid/os/Parcelable;", "reason", "Lcom/kakao/sdk/common/model/ClientErrorCause;", "msg", "", "(Lcom/kakao/sdk/common/model/ClientErrorCause;Ljava/lang/String;)V", "getMsg", "()Ljava/lang/String;", "getReason", "()Lcom/kakao/sdk/common/model/ClientErrorCause;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "common_release"}, k = 1, mv = {1, 1, 15})
@Parcelize
public final class ClientError extends KakaoSdkError implements Parcelable {
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static final class Creator implements Parcelable.Creator {
        @Override  // android.os.Parcelable$Creator
        @NotNull
        public final Object createFromParcel(@NotNull Parcel parcel0) {
            Intrinsics.checkParameterIsNotNull(parcel0, "in");
            String s = parcel0.readString();
            String s1 = parcel0.readString();
            return new ClientError(((ClientErrorCause)Enum.valueOf(ClientErrorCause.class, s)), s1);
        }

        @Override  // android.os.Parcelable$Creator
        @NotNull
        public final Object[] newArray(int v) {
            return new ClientError[v];
        }
    }

    public static final Parcelable.Creator CREATOR;
    @NotNull
    private final String msg;
    @NotNull
    private final ClientErrorCause reason;

    static {
        ClientError.CREATOR = new Creator();
    }

    public ClientError(@NotNull ClientErrorCause clientErrorCause0, @NotNull String s) {
        Intrinsics.checkParameterIsNotNull(clientErrorCause0, "reason");
        Intrinsics.checkParameterIsNotNull(s, "msg");
        super(s, null);
        this.reason = clientErrorCause0;
        this.msg = s;
    }

    public ClientError(ClientErrorCause clientErrorCause0, String s, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            s = "Client-side error";
        }
        this(clientErrorCause0, s);
    }

    @NotNull
    public final ClientErrorCause component1() {
        return this.reason;
    }

    @NotNull
    public final String component2() {
        return this.getMsg();
    }

    @NotNull
    public final ClientError copy(@NotNull ClientErrorCause clientErrorCause0, @NotNull String s) {
        Intrinsics.checkParameterIsNotNull(clientErrorCause0, "reason");
        Intrinsics.checkParameterIsNotNull(s, "msg");
        return new ClientError(clientErrorCause0, s);
    }

    public static ClientError copy$default(ClientError clientError0, ClientErrorCause clientErrorCause0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            clientErrorCause0 = clientError0.reason;
        }
        if((v & 2) != 0) {
            s = clientError0.getMsg();
        }
        return clientError0.copy(clientErrorCause0, s);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 || object0 instanceof ClientError && Intrinsics.areEqual(this.reason, ((ClientError)object0).reason) && Intrinsics.areEqual(this.getMsg(), ((ClientError)object0).getMsg());
    }

    @Override  // com.kakao.sdk.common.model.KakaoSdkError
    @NotNull
    public String getMsg() {
        return this.msg;
    }

    @NotNull
    public final ClientErrorCause getReason() {
        return this.reason;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.reason == null ? 0 : this.reason.hashCode();
        String s = this.getMsg();
        if(s != null) {
            v = s.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    @NotNull
    public String toString() {
        return "ClientError(reason=" + this.reason + ", msg=" + this.getMsg() + ")";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel0, int v) {
        Intrinsics.checkParameterIsNotNull(parcel0, "parcel");
        parcel0.writeString(this.reason.name());
        parcel0.writeString(this.msg);
    }
}

