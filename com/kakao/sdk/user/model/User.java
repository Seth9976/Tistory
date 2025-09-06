package com.kakao.sdk.user.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0014\u0010\u0004\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\b\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001A\u0004\u0018\u00010\u000B\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u000B\u00A2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001A\u00020\u0003H\u00C6\u0003J\u0017\u0010\u001A\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00C6\u0003J\u000B\u0010\u001B\u001A\u0004\u0018\u00010\bH\u00C6\u0003J\u000B\u0010\u001C\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003J\u000B\u0010\u001D\u001A\u0004\u0018\u00010\u000BH\u00C6\u0003J\u000B\u0010\u001E\u001A\u0004\u0018\u00010\u000BH\u00C6\u0003J[\u0010\u001F\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\u0016\b\u0002\u0010\u0004\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u000B2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u000BH\u00C6\u0001J\t\u0010 \u001A\u00020!H\u00D6\u0001J\u0013\u0010\"\u001A\u00020#2\b\u0010$\u001A\u0004\u0018\u00010%H\u00D6\u0003J\t\u0010&\u001A\u00020!H\u00D6\u0001J\t\u0010\'\u001A\u00020\u0006H\u00D6\u0001J\u0019\u0010(\u001A\u00020)2\u0006\u0010*\u001A\u00020+2\u0006\u0010,\u001A\u00020!H\u00D6\u0001R\u0013\u0010\n\u001A\u0004\u0018\u00010\u000B\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0013\u0010\t\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001A\u0004\u0018\u00010\b\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u0015R\u001F\u0010\u0004\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u0017R\u0013\u0010\f\u001A\u0004\u0018\u00010\u000B\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0018\u0010\u000F\u00A8\u0006-"}, d2 = {"Lcom/kakao/sdk/user/model/User;", "Landroid/os/Parcelable;", "id", "", "properties", "", "", "kakaoAccount", "Lcom/kakao/sdk/user/model/Account;", "groupUserToken", "connectedAt", "Ljava/util/Date;", "synchedAt", "(JLjava/util/Map;Lcom/kakao/sdk/user/model/Account;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", "getConnectedAt", "()Ljava/util/Date;", "getGroupUserToken", "()Ljava/lang/String;", "getId", "()J", "getKakaoAccount", "()Lcom/kakao/sdk/user/model/Account;", "getProperties", "()Ljava/util/Map;", "getSynchedAt", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "user_release"}, k = 1, mv = {1, 1, 15})
@Parcelize
public final class User implements Parcelable {
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static final class Creator implements Parcelable.Creator {
        @Override  // android.os.Parcelable$Creator
        @NotNull
        public final Object createFromParcel(@NotNull Parcel parcel0) {
            Intrinsics.checkParameterIsNotNull(parcel0, "in");
            long v = parcel0.readLong();
            if(parcel0.readInt() != 0) {
                int v1 = parcel0.readInt();
                LinkedHashMap linkedHashMap0 = new LinkedHashMap(v1);
                while(v1 != 0) {
                    linkedHashMap0.put(parcel0.readString(), parcel0.readString());
                    --v1;
                }
                return parcel0.readInt() == 0 ? new User(v, linkedHashMap0, null, parcel0.readString(), ((Date)parcel0.readSerializable()), ((Date)parcel0.readSerializable())) : new User(v, linkedHashMap0, ((Account)Account.CREATOR.createFromParcel(parcel0)), parcel0.readString(), ((Date)parcel0.readSerializable()), ((Date)parcel0.readSerializable()));
            }
            return parcel0.readInt() == 0 ? new User(v, null, null, parcel0.readString(), ((Date)parcel0.readSerializable()), ((Date)parcel0.readSerializable())) : new User(v, null, ((Account)Account.CREATOR.createFromParcel(parcel0)), parcel0.readString(), ((Date)parcel0.readSerializable()), ((Date)parcel0.readSerializable()));
        }

        @Override  // android.os.Parcelable$Creator
        @NotNull
        public final Object[] newArray(int v) {
            return new User[v];
        }
    }

    public static final Parcelable.Creator CREATOR;
    @Nullable
    private final Date connectedAt;
    @Nullable
    private final String groupUserToken;
    private final long id;
    @Nullable
    private final Account kakaoAccount;
    @Nullable
    private final Map properties;
    @Nullable
    private final Date synchedAt;

    static {
        User.CREATOR = new Creator();
    }

