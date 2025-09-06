package a7;

import androidx.core.text.PrecomputedTextCompat;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zas;
import com.google.android.gms.internal.ads_identifier.zzh;
import com.google.android.gms.internal.base.zam;
import com.google.android.gms.internal.cloudmessaging.zzb;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.internal.ObjectConstructor;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedureCallbacks;

public class c implements zas, zzh, zam, zzb, Continuation, SuccessContinuation, ObjectConstructor, BiPredicate, Predicate, TypeCheckingProcedureCallbacks {
    public final int a;

    public c(int v) {
        this.a = v;
        super();
    }

    public static void a(int v) {
        Object[] arr_object = new Object[3];
        switch(v) {
            case 1: 
            case 4: {
                arr_object[0] = "b";
                break;
            }
            case 2: 
            case 7: {
                arr_object[0] = "typeCheckingProcedure";
                break;
            }
            case 8: {
                arr_object[0] = "type";
                break;
            }
            case 9: {
                arr_object[0] = "typeProjection";
                break;
            }
            case 5: 
            case 10: {
                arr_object[0] = "subtype";
                break;
            }
            case 6: 
            case 11: {
                arr_object[0] = "supertype";
                break;
            }
            default: {
                arr_object[0] = "a";
            }
        }
        arr_object[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch(v) {
            case 3: 
            case 4: {
                arr_object[2] = "assertEqualTypeConstructors";
                break;
            }
            case 5: 
            case 6: 
            case 7: {
                arr_object[2] = "assertSubtype";
                break;
            }
            case 8: 
            case 9: {
                arr_object[2] = "capture";
                break;
            }
            case 10: 
            case 11: {
                arr_object[2] = "noCorrespondingSupertype";
                break;
            }
            default: {
                arr_object[2] = "assertEqualTypes";
            }
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter \'%s\' of %s.%s must not be null", arr_object));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedureCallbacks
    public boolean assertEqualTypeConstructors(TypeConstructor typeConstructor0, TypeConstructor typeConstructor1) {
        if(typeConstructor0 != null) {
            if(typeConstructor1 != null) {
                return typeConstructor0.equals(typeConstructor1);
            }
            c.a(4);
            throw null;
        }
        c.a(3);
        throw null;
    }

    public boolean b(CharSequence charSequence0) {
        return charSequence0 instanceof PrecomputedTextCompat;
    }

    @Override  // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        switch(this.a) {
            case 13: {
                return new TreeSet();
            }
            case 14: {
                return new LinkedHashSet();
            }
            case 15: {
                return new ArrayDeque();
            }
            case 16: {
                return new ArrayList();
            }
            case 17: {
                return new ConcurrentSkipListMap();
            }
            case 18: {
                return new ConcurrentHashMap();
            }
            case 19: {
                return new TreeMap();
            }
            case 20: {
                return new LinkedHashMap();
            }
            default: {
                return new LinkedTreeMap();
            }
        }
    }

    @Override  // io.reactivex.functions.Predicate
    public boolean test(Object object0) {
        return this.a != 2;
    }

    @Override  // io.reactivex.functions.BiPredicate
    public boolean test(Object object0, Object object1) {
        return ObjectHelper.equals(object0, object1);
    }

    @Override  // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object object0) {
        Void void0 = (Void)object0;
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public Object then(Task task0) {
        if(this.a != 9) {
            return null;
        }
        if(!((Boolean)task0.getResult()).booleanValue()) {
            throw new ApiException(new Status(13, "listener already unregistered"));
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.base.zam
    public ExecutorService zaa(ThreadFactory threadFactory0, int v) {
        return this.zac(1, threadFactory0, 1);
    }

    @Override  // com.google.android.gms.internal.base.zam
    public ExecutorService zab(int v, int v1) {
        return this.zac(4, Executors.defaultThreadFactory(), 2);
    }

    @Override  // com.google.android.gms.internal.base.zam
    public ExecutorService zac(int v, ThreadFactory threadFactory0, int v1) {
        ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(v, v, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory0);
        threadPoolExecutor0.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor0);
    }
}

