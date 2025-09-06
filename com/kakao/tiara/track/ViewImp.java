package com.kakao.tiara.track;

import androidx.annotation.NonNull;
import com.kakao.tiara.TiaraTracker;
import com.kakao.tiara.data.ActionType;
import com.kakao.tiara.data.LogBuilder;

public final class ViewImp extends LogBuilder {
    public ViewImp(@NonNull TiaraTracker tiaraTracker0, String s) {
        super(tiaraTracker0, s);
        this.actionType(ActionType.ViewImp);
    }
}

