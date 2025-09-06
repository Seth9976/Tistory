package m0;

import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.annotation.DoNotInline;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.f0;
import org.jetbrains.annotations.NotNull;

public final class u {
    public static final u a;

    static {
        u.a = new u();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    public final void a(@NotNull EditorInfo editorInfo0) {
        editorInfo0.setSupportedHandwritingGestures(CollectionsKt__CollectionsKt.listOf(new Class[]{SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class, JoinOrSplitGesture.class, InsertGesture.class, RemoveSpaceGesture.class}));
        editorInfo0.setSupportedHandwritingGesturePreviews(f0.setOf(new Class[]{SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class}));
    }
}

