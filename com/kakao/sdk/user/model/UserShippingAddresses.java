package com.kakao.sdk.user.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u000E\u0010\u0006\u001A\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0005HÆ\u0003J\u0011\u0010\u0012\u001A\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J/\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\u0010\b\u0002\u0010\u0006\u001A\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00052\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001A\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0019HÖ\u0001R\u0016\u0010\u0004\u001A\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0019\u0010\u0006\u001A\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u001A"}, d2 = {"Lcom/kakao/sdk/user/model/UserShippingAddresses;", "", "userId", "", "needsAgreement", "", "shippingAddresses", "", "Lcom/kakao/sdk/user/model/ShippingAddress;", "(JZLjava/util/List;)V", "getNeedsAgreement", "()Z", "getShippingAddresses", "()Ljava/util/List;", "getUserId", "()J", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "user_release"}, k = 1, mv = {1, 1, 15})
public final class UserShippingAddresses {
    @SerializedName("shipping_addresses_needs_agreement")
    private final boolean needsAgreement;
    @Nullable
    private final List shippingAddresses;
    private final long userId;

    public UserShippingAddresses(long v, boolean z, @Nullable List list0) {
        this.userId = v;
        this.needsAgreement = z;
        this.shippingAddresses = list0;
    }

    public final long component1() {
        return this.userId;
    }

    public final boolean component2() {
        return this.needsAgreement;
    }

    @Nullable
    public final List component3() {
        return this.shippingAddresses;
    }

    @NotNull
    public final UserShippingAddresses copy(long v, boolean z, @Nullable List list0) {
        return new UserShippingAddresses(v, z, list0);
    }

    public static UserShippingAddresses copy$default(UserShippingAddresses userShippingAddresses0, long v, boolean z, List list0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = userShippingAddresses0.userId;
        }
        if((v1 & 2) != 0) {
            z = userShippingAddresses0.needsAgreement;
        }
        if((v1 & 4) != 0) {
            list0 = userShippingAddresses0.shippingAddresses;
        }
        return userShippingAddresses0.copy(v, z, list0);
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 || object0 instanceof UserShippingAddresses && this.userId == ((UserShippingAddresses)object0).userId && this.needsAgreement == ((UserShippingAddresses)object0).needsAgreement && Intrinsics.areEqual(this.shippingAddresses, ((UserShippingAddresses)object0).shippingAddresses);
    }

    public final boolean getNeedsAgreement() {
        return this.needsAgreement;
    }

    @Nullable
    public final List getShippingAddresses() {
        return this.shippingAddresses;
    }

    public final long getUserId() {
        return this.userId;
    }

    @Override
    public int hashCode() {
        int v = Long.hashCode(this.userId);
        int v1 = this.needsAgreement;
        if(v1) {
            v1 = 1;
        }
        return this.shippingAddresses == null ? (v * 0x1F + v1) * 0x1F : (v * 0x1F + v1) * 0x1F + this.shippingAddresses.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("UserShippingAddresses(userId=");
        stringBuilder0.append(this.userId);
        stringBuilder0.append(", needsAgreement=");
        stringBuilder0.append(this.needsAgreement);
        stringBuilder0.append(", shippingAddresses=");
        return a.e(stringBuilder0, this.shippingAddresses, ")");
    }
}

