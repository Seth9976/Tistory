package rb;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import com.kakao.kphotopicker.util.PermissionUtil;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class a implements DialogInterface.OnClickListener {
    public final Context a;
    public final Function0 b;

    public a(Context context0, Function0 function00) {
        this.a = context0;
        this.b = function00;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        Intrinsics.checkNotNullParameter(this.a, "$context");
        dialogInterface0.dismiss();
        PermissionUtil.INSTANCE.goToPermissionSettings(this.a);
        Function0 function00 = this.b;
        if(function00 != null) {
            function00.invoke();
        }
    }
}

