package androidx.compose.runtime.internal;

import aa.d;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.FunctionN;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0010\u001A\u0004\u0018\u00010\t2\u0016\u0010\u000F\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\u000E\"\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R\u001A\u0010\u0006\u001A\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001A\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/internal/ComposableLambdaNImpl;", "Landroidx/compose/runtime/internal/ComposableLambdaN;", "", "key", "", "tracked", "arity", "<init>", "(IZI)V", "", "block", "", "update", "(Ljava/lang/Object;)V", "", "args", "invoke", "([Ljava/lang/Object;)Ljava/lang/Object;", "a", "I", "getKey", "()I", "c", "getArity", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nComposableLambdaN.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,193:1\n37#2,2:194\n*S KotlinDebug\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl\n*L\n113#1:194,2\n*E\n"})
public final class ComposableLambdaNImpl implements ComposableLambdaN {
    public static final int $stable;
    public final int a;
    public final boolean b;
    public final int c;
    public FunctionN d;
    public RecomposeScope e;
    public ArrayList f;

    public ComposableLambdaNImpl(int v, boolean z, int v1) {
        this.a = v;
        this.b = z;
        this.c = v1;
    }

    @Override  // kotlin.jvm.functions.FunctionN
    public int getArity() {
        return this.c;
    }

    public final int getKey() {
        return this.a;
    }

    @Override  // kotlin.jvm.functions.FunctionN
    @Nullable
    public Object invoke(@NotNull Object[] arr_object) {
        int v = arr_object.length - 2;
        for(int v1 = 1; v1 * 10 < v; ++v1) {
            --v;
        }
        Object object0 = arr_object[v];
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type androidx.compose.runtime.Composer");
        Object[] arr_object1 = ArraysKt___ArraysKt.slice(arr_object, c.until(0, arr_object.length - 1)).toArray(new Object[0]);
        Object object1 = arr_object[arr_object.length - 1];
        Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.Int");
        int v3 = (int)(((Integer)object1));
        Composer composer0 = ((Composer)object0).startRestartGroup(this.a);
        if(this.b) {
            RecomposeScope recomposeScope0 = composer0.getRecomposeScope();
            if(recomposeScope0 != null) {
                composer0.recordUsed(recomposeScope0);
                if(ComposableLambdaKt.replacableWith(this.e, recomposeScope0)) {
                    this.e = recomposeScope0;
                }
                else {
                    ArrayList arrayList0 = this.f;
                    if(arrayList0 == null) {
                        ArrayList arrayList1 = new ArrayList();
                        this.f = arrayList1;
                        arrayList1.add(recomposeScope0);
                    }
                    else {
                        int v4 = arrayList0.size();
                        for(int v2 = 0; true; ++v2) {
                            if(v2 >= v4) {
                                arrayList0.add(recomposeScope0);
                                break;
                            }
                            if(ComposableLambdaKt.replacableWith(((RecomposeScope)arrayList0.get(v2)), recomposeScope0)) {
                                arrayList0.set(v2, recomposeScope0);
                                break;
                            }
                        }
                    }
                }
            }
        }
        int v5 = composer0.changed(this) ? ComposableLambdaKt.differentBits(v) : ComposableLambdaKt.sameBits(v);
        FunctionN functionN0 = this.d;
        Intrinsics.checkNotNull(functionN0, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        SpreadBuilder spreadBuilder0 = new SpreadBuilder(2);
        spreadBuilder0.addSpread(arr_object1);
        spreadBuilder0.add(((int)(v3 | v5)));
        Object object2 = functionN0.invoke(spreadBuilder0.toArray(new Object[spreadBuilder0.size()]));
        ScopeUpdateScope scopeUpdateScope0 = composer0.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(arr_object, v, this, 11));
        }
        return object2;
    }

    public final void update(@NotNull Object object0) {
        if(!Intrinsics.areEqual(object0, this.d)) {
            boolean z = this.d == null;
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
            this.d = (FunctionN)object0;
            if(!z && this.b) {
                RecomposeScope recomposeScope0 = this.e;
                if(recomposeScope0 != null) {
                    recomposeScope0.invalidate();
                    this.e = null;
                }
                ArrayList arrayList0 = this.f;
                if(arrayList0 != null) {
                    int v1 = arrayList0.size();
                    for(int v = 0; v < v1; ++v) {
                        ((RecomposeScope)arrayList0.get(v)).invalidate();
                    }
                    arrayList0.clear();
                }
            }
        }
    }
}

