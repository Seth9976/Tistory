package com.kakao.sdk.partner.user.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000B\u0010\u000E\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000F\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0011\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\t\u0010\u0013\u001A\u00020\u0005HÖ\u0001J\u0013\u0010\u0014\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001A\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001A\u00020\u0003HÖ\u0001J\u0019\u0010\u001A\u001A\u00020\u001B2\u0006\u0010\u001C\u001A\u00020\u001D2\u0006\u0010\u001E\u001A\u00020\u0005HÖ\u0001R\u0015\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\n\u001A\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\n\u001A\u0004\b\u000B\u0010\tR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\r¨\u0006\u001F"}, d2 = {"Lcom/kakao/sdk/partner/user/model/ForPartner;", "Landroid/os/Parcelable;", "uuid", "", "remainingInviteCount", "", "remainingGroupMsgCount", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getRemainingGroupMsgCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRemainingInviteCount", "getUuid", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/kakao/sdk/partner/user/model/ForPartner;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "partner-user_release"}, k = 1, mv = {1, 1, 15})
@Parcelize
public final class ForPartner implements Parcelable {
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static final class Creator implements Parcelable.Creator {
        @Override  // android.os.Parcelable$Creator
        @NotNull
        public final Object createFromParcel(@NotNull Parcel parcel0) {
            Intrinsics.checkParameterIsNotNull(parcel0, "in");
            String s = parcel0.readString();
            Integer integer0 = null;
            Integer integer1 = parcel0.readInt() == 0 ? null : parcel0.readInt();
            if(parcel0.readInt() != 0) {
                integer0 = parcel0.readInt();
            }
            return new ForPartner(s, integer1, integer0);
        }

        @Override  // android.os.Parcelable$Creator
        @NotNull
        public final Object[] newArray(int v) {
            return new ForPartner[v];
        }
    }

    public static final Parcelable.Creator CREATOR;
    @Nullable
    private final Integer remainingGroupMsgCount;
    @Nullable
    private final Integer remainingInviteCount;
    @Nullable
    private final String uuid;

    static {
        ForPartner.CREATOR = new Creator();
    }

    public ForPartner(@Nullable String s, @Nullable Integer integer0, @Nullable Integer integer1) {
        this.uuid = s;
        this.remainingInviteCount = integer0;
        this.remainingGroupMsgCount = integer1;
    }

    @Nullable
    public final String component1() {
        return this.uuid;
    }

    @Nullable
    public final Integer component2() {
        return this.remainingInviteCount;
    }

    @Nullable
    public final Integer component3() {
        return this.remainingGroupMsgCount;
    }

    @NotNull
    public final ForPartner copy(@Nullable String s, @Nullable Integer integer0, @Nullable Integer integer1) {
        return new ForPartner(s, integer0, integer1);
    }

    public static ForPartner copy$default(ForPartner forPartner0, String s, Integer integer0, Integer integer1, int v, Object object0) {
        if((v & 1) != 0) {
            s = forPartner0.uuid;
        }
        if((v & 2) != 0) {
            integer0 = forPartner0.remainingInviteCount;
        }
        if((v & 4) != 0) {
            integer1 = forPartner0.remainingGroupMsgCount;
        }
        return forPartner0.copy(s, integer0, integer1);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 || object0 instanceof ForPartner && Intrinsics.areEqual(this.uuid, ((ForPartner)object0).uuid) && Intrinsics.areEqual(this.remainingInviteCount, ((ForPartner)object0).remainingInviteCount) && Intrinsics.areEqual(this.remainingGroupMsgCount, ((ForPartner)object0).remainingGroupMsgCount);
    }

    @Nullable
    public final Integer getRemainingGroupMsgCount() {
        return this.remainingGroupMsgCount;
    }

    @Nullable
    public final Integer getRemainingInviteCount() {
        return this.remainingInviteCount;
    }

    @Nullable
    public final String getUuid() {
        return this.uuid;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.uuid == null ? 0 : this.uuid.hashCode();
        int v2 = this.remainingInviteCount == null ? 0 : this.remainingInviteCount.hashCode();
        Integer integer0 = this.remainingGroupMsgCount;
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    @NotNull
    public String toString() {
        return "ForPartner(uuid=" + this.uuid + ", remainingInviteCount=" + this.remainingInviteCount + ", remainingGroupMsgCount=" + this.remainingGroupMsgCount + ")";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel0, int v) {
        Intrinsics.checkParameterIsNotNull(parcel0, "parcel");
        parcel0.writeString(this.uuid);
        Integer integer0 = this.remainingInviteCount;
        if(integer0 == null) {
            parcel0.writeInt(0);
        }
        else {
            parcel0.writeInt(1);
            parcel0.writeInt(((int)integer0));
        }
        Integer integer1 = this.remainingGroupMsgCount;
        if(integer1 != null) {
            parcel0.writeInt(1);
            parcel0.writeInt(((int)integer1));
            return;
        }
        parcel0.writeInt(0);
    }
}

