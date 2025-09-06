package androidx.compose.ui.platform;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u000E\u001A\u00020\u000B8F¢\u0006\u0006\u001A\u0004\b\f\u0010\r¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/platform/WeakCache;", "T", "", "<init>", "()V", "element", "", "push", "(Ljava/lang/Object;)V", "pop", "()Ljava/lang/Object;", "", "getSize", "()I", "size", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nWeakCache.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeakCache.android.kt\nandroidx/compose/ui/platform/WeakCache\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,77:1\n1208#2:78\n1187#2,2:79\n728#3,2:81\n48#3:83\n*S KotlinDebug\n*F\n+ 1 WeakCache.android.kt\nandroidx/compose/ui/platform/WeakCache\n*L\n29#1:78\n29#1:79,2\n38#1:81,2\n49#1:83\n*E\n"})
public final class WeakCache {
    public static final int $stable = 8;
    public final MutableVector a;
    public final ReferenceQueue b;

    public WeakCache() {
        this.a = new MutableVector(new Reference[16], 0);
        this.b = new ReferenceQueue();
    }

    public final int getSize() {
        MutableVector mutableVector0;
        do {
            Reference reference0 = this.b.poll();
            mutableVector0 = this.a;
            if(reference0 != null) {
                mutableVector0.remove(reference0);
            }
        }
        while(reference0 != null);
        return mutableVector0.getSize();
    }

    @Nullable
    public final Object pop() {
        MutableVector mutableVector0;
        do {
            Reference reference0 = this.b.poll();
            mutableVector0 = this.a;
            if(reference0 != null) {
                mutableVector0.remove(reference0);
            }
        }
        while(reference0 != null);
        while(mutableVector0.isNotEmpty()) {
            Object object0 = ((Reference)q.j(mutableVector0, 1)).get();
            if(object0 != null) {
                return object0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public final void push(Object object0) {
        MutableVector mutableVector0;
        ReferenceQueue referenceQueue0;
        do {
            referenceQueue0 = this.b;
            Reference reference0 = referenceQueue0.poll();
            mutableVector0 = this.a;
            if(reference0 != null) {
                mutableVector0.remove(reference0);
            }
        }
        while(reference0 != null);
        mutableVector0.add(new WeakReference(object0, referenceQueue0));
    }
}

