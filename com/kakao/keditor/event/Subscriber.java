package com.kakao.keditor.event;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/kakao/keditor/event/Subscriber;", "Lcom/kakao/keditor/event/Participant;", "onEvent", "", "event", "Lcom/kakao/keditor/event/Event;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface Subscriber extends Participant {
    void onEvent(@NotNull Event arg1);
}

