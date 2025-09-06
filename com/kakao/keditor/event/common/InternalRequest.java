package com.kakao.keditor.event.common;

import com.kakao.keditor.event.Event;
import com.kakao.keditor.request.KeditorRequest;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001A\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001A\u00020\u000EHÖ\u0001J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/kakao/keditor/event/common/InternalRequest;", "Lcom/kakao/keditor/event/Event;", "request", "Lcom/kakao/keditor/request/KeditorRequest;", "(Lcom/kakao/keditor/request/KeditorRequest;)V", "getRequest", "()Lcom/kakao/keditor/request/KeditorRequest;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class InternalRequest implements Event {
    @NotNull
    private final KeditorRequest request;

    public InternalRequest(@NotNull KeditorRequest keditorRequest0) {
        Intrinsics.checkNotNullParameter(keditorRequest0, "request");
        super();
        this.request = keditorRequest0;
    }

    @NotNull
    public final KeditorRequest component1() {
        return this.request;
    }

    @NotNull
    public final InternalRequest copy(@NotNull KeditorRequest keditorRequest0) {
        Intrinsics.checkNotNullParameter(keditorRequest0, "request");
        return new InternalRequest(keditorRequest0);
    }

    public static InternalRequest copy$default(InternalRequest internalRequest0, KeditorRequest keditorRequest0, int v, Object object0) {
        if((v & 1) != 0) {
            keditorRequest0 = internalRequest0.request;
        }
        return internalRequest0.copy(keditorRequest0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof InternalRequest ? Intrinsics.areEqual(this.request, ((InternalRequest)object0).request) : false;
    }

    @NotNull
    public final KeditorRequest getRequest() {
        return this.request;
    }

    @Override
    public int hashCode() {
        return this.request.hashCode();
    }

    @Override  // com.kakao.keditor.event.Event
    @Nullable
    public Function1 pendingEvent() {
        return null;
    }

    @Override
    @NotNull
    public String toString() {
        return "InternalRequest(request=" + this.request + ")";
    }
}

