package n4;

import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import androidx.navigation.Navigation;
import com.kakao.kphotopicker.preview.PreviewPagerAdapter;
import kotlin.jvm.internal.Intrinsics;

public final class n implements View.OnClickListener {
    public final int a;
    public final int b;
    public final Object c;

    public n(int v, Bundle bundle0) {
        this.a = 0;
        super();
        this.b = v;
        this.c = bundle0;
    }

    public n(PreviewPagerAdapter previewPagerAdapter0, int v) {
        this.a = 1;
        super();
        this.c = previewPagerAdapter0;
        this.b = v;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        if(this.a != 0) {
            Intrinsics.checkNotNullParameter(((PreviewPagerAdapter)this.c), "this$0");
            int v = view0.getId();
            ((PreviewPagerAdapter)this.c).c.click(v, this.b);
            return;
        }
        Intrinsics.checkNotNullExpressionValue(view0, "view");
        Navigation.findNavController(view0).navigate(this.b, ((Bundle)this.c));
    }
}

