package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m0.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001BB\u0013\u0012\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\n\u001A\u00020\t2\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u0005¢\u0006\u0004\b\n\u0010\u000BJ\r\u0010\f\u001A\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001D\u0010\u0012\u001A\u00020\u000F2\u0006\u0010\u000E\u001A\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001D\u0010\u0014\u001A\u00020\u000F2\u0006\u0010\u000E\u001A\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0011J\u000F\u0010\u0016\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001A\u001A\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u0019\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006\u001C"}, d2 = {"Landroidx/compose/foundation/text/input/internal/ChangeTracker;", "Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "initialChanges", "<init>", "(Landroidx/compose/foundation/text/input/internal/ChangeTracker;)V", "", "preStart", "preEnd", "postLength", "", "trackChange", "(III)V", "clearChanges", "()V", "changeIndex", "Landroidx/compose/ui/text/TextRange;", "getRange--jx7JFs", "(I)J", "getRange", "getOriginalRange--jx7JFs", "getOriginalRange", "", "toString", "()Ljava/lang/String;", "getChangeCount", "()I", "changeCount", "m0/n", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nChangeTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeTracker.kt\nandroidx/compose/foundation/text/input/internal/ChangeTracker\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1208#2:197\n1187#2,2:198\n1208#2:200\n1187#2,2:201\n460#3,7:203\n728#3,2:210\n467#3,4:212\n523#3:216\n728#3,2:217\n523#3:219\n523#3:221\n476#3,11:222\n728#3,2:233\n1#4:220\n*S KotlinDebug\n*F\n+ 1 ChangeTracker.kt\nandroidx/compose/foundation/text/input/internal/ChangeTracker\n*L\n34#1:197\n34#1:198,2\n35#1:200\n35#1:201,2\n38#1:203,7\n39#1:210,2\n38#1:212,4\n81#1:216\n110#1:217,2\n132#1:219\n135#1:221\n139#1:222,11\n186#1:233,2\n*E\n"})
public final class ChangeTracker implements ChangeList {
    public static final int $stable = 8;
    public MutableVector a;
    public MutableVector b;

    public ChangeTracker() {
        this(null, 1, null);
    }

    public ChangeTracker(@Nullable ChangeTracker changeTracker0) {
        int v = 0;
        this.a = new MutableVector(new n[16], 0);
        this.b = new MutableVector(new n[16], 0);
        if(changeTracker0 != null) {
            MutableVector mutableVector0 = changeTracker0.a;
            if(mutableVector0 != null) {
                int v1 = mutableVector0.getSize();
                if(v1 > 0) {
                    Object[] arr_object = mutableVector0.getContent();
                    while(true) {
                        n n0 = (n)arr_object[v];
                        this.a.add(new n(n0.a, n0.b, n0.c, n0.d));
                        ++v;
                        if(v >= v1) {
                            break;
                        }
                    }
                }
            }
        }
    }

    public ChangeTracker(ChangeTracker changeTracker0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            changeTracker0 = null;
        }
        this(changeTracker0);
    }

    public final void a(n n0, int v, int v1, int v2) {
        int v3;
        if(this.b.isEmpty()) {
            v3 = 0;
        }
        else {
            n n1 = (n)this.b.last();
            v3 = n1.b - n1.d;
        }
        if(n0 == null) {
            n0 = new n(v, v1 + v2, v - v3, v1 - v3);
        }
        else {
            if(n0.a > v) {
                n0.a = v;
                n0.c = v;
            }
            int v4 = n0.b;
            if(v1 > v4) {
                n0.b = v1;
                n0.d = v1 - (v4 - n0.d);
            }
            n0.b += v2;
        }
        this.b.add(n0);
    }

    public final void clearChanges() {
        this.a.clear();
    }

    @Override  // androidx.compose.foundation.text.input.TextFieldBuffer$ChangeList
    public int getChangeCount() {
        return this.a.getSize();
    }

    @Override  // androidx.compose.foundation.text.input.TextFieldBuffer$ChangeList
    public long getOriginalRange--jx7JFs(int v) {
        n n0 = (n)this.a.getContent()[v];
        return TextRangeKt.TextRange(n0.c, n0.d);
    }

    @Override  // androidx.compose.foundation.text.input.TextFieldBuffer$ChangeList
    public long getRange--jx7JFs(int v) {
        n n0 = (n)this.a.getContent()[v];
        return TextRangeKt.TextRange(n0.a, n0.b);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ChangeList(changes=[");
        MutableVector mutableVector0 = this.a;
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                n n0 = (n)arr_object[v1];
                stringBuilder0.append("(" + n0.c + ',' + n0.d + ")->(" + n0.a + ',' + n0.b + ')');
                if(v1 < this.getChangeCount() - 1) {
                    stringBuilder0.append(", ");
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        stringBuilder0.append("])");
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    public final void trackChange(int v, int v1, int v2) {
        if(v == v1 && v2 == 0) {
            return;
        }
        int v3 = Math.min(v, v1);
        int v4 = Math.max(v, v1);
        int v5 = v2 - (v4 - v3);
        n n0 = null;
        boolean z = false;
        for(int v6 = 0; v6 < this.a.getSize(); ++v6) {
            n n1 = (n)this.a.getContent()[v6];
            int v7 = n1.a;
            if((v3 > v7 || v7 > v4) && (v3 > n1.b || n1.b > v4)) {
                if(v7 > v4 && !z) {
                    this.a(n0, v3, v4, v5);
                    z = true;
                }
                if(z) {
                    n1.a += v5;
                    n1.b += v5;
                }
                this.b.add(n1);
            }
            else if(n0 == null) {
                n0 = n1;
            }
            else {
                n0.b = n1.b;
                n0.d = n1.d;
            }
        }
        if(!z) {
            this.a(n0, v3, v4, v5);
        }
        MutableVector mutableVector0 = this.a;
        this.a = this.b;
        this.b = mutableVector0;
        mutableVector0.clear();
    }
}

