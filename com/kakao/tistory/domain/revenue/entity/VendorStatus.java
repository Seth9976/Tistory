package com.kakao.tistory.domain.revenue.entity;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/domain/revenue/entity/VendorStatus;", "", "CONNECTED", "RECONNECTED_REQUIRED", "ERROR", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum VendorStatus {
    CONNECTED,
    RECONNECTED_REQUIRED,
    ERROR;

    public static final VendorStatus[] a;
    public static final EnumEntries b;

    static {
        VendorStatus.a = arr_vendorStatus;
        Intrinsics.checkNotNullParameter(arr_vendorStatus, "entries");
        VendorStatus.b = new a(arr_vendorStatus);
    }

    @NotNull
    public static EnumEntries getEntries() {
        return VendorStatus.b;
    }
}

