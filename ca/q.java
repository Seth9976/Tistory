package ca;

import android.view.MotionEvent;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function1 {
    public static final q A;
    public static final q B;
    public static final q C;
    public static final q D;
    public final int w;
    public static final q x;
    public static final q y;
    public static final q z;

    static {
        q.x = new q(1, 0);
        q.y = new q(1, 1);
        q.z = new q(1, 2);
        q.A = new q(1, 3);
        q.B = new q(1, 4);
        q.C = new q(1, 5);
        q.D = new q(1, 6);
    }

    public q(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                switch(((Number)object0).intValue()) {
                    case 0: {
                        return "토스트";
                    }
                    case 1: {
                        return "테스트";
                    }
                    case 2: {
                        return "코스트";
                    }
                    default: {
                        return "고스트";
                    }
                }
            }
            case 1: {
                switch(((Number)object0).intValue()) {
                    case 0: {
                        return "토스트";
                    }
                    case 1: {
                        return "테스트";
                    }
                    case 2: {
                        return "코스트";
                    }
                    default: {
                        return "고스트";
                    }
                }
            }
            case 2: {
                Intrinsics.checkNotNullParameter(((ContentDrawScope)object0), "$this$drawWithContent");
                float f = Size.getWidth-impl(((ContentDrawScope)object0).getSize-NH-jbRc());
                ((ContentDrawScope)object0).getDrawContext().getTransform().translate(-f / 2.0f, 0.0f);
                try {
                    ((ContentDrawScope)object0).drawContent();
                    return Unit.INSTANCE;
                }
                finally {
                    ((ContentDrawScope)object0).getDrawContext().getTransform().translate(-(-f / 2.0f), -0.0f);
                }
            }
            case 3: {
                Intrinsics.checkNotNullParameter(((MotionEvent)object0), "it");
                return false;
            }
            case 4: {
                Intrinsics.checkNotNullParameter(((ContentDrawScope)object0), "$this$drawWithContent");
                float f1 = Size.getWidth-impl(((ContentDrawScope)object0).getSize-NH-jbRc());
                ((ContentDrawScope)object0).getDrawContext().getTransform().translate(-f1 / 2.0f, 0.0f);
                try {
                    ((ContentDrawScope)object0).drawContent();
                    return Unit.INSTANCE;
                }
                finally {
                    ((ContentDrawScope)object0).getDrawContext().getTransform().translate(-(-f1 / 2.0f), -0.0f);
                }
            }
            case 5: {
                Intrinsics.checkNotNullParameter(((MotionEvent)object0), "it");
                return false;
            }
            default: {
                Intrinsics.checkNotNullParameter(((MotionEvent)object0), "it");
                return false;
            }
        }
    }
}

