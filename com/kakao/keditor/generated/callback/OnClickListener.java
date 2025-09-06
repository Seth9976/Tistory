package com.kakao.keditor.generated.callback;

import android.view.View.OnClickListener;
import android.view.View;

public final class OnClickListener implements View.OnClickListener {
    public interface Listener {
        void _internalCallbackOnClick(int arg1, View arg2);
    }

    final Listener mListener;
    final int mSourceId;

    public OnClickListener(Listener onClickListener$Listener0, int v) {
        this.mListener = onClickListener$Listener0;
        this.mSourceId = v;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        this.mListener._internalCallbackOnClick(this.mSourceId, view0);
    }
}

