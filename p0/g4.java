package p0;

import android.view.View;
import androidx.collection.MutableObjectIntMap;
import androidx.compose.material.ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox.5.invoke..inlined.onDispose.1;
import androidx.compose.material3.q9;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.b;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.ui.node.Ref;
import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.serialization.RouteSerializerKt;
import com.kakao.kandinsky.selector.MultipleImageSelectorKt;
import com.kakao.kandinsky.selector.SelectorImageDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class g4 extends Lambda implements Function1 {
    public final Object A;
    public final int w;
    public final int x;
    public final Object y;
    public final Object z;

    public g4(int v, int v1, Object object0, Object object1, Object object2) {
        this.w = v1;
        this.y = object0;
        this.z = object1;
        this.x = v;
        this.A = object2;
        super(1);
    }

    public g4(b b0, IntRef intRef0, MutableObjectIntMap mutableObjectIntMap0, int v) {
        this.w = 3;
        this.y = b0;
        this.z = intRef0;
        this.A = mutableObjectIntMap0;
        this.x = v;
        super(1);
    }

    public g4(KSerializer kSerializer0, int v, String s, Map map0) {
        this.w = 1;
        this.y = kSerializer0;
        this.x = v;
        this.z = s;
        this.A = map0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                DisposableEffectScope disposableEffectScope0 = (DisposableEffectScope)object0;
                q9 q90 = new q9(((View)this.y), ((Ref)this.z), this.x, ((MutableIntState)this.A));
                return new ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox.5.invoke..inlined.onDispose.1(new z5(((View)this.y), q90));
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((NavArgumentBuilder)object0), "$this$navArgument");
                SerialDescriptor serialDescriptor0 = ((KSerializer)this.y).getDescriptor().getElementDescriptor(this.x);
                boolean z = serialDescriptor0.isNullable();
                ((NavArgumentBuilder)object0).setType(RouteSerializerKt.access$computeNavType(serialDescriptor0, ((String)this.z), ((Map)this.A)));
                ((NavArgumentBuilder)object0).setNullable(z);
                if(((KSerializer)this.y).getDescriptor().isElementOptional(this.x)) {
                    ((NavArgumentBuilder)object0).setUnknownDefaultValuePresent$navigation_common_release(true);
                }
                return Unit.INSTANCE;
            }
            case 2: {
                boolean z1 = ((Boolean)object0).booleanValue();
                String s = (String)this.y;
                if(s != null) {
                    MultipleImageSelectorKt.access$selectAllClickEvent(s);
                }
                SnapshotStateList snapshotStateList0 = (SnapshotStateList)this.z;
                snapshotStateList0.clear();
                if(z1) {
                    snapshotStateList0.add(this.x);
                    return Unit.INSTANCE;
                }
                ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(((List)this.A), 10));
                for(Object object1: ((List)this.A)) {
                    arrayList0.add(((SelectorImageDate)object1).getIndex());
                }
                snapshotStateList0.addAll(arrayList0);
                return Unit.INSTANCE;
            }
            default: {
                if(object0 == ((b)this.y)) {
                    throw new IllegalStateException("A derived state calculation cannot read itself");
                }
                if(object0 instanceof StateObject) {
                    int v = ((MutableObjectIntMap)this.A).getOrDefault(object0, 0x7FFFFFFF);
                    ((MutableObjectIntMap)this.A).set(object0, Math.min(((IntRef)this.z).getElement() - this.x, v));
                }
                return Unit.INSTANCE;
            }
        }
    }
}

