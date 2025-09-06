package com.kakao.tistory.presentation.view.comment.guestbook;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class o implements OnContextAvailableListener {
    public final Hilt_PinGuestbookActivity a;

    public o(Hilt_PinGuestbookActivity hilt_PinGuestbookActivity0) {
        this.a = hilt_PinGuestbookActivity0;
        super();
    }

    @Override  // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context0) {
        this.a.inject();
    }
}

