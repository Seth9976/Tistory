package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import ff.g;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

public final class qc extends Lambda implements Function1 {
    public final Object A;
    public final Object B;
    public final int w;
    public final boolean x;
    public final Object y;
    public final Object z;

    public qc(TypeAttributes typeAttributes0, TypeConstructor typeConstructor0, List list0, boolean z, MemberScope memberScope0) {
        this.w = 1;
        this.y = typeConstructor0;
        this.z = list0;
        this.A = typeAttributes0;
        this.x = z;
        this.B = memberScope0;
        super(1);
    }

    public qc(boolean z, MutableTransitionState mutableTransitionState0, MutableState mutableState0, State state0, State state1) {
        this.w = 0;
        this.x = z;
        this.y = mutableTransitionState0;
        this.z = mutableState0;
        this.A = state0;
        this.B = state1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f2;
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((KotlinTypeRefiner)object0), "kotlinTypeRefiner");
            List list0 = (List)this.z;
            g g0 = KotlinTypeFactory.access$refineConstructor(KotlinTypeFactory.INSTANCE, ((TypeConstructor)this.y), ((KotlinTypeRefiner)object0), list0);
            if(g0 == null) {
                return null;
            }
            SimpleType simpleType0 = g0.a;
            if(simpleType0 != null) {
                return simpleType0;
            }
            Intrinsics.checkNotNull(g0.b);
            return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(((TypeAttributes)this.A), g0.b, list0, this.x, ((MemberScope)this.B));
        }
        float f = 0.8f;
        State state0 = (State)this.A;
        float f1 = 1.0f;
        MutableTransitionState mutableTransitionState0 = (MutableTransitionState)this.y;
        boolean z = this.x;
        if(z) {
            f2 = ((Boolean)mutableTransitionState0.getTargetState()).booleanValue() ? 1.0f : 0.8f;
        }
        else {
            f2 = MenuKt.access$DropdownMenuContent_Qj0Zi0g$lambda$1(state0);
        }
        ((GraphicsLayerScope)object0).setScaleX(f2);
        if(!z) {
            f = MenuKt.access$DropdownMenuContent_Qj0Zi0g$lambda$1(state0);
        }
        else if(((Boolean)mutableTransitionState0.getTargetState()).booleanValue()) {
            f = 1.0f;
        }
        ((GraphicsLayerScope)object0).setScaleY(f);
        if(!z) {
            f1 = MenuKt.access$DropdownMenuContent_Qj0Zi0g$lambda$3(((State)this.B));
        }
        else if(!((Boolean)mutableTransitionState0.getTargetState()).booleanValue()) {
            f1 = 0.0f;
        }
        ((GraphicsLayerScope)object0).setAlpha(f1);
        ((GraphicsLayerScope)object0).setTransformOrigin-__ExYCQ(((TransformOrigin)((MutableState)this.z).getValue()).unbox-impl());
        return Unit.INSTANCE;
    }
}

