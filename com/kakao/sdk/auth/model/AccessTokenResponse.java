package com.kakao.sdk.auth.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001A\u00020\u0003\u0012\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\u0002\u0010\nJ\t\u0010\u0015\u001A\u00020\u0003H\u00C6\u0003J\u000B\u0010\u0016\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\t\u0010\u0017\u001A\u00020\u0006H\u00C6\u0003J\u0010\u0010\u0018\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003\u00A2\u0006\u0002\u0010\u0011J\t\u0010\u0019\u001A\u00020\u0003H\u00C6\u0003J\u000B\u0010\u001A\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003JP\u0010\u001B\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00062\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001A\u00020\u00032\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u0003H\u00C6\u0001\u00A2\u0006\u0002\u0010\u001CJ\t\u0010\u001D\u001A\u00020\u001EH\u00D6\u0001J\u0013\u0010\u001F\u001A\u00020 2\b\u0010!\u001A\u0004\u0018\u00010\"H\u00D6\u0003J\t\u0010#\u001A\u00020\u001EH\u00D6\u0001J\t\u0010$\u001A\u00020\u0003H\u00D6\u0001J\u0019\u0010%\u001A\u00020&2\u0006\u0010\'\u001A\u00020(2\u0006\u0010)\u001A\u00020\u001EH\u00D6\u0001R\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0016\u0010\u0005\u001A\u00020\u00068\u0006X\u0087\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\fR\u0015\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\n\n\u0002\u0010\u0012\u001A\u0004\b\u0010\u0010\u0011R\u0018\u0010\t\u001A\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\fR\u0011\u0010\b\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\f\u00A8\u0006*"}, d2 = {"Lcom/kakao/sdk/auth/model/AccessTokenResponse;", "Landroid/os/Parcelable;", "accessToken", "", "refreshToken", "accessTokenExpiresIn", "", "refreshTokenExpiresIn", "tokenType", "scopes", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getAccessTokenExpiresIn", "()J", "getRefreshToken", "getRefreshTokenExpiresIn", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getScopes", "getTokenType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/sdk/auth/model/AccessTokenResponse;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "auth_release"}, k = 1, mv = {1, 1, 15})
@Parcelize
public final class AccessTokenResponse implements Parcelable {
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static final class Creator implements Parcelable.Creator {
        @Override  // android.os.Parcelable$Creator
        @NotNull
        public final Object createFromParcel(@NotNull Parcel parcel0) {
            Intrinsics.checkParameterIsNotNull(parcel0, "in");
            String s = parcel0.readString();
            String s1 = parcel0.readString();
            long v = parcel0.readLong();
            return parcel0.readInt() == 0 ? new AccessTokenResponse(s, s1, v, null, parcel0.readString(), parcel0.readString()) : new AccessTokenResponse(s, s1, v, parcel0.readLong(), parcel0.readString(), parcel0.readString());
        }

        @Override  // android.os.Parcelable$Creator
        @NotNull
        public final Object[] newArray(int v) {
            return new AccessTokenResponse[v];
        }
    }

    public static final Parcelable.Creator CREATOR;
    @NotNull
    private final String accessToken;
    @SerializedName("expires_in")
    private final long accessTokenExpiresIn;
    @Nullable
    private final String refreshToken;
    @Nullable
    private final Long refreshTokenExpiresIn;
    @SerializedName("scope")
    @Nullable
    private final String scopes;
    @NotNull
    private final String tokenType;

    static {
        AccessTokenResponse.CREATOR = new Creator();
    }

    public AccessTokenResponse(@NotNull String s, @Nullable String s1, long v, @Nullable Long long0, @NotNull String s2, @Nullable String s3) {
        Intrinsics.checkParameterIsNotNull(s, "accessToken");
        Intrinsics.checkParameterIsNotNull(s2, "tokenType");
        super();
        this.accessToken = s;
        this.refreshToken = s1;
        this.accessTokenExpiresIn = v;
        this.refreshTokenExpiresIn = long0;
        this.tokenType = s2;
        this.scopes = s3;
    }

    public AccessTokenResponse(String s, String s1, long v, Long long0, String s2, String s3, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this(s, ((v1 & 2) == 0 ? s1 : null), v, ((v1 & 8) == 0 ? long0 : null), s2, ((v1 & 0x20) == 0 ? s3 : null));
    }

    @NotNull
    public final String component1() {
        return this.accessToken;
    }

    @Nullable
    public final String component2() {
        return this.refreshToken;
    }

    public final long component3() {
        return this.accessTokenExpiresIn;
    }

    @Nullable
    public final Long component4() {
        return this.refreshTokenExpiresIn;
    }

    @NotNull
    public final String component5() {
        return this.tokenType;
    }

    @Nullable
    public final String component6() {
        return this.scopes;
    }

    @NotNull
    public final AccessTokenResponse copy(@NotNull String s, @Nullable String s1, long v, @Nullable Long long0, @NotNull String s2, @Nullable String s3) {
        Intrinsics.checkParameterIsNotNull(s, "accessToken");
        Intrinsics.checkParameterIsNotNull(s2, "tokenType");
        return new AccessTokenResponse(s, s1, v, long0, s2, s3);
    }

    public static AccessTokenResponse copy$default(AccessTokenResponse accessTokenResponse0, String s, String s1, long v, Long long0, String s2, String s3, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = accessTokenResponse0.accessToken;
        }
        if((v1 & 2) != 0) {
            s1 = accessTokenResponse0.refreshToken;
        }
        if((v1 & 4) != 0) {
            v = accessTokenResponse0.accessTokenExpiresIn;
        }
        if((v1 & 8) != 0) {
            long0 = accessTokenResponse0.refreshTokenExpiresIn;
        }
        if((v1 & 16) != 0) {
            s2 = accessTokenResponse0.tokenType;
        }
        if((v1 & 0x20) != 0) {
            s3 = accessTokenResponse0.scopes;
        }
        return accessTokenResponse0.copy(s, s1, v, long0, s2, s3);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 中等(60)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 || object0 instanceof AccessTokenResponse && Intrinsics.areEqual(this.accessToken, ((AccessTokenResponse)object0).accessToken) && Intrinsics.areEqual(this.refreshToken, ((AccessTokenResponse)object0).refreshToken) && this.accessTokenExpiresIn == ((AccessTokenResponse)object0).accessTokenExpiresIn && Intrinsics.areEqual(this.refreshTokenExpiresIn, ((AccessTokenResponse)object0).refreshTokenExpiresIn) && Intrinsics.areEqual(this.tokenType, ((AccessTokenResponse)object0).tokenType) && Intrinsics.areEqual(this.scopes, ((AccessTokenResponse)object0).scopes);
    }

    @NotNull
    public final String getAccessToken() {
        return this.accessToken;
    }

    public final long getAccessTokenExpiresIn() {
        return this.accessTokenExpiresIn;
    }

    @Nullable
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    @Nullable
    public final Long getRefreshTokenExpiresIn() {
        return this.refreshTokenExpiresIn;
    }

    @Nullable
    public final String getScopes() {
        return this.scopes;
    }

    @NotNull
    public final String getTokenType() {
        return this.tokenType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = a.k(this.accessTokenExpiresIn, ((this.accessToken == null ? 0 : this.accessToken.hashCode()) * 0x1F + (this.refreshToken == null ? 0 : this.refreshToken.hashCode())) * 0x1F, 0x1F);
        int v2 = this.refreshTokenExpiresIn == null ? 0 : this.refreshTokenExpiresIn.hashCode();
        int v3 = this.tokenType == null ? 0 : this.tokenType.hashCode();
        String s = this.scopes;
        if(s != null) {
            v = s.hashCode();
        }
        return ((v1 + v2) * 0x1F + v3) * 0x1F + v;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("AccessTokenResponse(accessToken=");
        stringBuilder0.append(this.accessToken);
        stringBuilder0.append(", refreshToken=");
        stringBuilder0.append(this.refreshToken);
        stringBuilder0.append(", accessTokenExpiresIn=");
        stringBuilder0.append(this.accessTokenExpiresIn);
        stringBuilder0.append(", refreshTokenExpiresIn=");
        stringBuilder0.append(this.refreshTokenExpiresIn);
        stringBuilder0.append(", tokenType=");
        stringBuilder0.append(this.tokenType);
        stringBuilder0.append(", scopes=");
        return r0.a.o(stringBuilder0, this.scopes, ")");
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel0, int v) {
        Intrinsics.checkParameterIsNotNull(parcel0, "parcel");
        parcel0.writeString(this.accessToken);
        parcel0.writeString(this.refreshToken);
        parcel0.writeLong(this.accessTokenExpiresIn);
        Long long0 = this.refreshTokenExpiresIn;
        if(long0 == null) {
            parcel0.writeInt(0);
        }
        else {
            parcel0.writeInt(1);
            parcel0.writeLong(((long)long0));
        }
        parcel0.writeString(this.tokenType);
        parcel0.writeString(this.scopes);
    }
}

