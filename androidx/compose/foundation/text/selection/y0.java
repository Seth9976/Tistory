package androidx.compose.foundation.text.selection;

import androidx.activity.BackEventCompat;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28;
import androidx.compose.material.SwipeableKt;
import androidx.compose.material.SwipeableState;
import androidx.compose.material.ripple.RippleNode;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.navigation.compose.NavHostKt;
import androidx.paging.GenerationalViewportHint;
import androidx.paging.LoadType;
import androidx.paging.PageEvent;
import androidx.paging.PageFetcherSnapshot;
import androidx.paging.PagingData;
import androidx.paging.PagingDataPresenter;
import androidx.paging.PagingLogger;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.model.WorkSpec;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import n0.c;
import p0.da;
import qd.a;

public final class y0 implements FlowCollector {
    public final int a;
    public final Object b;
    public final Object c;

    public y0(int v, Object object0, Object object1) {
        this.a = v;
        this.b = object0;
        this.c = object1;
        super();
    }

    public Object a(Map map0, Continuation continuation0) {
        y0 y00;
        da da0;
        if(continuation0 instanceof da) {
            da0 = (da)continuation0;
            int v = da0.r;
            if((v & 0x80000000) == 0) {
                da0 = new da(this, continuation0);
            }
            else {
                da0.r = v ^ 0x80000000;
            }
        }
        else {
            da0 = new da(this, continuation0);
        }
        Object object0 = da0.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(da0.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Float float0 = SwipeableKt.access$getOffset(map0, this.b);
                if(float0 == null) {
                    throw new IllegalArgumentException("The target value must have an associated anchor.");
                }
                da0.o = this;
                da0.r = 1;
                if(SwipeableState.access$snapInternalToOffset(((SwipeableState)this.c), ((float)float0), da0) == object1) {
                    return object1;
                }
                y00 = this;
                break;
            }
            case 1: {
                y00 = da0.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        SwipeableState.access$setCurrentValue(((SwipeableState)y00.c), y00.b);
        return Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        switch(this.a) {
            case 0: {
                long v = ((Offset)object0).unbox-impl();
                Animatable animatable0 = (Animatable)this.b;
                if(OffsetKt.isSpecified-k-4lQ0M(((Offset)animatable0.getValue()).unbox-impl()) && OffsetKt.isSpecified-k-4lQ0M(v) && Offset.getY-impl(((Offset)animatable0.getValue()).unbox-impl()) != Offset.getY-impl(v)) {
                    x0 x00 = new x0(animatable0, v, null);
                    BuildersKt.launch$default(((CoroutineScope)this.c), null, null, x00, 3, null);
                    return Unit.INSTANCE;
                }
                Unit unit0 = animatable0.snapTo(Offset.box-impl(v), continuation0);
                return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
            }
            case 1: {
                ((OnConstraintsStateChangedListener)this.b).onConstraintsStateChanged(((WorkSpec)this.c), ((ConstraintsState)object0));
                return Unit.INSTANCE;
            }
            case 2: {
                long v1 = ((Offset)object0).unbox-impl();
                TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl280 = (TextFieldMagnifierNodeImpl28)this.b;
                if(OffsetKt.isSpecified-k-4lQ0M(((Offset)textFieldMagnifierNodeImpl280.u.getValue()).unbox-impl()) && OffsetKt.isSpecified-k-4lQ0M(v1) && Offset.getY-impl(((Offset)textFieldMagnifierNodeImpl280.u.getValue()).unbox-impl()) != Offset.getY-impl(v1)) {
                    c c0 = new c(textFieldMagnifierNodeImpl280, v1, null);
                    BuildersKt.launch$default(((CoroutineScope)this.c), null, null, c0, 3, null);
                    return Unit.INSTANCE;
                }
                Unit unit1 = textFieldMagnifierNodeImpl280.u.snapTo(Offset.box-impl(v1), continuation0);
                return unit1 == a.getCOROUTINE_SUSPENDED() ? unit1 : Unit.INSTANCE;
            }
            case 3: {
                NavHostKt.access$NavHost$lambda$12(((MutableState)this.b), true);
                float f = ((BackEventCompat)object0).getProgress();
                NavHostKt.access$NavHost$lambda$9(((MutableFloatState)this.c), f);
                return Unit.INSTANCE;
            }
            case 4: {
                return this.a(((Map)object0), continuation0);
            }
            case 5: {
                Unit unit2 = PageFetcherSnapshot.access$doLoad(((PageFetcherSnapshot)this.b), ((LoadType)this.c), ((GenerationalViewportHint)object0), continuation0);
                return unit2 == a.getCOROUTINE_SUSPENDED() ? unit2 : Unit.INSTANCE;
            }
            case 6: {
                PagingLogger pagingLogger0 = PagingLogger.INSTANCE;
                if(pagingLogger0.isLoggable(2)) {
                    pagingLogger0.log(2, "Collected " + ((PageEvent)object0), null);
                }
                Unit unit3 = BuildersKt.withContext(PagingDataPresenter.access$getMainContext$p(((PagingDataPresenter)this.b)), new androidx.paging.y0(((PageEvent)object0), ((PagingDataPresenter)this.b), ((PagingData)this.c), null), continuation0);
                return unit3 == a.getCOROUTINE_SUSPENDED() ? unit3 : Unit.INSTANCE;
            }
            default: {
                RippleNode rippleNode0 = (RippleNode)this.b;
                if(((Interaction)object0) instanceof PressInteraction) {
                    if(RippleNode.access$getHasValidSize$p(rippleNode0)) {
                        RippleNode.access$handlePressInteraction(rippleNode0, ((PressInteraction)(((Interaction)object0))));
                        return Unit.INSTANCE;
                    }
                    RippleNode.access$getPendingInteractions$p(rippleNode0).add(((Interaction)object0));
                    return Unit.INSTANCE;
                }
                RippleNode.access$updateStateLayer(rippleNode0, ((Interaction)object0), ((CoroutineScope)this.c));
                return Unit.INSTANCE;
            }
        }
    }
}

