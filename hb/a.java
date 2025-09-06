package hb;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import com.kakao.keditor.plugin.ActivityResultHandler.DefaultImpls;
import com.kakao.keditor.plugin.ActivityResultHandler;

public final class a implements ActivityResultCallback {
    public final int a;
    public final ActivityResultHandler b;

    public a(ActivityResultHandler activityResultHandler0, int v) {
        this.a = v;
        this.b = activityResultHandler0;
        super();
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object object0) {
        if(this.a != 0) {
            DefaultImpls.registerForActivityResult$lambda$1(this.b, ((ActivityResult)object0));
            return;
        }
        DefaultImpls.registerForActivityResult$lambda$0(this.b, ((ActivityResult)object0));
    }
}

