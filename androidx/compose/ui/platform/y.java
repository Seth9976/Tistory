package androidx.compose.ui.platform;

import android.os.Looper;
import android.view.Choreographer;
import androidx.core.os.HandlerCompat;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

public final class y extends Lambda implements Function0 {
    public static final y A;
    public static final y B;
    public static final y C;
    public static final y D;
    public static final y E;
    public static final y F;
    public static final y G;
    public static final y H;
    public static final y I;
    public static final y J;
    public static final y K;
    public static final y L;
    public static final y M;
    public static final y N;
    public static final y O;
    public static final y P;
    public static final y Q;
    public static final y R;
    public static final y S;
    public static final y T;
    public static final y U;
    public static final y V;
    public static final y W;
    public static final y X;
    public static final y Y;
    public static final y Z;
    public static final y a0;
    public final int w;
    public static final y x;
    public static final y y;
    public static final y z;

    static {
        y.x = new y(0, 0);
        y.y = new y(0, 1);
        y.z = new y(0, 2);
        y.A = new y(0, 3);
        y.B = new y(0, 4);
        y.C = new y(0, 5);
        y.D = new y(0, 6);
        y.E = new y(0, 7);
        y.F = new y(0, 8);
        y.G = new y(0, 9);
        y.H = new y(0, 10);
        y.I = new y(0, 11);
        y.J = new y(0, 12);
        y.K = new y(0, 13);
        y.L = new y(0, 14);
        y.M = new y(0, 15);
        y.N = new y(0, 16);
        y.O = new y(0, 17);
        y.P = new y(0, 18);
        y.Q = new y(0, 19);
        y.R = new y(0, 20);
        y.S = new y(0, 21);
        y.T = new y(0, 22);
        y.U = new y(0, 23);
        y.V = new y(0, 24);
        y.W = new y(0, 25);
        y.X = new y(0, 26);
        y.Y = new y(0, 27);
        y.Z = new y(0, 28);
        y.a0 = new y(0, 29);
    }

    public y(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                return false;
            }
            case 1: {
                return 0.0f;
            }
            case 2: {
                return 0.0f;
            }
            case 3: {
                AndroidCompositionLocals_androidKt.access$noLocalProvidedFor("LocalConfiguration");
                throw new KotlinNothingValueException();
            }
            case 4: {
                AndroidCompositionLocals_androidKt.access$noLocalProvidedFor("LocalContext");
                throw new KotlinNothingValueException();
            }
            case 5: {
                AndroidCompositionLocals_androidKt.access$noLocalProvidedFor("LocalImageVectorCache");
                throw new KotlinNothingValueException();
            }
            case 6: {
                AndroidCompositionLocals_androidKt.access$noLocalProvidedFor("LocalResourceIdCache");
                throw new KotlinNothingValueException();
            }
            case 7: {
                AndroidCompositionLocals_androidKt.access$noLocalProvidedFor("LocalSavedStateRegistryOwner");
                throw new KotlinNothingValueException();
            }
            case 8: {
                AndroidCompositionLocals_androidKt.access$noLocalProvidedFor("LocalView");
                throw new KotlinNothingValueException();
            }
            case 9: {
                AndroidUiDispatcher androidUiDispatcher0 = new AndroidUiDispatcher((AndroidUiDispatcher_androidKt.access$isMainThread() ? Choreographer.getInstance() : ((Choreographer)BuildersKt.runBlocking(Dispatchers.getMain(), new k0(2, null)))), HandlerCompat.createAsync(Looper.getMainLooper()), null);  // 初始化器: Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V
                return androidUiDispatcher0.plus(androidUiDispatcher0.getFrameClock());
            }
            case 10: {
                return null;
            }
            case 11: {
                return null;
            }
            case 12: {
                CompositionLocalsKt.access$noLocalProvidedFor("LocalAutofillTree");
                throw new KotlinNothingValueException();
            }
            case 13: {
                CompositionLocalsKt.access$noLocalProvidedFor("LocalClipboardManager");
                throw new KotlinNothingValueException();
            }
            case 14: {
                CompositionLocalsKt.access$noLocalProvidedFor("LocalDensity");
                throw new KotlinNothingValueException();
            }
            case 15: {
                CompositionLocalsKt.access$noLocalProvidedFor("LocalFocusManager");
                throw new KotlinNothingValueException();
            }
            case 16: {
                CompositionLocalsKt.access$noLocalProvidedFor("LocalGraphicsContext");
                throw new KotlinNothingValueException();
            }
            case 17: {
                CompositionLocalsKt.access$noLocalProvidedFor("LocalHapticFeedback");
                throw new KotlinNothingValueException();
            }
            case 18: {
                CompositionLocalsKt.access$noLocalProvidedFor("LocalInputManager");
                throw new KotlinNothingValueException();
            }
            case 19: {
                CompositionLocalsKt.access$noLocalProvidedFor("LocalLayoutDirection");
                throw new KotlinNothingValueException();
            }
            case 20: {
                return null;
            }
            case 21: {
                return false;
            }
            case 22: {
                return null;
            }
            case 23: {
                return null;
            }
            case 24: {
                CompositionLocalsKt.access$noLocalProvidedFor("LocalTextToolbar");
                throw new KotlinNothingValueException();
            }
            case 25: {
                CompositionLocalsKt.access$noLocalProvidedFor("LocalUriHandler");
                throw new KotlinNothingValueException();
            }
            case 26: {
                CompositionLocalsKt.access$noLocalProvidedFor("LocalViewConfiguration");
                throw new KotlinNothingValueException();
            }
            case 27: {
                CompositionLocalsKt.access$noLocalProvidedFor("LocalWindowInfo");
                throw new KotlinNothingValueException();
            }
            case 28: {
                return false;
            }
            default: {
                return null;
            }
        }
    }
}

