package nb;

import android.view.View.OnLongClickListener;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.kakao.kphotopicker.picker.item.PickerAdapter;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class d implements View.OnLongClickListener {
    public final ViewHolder a;
    public final PickerAdapter b;
    public final int c;

    public d(ViewHolder recyclerView$ViewHolder0, PickerAdapter pickerAdapter0, int v) {
        this.a = recyclerView$ViewHolder0;
        this.b = pickerAdapter0;
        this.c = v;
    }

    @Override  // android.view.View$OnLongClickListener
    public final boolean onLongClick(View view0) {
        Intrinsics.checkNotNullParameter(this.a, "$holder");
        Intrinsics.checkNotNullParameter(this.b, "this$0");
        this.a.itemView.performHapticFeedback(0);
        Function1 function10 = this.b.l;
        Intrinsics.checkNotNull(function10);
        function10.invoke(this.c);
        return false;
    }
}

