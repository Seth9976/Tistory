package bc;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import com.kakao.tistory.presentation.common.extension.ke.KeFilePluginExtensionKt;
import kotlin.jvm.functions.Function0;

public final class a implements DialogInterface.OnClickListener {
    public final int a;
    public final Object b;

    public a(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        if(this.a != 0) {
            dialogInterface0.dismiss();
            Function0 function00 = (Function0)this.b;
            if(function00 != null) {
                function00.invoke();
            }
            return;
        }
        KeFilePluginExtensionKt.a(((Context)this.b), dialogInterface0, v);
    }
}

