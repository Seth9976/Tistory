package qc;

import androidx.lifecycle.Observer;
import com.kakao.tistory.presentation.view.statistics.StatisticsFragment;
import java.util.List;

public final class b implements Observer {
    public final int a;
    public final StatisticsFragment b;

    public b(StatisticsFragment statisticsFragment0, int v) {
        this.a = v;
        this.b = statisticsFragment0;
        super();
    }

    @Override  // androidx.lifecycle.Observer
    public final void onChanged(Object object0) {
        if(this.a != 0) {
            StatisticsFragment.a(this.b, ((List)object0));
            return;
        }
        StatisticsFragment.a(this.b, ((Boolean)object0));
    }
}

