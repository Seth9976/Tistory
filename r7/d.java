package r7;

import android.content.res.TypedArray;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public final class d implements View.OnClickListener {
    public final BottomSheetDialog a;

    public d(BottomSheetDialog bottomSheetDialog0) {
        this.a = bottomSheetDialog0;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        BottomSheetDialog bottomSheetDialog0 = this.a;
        if(bottomSheetDialog0.k && bottomSheetDialog0.isShowing()) {
            if(!bottomSheetDialog0.m) {
                TypedArray typedArray0 = bottomSheetDialog0.getContext().obtainStyledAttributes(new int[]{0x101035B});
                bottomSheetDialog0.l = typedArray0.getBoolean(0, true);
                typedArray0.recycle();
                bottomSheetDialog0.m = true;
            }
            if(bottomSheetDialog0.l) {
                bottomSheetDialog0.cancel();
            }
        }
    }
}

