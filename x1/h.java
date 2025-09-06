package x1;

import android.view.View;
import androidx.collection.LongSparseArray;
import androidx.compose.ui.input.pointer.InternalPointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEvent;
import androidx.compose.ui.input.pointer.PointerInputEventData;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.RenderDeclarationDescriptorVisitor.WhenMappings;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;

public final class h implements OnApplyWindowInsetsListener, DeclarationDescriptorVisitor {
    public final Object a;

    public h() {
        this.a = new LongSparseArray(0, 1, null);
    }

    public h(Object object0) {
        this.a = object0;
        super();
    }

    public InternalPointerEvent a(PointerInputEvent pointerInputEvent0, PositionCalculator positionCalculator0) {
        long v3;
        long v2;
        boolean z;
        LongSparseArray longSparseArray0 = new LongSparseArray(pointerInputEvent0.getPointers().size());
        List list0 = pointerInputEvent0.getPointers();
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            PointerInputEventData pointerInputEventData0 = (PointerInputEventData)list0.get(v1);
            LongSparseArray longSparseArray1 = (LongSparseArray)this.a;
            g g0 = (g)longSparseArray1.get(pointerInputEventData0.getId-J3iCeTQ());
            if(g0 == null) {
                z = false;
                v2 = pointerInputEventData0.getUptime();
                v3 = pointerInputEventData0.getPosition-F1C5BW0();
            }
            else {
                long v4 = positionCalculator0.screenToLocal-MK-Hz9U(g0.b);
                z = g0.c;
                v3 = v4;
                v2 = g0.a;
            }
            longSparseArray0.put(pointerInputEventData0.getId-J3iCeTQ(), new PointerInputChange(pointerInputEventData0.getId-J3iCeTQ(), pointerInputEventData0.getUptime(), pointerInputEventData0.getPosition-F1C5BW0(), pointerInputEventData0.getDown(), pointerInputEventData0.getPressure(), v2, v3, z, false, pointerInputEventData0.getType-T8wyACA(), pointerInputEventData0.getHistorical(), pointerInputEventData0.getScrollDelta-F1C5BW0(), pointerInputEventData0.getOriginalEventPosition-F1C5BW0(), null));
            if(pointerInputEventData0.getDown()) {
                longSparseArray1.put(pointerInputEventData0.getId-J3iCeTQ(), new g(pointerInputEventData0.getUptime(), pointerInputEventData0.getPositionOnScreen-F1C5BW0(), pointerInputEventData0.getDown()));
            }
            else {
                longSparseArray1.remove(pointerInputEventData0.getId-J3iCeTQ());
            }
        }
        return new InternalPointerEvent(longSparseArray0, pointerInputEvent0);
    }

    public void b(PropertyAccessorDescriptor propertyAccessorDescriptor0, StringBuilder stringBuilder0, String s) {
        DescriptorRendererImpl descriptorRendererImpl0 = (DescriptorRendererImpl)this.a;
        switch(DescriptorRendererImpl.RenderDeclarationDescriptorVisitor.WhenMappings.$EnumSwitchMapping$0[descriptorRendererImpl0.getPropertyAccessorRenderingPolicy().ordinal()]) {
            case 1: {
                DescriptorRendererImpl.access$renderAccessorModifiers(descriptorRendererImpl0, propertyAccessorDescriptor0, stringBuilder0);
                stringBuilder0.append(s + " for ");
                PropertyDescriptor propertyDescriptor0 = propertyAccessorDescriptor0.getCorrespondingProperty();
                Intrinsics.checkNotNullExpressionValue(propertyDescriptor0, "descriptor.correspondingProperty");
                DescriptorRendererImpl.access$renderProperty(descriptorRendererImpl0, propertyDescriptor0, stringBuilder0);
                return;
            }
            case 2: {
                Intrinsics.checkNotNullParameter(propertyAccessorDescriptor0, "descriptor");
                Intrinsics.checkNotNullParameter(stringBuilder0, "builder");
                DescriptorRendererImpl.access$renderFunction(descriptorRendererImpl0, propertyAccessorDescriptor0, stringBuilder0);
            }
        }
    }

    @Override  // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view0, WindowInsetsCompat windowInsetsCompat0) {
        CoordinatorLayout coordinatorLayout0 = (CoordinatorLayout)this.a;
        if(!ObjectsCompat.equals(coordinatorLayout0.o, windowInsetsCompat0)) {
            coordinatorLayout0.o = windowInsetsCompat0;
            boolean z = true;
            boolean z1 = windowInsetsCompat0 != null && windowInsetsCompat0.getSystemWindowInsetTop() > 0;
            coordinatorLayout0.p = z1;
            if(z1 || coordinatorLayout0.getBackground() != null) {
                z = false;
            }
            coordinatorLayout0.setWillNotDraw(z);
            if(!windowInsetsCompat0.isConsumed()) {
                int v1 = coordinatorLayout0.getChildCount();
                for(int v = 0; v < v1; ++v) {
                    View view1 = coordinatorLayout0.getChildAt(v);
                    if(ViewCompat.getFitsSystemWindows(view1) && ((LayoutParams)view1.getLayoutParams()).getBehavior() != null && windowInsetsCompat0.isConsumed()) {
                        break;
                    }
                }
            }
            coordinatorLayout0.requestLayout();
        }
        return windowInsetsCompat0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitClassDescriptor(ClassDescriptor classDescriptor0, Object object0) {
        Intrinsics.checkNotNullParameter(classDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(((StringBuilder)object0), "builder");
        DescriptorRendererImpl.access$renderClass(((DescriptorRendererImpl)this.a), classDescriptor0, ((StringBuilder)object0));
        return Unit.INSTANCE;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitConstructorDescriptor(ConstructorDescriptor constructorDescriptor0, Object object0) {
        Intrinsics.checkNotNullParameter(constructorDescriptor0, "constructorDescriptor");
        Intrinsics.checkNotNullParameter(((StringBuilder)object0), "builder");
        DescriptorRendererImpl.access$renderConstructor(((DescriptorRendererImpl)this.a), constructorDescriptor0, ((StringBuilder)object0));
        return Unit.INSTANCE;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitFunctionDescriptor(FunctionDescriptor functionDescriptor0, Object object0) {
        Intrinsics.checkNotNullParameter(functionDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(((StringBuilder)object0), "builder");
        DescriptorRendererImpl.access$renderFunction(((DescriptorRendererImpl)this.a), functionDescriptor0, ((StringBuilder)object0));
        return Unit.INSTANCE;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitModuleDeclaration(ModuleDescriptor moduleDescriptor0, Object object0) {
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(((StringBuilder)object0), "builder");
        DescriptorRendererImpl.access$renderName(((DescriptorRendererImpl)this.a), moduleDescriptor0, ((StringBuilder)object0), true);
        return Unit.INSTANCE;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitPackageFragmentDescriptor(PackageFragmentDescriptor packageFragmentDescriptor0, Object object0) {
        Intrinsics.checkNotNullParameter(packageFragmentDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(((StringBuilder)object0), "builder");
        DescriptorRendererImpl.access$renderPackageFragment(((DescriptorRendererImpl)this.a), packageFragmentDescriptor0, ((StringBuilder)object0));
        return Unit.INSTANCE;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitPackageViewDescriptor(PackageViewDescriptor packageViewDescriptor0, Object object0) {
        Intrinsics.checkNotNullParameter(packageViewDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(((StringBuilder)object0), "builder");
        DescriptorRendererImpl.access$renderPackageView(((DescriptorRendererImpl)this.a), packageViewDescriptor0, ((StringBuilder)object0));
        return Unit.INSTANCE;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitPropertyDescriptor(PropertyDescriptor propertyDescriptor0, Object object0) {
        Intrinsics.checkNotNullParameter(propertyDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(((StringBuilder)object0), "builder");
        DescriptorRendererImpl.access$renderProperty(((DescriptorRendererImpl)this.a), propertyDescriptor0, ((StringBuilder)object0));
        return Unit.INSTANCE;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitPropertyGetterDescriptor(PropertyGetterDescriptor propertyGetterDescriptor0, Object object0) {
        Intrinsics.checkNotNullParameter(propertyGetterDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(((StringBuilder)object0), "builder");
        this.b(propertyGetterDescriptor0, ((StringBuilder)object0), "getter");
        return Unit.INSTANCE;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitPropertySetterDescriptor(PropertySetterDescriptor propertySetterDescriptor0, Object object0) {
        Intrinsics.checkNotNullParameter(propertySetterDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(((StringBuilder)object0), "builder");
        this.b(propertySetterDescriptor0, ((StringBuilder)object0), "setter");
        return Unit.INSTANCE;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitReceiverParameterDescriptor(ReceiverParameterDescriptor receiverParameterDescriptor0, Object object0) {
        Intrinsics.checkNotNullParameter(receiverParameterDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(((StringBuilder)object0), "builder");
        ((StringBuilder)object0).append(receiverParameterDescriptor0.getName());
        return Unit.INSTANCE;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitTypeAliasDescriptor(TypeAliasDescriptor typeAliasDescriptor0, Object object0) {
        Intrinsics.checkNotNullParameter(typeAliasDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(((StringBuilder)object0), "builder");
        DescriptorRendererImpl.access$renderTypeAlias(((DescriptorRendererImpl)this.a), typeAliasDescriptor0, ((StringBuilder)object0));
        return Unit.INSTANCE;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitTypeParameterDescriptor(TypeParameterDescriptor typeParameterDescriptor0, Object object0) {
        Intrinsics.checkNotNullParameter(typeParameterDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(((StringBuilder)object0), "builder");
        DescriptorRendererImpl.access$renderTypeParameter(((DescriptorRendererImpl)this.a), typeParameterDescriptor0, ((StringBuilder)object0), true);
        return Unit.INSTANCE;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitValueParameterDescriptor(ValueParameterDescriptor valueParameterDescriptor0, Object object0) {
        Intrinsics.checkNotNullParameter(valueParameterDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(((StringBuilder)object0), "builder");
        DescriptorRendererImpl.access$renderValueParameter(((DescriptorRendererImpl)this.a), valueParameterDescriptor0, true, ((StringBuilder)object0), true);
        return Unit.INSTANCE;
    }
}

