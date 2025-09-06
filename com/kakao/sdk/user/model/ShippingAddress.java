package com.kakao.sdk.user.model;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.kakao.sdk.common.json.KakaoIntDateTypeAdapter;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\u0006\u0010\b\u001A\u00020\t\u0012\u0006\u0010\n\u001A\u00020\u000B\u0012\u0006\u0010\f\u001A\u00020\u0005\u0012\u0006\u0010\r\u001A\u00020\u0005\u0012\b\u0010\u000E\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u000F\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\u0002\u0010\u0013J\t\u0010$\u001A\u00020\u0003H\u00C6\u0003J\u000B\u0010%\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u000B\u0010&\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u000B\u0010\'\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u000B\u0010(\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\t\u0010)\u001A\u00020\u0007H\u00C6\u0003J\t\u0010*\u001A\u00020\tH\u00C6\u0003J\t\u0010+\u001A\u00020\u000BH\u00C6\u0003J\t\u0010,\u001A\u00020\u0005H\u00C6\u0003J\t\u0010-\u001A\u00020\u0005H\u00C6\u0003J\u000B\u0010.\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u000B\u0010/\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u008D\u0001\u00100\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\b\b\u0002\u0010\f\u001A\u00020\u00052\b\b\u0002\u0010\r\u001A\u00020\u00052\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u0005H\u00C6\u0001J\u0013\u00101\u001A\u00020\u00072\b\u00102\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u00103\u001A\u000204H\u00D6\u0001J\t\u00105\u001A\u00020\u0005H\u00D6\u0001R\u0011\u0010\f\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u0015R\u0011\u0010\r\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0006\u001A\u00020\u00078\u0006X\u0087\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0019R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001A\u0010\u0015R\u0013\u0010\u000E\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001B\u0010\u0015R\u0013\u0010\u000F\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001C\u0010\u0015R\u0013\u0010\u0010\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001D\u0010\u0015R\u0011\u0010\n\u001A\u00020\u000B\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001E\u0010\u001FR\u0016\u0010\b\u001A\u00020\t8\u0006X\u0087\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b \u0010!R\u0013\u0010\u0012\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b\"\u0010\u0015R\u0013\u0010\u0011\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b#\u0010\u0015\u00A8\u00066"}, d2 = {"Lcom/kakao/sdk/user/model/ShippingAddress;", "", "id", "", "name", "", "isDefault", "", "updatedAt", "Ljava/util/Date;", "type", "Lcom/kakao/sdk/user/model/ShippingAddressType;", "baseAddress", "detailAddress", "receiverName", "receiverPhoneNumber1", "receiverPhoneNumber2", "zoneNumber", "zipCode", "(JLjava/lang/String;ZLjava/util/Date;Lcom/kakao/sdk/user/model/ShippingAddressType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBaseAddress", "()Ljava/lang/String;", "getDetailAddress", "getId", "()J", "()Z", "getName", "getReceiverName", "getReceiverPhoneNumber1", "getReceiverPhoneNumber2", "getType", "()Lcom/kakao/sdk/user/model/ShippingAddressType;", "getUpdatedAt", "()Ljava/util/Date;", "getZipCode", "getZoneNumber", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "user_release"}, k = 1, mv = {1, 1, 15})
public final class ShippingAddress {
    @NotNull
    private final String baseAddress;
    @NotNull
    private final String detailAddress;
    private final long id;
    @SerializedName("default")
    private final boolean isDefault;
    @Nullable
    private final String name;
    @Nullable
    private final String receiverName;
    @Nullable
    private final String receiverPhoneNumber1;
    @Nullable
    private final String receiverPhoneNumber2;
    @NotNull
    private final ShippingAddressType type;
    @JsonAdapter(KakaoIntDateTypeAdapter.class)
    @NotNull
    private final Date updatedAt;
    @Nullable
    private final String zipCode;
    @Nullable
    private final String zoneNumber;

