package androidx.compose.ui.text.font;

import aa.o;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.caches.LruCache;
import androidx.compose.ui.text.platform.Synchronization_jvmKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0005\u001A\u00020\u00042\u001E\u0010\t\u001A\u001A\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000B\u0010\fJ/\u0010\u000F\u001A\u00020\b2\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00040\r2\u0012\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000F\u0010\u0010J\u0019\u0010\u0013\u001A\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001A\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u001A\u0010\u0019\u001A\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001D\u001A\u00020\u001A8@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u001C¨\u0006\u001E"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceRequestCache;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/TypefaceRequest;", "typefaceRequest", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult;", "", "resolveTypeface", "Landroidx/compose/runtime/State;", "runCached", "(Landroidx/compose/ui/text/font/TypefaceRequest;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/State;", "", "typefaceRequests", "preWarmCache", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "get$ui_text_release", "(Landroidx/compose/ui/text/font/TypefaceRequest;)Landroidx/compose/ui/text/font/TypefaceResult;", "get", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "a", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "getLock$ui_text_release", "()Landroidx/compose/ui/text/platform/SynchronizedObject;", "lock", "", "getSize$ui_text_release", "()I", "size", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFontFamilyResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n*L\n1#1,256:1\n26#2:257\n26#2:258\n26#2:259\n26#2:260\n26#2:261\n26#2:262\n*S KotlinDebug\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache\n*L\n172#1:257\n209#1:258\n226#1:259\n239#1:260\n246#1:261\n252#1:262\n*E\n"})
public final class TypefaceRequestCache {
    public static final int $stable = 8;
    public final SynchronizedObject a;
    public final LruCache b;

    public TypefaceRequestCache() {
        this.a = Synchronization_jvmKt.createSynchronizedObject();
        this.b = new LruCache(16);
    }

    @Nullable
    public final TypefaceResult get$ui_text_release(@NotNull TypefaceRequest typefaceRequest0) {
        synchronized(this.a) {
            return (TypefaceResult)this.b.get(typefaceRequest0);
        }
    }

    @NotNull
    public final SynchronizedObject getLock$ui_text_release() {
        return this.a;
    }

    public final int getSize$ui_text_release() {
        synchronized(this.a) {
        }
        return this.b.size();
    }

    public final void preWarmCache(@NotNull List list0, @NotNull Function1 function10) {
        TypefaceResult typefaceResult1;
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            TypefaceRequest typefaceRequest0 = (TypefaceRequest)list0.get(v1);
            synchronized(this.a) {
                TypefaceResult typefaceResult0 = (TypefaceResult)this.b.get(typefaceRequest0);
            }
            if(typefaceResult0 == null) {
                try {
                    typefaceResult1 = (TypefaceResult)function10.invoke(typefaceRequest0);
                }
                catch(Exception exception0) {
                    throw new IllegalStateException("Could not load font", exception0);
                }
                if(!(typefaceResult1 instanceof Async)) {
                    synchronized(this.a) {
                        TypefaceResult typefaceResult2 = (TypefaceResult)this.b.put(typefaceRequest0, typefaceResult1);
                    }
                }
            }
        }
    }

    @NotNull
    public final State runCached(@NotNull TypefaceRequest typefaceRequest0, @NotNull Function1 function10) {
        State state1;
        synchronized(this.a) {
            State state0 = (TypefaceResult)this.b.get(typefaceRequest0);
            if(state0 != null) {
                if(((TypefaceResult)state0).getCacheable()) {
                    return state0;
                }
                TypefaceResult typefaceResult0 = (TypefaceResult)this.b.remove(typefaceRequest0);
            }
        }
        try {
            state1 = (TypefaceResult)function10.invoke(new o(26, this, typefaceRequest0));
        }
        catch(Exception exception0) {
            throw new IllegalStateException("Could not load font", exception0);
        }
        synchronized(this.a) {
            if(this.b.get(typefaceRequest0) == null && ((TypefaceResult)state1).getCacheable()) {
                this.b.put(typefaceRequest0, state1);
            }
            return state1;
        }
    }
}

