package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.kakao.common.view.SoftInputWindowFrameDetector;
import com.kakao.common.view.SoftInputWindowFrameDetectorKt;
import com.kakao.tistory.presentation.view.common.widget.DoubleQuotationTextView;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.Intrinsics;

public final class b implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int a;
    public final Object b;

    public b(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Object object0 = this.b;
        switch(this.a) {
            case 0: {
                ((AndroidComposeView)object0).p();
                return;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((SoftInputWindowFrameDetector)object0), "this$0");
                Rect rect0 = ((SoftInputWindowFrameDetector)object0).f;
                ((SoftInputWindowFrameDetector)object0).g.set(rect0);
                SoftInputWindowFrameDetectorKt.getSoftInputWindowFrame(((SoftInputWindowFrameDetector)object0).a, rect0);
                Rect rect1 = ((SoftInputWindowFrameDetector)object0).g;
                if(!Intrinsics.areEqual(rect0, rect1)) {
                    ((SoftInputWindowFrameDetector)object0).b = rect0.bottom < rect1.bottom;
                }
                int v = rect1.bottom;
                if(v != 0) {
                    int v1 = rect0.bottom;
                    if(v1 != 0) {
                        int v2 = Math.abs(v1 - v);
                        if(v2 != 0 && ((SoftInputWindowFrameDetector)object0).d != v2 && v2 > ((SoftInputWindowFrameDetector)object0).c) {
                            ((SoftInputWindowFrameDetector)object0).d = v2;
                        }
                    }
                }
                Function8 function80 = ((SoftInputWindowFrameDetector)object0).e;
                if(function80 != null) {
                    function80.invoke(rect1.left, rect1.top, rect1.right, rect1.bottom, rect0.left, rect0.top, rect0.right, rect0.bottom);
                }
                return;
            }
            default: {
                DoubleQuotationTextView.a(((DoubleQuotationTextView)object0));
            }
        }
    }
}