    public ShippingAddress(long v, @Nullable String s, boolean z, @NotNull Date date0, @NotNull ShippingAddressType shippingAddressType0, @NotNull String s1, @NotNull String s2, @Nullable String s3, @Nullable String s4, @Nullable String s5, @Nullable String s6, @Nullable String s7) {
        Intrinsics.checkParameterIsNotNull(date0, "updatedAt");
        Intrinsics.checkParameterIsNotNull(shippingAddressType0, "type");
        Intrinsics.checkParameterIsNotNull(s1, "baseAddress");
        Intrinsics.checkParameterIsNotNull(s2, "detailAddress");
        super();
        this.id = v;
        this.name = s;
        this.isDefault = z;
        this.updatedAt = date0;
        this.type = shippingAddressType0;
        this.baseAddress = s1;
        this.detailAddress = s2;
        this.receiverName = s3;
        this.receiverPhoneNumber1 = s4;
        this.receiverPhoneNumber2 = s5;
        this.zoneNumber = s6;
        this.zipCode = s7;
    }

    public final long component1() {
        return this.id;
    }

    @Nullable
    public final String component10() {
        return this.receiverPhoneNumber2;
    }

    @Nullable
    public final String component11() {
        return this.zoneNumber;
    }

    @Nullable
    public final String component12() {
        return this.zipCode;
    }

    @Nullable
    public final String component2() {
        return this.name;
    }

    public final boolean component3() {
        return this.isDefault;
    }

    @NotNull
    public final Date component4() {
        return this.updatedAt;
    }

    @NotNull
    public final ShippingAddressType component5() {
        return this.type;
    }

    @NotNull
    public final String component6() {
        return this.baseAddress;
    }

    @NotNull
    public final String component7() {
        return this.detailAddress;
    }

    @Nullable
    public final String component8() {
        return this.receiverName;
    }

    @Nullable
    public final String component9() {
        return this.receiverPhoneNumber1;
    }

    @NotNull
    public final ShippingAddress copy(long v, @Nullable String s, boolean z, @NotNull Date date0, @NotNull ShippingAddressType shippingAddressType0, @NotNull String s1, @NotNull String s2, @Nullable String s3, @Nullable String s4, @Nullable String s5, @Nullable String s6, @Nullable String s7) {
        Intrinsics.checkParameterIsNotNull(date0, "updatedAt");
        Intrinsics.checkParameterIsNotNull(shippingAddressType0, "type");
        Intrinsics.checkParameterIsNotNull(s1, "baseAddress");
        Intrinsics.checkParameterIsNotNull(s2, "detailAddress");
        return new ShippingAddress(v, s, z, date0, shippingAddressType0, s1, s2, s3, s4, s5, s6, s7);
    }

    public static ShippingAddress copy$default(ShippingAddress shippingAddress0, long v, String s, boolean z, Date date0, ShippingAddressType shippingAddressType0, String s1, String s2, String s3, String s4, String s5, String s6, String s7, int v1, Object object0) {
        long v2 = (v1 & 1) == 0 ? v : shippingAddress0.id;
        String s8 = (v1 & 2) == 0 ? s : shippingAddress0.name;
        boolean z1 = (v1 & 4) == 0 ? z : shippingAddress0.isDefault;
        Date date1 = (v1 & 8) == 0 ? date0 : shippingAddress0.updatedAt;
        ShippingAddressType shippingAddressType1 = (v1 & 16) == 0 ? shippingAddressType0 : shippingAddress0.type;
        String s9 = (v1 & 0x20) == 0 ? s1 : shippingAddress0.baseAddress;
        String s10 = (v1 & 0x40) == 0 ? s2 : shippingAddress0.detailAddress;
        String s11 = (v1 & 0x80) == 0 ? s3 : shippingAddress0.receiverName;
        String s12 = (v1 & 0x100) == 0 ? s4 : shippingAddress0.receiverPhoneNumber1;
        String s13 = (v1 & 0x200) == 0 ? s5 : shippingAddress0.receiverPhoneNumber2;
        String s14 = (v1 & 0x400) == 0 ? s6 : shippingAddress0.zoneNumber;
        return (v1 & 0x800) == 0 ? shippingAddress0.copy(v2, s8, z1, date1, shippingAddressType1, s9, s10, s11, s12, s13, s14, s7) : shippingAddress0.copy(v2, s8, z1, date1, shippingAddressType1, s9, s10, s11, s12, s13, s14, shippingAddress0.zipCode);
    }

