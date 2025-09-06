package p0;

import androidx.compose.material.BackdropValue;
import androidx.compose.material.BottomDrawerValue;
import androidx.compose.material.BottomSheetValue;
import androidx.compose.material.DismissValue;
import androidx.compose.material.DrawerValue;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class r extends Lambda implements Function1 {
    public static final r A;
    public static final r B;
    public static final r C;
    public static final r D;
    public static final r E;
    public static final r F;
    public static final r G;
    public static final r H;
    public static final r I;
    public static final r J;
    public static final r K;
    public static final r L;
    public static final r M;
    public static final r N;
    public static final r O;
    public static final r P;
    public static final r Q;
    public final int w;
    public static final r x;
    public static final r y;
    public static final r z;

    static {
        r.x = new r(1, 0);
        r.y = new r(1, 1);
        r.z = new r(1, 2);
        r.A = new r(1, 3);
        r.B = new r(1, 4);
        r.C = new r(1, 5);
        r.D = new r(1, 6);
        r.E = new r(1, 7);
        r.F = new r(1, 8);
        r.G = new r(1, 9);
        r.H = new r(1, 10);
        r.I = new r(1, 11);
        r.J = new r(1, 12);
        r.K = new r(1, 13);
        r.L = new r(1, 14);
        r.M = new r(1, 15);
        r.N = new r(1, 16);
        r.O = new r(1, 17);
        r.P = new r(1, 18);
        r.Q = new r(1, 19);
    }

    public r(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                return true;
            }
            case 1: {
                return true;
            }
            case 2: {
                BackdropValue backdropValue0 = (BackdropValue)object0;
                return true;
            }
            case 3: {
                BottomDrawerValue bottomDrawerValue0 = (BottomDrawerValue)object0;
                return true;
            }
            case 4: {
                BottomSheetValue bottomSheetValue0 = (BottomSheetValue)object0;
                return true;
            }
            case 5: {
                BottomSheetValue bottomSheetValue1 = (BottomSheetValue)object0;
                return true;
            }
            case 6: {
                DismissValue dismissValue0 = (DismissValue)object0;
                return true;
            }
            case 7: {
                BottomDrawerValue bottomDrawerValue1 = (BottomDrawerValue)object0;
                return true;
            }
            case 8: {
                DrawerValue drawerValue0 = (DrawerValue)object0;
                return true;
            }
            case 9: {
                SemanticsPropertyReceiver semanticsPropertyReceiver0 = (SemanticsPropertyReceiver)object0;
                return Unit.INSTANCE;
            }
            case 10: {
                SemanticsPropertyReceiver semanticsPropertyReceiver1 = (SemanticsPropertyReceiver)object0;
                return Unit.INSTANCE;
            }
            case 11: {
                ModalBottomSheetValue modalBottomSheetValue0 = (ModalBottomSheetValue)object0;
                return true;
            }
            case 12: {
                ModalBottomSheetValue modalBottomSheetValue1 = (ModalBottomSheetValue)object0;
                return true;
            }
            case 13: {
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver)object0;
                return Unit.INSTANCE;
            }
            case 14: {
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver)object0;
                return Unit.INSTANCE;
            }
            case 15: {
                SemanticsPropertyReceiver semanticsPropertyReceiver4 = (SemanticsPropertyReceiver)object0;
                return Unit.INSTANCE;
            }
            case 16: {
                SemanticsPropertiesKt.setContainer(((SemanticsPropertyReceiver)object0), true);
                return Unit.INSTANCE;
            }
            case 17: {
                return true;
            }
            case 18: {
                return true;
            }
            default: {
                return (float)(((Number)object0).floatValue() * 0.7f);
            }
        }
    }
}

