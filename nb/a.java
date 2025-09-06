package nb;

import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View;
import com.kakao.kphotopicker.ItemClickListener;
import com.kakao.kphotopicker.picker.item.PhotoItemView;
import com.kakao.kphotopicker.widget.ContentDescriptionKt;
import kotlin.jvm.internal.Intrinsics;

public final class a implements View.OnClickListener {
    public final int a;
    public final PhotoItemView b;
    public final int c;

    public a(PhotoItemView photoItemView0, int v, int v1) {
        this.a = v1;
        this.b = photoItemView0;
        this.c = v;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        int v = this.c;
        PhotoItemView photoItemView0 = this.b;
        if(this.a != 0) {
            Intrinsics.checkNotNullParameter(photoItemView0, "this$0");
            ItemClickListener itemClickListener0 = photoItemView0.d;
            if(itemClickListener0 != null) {
                itemClickListener0.click(view0.getId(), v);
            }
            return;
        }
        Intrinsics.checkNotNullParameter(photoItemView0, "this$0");
        Context context0 = photoItemView0.c.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
        boolean z = ContentDescriptionKt.isAccessibilityEnabled(context0);
        ItemClickListener itemClickListener1 = photoItemView0.d;
        if(z) {
            if(itemClickListener1 != null) {
                itemClickListener1.click(photoItemView0.c.layerIndex.getId(), v);
            }
        }
        else if(itemClickListener1 != null) {
            itemClickListener1.click(view0.getId(), v);
        }
    }
}

