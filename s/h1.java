package s;

import android.graphics.Picture;
import androidx.arch.core.util.Function;
import androidx.compose.animation.SharedElement;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.foundation.BasicTooltipState;
import androidx.compose.foundation.BasicTooltip_androidKt.BasicTooltipBox.2.1.invoke..inlined.onDispose.1;
import androidx.compose.foundation.ClickableNode;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.content.ReceiveContentNode;
import androidx.compose.foundation.content.internal.DragAndDropRequestPermission_androidKt;
import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.SnapshotMutableDoubleStateImpl;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import androidx.compose.runtime.SnapshotMutableLongStateImpl;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.GroupComponent;
import androidx.compose.ui.graphics.vector.VNode;
import androidx.compose.ui.graphics.vector.VectorComponent;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Density;
import androidx.datastore.core.DataStoreImpl;
import androidx.datastore.core.Final;
import androidx.datastore.core.MultiProcessCoordinator;
import androidx.paging.AccessorState.PendingRequest;
import androidx.paging.CachedPageEventFlow;
import androidx.paging.LoadType;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLoadingKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import md.b;
import okio.ForwardingFileSystem;
import okio.Path;
import x1.p;
import y.a;
import y0.j;

public final class h1 extends Lambda implements Function1 {
    public final int w;
    public final Object x;

