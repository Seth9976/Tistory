package bc;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import com.kakao.tistory.presentation.common.extension.ke.KeFilePluginExtensionKt;

public final class b implements DialogInterface.OnClickListener {
    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        KeFilePluginExtensionKt.a(dialogInterface0, v);
    }
}

