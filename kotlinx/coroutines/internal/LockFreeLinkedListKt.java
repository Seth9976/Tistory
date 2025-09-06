package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zf.f;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u001A\u0017\u0010\u0003\u001A\u00060\u0001j\u0002`\u0002*\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\"\u001A\u0010\u0006\u001A\u00020\u00058\u0000X\u0081T¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\b\u0010\t\"\u001A\u0010\n\u001A\u00020\u00058\u0000X\u0081T¢\u0006\f\n\u0004\b\n\u0010\u0007\u0012\u0004\b\u000B\u0010\t\"\u001A\u0010\f\u001A\u00020\u00058\u0000X\u0081T¢\u0006\f\n\u0004\b\f\u0010\u0007\u0012\u0004\b\r\u0010\t\" \u0010\u0013\u001A\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000E\u0010\u000F\u0012\u0004\b\u0012\u0010\t\u001A\u0004\b\u0010\u0010\u0011*\f\b\u0002\u0010\u0014\"\u00020\u00012\u00020\u0001¨\u0006\u0015"}, d2 = {"", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "unwrap", "(Ljava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "", "UNDECIDED", "I", "getUNDECIDED$annotations", "()V", "SUCCESS", "getSUCCESS$annotations", "FAILURE", "getFAILURE$annotations", "a", "Ljava/lang/Object;", "getCONDITION_FALSE", "()Ljava/lang/Object;", "getCONDITION_FALSE$annotations", "CONDITION_FALSE", "Node", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class LockFreeLinkedListKt {
    public static final int FAILURE = 2;
    public static final int SUCCESS = 1;
    public static final int UNDECIDED;
    public static final Symbol a;

    static {
        LockFreeLinkedListKt.a = new Symbol("CONDITION_FALSE");
    }

    @NotNull
    public static final Object getCONDITION_FALSE() {
        return LockFreeLinkedListKt.a;
    }

    @PublishedApi
    public static void getCONDITION_FALSE$annotations() {
    }

    @PublishedApi
    public static void getFAILURE$annotations() {
    }

    @PublishedApi
    public static void getSUCCESS$annotations() {
    }

    @PublishedApi
    public static void getUNDECIDED$annotations() {
    }

    @PublishedApi
    @NotNull
    public static final LockFreeLinkedListNode unwrap(@NotNull Object object0) {
        f f0 = object0 instanceof f ? ((f)object0) : null;
        if(f0 != null) {
            LockFreeLinkedListNode lockFreeLinkedListNode0 = f0.a;
            if(lockFreeLinkedListNode0 != null) {
                return lockFreeLinkedListNode0;
            }
        }
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (LockFreeLinkedListNode)object0;
    }
}

