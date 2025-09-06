package com.kakao.keditor.event;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001A\u001F\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003H\u0016¨\u0006\t"}, d2 = {"Lcom/kakao/keditor/event/Event;", "", "pendingEvent", "Lkotlin/Function1;", "Lcom/kakao/keditor/event/Subscriber;", "Lkotlin/ParameterName;", "name", "subscriber", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface Event {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Nullable
        public static Function1 pendingEvent(@NotNull Event event0) [...] // Inlined contents
    }

    @Nullable
    Function1 pendingEvent();
}

