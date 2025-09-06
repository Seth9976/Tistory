package kotlin.reflect.jvm.internal.impl.types.error;

import org.jetbrains.annotations.NotNull;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class ErrorTypeKind extends Enum {
    public static final enum ErrorTypeKind AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE;
    public static final enum ErrorTypeKind CANNOT_COMPUTE_ERASED_BOUND;
    public static final enum ErrorTypeKind CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER;
    public static final enum ErrorTypeKind CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME;
    public static final enum ErrorTypeKind CYCLIC_SUPERTYPES;
    public static final enum ErrorTypeKind CYCLIC_UPPER_BOUNDS;
    public static final enum ErrorTypeKind DONT_CARE;
    public static final enum ErrorTypeKind EMPTY_CALLABLE_REFERENCE;
    public static final enum ErrorTypeKind ERROR_CLASS;
    public static final enum ErrorTypeKind ERROR_CONSTANT_VALUE;
    public static final enum ErrorTypeKind ERROR_DATA_FLOW_TYPE;
    public static final enum ErrorTypeKind ERROR_ENUM_TYPE;
    public static final enum ErrorTypeKind ERROR_EXPECTED_TYPE;
    public static final enum ErrorTypeKind ERROR_EXPRESSION_TYPE;
    public static final enum ErrorTypeKind ERROR_FLEXIBLE_TYPE;
    public static final enum ErrorTypeKind ERROR_PROPERTY_TYPE;
    public static final enum ErrorTypeKind ERROR_RAW_TYPE;
    public static final enum ErrorTypeKind ERROR_RECEIVER_TYPE;
    public static final enum ErrorTypeKind ERROR_SUPER_TYPE;
    public static final enum ErrorTypeKind ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT;
    public static final enum ErrorTypeKind ERROR_TYPE_PARAMETER;
    public static final enum ErrorTypeKind ERROR_TYPE_PROJECTION;
    public static final enum ErrorTypeKind ERROR_WHILE_RECONSTRUCTING_BARE_TYPE;
    public static final enum ErrorTypeKind FUNCTION_PLACEHOLDER_TYPE;
    public static final enum ErrorTypeKind ILLEGAL_TYPE_RANGE_FOR_DYNAMIC;
    public static final enum ErrorTypeKind IMPLICIT_RETURN_TYPE_FOR_FUNCTION;
    public static final enum ErrorTypeKind IMPLICIT_RETURN_TYPE_FOR_PROPERTY;
    public static final enum ErrorTypeKind IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR;
    public static final enum ErrorTypeKind INCONSISTENT_SUSPEND_FUNCTION;
    public static final enum ErrorTypeKind INTERSECTION_OF_ERROR_TYPES;
    public static final enum ErrorTypeKind KAPT_ERROR_TYPE;
    public static final enum ErrorTypeKind MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER;
    public static final enum ErrorTypeKind MISSED_TYPE_FOR_PARAMETER;
    public static final enum ErrorTypeKind NOT_ANNOTATION_TYPE_IN_ANNOTATION_CONTEXT;
    public static final enum ErrorTypeKind NOT_FOUND_DESCRIPTOR_FOR_CLASS;
    public static final enum ErrorTypeKind NOT_FOUND_DESCRIPTOR_FOR_FUNCTION;
    public static final enum ErrorTypeKind NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER;
    public static final enum ErrorTypeKind NOT_FOUND_FQNAME;
    public static final enum ErrorTypeKind NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION;
    public static final enum ErrorTypeKind NOT_FOUND_UNSIGNED_TYPE;
    public static final enum ErrorTypeKind NO_RECORDED_TYPE;
    public static final enum ErrorTypeKind NO_TYPE_FOR_LOOP_PARAMETER;
    public static final enum ErrorTypeKind NO_TYPE_FOR_LOOP_RANGE;
    public static final enum ErrorTypeKind NO_TYPE_SPECIFIED;
    public static final enum ErrorTypeKind PARSE_ERROR_ARGUMENT;
    public static final enum ErrorTypeKind PROHIBITED_DYNAMIC_TYPE;
    public static final enum ErrorTypeKind RECURSIVE_ANNOTATION_TYPE;
    public static final enum ErrorTypeKind RECURSIVE_TYPE;
    public static final enum ErrorTypeKind RECURSIVE_TYPE_ALIAS;
    public static final enum ErrorTypeKind RESOLUTION_ERROR_TYPE;
    public static final enum ErrorTypeKind RETURN_NOT_ALLOWED;
    public static final enum ErrorTypeKind RETURN_TYPE;
    public static final enum ErrorTypeKind RETURN_TYPE_FOR_CONSTRUCTOR;
    public static final enum ErrorTypeKind RETURN_TYPE_FOR_FUNCTION;
    public static final enum ErrorTypeKind RETURN_TYPE_FOR_PROPERTY;
    public static final enum ErrorTypeKind STAR_PROJECTION_IN_CALL;
    public static final enum ErrorTypeKind STUB_TYPE;
    public static final enum ErrorTypeKind SUPER_TYPE_FOR_ERROR_TYPE;
    public static final enum ErrorTypeKind SYNTHETIC_ELEMENT_ERROR_TYPE;
    public static final enum ErrorTypeKind TYPE_FOR_COMPILER_EXCEPTION;
    public static final enum ErrorTypeKind TYPE_FOR_DELEGATION;
    public static final enum ErrorTypeKind TYPE_FOR_ERROR_TYPE_CONSTRUCTOR;
    public static final enum ErrorTypeKind TYPE_FOR_GENERATED_ERROR_EXPRESSION;
    public static final enum ErrorTypeKind TYPE_FOR_RESULT;
    public static final enum ErrorTypeKind TYPE_WITH_MISMATCHED_TYPE_ARGUMENTS_AND_PARAMETERS;
    public static final enum ErrorTypeKind UNABLE_TO_SUBSTITUTE_TYPE;
    public static final enum ErrorTypeKind UNAVAILABLE_TYPE_FOR_DECLARATION;
    public static final enum ErrorTypeKind UNEXPECTED_FLEXIBLE_TYPE_ID;
    public static final enum ErrorTypeKind UNINFERRED_LAMBDA_CONTEXT_RECEIVER_TYPE;
    public static final enum ErrorTypeKind UNINFERRED_LAMBDA_PARAMETER_TYPE;
    public static final enum ErrorTypeKind UNINFERRED_TYPE_VARIABLE;
    public static final enum ErrorTypeKind UNIT_RETURN_TYPE_FOR_INC_DEC;
    public static final enum ErrorTypeKind UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT;
    public static final enum ErrorTypeKind UNKNOWN_TYPE;
    public static final enum ErrorTypeKind UNMAPPED_ANNOTATION_TARGET_TYPE;
    public static final enum ErrorTypeKind UNRESOLVED_CLASS_TYPE;
    public static final enum ErrorTypeKind UNRESOLVED_DECLARATION;
    public static final enum ErrorTypeKind UNRESOLVED_JAVA_CLASS;
    public static final enum ErrorTypeKind UNRESOLVED_KCLASS_CONSTANT_VALUE;
    public static final enum ErrorTypeKind UNRESOLVED_PARCEL_TYPE;
    public static final enum ErrorTypeKind UNRESOLVED_TYPE;
    public static final enum ErrorTypeKind UNRESOLVED_TYPE_ALIAS;
    public static final enum ErrorTypeKind UNRESOLVED_TYPE_PARAMETER_TYPE;
    public static final enum ErrorTypeKind UNSUPPORTED_CALLABLE_REFERENCE_TYPE;
    public final String a;
    public final boolean b;
    public static final ErrorTypeKind[] c;

    static {
        ErrorTypeKind.UNRESOLVED_TYPE = new ErrorTypeKind(0, "UNRESOLVED_TYPE", true, "Unresolved type for %s");
        ErrorTypeKind.UNRESOLVED_TYPE_PARAMETER_TYPE = new ErrorTypeKind(1, "UNRESOLVED_TYPE_PARAMETER_TYPE", true, "Unresolved type parameter type");
        ErrorTypeKind.UNRESOLVED_CLASS_TYPE = new ErrorTypeKind(2, "UNRESOLVED_CLASS_TYPE", true, "Unresolved class %s");
        ErrorTypeKind.UNRESOLVED_JAVA_CLASS = new ErrorTypeKind(3, "UNRESOLVED_JAVA_CLASS", true, "Unresolved java class %s");
        ErrorTypeKind.UNRESOLVED_DECLARATION = new ErrorTypeKind(4, "UNRESOLVED_DECLARATION", true, "Unresolved declaration %s");
        ErrorTypeKind.UNRESOLVED_KCLASS_CONSTANT_VALUE = new ErrorTypeKind(5, "UNRESOLVED_KCLASS_CONSTANT_VALUE", true, "Unresolved type for %s (arrayDimensions=%s)");
        ErrorTypeKind.UNRESOLVED_TYPE_ALIAS = new ErrorTypeKind(6, "UNRESOLVED_TYPE_ALIAS", false, "Unresolved type alias %s");
        ErrorTypeKind.RETURN_TYPE = new ErrorTypeKind(7, "RETURN_TYPE", false, "Return type for %s cannot be resolved");
        ErrorTypeKind.RETURN_TYPE_FOR_FUNCTION = new ErrorTypeKind(8, "RETURN_TYPE_FOR_FUNCTION", false, "Return type for function cannot be resolved");
        ErrorTypeKind.RETURN_TYPE_FOR_PROPERTY = new ErrorTypeKind(9, "RETURN_TYPE_FOR_PROPERTY", false, "Return type for property %s cannot be resolved");
        ErrorTypeKind.RETURN_TYPE_FOR_CONSTRUCTOR = new ErrorTypeKind(10, "RETURN_TYPE_FOR_CONSTRUCTOR", false, "Return type for constructor %s cannot be resolved");
        ErrorTypeKind.IMPLICIT_RETURN_TYPE_FOR_FUNCTION = new ErrorTypeKind(11, "IMPLICIT_RETURN_TYPE_FOR_FUNCTION", false, "Implicit return type for function %s cannot be resolved");
        ErrorTypeKind.IMPLICIT_RETURN_TYPE_FOR_PROPERTY = new ErrorTypeKind(12, "IMPLICIT_RETURN_TYPE_FOR_PROPERTY", false, "Implicit return type for property %s cannot be resolved");
        ErrorTypeKind.IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR = new ErrorTypeKind(13, "IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR", false, "Implicit return type for property accessor %s cannot be resolved");
        ErrorTypeKind.ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT = new ErrorTypeKind(14, "ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT", false, "%s() return type");
        ErrorTypeKind.RECURSIVE_TYPE = new ErrorTypeKind(15, "RECURSIVE_TYPE", false, "Recursive type");
        ErrorTypeKind.RECURSIVE_TYPE_ALIAS = new ErrorTypeKind(16, "RECURSIVE_TYPE_ALIAS", false, "Recursive type alias %s");
        ErrorTypeKind.RECURSIVE_ANNOTATION_TYPE = new ErrorTypeKind(17, "RECURSIVE_ANNOTATION_TYPE", false, "Recursive annotation\'s type");
        ErrorTypeKind.CYCLIC_UPPER_BOUNDS = new ErrorTypeKind(18, "CYCLIC_UPPER_BOUNDS", false, "Cyclic upper bounds");
        ErrorTypeKind.CYCLIC_SUPERTYPES = new ErrorTypeKind(19, "CYCLIC_SUPERTYPES", false, "Cyclic supertypes");
        ErrorTypeKind.UNINFERRED_LAMBDA_CONTEXT_RECEIVER_TYPE = new ErrorTypeKind(20, "UNINFERRED_LAMBDA_CONTEXT_RECEIVER_TYPE", false, "Cannot infer a lambda context receiver type");
        ErrorTypeKind.UNINFERRED_LAMBDA_PARAMETER_TYPE = new ErrorTypeKind(21, "UNINFERRED_LAMBDA_PARAMETER_TYPE", false, "Cannot infer a lambda parameter type");
        ErrorTypeKind.UNINFERRED_TYPE_VARIABLE = new ErrorTypeKind(22, "UNINFERRED_TYPE_VARIABLE", false, "Cannot infer a type variable %s");
        ErrorTypeKind.RESOLUTION_ERROR_TYPE = new ErrorTypeKind(23, "RESOLUTION_ERROR_TYPE", false, "Resolution error type (%s)");
        ErrorTypeKind.ERROR_EXPECTED_TYPE = new ErrorTypeKind(24, "ERROR_EXPECTED_TYPE", false, "Error expected type");
        ErrorTypeKind.ERROR_DATA_FLOW_TYPE = new ErrorTypeKind(25, "ERROR_DATA_FLOW_TYPE", false, "Error type for data flow");
        ErrorTypeKind.ERROR_WHILE_RECONSTRUCTING_BARE_TYPE = new ErrorTypeKind(26, "ERROR_WHILE_RECONSTRUCTING_BARE_TYPE", false, "Failed to reconstruct type %s");
        ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE = new ErrorTypeKind(27, "UNABLE_TO_SUBSTITUTE_TYPE", false, "Unable to substitute type (%s)");
        ErrorTypeKind.DONT_CARE = new ErrorTypeKind(28, "DONT_CARE", false, "Special DONT_CARE type");
        ErrorTypeKind.STUB_TYPE = new ErrorTypeKind(29, "STUB_TYPE", false, "Stub type %s");
        ErrorTypeKind.FUNCTION_PLACEHOLDER_TYPE = new ErrorTypeKind(30, "FUNCTION_PLACEHOLDER_TYPE", false, "Function placeholder type (arguments: %s)");
        ErrorTypeKind.TYPE_FOR_RESULT = new ErrorTypeKind(0x1F, "TYPE_FOR_RESULT", false, "Stubbed \'Result\' type");
        ErrorTypeKind.TYPE_FOR_COMPILER_EXCEPTION = new ErrorTypeKind(0x20, "TYPE_FOR_COMPILER_EXCEPTION", false, "Error type for a compiler exception while analyzing %s");
        ErrorTypeKind.ERROR_FLEXIBLE_TYPE = new ErrorTypeKind(33, "ERROR_FLEXIBLE_TYPE", false, "Error java flexible type with id %s. (%s..%s)");
        ErrorTypeKind.ERROR_RAW_TYPE = new ErrorTypeKind(34, "ERROR_RAW_TYPE", false, "Error raw type %s");
        ErrorTypeKind.TYPE_WITH_MISMATCHED_TYPE_ARGUMENTS_AND_PARAMETERS = new ErrorTypeKind(35, "TYPE_WITH_MISMATCHED_TYPE_ARGUMENTS_AND_PARAMETERS", false, "Inconsistent type %s (parameters.size = %s, arguments.size = %s)");
        ErrorTypeKind.ILLEGAL_TYPE_RANGE_FOR_DYNAMIC = new ErrorTypeKind(36, "ILLEGAL_TYPE_RANGE_FOR_DYNAMIC", false, "Illegal type range for dynamic type %s..%s");
        ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER = new ErrorTypeKind(37, "CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER", false, "Unknown type parameter %s. Please try recompiling module containing \"%s\"");
        ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME = new ErrorTypeKind(38, "CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME", false, "Couldn\'t deserialize type parameter %s in %s");
        ErrorTypeKind.INCONSISTENT_SUSPEND_FUNCTION = new ErrorTypeKind(39, "INCONSISTENT_SUSPEND_FUNCTION", false, "Inconsistent suspend function type in metadata with constructor %s");
        ErrorTypeKind.UNEXPECTED_FLEXIBLE_TYPE_ID = new ErrorTypeKind(40, "UNEXPECTED_FLEXIBLE_TYPE_ID", false, "Unexpected id of a flexible type %s. (%s..%s)");
        ErrorTypeKind.UNKNOWN_TYPE = new ErrorTypeKind(41, "UNKNOWN_TYPE", false, "Unknown type");
        ErrorTypeKind.NO_TYPE_SPECIFIED = new ErrorTypeKind(42, "NO_TYPE_SPECIFIED", false, "No type specified for %s");
        ErrorTypeKind.NO_TYPE_FOR_LOOP_RANGE = new ErrorTypeKind(43, "NO_TYPE_FOR_LOOP_RANGE", false, "Loop range has no type");
        ErrorTypeKind.NO_TYPE_FOR_LOOP_PARAMETER = new ErrorTypeKind(44, "NO_TYPE_FOR_LOOP_PARAMETER", false, "Loop parameter has no type");
        ErrorTypeKind.MISSED_TYPE_FOR_PARAMETER = new ErrorTypeKind(45, "MISSED_TYPE_FOR_PARAMETER", false, "Missed a type for a value parameter %s");
        ErrorTypeKind.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER = new ErrorTypeKind(46, "MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER", false, "Missed a type argument for a type parameter %s");
        ErrorTypeKind.PARSE_ERROR_ARGUMENT = new ErrorTypeKind(0x2F, "PARSE_ERROR_ARGUMENT", false, "Error type for parse error argument %s");
        ErrorTypeKind.STAR_PROJECTION_IN_CALL = new ErrorTypeKind(0x30, "STAR_PROJECTION_IN_CALL", false, "Error type for star projection directly passing as a call type argument");
        ErrorTypeKind.PROHIBITED_DYNAMIC_TYPE = new ErrorTypeKind(49, "PROHIBITED_DYNAMIC_TYPE", false, "Dynamic type in a not allowed context");
        ErrorTypeKind.NOT_ANNOTATION_TYPE_IN_ANNOTATION_CONTEXT = new ErrorTypeKind(50, "NOT_ANNOTATION_TYPE_IN_ANNOTATION_CONTEXT", false, "Not an annotation type %s in the annotation context");
        ErrorTypeKind.UNIT_RETURN_TYPE_FOR_INC_DEC = new ErrorTypeKind(51, "UNIT_RETURN_TYPE_FOR_INC_DEC", false, "Unit type returned by inc or dec");
        ErrorTypeKind.RETURN_NOT_ALLOWED = new ErrorTypeKind(52, "RETURN_NOT_ALLOWED", false, "Return not allowed");
        ErrorTypeKind.UNRESOLVED_PARCEL_TYPE = new ErrorTypeKind(53, "UNRESOLVED_PARCEL_TYPE", true, "Unresolved \'Parcel\' type");
        ErrorTypeKind.KAPT_ERROR_TYPE = new ErrorTypeKind(54, "KAPT_ERROR_TYPE", false, "Kapt error type");
        ErrorTypeKind.SYNTHETIC_ELEMENT_ERROR_TYPE = new ErrorTypeKind(55, "SYNTHETIC_ELEMENT_ERROR_TYPE", false, "Error type for synthetic element");
        ErrorTypeKind.AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE = new ErrorTypeKind(56, "AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE", false, "Error type in ad hoc resolve for lighter classes");
        ErrorTypeKind.ERROR_EXPRESSION_TYPE = new ErrorTypeKind(57, "ERROR_EXPRESSION_TYPE", false, "Error expression type");
        ErrorTypeKind.ERROR_RECEIVER_TYPE = new ErrorTypeKind(58, "ERROR_RECEIVER_TYPE", false, "Error receiver type for %s");
        ErrorTypeKind.ERROR_CONSTANT_VALUE = new ErrorTypeKind(59, "ERROR_CONSTANT_VALUE", false, "Error constant value %s");
        ErrorTypeKind.EMPTY_CALLABLE_REFERENCE = new ErrorTypeKind(60, "EMPTY_CALLABLE_REFERENCE", false, "Empty callable reference");
        ErrorTypeKind.UNSUPPORTED_CALLABLE_REFERENCE_TYPE = new ErrorTypeKind(61, "UNSUPPORTED_CALLABLE_REFERENCE_TYPE", false, "Unsupported callable reference type %s");
        ErrorTypeKind.TYPE_FOR_DELEGATION = new ErrorTypeKind(62, "TYPE_FOR_DELEGATION", false, "Error delegation type for %s");
        ErrorTypeKind.UNAVAILABLE_TYPE_FOR_DECLARATION = new ErrorTypeKind(0x3F, "UNAVAILABLE_TYPE_FOR_DECLARATION", false, "Type is unavailable for declaration %s");
        ErrorTypeKind.ERROR_TYPE_PARAMETER = new ErrorTypeKind(0x40, "ERROR_TYPE_PARAMETER", false, "Error type parameter");
        ErrorTypeKind.ERROR_TYPE_PROJECTION = new ErrorTypeKind(65, "ERROR_TYPE_PROJECTION", false, "Error type projection");
        ErrorTypeKind.ERROR_SUPER_TYPE = new ErrorTypeKind(66, "ERROR_SUPER_TYPE", false, "Error super type");
        ErrorTypeKind.SUPER_TYPE_FOR_ERROR_TYPE = new ErrorTypeKind(67, "SUPER_TYPE_FOR_ERROR_TYPE", false, "Supertype of error type %s");
        ErrorTypeKind.ERROR_PROPERTY_TYPE = new ErrorTypeKind(68, "ERROR_PROPERTY_TYPE", false, "Error property type");
        ErrorTypeKind.ERROR_CLASS = new ErrorTypeKind(69, "ERROR_CLASS", false, "Error class");
        ErrorTypeKind.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR = new ErrorTypeKind(70, "TYPE_FOR_ERROR_TYPE_CONSTRUCTOR", false, "Type for error type constructor (%s)");
        ErrorTypeKind.INTERSECTION_OF_ERROR_TYPES = new ErrorTypeKind(71, "INTERSECTION_OF_ERROR_TYPES", false, "Intersection of error types %s");
        ErrorTypeKind.CANNOT_COMPUTE_ERASED_BOUND = new ErrorTypeKind(72, "CANNOT_COMPUTE_ERASED_BOUND", false, "Cannot compute erased upper bound of a type parameter %s");
        ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE = new ErrorTypeKind(73, "NOT_FOUND_UNSIGNED_TYPE", false, "Unsigned type %s not found");
        ErrorTypeKind.ERROR_ENUM_TYPE = new ErrorTypeKind(74, "ERROR_ENUM_TYPE", false, "Not found the corresponding enum class for given enum entry %s.%s");
        ErrorTypeKind.NO_RECORDED_TYPE = new ErrorTypeKind(75, "NO_RECORDED_TYPE", false, "Not found recorded type for %s");
        ErrorTypeKind.NOT_FOUND_DESCRIPTOR_FOR_FUNCTION = new ErrorTypeKind(76, "NOT_FOUND_DESCRIPTOR_FOR_FUNCTION", false, "Descriptor not found for function %s");
        ErrorTypeKind.NOT_FOUND_DESCRIPTOR_FOR_CLASS = new ErrorTypeKind(77, "NOT_FOUND_DESCRIPTOR_FOR_CLASS", false, "Cannot build class type, descriptor not found for builder %s");
        ErrorTypeKind.NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER = new ErrorTypeKind(78, "NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER", false, "Cannot build type parameter type, descriptor not found for builder %s");
        ErrorTypeKind.UNMAPPED_ANNOTATION_TARGET_TYPE = new ErrorTypeKind(0x4F, "UNMAPPED_ANNOTATION_TARGET_TYPE", false, "Type for unmapped Java annotation target to Kotlin one");
        ErrorTypeKind.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT = new ErrorTypeKind(80, "UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT", false, "Unknown type for an array element of a java annotation argument");
        ErrorTypeKind.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION = new ErrorTypeKind(81, "NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION", false, "No fqName for annotation %s");
        ErrorTypeKind.NOT_FOUND_FQNAME = new ErrorTypeKind(82, "NOT_FOUND_FQNAME", false, "No fqName for %s");
        ErrorTypeKind.TYPE_FOR_GENERATED_ERROR_EXPRESSION = new ErrorTypeKind(83, "TYPE_FOR_GENERATED_ERROR_EXPRESSION", false, "Type for generated error expression");
        ErrorTypeKind.c = new ErrorTypeKind[]{ErrorTypeKind.UNRESOLVED_TYPE, ErrorTypeKind.UNRESOLVED_TYPE_PARAMETER_TYPE, ErrorTypeKind.UNRESOLVED_CLASS_TYPE, ErrorTypeKind.UNRESOLVED_JAVA_CLASS, ErrorTypeKind.UNRESOLVED_DECLARATION, ErrorTypeKind.UNRESOLVED_KCLASS_CONSTANT_VALUE, ErrorTypeKind.UNRESOLVED_TYPE_ALIAS, ErrorTypeKind.RETURN_TYPE, ErrorTypeKind.RETURN_TYPE_FOR_FUNCTION, ErrorTypeKind.RETURN_TYPE_FOR_PROPERTY, ErrorTypeKind.RETURN_TYPE_FOR_CONSTRUCTOR, ErrorTypeKind.IMPLICIT_RETURN_TYPE_FOR_FUNCTION, ErrorTypeKind.IMPLICIT_RETURN_TYPE_FOR_PROPERTY, ErrorTypeKind.IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR, ErrorTypeKind.ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT, ErrorTypeKind.RECURSIVE_TYPE, ErrorTypeKind.RECURSIVE_TYPE_ALIAS, ErrorTypeKind.RECURSIVE_ANNOTATION_TYPE, ErrorTypeKind.CYCLIC_UPPER_BOUNDS, ErrorTypeKind.CYCLIC_SUPERTYPES, ErrorTypeKind.UNINFERRED_LAMBDA_CONTEXT_RECEIVER_TYPE, ErrorTypeKind.UNINFERRED_LAMBDA_PARAMETER_TYPE, ErrorTypeKind.UNINFERRED_TYPE_VARIABLE, ErrorTypeKind.RESOLUTION_ERROR_TYPE, ErrorTypeKind.ERROR_EXPECTED_TYPE, ErrorTypeKind.ERROR_DATA_FLOW_TYPE, ErrorTypeKind.ERROR_WHILE_RECONSTRUCTING_BARE_TYPE, ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, ErrorTypeKind.DONT_CARE, ErrorTypeKind.STUB_TYPE, ErrorTypeKind.FUNCTION_PLACEHOLDER_TYPE, ErrorTypeKind.TYPE_FOR_RESULT, ErrorTypeKind.TYPE_FOR_COMPILER_EXCEPTION, ErrorTypeKind.ERROR_FLEXIBLE_TYPE, ErrorTypeKind.ERROR_RAW_TYPE, ErrorTypeKind.TYPE_WITH_MISMATCHED_TYPE_ARGUMENTS_AND_PARAMETERS, ErrorTypeKind.ILLEGAL_TYPE_RANGE_FOR_DYNAMIC, ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, ErrorTypeKind.INCONSISTENT_SUSPEND_FUNCTION, ErrorTypeKind.UNEXPECTED_FLEXIBLE_TYPE_ID, ErrorTypeKind.UNKNOWN_TYPE, ErrorTypeKind.NO_TYPE_SPECIFIED, ErrorTypeKind.NO_TYPE_FOR_LOOP_RANGE, ErrorTypeKind.NO_TYPE_FOR_LOOP_PARAMETER, ErrorTypeKind.MISSED_TYPE_FOR_PARAMETER, ErrorTypeKind.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER, ErrorTypeKind.PARSE_ERROR_ARGUMENT, ErrorTypeKind.STAR_PROJECTION_IN_CALL, ErrorTypeKind.PROHIBITED_DYNAMIC_TYPE, ErrorTypeKind.NOT_ANNOTATION_TYPE_IN_ANNOTATION_CONTEXT, ErrorTypeKind.UNIT_RETURN_TYPE_FOR_INC_DEC, ErrorTypeKind.RETURN_NOT_ALLOWED, ErrorTypeKind.UNRESOLVED_PARCEL_TYPE, ErrorTypeKind.KAPT_ERROR_TYPE, ErrorTypeKind.SYNTHETIC_ELEMENT_ERROR_TYPE, ErrorTypeKind.AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE, ErrorTypeKind.ERROR_EXPRESSION_TYPE, ErrorTypeKind.ERROR_RECEIVER_TYPE, ErrorTypeKind.ERROR_CONSTANT_VALUE, ErrorTypeKind.EMPTY_CALLABLE_REFERENCE, ErrorTypeKind.UNSUPPORTED_CALLABLE_REFERENCE_TYPE, ErrorTypeKind.TYPE_FOR_DELEGATION, ErrorTypeKind.UNAVAILABLE_TYPE_FOR_DECLARATION, ErrorTypeKind.ERROR_TYPE_PARAMETER, ErrorTypeKind.ERROR_TYPE_PROJECTION, ErrorTypeKind.ERROR_SUPER_TYPE, ErrorTypeKind.SUPER_TYPE_FOR_ERROR_TYPE, ErrorTypeKind.ERROR_PROPERTY_TYPE, ErrorTypeKind.ERROR_CLASS, ErrorTypeKind.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, ErrorTypeKind.INTERSECTION_OF_ERROR_TYPES, ErrorTypeKind.CANNOT_COMPUTE_ERASED_BOUND, ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE, ErrorTypeKind.ERROR_ENUM_TYPE, ErrorTypeKind.NO_RECORDED_TYPE, ErrorTypeKind.NOT_FOUND_DESCRIPTOR_FOR_FUNCTION, ErrorTypeKind.NOT_FOUND_DESCRIPTOR_FOR_CLASS, ErrorTypeKind.NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER, ErrorTypeKind.UNMAPPED_ANNOTATION_TARGET_TYPE, ErrorTypeKind.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, ErrorTypeKind.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, ErrorTypeKind.NOT_FOUND_FQNAME, ErrorTypeKind.TYPE_FOR_GENERATED_ERROR_EXPRESSION};
    }

    public ErrorTypeKind(int v, String s, boolean z, String s1) {
        super(s, v);
        this.a = s1;
        this.b = z;
    }

    @NotNull
    public final String getDebugMessage() {
        return this.a;
    }

    public final boolean isUnresolved() {
        return this.b;
    }

    public static ErrorTypeKind valueOf(String s) {
        return (ErrorTypeKind)Enum.valueOf(ErrorTypeKind.class, s);
    }

    public static ErrorTypeKind[] values() {
        return (ErrorTypeKind[])ErrorTypeKind.c.clone();
    }
}

