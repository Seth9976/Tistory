package rc;

import android.view.View.OnClickListener;
import android.view.View;
import com.kakao.tistory.presentation.view.webview.CommonWebViewActivity;

public final class c implements View.OnClickListener {
    public final int a;
    public final CommonWebViewActivity b;

    public c(CommonWebViewActivity commonWebViewActivity0, int v) {
        this.a = v;
        this.b = commonWebViewActivity0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        switch(this.a) {
            case 0: {
                CommonWebViewActivity.d(this.b, view0);
                return;
            }
            case 1: {
                CommonWebViewActivity.e(this.b, view0);
                return;
            }
            case 2: {
                CommonWebViewActivity.a(this.b, view0);
                return;
            }
            case 3: {
                CommonWebViewActivity.b(this.b, view0);
                return;
            }
            default: {
                CommonWebViewActivity.c(this.b, view0);
            }
        }
    }
}

