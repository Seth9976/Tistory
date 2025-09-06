package nb;

import com.kakao.kphotopicker.ItemClickListener;
import com.kakao.kphotopicker.picker.item.VideoItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function0 {
    public final VideoItemView w;

    public h(VideoItemView videoItemView0) {
        this.w = videoItemView0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        VideoItemView videoItemView0 = this.w;
        ItemClickListener itemClickListener0 = videoItemView0.d;
        if(itemClickListener0 != null) {
            itemClickListener0.click(videoItemView0.itemView.getId(), videoItemView0.getAdapterPosition());
        }
        return Unit.INSTANCE;
    }
}

