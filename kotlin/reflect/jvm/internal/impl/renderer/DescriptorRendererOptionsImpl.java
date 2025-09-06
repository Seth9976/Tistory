package kotlin.reflect.jvm.internal.impl.renderer;

import java.lang.reflect.Field;
import java.util.Set;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ye.k;
import ye.l;

@SourceDebugExtension({"SMAP\nDescriptorRendererOptionsImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DescriptorRendererOptionsImpl.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererOptionsImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,134:1\n1#2:135\n51#3,3:136\n*S KotlinDebug\n*F\n+ 1 DescriptorRendererOptionsImpl.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererOptionsImpl\n*L\n60#1:136,3\n*E\n"})
public final class DescriptorRendererOptionsImpl implements DescriptorRendererOptions {
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 A;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 B;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 C;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 D;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 E;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 F;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 G;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 H;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 I;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 J;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 K;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 L;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 M;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 N;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 O;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 P;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 Q;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 R;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 S;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 T;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 U;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 V;
    public static final KProperty[] W;
    public boolean a;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 b;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 c;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 d;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 e;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 f;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 g;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 h;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 i;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 j;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 k;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 l;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 m;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 n;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 o;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 p;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 q;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 r;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 s;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 t;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 u;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 v;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 w;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 x;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 y;
    public final DescriptorRendererOptionsImpl.property..inlined.vetoable.1 z;

