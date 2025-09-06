package gc;

import androidx.lifecycle.Observer;
import com.kakao.kphotopicker.util.SingleLiveEvent;
import com.kakao.tistory.domain.entity.SortItem;
import com.kakao.tistory.domain.entity.User;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.view.blog.BlogFollowerFragment;
import com.kakao.tistory.presentation.view.blog.BlogFollowingFragment;
import com.kakao.tistory.presentation.view.bottomsheet.ReportDialogFragment;
import com.kakao.tistory.presentation.view.entry.EntryViewActivity;
import com.kakao.tistory.presentation.view.home.RefererLogListActivity;
import com.kakao.tistory.presentation.view.statistics.StatisticsFragment;
import com.kakao.tistory.presentation.viewmodel.BlogFollowViewModel;
import com.kakao.tistory.presentation.viewmodel.EntryViewModel;
import com.kakao.tistory.presentation.viewmodel.ReportViewModel;
import com.kakao.tistory.presentation.viewmodel.StatisticsViewModel;
import com.kakao.tistory.presentation.viewmodel.TopViewModel;
import kotlin.jvm.internal.Intrinsics;

public final class b implements Observer {
    public final int a;
    public final Object b;
    public final Object c;

    public b(int v, Object object0, Object object1) {
        this.a = v;
        this.b = object0;
        this.c = object1;
        super();
    }

    @Override  // androidx.lifecycle.Observer
    public final void onChanged(Object object0) {
        Object object1 = this.c;
        Object object2 = this.b;
        switch(this.a) {
            case 0: {
                BlogFollowerFragment.a(((TopViewModel)object2), ((BlogFollowerFragment)object1), ((Boolean)object0));
                return;
            }
            case 1: {
                BlogFollowingFragment.a(((BlogFollowViewModel)object2), ((BlogFollowingFragment)object1), ((Long)object0));
                return;
            }
            case 2: {
                ReportDialogFragment.a(((ReportViewModel)object2), ((ReportDialogFragment)object1), ((Integer)object0));
                return;
            }
            case 3: {
                EntryViewActivity.a(((EntryViewActivity)object2), ((EntryViewModel)object1), ((User)object0));
                return;
            }
            case 4: {
                RefererLogListActivity.a(((TopViewModel)object2), ((RefererLogListActivity)object1), ((Boolean)object0));
                return;
            }
            case 5: {
                StatisticsFragment.a(((EntryItem)object2), ((StatisticsFragment)object1), ((SortItem)object0));
                return;
            }
            case 6: {
                StatisticsFragment.a(((StatisticsFragment)object2), ((StatisticsViewModel)object1), ((String)object0));
                return;
            }
            default: {
                Intrinsics.checkNotNullParameter(((SingleLiveEvent)object2), "this$0");
                Intrinsics.checkNotNullParameter(((Observer)object1), "$observer");
                if(((SingleLiveEvent)object2).o.compareAndSet(true, false)) {
                    ((Observer)object1).onChanged(object0);
                }
            }
        }
    }
}

