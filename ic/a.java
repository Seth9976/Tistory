package ic;

import android.view.View.OnClickListener;
import android.view.View;
import com.kakao.tistory.presentation.view.common.base.TistoryToolbarActivity;

public final class a implements View.OnClickListener {
    public final int a;
    public final TistoryToolbarActivity b;

    public a(TistoryToolbarActivity tistoryToolbarActivity0, int v) {
        this.a = v;
        this.b = tistoryToolbarActivity0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        if(this.a != 0) {
            TistoryToolbarActivity.b(this.b, view0);
            return;
        }
        TistoryToolbarActivity.a(this.b, view0);
    }
}

