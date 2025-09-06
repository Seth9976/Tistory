package com.kakao.keditor.plugin.itemspec.paragraph.request;

import com.kakao.keditor.request.RenderingRequest;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/paragraph/request/SetTextSize;", "Lcom/kakao/keditor/request/RenderingRequest;", "size", "", "(I)V", "getSize", "()I", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SetTextSize extends RenderingRequest {
    private final int size;

    public SetTextSize(int v) {
        this.size = v;
    }

    public final int getSize() {
        return this.size;
    }
}

