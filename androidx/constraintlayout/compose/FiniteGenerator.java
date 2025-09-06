package androidx.constraintlayout.compose;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\b\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u001D\u0010\u000F\u001A\u0012\u0012\u0004\u0012\u00020\u00060\rj\b\u0012\u0004\u0012\u00020\u0006`\u000E¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/constraintlayout/compose/FiniteGenerator;", "Landroidx/constraintlayout/compose/GeneratedValue;", "", "from", "to", "step", "", "prefix", "postfix", "<init>", "(FFFLjava/lang/String;Ljava/lang/String;)V", "value", "()F", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "array", "()Ljava/util/ArrayList;", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class FiniteGenerator implements GeneratedValue {
    public final float a;
    public final String b;
    public final String c;
    public float d;
    public boolean e;
    public final float f;
    public final float g;

    public FiniteGenerator(float f, float f1, float f2, @NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "prefix");
        Intrinsics.checkNotNullParameter(s1, "postfix");
        super();
        this.a = f2;
        this.b = s;
        this.c = s1;
        this.d = f;
        this.f = f;
        this.g = f1;
    }

    public FiniteGenerator(float f, float f1, float f2, String s, String s1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            f2 = 1.0f;
        }
        this(f, f1, f2, ((v & 8) == 0 ? s : ""), ((v & 16) == 0 ? s1 : ""));
    }

    @NotNull
    public final ArrayList array() {
        ArrayList arrayList0 = new ArrayList();
        int v = (int)this.f;
        int v1 = (int)this.f;
        int v2 = (int)this.g;
        if(v1 <= v2) {
            while(true) {
                arrayList0.add(this.b + v + this.c);
                v += (int)this.a;
                if(v1 == v2) {
                    break;
                }
                ++v1;
            }
        }
        return arrayList0;
    }

    @Override  // androidx.constraintlayout.compose.GeneratedValue
    public float value() {
        float f = this.d;
        if(f >= this.g) {
            this.e = true;
        }
        if(!this.e) {
            this.d = f + this.a;
        }
        return this.d;
    }
}

