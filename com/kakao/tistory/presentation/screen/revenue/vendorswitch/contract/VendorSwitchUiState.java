package com.kakao.tistory.presentation.screen.revenue.vendorswitch.contract;

import androidx.compose.runtime.Immutable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001A\u00020\u00002\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/screen/revenue/vendorswitch/contract/VendorSwitchUiState;", "", "", "Lcom/kakao/tistory/presentation/screen/item/Vendor;", "vendorList", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/kakao/tistory/presentation/screen/revenue/vendorswitch/contract/VendorSwitchUiState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getVendorList", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class VendorSwitchUiState {
    public static final int $stable;
    public final List a;

    public VendorSwitchUiState() {
        this(null, 1, null);
    }

    public VendorSwitchUiState(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "vendorList");
        super();
        this.a = list0;
    }

    public VendorSwitchUiState(List list0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        this(list0);
    }

    @NotNull
    public final List component1() {
        return this.a;
    }

    @NotNull
    public final VendorSwitchUiState copy(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "vendorList");
        return new VendorSwitchUiState(list0);
    }

    public static VendorSwitchUiState copy$default(VendorSwitchUiState vendorSwitchUiState0, List list0, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = vendorSwitchUiState0.a;
        }
        return vendorSwitchUiState0.copy(list0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof VendorSwitchUiState ? Intrinsics.areEqual(this.a, ((VendorSwitchUiState)object0).a) : false;
    }

    @NotNull
    public final List getVendorList() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "VendorSwitchUiState(vendorList=" + this.a + ")";
    }
}

