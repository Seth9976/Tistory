package androidx.compose.ui.graphics.layer;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.ui.graphics.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\n\u001A\u00020\u00062\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00060\bH\u0086\b¢\u0006\u0004\b\n\u0010\u000BJ\u0015\u0010\u000E\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u0005¢\u0006\u0004\b\u000E\u0010\u000FJ$\u0010\u0010\u001A\u00020\u00062\u0012\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "", "onDependencyRemoved", "Lkotlin/Function0;", "block", "withTracking", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "graphicsLayer", "", "onDependencyAdded", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)Z", "removeDependencies", "(Lkotlin/jvm/functions/Function1;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nChildLayerDependenciesTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChildLayerDependenciesTracker.kt\nandroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/graphics/InlineClassHelperKt\n*L\n1#1,117:1\n267#2,4:118\n237#2,7:122\n248#2,3:130\n251#2,2:134\n272#2,2:136\n254#2,6:138\n274#2:144\n267#2,4:152\n237#2,7:156\n248#2,3:164\n251#2,2:168\n272#2,2:170\n254#2,6:172\n274#2:178\n1810#3:129\n1672#3:133\n1810#3:163\n1672#3:167\n33#4,7:145\n*S KotlinDebug\n*F\n+ 1 ChildLayerDependenciesTracker.kt\nandroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker\n*L\n63#1:118,4\n63#1:122,7\n63#1:130,3\n63#1:134,2\n63#1:136,2\n63#1:138,6\n63#1:144\n112#1:152,4\n112#1:156,7\n112#1:164,3\n112#1:168,2\n112#1:170,2\n112#1:172,6\n112#1:178\n63#1:129\n63#1:133\n112#1:163\n112#1:167\n73#1:145,7\n*E\n"})
public final class ChildLayerDependenciesTracker {
    public GraphicsLayer a;
    public GraphicsLayer b;
    public MutableScatterSet c;
    public MutableScatterSet d;
    public boolean e;

    public final boolean onDependencyAdded(@NotNull GraphicsLayer graphicsLayer0) {
        if(!this.e) {
            InlineClassHelperKt.throwIllegalArgumentException("Only add dependencies during a tracking");
        }
        MutableScatterSet mutableScatterSet0 = this.c;
        if(mutableScatterSet0 != null) {
            Intrinsics.checkNotNull(mutableScatterSet0);
            mutableScatterSet0.add(graphicsLayer0);
        }
        else if(this.a == null) {
            this.a = graphicsLayer0;
        }
        else {
            MutableScatterSet mutableScatterSet1 = ScatterSetKt.mutableScatterSetOf();
            GraphicsLayer graphicsLayer1 = this.a;
            Intrinsics.checkNotNull(graphicsLayer1);
            mutableScatterSet1.add(graphicsLayer1);
            mutableScatterSet1.add(graphicsLayer0);
            this.c = mutableScatterSet1;
            this.a = null;
        }
        MutableScatterSet mutableScatterSet2 = this.d;
        if(mutableScatterSet2 != null) {
            Intrinsics.checkNotNull(mutableScatterSet2);
            return !mutableScatterSet2.remove(graphicsLayer0);
        }
        if(this.b != graphicsLayer0) {
            return true;
        }
        this.b = null;
        return false;
    }

    public final void removeDependencies(@NotNull Function1 function10) {
        GraphicsLayer graphicsLayer0 = this.a;
        if(graphicsLayer0 != null) {
            function10.invoke(graphicsLayer0);
            this.a = null;
        }
        MutableScatterSet mutableScatterSet0 = this.c;
        if(mutableScatterSet0 != null) {
            Object[] arr_object = mutableScatterSet0.elements;
            long[] arr_v = mutableScatterSet0.metadata;
            int v = arr_v.length - 2;
            if(v >= 0) {
                for(int v1 = 0; true; ++v1) {
                    long v2 = arr_v[v1];
                    if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                        int v3 = 8 - (~(v1 - v) >>> 0x1F);
                        for(int v4 = 0; v4 < v3; ++v4) {
                            if((0xFFL & v2) < 0x80L) {
                                function10.invoke(arr_object[(v1 << 3) + v4]);
                            }
                            v2 >>= 8;
                        }
                        if(v3 != 8) {
                            mutableScatterSet0.clear();
                            return;
                        }
                    }
                    if(v1 == v) {
                        break;
                    }
                }
                mutableScatterSet0.clear();
                return;
            }
            mutableScatterSet0.clear();
        }
    }

    public final void withTracking(@NotNull Function1 function10, @NotNull Function0 function00) {
        this.b = this.a;
        MutableScatterSet mutableScatterSet0 = this.c;
        if(mutableScatterSet0 != null && mutableScatterSet0.isNotEmpty()) {
            MutableScatterSet mutableScatterSet1 = this.d;
            if(mutableScatterSet1 == null) {
                mutableScatterSet1 = ScatterSetKt.mutableScatterSetOf();
                this.d = mutableScatterSet1;
            }
            mutableScatterSet1.addAll(mutableScatterSet0);
            mutableScatterSet0.clear();
        }
        this.e = true;
        function00.invoke();
        this.e = false;
        GraphicsLayer graphicsLayer0 = this.b;
        if(graphicsLayer0 != null) {
            function10.invoke(graphicsLayer0);
        }
        MutableScatterSet mutableScatterSet2 = this.d;
        if(mutableScatterSet2 != null && mutableScatterSet2.isNotEmpty()) {
            Object[] arr_object = mutableScatterSet2.elements;
            long[] arr_v = mutableScatterSet2.metadata;
            int v = arr_v.length - 2;
            if(v >= 0) {
                for(int v1 = 0; true; ++v1) {
                    long v2 = arr_v[v1];
                    if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                        int v3 = 8 - (~(v1 - v) >>> 0x1F);
                        for(int v4 = 0; v4 < v3; ++v4) {
                            if((0xFFL & v2) < 0x80L) {
                                function10.invoke(arr_object[(v1 << 3) + v4]);
                            }
                            v2 >>= 8;
                        }
                        if(v3 != 8) {
                            mutableScatterSet2.clear();
                            return;
                        }
                    }
                    if(v1 == v) {
                        break;
                    }
                }
                mutableScatterSet2.clear();
                return;
            }
            mutableScatterSet2.clear();
        }
    }
}

