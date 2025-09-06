package com.kakao.sdk.auth.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.kakao.sdk.common.model.ClientError;
import com.kakao.sdk.common.model.ClientErrorCause;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001&B;\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0016\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0017\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003JE\u0010\u0018\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0001J\t\u0010\u0019\u001A\u00020\u001AHÖ\u0001J\u0013\u0010\u001B\u001A\u00020\u001C2\b\u0010\u001D\u001A\u0004\u0018\u00010\u001EHÖ\u0003J\t\u0010\u001F\u001A\u00020\u001AHÖ\u0001J\t\u0010 \u001A\u00020\u0003HÖ\u0001J\u0019\u0010!\u001A\u00020\"2\u0006\u0010#\u001A\u00020$2\u0006\u0010%\u001A\u00020\u001AHÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\fR\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000ER\u0019\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012¨\u0006\'"}, d2 = {"Lcom/kakao/sdk/auth/model/OAuthToken;", "Landroid/os/Parcelable;", "accessToken", "", "accessTokenExpiresAt", "Ljava/util/Date;", "refreshToken", "refreshTokenExpiresAt", "scopes", "", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/util/List;)V", "getAccessToken", "()Ljava/lang/String;", "getAccessTokenExpiresAt", "()Ljava/util/Date;", "getRefreshToken", "getRefreshTokenExpiresAt", "getScopes", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "auth_release"}, k = 1, mv = {1, 1, 15})
@Parcelize
public final class OAuthToken implements Parcelable {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J!\u0010\u0006\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/kakao/sdk/auth/model/OAuthToken$Companion;", "", "Lcom/kakao/sdk/auth/model/AccessTokenResponse;", "response", "Lcom/kakao/sdk/auth/model/OAuthToken;", "oldToken", "fromResponse", "(Lcom/kakao/sdk/auth/model/AccessTokenResponse;Lcom/kakao/sdk/auth/model/OAuthToken;)Lcom/kakao/sdk/auth/model/OAuthToken;", "auth_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final OAuthToken fromResponse(@NotNull AccessTokenResponse accessTokenResponse0, @Nullable OAuthToken oAuthToken0) {
            Date date1;
            String s2;
            Intrinsics.checkParameterIsNotNull(accessTokenResponse0, "response");
            String s = accessTokenResponse0.getAccessToken();
            Date date0 = new Date(accessTokenResponse0.getAccessTokenExpiresIn() * 1000L + new Date().getTime());
            String s1 = accessTokenResponse0.getRefreshToken();
            if(s1 != null) {
                s2 = s1;
            }
            else if(oAuthToken0 != null) {
                s2 = oAuthToken0.getRefreshToken();
            }
            else {
                s2 = null;
            }
            if(s2 == null) {
                throw new ClientError(ClientErrorCause.TokenNotFound, null, 2, null);
            }
            if(accessTokenResponse0.getRefreshToken() == null) {
                date1 = oAuthToken0 == null ? null : oAuthToken0.getRefreshTokenExpiresAt();
            }
            else {
                Long long0 = accessTokenResponse0.getRefreshTokenExpiresIn();
                date1 = long0 == null ? null : new Date(long0.longValue() * 1000L + new Date().getTime());
            }
            String s3 = accessTokenResponse0.getScopes();
            if(s3 != null) {
                List list0 = StringsKt__StringsKt.split$default(s3, new String[]{" "}, false, 0, 6, null);
                if(list0 != null) {
                    return new OAuthToken(s, date0, s2, date1, list0);
                }
            }
            return oAuthToken0 == null ? new OAuthToken(s, date0, s2, date1, null) : new OAuthToken(s, date0, s2, date1, oAuthToken0.getScopes());
        }

