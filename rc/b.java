package rc;

import android.webkit.ValueCallback;
import com.kakao.tistory.presentation.viewmodel.r2;
import com.kakao.tistory.presentation.viewmodel.r4;

public final class b implements ValueCallback {
    public final int a;

    public b(int v) {
        this.a = v;
        super();
    }

    @Override  // android.webkit.ValueCallback
    public final void onReceiveValue(Object object0) {
        switch(this.a) {
            case 0: {
                return;
            }
            case 1: {
                r2.a(((Boolean)object0));
                return;
            }
            case 2: {
                r4.a(((Boolean)object0));
            }
        }
    }
}

