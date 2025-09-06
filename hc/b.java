package hc;

import android.view.View.OnClickListener;
import android.view.View;
import com.kakao.tistory.domain.entity.entry.DaumLikeViewItemModel.PairChild;
import com.kakao.tistory.presentation.view.bottomsheet.DaumCategoryDialogAdapter.DaumCategoryChildItemViewHolder;
import com.kakao.tistory.presentation.view.bottomsheet.DaumCategoryDialogAdapter;

public final class b implements View.OnClickListener {
    public final int a;
    public final PairChild b;
    public final DaumCategoryDialogAdapter c;

    public b(PairChild daumLikeViewItemModel$PairChild0, DaumCategoryDialogAdapter daumCategoryDialogAdapter0) {
        this.a = 1;
        super();
        this.b = daumLikeViewItemModel$PairChild0;
        this.c = daumCategoryDialogAdapter0;
    }

    public b(DaumCategoryDialogAdapter daumCategoryDialogAdapter0, PairChild daumLikeViewItemModel$PairChild0) {
        this.a = 0;
        super();
        this.c = daumCategoryDialogAdapter0;
        this.b = daumLikeViewItemModel$PairChild0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        if(this.a != 0) {
            DaumCategoryChildItemViewHolder.a(this.b, this.c, view0);
            return;
        }
        DaumCategoryChildItemViewHolder.a(this.c, this.b, view0);
    }
}

