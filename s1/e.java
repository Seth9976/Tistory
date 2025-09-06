package s1;

import android.os.Handler.Callback;
import android.os.Message;
import androidx.compose.ui.graphics.layer.LayerManager;

public final class e implements Handler.Callback {
    public final LayerManager a;

    public e(LayerManager layerManager0) {
        this.a = layerManager0;
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        this.a.a(this.a.b);
        return true;
    }
}

