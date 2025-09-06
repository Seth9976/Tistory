package com.kakao.keditor.event.common;

import com.kakao.keditor.event.Event;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0018\u0010\u0002\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u001B\u0010\n\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J%\u0010\u000B\u001A\u00020\u00002\u001A\b\u0002\u0010\u0002\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u000FHÖ\u0003J\t\u0010\u0010\u001A\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001R#\u0010\u0002\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/kakao/keditor/event/common/GetItems;", "Lcom/kakao/keditor/event/Event;", "block", "Lkotlin/Function1;", "", "Lcom/kakao/keditor/KeditorItem;", "", "(Lkotlin/jvm/functions/Function1;)V", "getBlock", "()Lkotlin/jvm/functions/Function1;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GetItems implements Event {
    @NotNull
    private final Function1 block;

    public GetItems(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "block");
        super();
        this.block = function10;
    }

    @NotNull
    public final Function1 component1() {
        return this.block;
    }

    @NotNull
    public final GetItems copy(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "block");
        return new GetItems(function10);
    }

    public static GetItems copy$default(GetItems getItems0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = getItems0.block;
        }
        return getItems0.copy(function10);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof GetItems ? Intrinsics.areEqual(this.block, ((GetItems)object0).block) : false;
    }

    @NotNull
    public final Function1 getBlock() {
        return this.block;
    }

    @Override
    public int hashCode() {
        return this.block.hashCode();
    }

    @Override  // com.kakao.keditor.event.Event
    @Nullable
    public Function1 pendingEvent() {
        return null;
    }

    @Override
    @NotNull
    public String toString() {
        return "GetItems(block=" + this.block + ")";
    }
}