    // 去混淆评级： 中等(110)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 || object0 instanceof ShippingAddress && this.id == ((ShippingAddress)object0).id && Intrinsics.areEqual(this.name, ((ShippingAddress)object0).name) && this.isDefault == ((ShippingAddress)object0).isDefault && Intrinsics.areEqual(this.updatedAt, ((ShippingAddress)object0).updatedAt) && Intrinsics.areEqual(this.type, ((ShippingAddress)object0).type) && Intrinsics.areEqual(this.baseAddress, ((ShippingAddress)object0).baseAddress) && Intrinsics.areEqual(this.detailAddress, ((ShippingAddress)object0).detailAddress) && Intrinsics.areEqual(this.receiverName, ((ShippingAddress)object0).receiverName) && Intrinsics.areEqual(this.receiverPhoneNumber1, ((ShippingAddress)object0).receiverPhoneNumber1) && Intrinsics.areEqual(this.receiverPhoneNumber2, ((ShippingAddress)object0).receiverPhoneNumber2) && Intrinsics.areEqual(this.zoneNumber, ((ShippingAddress)object0).zoneNumber) && Intrinsics.areEqual(this.zipCode, ((ShippingAddress)object0).zipCode);
    }

    @NotNull
    public final String getBaseAddress() {
        return this.baseAddress;
    }

    @NotNull
    public final String getDetailAddress() {
        return this.detailAddress;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getReceiverName() {
        return this.receiverName;
    }

    @Nullable
    public final String getReceiverPhoneNumber1() {
        return this.receiverPhoneNumber1;
    }

    @Nullable
    public final String getReceiverPhoneNumber2() {
        return this.receiverPhoneNumber2;
    }

    @NotNull
    public final ShippingAddressType getType() {
        return this.type;
    }

    @NotNull
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    @Nullable
    public final String getZipCode() {
        return this.zipCode;
    }

    @Nullable
    public final String getZoneNumber() {
        return this.zoneNumber;
    }

    @Override
    public int hashCode() {
        int v = Long.hashCode(this.id);
        int v1 = 0;
        int v2 = this.name == null ? 0 : this.name.hashCode();
        int v3 = this.isDefault;
        if(v3) {
            v3 = 1;
        }
        int v4 = this.updatedAt == null ? 0 : this.updatedAt.hashCode();
        int v5 = this.type == null ? 0 : this.type.hashCode();
        int v6 = this.baseAddress == null ? 0 : this.baseAddress.hashCode();
        int v7 = this.detailAddress == null ? 0 : this.detailAddress.hashCode();
        int v8 = this.receiverName == null ? 0 : this.receiverName.hashCode();
        int v9 = this.receiverPhoneNumber1 == null ? 0 : this.receiverPhoneNumber1.hashCode();
        int v10 = this.receiverPhoneNumber2 == null ? 0 : this.receiverPhoneNumber2.hashCode();
        int v11 = this.zoneNumber == null ? 0 : this.zoneNumber.hashCode();
        String s = this.zipCode;
        if(s != null) {
            v1 = s.hashCode();
        }
        return ((((((((((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v10) * 0x1F + v11) * 0x1F + v1;
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ShippingAddress(id=");
        stringBuilder0.append(this.id);
        stringBuilder0.append(", name=");
        stringBuilder0.append(this.name);
        stringBuilder0.append(", isDefault=");
        stringBuilder0.append(this.isDefault);
        stringBuilder0.append(", updatedAt=");
        stringBuilder0.append(this.updatedAt);
        stringBuilder0.append(", type=");
        stringBuilder0.append(this.type);
        stringBuilder0.append(", baseAddress=");
        stringBuilder0.append(this.baseAddress);
        stringBuilder0.append(", detailAddress=");
        stringBuilder0.append(this.detailAddress);
        stringBuilder0.append(", receiverName=");
        stringBuilder0.append(this.receiverName);
        stringBuilder0.append(", receiverPhoneNumber1=");
        stringBuilder0.append(this.receiverPhoneNumber1);
        stringBuilder0.append(", receiverPhoneNumber2=");
        stringBuilder0.append(this.receiverPhoneNumber2);
        stringBuilder0.append(", zoneNumber=");
        stringBuilder0.append(this.zoneNumber);
        stringBuilder0.append(", zipCode=");
        return a.o(stringBuilder0, this.zipCode, ")");
    }
}

