package hc;

import androidx.lifecycle.Observer;
import com.kakao.tistory.presentation.view.bottomsheet.DaumCategoryDialogFragment;
import java.util.List;

public final class c implements Observer {
    public final int a;
    public final DaumCategoryDialogFragment b;

    public c(DaumCategoryDialogFragment daumCategoryDialogFragment0, int v) {
        this.a = v;
        this.b = daumCategoryDialogFragment0;
        super();
    }

    @Override  // androidx.lifecycle.Observer
    public final void onChanged(Object object0) {
        if(this.a != 0) {
            DaumCategoryDialogFragment.a(this.b, ((List)object0));
            return;
        }
        DaumCategoryDialogFragment.a(this.b, ((Boolean)object0));
    }
}

