package androidx.compose.ui.platform;

import android.content.res.Configuration;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.input.PlatformTextInputService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

public final class f extends Lambda implements Function1 {
    public static final f A;
    public static final f B;
    public static final f C;
    public static final f D;
    public static final f E;
    public static final f F;
    public static final f G;
    public static final f H;
    public static final f I;
    public final int w;
    public static final f x;
    public static final f y;
    public static final f z;

    static {
        f.x = new f(1, 0);
        f.y = new f(1, 1);
        f.z = new f(1, 2);
        f.A = new f(1, 3);
        f.B = new f(1, 4);
        f.C = new f(1, 5);
        f.D = new f(1, 6);
        f.E = new f(1, 7);
        f.F = new f(1, 8);
        f.G = new f(1, 9);
        f.H = new f(1, 10);
        f.I = new f(1, 11);
    }

    public f(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                return Boolean.valueOf(((LayoutNode)object0).getNodes$ui_release().has-H91voCI$ui_release(8));
            }
            case 1: {
                Configuration configuration0 = (Configuration)object0;
                return Unit.INSTANCE;
            }
            case 2: {
                FocusTargetNode focusTargetNode0 = (FocusTargetNode)object0;
                return true;
            }
            case 3: {
                RotaryScrollEvent rotaryScrollEvent0 = (RotaryScrollEvent)object0;
                return false;
            }
            case 4: {
                SemanticsConfiguration semanticsConfiguration0 = ((LayoutNode)object0).getCollapsedSemantics$ui_release();
                return Boolean.valueOf(semanticsConfiguration0 != null && semanticsConfiguration0.isMergingSemanticsOfDescendants());
            }
            case 5: {
                return Boolean.valueOf(((LayoutNode)object0).getNodes$ui_release().has-H91voCI$ui_release(8));
            }
            case 6: {
                boolean z = true;
                SemanticsConfiguration semanticsConfiguration1 = ((LayoutNode)object0).getCollapsedSemantics$ui_release();
                if(semanticsConfiguration1 == null || !semanticsConfiguration1.isMergingSemanticsOfDescendants() || !semanticsConfiguration1.contains(SemanticsProperties.INSTANCE.getEditableText())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            case 7: {
                return (PlatformTextInputService)object0;
            }
            case 8: {
                CoroutineScope coroutineScope0 = (CoroutineScope)object0;
                return Unit.INSTANCE;
            }
            case 9: {
                return Boolean.valueOf(DisposableSaveableStateRegistry_androidKt.a(object0));
            }
            case 10: {
                DragAndDropEvent dragAndDropEvent0 = (DragAndDropEvent)object0;
                return null;
            }
            default: {
                InspectorInfo inspectorInfo0 = (InspectorInfo)object0;
                return Unit.INSTANCE;
            }
        }
    }
}

