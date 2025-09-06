package nb;

import com.kakao.kphotopicker.ItemClickListener;
import com.kakao.kphotopicker.picker.item.PhotoItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function0 {
    public final PhotoItemView w;

    public c(PhotoItemView photoItemView0) {
        this.w = photoItemView0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        PhotoItemView photoItemView0 = this.w;
        ItemClickListener itemClickListener0 = photoItemView0.getItemClickListener();
        if(itemClickListener0 != null) {
            itemClickListener0.click(photoItemView0.itemView.getId(), photoItemView0.getAdapterPosition());
        }
        return Unit.INSTANCE;
    }
}