    static {
        DescriptorRendererOptionsImpl.W = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "withDefinedIn", "getWithDefinedIn()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "modifiers", "getModifiers()Ljava/util/Set;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "startFromName", "getStartFromName()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "debugMode", "getDebugMode()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "verbose", "getVerbose()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "unitReturnType", "getUnitReturnType()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "withoutReturnType", "getWithoutReturnType()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "enhancedTypes", "getEnhancedTypes()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "renderDefaultModality", "getRenderDefaultModality()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "receiverAfterName", "getReceiverAfterName()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "informativeErrorType", "getInformativeErrorType()Z"))};
    }

    public DescriptorRendererOptionsImpl() {
        this.b = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(SOURCE_CODE_QUALIFIED.INSTANCE, this);
        this.c = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.TRUE, this);
        this.d = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.TRUE, this);
        this.e = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS, this);
        this.f = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.FALSE, this);
        this.g = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.FALSE, this);
        this.h = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.FALSE, this);
        this.i = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.FALSE, this);
        this.j = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.FALSE, this);
        this.k = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.TRUE, this);
        this.l = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.FALSE, this);
        this.m = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.FALSE, this);
        this.n = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.FALSE, this);
        this.o = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.TRUE, this);
        this.p = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.TRUE, this);
        this.q = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.FALSE, this);
        this.r = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.FALSE, this);
        this.s = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.FALSE, this);
        this.t = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.FALSE, this);
        this.u = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.FALSE, this);
        this.v = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.FALSE, this);
        this.w = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.FALSE, this);
        this.x = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(l.w, this);
        this.y = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(k.w, this);
        this.z = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.TRUE, this);
        this.A = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(OverrideRenderingPolicy.RENDER_OPEN, this);
        this.B = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(DEFAULT.INSTANCE, this);
        this.C = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(RenderingFormat.PLAIN, this);
        this.D = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(ParameterNameRenderingPolicy.ALL, this);
        this.E = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.FALSE, this);
        this.F = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.FALSE, this);
        this.G = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(PropertyAccessorRenderingPolicy.DEBUG, this);
        this.H = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.FALSE, this);
        this.I = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.FALSE, this);
        this.J = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(f0.emptySet(), this);
        this.K = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(ExcludedTypeAnnotations.INSTANCE.getInternalAnnotationsForResolve(), this);
        this.L = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(null, this);
        this.M = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS, this);
        this.N = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.FALSE, this);
        this.O = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.TRUE, this);
        this.P = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.TRUE, this);
        this.Q = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.FALSE, this);
        this.R = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.TRUE, this);
        this.S = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.TRUE, this);
        new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.FALSE, this);
        this.T = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.FALSE, this);
        this.U = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.FALSE, this);
        this.V = new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Boolean.TRUE, this);
    }

    @NotNull
    public final DescriptorRendererOptionsImpl copy() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl0 = new DescriptorRendererOptionsImpl();
        Class class0 = DescriptorRendererOptionsImpl.class;
        Field[] arr_field = class0.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(arr_field, "this::class.java.declaredFields");
        for(int v = 0; v < arr_field.length; ++v) {
            Field field0 = arr_field[v];
            if((field0.getModifiers() & 8) == 0) {
                field0.setAccessible(true);
                Object object0 = field0.get(this);
                ObservableProperty observableProperty0 = object0 instanceof ObservableProperty ? ((ObservableProperty)object0) : null;
                if(observableProperty0 != null) {
                    String s = field0.getName();
                    Intrinsics.checkNotNullExpressionValue(s, "field.name");
                    p.startsWith$default(s, "is", false, 2, null);
                    KClass kClass0 = Reflection.getOrCreateKotlinClass(class0);
                    String s1 = field0.getName();
                    StringBuilder stringBuilder0 = new StringBuilder("get");
                    String s2 = field0.getName();
                    Intrinsics.checkNotNullExpressionValue(s2, "field.name");
                    if(s2.length() > 0) {
                        String s3 = s2.substring(1);
                        Intrinsics.checkNotNullExpressionValue(s3, "this as java.lang.String).substring(startIndex)");
                        s2 = Character.toUpperCase(s2.charAt(0)) + s3;
                    }
                    stringBuilder0.append(s2);
                    field0.set(descriptorRendererOptionsImpl0, new DescriptorRendererOptionsImpl.property..inlined.vetoable.1(observableProperty0.getValue(this, new PropertyReference1Impl(kClass0, s1, stringBuilder0.toString())), descriptorRendererOptionsImpl0));
                }
            }
        }
        return descriptorRendererOptionsImpl0;
    }

    public boolean getActualPropertiesInPrimaryConstructor() {
        return ((Boolean)this.s.getValue(this, DescriptorRendererOptionsImpl.W[17])).booleanValue();
    }

    public boolean getAlwaysRenderModifiers() {
        return ((Boolean)this.N.getValue(this, DescriptorRendererOptionsImpl.W[38])).booleanValue();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    @NotNull
    public AnnotationArgumentsRenderingPolicy getAnnotationArgumentsRenderingPolicy() {
        return (AnnotationArgumentsRenderingPolicy)this.M.getValue(this, DescriptorRendererOptionsImpl.W[37]);
    }

    @Nullable
    public Function1 getAnnotationFilter() {
        return (Function1)this.L.getValue(this, DescriptorRendererOptionsImpl.W[36]);
    }

    public boolean getBoldOnlyForNamesInHtml() {
        return ((Boolean)this.U.getValue(this, DescriptorRendererOptionsImpl.W[46])).booleanValue();
    }

    public boolean getClassWithPrimaryConstructor() {
        return ((Boolean)this.i.getValue(this, DescriptorRendererOptionsImpl.W[7])).booleanValue();
    }

    @NotNull
    public ClassifierNamePolicy getClassifierNamePolicy() {
        return (ClassifierNamePolicy)this.b.getValue(this, DescriptorRendererOptionsImpl.W[0]);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getDebugMode() {
        return ((Boolean)this.h.getValue(this, DescriptorRendererOptionsImpl.W[6])).booleanValue();
    }

    @Nullable
    public Function1 getDefaultParameterValueRenderer() {
        return (Function1)this.y.getValue(this, DescriptorRendererOptionsImpl.W[23]);
    }

    public boolean getEachAnnotationOnNewLine() {
        return ((Boolean)this.I.getValue(this, DescriptorRendererOptionsImpl.W[33])).booleanValue();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getEnhancedTypes() {
        return ((Boolean)this.m.getValue(this, DescriptorRendererOptionsImpl.W[11])).booleanValue();
    }

    @NotNull
    public Set getExcludedAnnotationClasses() {
        return (Set)this.J.getValue(this, DescriptorRendererOptionsImpl.W[34]);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    @NotNull
    public Set getExcludedTypeAnnotationClasses() {
        return (Set)this.K.getValue(this, DescriptorRendererOptionsImpl.W[35]);
    }

    public boolean getIncludeAdditionalModifiers() {
        return ((Boolean)this.R.getValue(this, DescriptorRendererOptionsImpl.W[42])).booleanValue();
    }

    public boolean getIncludeAnnotationArguments() {
        return DefaultImpls.getIncludeAnnotationArguments(this);
    }

    public boolean getIncludeEmptyAnnotationArguments() {
        return DefaultImpls.getIncludeEmptyAnnotationArguments(this);
    }

    public boolean getIncludePropertyConstant() {
        return ((Boolean)this.u.getValue(this, DescriptorRendererOptionsImpl.W[19])).booleanValue();
    }

    public boolean getInformativeErrorType() {
        return ((Boolean)this.V.getValue(this, DescriptorRendererOptionsImpl.W[0x2F])).booleanValue();
    }

    @NotNull
    public Set getModifiers() {
        return (Set)this.e.getValue(this, DescriptorRendererOptionsImpl.W[3]);
    }

    public boolean getNormalizedVisibilities() {
        return ((Boolean)this.n.getValue(this, DescriptorRendererOptionsImpl.W[12])).booleanValue();
    }

    @NotNull
    public OverrideRenderingPolicy getOverrideRenderingPolicy() {
        return (OverrideRenderingPolicy)this.A.getValue(this, DescriptorRendererOptionsImpl.W[25]);
    }

    @NotNull
    public ParameterNameRenderingPolicy getParameterNameRenderingPolicy() {
        return (ParameterNameRenderingPolicy)this.D.getValue(this, DescriptorRendererOptionsImpl.W[28]);
    }

    public boolean getParameterNamesInFunctionalTypes() {
        return ((Boolean)this.S.getValue(this, DescriptorRendererOptionsImpl.W[43])).booleanValue();
    }

    public boolean getPresentableUnresolvedTypes() {
        return ((Boolean)this.T.getValue(this, DescriptorRendererOptionsImpl.W[45])).booleanValue();
    }

    @NotNull
    public PropertyAccessorRenderingPolicy getPropertyAccessorRenderingPolicy() {
        return (PropertyAccessorRenderingPolicy)this.G.getValue(this, DescriptorRendererOptionsImpl.W[0x1F]);
    }

    public boolean getReceiverAfterName() {
        return ((Boolean)this.E.getValue(this, DescriptorRendererOptionsImpl.W[29])).booleanValue();
    }

    public boolean getRenderCompanionObjectName() {
        return ((Boolean)this.F.getValue(this, DescriptorRendererOptionsImpl.W[30])).booleanValue();
    }

    public boolean getRenderConstructorDelegation() {
        return ((Boolean)this.q.getValue(this, DescriptorRendererOptionsImpl.W[15])).booleanValue();
    }

    public boolean getRenderConstructorKeyword() {
        return ((Boolean)this.O.getValue(this, DescriptorRendererOptionsImpl.W[39])).booleanValue();
    }

    public boolean getRenderDefaultAnnotationArguments() {
        return ((Boolean)this.H.getValue(this, DescriptorRendererOptionsImpl.W[0x20])).booleanValue();
    }

    public boolean getRenderDefaultModality() {
        return ((Boolean)this.p.getValue(this, DescriptorRendererOptionsImpl.W[14])).booleanValue();
    }

    public boolean getRenderDefaultVisibility() {
        return ((Boolean)this.o.getValue(this, DescriptorRendererOptionsImpl.W[13])).booleanValue();
    }

    public boolean getRenderPrimaryConstructorParametersAsProperties() {
        return ((Boolean)this.r.getValue(this, DescriptorRendererOptionsImpl.W[16])).booleanValue();
    }

    public boolean getRenderTypeExpansions() {
        return ((Boolean)this.Q.getValue(this, DescriptorRendererOptionsImpl.W[41])).booleanValue();
    }

    public boolean getRenderUnabbreviatedType() {
        return ((Boolean)this.P.getValue(this, DescriptorRendererOptionsImpl.W[40])).booleanValue();
    }

    public boolean getSecondaryConstructorsAsPrimary() {
        return ((Boolean)this.z.getValue(this, DescriptorRendererOptionsImpl.W[24])).booleanValue();
    }

    public boolean getStartFromDeclarationKeyword() {
        return ((Boolean)this.g.getValue(this, DescriptorRendererOptionsImpl.W[5])).booleanValue();
    }

    public boolean getStartFromName() {
        return ((Boolean)this.f.getValue(this, DescriptorRendererOptionsImpl.W[4])).booleanValue();
    }

    @NotNull
    public RenderingFormat getTextFormat() {
        return (RenderingFormat)this.C.getValue(this, DescriptorRendererOptionsImpl.W[27]);
    }

    @NotNull
    public Function1 getTypeNormalizer() {
        return (Function1)this.x.getValue(this, DescriptorRendererOptionsImpl.W[22]);
    }

    public boolean getUninferredTypeParameterAsName() {
        return ((Boolean)this.t.getValue(this, DescriptorRendererOptionsImpl.W[18])).booleanValue();
    }

    public boolean getUnitReturnType() {
        return ((Boolean)this.k.getValue(this, DescriptorRendererOptionsImpl.W[9])).booleanValue();
    }

    @NotNull
    public ValueParametersHandler getValueParametersHandler() {
        return (ValueParametersHandler)this.B.getValue(this, DescriptorRendererOptionsImpl.W[26]);
    }

    public boolean getVerbose() {
        return ((Boolean)this.j.getValue(this, DescriptorRendererOptionsImpl.W[8])).booleanValue();
    }

    public boolean getWithDefinedIn() {
        return ((Boolean)this.c.getValue(this, DescriptorRendererOptionsImpl.W[1])).booleanValue();
    }

    public boolean getWithSourceFileForTopLevel() {
        return ((Boolean)this.d.getValue(this, DescriptorRendererOptionsImpl.W[2])).booleanValue();
    }

    public boolean getWithoutReturnType() {
        return ((Boolean)this.l.getValue(this, DescriptorRendererOptionsImpl.W[10])).booleanValue();
    }

    public boolean getWithoutSuperTypes() {
        return ((Boolean)this.w.getValue(this, DescriptorRendererOptionsImpl.W[21])).booleanValue();
    }

    public boolean getWithoutTypeParameters() {
        return ((Boolean)this.v.getValue(this, DescriptorRendererOptionsImpl.W[20])).booleanValue();
    }

    public final boolean isLocked() {
        return this.a;
    }

    public final void lock() {
        this.a = true;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setAnnotationArgumentsRenderingPolicy(@NotNull AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy0) {
        Intrinsics.checkNotNullParameter(annotationArgumentsRenderingPolicy0, "<set-?>");
        this.M.setValue(this, DescriptorRendererOptionsImpl.W[37], annotationArgumentsRenderingPolicy0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setClassifierNamePolicy(@NotNull ClassifierNamePolicy classifierNamePolicy0) {
        Intrinsics.checkNotNullParameter(classifierNamePolicy0, "<set-?>");
        this.b.setValue(this, DescriptorRendererOptionsImpl.W[0], classifierNamePolicy0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setDebugMode(boolean z) {
        this.h.setValue(this, DescriptorRendererOptionsImpl.W[6], Boolean.valueOf(z));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setExcludedTypeAnnotationClasses(@NotNull Set set0) {
        Intrinsics.checkNotNullParameter(set0, "<set-?>");
        this.K.setValue(this, DescriptorRendererOptionsImpl.W[35], set0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setModifiers(@NotNull Set set0) {
        Intrinsics.checkNotNullParameter(set0, "<set-?>");
        this.e.setValue(this, DescriptorRendererOptionsImpl.W[3], set0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setParameterNameRenderingPolicy(@NotNull ParameterNameRenderingPolicy parameterNameRenderingPolicy0) {
        Intrinsics.checkNotNullParameter(parameterNameRenderingPolicy0, "<set-?>");
        this.D.setValue(this, DescriptorRendererOptionsImpl.W[28], parameterNameRenderingPolicy0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setReceiverAfterName(boolean z) {
        this.E.setValue(this, DescriptorRendererOptionsImpl.W[29], Boolean.valueOf(z));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setRenderCompanionObjectName(boolean z) {
        this.F.setValue(this, DescriptorRendererOptionsImpl.W[30], Boolean.valueOf(z));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setStartFromName(boolean z) {
        this.f.setValue(this, DescriptorRendererOptionsImpl.W[4], Boolean.valueOf(z));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setTextFormat(@NotNull RenderingFormat renderingFormat0) {
        Intrinsics.checkNotNullParameter(renderingFormat0, "<set-?>");
        this.C.setValue(this, DescriptorRendererOptionsImpl.W[27], renderingFormat0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setVerbose(boolean z) {
        this.j.setValue(this, DescriptorRendererOptionsImpl.W[8], Boolean.valueOf(z));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithDefinedIn(boolean z) {
        this.c.setValue(this, DescriptorRendererOptionsImpl.W[1], Boolean.valueOf(z));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutSuperTypes(boolean z) {
        this.w.setValue(this, DescriptorRendererOptionsImpl.W[21], Boolean.valueOf(z));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutTypeParameters(boolean z) {
        this.v.setValue(this, DescriptorRendererOptionsImpl.W[20], Boolean.valueOf(z));
    }
}

