package l9;

import android.app.Dialog;
import android.view.View.OnClickListener;
import android.view.View;
import com.kakao.common.widget.KeditorAlertDialog;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class a implements View.OnClickListener {
    public final int a;
    public final KeditorAlertDialog b;

    public a(KeditorAlertDialog keditorAlertDialog0, int v) {
        this.a = v;
        this.b = keditorAlertDialog0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        KeditorAlertDialog keditorAlertDialog0 = this.b;
        switch(this.a) {
            case 0: {
                Intrinsics.checkNotNullParameter(keditorAlertDialog0, "this$0");
                Dialog dialog1 = keditorAlertDialog0.getDialog();
                if(dialog1 != null) {
                    dialog1.dismiss();
                }
                return;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(keditorAlertDialog0, "this$0");
                Dialog dialog2 = keditorAlertDialog0.getDialog();
                if(dialog2 != null) {
                    dialog2.dismiss();
                }
                Function0 function00 = keditorAlertDialog0.A;
                if(function00 != null) {
                    function00.invoke();
                }
                return;
            }
            default: {
                Intrinsics.checkNotNullParameter(keditorAlertDialog0, "this$0");
                Dialog dialog0 = keditorAlertDialog0.getDialog();
                if(dialog0 != null) {
                    dialog0.dismiss();
                }
            }
        }
    }
}

