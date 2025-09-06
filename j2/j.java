package j2;

import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt;
import androidx.compose.foundation.text.input.internal.CursorAnchorInfoController;
import androidx.compose.foundation.text.input.internal.InputMethodManagerImpl;
import androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.navigation.NavController;
import androidx.navigation.NavInflater;
import com.google.accompanist.drawablepainter.DrawablePainter.callback.2.1;
import com.google.accompanist.drawablepainter.DrawablePainter;
import com.kakao.kandinsky.preview.PreviewGestureController;
import com.kakao.kphotopicker.MediaItemSelectHandler;
import com.kakao.kphotopicker.PickerViewModel;
import com.kakao.kphotopicker.PreviewFragment;
import com.kakao.kphotopicker.SingleItemSelectHandler;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jb.b0;
import k0.d;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.collections.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.CompositePackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope.DefaultImpls;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.AbstractLongTimeSource;
import n1.h;

public final class j extends Lambda implements Function0 {
    public final int w;
    public final Object x;

    public j(Object object0, int v) {
        this.w = v;
        this.x = object0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                return new BaseInputConnection(((TextInputServiceAndroid)this.x).getView(), false);
            }
            case 1: {
                PickerViewModel pickerViewModel0 = (PickerViewModel)this.x;
                return pickerViewModel0.isSinglePick() ? new SingleItemSelectHandler(pickerViewModel0, PickerViewModel.access$getSelectedMediaManager$p(pickerViewModel0)) : new MediaItemSelectHandler(pickerViewModel0, PickerViewModel.access$getSelectedMediaManager$p(pickerViewModel0));
            }
            case 2: {
                PreviewFragment previewFragment0 = (PreviewFragment)this.x;
                PickerViewModel pickerViewModel1 = PreviewFragment.access$getPickerViewModel$p(previewFragment0);
                if(pickerViewModel1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                    pickerViewModel1 = null;
                }
                pickerViewModel1.requestCountOverMessage(new b0(previewFragment0, 1));
                return Unit.INSTANCE;
            }
            case 3: {
                SimpleType simpleType0 = JvmBuiltInsCustomizer.access$getModuleDescriptor$p(((JvmBuiltInsCustomizer)this.x)).getBuiltIns().getAnyType();
                Intrinsics.checkNotNullExpressionValue(simpleType0, "moduleDescriptor.builtIns.anyType");
                return simpleType0;
            }
            case 4: {
                return ComposeInputMethodManager_androidKt.ComposeInputMethodManager(DelegatableNode_androidKt.requireView(((d)this.x)));
            }
            case 5: {
                return (MemberScope)ScopesHolderForClass.access$getScopeFactory$p(((ScopesHolderForClass)this.x)).invoke(ScopesHolderForClass.access$getKotlinTypeRefinerForOwnerModule$p(((ScopesHolderForClass)this.x)));
            }
            case 6: {
                return this.x;
            }
            case 7: {
                return ArrayIteratorKt.iterator(((Object[])this.x));
            }
            case 8: {
                return ArrayIteratorsKt.iterator(((float[])this.x));
            }
            case 9: {
                return ArrayIteratorsKt.iterator(((double[])this.x));
            }
            case 10: {
                return ArrayIteratorsKt.iterator(((boolean[])this.x));
            }
            case 11: {
                return ArrayIteratorsKt.iterator(((char[])this.x));
            }
            case 12: {
                return ((Iterable)this.x).iterator();
            }
            case 13: {
                ModuleDescriptorImpl moduleDescriptorImpl0 = (ModuleDescriptorImpl)this.x;
                ModuleDependencies moduleDependencies0 = ModuleDescriptorImpl.access$getDependencies$p(moduleDescriptorImpl0);
                if(moduleDependencies0 == null) {
                    throw new AssertionError("Dependencies of module " + ModuleDescriptorImpl.access$getId(moduleDescriptorImpl0) + " were not set before querying module content");
                }
                List list0 = moduleDependencies0.getAllDependencies();
                moduleDescriptorImpl0.assertValid();
                list0.contains(moduleDescriptorImpl0);
                Iterator iterator0 = list0.iterator();
                while(iterator0.hasNext()) {
                    iterator0.next();
                }
                ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
                for(Object object0: list0) {
                    PackageFragmentProvider packageFragmentProvider0 = ModuleDescriptorImpl.access$getPackageFragmentProviderForModuleContent$p(((ModuleDescriptorImpl)object0));
                    Intrinsics.checkNotNull(packageFragmentProvider0);
                    arrayList0.add(packageFragmentProvider0);
                }
                return new CompositePackageFragmentProvider(arrayList0, "CompositeProvider@ModuleDescriptor for " + moduleDescriptorImpl0.getName());
            }
            case 14: {
                return ((b)this.x).f.refineSupertypes(((b)this.x).i);
            }
            case 15: {
                return TypeParameterUtilsKt.computeConstructorTypeParameters(((DeserializedClassDescriptor)this.x));
            }
            case 16: {
                ((f)this.x).getClass();
                HashSet hashSet0 = new HashSet();
                DeserializedClassDescriptor deserializedClassDescriptor0 = ((f)this.x).d;
                for(Object object1: deserializedClassDescriptor0.getTypeConstructor().getSupertypes()) {
                    for(Object object2: DefaultImpls.getContributedDescriptors$default(((KotlinType)object1).getMemberScope(), null, null, 3, null)) {
                        DeclarationDescriptor declarationDescriptor0 = (DeclarationDescriptor)object2;
                        if(declarationDescriptor0 instanceof SimpleFunctionDescriptor || declarationDescriptor0 instanceof PropertyDescriptor) {
                            hashSet0.add(declarationDescriptor0.getName());
                        }
                    }
                }
                List list1 = deserializedClassDescriptor0.getClassProto().getFunctionList();
                Intrinsics.checkNotNullExpressionValue(list1, "classProto.functionList");
                for(Object object3: list1) {
                    hashSet0.add(NameResolverUtilKt.getName(deserializedClassDescriptor0.getC().getNameResolver(), ((Function)object3).getName()));
                }
                List list2 = deserializedClassDescriptor0.getClassProto().getPropertyList();
                Intrinsics.checkNotNullExpressionValue(list2, "classProto.propertyList");
                for(Object object4: list2) {
                    hashSet0.add(NameResolverUtilKt.getName(deserializedClassDescriptor0.getC().getNameResolver(), ((Property)object4).getName()));
                }
                return g0.plus(hashSet0, hashSet0);
            }
            case 17: {
                return StringsKt__StringsKt.iterator(((CharSequence)this.x));
            }
            case 18: {
                return new DrawablePainter.callback.2.1(((DrawablePainter)this.x));
            }
            case 19: {
                return BuiltInAnnotationDescriptor.access$getBuiltIns$p(((BuiltInAnnotationDescriptor)this.x)).getBuiltInClassByFqName(((BuiltInAnnotationDescriptor)this.x).getFqName()).getDefaultType();
            }
            case 20: {
                return "createInputConnection(value=\"" + ((TransformedTextFieldState)this.x).getVisualText() + "\")";
            }
            case 21: {
                return ((CursorAnchorInfoController)this.x).a();
            }
            case 22: {
                Object object5 = ((InputMethodManagerImpl)this.x).a.getContext().getSystemService("input_method");
                Intrinsics.checkNotNull(object5, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager)object5;
            }
            case 23: {
                return new BaseInputConnection(((LegacyTextInputMethodRequest)this.x).getView(), false);
            }
            case 24: {
                ShaderBrushSpan shaderBrushSpan0 = (ShaderBrushSpan)this.x;
                return shaderBrushSpan0.getSize-NH-jbRc() != 0x7FC000007FC00000L && !Size.isEmpty-impl(shaderBrushSpan0.getSize-NH-jbRc()) ? shaderBrushSpan0.getShaderBrush().createShader-uvyYCjk(shaderBrushSpan0.getSize-NH-jbRc()) : null;
            }
            case 25: {
                return ((AbstractLongTimeSource)this.x).read();
            }
            case 26: {
                n1.b b0 = (n1.b)this.x;
                h h0 = b0.p;
                if(h0 == null) {
                    h0 = new h();  // 初始化器: Ljava/lang/Object;-><init>()V
                    b0.p = h0;
                }
                if(h0.b == null) {
                    GraphicsContext graphicsContext0 = DelegatableNodeKt.requireGraphicsContext(b0);
                    h0.a();
                    h0.b = graphicsContext0;
                }
                return h0;
            }
            case 27: {
                NavController navController0 = (NavController)this.x;
                NavInflater navInflater0 = NavController.access$getInflater$p(navController0);
                return navInflater0 == null ? new NavInflater(navController0.getContext(), NavController.access$get_navigatorProvider$p(navController0)) : navInflater0;
            }
            case 28: {
                return Boolean.valueOf(!((PreviewGestureController)this.x).getGestureMatrix().isIdentity());
            }
            default: {
                ((TextAnnotatedStringNode)this.x).clearSubstitution$foundation_release();
                TextAnnotatedStringNode.access$invalidateForTranslate(((TextAnnotatedStringNode)this.x));
                return true;
            }
        }
    }
}

