package com.kakao.tistory.presentation.common.event;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001A\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001A\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/kakao/tistory/presentation/common/event/ShowToastEvent;", "", "message", "", "getMessage", "()Ljava/lang/String;", "messageRes", "", "getMessageRes", "()Ljava/lang/Integer;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface ShowToastEvent {
    @Nullable
    String getMessage();

    @Nullable
    Integer getMessageRes();
}

