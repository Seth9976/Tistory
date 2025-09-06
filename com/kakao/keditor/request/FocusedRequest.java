package com.kakao.keditor.request;

import com.kakao.keditor.KeditorItem;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001A\u0010\u0002\u001A\u0004\u0018\u00010\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001A\u00020\tX¦\u000E¢\u0006\f\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Lcom/kakao/keditor/request/FocusedRequest;", "Lcom/kakao/keditor/request/KeditorRequest;", "focusedItem", "Lcom/kakao/keditor/KeditorItem;", "getFocusedItem", "()Lcom/kakao/keditor/KeditorItem;", "setFocusedItem", "(Lcom/kakao/keditor/KeditorItem;)V", "focusedPosition", "", "getFocusedPosition", "()I", "setFocusedPosition", "(I)V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface FocusedRequest extends KeditorRequest {
    @Nullable
    KeditorItem getFocusedItem();

    int getFocusedPosition();

    void setFocusedItem(@Nullable KeditorItem arg1);

    void setFocusedPosition(int arg1);
}

