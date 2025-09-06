package com.kakao.keditor.event.common;

import com.kakao.keditor.event.Event;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001A\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001A\u00020\u0003HÖ\u0001J\t\u0010\u000E\u001A\u00020\u000FHÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/kakao/keditor/event/common/RefreshPosition;", "Lcom/kakao/keditor/event/Event;", "position", "", "(I)V", "getPosition", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class RefreshPosition implements Event {
    private final int position;

    public RefreshPosition(int v) {
        this.position = v;
    }

    public final int component1() {
        return this.position;
    }

    @NotNull
    public final RefreshPosition copy(int v) {
        return new RefreshPosition(v);
    }

    public static RefreshPosition copy$default(RefreshPosition refreshPosition0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = refreshPosition0.position;
        }
        return refreshPosition0.copy(v);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof RefreshPosition ? this.position == ((RefreshPosition)object0).position : false;
    }

    public final int getPosition() {
        return this.position;
    }

    @Override
    public int hashCode() {
        return this.position;
    }

    @Override  // com.kakao.keditor.event.Event
    @Nullable
    public Function1 pendingEvent() {
        return null;
    }

    @Override
    @NotNull
    public String toString() {
        return "RefreshPosition(position=" + this.position + ")";
    }
}

