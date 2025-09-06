package y9;

import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.crop.contract.CropRatioType;
import com.kakao.kandinsky.crop.contract.CropViewType;
import com.kakao.kandinsky.crop.contract.FlipType;
import com.kakao.kandinsky.crop.contract.RotateType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
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
                Intrinsics.checkNotNullParameter(((CropRatioType)object0), "it");
                return Unit.INSTANCE;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((CropViewType)object0), "it");
                return Unit.INSTANCE;
            }
            case 2: {
                ((Number)object0).floatValue();
                return Unit.INSTANCE;
            }
            case 3: {
                Intrinsics.checkNotNullParameter(((Rect)object0), "it");
                return Unit.INSTANCE;
            }
            case 4: {
                Intrinsics.checkNotNullParameter(((RotateType)object0), "it");
                return Unit.INSTANCE;
            }
            case 5: {
                Intrinsics.checkNotNullParameter(((FlipType)object0), "it");
                return Unit.INSTANCE;
            }
            case 6: {
                ((Number)object0).floatValue();
                return Unit.INSTANCE;
            }
            default: {
                return Unit.INSTANCE;
            }
        }
    }
}

