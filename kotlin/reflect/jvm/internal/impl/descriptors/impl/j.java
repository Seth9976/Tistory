package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

public final class j extends MemberScopeImpl {
    public final MemoizedFunctionToNotNull a;
    public final MemoizedFunctionToNotNull b;
    public final NotNullLazyValue c;
    public final EnumEntrySyntheticClassDescriptor d;

    public j(EnumEntrySyntheticClassDescriptor enumEntrySyntheticClassDescriptor0, StorageManager storageManager0) {
        if(storageManager0 != null) {
            this.d = enumEntrySyntheticClassDescriptor0;
            super();
            this.a = storageManager0.createMemoizedFunction(new h(this, 0));
            this.b = storageManager0.createMemoizedFunction(new h(this, 1));
            this.c = storageManager0.createLazyValue(new e(this, 1));
            return;
        }
        j.a(0);
        throw null;
    }

    public static void a(int v) {
        Object[] arr_object = new Object[(v == 3 || v == 7 || v == 9 || v == 12 || (v == 15 || v == 16 || v == 17 || v == 18 || v == 19) ? 2 : 3)];
        switch(v) {
            case 2: 
            case 6: {
                arr_object[0] = "location";
                break;
            }
            case 1: 
            case 4: 
            case 5: 
            case 8: 
            case 10: {
                arr_object[0] = "name";
                break;
            }
            case 11: {
                arr_object[0] = "fromSupertypes";
                break;
            }
            case 13: {
                arr_object[0] = "kindFilter";
                break;
            }
            case 14: {
                arr_object[0] = "nameFilter";
                break;
            }
            case 3: 
            case 7: 
            case 9: 
            case 12: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                break;
            }
            case 20: {
                arr_object[0] = "p";
                break;
            }
            default: {
                arr_object[0] = "storageManager";
            }
        }
        switch(v) {
            case 3: {
                arr_object[1] = "getContributedVariables";
                break;
            }
            case 7: {
                arr_object[1] = "getContributedFunctions";
                break;
            }
            case 9: {
                arr_object[1] = "getSupertypeScope";
                break;
            }
            case 12: {
                arr_object[1] = "resolveFakeOverrides";
                break;
            }
            case 15: {
                arr_object[1] = "getContributedDescriptors";
                break;
            }
            case 16: {
                arr_object[1] = "computeAllDeclarations";
                break;
            }
            case 17: {
                arr_object[1] = "getFunctionNames";
                break;
            }
            case 18: {
                arr_object[1] = "getClassifierNames";
                break;
            }
            case 19: {
                arr_object[1] = "getVariableNames";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
            }
        }
        switch(v) {
            case 1: 
            case 2: {
                arr_object[2] = "getContributedVariables";
                break;
            }
            case 4: {
                arr_object[2] = "computeProperties";
                break;
            }
            case 5: 
            case 6: {
                arr_object[2] = "getContributedFunctions";
                break;
            }
            case 8: {
                arr_object[2] = "computeFunctions";
                break;
            }
            case 10: 
            case 11: {
                arr_object[2] = "resolveFakeOverrides";
                break;
            }
            case 13: 
            case 14: {
                arr_object[2] = "getContributedDescriptors";
                break;
            }
            case 3: 
            case 7: 
            case 9: 
            case 12: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: {
                break;
            }
            case 20: {
                arr_object[2] = "printScopeStructure";
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s = String.format((v == 3 || v == 7 || v == 9 || v == 12 || (v == 15 || v == 16 || v == 17 || v == 18 || v == 19) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 3 || v == 7 || v == 9 || v == 12 || (v == 15 || v == 16 || v == 17 || v == 18 || v == 19) ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    public final LinkedHashSet b(Name name0, Collection collection0) {
        if(name0 != null) {
            if(collection0 != null) {
                LinkedHashSet linkedHashSet0 = new LinkedHashSet();
                Set set0 = Collections.emptySet();
                i i0 = new i(linkedHashSet0);
                OverridingUtil.DEFAULT.generateOverridesInFunctionGroup(name0, collection0, set0, this.d, i0);
                return linkedHashSet0;
            }
            j.a(11);
            throw null;
        }
        j.a(10);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    public final Set getClassifierNames() {
        Set set0 = Collections.emptySet();
        if(set0 != null) {
            return set0;
        }
        j.a(18);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    public final Collection getContributedDescriptors(DescriptorKindFilter descriptorKindFilter0, Function1 function10) {
        if(descriptorKindFilter0 != null) {
            if(function10 != null) {
                Collection collection0 = (Collection)this.c.invoke();
                if(collection0 != null) {
                    return collection0;
                }
                j.a(15);
                throw null;
            }
            j.a(14);
            throw null;
        }
        j.a(13);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    public final Collection getContributedFunctions(Name name0, LookupLocation lookupLocation0) {
        if(name0 != null) {
            if(lookupLocation0 != null) {
                Collection collection0 = (Collection)this.a.invoke(name0);
                if(collection0 != null) {
                    return collection0;
                }
                j.a(7);
                throw null;
            }
            j.a(6);
            throw null;
        }
        j.a(5);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    public final Collection getContributedVariables(Name name0, LookupLocation lookupLocation0) {
        if(name0 != null) {
            if(lookupLocation0 != null) {
                Collection collection0 = (Collection)this.b.invoke(name0);
                if(collection0 != null) {
                    return collection0;
                }
                j.a(3);
                throw null;
            }
            j.a(2);
            throw null;
        }
        j.a(1);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    public final Set getFunctionNames() {
        Set set0 = (Set)this.d.i.invoke();
        if(set0 != null) {
            return set0;
        }
        j.a(17);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
    public final Set getVariableNames() {
        Set set0 = (Set)this.d.i.invoke();
        if(set0 != null) {
            return set0;
        }
        j.a(19);
        throw null;
    }
}

