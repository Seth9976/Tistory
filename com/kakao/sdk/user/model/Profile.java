package com.kakao.sdk.user.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0003HÆ\u0003J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\'\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0003HÆ\u0001J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001A\u00020\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001A\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001A\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001A\u00020\u00182\u0006\u0010\u0019\u001A\u00020\u001A2\u0006\u0010\u001B\u001A\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\b¨\u0006\u001C"}, d2 = {"Lcom/kakao/sdk/user/model/Profile;", "Landroid/os/Parcelable;", "nickname", "", "profileImageUrl", "thumbnailImageUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNickname", "()Ljava/lang/String;", "getProfileImageUrl", "getThumbnailImageUrl", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "user_release"}, k = 1, mv = {1, 1, 15})
@Parcelize
public final class Profile implements Parcelable {
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static final class Creator implements Parcelable.Creator {
        @Override  // android.os.Parcelable$Creator
        @NotNull
        public final Object createFromParcel(@NotNull Parcel parcel0) {
            Intrinsics.checkParameterIsNotNull(parcel0, "in");
            return new Profile(parcel0.readString(), parcel0.readString(), parcel0.readString());
        }

        @Override  // android.os.Parcelable$Creator
        @NotNull
        public final Object[] newArray(int v) {
            return new Profile[v];
        }
    }

    public static final Parcelable.Creator CREATOR;
    @NotNull
    private final String nickname;
    @NotNull
    private final String profileImageUrl;
    @NotNull
    private final String thumbnailImageUrl;

    static {
        Profile.CREATOR = new Creator();
    }

    public Profile(@NotNull String s, @NotNull String s1, @NotNull String s2) {
        Intrinsics.checkParameterIsNotNull(s, "nickname");
        Intrinsics.checkParameterIsNotNull(s1, "profileImageUrl");
        Intrinsics.checkParameterIsNotNull(s2, "thumbnailImageUrl");
        super();
        this.nickname = s;
        this.profileImageUrl = s1;
        this.thumbnailImageUrl = s2;
    }

    @NotNull
    public final String component1() {
        return this.nickname;
    }

    @NotNull
    public final String component2() {
        return this.profileImageUrl;
    }

    @NotNull
    public final String component3() {
        return this.thumbnailImageUrl;
    }

    @NotNull
    public final Profile copy(@NotNull String s, @NotNull String s1, @NotNull String s2) {
        Intrinsics.checkParameterIsNotNull(s, "nickname");
        Intrinsics.checkParameterIsNotNull(s1, "profileImageUrl");
        Intrinsics.checkParameterIsNotNull(s2, "thumbnailImageUrl");
        return new Profile(s, s1, s2);
    }

    public static Profile copy$default(Profile profile0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = profile0.nickname;
        }
        if((v & 2) != 0) {
            s1 = profile0.profileImageUrl;
        }
        if((v & 4) != 0) {
            s2 = profile0.thumbnailImageUrl;
        }
        return profile0.copy(s, s1, s2);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 || object0 instanceof Profile && Intrinsics.areEqual(this.nickname, ((Profile)object0).nickname) && Intrinsics.areEqual(this.profileImageUrl, ((Profile)object0).profileImageUrl) && Intrinsics.areEqual(this.thumbnailImageUrl, ((Profile)object0).thumbnailImageUrl);
    }

    @NotNull
    public final String getNickname() {
        return this.nickname;
    }

    @NotNull
    public final String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    @NotNull
    public final String getThumbnailImageUrl() {
        return this.thumbnailImageUrl;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.nickname == null ? 0 : this.nickname.hashCode();
        int v2 = this.profileImageUrl == null ? 0 : this.profileImageUrl.hashCode();
        String s = this.thumbnailImageUrl;
        if(s != null) {
            v = s.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Profile(nickname=");
        stringBuilder0.append(this.nickname);
        stringBuilder0.append(", profileImageUrl=");
        stringBuilder0.append(this.profileImageUrl);
        stringBuilder0.append(", thumbnailImageUrl=");
        return a.o(stringBuilder0, this.thumbnailImageUrl, ")");
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel0, int v) {
        Intrinsics.checkParameterIsNotNull(parcel0, "parcel");
        parcel0.writeString(this.nickname);
        parcel0.writeString(this.profileImageUrl);
        parcel0.writeString(this.thumbnailImageUrl);
    }
}

