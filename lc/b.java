package lc;

import android.view.View;
import android.widget.ViewSwitcher.ViewFactory;
import com.kakao.tistory.presentation.view.common.widget.RollingNumberView;

public final class b implements ViewSwitcher.ViewFactory {
    public final RollingNumberView a;

    public b(RollingNumberView rollingNumberView0) {
        this.a = rollingNumberView0;
    }

    @Override  // android.widget.ViewSwitcher$ViewFactory
    public final View makeView() {
        return RollingNumberView.a(this.a);
    }
}

