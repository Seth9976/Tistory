package u2;

import android.graphics.Matrix;
import android.view.MotionEvent;
import androidx.collection.MutableScatterSet;
import androidx.compose.foundation.gestures.UpdatableAnimationState;
import androidx.compose.runtime.BroadcastFrameClock;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.Latch;
import androidx.compose.runtime.changelist.Operations;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInteropFilter;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.AndroidPopup_androidKt.Popup.4.1.invoke..inlined.onDispose.1;
import androidx.compose.ui.window.PopupLayout;
import androidx.compose.ui.window.PopupPositionProvider;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.crop.contract.CropUiState;
import com.kakao.kandinsky.designsystem.util.MatrixTransformKt;
import com.kakao.kandinsky.utils.MatrixExtensionKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import kotlin.Unit;
import kotlin.collections.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RawTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Deferred;
import ue.a;
import x1.i;
import y0.c;

public final class b extends Lambda implements Function1 {
    public final int w;
    public final Object x;
    public final Object y;

    public b(int v, Object object0, Object object1) {
        this.w = v;
        this.x = object0;
        this.y = object1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        a a0;
        RawTypeMarker rawTypeMarker0;
        switch(this.w) {
            case 0: {
                Modifier modifier0 = ((Modifier)object0).then(((Modifier)this.y));
                ((LayoutNode)this.x).setModifier(modifier0);
                return Unit.INSTANCE;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(object0, "$this$extractNullability");
                return Boolean.valueOf(((AbstractSignatureParts)this.x).forceWarning(object0, ((a)this.y).a));
            }
            case 2: {
                Intrinsics.checkNotNullParameter(((a)object0), "it");
                AbstractSignatureParts abstractSignatureParts0 = (AbstractSignatureParts)this.x;
                boolean z = abstractSignatureParts0.getSkipRawTypeArguments();
                TypeSystemContext typeSystemContext0 = (TypeSystemContext)this.y;
                if(z) {
                    KotlinTypeMarker kotlinTypeMarker0 = ((a)object0).a;
                    if(kotlinTypeMarker0 == null) {
                        rawTypeMarker0 = null;
                    }
                    else {
                        FlexibleTypeMarker flexibleTypeMarker0 = typeSystemContext0.asFlexibleType(kotlinTypeMarker0);
                        rawTypeMarker0 = flexibleTypeMarker0 == null ? null : typeSystemContext0.asRawType(flexibleTypeMarker0);
                    }
                    if(rawTypeMarker0 == null) {
                        goto label_22;
                    }
                }
                else {
                label_22:
                    KotlinTypeMarker kotlinTypeMarker1 = ((a)object0).a;
                    if(kotlinTypeMarker1 != null) {
                        TypeConstructorMarker typeConstructorMarker0 = typeSystemContext0.typeConstructor(kotlinTypeMarker1);
                        if(typeConstructorMarker0 != null) {
                            List list0 = typeSystemContext0.getParameters(typeConstructorMarker0);
                            if(list0 != null) {
                                Iterable iterable0 = typeSystemContext0.getArguments(((a)object0).a);
                                Iterator iterator0 = list0.iterator();
                                Iterator iterator1 = iterable0.iterator();
                                ArrayList arrayList0 = new ArrayList(Math.min(l.collectionSizeOrDefault(list0, 10), l.collectionSizeOrDefault(iterable0, 10)));
                                while(iterator0.hasNext() && iterator1.hasNext()) {
                                    Object object1 = iterator0.next();
                                    Object object2 = iterator1.next();
                                    TypeArgumentMarker typeArgumentMarker0 = (TypeArgumentMarker)object2;
                                    TypeParameterMarker typeParameterMarker0 = (TypeParameterMarker)object1;
                                    boolean z1 = typeSystemContext0.isStarProjection(typeArgumentMarker0);
                                    JavaTypeQualifiersByElementType javaTypeQualifiersByElementType0 = ((a)object0).b;
                                    if(z1) {
                                        a0 = new a(null, javaTypeQualifiersByElementType0, typeParameterMarker0);
                                    }
                                    else {
                                        KotlinTypeMarker kotlinTypeMarker2 = typeSystemContext0.getType(typeArgumentMarker0);
                                        a0 = new a(kotlinTypeMarker2, AbstractSignatureParts.access$extractAndMergeDefaultQualifiers(abstractSignatureParts0, kotlinTypeMarker2, javaTypeQualifiersByElementType0), typeParameterMarker0);
                                    }
                                    arrayList0.add(a0);
                                }
                                return arrayList0;
                            }
                        }
                    }
                }
                return null;
            }
            case 3: {
                DisposableEffectScope disposableEffectScope0 = (DisposableEffectScope)object0;
                ((PopupLayout)this.x).setPositionProvider(((PopupPositionProvider)this.y));
                ((PopupLayout)this.x).updatePosition();
                return new AndroidPopup_androidKt.Popup.4.1.invoke..inlined.onDispose.1();
            }
            case 4: {
                long v = ((ColorProducer)this.y).invoke-0d7_KjU();
                OutlineKt.drawOutline-wDX37Ww$default(((DrawScope)object0), ((Outline)this.x), v, 0.0f, null, null, 0, 60, null);
                return Unit.INSTANCE;
            }
            case 5: {
                long v1 = ((CacheDrawScope)object0).getSize-NH-jbRc();
                LayoutDirection layoutDirection0 = ((CacheDrawScope)object0).getLayoutDirection();
                return ((CacheDrawScope)object0).onDrawBehind(new b(4, ((Shape)this.x).createOutline-Pq9zytI(v1, layoutDirection0, ((CacheDrawScope)object0)), ((ColorProducer)this.y)));
            }
            case 6: {
                int v2 = ((MotionEvent)object0).getActionMasked();
                PointerInteropFilter pointerInteropFilter0 = (PointerInteropFilter)this.y;
                if(v2 == 0) {
                    i i0 = ((Boolean)pointerInteropFilter0.getOnTouchEvent().invoke(((MotionEvent)object0))).booleanValue() ? i.b : i.c;
                    ((androidx.compose.ui.input.pointer.PointerInteropFilter.pointerInputFilter.1)this.x).c = i0;
                    return Unit.INSTANCE;
                }
                pointerInteropFilter0.getOnTouchEvent().invoke(((MotionEvent)object0));
                return Unit.INSTANCE;
            }
            case 7: {
                Intrinsics.checkNotNullParameter(((Matrix)object0), "$this$buildMatrix");
                float f = Math.abs(MatrixTransformKt.getTransform(MatrixExtensionKt.invert(((KDPhoto)this.x).getMatrix())).getScaleX());
                ((Matrix)object0).postScale(f, f, Offset.getX-impl(((CropUiState)this.y).getCropRect().getCenter-F1C5BW0()), Offset.getY-impl(((CropUiState)this.y).getCropRect().getCenter-F1C5BW0()));
                return Unit.INSTANCE;
            }
            case 8: {
                Throwable throwable0 = (Throwable)object0;
                Object object3 = ((BroadcastFrameClock)this.x).b;
                BroadcastFrameClock broadcastFrameClock0 = (BroadcastFrameClock)this.x;
                synchronized(object3) {
                    broadcastFrameClock0.d.remove(((c)this.y));
                    if(broadcastFrameClock0.d.isEmpty()) {
                        broadcastFrameClock0.f.set(0);
                    }
                    return Unit.INSTANCE;
                }
            }
            case 9: {
                Throwable throwable1 = (Throwable)object0;
                synchronized(((Latch)this.x).a) {
                    ((Latch)this.x).b.remove(((CancellableContinuationImpl)this.y));
                    return Unit.INSTANCE;
                }
            }
            case 10: {
                ((ControlledComposition)this.x).recordWriteOf(object0);
                MutableScatterSet mutableScatterSet0 = (MutableScatterSet)this.y;
                if(mutableScatterSet0 != null) {
                    mutableScatterSet0.add(object0);
                }
                return Unit.INSTANCE;
            }
            case 11: {
                Throwable throwable2 = (Throwable)object0;
                CompletableFuture completableFuture0 = (CompletableFuture)this.x;
                try {
                    completableFuture0.complete(((Deferred)this.y).getCompleted());
                }
                catch(Throwable throwable3) {
                    completableFuture0.completeExceptionally(throwable3);
                }
                return Unit.INSTANCE;
            }
            case 12: {
                Throwable throwable4 = (Throwable)object0;
                ((CompletableFuture)this.x).cancel(false);
                ((yf.b)this.y).cont = null;
                return Unit.INSTANCE;
            }
            case 13: {
                ((Number)object0).longValue();
                ((UpdatableAnimationState)this.x).setValue(0.0f);
                ((Function1)this.y).invoke(((UpdatableAnimationState)this.x).getValue());
                return Unit.INSTANCE;
            }
            default: {
                return ((Operations)this.x).a(object0, ((String)this.y));
            }
        }
    }
}

