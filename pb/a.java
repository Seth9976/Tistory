package pb;

import android.view.View.OnClickListener;
import android.view.View;
import com.kakao.kphotopicker.ItemClickListener;
import com.kakao.kphotopicker.picker.selected.SelectedItemView;
import kotlin.jvm.internal.Intrinsics;

public final class a implements View.OnClickListener {
    public final int a;
    public final SelectedItemView b;

    public a(SelectedItemView selectedItemView0, int v) {
        this.a = v;
        this.b = selectedItemView0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        SelectedItemView selectedItemView0 = this.b;
        if(this.a != 0) {
            Intrinsics.checkNotNullParameter(selectedItemView0, "this$0");
            ItemClickListener itemClickListener0 = selectedItemView0.d;
            if(itemClickListener0 != null) {
                itemClickListener0.click(view0.getId(), selectedItemView0.getAdapterPosition());
            }
            return;
        }
        Intrinsics.checkNotNullParameter(selectedItemView0, "this$0");
        ItemClickListener itemClickListener1 = selectedItemView0.d;
        if(itemClickListener1 != null) {
            itemClickListener1.click(view0.getId(), selectedItemView0.getAdapterPosition());
        }
    }
}

