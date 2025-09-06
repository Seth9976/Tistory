package te;

import androidx.compose.material3.SheetState;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupLayout;
import androidx.compose.ui.window.PopupProperties;
import com.kakao.kandinsky.core.kdphoto.Signature;
import com.kakao.kandinsky.signature.ui.SavedSignatureBottomSheetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlinx.coroutines.CoroutineScope;

public final class a extends Lambda implements Function0 {
    public final Object A;
    public final Object B;
    public final int w;
    public final Object x;
    public final Object y;
    public final Object z;

    public a(Object object0, Object object1, Object object2, Object object3, Object object4, int v) {
        this.w = v;
        this.x = object0;
        this.y = object1;
        this.z = object2;
        this.A = object3;
        this.B = object4;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                TypeParameterUpperBoundEraser typeParameterUpperBoundEraser0 = ((JavaTypeResolver)this.x).d;
                ClassifierDescriptor classifierDescriptor0 = ((TypeConstructor)this.A).getDeclarationDescriptor();
                SimpleType simpleType0 = classifierDescriptor0 == null ? null : classifierDescriptor0.getDefaultType();
                JavaTypeAttributes javaTypeAttributes0 = ((JavaTypeAttributes)this.z).withDefaultType(simpleType0).markIsRaw(((JavaClassifierType)this.B).isRaw());
                return typeParameterUpperBoundEraser0.getErasedUpperBound(((TypeParameterDescriptor)this.y), javaTypeAttributes0);
            }
            case 1: {
                ((PopupLayout)this.x).updateParameters(((Function0)this.y), ((PopupProperties)this.z), ((String)this.A), ((LayoutDirection)this.B));
                return Unit.INSTANCE;
            }
            default: {
                ((Function1)this.x).invoke(((Signature)this.y));
                SavedSignatureBottomSheetKt.access$SavedSignatureBottomSheet$dismiss(((CoroutineScope)this.z), ((SheetState)this.A), ((Function1)this.B), false);
                return Unit.INSTANCE;
            }
        }
    }
}

