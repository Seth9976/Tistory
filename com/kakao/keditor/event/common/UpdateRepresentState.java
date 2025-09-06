package com.kakao.keditor.event.common;

import com.kakao.keditor.event.Event;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000B\u001A\u00020\u0005HÆ\u0003J\u001D\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001A\u00020\u00052\b\u0010\u000E\u001A\u0004\u0018\u00010\u000FHÖ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001A\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/kakao/keditor/event/common/UpdateRepresentState;", "Lcom/kakao/keditor/event/Event;", "position", "", "isSet", "", "(IZ)V", "()Z", "getPosition", "()I", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "Companion", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class UpdateRepresentState implements Event {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/kakao/keditor/event/common/UpdateRepresentState$Companion;", "", "()V", "newInstance", "Lcom/kakao/keditor/event/common/UpdateRepresentState;", "position", "", "isSet", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final UpdateRepresentState newInstance(int v, boolean z) {
            return new UpdateRepresentState(v, z);
        }
    }

    @NotNull
    public static final Companion Companion;
    private final boolean isSet;
    private final int position;

    static {
        UpdateRepresentState.Companion = new Companion(null);
    }

    public UpdateRepresentState(int v, boolean z) {
        this.position = v;
        this.isSet = z;
    }

    public final int component1() {
        return this.position;
    }

    public final boolean component2() {
        return this.isSet;
    }

    @NotNull
    public final UpdateRepresentState copy(int v, boolean z) {
        return new UpdateRepresentState(v, z);
    }

    public static UpdateRepresentState copy$default(UpdateRepresentState updateRepresentState0, int v, boolean z, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = updateRepresentState0.position;
        }
        if((v1 & 2) != 0) {
            z = updateRepresentState0.isSet;
        }
        return updateRepresentState0.copy(v, z);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof UpdateRepresentState)) {
            return false;
        }
        return this.position == ((UpdateRepresentState)object0).position ? this.isSet == ((UpdateRepresentState)object0).isSet : false;
    }

    public final int getPosition() {
        return this.position;
    }

    @Override
    public int hashCode() {
        return Boolean.hashCode(this.isSet) + this.position * 0x1F;
    }

    public final boolean isSet() {
        return this.isSet;
    }

    @JvmStatic
    @NotNull
    public static final UpdateRepresentState newInstance(int v, boolean z) {
        return UpdateRepresentState.Companion.newInstance(v, z);
    }

    @Override  // com.kakao.keditor.event.Event
    @Nullable
    public Function1 pendingEvent() {
        return null;
    }

    @Override
    @NotNull
    public String toString() {
        return "UpdateRepresentState(position=" + this.position + ", isSet=" + this.isSet + ")";
    }
}

