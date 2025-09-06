package com.kakao.keditor.event.common;

import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.event.Event;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B0\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012!\u0010\u0004\u001A\u001D\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0002\u0010\u000BJ\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J$\u0010\u0011\u001A\u001D\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0003J8\u0010\u0012\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032#\b\u0002\u0010\u0004\u001A\u001D\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0001J\u0013\u0010\u0013\u001A\u00020\u00142\b\u0010\u0015\u001A\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0019HÖ\u0001R,\u0010\u0004\u001A\u001D\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u001A"}, d2 = {"Lcom/kakao/keditor/event/common/GetItemPosition;", "Lcom/kakao/keditor/event/Event;", "item", "Lcom/kakao/keditor/KeditorItem;", "block", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "position", "", "(Lcom/kakao/keditor/KeditorItem;Lkotlin/jvm/functions/Function1;)V", "getBlock", "()Lkotlin/jvm/functions/Function1;", "getItem", "()Lcom/kakao/keditor/KeditorItem;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GetItemPosition implements Event {
    @NotNull
    private final Function1 block;
    @NotNull
    private final KeditorItem item;

    public GetItemPosition(@NotNull KeditorItem keditorItem0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(keditorItem0, "item");
        Intrinsics.checkNotNullParameter(function10, "block");
        super();
        this.item = keditorItem0;
        this.block = function10;
    }

    @NotNull
    public final KeditorItem component1() {
        return this.item;
    }

    @NotNull
    public final Function1 component2() {
        return this.block;
    }

    @NotNull
    public final GetItemPosition copy(@NotNull KeditorItem keditorItem0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(keditorItem0, "item");
        Intrinsics.checkNotNullParameter(function10, "block");
        return new GetItemPosition(keditorItem0, function10);
    }

    public static GetItemPosition copy$default(GetItemPosition getItemPosition0, KeditorItem keditorItem0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            keditorItem0 = getItemPosition0.item;
        }
        if((v & 2) != 0) {
            function10 = getItemPosition0.block;
        }
        return getItemPosition0.copy(keditorItem0, function10);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof GetItemPosition)) {
            return false;
        }
        return Intrinsics.areEqual(this.item, ((GetItemPosition)object0).item) ? Intrinsics.areEqual(this.block, ((GetItemPosition)object0).block) : false;
    }

    @NotNull
    public final Function1 getBlock() {
        return this.block;
    }

    @NotNull
    public final KeditorItem getItem() {
        return this.item;
    }

    @Override
    public int hashCode() {
        return this.block.hashCode() + this.item.hashCode() * 0x1F;
    }

    @Override  // com.kakao.keditor.event.Event
    @Nullable
    public Function1 pendingEvent() {
        return null;
    }

    @Override
    @NotNull
    public String toString() {
        return "GetItemPosition(item=" + this.item + ", block=" + this.block + ")";
    }
}

