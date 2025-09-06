package com.kakao.sdk.partner.user.model;

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
import wb.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001C\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0014\u0010\u0004\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\b\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001A\u0004\u0018\u00010\u000B\u0012\u0014\u0010\f\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001A\u0004\u0018\u00010\u000E\u0012\b\u0010\u000F\u001A\u0004\u0018\u00010\u000E\u00A2\u0006\u0002\u0010\u0010J\t\u0010 \u001A\u00020\u0003H\u00C6\u0003J\u0017\u0010!\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00C6\u0003J\u000B\u0010\"\u001A\u0004\u0018\u00010\bH\u00C6\u0003J\u000B\u0010#\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003J\u0010\u0010$\u001A\u0004\u0018\u00010\u000BH\u00C6\u0003\u00A2\u0006\u0002\u0010\u0018J\u0017\u0010%\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00C6\u0003J\u000B\u0010&\u001A\u0004\u0018\u00010\u000EH\u00C6\u0003J\u000B\u0010\'\u001A\u0004\u0018\u00010\u000EH\u00C6\u0003J\u0084\u0001\u0010(\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\u0016\b\u0002\u0010\u0004\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u000B2\u0016\b\u0002\u0010\f\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u000E2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000EH\u00C6\u0001\u00A2\u0006\u0002\u0010)J\t\u0010*\u001A\u00020+H\u00D6\u0001J\u0013\u0010,\u001A\u00020\u000B2\b\u0010-\u001A\u0004\u0018\u00010.H\u00D6\u0003J\t\u0010/\u001A\u00020+H\u00D6\u0001J\t\u00100\u001A\u00020\u0006H\u00D6\u0001J\u0019\u00101\u001A\u0002022\u0006\u00103\u001A\u0002042\u0006\u00105\u001A\u00020+H\u00D6\u0001R\u0013\u0010\r\u001A\u0004\u0018\u00010\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012R\u001F\u0010\f\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0016R\u0015\u0010\n\u001A\u0004\u0018\u00010\u000B\u00A2\u0006\n\n\u0002\u0010\u0019\u001A\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001A\u0010\u001BR\u0013\u0010\u0007\u001A\u0004\u0018\u00010\b\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001C\u0010\u001DR\u001F\u0010\u0004\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001E\u0010\u0014R\u0013\u0010\u000F\u001A\u0004\u0018\u00010\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001F\u0010\u0012\u00A8\u00066"}, d2 = {"Lcom/kakao/sdk/partner/user/model/PartnerUser;", "Landroid/os/Parcelable;", "id", "", "properties", "", "", "kakaoAccount", "Lcom/kakao/sdk/partner/user/model/PartnerAccount;", "groupUserToken", "hasSignedUp", "", "forPartner", "connectedAt", "Ljava/util/Date;", "synchedAt", "(JLjava/util/Map;Lcom/kakao/sdk/partner/user/model/PartnerAccount;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Date;Ljava/util/Date;)V", "getConnectedAt", "()Ljava/util/Date;", "getForPartner", "()Ljava/util/Map;", "getGroupUserToken", "()Ljava/lang/String;", "getHasSignedUp", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getId", "()J", "getKakaoAccount", "()Lcom/kakao/sdk/partner/user/model/PartnerAccount;", "getProperties", "getSynchedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(JLjava/util/Map;Lcom/kakao/sdk/partner/user/model/PartnerAccount;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Date;Ljava/util/Date;)Lcom/kakao/sdk/partner/user/model/PartnerUser;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "partner-user_release"}, k = 1, mv = {1, 1, 15})
@Parcelize
public final class PartnerUser implements Parcelable {
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static final class Creator implements Parcelable.Creator {
        @Override  // android.os.Parcelable$Creator
        @NotNull
        public final Object createFromParcel(@NotNull Parcel parcel0) {
            LinkedHashMap linkedHashMap1;
            Intrinsics.checkParameterIsNotNull(parcel0, "in");
            long v = parcel0.readLong();
            LinkedHashMap linkedHashMap0 = null;
            if(parcel0.readInt() == 0) {
                linkedHashMap1 = null;
            }
            else {
                int v1 = parcel0.readInt();
                linkedHashMap1 = new LinkedHashMap(v1);
                while(v1 != 0) {
                    linkedHashMap1.put(parcel0.readString(), parcel0.readString());
                    --v1;
                }
            }
            PartnerAccount partnerAccount0 = parcel0.readInt() == 0 ? null : ((PartnerAccount)PartnerAccount.CREATOR.createFromParcel(parcel0));
            String s = parcel0.readString();
            Boolean boolean0 = parcel0.readInt() == 0 ? null : Boolean.valueOf(parcel0.readInt() != 0);
            if(parcel0.readInt() != 0) {
                int v2 = parcel0.readInt();
                linkedHashMap0 = new LinkedHashMap(v2);
                while(v2 != 0) {
                    linkedHashMap0.put(parcel0.readString(), parcel0.readString());
                    --v2;
                }
            }
            return new PartnerUser(v, linkedHashMap1, partnerAccount0, s, boolean0, linkedHashMap0, ((Date)parcel0.readSerializable()), ((Date)parcel0.readSerializable()));
        }

        @Override  // android.os.Parcelable$Creator
        @NotNull
        public final Object[] newArray(int v) {
            return new PartnerUser[v];
        }
    }

    public static final Parcelable.Creator CREATOR;
    @Nullable
    private final Date connectedAt;
    @Nullable
    private final Map forPartner;
    @Nullable
    private final String groupUserToken;
    @Nullable
    private final Boolean hasSignedUp;
    private final long id;
    @Nullable
    private final PartnerAccount kakaoAccount;
    @Nullable
    private final Map properties;
    @Nullable
    private final Date synchedAt;

