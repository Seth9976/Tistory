package com.kakao.keditor.event.common;

import android.text.style.CharacterStyle;
import com.kakao.keditor.event.Event;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0005HÆ\u0003J\u001D\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\u000E\u001A\u00020\u000F2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001A\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/kakao/keditor/event/common/UpdateStyle;", "Lcom/kakao/keditor/event/Event;", "position", "", "request", "Landroid/text/style/CharacterStyle;", "(ILandroid/text/style/CharacterStyle;)V", "getPosition", "()I", "getRequest", "()Landroid/text/style/CharacterStyle;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class UpdateStyle implements Event {
    private final int position;
    @NotNull
    private final CharacterStyle request;

    public UpdateStyle(int v, @NotNull CharacterStyle characterStyle0) {
        Intrinsics.checkNotNullParameter(characterStyle0, "request");
        super();
        this.position = v;
        this.request = characterStyle0;
    }

    public final int component1() {
        return this.position;
    }

    @NotNull
    public final CharacterStyle component2() {
        return this.request;
    }

    @NotNull
    public final UpdateStyle copy(int v, @NotNull CharacterStyle characterStyle0) {
        Intrinsics.checkNotNullParameter(characterStyle0, "request");
        return new UpdateStyle(v, characterStyle0);
    }

    public static UpdateStyle copy$default(UpdateStyle updateStyle0, int v, CharacterStyle characterStyle0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = updateStyle0.position;
        }
        if((v1 & 2) != 0) {
            characterStyle0 = updateStyle0.request;
        }
        return updateStyle0.copy(v, characterStyle0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof UpdateStyle)) {
            return false;
        }
        return this.position == ((UpdateStyle)object0).position ? Intrinsics.areEqual(this.request, ((UpdateStyle)object0).request) : false;
    }

    public final int getPosition() {
        return this.position;
    }

    @NotNull
    public final CharacterStyle getRequest() {
        return this.request;
    }

    @Override
    public int hashCode() {
        return this.request.hashCode() + this.position * 0x1F;
    }

    @Override  // com.kakao.keditor.event.Event
    @Nullable
    public Function1 pendingEvent() {
        return null;
    }

    @Override
    @NotNull
    public String toString() {
        return "UpdateStyle(position=" + this.position + ", request=" + this.request + ")";
    }
}

