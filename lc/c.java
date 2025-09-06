package lc;

import android.view.View.OnClickListener;
import android.view.View;
import com.kakao.tistory.presentation.view.common.widget.TistoryToolbar;
import com.kakao.tistory.presentation.view.exception.TistoryErrorView;
import kotlin.jvm.functions.Function0;

public final class c implements View.OnClickListener {
    public final int a;
    public final Function0 b;

    public c(Function0 function00, int v) {
        this.a = v;
        this.b = function00;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        switch(this.a) {
            case 0: {
                TistoryToolbar.a(this.b, view0);
                return;
            }
            case 1: {
                TistoryToolbar.c(this.b, view0);
                return;
            }
            case 2: {
                TistoryToolbar.b(this.b, view0);
                return;
            }
            default: {
                TistoryErrorView.a(this.b, view0);
            }
        }
    }
}

