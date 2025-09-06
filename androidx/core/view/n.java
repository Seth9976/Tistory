package androidx.core.view;

import android.view.View.OnLongClickListener;
import android.view.View;
import com.kakao.tistory.presentation.view.common.widget.TistoryToolbar;
import com.kakao.tistory.presentation.view.webview.EntryWebView;

public final class n implements View.OnLongClickListener {
    public final int a;
    public final Object b;

    public n(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // android.view.View$OnLongClickListener
    public final boolean onLongClick(View view0) {
        switch(this.a) {
            case 0: {
                return ((DragStartHelper)this.b).onLongClick(view0);
            }
            case 1: {
                return TistoryToolbar.a(((TistoryToolbar)this.b), view0);
            }
            default: {
                return EntryWebView.a(((EntryWebView)this.b), view0);
            }
        }
    }
}

