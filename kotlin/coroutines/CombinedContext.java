package kotlin.coroutines;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0017\u0012\u0006\u0010\u0004\u001A\u00020\u0001\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001A\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\t*\u00020\u00052\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0012\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u000E2\u0006\u0010\u000F\u001A\u00028\u00002\u0018\u0010\u0011\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001B\u0010\u0014\u001A\u00020\u00012\n\u0010\u000B\u001A\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0019\u001A\u00020\u00182\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001AJ\u000F\u0010\u001C\u001A\u00020\u001BH\u0016¢\u0006\u0004\b\u001C\u0010\u001DJ\u000F\u0010\u001F\u001A\u00020\u001EH\u0016¢\u0006\u0004\b\u001F\u0010 ¨\u0006!"}, d2 = {"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "left", "Lkotlin/coroutines/CoroutineContext$Element;", "element", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$Element;)V", "E", "Lkotlin/coroutines/CoroutineContext$Key;", "key", "get", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "minusKey", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.3")
@SourceDebugExtension({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
public final class CombinedContext implements Serializable, CoroutineContext {
    public final CoroutineContext a;
    public final Element b;

    public CombinedContext(@NotNull CoroutineContext coroutineContext0, @NotNull Element coroutineContext$Element0) {
        Intrinsics.checkNotNullParameter(coroutineContext0, "left");
        Intrinsics.checkNotNullParameter(coroutineContext$Element0, "element");
        super();
        this.a = coroutineContext0;
        this.b = coroutineContext$Element0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        CoroutineContext coroutineContext0;
        if(this != object0) {
            if(object0 instanceof CombinedContext) {
                ((CombinedContext)object0).getClass();
                int v = 2;
                CombinedContext combinedContext0 = (CombinedContext)object0;
                int v1;
                for(v1 = 2; true; ++v1) {
                    combinedContext0 = combinedContext0.a instanceof CombinedContext ? ((CombinedContext)combinedContext0.a) : null;
                    if(combinedContext0 == null) {
                        break;
                    }
                }
                CombinedContext combinedContext1 = this;
                while(true) {
                    combinedContext1 = combinedContext1.a instanceof CombinedContext ? ((CombinedContext)combinedContext1.a) : null;
                    if(combinedContext1 == null) {
                        break;
                    }
                    ++v;
                }
                if(v1 == v) {
                    for(CombinedContext combinedContext2 = this; true; combinedContext2 = (CombinedContext)coroutineContext0) {
                        if(!Intrinsics.areEqual(((CombinedContext)object0).get(combinedContext2.b.getKey()), combinedContext2.b)) {
                            return false;
                        }
                        coroutineContext0 = combinedContext2.a;
                        if(!(coroutineContext0 instanceof CombinedContext)) {
                            break;
                        }
                    }
                    Intrinsics.checkNotNull(coroutineContext0, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    return Intrinsics.areEqual(((CombinedContext)object0).get(((Element)coroutineContext0).getKey()), ((Element)coroutineContext0));
                }
            }
            return false;
        }
        return true;
    }

    @Override  // kotlin.coroutines.CoroutineContext
    public Object fold(Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "operation");
        return function20.invoke(this.a.fold(object0, function20), this.b);
    }

    @Override  // kotlin.coroutines.CoroutineContext
    @Nullable
    public Element get(@NotNull Key coroutineContext$Key0) {
        CoroutineContext coroutineContext0;
        Intrinsics.checkNotNullParameter(coroutineContext$Key0, "key");
        for(CombinedContext combinedContext0 = this; true; combinedContext0 = (CombinedContext)coroutineContext0) {
            Element coroutineContext$Element0 = combinedContext0.b.get(coroutineContext$Key0);
            if(coroutineContext$Element0 != null) {
                return coroutineContext$Element0;
            }
            coroutineContext0 = combinedContext0.a;
            if(!(coroutineContext0 instanceof CombinedContext)) {
                break;
            }
        }
        return coroutineContext0.get(coroutineContext$Key0);
    }

    @Override
    public int hashCode() {
        return this.b.hashCode() + this.a.hashCode();
    }

    @Override  // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull Key coroutineContext$Key0) {
        Intrinsics.checkNotNullParameter(coroutineContext$Key0, "key");
        CoroutineContext coroutineContext0 = this.b;
        Element coroutineContext$Element0 = ((Element)coroutineContext0).get(coroutineContext$Key0);
        CoroutineContext coroutineContext1 = this.a;
        if(coroutineContext$Element0 != null) {
            return coroutineContext1;
        }
        CoroutineContext coroutineContext2 = coroutineContext1.minusKey(coroutineContext$Key0);
        if(coroutineContext2 == coroutineContext1) {
            return this;
        }
        return coroutineContext2 != EmptyCoroutineContext.INSTANCE ? new CombinedContext(coroutineContext2, ((Element)coroutineContext0)) : coroutineContext0;
    }

    @Override  // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext0) {
        return DefaultImpls.plus(this, coroutineContext0);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("[");
        return a.b(']', ((String)this.fold("", kotlin.coroutines.a.w)), stringBuilder0);
    }
}

