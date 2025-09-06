package com.kakao.tiara.track;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.kakao.tiara.TiaraTracker;
import com.kakao.tiara.data.ActionType;
import com.kakao.tiara.data.LogBuilder;

@RestrictTo({Scope.LIBRARY})
public class App extends LogBuilder {
    public App(@NonNull TiaraTracker tiaraTracker0, String s, String s1) {
        super(tiaraTracker0, s);
        this.actionType(ActionType.App);
        this.adTrackId(s1);
    }
}

