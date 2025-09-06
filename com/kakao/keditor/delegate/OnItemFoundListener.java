package com.kakao.keditor.delegate;

import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.event.EventFlow;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J%\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00028\u00002\u0006\u0010\t\u001A\u00020\nH&¢\u0006\u0002\u0010\u000B¨\u0006\f"}, d2 = {"Lcom/kakao/keditor/delegate/OnItemFoundListener;", "T", "Lcom/kakao/keditor/KeditorItem;", "", "onItemFound", "", "position", "", "item", "eventFlow", "Lcom/kakao/keditor/event/EventFlow;", "(ILcom/kakao/keditor/KeditorItem;Lcom/kakao/keditor/event/EventFlow;)V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface OnItemFoundListener {
    void onItemFound(int arg1, @NotNull KeditorItem arg2, @NotNull EventFlow arg3);
}

