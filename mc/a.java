package mc;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import com.kakao.tistory.presentation.view.editor.EditorSettingFragment;
import java.util.Map;

public final class a implements ActivityResultCallback {
    public final int a;
    public final EditorSettingFragment b;

    public a(EditorSettingFragment editorSettingFragment0, int v) {
        this.a = v;
        this.b = editorSettingFragment0;
        super();
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object object0) {
        if(this.a != 0) {
            EditorSettingFragment.a(this.b, ((Map)object0));
            return;
        }
        EditorSettingFragment.a(this.b, ((ActivityResult)object0));
    }
}

