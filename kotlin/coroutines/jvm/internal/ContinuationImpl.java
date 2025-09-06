package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b!\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0010\u0010\u0002\u001A\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005B!\u0012\u0010\u0010\u0002\u001A\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000E\u0010\f\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003J\b\u0010\r\u001A\u00020\u000EH\u0014R\u0010\u0010\u0006\u001A\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001A\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\n\u0010\u000BR\u0018\u0010\f\u001A\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003X\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006\u000F"}, d2 = {"Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "completion", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/coroutines/Continuation;)V", "_context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/CoroutineContext;)V", "context", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "intercepted", "releaseIntercepted", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.3")
@SourceDebugExtension({"SMAP\nContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContinuationImpl.kt\nkotlin/coroutines/jvm/internal/ContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
public abstract class ContinuationImpl extends BaseContinuationImpl {
    @Nullable
    private final CoroutineContext _context;
    @Nullable
    private transient Continuation intercepted;

    public ContinuationImpl(@Nullable Continuation continuation0) {
        this(continuation0, (continuation0 == null ? null : continuation0.getContext()));
    }

    public ContinuationImpl(@Nullable Continuation continuation0, @Nullable CoroutineContext coroutineContext0) {
        super(continuation0);
        this._context = coroutineContext0;
    }

    @Override  // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        Intrinsics.checkNotNull(this._context);
        return this._context;
    }

    @NotNull
    public final Continuation intercepted() {
        Continuation continuation0 = this.intercepted;
        if(continuation0 == null) {
            ContinuationInterceptor continuationInterceptor0 = (ContinuationInterceptor)this.getContext().get(ContinuationInterceptor.Key);
            if(continuationInterceptor0 == null) {
                continuation0 = this;
            }
            else {
                continuation0 = continuationInterceptor0.interceptContinuation(this);
                if(continuation0 == null) {
                    continuation0 = this;
                }
            }
            this.intercepted = continuation0;
        }
        return continuation0;
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        Continuation continuation0 = this.intercepted;
        if(continuation0 != null && continuation0 != this) {
            Element coroutineContext$Element0 = this.getContext().get(ContinuationInterceptor.Key);
            Intrinsics.checkNotNull(coroutineContext$Element0);
            ((ContinuationInterceptor)coroutineContext$Element0).releaseInterceptedContinuation(continuation0);
        }
        this.intercepted = CompletedContinuation.INSTANCE;
    }
}