    static {
        PartnerUser.CREATOR = new Creator();
    }

    public PartnerUser(long v, @Nullable Map map0, @Nullable PartnerAccount partnerAccount0, @Nullable String s, @Nullable Boolean boolean0, @Nullable Map map1, @Nullable Date date0, @Nullable Date date1) {
        this.id = v;
        this.properties = map0;
        this.kakaoAccount = partnerAccount0;
        this.groupUserToken = s;
        this.hasSignedUp = boolean0;
        this.forPartner = map1;
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
    public final PartnerAccount component3() {
        return this.kakaoAccount;
    }

    @Nullable
    public final String component4() {
        return this.groupUserToken;
    }

    @Nullable
    public final Boolean component5() {
        return this.hasSignedUp;
    }

    @Nullable
    public final Map component6() {
        return this.forPartner;
    }

    @Nullable
    public final Date component7() {
        return this.connectedAt;
    }

    @Nullable
    public final Date component8() {
        return this.synchedAt;
    }

    @NotNull
    public final PartnerUser copy(long v, @Nullable Map map0, @Nullable PartnerAccount partnerAccount0, @Nullable String s, @Nullable Boolean boolean0, @Nullable Map map1, @Nullable Date date0, @Nullable Date date1) {
        return new PartnerUser(v, map0, partnerAccount0, s, boolean0, map1, date0, date1);
    }

    public static PartnerUser copy$default(PartnerUser partnerUser0, long v, Map map0, PartnerAccount partnerAccount0, String s, Boolean boolean0, Map map1, Date date0, Date date1, int v1, Object object0) {
        long v2 = (v1 & 1) == 0 ? v : partnerUser0.id;
        Map map2 = (v1 & 2) == 0 ? map0 : partnerUser0.properties;
        PartnerAccount partnerAccount1 = (v1 & 4) == 0 ? partnerAccount0 : partnerUser0.kakaoAccount;
        String s1 = (v1 & 8) == 0 ? s : partnerUser0.groupUserToken;
        Boolean boolean1 = (v1 & 16) == 0 ? boolean0 : partnerUser0.hasSignedUp;
        Map map3 = (v1 & 0x20) == 0 ? map1 : partnerUser0.forPartner;
        Date date2 = (v1 & 0x40) == 0 ? date0 : partnerUser0.connectedAt;
        return (v1 & 0x80) == 0 ? partnerUser0.copy(v2, map2, partnerAccount1, s1, boolean1, map3, date2, date1) : partnerUser0.copy(v2, map2, partnerAccount1, s1, boolean1, map3, date2, partnerUser0.synchedAt);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 中等(80)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 || object0 instanceof PartnerUser && this.id == ((PartnerUser)object0).id && Intrinsics.areEqual(this.properties, ((PartnerUser)object0).properties) && Intrinsics.areEqual(this.kakaoAccount, ((PartnerUser)object0).kakaoAccount) && Intrinsics.areEqual(this.groupUserToken, ((PartnerUser)object0).groupUserToken) && Intrinsics.areEqual(this.hasSignedUp, ((PartnerUser)object0).hasSignedUp) && Intrinsics.areEqual(this.forPartner, ((PartnerUser)object0).forPartner) && Intrinsics.areEqual(this.connectedAt, ((PartnerUser)object0).connectedAt) && Intrinsics.areEqual(this.synchedAt, ((PartnerUser)object0).synchedAt);
    }

    @Nullable
    public final Date getConnectedAt() {
        return this.connectedAt;
    }

    @Nullable
    public final Map getForPartner() {
        return this.forPartner;
    }

    @Nullable
    public final String getGroupUserToken() {
        return this.groupUserToken;
    }

    @Nullable
    public final Boolean getHasSignedUp() {
        return this.hasSignedUp;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final PartnerAccount getKakaoAccount() {
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
        int v5 = this.hasSignedUp == null ? 0 : this.hasSignedUp.hashCode();
        int v6 = this.forPartner == null ? 0 : this.forPartner.hashCode();
        int v7 = this.connectedAt == null ? 0 : this.connectedAt.hashCode();
        Date date0 = this.synchedAt;
        if(date0 != null) {
            v1 = date0.hashCode();
        }
        return ((((((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v1;
    }

    @Override
    @NotNull
    public String toString() {
        return "PartnerUser(id=" + this.id + ", properties=" + this.properties + ", kakaoAccount=" + this.kakaoAccount + ", groupUserToken=" + this.groupUserToken + ", hasSignedUp=" + this.hasSignedUp + ", forPartner=" + this.forPartner + ", connectedAt=" + this.connectedAt + ", synchedAt=" + this.synchedAt + ")";
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
        PartnerAccount partnerAccount0 = this.kakaoAccount;
        if(partnerAccount0 == null) {
            parcel0.writeInt(0);
        }
        else {
            parcel0.writeInt(1);
            partnerAccount0.writeToParcel(parcel0, 0);
        }
        parcel0.writeString(this.groupUserToken);
        Boolean boolean0 = this.hasSignedUp;
        if(boolean0 == null) {
            parcel0.writeInt(0);
        }
        else {
            a.i(parcel0, 1, boolean0);
        }
        Map map1 = this.forPartner;
        if(map1 == null) {
            parcel0.writeInt(0);
        }
        else {
            parcel0.writeInt(1);
            parcel0.writeInt(map1.size());
            for(Object object1: map1.entrySet()) {
                parcel0.writeString(((String)((Map.Entry)object1).getKey()));
                parcel0.writeString(((String)((Map.Entry)object1).getValue()));
            }
        }
        parcel0.writeSerializable(this.connectedAt);
        parcel0.writeSerializable(this.synchedAt);
    }
}

