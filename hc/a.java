package hc;

import androidx.lifecycle.Observer;
import com.kakao.tistory.presentation.view.bottomsheet.BlogCategoryDialogFragment;
import java.util.List;

public final class a implements Observer {
    public final int a;
    public final BlogCategoryDialogFragment b;

    public a(BlogCategoryDialogFragment blogCategoryDialogFragment0, int v) {
        this.a = v;
        this.b = blogCategoryDialogFragment0;
        super();
    }

    @Override  // androidx.lifecycle.Observer
    public final void onChanged(Object object0) {
        if(this.a != 0) {
            BlogCategoryDialogFragment.a(this.b, ((List)object0));
            return;
        }
        BlogCategoryDialogFragment.a(this.b, ((Boolean)object0));
    }
}

