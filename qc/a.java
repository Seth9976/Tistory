package qc;

import androidx.lifecycle.Observer;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.view.statistics.StatisticsFragment;
import com.kakao.tistory.presentation.viewmodel.TopViewModel;

public final class a implements Observer {
    public final TopViewModel a;
    public final StatisticsFragment b;
    public final EntryItem c;

    public a(TopViewModel topViewModel0, StatisticsFragment statisticsFragment0, EntryItem entryItem0) {
        this.a = topViewModel0;
        this.b = statisticsFragment0;
        this.c = entryItem0;
    }

    @Override  // androidx.lifecycle.Observer
    public final void onChanged(Object object0) {
        StatisticsFragment.a(this.a, this.b, this.c, ((Boolean)object0));
    }
}

