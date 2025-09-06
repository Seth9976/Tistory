package com.kakao.keditor.event.common;

import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.event.Event;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000F\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0011\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0007HÆ\u0003J.\u0010\u0013\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001A\u00020\u00072\b\u0010\u0016\u001A\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001A\u00020\u001AHÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0015\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u001B"}, d2 = {"Lcom/kakao/keditor/event/common/AddItem;", "Lcom/kakao/keditor/event/Event;", "position", "", "item", "Lcom/kakao/keditor/KeditorItem;", "skipScroll", "", "(Ljava/lang/Integer;Lcom/kakao/keditor/KeditorItem;Z)V", "getItem", "()Lcom/kakao/keditor/KeditorItem;", "getPosition", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSkipScroll", "()Z", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Lcom/kakao/keditor/KeditorItem;Z)Lcom/kakao/keditor/event/common/AddItem;", "equals", "other", "", "hashCode", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class AddItem implements Event {
    @NotNull
    private final KeditorItem item;
    @Nullable
    private final Integer position;
    private final boolean skipScroll;

    public AddItem(@Nullable Integer integer0, @NotNull KeditorItem keditorItem0, boolean z) {
        Intrinsics.checkNotNullParameter(keditorItem0, "item");
        super();
        this.position = integer0;
        this.item = keditorItem0;
        this.skipScroll = z;
    }

    public AddItem(Integer integer0, KeditorItem keditorItem0, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            integer0 = null;
        }
        if((v & 4) != 0) {
            z = false;
        }
        this(integer0, keditorItem0, z);
    }

    @Nullable
    public final Integer component1() {
        return this.position;
    }

    @NotNull
    public final KeditorItem component2() {
        return this.item;
    }

    public final boolean component3() {
        return this.skipScroll;
    }

    @NotNull
    public final AddItem copy(@Nullable Integer integer0, @NotNull KeditorItem keditorItem0, boolean z) {
        Intrinsics.checkNotNullParameter(keditorItem0, "item");
        return new AddItem(integer0, keditorItem0, z);
    }

    public static AddItem copy$default(AddItem addItem0, Integer integer0, KeditorItem keditorItem0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            integer0 = addItem0.position;
        }
        if((v & 2) != 0) {
            keditorItem0 = addItem0.item;
        }
        if((v & 4) != 0) {
            z = addItem0.skipScroll;
        }
        return addItem0.copy(integer0, keditorItem0, z);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AddItem)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.position, ((AddItem)object0).position)) {
            return false;
        }
        return Intrinsics.areEqual(this.item, ((AddItem)object0).item) ? this.skipScroll == ((AddItem)object0).skipScroll : false;
    }

    @NotNull
    public final KeditorItem getItem() {
        return this.item;
    }

    @Nullable
    public final Integer getPosition() {
        return this.position;
    }

    public final boolean getSkipScroll() {
        return this.skipScroll;
    }

    @Override
    public int hashCode() {
        return this.position == null ? Boolean.hashCode(this.skipScroll) + this.item.hashCode() * 0x1F : Boolean.hashCode(this.skipScroll) + (this.item.hashCode() + this.position.hashCode() * 0x1F) * 0x1F;
    }

    @Override  // com.kakao.keditor.event.Event
    @Nullable
    public Function1 pendingEvent() {
        return null;
    }

    @Override
    @NotNull
    public String toString() {
        return "AddItem(position=" + this.position + ", item=" + this.item + ", skipScroll=" + this.skipScroll + ")";
    }
}

