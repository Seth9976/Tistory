package kotlin.jvm.internal;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.SinceKotlin;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KCallable;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KType;
import kotlin.reflect.KVisibility;

public abstract class CallableReference implements Serializable, KCallable {
    @SinceKotlin(version = "1.1")
    public static final Object NO_RECEIVER;
    @SinceKotlin(version = "1.4")
    private final boolean isTopLevel;
    @SinceKotlin(version = "1.4")
    private final String name;
    @SinceKotlin(version = "1.4")
    private final Class owner;
    @SinceKotlin(version = "1.1")
    protected final Object receiver;
    private transient KCallable reflected;
    @SinceKotlin(version = "1.4")
    private final String signature;

    static {
        CallableReference.NO_RECEIVER = i.a;
    }

    public CallableReference() {
        this(CallableReference.NO_RECEIVER);
    }

    @SinceKotlin(version = "1.1")
    public CallableReference(Object object0) {
        this(object0, null, null, null, false);
    }

    @SinceKotlin(version = "1.4")
    public CallableReference(Object object0, Class class0, String s, String s1, boolean z) {
        this.receiver = object0;
        this.owner = class0;
        this.name = s;
        this.signature = s1;
        this.isTopLevel = z;
    }

    @Override  // kotlin.reflect.KCallable
    public Object call(Object[] arr_object) {
        return this.getReflected().call(arr_object);
    }

    @Override  // kotlin.reflect.KCallable
    public Object callBy(Map map0) {
        return this.getReflected().callBy(map0);
    }

    @SinceKotlin(version = "1.1")
    public KCallable compute() {
        KCallable kCallable0 = this.reflected;
        if(kCallable0 == null) {
            kCallable0 = this.computeReflected();
            this.reflected = kCallable0;
        }
        return kCallable0;
    }

    public abstract KCallable computeReflected();

    @Override  // kotlin.reflect.KAnnotatedElement
    public List getAnnotations() {
        return this.getReflected().getAnnotations();
    }

    @SinceKotlin(version = "1.1")
    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override  // kotlin.reflect.KCallable
    public String getName() {
        return this.name;
    }

    public KDeclarationContainer getOwner() {
        Class class0 = this.owner;
        if(class0 == null) {
            return null;
        }
        return this.isTopLevel ? Reflection.getOrCreateKotlinPackage(class0) : Reflection.getOrCreateKotlinClass(class0);
    }

    @Override  // kotlin.reflect.KCallable
    public List getParameters() {
        return this.getReflected().getParameters();
    }

    @SinceKotlin(version = "1.1")
    public KCallable getReflected() {
        KCallable kCallable0 = this.compute();
        if(kCallable0 == this) {
            throw new KotlinReflectionNotSupportedError();
        }
        return kCallable0;
    }

    @Override  // kotlin.reflect.KCallable
    public KType getReturnType() {
        return this.getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override  // kotlin.reflect.KCallable
    @SinceKotlin(version = "1.1")
    public List getTypeParameters() {
        return this.getReflected().getTypeParameters();
    }

    @Override  // kotlin.reflect.KCallable
    @SinceKotlin(version = "1.1")
    public KVisibility getVisibility() {
        return this.getReflected().getVisibility();
    }

    @Override  // kotlin.reflect.KCallable
    @SinceKotlin(version = "1.1")
    public boolean isAbstract() {
        return this.getReflected().isAbstract();
    }

    @Override  // kotlin.reflect.KCallable
    @SinceKotlin(version = "1.1")
    public boolean isFinal() {
        return this.getReflected().isFinal();
    }

    @Override  // kotlin.reflect.KCallable
    @SinceKotlin(version = "1.1")
    public boolean isOpen() {
        return this.getReflected().isOpen();
    }

    @Override  // kotlin.reflect.KCallable
    @SinceKotlin(version = "1.3")
    public boolean isSuspend() {
        return this.getReflected().isSuspend();
    }
}

