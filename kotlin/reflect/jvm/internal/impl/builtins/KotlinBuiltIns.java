package kotlin.reflect.jvm.internal.impl.builtins;

import he.a;
import he.b;
import he.c;
import he.d;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider.None;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter.NoPlatformDependent;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class KotlinBuiltIns {
    public static final Name BUILTINS_MODULE_NAME;
    public ModuleDescriptorImpl a;
    public final NotNullLazyValue b;
    public final NotNullLazyValue c;
    public final MemoizedFunctionToNotNull d;
    public final StorageManager e;

    static {
        KotlinBuiltIns.BUILTINS_MODULE_NAME = Name.special("<built-ins module>");
    }

    public KotlinBuiltIns(@NotNull StorageManager storageManager0) {
        if(storageManager0 != null) {
            super();
            this.e = storageManager0;
            this.c = storageManager0.createLazyValue(new a(this, 0));
            this.b = storageManager0.createLazyValue(new a(this, 1));
            this.d = storageManager0.createMemoizedFunction(new b(this, 0));
            return;
        }
        KotlinBuiltIns.a(0);
        throw null;
    }

    public static void a(int v) {
        IllegalArgumentException illegalArgumentException0;
        int v1;
        String s;
        switch(v) {
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 11: 
            case 13: 
            case 15: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 30: 
            case 0x1F: 
            case 0x20: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 38: 
            case 39: 
            case 40: 
            case 41: 
            case 42: 
            case 43: 
            case 44: 
            case 45: 
            case 0x2F: 
            case 0x30: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 54: 
            case 55: 
            case 56: 
            case 57: 
            case 58: 
            case 59: 
            case 60: 
            case 61: 
            case 62: 
            case 0x3F: 
            case 0x40: 
            case 65: 
            case 66: 
            case 68: 
            case 69: 
            case 70: 
            case 74: 
            case 81: 
            case 84: 
            case 86: 
            case 87: {
                s = "@NotNull method %s.%s must not return null";
                break;
            }
            default: {
                s = "Argument for @NotNull parameter \'%s\' of %s.%s must not be null";
            }
        }
        switch(v) {
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 11: 
            case 13: 
            case 15: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 30: 
            case 0x1F: 
            case 0x20: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 38: 
            case 39: 
            case 40: 
            case 41: 
            case 42: 
            case 43: 
            case 44: 
            case 45: 
            case 0x2F: 
            case 0x30: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 54: 
            case 55: 
            case 56: 
            case 57: 
            case 58: 
            case 59: 
            case 60: 
            case 61: 
            case 62: 
            case 0x3F: 
            case 0x40: 
            case 65: 
            case 66: 
            case 68: 
            case 69: 
            case 70: 
            case 74: 
            case 81: 
            case 84: 
            case 86: 
            case 87: {
                v1 = 2;
                break;
            }
            default: {
                v1 = 3;
            }
        }
        Object[] arr_object = new Object[v1];
        switch(v) {
            case 2: {
                arr_object[0] = "computation";
                break;
            }
            case 14: {
                arr_object[0] = "simpleName";
                break;
            }
            case 46: {
                arr_object[0] = "classSimpleName";
                break;
            }
            case 67: {
                arr_object[0] = "arrayType";
                break;
            }
            case 71: {
                arr_object[0] = "notNullArrayType";
                break;
            }
            case 1: 
            case 72: {
                arr_object[0] = "module";
                break;
            }
            case 73: {
                arr_object[0] = "primitiveType";
                break;
            }
            case 75: {
                arr_object[0] = "kotlinType";
                break;
            }
            case 80: {
                arr_object[0] = "annotations";
                break;
            }
            case 78: 
            case 82: {
                arr_object[0] = "projectionType";
                break;
            }
            case 0x4F: 
            case 83: 
            case 85: {
                arr_object[0] = "argument";
                break;
            }
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 11: 
            case 13: 
            case 15: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 30: 
            case 0x1F: 
            case 0x20: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 38: 
            case 39: 
            case 40: 
            case 41: 
            case 42: 
            case 43: 
            case 44: 
            case 45: 
            case 0x2F: 
            case 0x30: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 54: 
            case 55: 
            case 56: 
            case 57: 
            case 58: 
            case 59: 
            case 60: 
            case 61: 
            case 62: 
            case 0x3F: 
            case 0x40: 
            case 65: 
            case 66: 
            case 68: 
            case 69: 
            case 70: 
            case 74: 
            case 81: 
            case 84: 
            case 86: 
            case 87: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            }
            case 101: {
                arr_object[0] = "typeConstructor";
                break;
            }
            case 0x70: {
                arr_object[0] = "classDescriptor";
                break;
            }
            case 12: 
            case 98: 
            case 100: 
            case 102: 
            case 104: 
            case 106: 
            case 0x87: {
                arr_object[0] = "fqName";
                break;
            }
            case 9: 
            case 10: 
            case 76: 
            case 77: 
            case 89: 
            case 0x60: 
            case 103: 
            case 107: 
            case 108: 
            case 0x8F: 
            case 0x92: 
            case 0x93: 
            case 0x95: 
            case 0x9D: 
            case 0x9E: 
            case 0x9F: 
            case 0xA0: {
                arr_object[0] = "descriptor";
                break;
            }
            case 0xA1: {
                arr_object[0] = "declarationDescriptor";
                break;
            }
            case 16: 
            case 17: 
            case 53: 
            case 88: 
            case 90: 
            case 91: 
            case 92: 
            case 93: 
            case 94: 
            case 0x5F: 
            case 97: 
            case 99: 
            case 105: 
            case 109: 
            case 110: 
            case 0x6F: 
            case 0x71: 
            case 0x72: 
            case 0x73: 
            case 0x74: 
            case 0x75: 
            case 0x76: 
            case 0x77: 
            case 120: 
            case 0x79: 
            case 0x7A: 
            case 0x7B: 
            case 0x7C: 
            case 0x7D: 
            case 0x7E: 
            case 0x7F: 
            case 0x80: 
            case 0x81: 
            case 130: 
            case 0x83: 
            case 0x84: 
            case 0x85: 
            case 0x86: 
            case 0x88: 
            case 0x89: 
            case 0x8A: 
            case 0x8B: 
            case 140: 
            case 0x8D: 
            case 0x8E: 
            case 0x90: 
            case 0x91: 
            case 0x94: 
            case 150: 
            case 0x97: 
            case 0x98: 
            case 0x99: 
            case 0x9A: 
            case 0x9B: 
            case 0x9C: 
            case 0xA2: {
                arr_object[0] = "type";
                break;
            }
            default: {
                arr_object[0] = "storageManager";
            }
        }
        switch(v) {
            case 3: {
                arr_object[1] = "getAdditionalClassPartsProvider";
                break;
            }
            case 4: {
                arr_object[1] = "getPlatformDependentDeclarationFilter";
                break;
            }
            case 5: {
                arr_object[1] = "getClassDescriptorFactories";
                break;
            }
            case 6: {
                arr_object[1] = "getStorageManager";
                break;
            }
            case 7: {
                arr_object[1] = "getBuiltInsModule";
                break;
            }
            case 8: {
                arr_object[1] = "getBuiltInPackagesImportedByDefault";
                break;
            }
            case 11: {
                arr_object[1] = "getBuiltInsPackageScope";
                break;
            }
            case 13: {
                arr_object[1] = "getBuiltInClassByFqName";
                break;
            }
            case 15: {
                arr_object[1] = "getBuiltInClassByName";
                break;
            }
            case 18: {
                arr_object[1] = "getSuspendFunction";
                break;
            }
            case 19: {
                arr_object[1] = "getKFunction";
                break;
            }
            case 20: {
                arr_object[1] = "getKSuspendFunction";
                break;
            }
            case 21: {
                arr_object[1] = "getKClass";
                break;
            }
            case 22: {
                arr_object[1] = "getKCallable";
                break;
            }
            case 23: {
                arr_object[1] = "getKProperty";
                break;
            }
            case 24: {
                arr_object[1] = "getKProperty0";
                break;
            }
            case 25: {
                arr_object[1] = "getKProperty1";
                break;
            }
            case 26: {
                arr_object[1] = "getKProperty2";
                break;
            }
            case 27: {
                arr_object[1] = "getKMutableProperty0";
                break;
            }
            case 28: {
                arr_object[1] = "getKMutableProperty1";
                break;
            }
            case 29: {
                arr_object[1] = "getKMutableProperty2";
                break;
            }
            case 30: {
                arr_object[1] = "getIterator";
                break;
            }
            case 0x1F: {
                arr_object[1] = "getIterable";
                break;
            }
            case 0x20: {
                arr_object[1] = "getMutableIterable";
                break;
            }
            case 33: {
                arr_object[1] = "getMutableIterator";
                break;
            }
            case 34: {
                arr_object[1] = "getCollection";
                break;
            }
            case 35: {
                arr_object[1] = "getMutableCollection";
                break;
            }
            case 36: {
                arr_object[1] = "getList";
                break;
            }
            case 37: {
                arr_object[1] = "getMutableList";
                break;
            }
            case 38: {
                arr_object[1] = "getSet";
                break;
            }
            case 39: {
                arr_object[1] = "getMutableSet";
                break;
            }
            case 40: {
                arr_object[1] = "getMap";
                break;
            }
            case 41: {
                arr_object[1] = "getMutableMap";
                break;
            }
            case 42: {
                arr_object[1] = "getMapEntry";
                break;
            }
            case 43: {
                arr_object[1] = "getMutableMapEntry";
                break;
            }
            case 44: {
                arr_object[1] = "getListIterator";
                break;
            }
            case 45: {
                arr_object[1] = "getMutableListIterator";
                break;
            }
            case 0x2F: {
                arr_object[1] = "getBuiltInTypeByClassName";
                break;
            }
            case 0x30: {
                arr_object[1] = "getNothingType";
                break;
            }
            case 49: {
                arr_object[1] = "getNullableNothingType";
                break;
            }
            case 50: {
                arr_object[1] = "getAnyType";
                break;
            }
            case 51: {
                arr_object[1] = "getNullableAnyType";
                break;
            }
            case 52: {
                arr_object[1] = "getDefaultBound";
                break;
            }
            case 54: {
                arr_object[1] = "getPrimitiveKotlinType";
                break;
            }
            case 55: {
                arr_object[1] = "getNumberType";
                break;
            }
            case 56: {
                arr_object[1] = "getByteType";
                break;
            }
            case 57: {
                arr_object[1] = "getShortType";
                break;
            }
            case 58: {
                arr_object[1] = "getIntType";
                break;
            }
            case 59: {
                arr_object[1] = "getLongType";
                break;
            }
            case 60: {
                arr_object[1] = "getFloatType";
                break;
            }
            case 61: {
                arr_object[1] = "getDoubleType";
                break;
            }
            case 62: {
                arr_object[1] = "getCharType";
                break;
            }
            case 0x3F: {
                arr_object[1] = "getBooleanType";
                break;
            }
            case 0x40: {
                arr_object[1] = "getUnitType";
                break;
            }
            case 65: {
                arr_object[1] = "getStringType";
                break;
            }
            case 66: {
                arr_object[1] = "getIterableType";
                break;
            }
            case 68: 
            case 69: 
            case 70: {
                arr_object[1] = "getArrayElementType";
                break;
            }
            case 74: {
                arr_object[1] = "getPrimitiveArrayKotlinType";
                break;
            }
            case 81: 
            case 84: {
                arr_object[1] = "getArrayType";
                break;
            }
            case 86: {
                arr_object[1] = "getEnumType";
                break;
            }
            case 87: {
                arr_object[1] = "getAnnotationType";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
            }
        }
        switch(v) {
            case 1: {
                arr_object[2] = "setBuiltInsModule";
                break;
            }
            case 2: {
                arr_object[2] = "setPostponedBuiltinsModuleComputation";
                break;
            }
            case 9: {
                arr_object[2] = "isBuiltIn";
                break;
            }
            case 10: {
                arr_object[2] = "isUnderKotlinPackage";
                break;
            }
            case 12: {
                arr_object[2] = "getBuiltInClassByFqName";
                break;
            }
            case 14: {
                arr_object[2] = "getBuiltInClassByName";
                break;
            }
            case 16: {
                arr_object[2] = "getPrimitiveClassDescriptor";
                break;
            }
            case 17: {
                arr_object[2] = "getPrimitiveArrayClassDescriptor";
                break;
            }
            case 46: {
                arr_object[2] = "getBuiltInTypeByClassName";
                break;
            }
            case 53: {
                arr_object[2] = "getPrimitiveKotlinType";
                break;
            }
            case 67: {
                arr_object[2] = "getArrayElementType";
                break;
            }
            case 71: 
            case 72: {
                arr_object[2] = "getElementTypeForUnsignedArray";
                break;
            }
            case 73: {
                arr_object[2] = "getPrimitiveArrayKotlinType";
                break;
            }
            case 75: {
                arr_object[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            }
            case 77: {
                arr_object[2] = "getPrimitiveArrayType";
                break;
            }
            case 78: 
            case 0x4F: 
            case 80: 
            case 82: 
            case 83: {
                arr_object[2] = "getArrayType";
                break;
            }
            case 85: {
                arr_object[2] = "getEnumType";
                break;
            }
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 11: 
            case 13: 
            case 15: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 30: 
            case 0x1F: 
            case 0x20: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 38: 
            case 39: 
            case 40: 
            case 41: 
            case 42: 
            case 43: 
            case 44: 
            case 45: 
            case 0x2F: 
            case 0x30: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 54: 
            case 55: 
            case 56: 
            case 57: 
            case 58: 
            case 59: 
            case 60: 
            case 61: 
            case 62: 
            case 0x3F: 
            case 0x40: 
            case 65: 
            case 66: 
            case 68: 
            case 69: 
            case 70: 
            case 74: 
            case 81: 
            case 84: 
            case 86: 
            case 87: {
                break;
            }
            case 88: {
                arr_object[2] = "isArray";
                break;
            }
            case 89: 
            case 90: {
                arr_object[2] = "isArrayOrPrimitiveArray";
                break;
            }
            case 91: {
                arr_object[2] = "isPrimitiveArray";
                break;
            }
            case 92: {
                arr_object[2] = "getPrimitiveArrayElementType";
                break;
            }
            case 76: 
            case 93: {
                arr_object[2] = "getPrimitiveType";
                break;
            }
            case 94: {
                arr_object[2] = "isPrimitiveType";
                break;
            }
            case 0x5F: {
                arr_object[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            }
            case 0x60: {
                arr_object[2] = "isPrimitiveClass";
                break;
            }
            case 97: 
            case 98: 
            case 99: 
            case 100: {
                arr_object[2] = "isConstructedFromGivenClass";
                break;
            }
            case 101: 
            case 102: {
                arr_object[2] = "isTypeConstructorForGivenClass";
                break;
            }
            case 103: 
            case 104: {
                arr_object[2] = "classFqNameEquals";
                break;
            }
            case 105: 
            case 106: {
                arr_object[2] = "isNotNullConstructedFromGivenClass";
                break;
            }
            case 107: {
                arr_object[2] = "isSpecialClassWithNoSupertypes";
                break;
            }
            case 108: 
            case 109: {
                arr_object[2] = "isAny";
                break;
            }
            case 0x6F: {
                arr_object[2] = "isBooleanOrNullableBoolean";
                break;
            }
            case 110: 
            case 0x70: {
                arr_object[2] = "isBoolean";
                break;
            }
            case 0x71: {
                arr_object[2] = "isNumber";
                break;
            }
            case 0x72: {
                arr_object[2] = "isChar";
                break;
            }
            case 0x73: {
                arr_object[2] = "isCharOrNullableChar";
                break;
            }
            case 0x74: {
                arr_object[2] = "isInt";
                break;
            }
            case 0x75: {
                arr_object[2] = "isByte";
                break;
            }
            case 0x76: {
                arr_object[2] = "isLong";
                break;
            }
            case 0x77: {
                arr_object[2] = "isLongOrNullableLong";
                break;
            }
            case 120: {
                arr_object[2] = "isShort";
                break;
            }
            case 0x79: {
                arr_object[2] = "isFloat";
                break;
            }
            case 0x7A: {
                arr_object[2] = "isFloatOrNullableFloat";
                break;
            }
            case 0x7B: {
                arr_object[2] = "isDouble";
                break;
            }
            case 0x7C: {
                arr_object[2] = "isUByte";
                break;
            }
            case 0x7D: {
                arr_object[2] = "isUShort";
                break;
            }
            case 0x7E: {
                arr_object[2] = "isUInt";
                break;
            }
            case 0x7F: {
                arr_object[2] = "isULong";
                break;
            }
            case 0x80: {
                arr_object[2] = "isUByteArray";
                break;
            }
            case 0x81: {
                arr_object[2] = "isUShortArray";
                break;
            }
            case 130: {
                arr_object[2] = "isUIntArray";
                break;
            }
            case 0x83: {
                arr_object[2] = "isULongArray";
                break;
            }
            case 0x84: {
                arr_object[2] = "isUnsignedArrayType";
                break;
            }
            case 0x85: {
                arr_object[2] = "isDoubleOrNullableDouble";
                break;
            }
            case 0x86: 
            case 0x87: {
                arr_object[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            }
            case 0x88: {
                arr_object[2] = "isNothing";
                break;
            }
            case 0x89: {
                arr_object[2] = "isNullableNothing";
                break;
            }
            case 0x8A: {
                arr_object[2] = "isNothingOrNullableNothing";
                break;
            }
            case 0x8B: {
                arr_object[2] = "isAnyOrNullableAny";
                break;
            }
            case 140: {
                arr_object[2] = "isNullableAny";
                break;
            }
            case 0x8D: {
                arr_object[2] = "isDefaultBound";
                break;
            }
            case 0x8E: {
                arr_object[2] = "isUnit";
                break;
            }
            case 0x8F: {
                arr_object[2] = "mayReturnNonUnitValue";
                break;
            }
            case 0x90: {
                arr_object[2] = "isUnitOrNullableUnit";
                break;
            }
            case 0x91: {
                arr_object[2] = "isBooleanOrSubtype";
                break;
            }
            case 0x92: {
                arr_object[2] = "isMemberOfAny";
                break;
            }
            case 0x93: 
            case 0x94: {
                arr_object[2] = "isEnum";
                break;
            }
            case 0x95: 
            case 150: {
                arr_object[2] = "isComparable";
                break;
            }
            case 0x97: {
                arr_object[2] = "isCollectionOrNullableCollection";
                break;
            }
            case 0x98: {
                arr_object[2] = "isListOrNullableList";
                break;
            }
            case 0x99: {
                arr_object[2] = "isSetOrNullableSet";
                break;
            }
            case 0x9A: {
                arr_object[2] = "isMapOrNullableMap";
                break;
            }
            case 0x9B: {
                arr_object[2] = "isIterableOrNullableIterable";
                break;
            }
            case 0x9C: {
                arr_object[2] = "isThrowableOrNullableThrowable";
                break;
            }
            case 0x9D: {
                arr_object[2] = "isThrowable";
                break;
            }
            case 0x9E: {
                arr_object[2] = "isKClass";
                break;
            }
            case 0x9F: {
                arr_object[2] = "isNonPrimitiveArray";
                break;
            }
            case 0xA0: {
                arr_object[2] = "isCloneable";
                break;
            }
            case 0xA1: {
                arr_object[2] = "isDeprecated";
                break;
            }
            case 0xA2: {
                arr_object[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s1 = String.format(s, arr_object);
        switch(v) {
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 11: 
            case 13: 
            case 15: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 30: 
            case 0x1F: 
            case 0x20: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 38: 
            case 39: 
            case 40: 
            case 41: 
            case 42: 
            case 43: 
            case 44: 
            case 45: 
            case 0x2F: 
            case 0x30: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 54: 
            case 55: 
            case 56: 
            case 57: 
            case 58: 
            case 59: 
            case 60: 
            case 61: 
            case 62: 
            case 0x3F: 
            case 0x40: 
            case 65: 
            case 66: 
            case 68: 
            case 69: 
            case 70: 
            case 74: 
            case 81: 
            case 84: 
            case 86: 
            case 87: {
                illegalArgumentException0 = new IllegalStateException(s1);
                break;
            }
            default: {
                illegalArgumentException0 = new IllegalArgumentException(s1);
            }
        }
        throw illegalArgumentException0;
    }

    public static boolean b(ClassDescriptor classDescriptor0, FqNameUnsafe fqNameUnsafe0) {
        if(classDescriptor0 != null) {
            if(fqNameUnsafe0 != null) {
                return classDescriptor0.getName().equals(fqNameUnsafe0.shortName()) && fqNameUnsafe0.equals(DescriptorUtils.getFqName(classDescriptor0));
            }
            KotlinBuiltIns.a(104);
            throw null;
        }
        KotlinBuiltIns.a(103);
        throw null;
    }

    public final ClassDescriptor c(String s) {
        if(s != null) {
            Name name0 = Name.identifier(s);
            ClassDescriptor classDescriptor0 = (ClassDescriptor)this.d.invoke(name0);
            if(classDescriptor0 != null) {
                return classDescriptor0;
            }
            KotlinBuiltIns.a(15);
            throw null;
        }
        KotlinBuiltIns.a(14);
        throw null;
    }

    public void createBuiltInsModule(boolean z) {
        ModuleDescriptorImpl moduleDescriptorImpl0 = new ModuleDescriptorImpl(KotlinBuiltIns.BUILTINS_MODULE_NAME, this.e, this, null);
        this.a = moduleDescriptorImpl0;
        BuiltInsLoader builtInsLoader0 = BuiltInsLoader.Companion.getInstance();
        ModuleDescriptorImpl moduleDescriptorImpl1 = this.a;
        Iterable iterable0 = this.getClassDescriptorFactories();
        PlatformDependentDeclarationFilter platformDependentDeclarationFilter0 = this.getPlatformDependentDeclarationFilter();
        AdditionalClassPartsProvider additionalClassPartsProvider0 = this.getAdditionalClassPartsProvider();
        moduleDescriptorImpl0.initialize(builtInsLoader0.createPackageFragmentProvider(this.e, moduleDescriptorImpl1, iterable0, platformDependentDeclarationFilter0, additionalClassPartsProvider0, z));
        this.a.setDependencies(new ModuleDescriptorImpl[]{this.a});
    }

    public static boolean d(KotlinType kotlinType0, FqNameUnsafe fqNameUnsafe0) {
        if(kotlinType0 != null) {
            if(fqNameUnsafe0 != null) {
                return KotlinBuiltIns.isTypeConstructorForGivenClass(kotlinType0.getConstructor(), fqNameUnsafe0);
            }
            KotlinBuiltIns.a(98);
            throw null;
        }
        KotlinBuiltIns.a(97);
        throw null;
    }

    public static boolean e(KotlinType kotlinType0, FqNameUnsafe fqNameUnsafe0) {
        if(kotlinType0 != null) {
            if(fqNameUnsafe0 != null) {
                return KotlinBuiltIns.d(kotlinType0, fqNameUnsafe0) && !kotlinType0.isMarkedNullable();
            }
            KotlinBuiltIns.a(0x87);
            throw null;
        }
        KotlinBuiltIns.a(0x86);
        throw null;
    }

    public static boolean f(KotlinType kotlinType0, FqNameUnsafe fqNameUnsafe0) {
        if(kotlinType0 != null) {
            if(fqNameUnsafe0 != null) {
                return !kotlinType0.isMarkedNullable() && KotlinBuiltIns.d(kotlinType0, fqNameUnsafe0);
            }
            KotlinBuiltIns.a(106);
            throw null;
        }
        KotlinBuiltIns.a(105);
        throw null;
    }

    @NotNull
    public AdditionalClassPartsProvider getAdditionalClassPartsProvider() {
        AdditionalClassPartsProvider additionalClassPartsProvider0 = None.INSTANCE;
        if(additionalClassPartsProvider0 != null) {
            return additionalClassPartsProvider0;
        }
        KotlinBuiltIns.a(3);
        throw null;
    }

    @NotNull
    public ClassDescriptor getAny() {
        return this.c("Any");
    }

    @NotNull
    public SimpleType getAnyType() {
        SimpleType simpleType0 = this.getAny().getDefaultType();
        if(simpleType0 != null) {
            return simpleType0;
        }
        KotlinBuiltIns.a(50);
        throw null;
    }

    @NotNull
    public ClassDescriptor getArray() {
        return this.c("Array");
    }

    @NotNull
    public KotlinType getArrayElementType(@NotNull KotlinType kotlinType0) {
        KotlinType kotlinType1 = null;
        if(kotlinType0 != null) {
            if(KotlinBuiltIns.isArray(kotlinType0)) {
                if(kotlinType0.getArguments().size() != 1) {
                    throw new IllegalStateException();
                }
                KotlinType kotlinType2 = ((TypeProjection)kotlinType0.getArguments().get(0)).getType();
                if(kotlinType2 != null) {
                    return kotlinType2;
                }
                KotlinBuiltIns.a(68);
                throw null;
            }
            KotlinType kotlinType3 = TypeUtils.makeNotNullable(kotlinType0);
            KotlinType kotlinType4 = (KotlinType)((d)this.b.invoke()).b.get(kotlinType3);
            if(kotlinType4 != null) {
                return kotlinType4;
            }
            ModuleDescriptor moduleDescriptor0 = DescriptorUtils.getContainingModuleOrNull(kotlinType3);
            if(moduleDescriptor0 != null) {
                if(kotlinType3 == null) {
                    KotlinBuiltIns.a(71);
                    throw null;
                }
                ClassifierDescriptor classifierDescriptor0 = kotlinType3.getConstructor().getDeclarationDescriptor();
                if(classifierDescriptor0 != null) {
                    UnsignedTypes unsignedTypes0 = UnsignedTypes.INSTANCE;
                    if(unsignedTypes0.isShortNameOfUnsignedArray(classifierDescriptor0.getName())) {
                        ClassId classId0 = DescriptorUtilsKt.getClassId(classifierDescriptor0);
                        if(classId0 != null) {
                            ClassId classId1 = unsignedTypes0.getUnsignedClassIdByArrayClassId(classId0);
                            if(classId1 != null) {
                                ClassDescriptor classDescriptor0 = FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor0, classId1);
                                if(classDescriptor0 != null) {
                                    kotlinType1 = classDescriptor0.getDefaultType();
                                }
                            }
                        }
                    }
                }
                if(kotlinType1 != null) {
                    return kotlinType1;
                }
            }
            throw new IllegalStateException("not array: " + kotlinType0);
        }
        KotlinBuiltIns.a(67);
        throw null;
    }

    @NotNull
    public SimpleType getArrayType(@NotNull Variance variance0, @NotNull KotlinType kotlinType0) {
        if(variance0 != null) {
            if(kotlinType0 != null) {
                SimpleType simpleType0 = this.getArrayType(variance0, kotlinType0, Annotations.Companion.getEMPTY());
                if(simpleType0 != null) {
                    return simpleType0;
                }
                KotlinBuiltIns.a(84);
                throw null;
            }
            KotlinBuiltIns.a(83);
            throw null;
        }
        KotlinBuiltIns.a(82);
        throw null;
    }

    @NotNull
    public SimpleType getArrayType(@NotNull Variance variance0, @NotNull KotlinType kotlinType0, @NotNull Annotations annotations0) {
        if(variance0 != null) {
            if(kotlinType0 != null) {
                if(annotations0 != null) {
                    List list0 = Collections.singletonList(new TypeProjectionImpl(variance0, kotlinType0));
                    SimpleType simpleType0 = KotlinTypeFactory.simpleNotNullType(TypeAttributesKt.toDefaultAttributes(annotations0), this.getArray(), list0);
                    if(simpleType0 != null) {
                        return simpleType0;
                    }
                    KotlinBuiltIns.a(81);
                    throw null;
                }
                KotlinBuiltIns.a(80);
                throw null;
            }
            KotlinBuiltIns.a(0x4F);
            throw null;
        }
        KotlinBuiltIns.a(78);
        throw null;
    }

    @NotNull
    public SimpleType getBooleanType() {
        SimpleType simpleType0 = this.getPrimitiveKotlinType(PrimitiveType.BOOLEAN);
        if(simpleType0 != null) {
            return simpleType0;
        }
        KotlinBuiltIns.a(0x3F);
        throw null;
    }

    @NotNull
    public ClassDescriptor getBuiltInClassByFqName(@NotNull FqName fqName0) {
        if(fqName0 != null) {
            ClassDescriptor classDescriptor0 = DescriptorUtilKt.resolveClassByFqName(this.getBuiltInsModule(), fqName0, NoLookupLocation.FROM_BUILTINS);
            if(classDescriptor0 != null) {
                return classDescriptor0;
            }
            KotlinBuiltIns.a(13);
            throw null;
        }
        KotlinBuiltIns.a(12);
        throw null;
    }

    @NotNull
    public ModuleDescriptorImpl getBuiltInsModule() {
        this.a.getClass();
        ModuleDescriptorImpl moduleDescriptorImpl0 = this.a;
        if(moduleDescriptorImpl0 != null) {
            return moduleDescriptorImpl0;
        }
        KotlinBuiltIns.a(7);
        throw null;
    }

    @NotNull
    public MemberScope getBuiltInsPackageScope() {
        MemberScope memberScope0 = this.getBuiltInsModule().getPackage(StandardNames.BUILT_INS_PACKAGE_FQ_NAME).getMemberScope();
        if(memberScope0 != null) {
            return memberScope0;
        }
        KotlinBuiltIns.a(11);
        throw null;
    }

    @NotNull
    public SimpleType getByteType() {
        SimpleType simpleType0 = this.getPrimitiveKotlinType(PrimitiveType.BYTE);
        if(simpleType0 != null) {
            return simpleType0;
        }
        KotlinBuiltIns.a(56);
        throw null;
    }

    @NotNull
    public SimpleType getCharType() {
        SimpleType simpleType0 = this.getPrimitiveKotlinType(PrimitiveType.CHAR);
        if(simpleType0 != null) {
            return simpleType0;
        }
        KotlinBuiltIns.a(62);
        throw null;
    }

    @NotNull
    public Iterable getClassDescriptorFactories() {
        ModuleDescriptorImpl moduleDescriptorImpl0 = this.getBuiltInsModule();
        Iterable iterable0 = Collections.singletonList(new BuiltInFictitiousFunctionClassFactory(this.e, moduleDescriptorImpl0));
        if(iterable0 != null) {
            return iterable0;
        }
        KotlinBuiltIns.a(5);
        throw null;
    }

    @NotNull
    public ClassDescriptor getCollection() {
        ClassDescriptor classDescriptor0 = this.getBuiltInClassByFqName(FqNames.collection);
        if(classDescriptor0 != null) {
            return classDescriptor0;
        }
        KotlinBuiltIns.a(34);
        throw null;
    }

    @NotNull
    public ClassDescriptor getComparable() {
        return this.c("Comparable");
    }

    @NotNull
    public SimpleType getDefaultBound() {
        SimpleType simpleType0 = this.getNullableAnyType();
        if(simpleType0 != null) {
            return simpleType0;
        }
        KotlinBuiltIns.a(52);
        throw null;
    }

    @NotNull
    public SimpleType getDoubleType() {
        SimpleType simpleType0 = this.getPrimitiveKotlinType(PrimitiveType.DOUBLE);
        if(simpleType0 != null) {
            return simpleType0;
        }
        KotlinBuiltIns.a(61);
        throw null;
    }

    @NotNull
    public SimpleType getFloatType() {
        SimpleType simpleType0 = this.getPrimitiveKotlinType(PrimitiveType.FLOAT);
        if(simpleType0 != null) {
            return simpleType0;
        }
        KotlinBuiltIns.a(60);
        throw null;
    }

    @NotNull
    public ClassDescriptor getFunction(int v) {
        return this.c(StandardNames.getFunctionName(v));
    }

    @NotNull
    public SimpleType getIntType() {
        SimpleType simpleType0 = this.getPrimitiveKotlinType(PrimitiveType.INT);
        if(simpleType0 != null) {
            return simpleType0;
        }
        KotlinBuiltIns.a(58);
        throw null;
    }

    @NotNull
    public ClassDescriptor getKClass() {
        ClassDescriptor classDescriptor0 = this.getBuiltInClassByFqName(FqNames.kClass.toSafe());
        if(classDescriptor0 != null) {
            return classDescriptor0;
        }
        KotlinBuiltIns.a(21);
        throw null;
    }

    @NotNull
    public SimpleType getLongType() {
        SimpleType simpleType0 = this.getPrimitiveKotlinType(PrimitiveType.LONG);
        if(simpleType0 != null) {
            return simpleType0;
        }
        KotlinBuiltIns.a(59);
        throw null;
    }

    @NotNull
    public ClassDescriptor getNothing() {
        return this.c("Nothing");
    }

    @NotNull
    public SimpleType getNothingType() {
        SimpleType simpleType0 = this.getNothing().getDefaultType();
        if(simpleType0 != null) {
            return simpleType0;
        }
        KotlinBuiltIns.a(0x30);
        throw null;
    }

    @NotNull
    public SimpleType getNullableAnyType() {
        SimpleType simpleType0 = this.getAnyType().makeNullableAsSpecified(true);
        if(simpleType0 != null) {
            return simpleType0;
        }
        KotlinBuiltIns.a(51);
        throw null;
    }

    @NotNull
    public SimpleType getNullableNothingType() {
        SimpleType simpleType0 = this.getNothingType().makeNullableAsSpecified(true);
        if(simpleType0 != null) {
            return simpleType0;
        }
        KotlinBuiltIns.a(49);
        throw null;
    }

    @NotNull
    public ClassDescriptor getNumber() {
        return this.c("Number");
    }

    @NotNull
    public SimpleType getNumberType() {
        SimpleType simpleType0 = this.getNumber().getDefaultType();
        if(simpleType0 != null) {
            return simpleType0;
        }
        KotlinBuiltIns.a(55);
        throw null;
    }

    @NotNull
    public PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        PlatformDependentDeclarationFilter platformDependentDeclarationFilter0 = NoPlatformDependent.INSTANCE;
        if(platformDependentDeclarationFilter0 != null) {
            return platformDependentDeclarationFilter0;
        }
        KotlinBuiltIns.a(4);
        throw null;
    }

    @Nullable
    public static PrimitiveType getPrimitiveArrayElementType(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            ClassifierDescriptor classifierDescriptor0 = kotlinType0.getConstructor().getDeclarationDescriptor();
            return classifierDescriptor0 == null ? null : KotlinBuiltIns.getPrimitiveArrayType(classifierDescriptor0);
        }
        KotlinBuiltIns.a(92);
        throw null;
    }

    @NotNull
    public SimpleType getPrimitiveArrayKotlinType(@NotNull PrimitiveType primitiveType0) {
        if(primitiveType0 != null) {
            SimpleType simpleType0 = (SimpleType)((d)this.b.invoke()).a.get(primitiveType0);
            if(simpleType0 != null) {
                return simpleType0;
            }
            KotlinBuiltIns.a(74);
            throw null;
        }
        KotlinBuiltIns.a(73);
        throw null;
    }

    @Nullable
    public static PrimitiveType getPrimitiveArrayType(@NotNull DeclarationDescriptor declarationDescriptor0) {
        if(declarationDescriptor0 != null) {
            Name name0 = declarationDescriptor0.getName();
            if(FqNames.primitiveArrayTypeShortNames.contains(name0)) {
                FqNameUnsafe fqNameUnsafe0 = DescriptorUtils.getFqName(declarationDescriptor0);
                return (PrimitiveType)FqNames.arrayClassFqNameToPrimitiveType.get(fqNameUnsafe0);
            }
            return null;
        }
        KotlinBuiltIns.a(77);
        throw null;
    }

    @NotNull
    public SimpleType getPrimitiveKotlinType(@NotNull PrimitiveType primitiveType0) {
        if(primitiveType0 != null) {
            SimpleType simpleType0 = this.c(primitiveType0.getTypeName().asString()).getDefaultType();
            if(simpleType0 != null) {
                return simpleType0;
            }
            KotlinBuiltIns.a(54);
            throw null;
        }
        KotlinBuiltIns.a(53);
        throw null;
    }

    @Nullable
    public static PrimitiveType getPrimitiveType(@NotNull DeclarationDescriptor declarationDescriptor0) {
        if(declarationDescriptor0 != null) {
            Name name0 = declarationDescriptor0.getName();
            if(FqNames.primitiveTypeShortNames.contains(name0)) {
                FqNameUnsafe fqNameUnsafe0 = DescriptorUtils.getFqName(declarationDescriptor0);
                return (PrimitiveType)FqNames.fqNameToPrimitiveType.get(fqNameUnsafe0);
            }
            return null;
        }
        KotlinBuiltIns.a(76);
        throw null;
    }

    @NotNull
    public SimpleType getShortType() {
        SimpleType simpleType0 = this.getPrimitiveKotlinType(PrimitiveType.SHORT);
        if(simpleType0 != null) {
            return simpleType0;
        }
        KotlinBuiltIns.a(57);
        throw null;
    }

    @NotNull
    public StorageManager getStorageManager() {
        StorageManager storageManager0 = this.e;
        if(storageManager0 != null) {
            return storageManager0;
        }
        KotlinBuiltIns.a(6);
        throw null;
    }

    @NotNull
    public ClassDescriptor getString() {
        return this.c("String");
    }

    @NotNull
    public SimpleType getStringType() {
        SimpleType simpleType0 = this.getString().getDefaultType();
        if(simpleType0 != null) {
            return simpleType0;
        }
        KotlinBuiltIns.a(65);
        throw null;
    }

    @NotNull
    public ClassDescriptor getSuspendFunction(int v) {
        Name name0 = Name.identifier(StandardNames.getSuspendFunctionName(v));
        ClassDescriptor classDescriptor0 = this.getBuiltInClassByFqName(StandardNames.COROUTINES_PACKAGE_FQ_NAME.child(name0));
        if(classDescriptor0 != null) {
            return classDescriptor0;
        }
        KotlinBuiltIns.a(18);
        throw null;
    }

    @NotNull
    public ClassDescriptor getUnit() {
        return this.c("Unit");
    }

    @NotNull
    public SimpleType getUnitType() {
        SimpleType simpleType0 = this.getUnit().getDefaultType();
        if(simpleType0 != null) {
            return simpleType0;
        }
        KotlinBuiltIns.a(0x40);
        throw null;
    }

    public static boolean isAny(@NotNull ClassDescriptor classDescriptor0) {
        if(classDescriptor0 != null) {
            return KotlinBuiltIns.b(classDescriptor0, FqNames.any);
        }
        KotlinBuiltIns.a(108);
        throw null;
    }

    public static boolean isAnyOrNullableAny(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            return KotlinBuiltIns.d(kotlinType0, FqNames.any);
        }
        KotlinBuiltIns.a(0x8B);
        throw null;
    }

    public static boolean isArray(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            return KotlinBuiltIns.d(kotlinType0, FqNames.array);
        }
        KotlinBuiltIns.a(88);
        throw null;
    }

    public static boolean isArrayOrPrimitiveArray(@NotNull ClassDescriptor classDescriptor0) {
        if(classDescriptor0 != null) {
            return KotlinBuiltIns.b(classDescriptor0, FqNames.array) || KotlinBuiltIns.getPrimitiveArrayType(classDescriptor0) != null;
        }
        KotlinBuiltIns.a(89);
        throw null;
    }

    public static boolean isArrayOrPrimitiveArray(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            return KotlinBuiltIns.isArray(kotlinType0) || KotlinBuiltIns.isPrimitiveArray(kotlinType0);
        }
        KotlinBuiltIns.a(90);
        throw null;
    }

    public static boolean isBoolean(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            return KotlinBuiltIns.e(kotlinType0, FqNames._boolean);
        }
        KotlinBuiltIns.a(110);
        throw null;
    }

    public static boolean isBuiltIn(@NotNull DeclarationDescriptor declarationDescriptor0) {
        if(declarationDescriptor0 != null) {
            return DescriptorUtils.getParentOfType(declarationDescriptor0, BuiltInsPackageFragment.class, false) != null;
        }
        KotlinBuiltIns.a(9);
        throw null;
    }

    public static boolean isDefaultBound(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            return KotlinBuiltIns.isNullableAny(kotlinType0);
        }
        KotlinBuiltIns.a(0x8D);
        throw null;
    }

    public static boolean isDeprecated(@NotNull DeclarationDescriptor declarationDescriptor0) {
        if(declarationDescriptor0 != null) {
            if(declarationDescriptor0.getOriginal().getAnnotations().hasAnnotation(FqNames.deprecated)) {
                return true;
            }
            if(declarationDescriptor0 instanceof PropertyDescriptor) {
                boolean z = ((PropertyDescriptor)declarationDescriptor0).isVar();
                PropertyGetterDescriptor propertyGetterDescriptor0 = ((PropertyDescriptor)declarationDescriptor0).getGetter();
                PropertySetterDescriptor propertySetterDescriptor0 = ((PropertyDescriptor)declarationDescriptor0).getSetter();
                return propertyGetterDescriptor0 != null && KotlinBuiltIns.isDeprecated(propertyGetterDescriptor0) && (!z || propertySetterDescriptor0 != null && KotlinBuiltIns.isDeprecated(propertySetterDescriptor0));
            }
            return false;
        }
        KotlinBuiltIns.a(0xA1);
        throw null;
    }

    public static boolean isKClass(@NotNull ClassDescriptor classDescriptor0) {
        if(classDescriptor0 != null) {
            return KotlinBuiltIns.b(classDescriptor0, FqNames.kClass);
        }
        KotlinBuiltIns.a(0x9E);
        throw null;
    }

    public static boolean isNothing(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            return KotlinBuiltIns.isNothingOrNullableNothing(kotlinType0) && !TypeUtils.isNullableType(kotlinType0);
        }
        KotlinBuiltIns.a(0x88);
        throw null;
    }

    public static boolean isNothingOrNullableNothing(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            return KotlinBuiltIns.d(kotlinType0, FqNames.nothing);
        }
        KotlinBuiltIns.a(0x8A);
        throw null;
    }

    public static boolean isNullableAny(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            return KotlinBuiltIns.isAnyOrNullableAny(kotlinType0) && kotlinType0.isMarkedNullable();
        }
        KotlinBuiltIns.a(140);
        throw null;
    }

    public static boolean isPrimitiveArray(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            ClassifierDescriptor classifierDescriptor0 = kotlinType0.getConstructor().getDeclarationDescriptor();
            return classifierDescriptor0 != null && KotlinBuiltIns.getPrimitiveArrayType(classifierDescriptor0) != null;
        }
        KotlinBuiltIns.a(91);
        throw null;
    }

    public static boolean isPrimitiveClass(@NotNull ClassDescriptor classDescriptor0) {
        if(classDescriptor0 != null) {
            return KotlinBuiltIns.getPrimitiveType(classDescriptor0) != null;
        }
        KotlinBuiltIns.a(0x60);
        throw null;
    }

    public static boolean isPrimitiveType(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            return !kotlinType0.isMarkedNullable() && KotlinBuiltIns.isPrimitiveTypeOrNullablePrimitiveType(kotlinType0);
        }
        KotlinBuiltIns.a(94);
        throw null;
    }

    public static boolean isPrimitiveTypeOrNullablePrimitiveType(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            ClassifierDescriptor classifierDescriptor0 = kotlinType0.getConstructor().getDeclarationDescriptor();
            return classifierDescriptor0 instanceof ClassDescriptor && KotlinBuiltIns.isPrimitiveClass(((ClassDescriptor)classifierDescriptor0));
        }
        KotlinBuiltIns.a(0x5F);
        throw null;
    }

    public static boolean isSpecialClassWithNoSupertypes(@NotNull ClassDescriptor classDescriptor0) {
        if(classDescriptor0 != null) {
            return KotlinBuiltIns.b(classDescriptor0, FqNames.any) || KotlinBuiltIns.b(classDescriptor0, FqNames.nothing);
        }
        KotlinBuiltIns.a(107);
        throw null;
    }

    public static boolean isString(@Nullable KotlinType kotlinType0) {
        return kotlinType0 != null && KotlinBuiltIns.f(kotlinType0, FqNames.string);
    }

    public static boolean isTypeConstructorForGivenClass(@NotNull TypeConstructor typeConstructor0, @NotNull FqNameUnsafe fqNameUnsafe0) {
        if(typeConstructor0 != null) {
            if(fqNameUnsafe0 != null) {
                ClassifierDescriptor classifierDescriptor0 = typeConstructor0.getDeclarationDescriptor();
                return classifierDescriptor0 instanceof ClassDescriptor && KotlinBuiltIns.b(((ClassDescriptor)classifierDescriptor0), fqNameUnsafe0);
            }
            KotlinBuiltIns.a(102);
            throw null;
        }
        KotlinBuiltIns.a(101);
        throw null;
    }

    public static boolean isUByteArray(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            return KotlinBuiltIns.e(kotlinType0, FqNames.uByteArrayFqName.toUnsafe());
        }
        KotlinBuiltIns.a(0x80);
        throw null;
    }

    public static boolean isUIntArray(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            return KotlinBuiltIns.e(kotlinType0, FqNames.uIntArrayFqName.toUnsafe());
        }
        KotlinBuiltIns.a(130);
        throw null;
    }

    public static boolean isULongArray(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            return KotlinBuiltIns.e(kotlinType0, FqNames.uLongArrayFqName.toUnsafe());
        }
        KotlinBuiltIns.a(0x83);
        throw null;
    }

    public static boolean isUShortArray(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            return KotlinBuiltIns.e(kotlinType0, FqNames.uShortArrayFqName.toUnsafe());
        }
        KotlinBuiltIns.a(0x81);
        throw null;
    }

    public static boolean isUnderKotlinPackage(@NotNull DeclarationDescriptor declarationDescriptor0) {
        if(declarationDescriptor0 != null) {
            while(declarationDescriptor0 != null) {
                if(declarationDescriptor0 instanceof PackageFragmentDescriptor) {
                    return ((PackageFragmentDescriptor)declarationDescriptor0).getFqName().startsWith(StandardNames.BUILT_INS_PACKAGE_NAME);
                }
                declarationDescriptor0 = declarationDescriptor0.getContainingDeclaration();
            }
            return false;
        }
        KotlinBuiltIns.a(10);
        throw null;
    }

    public static boolean isUnit(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            return KotlinBuiltIns.f(kotlinType0, FqNames.unit);
        }
        KotlinBuiltIns.a(0x8E);
        throw null;
    }

    public static boolean isUnsignedArrayType(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            return KotlinBuiltIns.isUByteArray(kotlinType0) || KotlinBuiltIns.isUShortArray(kotlinType0) || KotlinBuiltIns.isUIntArray(kotlinType0) || KotlinBuiltIns.isULongArray(kotlinType0);
        }
        KotlinBuiltIns.a(0x84);
        throw null;
    }

    public void setBuiltInsModule(@NotNull ModuleDescriptorImpl moduleDescriptorImpl0) {
        if(moduleDescriptorImpl0 != null) {
            c c0 = new c(this, moduleDescriptorImpl0);
            this.e.compute(c0);
            return;
        }
        KotlinBuiltIns.a(1);
        throw null;
    }
}

