package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope.DefaultImpls;

public final class n extends Lambda implements Function0 {
    public final Data w;

    public n(Data kClassImpl$Data0) {
        this.w = kClassImpl$Data0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MemberScope memberScope0 = this.w.getDescriptor().getUnsubstitutedInnerClassesScope();
        Intrinsics.checkNotNullExpressionValue(memberScope0, "descriptor.unsubstitutedInnerClassesScope");
        Iterable iterable0 = DefaultImpls.getContributedDescriptors$default(memberScope0, null, null, 3, null);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            if(!DescriptorUtils.isEnumEntry(((DeclarationDescriptor)object0))) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: arrayList0) {
            DeclarationDescriptor declarationDescriptor0 = (DeclarationDescriptor)object1;
            ClassDescriptor classDescriptor0 = declarationDescriptor0 instanceof ClassDescriptor ? ((ClassDescriptor)declarationDescriptor0) : null;
            Class class0 = classDescriptor0 == null ? null : UtilKt.toJavaClass(classDescriptor0);
            KClassImpl kClassImpl0 = class0 == null ? null : new KClassImpl(class0);
            if(kClassImpl0 != null) {
                arrayList1.add(kClassImpl0);
            }
        }
        return arrayList1;
    }
}

