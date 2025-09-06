package com.kakao.tistory.presentation.view.comment.guestbook;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class n implements OnContextAvailableListener {
    public final Hilt_GuestbookActivity a;

    public n(Hilt_GuestbookActivity hilt_GuestbookActivity0) {
        this.a = hilt_GuestbookActivity0;
        super();
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context0) {
        this.a.inject();
    }
}

