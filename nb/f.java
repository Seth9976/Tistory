package nb;

import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View;
import com.kakao.kphotopicker.ItemClickListener;
import com.kakao.kphotopicker.picker.item.VideoItemView;
import com.kakao.kphotopicker.widget.ContentDescriptionKt;
import kotlin.jvm.internal.Intrinsics;

public final class f implements View.OnClickListener {
    public final int a;
    public final VideoItemView b;

    public f(VideoItemView videoItemView0, int v) {
        this.a = v;
        this.b = videoItemView0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        VideoItemView videoItemView0 = this.b;
        if(this.a != 0) {
            Intrinsics.checkNotNullParameter(videoItemView0, "this$0");
            ItemClickListener itemClickListener0 = videoItemView0.d;
            if(itemClickListener0 != null) {
                itemClickListener0.click(view0.getId(), videoItemView0.getAdapterPosition());
            }
            return;
        }
        Intrinsics.checkNotNullParameter(videoItemView0, "this$0");
        Context context0 = videoItemView0.c.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
        boolean z = ContentDescriptionKt.isAccessibilityEnabled(context0);
        ItemClickListener itemClickListener1 = videoItemView0.d;
        if(z) {
            if(itemClickListener1 != null) {
                itemClickListener1.click(videoItemView0.c.layerIndex.getId(), videoItemView0.getAdapterPosition());
            }
        }
        else if(itemClickListener1 != null) {
            itemClickListener1.click(view0.getId(), videoItemView0.getAdapterPosition());
        }
    }
}

