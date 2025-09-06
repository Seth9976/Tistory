package se;

import java.util.HashMap;
import java.util.Map.Entry;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment.partToFacade.2.WhenMappings;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;

public final class j extends Lambda implements Function0 {
    public final LazyJavaPackageFragment w;

    public j(LazyJavaPackageFragment lazyJavaPackageFragment0) {
        this.w = lazyJavaPackageFragment0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        HashMap hashMap0 = new HashMap();
        for(Object object0: this.w.getBinaryClasses$descriptors_jvm().entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            KotlinJvmBinaryClass kotlinJvmBinaryClass0 = (KotlinJvmBinaryClass)((Map.Entry)object0).getValue();
            JvmClassName jvmClassName0 = JvmClassName.byInternalName(s);
            Intrinsics.checkNotNullExpressionValue(jvmClassName0, "byInternalName(partInternalName)");
            KotlinClassHeader kotlinClassHeader0 = kotlinJvmBinaryClass0.getClassHeader();
            switch(LazyJavaPackageFragment.partToFacade.2.WhenMappings.$EnumSwitchMapping$0[kotlinClassHeader0.getKind().ordinal()]) {
                case 1: {
                    String s1 = kotlinClassHeader0.getMultifileClassName();
                    if(s1 == null) {
                        continue;
                    }
                    JvmClassName jvmClassName1 = JvmClassName.byInternalName(s1);
                    Intrinsics.checkNotNullExpressionValue(jvmClassName1, "byInternalName(header.mu…: continue@kotlinClasses)");
                    hashMap0.put(jvmClassName0, jvmClassName1);
                    break;
                }
                case 2: {
                    hashMap0.put(jvmClassName0, jvmClassName0);
                }
            }
        }
        return hashMap0;
    }
}

