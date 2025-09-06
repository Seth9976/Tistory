package kc;

import android.view.View.OnClickListener;
import android.view.View;
import com.kakao.tistory.presentation.view.common.dialog.CommonTimePickerDialog;

public final class b implements View.OnClickListener {
    public final int a;
    public final CommonTimePickerDialog b;

    public b(CommonTimePickerDialog commonTimePickerDialog0, int v) {
        this.a = v;
        this.b = commonTimePickerDialog0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        if(this.a != 0) {
            CommonTimePickerDialog.b(this.b, view0);
            return;
        }
        CommonTimePickerDialog.a(this.b, view0);
    }
}

