package androidx.lifecycle.viewmodel.internal;

import androidx.annotation.MainThread;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006B\u001D\b\u0016\u0012\u0012\u0010\t\u001A\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b¢\u0006\u0004\b\u0002\u0010\nB%\b\u0016\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0012\u0010\t\u001A\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b¢\u0006\u0004\b\u0002\u0010\u000BJ\u000F\u0010\r\u001A\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u0003J\u001D\u0010\u0011\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0010\u001A\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0011\u001A\u00020\f2\u0006\u0010\u0010\u001A\u00020\b¢\u0006\u0004\b\u0011\u0010\u0013J!\u0010\u0015\u001A\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0014*\u00020\b2\u0006\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/ViewModelImpl;", "", "<init>", "()V", "Lkotlinx/coroutines/CoroutineScope;", "viewModelScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "", "Ljava/lang/AutoCloseable;", "closeables", "([Ljava/lang/AutoCloseable;)V", "(Lkotlinx/coroutines/CoroutineScope;[Ljava/lang/AutoCloseable;)V", "", "clear", "", "key", "closeable", "addCloseable", "(Ljava/lang/String;Ljava/lang/AutoCloseable;)V", "(Ljava/lang/AutoCloseable;)V", "T", "getCloseable", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nViewModelImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelImpl.kt\nandroidx/lifecycle/viewmodel/internal/ViewModelImpl\n+ 2 SynchronizedObject.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObjectKt\n+ 3 SynchronizedObject.jvm.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObject_jvmKt\n*L\n1#1,136:1\n36#2,2:137\n36#2,2:140\n36#2,2:143\n36#2,2:146\n23#3:139\n23#3:142\n23#3:145\n23#3:148\n*S KotlinDebug\n*F\n+ 1 ViewModelImpl.kt\nandroidx/lifecycle/viewmodel/internal/ViewModelImpl\n*L\n83#1:137,2\n106#1:140,2\n120#1:143,2\n126#1:146,2\n83#1:139\n106#1:142\n120#1:145\n126#1:148\n*E\n"})
public final class ViewModelImpl {
    public final SynchronizedObject a;
    public final LinkedHashMap b;
    public final LinkedHashSet c;
    public volatile boolean d;

    public ViewModelImpl() {
        this.a = new SynchronizedObject();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashSet();
    }

    public ViewModelImpl(@NotNull CoroutineScope coroutineScope0) {
        Intrinsics.checkNotNullParameter(coroutineScope0, "viewModelScope");
        super();
        this.a = new SynchronizedObject();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashSet();
        this.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", CloseableCoroutineScopeKt.asCloseable(coroutineScope0));
    }

    public ViewModelImpl(@NotNull CoroutineScope coroutineScope0, @NotNull AutoCloseable[] arr_autoCloseable) {
        Intrinsics.checkNotNullParameter(coroutineScope0, "viewModelScope");
        Intrinsics.checkNotNullParameter(arr_autoCloseable, "closeables");
        super();
        this.a = new SynchronizedObject();
        this.b = new LinkedHashMap();
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        this.c = linkedHashSet0;
        this.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", CloseableCoroutineScopeKt.asCloseable(coroutineScope0));
        o.addAll(linkedHashSet0, arr_autoCloseable);
    }

    public ViewModelImpl(@NotNull AutoCloseable[] arr_autoCloseable) {
        Intrinsics.checkNotNullParameter(arr_autoCloseable, "closeables");
        super();
        this.a = new SynchronizedObject();
        this.b = new LinkedHashMap();
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        this.c = linkedHashSet0;
        o.addAll(linkedHashSet0, arr_autoCloseable);
    }

    public static void a(AutoCloseable autoCloseable0) {
        if(autoCloseable0 != null) {
            try {
                autoCloseable0.close();
            }
            catch(Exception exception0) {
                throw new RuntimeException(exception0);
            }
        }
    }

    public static final void access$closeWithRuntimeException(ViewModelImpl viewModelImpl0, AutoCloseable autoCloseable0) {
        viewModelImpl0.getClass();
        ViewModelImpl.a(autoCloseable0);
    }

    public final void addCloseable(@NotNull AutoCloseable autoCloseable0) {
        Intrinsics.checkNotNullParameter(autoCloseable0, "closeable");
        if(this.d) {
            ViewModelImpl.a(autoCloseable0);
            return;
        }
        synchronized(this.a) {
            this.c.add(autoCloseable0);
        }
    }

    public final void addCloseable(@NotNull String s, @NotNull AutoCloseable autoCloseable0) {
        AutoCloseable autoCloseable1;
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(autoCloseable0, "closeable");
        if(this.d) {
            ViewModelImpl.a(autoCloseable0);
            return;
        }
        synchronized(this.a) {
            autoCloseable1 = (AutoCloseable)this.b.put(s, autoCloseable0);
        }
        ViewModelImpl.a(autoCloseable1);
    }

    @MainThread
    public final void clear() {
        if(this.d) {
            return;
        }
        this.d = true;
        synchronized(this.a) {
            for(Object object0: this.b.values()) {
                ViewModelImpl.access$closeWithRuntimeException(this, ((AutoCloseable)object0));
            }
            for(Object object1: this.c) {
                ViewModelImpl.access$closeWithRuntimeException(this, ((AutoCloseable)object1));
            }
            this.c.clear();
        }
    }

    @Nullable
    public final AutoCloseable getCloseable(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "key");
        synchronized(this.a) {
            return (AutoCloseable)this.b.get(s);
        }
    }
}

