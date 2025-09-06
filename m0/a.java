package m0;

import android.os.Build.VERSION;
import android.view.View;
import androidx.compose.foundation.text.input.internal.EditCommandKt;
import androidx.compose.foundation.text.input.internal.EditingBuffer;
import androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public static final a A;
    public static final a B;
    public static final a C;
    public static final a D;
    public static final a E;
    public final int w;
    public static final a x;
    public static final a y;
    public static final a z;

    static {
        a.x = new a(1, 0);
        a.y = new a(1, 1);
        a.z = new a(1, 2);
        a.A = new a(1, 3);
        a.B = new a(1, 4);
        a.C = new a(1, 5);
        a.D = new a(1, 6);
        a.E = new a(1, 7);
    }

    public a(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                ((Number)object0).longValue();
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object0).longValue();
                return Unit.INSTANCE;
            }
            case 2: {
                return Build.VERSION.SDK_INT >= 34 ? new p(((View)object0)) : new o(((View)object0));  // 初始化器: Lm0/o;-><init>(Landroid/view/View;)V
            }
            case 3: {
                List list0 = (List)object0;
                return Unit.INSTANCE;
            }
            case 4: {
                return Unit.INSTANCE;
            }
            case 5: {
                EditCommandKt.finishComposingText(((EditingBuffer)object0));
                return Unit.INSTANCE;
            }
            case 6: {
                ((TextFieldPreparedSelection)object0).moveCursorLeft();
                return Unit.INSTANCE;
            }
            default: {
                ((TextFieldPreparedSelection)object0).moveCursorRight();
                return Unit.INSTANCE;
            }
        }
    }
}

