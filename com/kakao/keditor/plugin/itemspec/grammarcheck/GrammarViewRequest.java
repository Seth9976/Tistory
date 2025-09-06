package com.kakao.keditor.plugin.itemspec.grammarcheck;

import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.util.eventbus.ViewRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/grammarcheck/GrammarViewRequest;", "Lcom/kakao/keditor/util/eventbus/ViewRequest;", "keditorItem", "Lcom/kakao/keditor/KeditorItem;", "(Lcom/kakao/keditor/KeditorItem;)V", "getKeditorItem", "()Lcom/kakao/keditor/KeditorItem;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class GrammarViewRequest extends ViewRequest {
    @NotNull
    private final KeditorItem keditorItem;

    public GrammarViewRequest(@NotNull KeditorItem keditorItem0) {
        Intrinsics.checkNotNullParameter(keditorItem0, "keditorItem");
        super();
        this.keditorItem = keditorItem0;
    }

    @NotNull
    public final KeditorItem getKeditorItem() {
        return this.keditorItem;
    }
}

