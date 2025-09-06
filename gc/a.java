package gc;

import androidx.lifecycle.Observer;
import com.kakao.tistory.domain.entity.SortItem;
import com.kakao.tistory.presentation.view.blog.BlogFollowerFragment;

public final class a implements Observer {
    public final int a;
    public final BlogFollowerFragment b;

    public a(BlogFollowerFragment blogFollowerFragment0, int v) {
        this.a = v;
        this.b = blogFollowerFragment0;
        super();
    }

    @Override  // androidx.lifecycle.Observer
    public final void onChanged(Object object0) {
        if(this.a != 0) {
            BlogFollowerFragment.a(this.b, ((Long)object0));
            return;
        }
        BlogFollowerFragment.a(this.b, ((SortItem)object0));
    }
}

