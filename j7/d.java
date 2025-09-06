package j7;

import android.graphics.Rect;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.FocusStrategy.BoundsAdapter;
import androidx.customview.widget.FocusStrategy.CollectionAdapter;
import com.google.android.gms.internal.common.zze;
import com.google.android.gms.stats.zzd;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.NativeSessionFileProvider;
import com.google.firebase.heartbeatinfo.HeartBeatConsumer;
import com.google.firebase.messaging.threads.ExecutorFactory;
import com.google.firebase.messaging.threads.ThreadPriority;
import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

public class d implements FocusStrategy.BoundsAdapter, FocusStrategy.CollectionAdapter, zze, com.google.android.gms.internal.stats.zze, zzd, Continuation, NativeSessionFileProvider, HeartBeatConsumer, ExecutorFactory, SourceFile, JavaResolverCache, ReceiverValue, ErrorReporter {
    public final int a;

    public d(int v) {
        this.a = v;
        super();
    }

    public static void a(int v) {
        Object[] arr_object = new Object[3];
        arr_object[0] = v == 1 ? "unresolvedSuperClasses" : "descriptor";
        arr_object[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
        arr_object[2] = v == 2 ? "reportCannotInferVisibility" : "reportIncompleteHierarchy";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter \'%s\' of %s.%s must not be null", arr_object));
    }

    public static void b(int v) {
        Object[] arr_object = new Object[3];
        switch(v) {
            case 1: {
                arr_object[0] = "member";
                break;
            }
            case 3: {
                arr_object[0] = "element";
                break;
            }
            case 5: {
                arr_object[0] = "field";
                break;
            }
            case 7: {
                arr_object[0] = "javaClass";
                break;
            }
            case 2: 
            case 4: 
            case 6: 
            case 8: {
                arr_object[0] = "descriptor";
                break;
            }
            default: {
                arr_object[0] = "fqName";
            }
        }
        arr_object[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
        switch(v) {
            case 1: 
            case 2: {
                arr_object[2] = "recordMethod";
                break;
            }
            case 3: 
            case 4: {
                arr_object[2] = "recordConstructor";
                break;
            }
            case 5: 
            case 6: {
                arr_object[2] = "recordField";
                break;
            }
            case 7: 
            case 8: {
                arr_object[2] = "recordClass";
                break;
            }
            default: {
                arr_object[2] = "getClassResolvedFromSource";
            }
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter \'%s\' of %s.%s must not be null", arr_object));
    }

    public float c(float f, float f1) {
        return 1.0f;
    }

    @Override  // com.google.firebase.messaging.threads.ExecutorFactory
    public void executeOneOff(String s, String s1, ThreadPriority threadPriority0, Runnable runnable0) {
        new Thread(runnable0, s1).start();
    }

    @Override  // androidx.customview.widget.FocusStrategy$CollectionAdapter
    public Object get(Object object0, int v) {
        return (AccessibilityNodeInfoCompat)((SparseArrayCompat)object0).valueAt(v);
    }

    @Override  // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
    public File getAppFile() {
        return null;
    }

    @Override  // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
    public File getBinaryImagesFile() {
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
    public ClassDescriptor getClassResolvedFromSource(FqName fqName0) {
        if(fqName0 != null) {
            return null;
        }
        d.b(0);
        throw null;
    }

    @Override  // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
    public File getDeviceFile() {
        return null;
    }

    @Override  // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
    public File getMetadataFile() {
        return null;
    }

    @Override  // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
    public File getMinidumpFile() {
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.SourceFile
    public String getName() {
        return null;
    }

    @Override  // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
    public File getOsFile() {
        return null;
    }

    @Override  // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
    public File getSessionFile() {
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
    public KotlinType getType() {
        switch(this.a) {
            case 2: {
                throw new IllegalStateException("This method should not be called");
            }
            case 3: {
                throw new IllegalStateException("This method should not be called");
            }
            default: {
                throw new IllegalStateException("This method should not be called");
            }
        }
    }

    @Override  // com.google.firebase.messaging.threads.ExecutorFactory
    public ScheduledExecutorService newScheduledThreadPool(int v, ThreadPriority threadPriority0) {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(v));
    }

    @Override  // com.google.firebase.messaging.threads.ExecutorFactory
    public ScheduledExecutorService newScheduledThreadPool(int v, ThreadFactory threadFactory0, ThreadPriority threadPriority0) {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(v, threadFactory0));
    }

    @Override  // com.google.firebase.messaging.threads.ExecutorFactory
    public ExecutorService newSingleThreadExecutor(ThreadPriority threadPriority0) {
        return this.newThreadPool(1, threadPriority0);
    }

    @Override  // com.google.firebase.messaging.threads.ExecutorFactory
    public ExecutorService newSingleThreadExecutor(ThreadFactory threadFactory0, ThreadPriority threadPriority0) {
        return this.newThreadPool(1, threadFactory0, threadPriority0);
    }

    @Override  // com.google.firebase.messaging.threads.ExecutorFactory
    public ExecutorService newThreadPool(int v, ThreadPriority threadPriority0) {
        return this.newThreadPool(v, Executors.defaultThreadFactory(), threadPriority0);
    }

    @Override  // com.google.firebase.messaging.threads.ExecutorFactory
    public ExecutorService newThreadPool(int v, ThreadFactory threadFactory0, ThreadPriority threadPriority0) {
        ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(v, v, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory0);
        threadPoolExecutor0.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor0);
    }

    @Override  // com.google.firebase.messaging.threads.ExecutorFactory
    public ExecutorService newThreadPool(ThreadPriority threadPriority0) {
        return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
    }

    @Override  // com.google.firebase.messaging.threads.ExecutorFactory
    public ExecutorService newThreadPool(ThreadFactory threadFactory0, ThreadPriority threadPriority0) {
        return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(threadFactory0));
    }

    @Override  // androidx.customview.widget.FocusStrategy$BoundsAdapter
    public void obtainBounds(Object object0, Rect rect0) {
        ((AccessibilityNodeInfoCompat)object0).getBoundsInParent(rect0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
    public void recordClass(JavaClass javaClass0, ClassDescriptor classDescriptor0) {
        if(javaClass0 != null) {
            if(classDescriptor0 != null) {
                return;
            }
            d.b(8);
            throw null;
        }
        d.b(7);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
    public void recordConstructor(JavaElement javaElement0, ConstructorDescriptor constructorDescriptor0) {
        if(javaElement0 != null) {
            if(constructorDescriptor0 != null) {
                return;
            }
            d.b(4);
            throw null;
        }
        d.b(3);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
    public void recordField(JavaField javaField0, PropertyDescriptor propertyDescriptor0) {
        if(javaField0 != null) {
            if(propertyDescriptor0 != null) {
                return;
            }
            d.b(6);
            throw null;
        }
        d.b(5);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
    public void recordMethod(JavaMember javaMember0, SimpleFunctionDescriptor simpleFunctionDescriptor0) {
        if(javaMember0 != null) {
            if(simpleFunctionDescriptor0 != null) {
                return;
            }
            d.b(2);
            throw null;
        }
        d.b(1);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
    public void reportCannotInferVisibility(CallableMemberDescriptor callableMemberDescriptor0) {
        if(callableMemberDescriptor0 != null) {
            return;
        }
        d.a(2);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
    public void reportIncompleteHierarchy(ClassDescriptor classDescriptor0, List list0) {
        if(classDescriptor0 != null) {
            if(list0 != null) {
                return;
            }
            d.a(1);
            throw null;
        }
        d.a(0);
        throw null;
    }

    @Override  // androidx.customview.widget.FocusStrategy$CollectionAdapter
    public int size(Object object0) {
        return ((SparseArrayCompat)object0).size();
    }

    @Override  // com.google.firebase.messaging.threads.ExecutorFactory
    public Future submitOneOff(String s, String s1, ThreadPriority threadPriority0, Runnable runnable0) {
        Future future0 = new FutureTask(runnable0, null);
        new Thread(((Runnable)future0), s1).start();
        return future0;
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public Object then(Task task0) {
        if(!task0.isSuccessful()) {
            Logger.getLogger().e("Error fetching settings.", task0.getException());
        }
        return null;
    }
}

