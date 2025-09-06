package androidx.activity;

import android.view.View;
import androidx.compose.foundation.text.SecureTextFieldController;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.ui.focus.FocusInvalidationManager;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeView_androidKt;
import androidx.compose.ui.tooling.ComposeViewAdapter;
import androidx.paging.PageFetcher;
import ca.p0;
import com.kakao.kandinsky.preview.ui.PreviewTextureLoader;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class c0 extends FunctionReferenceImpl implements Function0 {
    public final int a;

    public c0(int v, Object object0, Class class0, String s, String s1, int v1, int v2) {
        this.a = v2;
        super(v, object0, class0, s, s1, v1);
    }

    public c0(Object object0, int v) {
        this.a = v;
        if(v != 14) {
            super(0, object0, PreviewTextureLoader.class, "removeSurfaceInfo", "removeSurfaceInfo()V", 0);
            return;
        }
        super(0, object0, PageFetcher.class, "refresh", "refresh()V", 0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.a) {
            case 0: {
                ((OnBackPressedDispatcher)this.receiver).e();
                return Unit.INSTANCE;
            }
            case 1: {
                ((OnBackPressedDispatcher)this.receiver).e();
                return Unit.INSTANCE;
            }
            case 2: {
                SelectionManager.access$toolbarCopy(((SelectionManager)this.receiver));
                return Unit.INSTANCE;
            }
            case 3: {
                ((SelectionManager)this.receiver).selectAll$foundation_release();
                return Unit.INSTANCE;
            }
            case 4: {
                return AndroidComposeView_androidKt.access$getContentCaptureSessionCompat(((View)this.receiver));
            }
            case 5: {
                AndroidComposeView.access$onClearFocusForOwner(((AndroidComposeView)this.receiver));
                return Unit.INSTANCE;
            }
            case 6: {
                return ((AndroidComposeView)this.receiver).j();
            }
            case 7: {
                ((p0)this.receiver).a.invoke();
                return Unit.INSTANCE;
            }
            case 8: {
                return ((p0)this.receiver).a.invoke();
            }
            case 9: {
                SecureTextFieldController.access$scheduleHide(((SecureTextFieldController)this.receiver));
                return Unit.INSTANCE;
            }
            case 10: {
                FocusInvalidationManager.access$invalidateNodes(((FocusInvalidationManager)this.receiver));
                return Unit.INSTANCE;
            }
            case 11: {
                FocusOwnerImpl.access$invalidateOwnerFocusState(((FocusOwnerImpl)this.receiver));
                return Unit.INSTANCE;
            }
            case 12: {
                ((ComposeViewAdapter)this.receiver).requestLayout();
                return Unit.INSTANCE;
            }
            case 13: {
                ((PreviewTextureLoader)this.receiver).removeSurfaceInfo();
                return Unit.INSTANCE;
            }
            case 14: {
                ((PageFetcher)this.receiver).refresh();
                return Unit.INSTANCE;
            }
            case 15: {
                PageFetcher.access$invalidate(((PageFetcher)this.receiver));
                return Unit.INSTANCE;
            }
            default: {
                PageFetcher.access$invalidate(((PageFetcher)this.receiver));
                return Unit.INSTANCE;
            }
        }
    }
}

