package com.kakao.tistory.presentation.common.extension;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\n\b\u0017\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u000F\u0012\u0006\u0010\u0003\u001A\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001A\u00028\u0000¢\u0006\u0004\b\t\u0010\nR$\u0010\u000F\u001A\u00020\u00062\u0006\u0010\u000B\u001A\u00020\u00068\u0006@BX\u0086\u000E¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/kakao/tistory/presentation/common/extension/Event;", "T", "", "content", "<init>", "(Ljava/lang/Object;)V", "", "getContentIfNotHandled", "()Z", "getContent", "()Ljava/lang/Object;", "<set-?>", "b", "Z", "getHasBeenHandled", "hasBeenHandled", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class Event {
    public static final int $stable = 8;
    public final Object a;
    public boolean b;

    public Event(Object object0) {
        this.a = object0;
    }

    public final Object getContent() {
        return this.a;
    }

    public final boolean getContentIfNotHandled() {
        if(!this.b) {
            this.b = true;
            return true;
        }
        return false;
    }

    public final boolean getHasBeenHandled() {
        return this.b;
    }
}

