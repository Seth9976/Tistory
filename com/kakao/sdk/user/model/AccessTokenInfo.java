package com.kakao.sdk.user.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ.\u0010\u0012\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\t\u0010\u0014\u001A\u00020\u0015HÖ\u0001J\u0013\u0010\u0016\u001A\u00020\u00172\b\u0010\u0018\u001A\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001A\u001A\u00020\u0015HÖ\u0001J\t\u0010\u001B\u001A\u00020\u001CHÖ\u0001J\u0019\u0010\u001D\u001A\u00020\u001E2\u0006\u0010\u001F\u001A\u00020 2\u0006\u0010!\u001A\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR \u0010\u0005\u001A\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\r\u0012\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\b¨\u0006\""}, d2 = {"Lcom/kakao/sdk/user/model/AccessTokenInfo;", "Landroid/os/Parcelable;", "id", "", "expiresIn", "expiresInMillis", "(JJLjava/lang/Long;)V", "getExpiresIn", "()J", "expiresInMillis$annotations", "()V", "getExpiresInMillis", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getId", "component1", "component2", "component3", "copy", "(JJLjava/lang/Long;)Lcom/kakao/sdk/user/model/AccessTokenInfo;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "user_release"}, k = 1, mv = {1, 1, 15})
@Parcelize
public final class AccessTokenInfo implements Parcelable {
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static final class Creator implements Parcelable.Creator {
        @Override  // android.os.Parcelable$Creator
        @NotNull
        public final Object createFromParcel(@NotNull Parcel parcel0) {
            Intrinsics.checkParameterIsNotNull(parcel0, "in");
            long v = parcel0.readLong();
            long v1 = parcel0.readLong();
            return parcel0.readInt() == 0 ? new AccessTokenInfo(v, v1, null) : new AccessTokenInfo(v, v1, parcel0.readLong());
        }

        @Override  // android.os.Parcelable$Creator
        @NotNull
        public final Object[] newArray(int v) {
            return new AccessTokenInfo[v];
        }
    }

    public static final Parcelable.Creator CREATOR;
    private final long expiresIn;
    @SerializedName("expiresInMillis")
    @Nullable
    private final Long expiresInMillis;
    private final long id;

    static {
        AccessTokenInfo.CREATOR = new Creator();
    }

    public AccessTokenInfo(long v, long v1, @Nullable Long long0) {
        this.id = v;
        this.expiresIn = v1;
        this.expiresInMillis = long0;
    }

    public final long component1() {
        return this.id;
    }

    public final long component2() {
        return this.expiresIn;
    }

    @Nullable
    public final Long component3() {
        return this.expiresInMillis;
    }

    @NotNull
    public final AccessTokenInfo copy(long v, long v1, @Nullable Long long0) {
        return new AccessTokenInfo(v, v1, long0);
    }

    public static AccessTokenInfo copy$default(AccessTokenInfo accessTokenInfo0, long v, long v1, Long long0, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = accessTokenInfo0.id;
        }
        if((v2 & 2) != 0) {
            v1 = accessTokenInfo0.expiresIn;
        }
        if((v2 & 4) != 0) {
            long0 = accessTokenInfo0.expiresInMillis;
        }
        return accessTokenInfo0.copy(v, v1, long0);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 || object0 instanceof AccessTokenInfo && this.id == ((AccessTokenInfo)object0).id && this.expiresIn == ((AccessTokenInfo)object0).expiresIn && Intrinsics.areEqual(this.expiresInMillis, ((AccessTokenInfo)object0).expiresInMillis);
    }

    @Deprecated(message = "\'초\' 단위를 사용하는 \'expiresIn\' 속성으로 대체되었습니다.")
    public static void expiresInMillis$annotations() {
    }

    public final long getExpiresIn() {
        return this.expiresIn;
    }

    @Nullable
    public final Long getExpiresInMillis() {
        return this.expiresInMillis;
    }

    public final long getId() {
        return this.id;
    }

    @Override
    public int hashCode() {
        int v = a.k(this.expiresIn, Long.hashCode(this.id) * 0x1F, 0x1F);
        return this.expiresInMillis == null ? v : v + this.expiresInMillis.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "AccessTokenInfo(id=" + this.id + ", expiresIn=" + this.expiresIn + ", expiresInMillis=" + this.expiresInMillis + ")";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel0, int v) {
        Intrinsics.checkParameterIsNotNull(parcel0, "parcel");
        parcel0.writeLong(this.id);
        parcel0.writeLong(this.expiresIn);
        Long long0 = this.expiresInMillis;
        if(long0 != null) {
            parcel0.writeInt(1);
            parcel0.writeLong(((long)long0));
            return;
        }
        parcel0.writeInt(0);
    }
}