        public static OAuthToken fromResponse$default(Companion oAuthToken$Companion0, AccessTokenResponse accessTokenResponse0, OAuthToken oAuthToken0, int v, Object object0) {
            if((v & 2) != 0) {
                oAuthToken0 = null;
            }
            return oAuthToken$Companion0.fromResponse(accessTokenResponse0, oAuthToken0);
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static final class Creator implements Parcelable.Creator {
        @Override  // android.os.Parcelable$Creator
        @NotNull
        public final Object createFromParcel(@NotNull Parcel parcel0) {
            Intrinsics.checkParameterIsNotNull(parcel0, "in");
            return new OAuthToken(parcel0.readString(), ((Date)parcel0.readSerializable()), parcel0.readString(), ((Date)parcel0.readSerializable()), parcel0.createStringArrayList());
        }

        @Override  // android.os.Parcelable$Creator
        @NotNull
        public final Object[] newArray(int v) {
            return new OAuthToken[v];
        }
    }

    public static final Parcelable.Creator CREATOR;
    public static final Companion Companion;
    @NotNull
    private final String accessToken;
    @NotNull
    private final Date accessTokenExpiresAt;
    @NotNull
    private final String refreshToken;
    @Nullable
    private final Date refreshTokenExpiresAt;
    @Nullable
    private final List scopes;

    static {
        OAuthToken.Companion = new Companion(null);
        OAuthToken.CREATOR = new Creator();
    }

    public OAuthToken(@NotNull String s, @NotNull Date date0, @NotNull String s1, @Nullable Date date1, @Nullable List list0) {
        Intrinsics.checkParameterIsNotNull(s, "accessToken");
        Intrinsics.checkParameterIsNotNull(date0, "accessTokenExpiresAt");
        Intrinsics.checkParameterIsNotNull(s1, "refreshToken");
        super();
        this.accessToken = s;
        this.accessTokenExpiresAt = date0;
        this.refreshToken = s1;
        this.refreshTokenExpiresAt = date1;
        this.scopes = list0;
    }

    public OAuthToken(String s, Date date0, String s1, Date date1, List list0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(s, date0, s1, ((v & 8) == 0 ? date1 : null), ((v & 16) == 0 ? list0 : null));
    }

    @NotNull
    public final String component1() {
        return this.accessToken;
    }

    @NotNull
    public final Date component2() {
        return this.accessTokenExpiresAt;
    }

    @NotNull
    public final String component3() {
        return this.refreshToken;
    }

    @Nullable
    public final Date component4() {
        return this.refreshTokenExpiresAt;
    }

    @Nullable
    public final List component5() {
        return this.scopes;
    }

    @NotNull
    public final OAuthToken copy(@NotNull String s, @NotNull Date date0, @NotNull String s1, @Nullable Date date1, @Nullable List list0) {
        Intrinsics.checkParameterIsNotNull(s, "accessToken");
        Intrinsics.checkParameterIsNotNull(date0, "accessTokenExpiresAt");
        Intrinsics.checkParameterIsNotNull(s1, "refreshToken");
        return new OAuthToken(s, date0, s1, date1, list0);
    }

    public static OAuthToken copy$default(OAuthToken oAuthToken0, String s, Date date0, String s1, Date date1, List list0, int v, Object object0) {
        if((v & 1) != 0) {
            s = oAuthToken0.accessToken;
        }
        if((v & 2) != 0) {
            date0 = oAuthToken0.accessTokenExpiresAt;
        }
        if((v & 4) != 0) {
            s1 = oAuthToken0.refreshToken;
        }
        if((v & 8) != 0) {
            date1 = oAuthToken0.refreshTokenExpiresAt;
        }
        if((v & 16) != 0) {
            list0 = oAuthToken0.scopes;
        }
        return oAuthToken0.copy(s, date0, s1, date1, list0);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 中等(60)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 || object0 instanceof OAuthToken && Intrinsics.areEqual(this.accessToken, ((OAuthToken)object0).accessToken) && Intrinsics.areEqual(this.accessTokenExpiresAt, ((OAuthToken)object0).accessTokenExpiresAt) && Intrinsics.areEqual(this.refreshToken, ((OAuthToken)object0).refreshToken) && Intrinsics.areEqual(this.refreshTokenExpiresAt, ((OAuthToken)object0).refreshTokenExpiresAt) && Intrinsics.areEqual(this.scopes, ((OAuthToken)object0).scopes);
    }

    @NotNull
    public final String getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    public final Date getAccessTokenExpiresAt() {
        return this.accessTokenExpiresAt;
    }

    @NotNull
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    @Nullable
    public final Date getRefreshTokenExpiresAt() {
        return this.refreshTokenExpiresAt;
    }

    @Nullable
    public final List getScopes() {
        return this.scopes;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.accessToken == null ? 0 : this.accessToken.hashCode();
        int v2 = this.accessTokenExpiresAt == null ? 0 : this.accessTokenExpiresAt.hashCode();
        int v3 = this.refreshToken == null ? 0 : this.refreshToken.hashCode();
        int v4 = this.refreshTokenExpiresAt == null ? 0 : this.refreshTokenExpiresAt.hashCode();
        List list0 = this.scopes;
        if(list0 != null) {
            v = list0.hashCode();
        }
        return (((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("OAuthToken(accessToken=");
        stringBuilder0.append(this.accessToken);
        stringBuilder0.append(", accessTokenExpiresAt=");
        stringBuilder0.append(this.accessTokenExpiresAt);
        stringBuilder0.append(", refreshToken=");
        stringBuilder0.append(this.refreshToken);
        stringBuilder0.append(", refreshTokenExpiresAt=");
        stringBuilder0.append(this.refreshTokenExpiresAt);
        stringBuilder0.append(", scopes=");
        return a.e(stringBuilder0, this.scopes, ")");
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel0, int v) {
        Intrinsics.checkParameterIsNotNull(parcel0, "parcel");
        parcel0.writeString(this.accessToken);
        parcel0.writeSerializable(this.accessTokenExpiresAt);
        parcel0.writeString(this.refreshToken);
        parcel0.writeSerializable(this.refreshTokenExpiresAt);
        parcel0.writeStringList(this.scopes);
    }
}

