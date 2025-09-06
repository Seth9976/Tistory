package androidx.compose.ui.focus;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import l1.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\t\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0010\b\n\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b¢\u0006\u0004\b\t\u0010\nJ6\u0010\u000B\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0010\b\n\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b¢\u0006\u0004\b\u000B\u0010\nR,\u0010\u0013\u001A\u0004\u0018\u00010\r*\u00020\f2\b\u0010\u000E\u001A\u0004\u0018\u00010\r8F@FX\u0086\u000E¢\u0006\f\u001A\u0004\b\u000F\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/focus/FocusTransactionManager;", "", "<init>", "()V", "T", "Lkotlin/Function0;", "", "onCancelled", "block", "withNewTransaction", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "withExistingTransaction", "Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusStateImpl;", "value", "getUncommittedFocusState", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusStateImpl;", "setUncommittedFocusState", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusStateImpl;)V", "uncommittedFocusState", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFocusTransactionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 7 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,102:1\n1208#2:103\n1187#2,2:104\n1#3:106\n728#4,2:107\n728#4,2:109\n460#4,11:145\n66#5,9:111\n405#6,3:120\n363#6,6:123\n373#6,3:130\n376#6,2:134\n409#6,2:136\n379#6,6:138\n411#6:144\n1810#7:129\n1672#7:133\n*S KotlinDebug\n*F\n+ 1 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n*L\n31#1:103\n31#1:104,2\n46#1:107,2\n63#1:109,2\n98#1:145,11\n79#1:111,9\n87#1:120,3\n87#1:123,6\n87#1:130,3\n87#1:134,2\n87#1:136,2\n87#1:138,6\n87#1:144\n87#1:129\n87#1:133\n*E\n"})
public final class FocusTransactionManager {
    public static final int $stable = 8;
    public final MutableScatterMap a;
    public final MutableVector b;
    public boolean c;

    public FocusTransactionManager() {
        this.a = ScatterMapKt.mutableScatterMapOf();
        this.b = new MutableVector(new Function0[16], 0);
    }

    public static final void access$beginTransaction(FocusTransactionManager focusTransactionManager0) {
        focusTransactionManager0.c = true;
    }

    public static final void access$cancelTransaction(FocusTransactionManager focusTransactionManager0) {
        focusTransactionManager0.a.clear();
        int v = 0;
        focusTransactionManager0.c = false;
        MutableVector mutableVector0 = focusTransactionManager0.b;
        int v1 = mutableVector0.getSize();
        if(v1 > 0) {
            Object[] arr_object = mutableVector0.getContent();
            while(true) {
                ((Function0)arr_object[v]).invoke();
                ++v;
                if(v >= v1) {
                    break;
                }
            }
        }
        mutableVector0.clear();
    }

    public static final void access$commitTransaction(FocusTransactionManager focusTransactionManager0) {
        MutableScatterMap mutableScatterMap0 = focusTransactionManager0.a;
        Object[] arr_object = mutableScatterMap0.keys;
        long[] arr_v = mutableScatterMap0.metadata;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            ((FocusTargetNode)arr_object[(v1 << 3) + v4]).commitFocusState$ui_release();
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_17;
                    }
                    break;
                }
            label_17:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        mutableScatterMap0.clear();
        focusTransactionManager0.c = false;
        focusTransactionManager0.b.clear();
    }

    @Nullable
    public final FocusStateImpl getUncommittedFocusState(@NotNull FocusTargetNode focusTargetNode0) {
        return (FocusStateImpl)this.a.get(focusTargetNode0);
    }

    public final void setUncommittedFocusState(@NotNull FocusTargetNode focusTargetNode0, @Nullable FocusStateImpl focusStateImpl0) {
        if(focusStateImpl0 == null) {
            throw a.b("requires a non-null focus state");
        }
        this.a.set(focusTargetNode0, focusStateImpl0);
    }

    public final Object withExistingTransaction(@Nullable Function0 function00, @NotNull Function0 function01) {
        if(function00 != null) {
            this.b.add(function00);
        }
        if(this.c) {
            return function01.invoke();
        }
        try {
            FocusTransactionManager.access$beginTransaction(this);
            return function01.invoke();
        }
        finally {
            FocusTransactionManager.access$commitTransaction(this);
        }
    }

    public static Object withExistingTransaction$default(FocusTransactionManager focusTransactionManager0, Function0 function00, Function0 function01, int v, Object object0) {
        if((v & 1) != 0) {
            function00 = null;
        }
        if(function00 != null) {
            focusTransactionManager0.b.add(function00);
        }
        if(focusTransactionManager0.c) {
            return function01.invoke();
        }
        try {
            FocusTransactionManager.access$beginTransaction(focusTransactionManager0);
            return function01.invoke();
        }
        finally {
            FocusTransactionManager.access$commitTransaction(focusTransactionManager0);
        }
    }

    public final Object withNewTransaction(@Nullable Function0 function00, @NotNull Function0 function01) {
        try {
            if(this.c) {
                FocusTransactionManager.access$cancelTransaction(this);
            }
            FocusTransactionManager.access$beginTransaction(this);
            if(function00 != null) {
                this.b.add(function00);
            }
            return function01.invoke();
        }
        finally {
            FocusTransactionManager.access$commitTransaction(this);
        }
    }

    public static Object withNewTransaction$default(FocusTransactionManager focusTransactionManager0, Function0 function00, Function0 function01, int v, Object object0) {
        if((v & 1) != 0) {
            function00 = null;
        }
        try {
            if(focusTransactionManager0.c) {
                FocusTransactionManager.access$cancelTransaction(focusTransactionManager0);
            }
            FocusTransactionManager.access$beginTransaction(focusTransactionManager0);
            if(function00 != null) {
                focusTransactionManager0.b.add(function00);
            }
            return function01.invoke();
        }
        finally {
            FocusTransactionManager.access$commitTransaction(focusTransactionManager0);
        }
    }
}

