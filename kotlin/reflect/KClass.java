package kotlin.reflect;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001E\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005J\u0013\u0010D\u001A\u00020\u000E2\b\u0010E\u001A\u0004\u0018\u00010\u0002H\u00A6\u0002J\b\u0010F\u001A\u00020GH&J\u0012\u0010H\u001A\u00020\u000E2\b\u0010I\u001A\u0004\u0018\u00010\u0002H\'R$\u0010\u0006\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007X\u00A6\u0004\u00A2\u0006\f\u0012\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u001A\u0010\r\u001A\u00020\u000E8&X\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b\u000F\u0010\n\u001A\u0004\b\r\u0010\u0010R\u001A\u0010\u0011\u001A\u00020\u000E8&X\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b\u0012\u0010\n\u001A\u0004\b\u0011\u0010\u0010R\u001A\u0010\u0013\u001A\u00020\u000E8&X\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b\u0014\u0010\n\u001A\u0004\b\u0013\u0010\u0010R\u001A\u0010\u0015\u001A\u00020\u000E8&X\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b\u0016\u0010\n\u001A\u0004\b\u0015\u0010\u0010R\u001A\u0010\u0017\u001A\u00020\u000E8&X\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b\u0018\u0010\n\u001A\u0004\b\u0017\u0010\u0010R\u001A\u0010\u0019\u001A\u00020\u000E8&X\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b\u001A\u0010\n\u001A\u0004\b\u0019\u0010\u0010R\u001A\u0010\u001B\u001A\u00020\u000E8&X\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b\u001C\u0010\n\u001A\u0004\b\u001B\u0010\u0010R\u001A\u0010\u001D\u001A\u00020\u000E8&X\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b\u001E\u0010\n\u001A\u0004\b\u001D\u0010\u0010R\u001A\u0010\u001F\u001A\u00020\u000E8&X\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b \u0010\n\u001A\u0004\b\u001F\u0010\u0010R\"\u0010!\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\"0\u0007X\u00A6\u0004\u00A2\u0006\f\u0012\u0004\b#\u0010\n\u001A\u0004\b$\u0010\fR\"\u0010%\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\u0007X\u00A6\u0004\u00A2\u0006\f\u0012\u0004\b&\u0010\n\u001A\u0004\b\'\u0010\fR\u001A\u0010(\u001A\u0004\u0018\u00018\u0000X\u00A6\u0004\u00A2\u0006\f\u0012\u0004\b)\u0010\n\u001A\u0004\b*\u0010+R\u0014\u0010,\u001A\u0004\u0018\u00010-X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b.\u0010/R(\u00100\u001A\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000018&X\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b2\u0010\n\u001A\u0004\b3\u00104R\u0014\u00105\u001A\u0004\u0018\u00010-X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b6\u0010/R \u00107\u001A\b\u0012\u0004\u0012\u000208018&X\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b9\u0010\n\u001A\u0004\b:\u00104R \u0010;\u001A\b\u0012\u0004\u0012\u00020<018&X\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b=\u0010\n\u001A\u0004\b>\u00104R\u001C\u0010?\u001A\u0004\u0018\u00010@8&X\u00A7\u0004\u00A2\u0006\f\u0012\u0004\bA\u0010\n\u001A\u0004\bB\u0010C\u00A8\u0006J"}, d2 = {"Lkotlin/reflect/KClass;", "T", "", "Lkotlin/reflect/KDeclarationContainer;", "Lkotlin/reflect/KAnnotatedElement;", "Lkotlin/reflect/KClassifier;", "constructors", "", "Lkotlin/reflect/KFunction;", "getConstructors$annotations", "()V", "getConstructors", "()Ljava/util/Collection;", "isAbstract", "", "isAbstract$annotations", "()Z", "isCompanion", "isCompanion$annotations", "isData", "isData$annotations", "isFinal", "isFinal$annotations", "isFun", "isFun$annotations", "isInner", "isInner$annotations", "isOpen", "isOpen$annotations", "isSealed", "isSealed$annotations", "isValue", "isValue$annotations", "members", "Lkotlin/reflect/KCallable;", "getMembers$annotations", "getMembers", "nestedClasses", "getNestedClasses$annotations", "getNestedClasses", "objectInstance", "getObjectInstance$annotations", "getObjectInstance", "()Ljava/lang/Object;", "qualifiedName", "", "getQualifiedName", "()Ljava/lang/String;", "sealedSubclasses", "", "getSealedSubclasses$annotations", "getSealedSubclasses", "()Ljava/util/List;", "simpleName", "getSimpleName", "supertypes", "Lkotlin/reflect/KType;", "getSupertypes$annotations", "getSupertypes", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters$annotations", "getTypeParameters", "visibility", "Lkotlin/reflect/KVisibility;", "getVisibility$annotations", "getVisibility", "()Lkotlin/reflect/KVisibility;", "equals", "other", "hashCode", "", "isInstance", "value", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface KClass extends KAnnotatedElement, KClassifier, KDeclarationContainer {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void getConstructors$annotations() {
        }

        public static void getMembers$annotations() {
        }

        public static void getNestedClasses$annotations() {
        }

        public static void getObjectInstance$annotations() {
        }

        @SinceKotlin(version = "1.3")
        public static void getSealedSubclasses$annotations() {
        }

        @SinceKotlin(version = "1.1")
        public static void getSupertypes$annotations() {
        }

        @SinceKotlin(version = "1.1")
        public static void getTypeParameters$annotations() {
        }

        @SinceKotlin(version = "1.1")
        public static void getVisibility$annotations() {
        }

        @SinceKotlin(version = "1.1")
        public static void isAbstract$annotations() {
        }

        @SinceKotlin(version = "1.1")
        public static void isCompanion$annotations() {
        }

        @SinceKotlin(version = "1.1")
        public static void isData$annotations() {
        }

        @SinceKotlin(version = "1.1")
        public static void isFinal$annotations() {
        }

        @SinceKotlin(version = "1.4")
        public static void isFun$annotations() {
        }

        @SinceKotlin(version = "1.1")
        public static void isInner$annotations() {
        }

        @SinceKotlin(version = "1.1")
        public static void isOpen$annotations() {
        }

        @SinceKotlin(version = "1.1")
        public static void isSealed$annotations() {
        }

        @SinceKotlin(version = "1.5")
        public static void isValue$annotations() {
        }
    }

    @Override
    boolean equals(@Nullable Object arg1);

    @NotNull
    Collection getConstructors();

    @Override  // kotlin.reflect.KDeclarationContainer
    @NotNull
    Collection getMembers();

    @NotNull
    Collection getNestedClasses();

    @Nullable
    Object getObjectInstance();

    @Nullable
    String getQualifiedName();

    @NotNull
    List getSealedSubclasses();

    @Nullable
    String getSimpleName();

    @NotNull
    List getSupertypes();

    @NotNull
    List getTypeParameters();

    @Nullable
    KVisibility getVisibility();

    @Override
    int hashCode();

    boolean isAbstract();

    boolean isCompanion();

    boolean isData();

    boolean isFinal();

    boolean isFun();

    boolean isInner();

    @SinceKotlin(version = "1.1")
    boolean isInstance(@Nullable Object arg1);

    boolean isOpen();

    boolean isSealed();

    boolean isValue();
}

