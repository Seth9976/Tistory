package kotlin.reflect.jvm.internal.impl.storage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class LockBasedStorageManager implements StorageManager {
    public interface ExceptionHandlingStrategy {
        public static final ExceptionHandlingStrategy THROW;

        static {
            ExceptionHandlingStrategy.THROW = new f();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @NotNull
        RuntimeException handleException(@NotNull Throwable arg1);
    }

    public static final StorageManager NO_LOCKS;
    public final ExceptionHandlingStrategy a;
    public final String b;
    public static final String c;
    protected final SimpleLock lock;

    static {
        LockBasedStorageManager.c = StringsKt__StringsKt.substringBeforeLast(LockBasedStorageManager.class.getCanonicalName(), ".", "");
        LockBasedStorageManager.NO_LOCKS = new a("NO_LOCKS", ExceptionHandlingStrategy.THROW, EmptySimpleLock.INSTANCE);  // 初始化器: Lkotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager;-><init>(Ljava/lang/String;Lkotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy;Lkotlin/reflect/jvm/internal/impl/storage/SimpleLock;)V
    }

    public LockBasedStorageManager(String s) {
        this(s, null, null);
    }

    public LockBasedStorageManager(String s, @Nullable Runnable runnable0, @Nullable Function1 function10) {
        DefaultSimpleLock defaultSimpleLock0 = SimpleLock.Companion.simpleLock(runnable0, function10);
        this(s, ExceptionHandlingStrategy.THROW, defaultSimpleLock0);
    }

    public LockBasedStorageManager(String s, ExceptionHandlingStrategy lockBasedStorageManager$ExceptionHandlingStrategy0, SimpleLock simpleLock0) {
        if(s != null) {
            if(lockBasedStorageManager$ExceptionHandlingStrategy0 != null) {
                if(simpleLock0 != null) {
                    super();
                    this.lock = simpleLock0;
                    this.a = lockBasedStorageManager$ExceptionHandlingStrategy0;
                    this.b = s;
                    return;
                }
                LockBasedStorageManager.a(6);
                throw null;
            }
            LockBasedStorageManager.a(5);
            throw null;
        }
        LockBasedStorageManager.a(4);
        throw null;
    }

    public static void a(int v) {
        Object[] arr_object = new Object[(v == 10 || v == 13 || v == 20 || v == 37 ? 2 : 3)];
        if(v == 1 || v == 3) {
            arr_object[0] = "exceptionHandlingStrategy";
        }
        else {
            switch(v) {
                case 6: {
                    arr_object[0] = "lock";
                    break;
                }
                case 5: 
                case 8: {
                    arr_object[0] = "exceptionHandlingStrategy";
                    break;
                }
                case 9: 
                case 11: 
                case 14: 
                case 16: 
                case 19: 
                case 21: {
                    arr_object[0] = "compute";
                    break;
                }
                case 15: 
                case 18: 
                case 22: {
                    arr_object[0] = "map";
                    break;
                }
                case 12: 
                case 17: 
                case 25: 
                case 27: {
                    arr_object[0] = "onRecursiveCall";
                    break;
                }
                case 29: 
                case 33: {
                    arr_object[0] = "postCompute";
                    break;
                }
                case 23: 
                case 24: 
                case 26: 
                case 28: 
                case 30: 
                case 0x1F: 
                case 0x20: 
                case 34: {
                    arr_object[0] = "computable";
                    break;
                }
                case 35: {
                    arr_object[0] = "source";
                    break;
                }
                case 36: {
                    arr_object[0] = "throwable";
                    break;
                }
                case 10: 
                case 13: 
                case 20: 
                case 37: {
                    arr_object[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                    break;
                }
                default: {
                    arr_object[0] = "debugText";
                }
            }
        }
        switch(v) {
            case 10: 
            case 13: {
                arr_object[1] = "createMemoizedFunction";
                break;
            }
            case 20: {
                arr_object[1] = "createMemoizedFunctionWithNullableValues";
                break;
            }
            case 37: {
                arr_object[1] = "sanitizeStackTrace";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
            }
        }
        switch(v) {
            case 4: 
            case 5: 
            case 6: {
                arr_object[2] = "<init>";
                break;
            }
            case 7: 
            case 8: {
                arr_object[2] = "replaceExceptionHandling";
                break;
            }
            case 9: 
            case 11: 
            case 12: 
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: {
                arr_object[2] = "createMemoizedFunction";
                break;
            }
            case 19: 
            case 21: 
            case 22: {
                arr_object[2] = "createMemoizedFunctionWithNullableValues";
                break;
            }
            case 23: 
            case 24: 
            case 25: {
                arr_object[2] = "createLazyValue";
                break;
            }
            case 26: 
            case 27: {
                arr_object[2] = "createRecursionTolerantLazyValue";
                break;
            }
            case 28: 
            case 29: {
                arr_object[2] = "createLazyValueWithPostCompute";
                break;
            }
            case 30: {
                arr_object[2] = "createNullableLazyValue";
                break;
            }
            case 0x1F: {
                arr_object[2] = "createRecursionTolerantNullableLazyValue";
                break;
            }
            case 0x20: 
            case 33: {
                arr_object[2] = "createNullableLazyValueWithPostCompute";
                break;
            }
            case 34: {
                arr_object[2] = "compute";
                break;
            }
            case 35: {
                arr_object[2] = "recursionDetectedDefault";
                break;
            }
            case 36: {
                arr_object[2] = "sanitizeStackTrace";
                break;
            }
            case 10: 
            case 13: 
            case 20: 
            case 37: {
                break;
            }
            default: {
                arr_object[2] = "createWithExceptionHandling";
            }
        }
        String s = String.format((v == 10 || v == 13 || v == 20 || v == 37 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 10 || v == 13 || v == 20 || v == 37 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    public static void b(AssertionError assertionError0) {
        StackTraceElement[] arr_stackTraceElement = assertionError0.getStackTrace();
        int v;
        for(v = 0; true; ++v) {
            if(v >= arr_stackTraceElement.length) {
                v = -1;
                break;
            }
            if(!arr_stackTraceElement[v].getClassName().startsWith(LockBasedStorageManager.c)) {
                break;
            }
        }
        List list0 = Arrays.asList(arr_stackTraceElement).subList(v, arr_stackTraceElement.length);
        assertionError0.setStackTrace(((StackTraceElement[])list0.toArray(new StackTraceElement[list0.size()])));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public Object compute(@NotNull Function0 function00) {
        Object object0;
        if(function00 != null) {
            this.lock.lock();
            try {
                object0 = function00.invoke();
            }
            catch(Throwable throwable0) {
                try {
                    throw this.a.handleException(throwable0);
                }
                catch(Throwable throwable1) {
                    this.lock.unlock();
                    throw throwable1;
                }
            }
            this.lock.unlock();
            return object0;
        }
        LockBasedStorageManager.a(34);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public CacheWithNotNullValues createCacheWithNotNullValues() {
        return new d(this, new ConcurrentHashMap(3, 1.0f, 2));  // 初始化器: Lkotlin/reflect/jvm/internal/impl/storage/e;-><init>(Lkotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager;Ljava/util/concurrent/ConcurrentHashMap;)V
    }

    @Override  // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public CacheWithNullableValues createCacheWithNullableValues() {
        return new e(this, new ConcurrentHashMap(3, 1.0f, 2));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public NotNullLazyValue createLazyValue(@NotNull Function0 function00) {
        if(function00 != null) {
            return new i(this, function00);
        }
        LockBasedStorageManager.a(23);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public NotNullLazyValue createLazyValueWithPostCompute(@NotNull Function0 function00, Function1 function10, @NotNull Function1 function11) {
        if(function00 != null) {
            if(function11 != null) {
                return new c(this, function00, function10, function11);
            }
            LockBasedStorageManager.a(29);
            throw null;
        }
        LockBasedStorageManager.a(28);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public MemoizedFunctionToNotNull createMemoizedFunction(@NotNull Function1 function10) {
        if(function10 != null) {
            MemoizedFunctionToNotNull memoizedFunctionToNotNull0 = this.createMemoizedFunction(function10, new ConcurrentHashMap(3, 1.0f, 2));
            if(memoizedFunctionToNotNull0 != null) {
                return memoizedFunctionToNotNull0;
            }
            LockBasedStorageManager.a(10);
            throw null;
        }
        LockBasedStorageManager.a(9);
        throw null;
    }

    @NotNull
    public MemoizedFunctionToNotNull createMemoizedFunction(@NotNull Function1 function10, @NotNull ConcurrentMap concurrentMap0) {
        if(function10 != null) {
            if(concurrentMap0 != null) {
                if(function10 != null) {
                    return new k(this, concurrentMap0, function10);  // 初始化器: Lkotlin/reflect/jvm/internal/impl/storage/j;-><init>(Lkotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager;Ljava/util/concurrent/ConcurrentMap;Lkotlin/jvm/functions/Function1;)V
                }
                k.a(2);
                throw null;
            }
            LockBasedStorageManager.a(15);
            throw null;
        }
        LockBasedStorageManager.a(14);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public MemoizedFunctionToNullable createMemoizedFunctionWithNullableValues(@NotNull Function1 function10) {
        if(function10 != null) {
            MemoizedFunctionToNullable memoizedFunctionToNullable0 = this.createMemoizedFunctionWithNullableValues(function10, new ConcurrentHashMap(3, 1.0f, 2));
            if(memoizedFunctionToNullable0 != null) {
                return memoizedFunctionToNullable0;
            }
            LockBasedStorageManager.a(20);
            throw null;
        }
        LockBasedStorageManager.a(19);
        throw null;
    }

    @NotNull
    public MemoizedFunctionToNullable createMemoizedFunctionWithNullableValues(@NotNull Function1 function10, @NotNull ConcurrentMap concurrentMap0) {
        if(function10 != null) {
            if(concurrentMap0 != null) {
                return new j(this, concurrentMap0, function10);
            }
            LockBasedStorageManager.a(22);
            throw null;
        }
        LockBasedStorageManager.a(21);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public NullableLazyValue createNullableLazyValue(@NotNull Function0 function00) {
        if(function00 != null) {
            return new h(this, function00);
        }
        LockBasedStorageManager.a(30);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public NotNullLazyValue createRecursionTolerantLazyValue(@NotNull Function0 function00, @NotNull Object object0) {
        if(function00 != null) {
            if(object0 != null) {
                return new b(this, function00, object0);
            }
            LockBasedStorageManager.a(27);
            throw null;
        }
        LockBasedStorageManager.a(26);
        throw null;
    }

    @NotNull
    public m recursionDetectedDefault(@NotNull String s, Object object0) {
        if(s != null) {
            AssertionError assertionError0 = new AssertionError("Recursion detected " + s + (object0 == null ? "" : "on input: " + object0) + " under " + this);
            LockBasedStorageManager.b(assertionError0);
            throw assertionError0;
        }
        LockBasedStorageManager.a(35);
        throw null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.getClass().getSimpleName());
        stringBuilder0.append("@");
        stringBuilder0.append(Integer.toHexString(this.hashCode()));
        stringBuilder0.append(" (");
        return r0.a.o(stringBuilder0, this.b, ")");
    }
}