    public h1(Object object0, int v) {
        this.w = v;
        this.x = object0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                SharedElement sharedElement0 = (SharedElement)object0;
                ((SharedElement)this.x).updateMatch();
                return Unit.INSTANCE;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((AccessorState.PendingRequest)object0), "it");
                return ((AccessorState.PendingRequest)object0).getLoadType() == ((LoadType)this.x);
            }
            case 2: {
                Throwable throwable0 = (Throwable)object0;
                ((CachedPageEventFlow)this.x).b.tryEmit(null);
                return Unit.INSTANCE;
            }
            case 3: {
                Intrinsics.checkNotNullParameter(((List)object0), "list");
                ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(((List)object0), 10));
                for(Object object1: ((List)object0)) {
                    arrayList0.add(((Function)this.x).apply(object1));
                }
                return arrayList0;
            }
            case 4: {
                Intrinsics.checkNotNullParameter(((JavaMethod)object0), "m");
                return !((Boolean)ClassDeclaredMemberIndex.access$getMemberFilter$p(((ClassDeclaredMemberIndex)this.x)).invoke(((JavaMethod)object0))).booleanValue() || JavaLoadingKt.isObjectMethodInInterface(((JavaMethod)object0)) ? false : true;
            }
            case 5: {
                Intrinsics.checkNotNullParameter(((KotlinTypeRefiner)object0), "it");
                LazyJavaClassDescriptor lazyJavaClassDescriptor0 = (LazyJavaClassDescriptor)this.x;
                LazyJavaResolverContext lazyJavaResolverContext0 = LazyJavaClassDescriptor.access$getC$p(lazyJavaClassDescriptor0);
                JavaClass javaClass0 = lazyJavaClassDescriptor0.getJClass();
                return LazyJavaClassDescriptor.access$getAdditionalSupertypeClassDescriptor$p(lazyJavaClassDescriptor0) == null ? new LazyJavaClassMemberScope(lazyJavaResolverContext0, lazyJavaClassDescriptor0, javaClass0, false, LazyJavaClassDescriptor.access$getUnsubstitutedMemberScope$p(lazyJavaClassDescriptor0)) : new LazyJavaClassMemberScope(lazyJavaResolverContext0, lazyJavaClassDescriptor0, javaClass0, true, LazyJavaClassDescriptor.access$getUnsubstitutedMemberScope$p(lazyJavaClassDescriptor0));
            }
            case 6: {
                ((SeekableTransitionState)this.x).l = ((Number)object0).longValue();
                return Unit.INSTANCE;
            }
            case 7: {
                ((Painter)this.x).onDraw(((DrawScope)object0));
                return Unit.INSTANCE;
            }
            case 8: {
                DisposableEffectScope disposableEffectScope0 = (DisposableEffectScope)object0;
                return new BasicTooltip_androidKt.BasicTooltipBox.2.1.invoke..inlined.onDispose.1(((BasicTooltipState)this.x));
            }
            case 9: {
                ClickableNode clickableNode0 = (ClickableNode)this.x;
                if(clickableNode0.getEnabled()) {
                    clickableNode0.getOnClick().invoke();
                }
                return Unit.INSTANCE;
            }
            case 10: {
                float f = ((Number)object0).floatValue();
                ScrollState scrollState0 = (ScrollState)this.x;
                float f1 = scrollState0.e + (((float)scrollState0.getValue()) + f);
                float f2 = c.coerceIn(f1, 0.0f, scrollState0.getMaxValue());
                float f3 = f2 - ((float)scrollState0.getValue());
                int v = Math.round(f3);
                ScrollState.access$setValue(scrollState0, scrollState0.getValue() + v);
                scrollState0.e = f3 - ((float)v);
                if(f1 != f2) {
                    f = f3;
                }
                return f;
            }
            case 11: {
                ((GroupComponent)this.x).b(((VNode)object0));
                Function1 function10 = ((GroupComponent)this.x).getInvalidateListener$ui_release();
                if(function10 != null) {
                    function10.invoke(((VNode)object0));
                }
                return Unit.INSTANCE;
            }
            case 12: {
                VNode vNode0 = (VNode)object0;
                VectorComponent.access$doInvalidate(((VectorComponent)this.x));
                return Unit.INSTANCE;
            }
            case 13: {
                ((LayoutNode)this.x).setDensity(((Density)object0));
                return Unit.INSTANCE;
            }
            case 14: {
                Intrinsics.checkNotNullParameter(((CallableMemberDescriptor)object0), "it");
                KotlinType kotlinType0 = ((ValueParameterDescriptor)((CallableMemberDescriptor)object0).getValueParameters().get(((ValueParameterDescriptor)this.x).getIndex())).getType();
                Intrinsics.checkNotNullExpressionValue(kotlinType0, "it.valueParameters[p.index].type");
                return kotlinType0;
            }
            case 15: {
                Throwable throwable1 = (Throwable)object0;
                ReceiveChannel[] arr_receiveChannel = (ReceiveChannel[])this.x;
                Throwable throwable2 = null;
                for(int v1 = 0; v1 < arr_receiveChannel.length; ++v1) {
                    ReceiveChannel receiveChannel0 = arr_receiveChannel[v1];
                    try {
                        ChannelsKt.cancelConsumed(receiveChannel0, throwable1);
                    }
                    catch(Throwable throwable3) {
                        if(throwable2 == null) {
                            throwable2 = throwable3;
                        }
                        else {
                            b.addSuppressed(throwable2, throwable3);
                        }
                    }
                }
                if(throwable2 != null) {
                    throw throwable2;
                }
                return Unit.INSTANCE;
            }
            case 16: {
                DragAndDropRequestPermission_androidKt.dragAndDropRequestPermission(((ReceiveContentNode)this.x), ((DragAndDropEvent)object0));
                return Unit.INSTANCE;
            }
            case 17: {
                Intrinsics.checkNotNullParameter(((Path)object0), "it");
                return ((ForwardingFileSystem)this.x).onPathResult(((Path)object0), "listRecursively");
            }
            case 18: {
                DisposableEffectScope disposableEffectScope1 = (DisposableEffectScope)object0;
                return new androidx.compose.material3.internal.BasicTooltip_androidKt.BasicTooltipBox.2.1.invoke..inlined.onDispose.1(((TooltipState)this.x));
            }
            case 19: {
                DataStoreImpl dataStoreImpl0 = (DataStoreImpl)this.x;
                if(((Throwable)object0) != null) {
                    dataStoreImpl0.g.tryUpdate(new Final(((Throwable)object0)));
                }
                if(DataStoreImpl.access$getStorageConnectionDelegate$p(dataStoreImpl0).isInitialized()) {
                    dataStoreImpl0.getStorageConnection$datastore_core_release().close();
                }
                return Unit.INSTANCE;
            }
            case 20: {
                Intrinsics.checkNotNullParameter(((File)object0), "it");
                return new MultiProcessCoordinator(((CoroutineScope)this.x).getCoroutineContext(), ((File)object0));
            }
            case 21: {
                p p0 = (p)this.x;
                CancellableContinuationImpl cancellableContinuationImpl0 = p0.c;
                if(cancellableContinuationImpl0 != null) {
                    cancellableContinuationImpl0.cancel(((Throwable)object0));
                }
                p0.c = null;
                return Unit.INSTANCE;
            }
            case 22: {
                return (Boolean)((y.c)this.x).p.invoke(((DragAndDropEvent)object0));
            }
            case 23: {
                Picture picture0 = ((a)this.x).a;
                if(picture0 == null) {
                    throw new IllegalArgumentException("No cached drag shadow. Check if Modifier.cacheDragShadow(painter) was called.");
                }
                AndroidCanvas_androidKt.getNativeCanvas(((DrawScope)object0).getDrawContext().getCanvas()).drawPicture(picture0);
                return Unit.INSTANCE;
            }
            case 24: {
                Throwable throwable4 = (Throwable)object0;
                androidx.compose.runtime.a.b.removeFrameCallback(((j)this.x));
                return Unit.INSTANCE;
            }
            case 25: {
                ((ControlledComposition)this.x).recordReadOf(object0);
                return Unit.INSTANCE;
            }
            case 26: {
                ((SnapshotMutableDoubleStateImpl)this.x).setDoubleValue(((Number)object0).doubleValue());
                return Unit.INSTANCE;
            }
            case 27: {
                ((SnapshotMutableFloatStateImpl)this.x).setFloatValue(((Number)object0).floatValue());
                return Unit.INSTANCE;
            }
            case 28: {
                ((SnapshotMutableIntStateImpl)this.x).setIntValue(((Number)object0).intValue());
                return Unit.INSTANCE;
            }
            default: {
                ((SnapshotMutableLongStateImpl)this.x).setLongValue(((Number)object0).longValue());
                return Unit.INSTANCE;
            }
        }
    }
}

