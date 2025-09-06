package com.kakao.keditor.event.common;

import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.event.Event;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001B\u0012\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000B\u0010\n\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000B\u001A\u00020\u0005HÆ\u0003J\u001F\u0010\f\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001A\u00020\u00052\b\u0010\u000E\u001A\u0004\u0018\u00010\u000FHÖ\u0003J\t\u0010\u0010\u001A\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0004\u0010\u0007R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/kakao/keditor/event/common/OnFocusChanged;", "Lcom/kakao/keditor/event/Event;", "item", "Lcom/kakao/keditor/KeditorItem;", "isEditTextFocused", "", "(Lcom/kakao/keditor/KeditorItem;Z)V", "()Z", "getItem", "()Lcom/kakao/keditor/KeditorItem;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class OnFocusChanged implements Event {
    private final boolean isEditTextFocused;
    @Nullable
    private final KeditorItem item;

    public OnFocusChanged() {
        this(null, false, 3, null);
    }

    public OnFocusChanged(@Nullable KeditorItem keditorItem0, boolean z) {
        this.item = keditorItem0;
        this.isEditTextFocused = z;
    }

    public OnFocusChanged(KeditorItem keditorItem0, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            keditorItem0 = null;
        }
        if((v & 2) != 0) {
            z = false;
        }
        this(keditorItem0, z);
    }

    @Nullable
    public final KeditorItem component1() {
        return this.item;
    }

    public final boolean component2() {
        return this.isEditTextFocused;
    }

    @NotNull
    public final OnFocusChanged copy(@Nullable KeditorItem keditorItem0, boolean z) {
        return new OnFocusChanged(keditorItem0, z);
    }

    public static OnFocusChanged copy$default(OnFocusChanged onFocusChanged0, KeditorItem keditorItem0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            keditorItem0 = onFocusChanged0.item;
        }
        if((v & 2) != 0) {
            z = onFocusChanged0.isEditTextFocused;
        }
        return onFocusChanged0.copy(keditorItem0, z);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof OnFocusChanged)) {
            return false;
        }
        return Intrinsics.areEqual(this.item, ((OnFocusChanged)object0).item) ? this.isEditTextFocused == ((OnFocusChanged)object0).isEditTextFocused : false;
    }

    @Nullable
    public final KeditorItem getItem() {
        return this.item;
    }

    @Override
    public int hashCode() {
        return this.item == null ? Boolean.hashCode(this.isEditTextFocused) : Boolean.hashCode(this.isEditTextFocused) + this.item.hashCode() * 0x1F;
    }

    public final boolean isEditTextFocused() {
        return this.isEditTextFocused;
    }

    @Override  // com.kakao.keditor.event.Event
    @Nullable
    public Function1 pendingEvent() {
        return null;
    }

    @Override
    @NotNull
    public String toString() {
        return "OnFocusChanged(item=" + this.item + ", isEditTextFocused=" + this.isEditTextFocused + ")";
    }
}

