package d0;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.collection.MutableScatterSet;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.a;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.runtime.snapshots.d;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.InputMethodManagerImpl;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.core.splashscreen.R.layout;
import androidx.window.core.Version;
import ff.b;
import h0.f;
import java.lang.reflect.Member;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.collections.x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.KProperty0Impl;
import kotlin.reflect.jvm.internal.KProperty1Impl;
import kotlin.reflect.jvm.internal.KProperty2Impl;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.KTypeParameterImpl;
import kotlin.reflect.jvm.internal.e0;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImplKt;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt;

public final class s extends Lambda implements Function0 {
    public final int w;
    public final Object x;

    public s(Object object0, int v) {
        this.w = v;
        this.x = object0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object[] arr_object3;
        Object[] arr_object2;
        int v9;
        int v1;
        switch(this.w) {
            case 0: {
                DrawModifierNode drawModifierNode0 = ((LazyLayoutItemAnimator)this.x).j;
                if(drawModifierNode0 != null) {
                    DrawModifierNodeKt.invalidateDraw(drawModifierNode0);
                }
                return Unit.INSTANCE;
            }
            case 1: {
                return (LazyLayoutItemProvider)this.x;
            }
            case 2: {
                Map map0 = x.emptyMap();
                return new f0(((SaveableStateRegistry)this.x), map0);
            }
            case 3: {
                return ((KClassImpl)(((KClass)this.x))).getJClass();
            }
            case 4: {
                List list0 = ((GivenFunctionsMemberScope)this.x).computeDeclaredFunctions();
                return CollectionsKt___CollectionsKt.plus(list0, GivenFunctionsMemberScope.access$createFakeOverrides(((GivenFunctionsMemberScope)this.x), list0));
            }
            case 5: {
                return ((TypeSubstitutor)this.x).getSubstitution().buildSubstitutor();
            }
            case 6: {
                return new e0(((KPackageImpl)this.x));
            }
            case 7: {
                Member member0 = ((KProperty0Impl)this.x).computeDelegateSource();
                return ((KProperty0Impl)this.x).getDelegateImpl(member0, null, null);
            }
            case 8: {
                return ((KProperty1Impl)this.x).computeDelegateSource();
            }
            case 9: {
                return ((KProperty2Impl)this.x).computeDelegateSource();
            }
            case 10: {
                return ((KPropertyImpl)this.x).getContainer().findPropertyDescriptor(((KPropertyImpl)this.x).getName(), ((KPropertyImpl)this.x).getSignature());
            }
            case 11: {
                List list1 = ((KTypeParameterImpl)this.x).getDescriptor().getUpperBounds();
                Intrinsics.checkNotNullExpressionValue(list1, "descriptor.upperBounds");
                ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list1, 10));
                for(Object object1: list1) {
                    arrayList0.add(new KTypeImpl(((KotlinType)object1), null, 2, null));
                }
                return arrayList0;
            }
            case 12: {
                return new b(((AbstractTypeConstructor)this.x).computeSupertypes());
            }
            case 13: {
                return StarProjectionImplKt.starProjectionType(StarProjectionImpl.access$getTypeParameter$p(((StarProjectionImpl)this.x)));
            }
            case 14: {
                return ErrorUtils.createErrorType(ErrorTypeKind.CANNOT_COMPUTE_ERASED_BOUND, new String[]{((TypeParameterUpperBoundEraser)this.x).toString()});
            }
            case 15: {
                int v = 0;
                for(Object object2: ((Map)this.x).entrySet()) {
                    String s = (String)((Map.Entry)object2).getKey();
                    Object object3 = ((Map.Entry)object2).getValue();
                    if(object3 instanceof boolean[]) {
                        v1 = Arrays.hashCode(((boolean[])object3));
                    }
                    else if(object3 instanceof char[]) {
                        v1 = Arrays.hashCode(((char[])object3));
                    }
                    else if(object3 instanceof byte[]) {
                        v1 = Arrays.hashCode(((byte[])object3));
                    }
                    else if(object3 instanceof short[]) {
                        v1 = Arrays.hashCode(((short[])object3));
                    }
                    else if(object3 instanceof int[]) {
                        v1 = Arrays.hashCode(((int[])object3));
                    }
                    else if(object3 instanceof float[]) {
                        v1 = Arrays.hashCode(((float[])object3));
                    }
                    else if(object3 instanceof long[]) {
                        v1 = Arrays.hashCode(((long[])object3));
                    }
                    else if(object3 instanceof double[]) {
                        v1 = Arrays.hashCode(((double[])object3));
                    }
                    else {
                        v1 = object3 instanceof Object[] ? Arrays.hashCode(((Object[])object3)) : object3.hashCode();
                    }
                    v += v1 ^ s.hashCode() * 0x7F;
                }
                return v;
            }
            case 16: {
                Function0 function00 = NewCapturedTypeConstructor.access$getSupertypesComputation$p(((NewCapturedTypeConstructor)this.x));
                return function00 != null ? ((List)function00.invoke()) : null;
            }
            case 17: {
                return "This collections cannot be empty! input types: " + CollectionsKt___CollectionsKt.joinToString$default(((LinkedHashSet)this.x), null, null, null, 0, null, null, 0x3F, null);
            }
            case 18: {
                SerialDescriptor[] arr_serialDescriptor = SerialDescriptorImpl.access$getTypeParametersDescriptors$p(((SerialDescriptorImpl)this.x));
                return PluginGeneratedSerialDescriptorKt.hashCodeImpl(((SerialDescriptorImpl)this.x), arr_serialDescriptor);
            }
            case 19: {
                ((f)this.x).H.invoke(Boolean.valueOf(!((f)this.x).G));
                return Unit.INSTANCE;
            }
            case 20: {
                a a0 = (a)this.x;
                Saver saver0 = a0.a;
                Object object4 = a0.d;
                if(object4 == null) {
                    throw new IllegalArgumentException("Value should be initialized");
                }
                return saver0.save(a0, object4);
            }
            case 21: {
                return ((ModuleDescriptor)this.x).getPackage(StandardNames.KOTLIN_REFLECT_FQ_NAME).getMemberScope();
            }
            case 22: {
                do {
                    MutableVector mutableVector0 = ((SnapshotStateObserver)this.x).f;
                    SnapshotStateObserver snapshotStateObserver0 = (SnapshotStateObserver)this.x;
                    synchronized(mutableVector0) {
                        if(!snapshotStateObserver0.c) {
                            snapshotStateObserver0.c = true;
                            try {
                                MutableVector mutableVector1 = snapshotStateObserver0.f;
                                int v4 = mutableVector1.getSize();
                                if(v4 > 0) {
                                    Object[] arr_object = mutableVector1.getContent();
                                    int v5 = 0;
                                    while(true) {
                                        d d0 = (d)arr_object[v5];
                                        MutableScatterSet mutableScatterSet0 = d0.g;
                                        Object[] arr_object1 = mutableScatterSet0.elements;
                                        long[] arr_v = mutableScatterSet0.metadata;
                                        int v6 = arr_v.length - 2;
                                        if(v6 >= 0) {
                                            int v7 = 0;
                                            while(true) {
                                                long v8 = arr_v[v7];
                                                v9 = v4;
                                                if((~v8 << 7 & v8 & 0x8080808080808080L) == 0x8080808080808080L) {
                                                    goto label_120;
                                                }
                                                int v10 = 8 - (~(v7 - v6) >>> 0x1F);
                                                int v11 = 0;
                                                while(v11 < v10) {
                                                    if((v8 & 0xFFL) < 0x80L) {
                                                        arr_object2 = arr_object;
                                                        d0.a.invoke(arr_object1[(v7 << 3) + v11]);
                                                    }
                                                    else {
                                                        arr_object2 = arr_object;
                                                    }
                                                    v8 >>= 8;
                                                    ++v11;
                                                    arr_object = arr_object2;
                                                }
                                                arr_object3 = arr_object;
                                                if(v10 == 8) {
                                                    goto label_121;
                                                label_120:
                                                    arr_object3 = arr_object;
                                                label_121:
                                                    if(v7 != v6) {
                                                        ++v7;
                                                        v4 = v9;
                                                        arr_object = arr_object3;
                                                        continue;
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                        else {
                                            arr_object3 = arr_object;
                                            v9 = v4;
                                        }
                                        mutableScatterSet0.clear();
                                        ++v5;
                                        if(v5 >= v9) {
                                            break;
                                        }
                                        v4 = v9;
                                        arr_object = arr_object3;
                                    }
                                }
                            }
                            finally {
                                snapshotStateObserver0.c = false;
                            }
                        }
                    }
                }
                while(SnapshotStateObserver.access$drainChanges(((SnapshotStateObserver)this.x)));
                return Unit.INSTANCE;
            }
            case 23: {
                View view0 = View.inflate(((Activity)((a7.b)this.x).b), layout.splash_screen_view, null);
                if(view0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
                return (ViewGroup)view0;
            }
            case 24: {
                return BigInteger.valueOf(((Version)this.x).getMajor()).shiftLeft(0x20).or(BigInteger.valueOf(((Version)this.x).getMinor())).shiftLeft(0x20).or(BigInteger.valueOf(((Version)this.x).getPatch()));
            }
            case 25: {
                return ((LegacyTextFieldState)this.x).getLayoutResult();
            }
            case 26: {
                return new TextFieldScrollerPosition(((Orientation)this.x), 0.0f, 2, null);
            }
            case 27: {
                AnnotatedString annotatedString0 = ((TextLinkScope)this.x).getText$foundation_release();
                TextLayoutResult textLayoutResult0 = ((TextLinkScope)this.x).getTextLayoutResult();
                if(textLayoutResult0 != null) {
                    TextLayoutInput textLayoutInput0 = textLayoutResult0.getLayoutInput();
                    return textLayoutInput0 == null ? Boolean.valueOf(Intrinsics.areEqual(annotatedString0, null)) : Boolean.valueOf(Intrinsics.areEqual(annotatedString0, textLayoutInput0.getText()));
                }
                return Boolean.valueOf(Intrinsics.areEqual(annotatedString0, null));
            }
            case 28: {
                return IntOffset.box-impl(((IntRect)this.x).getTopLeft-nOcc-ac());
            }
            default: {
                Object object0 = ((InputMethodManagerImpl)this.x).a.getContext().getSystemService("input_method");
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager)object0;
            }
        }
    }
}

