package com.kakao.tistory.domain.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000F\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001A\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001A\u00020\u00032\b\u0010\n\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000B\u001A\u00020\fHÖ\u0001J\t\u0010\r\u001A\u00020\u000EHÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u000F"}, d2 = {"Lcom/kakao/tistory/domain/entity/PushSettingItem;", "", "value", "", "(Z)V", "getValue", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PushSettingItem {
    private final boolean value;

    public PushSettingItem() {
        this(false, 1, null);
    }

    public PushSettingItem(boolean z) {
        this.value = z;
    }

    public PushSettingItem(boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            z = true;
        }
        this(z);
    }

    public final boolean component1() {
        return this.value;
    }

    @NotNull
    public final PushSettingItem copy(boolean z) {
        return new PushSettingItem(z);
    }

    public static PushSettingItem copy$default(PushSettingItem pushSettingItem0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = pushSettingItem0.value;
        }
        return pushSettingItem0.copy(z);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof PushSettingItem ? this.value == ((PushSettingItem)object0).value : false;
    }

    public final boolean getValue() {
        return this.value;
    }

    @Override
    public int hashCode() {
        return Boolean.hashCode(this.value);
    }

    @Override
    @NotNull
    public String toString() {
        return "PushSettingItem(value=" + this.value + ")";
    }
}

