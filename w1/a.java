package w1;

import androidx.collection.MutableScatterMap;
import androidx.compose.animation.SplineBasedDecayKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.DragGestureNode;
import androidx.compose.foundation.gestures.y;
import androidx.compose.material3.pulltorefresh.PullToRefreshState;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.KeyInfo;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.datastore.core.okio.OkioStorage;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import okio.Path;
import okio.internal.ResourceFileSystem;
import y0.a0;
import y0.x;
import ye.h;

public final class a extends Lambda implements Function0 {
    public final int w;
    public final Object x;

    public a(Object object0, int v) {
        this.w = v;
        this.x = object0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                return ((NestedScrollDispatcher)this.x).getScope$ui_release();
            }
            case 1: {
                return ((NestedScrollNode)this.x).b();
            }
            case 2: {
                ClassLoader classLoader0 = ResourceFileSystem.access$getClassLoader$p(((ResourceFileSystem)this.x));
                return ResourceFileSystem.access$toClasspathRoots(((ResourceFileSystem)this.x), classLoader0);
            }
            case 3: {
                return ((PullToRefreshState)this.x).getDistanceFraction();
            }
            case 4: {
                OkioStorage okioStorage0 = (OkioStorage)this.x;
                Path path0 = (Path)OkioStorage.access$getProducePath$p(okioStorage0).invoke();
                if(!path0.isAbsolute()) {
                    throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + OkioStorage.access$getProducePath$p(okioStorage0) + ", instead got " + path0).toString());
                }
                return path0.normalized();
            }
            case 5: {
                MutableScatterMap mutableScatterMap0 = ComposerKt.access$multiMap(((a0)this.x).a.size());
                List list0 = ((a0)this.x).a;
                int v = list0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    KeyInfo keyInfo0 = (KeyInfo)list0.get(v1);
                    Object object0 = ComposerKt.access$getJoinedKey(keyInfo0);
                    int v2 = mutableScatterMap0.findInsertIndex(object0);
                    Object object1 = v2 >= 0 ? null : mutableScatterMap0.values[v2];
                    if(object1 != null) {
                        if(TypeIntrinsics.isMutableList(object1)) {
                            Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.collections.MutableList<V of androidx.compose.runtime.MutableScatterMultiMap.put_impl$lambda$0>");
                            List list1 = TypeIntrinsics.asMutableList(object1);
                            list1.add(keyInfo0);
                            keyInfo0 = list1;
                        }
                        else {
                            keyInfo0 = CollectionsKt__CollectionsKt.mutableListOf(new Object[]{object1, keyInfo0});
                        }
                    }
                    if(v2 < 0) {
                        mutableScatterMap0.keys[~v2] = object0;
                        mutableScatterMap0.values[~v2] = keyInfo0;
                    }
                    else {
                        mutableScatterMap0.values[v2] = keyInfo0;
                    }
                }
                return new x(mutableScatterMap0);
            }
            case 6: {
                DescriptorRenderer descriptorRenderer0 = ((DescriptorRendererImpl)this.x).withOptions(h.w);
                Intrinsics.checkNotNull(descriptorRenderer0, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
                return (DescriptorRendererImpl)descriptorRenderer0;
            }
            case 7: {
                return Boolean.valueOf(!((DragGestureNode)this.x).startDragImmediately());
            }
            case 8: {
                DecayAnimationSpec decayAnimationSpec0 = SplineBasedDecayKt.splineBasedDecay(((Density)CompositionLocalConsumerModifierNodeKt.currentValueOf(((y)this.x), CompositionLocalsKt.getLocalDensity())));
                ((y)this.x).B.setFlingDecay(decayAnimationSpec0);
                return Unit.INSTANCE;
            }
            default: {
                ((SubcomposeLayoutState)this.x).forceRecomposeChildren$ui_release();
                return Unit.INSTANCE;
            }
        }
    }
}

