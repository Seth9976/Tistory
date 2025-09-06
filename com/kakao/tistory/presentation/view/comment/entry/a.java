package com.kakao.tistory.presentation.view.comment.entry;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class a implements OnContextAvailableListener {
    public final Hilt_PostCommentActivity a;

    public a(Hilt_PostCommentActivity hilt_PostCommentActivity0) {
        this.a = hilt_PostCommentActivity0;
        super();
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context0) {
        this.a.inject();
    }
}

