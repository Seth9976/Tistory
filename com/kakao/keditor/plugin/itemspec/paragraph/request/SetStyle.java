package com.kakao.keditor.plugin.itemspec.paragraph.request;

import com.kakao.keditor.plugin.itemspec.paragraph.CommonTextStyle;
import com.kakao.keditor.request.RenderingRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/paragraph/request/SetStyle;", "Lcom/kakao/keditor/request/RenderingRequest;", "style", "Lcom/kakao/keditor/plugin/itemspec/paragraph/CommonTextStyle;", "(Lcom/kakao/keditor/plugin/itemspec/paragraph/CommonTextStyle;)V", "getStyle", "()Lcom/kakao/keditor/plugin/itemspec/paragraph/CommonTextStyle;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SetStyle extends RenderingRequest {
    @NotNull
    private final CommonTextStyle style;

    public SetStyle(@NotNull CommonTextStyle commonTextStyle0) {
        Intrinsics.checkNotNullParameter(commonTextStyle0, "style");
        super();
        this.style = commonTextStyle0;
    }

    @NotNull
    public final CommonTextStyle getStyle() {
        return this.style;
    }
}

