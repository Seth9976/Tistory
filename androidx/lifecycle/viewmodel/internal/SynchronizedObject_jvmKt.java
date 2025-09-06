package androidx.lifecycle.viewmodel.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A/\u0010\u0000\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u000E\b\u0004\u0010\u0004\u001A\b\u0012\u0004\u0012\u0002H\u00010\u0005H\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"synchronizedImpl", "T", "lock", "Landroidx/lifecycle/viewmodel/internal/SynchronizedObject;", "action", "Lkotlin/Function0;", "(Landroidx/lifecycle/viewmodel/internal/SynchronizedObject;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class SynchronizedObject_jvmKt {
    public static final Object synchronizedImpl(@NotNull SynchronizedObject synchronizedObject0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(synchronizedObject0, "lock");
        Intrinsics.checkNotNullParameter(function00, "action");
        synchronized(synchronizedObject0) {
            return function00.invoke();
        }
    }
}

