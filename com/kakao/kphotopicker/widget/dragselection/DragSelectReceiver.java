package com.kakao.kphotopicker.widget.dragselection;

import androidx.annotation.CheckResult;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H\'J\u0010\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0003H\'J\u0010\u0010\u0007\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0003H\'J\u0018\u0010\b\u001A\u00020\t2\u0006\u0010\u0006\u001A\u00020\u00032\u0006\u0010\n\u001A\u00020\u0005H&¨\u0006\u000B"}, d2 = {"Lcom/kakao/kphotopicker/widget/dragselection/DragSelectReceiver;", "", "getItemCount", "", "isIndexSelectable", "", "index", "isSelected", "setSelected", "", "selected", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface DragSelectReceiver {
    @CheckResult
    int getItemCount();

    @CheckResult
    boolean isIndexSelectable(int arg1);

    @CheckResult
    boolean isSelected(int arg1);

    void setSelected(int arg1, boolean arg2);
}

