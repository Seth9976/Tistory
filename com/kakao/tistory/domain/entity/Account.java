package com.kakao.tistory.domain.entity;

import a5.b;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000B\u0010\r\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u000E\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u000F\u001A\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0010\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\u0011\u001A\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001A\u00020\u00142\b\u0010\u0015\u001A\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001A\u00020\u001A2\u0006\u0010\u001B\u001A\u00020\u001C2\u0006\u0010\u001D\u001A\u00020\u0012HÖ\u0001R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\f¨\u0006\u001E"}, d2 = {"Lcom/kakao/tistory/domain/entity/Account;", "Landroid/os/Parcelable;", "token", "", "kakaoAccessToken", "user", "Lcom/kakao/tistory/domain/entity/User;", "(Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/domain/entity/User;)V", "getKakaoAccessToken", "()Ljava/lang/String;", "getToken", "getUser", "()Lcom/kakao/tistory/domain/entity/User;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Parcelize
public final class Account implements Parcelable {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class Creator implements Parcelable.Creator {
        @NotNull
        public final Account createFromParcel(@NotNull Parcel parcel0) {
            Intrinsics.checkNotNullParameter(parcel0, "parcel");
            String s = parcel0.readString();
            String s1 = parcel0.readString();
            return parcel0.readInt() == 0 ? new Account(s, s1, null) : new Account(s, s1, ((User)User.CREATOR.createFromParcel(parcel0)));
        }

        @Override  // android.os.Parcelable$Creator
        public Object createFromParcel(Parcel parcel0) {
            return this.createFromParcel(parcel0);
        }

        @NotNull
        public final Account[] newArray(int v) {
            return new Account[v];
        }

        @Override  // android.os.Parcelable$Creator
        public Object[] newArray(int v) {
            return this.newArray(v);
        }
    }

    @NotNull
    public static final Parcelable.Creator CREATOR;
    @Nullable
    private final String kakaoAccessToken;
    @Nullable
    private final String token;
    @Nullable
    private final User user;

    static {
        Account.CREATOR = new Creator();
    }

    public Account() {
        this(null, null, null, 7, null);
    }

    public Account(@Nullable String s, @Nullable String s1, @Nullable User user0) {
        this.token = s;
        this.kakaoAccessToken = s1;
        this.user = user0;
    }

    public Account(String s, String s1, User user0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            s1 = null;
        }
        if((v & 4) != 0) {
            user0 = null;
        }
        this(s, s1, user0);
    }

    @Nullable
    public final String component1() {
        return this.token;
    }

    @Nullable
    public final String component2() {
        return this.kakaoAccessToken;
    }

    @Nullable
    public final User component3() {
        return this.user;
    }

    @NotNull
    public final Account copy(@Nullable String s, @Nullable String s1, @Nullable User user0) {
        return new Account(s, s1, user0);
    }

    public static Account copy$default(Account account0, String s, String s1, User user0, int v, Object object0) {
        if((v & 1) != 0) {
            s = account0.token;
        }
        if((v & 2) != 0) {
            s1 = account0.kakaoAccessToken;
        }
        if((v & 4) != 0) {
            user0 = account0.user;
        }
        return account0.copy(s, s1, user0);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Account)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.token, ((Account)object0).token)) {
            return false;
        }
        return Intrinsics.areEqual(this.kakaoAccessToken, ((Account)object0).kakaoAccessToken) ? Intrinsics.areEqual(this.user, ((Account)object0).user) : false;
    }

    @Nullable
    public final String getKakaoAccessToken() {
        return this.kakaoAccessToken;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    @Nullable
    public final User getUser() {
        return this.user;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.token == null ? 0 : this.token.hashCode();
        int v2 = this.kakaoAccessToken == null ? 0 : this.kakaoAccessToken.hashCode();
        User user0 = this.user;
        if(user0 != null) {
            v = user0.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = b.w("Account(token=", this.token, ", kakaoAccessToken=", this.kakaoAccessToken, ", user=");
        stringBuilder0.append(this.user);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel0, int v) {
        Intrinsics.checkNotNullParameter(parcel0, "out");
        parcel0.writeString(this.token);
        parcel0.writeString(this.kakaoAccessToken);
        User user0 = this.user;
        if(user0 == null) {
            parcel0.writeInt(0);
            return;
        }
        parcel0.writeInt(1);
        user0.writeToParcel(parcel0, v);
    }
}

