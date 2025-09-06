package com.kakao.keditor.event.common;

import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.event.Event;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0007HÆ\u0003J\'\u0010\u0012\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001A\u00020\u00072\b\u0010\u0014\u001A\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0018HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000E¨\u0006\u0019"}, d2 = {"Lcom/kakao/keditor/event/common/UpdateItem;", "Lcom/kakao/keditor/event/Event;", "position", "", "item", "Lcom/kakao/keditor/KeditorItem;", "notify", "", "(ILcom/kakao/keditor/KeditorItem;Z)V", "getItem", "()Lcom/kakao/keditor/KeditorItem;", "getNotify", "()Z", "getPosition", "()I", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class UpdateItem implements Event {
    @NotNull
    private final KeditorItem item;
    private final boolean notify;
    private final int position;

    public UpdateItem(int v, @NotNull KeditorItem keditorItem0, boolean z) {
        Intrinsics.checkNotNullParameter(keditorItem0, "item");
        super();
        this.position = v;
        this.item = keditorItem0;
        this.notify = z;
    }

    public UpdateItem(int v, KeditorItem keditorItem0, boolean z, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 4) != 0) {
            z = true;
        }
        this(v, keditorItem0, z);
    }

    public final int component1() {
        return this.position;
    }

    @NotNull
    public final KeditorItem component2() {
        return this.item;
    }

    public final boolean component3() {
        return this.notify;
    }

    @NotNull
    public final UpdateItem copy(int v, @NotNull KeditorItem keditorItem0, boolean z) {
        Intrinsics.checkNotNullParameter(keditorItem0, "item");
        return new UpdateItem(v, keditorItem0, z);
    }

    public static UpdateItem copy$default(UpdateItem updateItem0, int v, KeditorItem keditorItem0, boolean z, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = updateItem0.position;
        }
        if((v1 & 2) != 0) {
            keditorItem0 = updateItem0.item;
        }
        if((v1 & 4) != 0) {
            z = updateItem0.notify;
        }
        return updateItem0.copy(v, keditorItem0, z);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof UpdateItem)) {
            return false;
        }
        if(this.position != ((UpdateItem)object0).position) {
            return false;
        }
        return Intrinsics.areEqual(this.item, ((UpdateItem)object0).item) ? this.notify == ((UpdateItem)object0).notify : false;
    }

    @NotNull
    public final KeditorItem getItem() {
        return this.item;
    }

    public final boolean getNotify() {
        return this.notify;
    }

    public final int getPosition() {
        return this.position;
    }

    @Override
    public int hashCode() {
        return Boolean.hashCode(this.notify) + (this.item.hashCode() + this.position * 0x1F) * 0x1F;
    }

    @Override  // com.kakao.keditor.event.Event
    @Nullable
    public Function1 pendingEvent() {
        return null;
    }

    @Override
    @NotNull
    public String toString() {
        return "UpdateItem(position=" + this.position + ", item=" + this.item + ", notify=" + this.notify + ")";
    }
}