    public User(long v, @Nullable Map map0, @Nullable Account account0, @Nullable String s, @Nullable Date date0, @Nullable Date date1) {
        this.id = v;
        this.properties = map0;
        this.kakaoAccount = account0;
        this.groupUserToken = s;
        this.connectedAt = date0;
        this.synchedAt = date1;
    }

    public final long component1() {
        return this.id;
    }

    @Nullable
    public final Map component2() {
        return this.properties;
    }

    @Nullable
    public final Account component3() {
        return this.kakaoAccount;
    }

    @Nullable
    public final String component4() {
        return this.groupUserToken;
    }

    @Nullable
    public final Date component5() {
        return this.connectedAt;
    }

    @Nullable
    public final Date component6() {
        return this.synchedAt;
    }

    @NotNull
    public final User copy(long v, @Nullable Map map0, @Nullable Account account0, @Nullable String s, @Nullable Date date0, @Nullable Date date1) {
        return new User(v, map0, account0, s, date0, date1);
    }

    public static User copy$default(User user0, long v, Map map0, Account account0, String s, Date date0, Date date1, int v1, Object object0) {
        long v2 = (v1 & 1) == 0 ? v : user0.id;
        Map map1 = (v1 & 2) == 0 ? map0 : user0.properties;
        Account account1 = (v1 & 4) == 0 ? account0 : user0.kakaoAccount;
        String s1 = (v1 & 8) == 0 ? s : user0.groupUserToken;
        Date date2 = (v1 & 16) == 0 ? date0 : user0.connectedAt;
        return (v1 & 0x20) == 0 ? user0.copy(v2, map1, account1, s1, date2, date1) : user0.copy(v2, map1, account1, s1, date2, user0.synchedAt);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 中等(60)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 || object0 instanceof User && this.id == ((User)object0).id && Intrinsics.areEqual(this.properties, ((User)object0).properties) && Intrinsics.areEqual(this.kakaoAccount, ((User)object0).kakaoAccount) && Intrinsics.areEqual(this.groupUserToken, ((User)object0).groupUserToken) && Intrinsics.areEqual(this.connectedAt, ((User)object0).connectedAt) && Intrinsics.areEqual(this.synchedAt, ((User)object0).synchedAt);
    }

    @Nullable
    public final Date getConnectedAt() {
        return this.connectedAt;
    }

    @Nullable
    public final String getGroupUserToken() {
        return this.groupUserToken;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final Account getKakaoAccount() {
        return this.kakaoAccount;
    }

    @Nullable
    public final Map getProperties() {
        return this.properties;
    }

    @Nullable
    public final Date getSynchedAt() {
        return this.synchedAt;
    }

    @Override
    public int hashCode() {
        int v = Long.hashCode(this.id);
        int v1 = 0;
        int v2 = this.properties == null ? 0 : this.properties.hashCode();
        int v3 = this.kakaoAccount == null ? 0 : this.kakaoAccount.hashCode();
        int v4 = this.groupUserToken == null ? 0 : this.groupUserToken.hashCode();
        int v5 = this.connectedAt == null ? 0 : this.connectedAt.hashCode();
        Date date0 = this.synchedAt;
        if(date0 != null) {
            v1 = date0.hashCode();
        }
        return ((((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v1;
    }

    @Override
    @NotNull
    public String toString() {
        return "User(id=" + this.id + ", properties=" + this.properties + ", kakaoAccount=" + this.kakaoAccount + ", groupUserToken=" + this.groupUserToken + ", connectedAt=" + this.connectedAt + ", synchedAt=" + this.synchedAt + ")";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel0, int v) {
        Intrinsics.checkParameterIsNotNull(parcel0, "parcel");
        parcel0.writeLong(this.id);
        Map map0 = this.properties;
        if(map0 == null) {
            parcel0.writeInt(0);
        }
        else {
            parcel0.writeInt(1);
            parcel0.writeInt(map0.size());
            for(Object object0: map0.entrySet()) {
                parcel0.writeString(((String)((Map.Entry)object0).getKey()));
                parcel0.writeString(((String)((Map.Entry)object0).getValue()));
            }
        }
        Account account0 = this.kakaoAccount;
        if(account0 == null) {
            parcel0.writeInt(0);
        }
        else {
            parcel0.writeInt(1);
            account0.writeToParcel(parcel0, 0);
        }
        parcel0.writeString(this.groupUserToken);
        parcel0.writeSerializable(this.connectedAt);
        parcel0.writeSerializable(this.synchedAt);
    }
}

