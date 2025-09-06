package kc;

import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final class e implements DialogInterface.OnCancelListener {
    public final int a;
    public final Function b;

    public e(Function function0, int v) {
        this.a = v;
        this.b = function0;
        super();
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public final void onCancel(DialogInterface dialogInterface0) {
        if(this.a != 0) {
            Function0 function00 = (Function0)this.b;
            if(function00 != null) {
                function00.invoke();
            }
            return;
        }
        TistoryDialog.a(((Function1)this.b), dialogInterface0);
    }
}

