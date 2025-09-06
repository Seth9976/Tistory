package androidx.compose.runtime;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.ui.text.android.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;
import y0.p;

@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A5\u0010\u0007\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u00022\u0011\u0010\u0006\u001A\r\u0012\u0004\u0012\u00028\u00000\u0004\u00A2\u0006\u0002\b\u0005H\u0087\b\u00A2\u0006\u0004\b\u0007\u0010\b\u001A\u001F\u0010\u000B\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\u00012\u0006\u0010\u000B\u001A\u00020\nH\u0007\u00A2\u0006\u0004\b\u000B\u0010\r\u001A\'\u0010\u0010\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\u00012\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u000B\u001A\u00020\nH\u0007\u00A2\u0006\u0004\b\u0010\u0010\u0011\u001A\u000F\u0010\u0012\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0012\u0010\u0013\u001A\u001F\u0010\u0015\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0014\u001A\u00020\nH\u0007\u00A2\u0006\u0004\b\u0015\u0010\u0016\u001A/\u0010\u0015\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0017\u001A\u00020\u000E2\u0006\u0010\u0018\u001A\u00020\u000E2\u0006\u0010\u0014\u001A\u00020\nH\u0007\u00A2\u0006\u0004\b\u0015\u0010\u0019\u001A\u000F\u0010\u001A\u001A\u00020\fH\u0007\u00A2\u0006\u0004\b\u001A\u0010\u001B\u001A\u0017\u0010\u001C\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\u0001H\u0007\u00A2\u0006\u0004\b\u001C\u0010\u001D\u001A\u001B\u0010!\u001A\u00020\f*\u00020\u001E2\u0006\u0010 \u001A\u00020\u001FH\u0000\u00A2\u0006\u0004\b!\u0010\"\u001A>\u0010(\u001A\u00020\f\"\u0004\b\u0000\u0010#*\u00020\u001E2\b\u0010%\u001A\u0004\u0018\u00010$2\u0018\u0010\'\u001A\u0014\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00028\u00000&H\u0080\b\u00A2\u0006\u0004\b(\u0010)\u001A\u001B\u0010*\u001A\u00020\f*\u00020\u001E2\u0006\u0010 \u001A\u00020\u001FH\u0000\u00A2\u0006\u0004\b*\u0010\"\u001A1\u0010-\u001A\u00020\f2\u0006\u0010+\u001A\u00020\u00022\f\u0010,\u001A\b\u0012\u0004\u0012\u00020\n0\u0004H\u0080\b\u0082\u0002\b\n\u0006\b\u0000\u001A\u0002\u0010\u0001\u00A2\u0006\u0004\b-\u0010.\u001A\u0017\u0010-\u001A\u00020\f2\u0006\u0010+\u001A\u00020\u0002H\u0000\u00A2\u0006\u0004\b-\u0010/\u001A\u0017\u00102\u001A\u0002012\u0006\u00100\u001A\u00020\nH\u0000\u00A2\u0006\u0004\b2\u00103\u001A\u0017\u00104\u001A\u00020\f2\u0006\u00100\u001A\u00020\nH\u0000\u00A2\u0006\u0004\b4\u00105\"\u001A\u00106\u001A\u00020\u000E8\u0000X\u0081T\u00A2\u0006\f\n\u0004\b6\u00107\u0012\u0004\b8\u0010\u001B\" \u0010?\u001A\u0002098\u0000X\u0081\u0004\u00A2\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b>\u0010\u001B\u001A\u0004\b<\u0010=\"\u001A\u0010@\u001A\u00020\u000E8\u0000X\u0081T\u00A2\u0006\f\n\u0004\b@\u00107\u0012\u0004\bA\u0010\u001B\" \u0010E\u001A\u0002098\u0000X\u0081\u0004\u00A2\u0006\u0012\n\u0004\bB\u0010;\u0012\u0004\bD\u0010\u001B\u001A\u0004\bC\u0010=\"\u001A\u0010F\u001A\u00020\u000E8\u0000X\u0081T\u00A2\u0006\f\n\u0004\bF\u00107\u0012\u0004\bG\u0010\u001B\" \u0010K\u001A\u0002098\u0000X\u0081\u0004\u00A2\u0006\u0012\n\u0004\bH\u0010;\u0012\u0004\bJ\u0010\u001B\u001A\u0004\bI\u0010=\"\u001A\u0010L\u001A\u00020\u000E8\u0000X\u0081T\u00A2\u0006\f\n\u0004\bL\u00107\u0012\u0004\bM\u0010\u001B\" \u0010Q\u001A\u0002098\u0000X\u0081\u0004\u00A2\u0006\u0012\n\u0004\bN\u0010;\u0012\u0004\bP\u0010\u001B\u001A\u0004\bO\u0010=\"\u001A\u0010R\u001A\u00020\u000E8\u0000X\u0081T\u00A2\u0006\f\n\u0004\bR\u00107\u0012\u0004\bS\u0010\u001B\" \u0010W\u001A\u0002098\u0000X\u0081\u0004\u00A2\u0006\u0012\n\u0004\bT\u0010;\u0012\u0004\bV\u0010\u001B\u001A\u0004\bU\u0010=\"\u001A\u0010X\u001A\u00020\u000E8\u0000X\u0081T\u00A2\u0006\f\n\u0004\bX\u00107\u0012\u0004\bY\u0010\u001B\" \u0010]\u001A\u0002098\u0000X\u0081\u0004\u00A2\u0006\u0012\n\u0004\bZ\u0010;\u0012\u0004\b\\\u0010\u001B\u001A\u0004\b[\u0010=\"\u001A\u0010^\u001A\u00020\u000E8\u0000X\u0081T\u00A2\u0006\f\n\u0004\b^\u00107\u0012\u0004\b_\u0010\u001B\"\u0018\u0010`\u001A\u00020\u0002*\u00020\u001E8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b`\u0010a\"\u0018\u0010`\u001A\u00020\u0002*\u00020b8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b`\u0010c\u00A8\u0006d"}, d2 = {"T", "Landroidx/compose/runtime/Composer;", "", "invalid", "Lkotlin/Function0;", "Landroidx/compose/runtime/DisallowComposableCalls;", "block", "cache", "(Landroidx/compose/runtime/Composer;ZLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "composer", "", "sourceInformation", "", "(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V", "", "key", "sourceInformationMarkerStart", "(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V", "isTraceInProgress", "()Z", "info", "traceEventStart", "(ILjava/lang/String;)V", "dirty1", "dirty2", "(IIILjava/lang/String;)V", "traceEventEnd", "()V", "sourceInformationMarkerEnd", "(Landroidx/compose/runtime/Composer;)V", "Landroidx/compose/runtime/SlotWriter;", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "removeCurrentGroup", "(Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "R", "Landroidx/compose/runtime/Anchor;", "anchor", "Lkotlin/Function2;", "cb", "withAfterAnchorInfo", "(Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/Anchor;Lkotlin/jvm/functions/Function2;)V", "deactivateCurrentGroup", "value", "lazyMessage", "runtimeCheck", "(ZLkotlin/jvm/functions/Function0;)V", "(Z)V", "message", "", "composeRuntimeError", "(Ljava/lang/String;)Ljava/lang/Void;", "composeImmediateRuntimeError", "(Ljava/lang/String;)V", "invocationKey", "I", "getInvocationKey$annotations", "", "b", "Ljava/lang/Object;", "getInvocation", "()Ljava/lang/Object;", "getInvocation$annotations", "invocation", "providerKey", "getProviderKey$annotations", "c", "getProvider", "getProvider$annotations", "provider", "compositionLocalMapKey", "getCompositionLocalMapKey$annotations", "d", "getCompositionLocalMap", "getCompositionLocalMap$annotations", "compositionLocalMap", "providerValuesKey", "getProviderValuesKey$annotations", "e", "getProviderValues", "getProviderValues$annotations", "providerValues", "providerMapsKey", "getProviderMapsKey$annotations", "f", "getProviderMaps", "getProviderMaps$annotations", "providerMaps", "referenceKey", "getReferenceKey$annotations", "g", "getReference", "getReference$annotations", "reference", "reuseKey", "getReuseKey$annotations", "isAfterFirstChild", "(Landroidx/compose/runtime/SlotWriter;)Z", "Landroidx/compose/runtime/SlotReader;", "(Landroidx/compose/runtime/SlotReader;)Z", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,4582:1\n4184#1,8:4591\n4184#1,8:4606\n4551#1,7:4615\n4551#1,7:4630\n1#2:4583\n2272#3,7:4584\n2280#3:4599\n2262#3,6:4600\n2269#3:4614\n158#4,8:4622\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n4166#1:4591,8\n4221#1:4606,8\n4241#1:4615,7\n4559#1:4630,7\n4157#1:4584,7\n4157#1:4599\n4212#1:4600,6\n4212#1:4614\n4404#1:4622,8\n*E\n"})
public final class ComposerKt {
    public static CompositionTracer a = null;
    public static final OpaqueKey b = null;
    public static final OpaqueKey c = null;
    public static final int compositionLocalMapKey = 202;
    public static final OpaqueKey d = null;
    public static final OpaqueKey e = null;
    public static final OpaqueKey f = null;
    public static final OpaqueKey g = null;
    public static final j h = null;
    public static final int invocationKey = 200;
    public static final int providerKey = 201;
    public static final int providerMapsKey = 204;
    public static final int providerValuesKey = 203;
    public static final int referenceKey = 206;
    public static final int reuseKey = 0xCF;

    static {
        ComposerKt.b = new OpaqueKey("provider");
        ComposerKt.c = new OpaqueKey("provider");
        ComposerKt.d = new OpaqueKey("compositionLocalMap");
        ComposerKt.e = new OpaqueKey("providerValues");
        ComposerKt.f = new OpaqueKey("providers");
        ComposerKt.g = new OpaqueKey("reference");
        ComposerKt.h = new j(8);
    }

    public static final void a(SlotReader slotReader0, ArrayList arrayList0, int v) {
        if(slotReader0.isNode(v)) {
            arrayList0.add(slotReader0.node(v));
            return;
        }
        int v1 = v + 1;
        int v2 = slotReader0.groupSize(v);
        while(v1 < v2 + v) {
            ComposerKt.a(slotReader0, arrayList0, v1);
            v1 += slotReader0.groupSize(v1);
        }
    }

    public static final boolean access$asBool(int v) {
        return v != 0;
    }

    public static final int access$asInt(boolean z) [...] // Inlined contents

    public static final List access$collectNodesFrom(SlotTable slotTable0, Anchor anchor0) {
        try {
            List list0 = new ArrayList();
            try(SlotReader slotReader0 = slotTable0.openReader()) {
                ComposerKt.a(slotReader0, ((ArrayList)list0), slotTable0.anchorIndex(anchor0));
            }
            return list0;
        }
        catch(Throwable throwable0) {
            throw throwable0;
        }
    }

    public static final List access$filterToRange(List list0, int v, int v1) {
        List list1 = new ArrayList();
        int v2 = ComposerKt.b(v, list0);
        if(v2 < 0) {
            v2 = -(v2 + 1);
        }
        while(v2 < list0.size()) {
            p p0 = (p)list0.get(v2);
            if(p0.b >= v1) {
                break;
            }
            ((ArrayList)list1).add(p0);
            ++v2;
        }
        return list1;
    }

    public static final p access$firstInRange(List list0, int v, int v1) {
        int v2 = ComposerKt.b(v, list0);
        if(v2 < 0) {
            v2 = -(v2 + 1);
        }
        if(v2 < list0.size()) {
            p p0 = (p)list0.get(v2);
            return p0.b < v1 ? p0 : null;
        }
        return null;
    }

    public static final Object access$getJoinedKey(KeyInfo keyInfo0) {
        return keyInfo0.getObjectKey() != null ? new JoinedKey(keyInfo0.getKey(), keyInfo0.getObjectKey()) : keyInfo0.getKey();
    }

    public static final void access$insertIfMissing(List list0, int v, RecomposeScopeImpl recomposeScopeImpl0, Object object0) {
        int v1 = ComposerKt.b(v, list0);
        if(v1 < 0) {
            if(!(object0 instanceof DerivedState)) {
                object0 = null;
            }
            list0.add(-(v1 + 1), new p(recomposeScopeImpl0, v, object0));
            return;
        }
        p p0 = (p)list0.get(v1);
        if(object0 instanceof DerivedState) {
            Object object1 = p0.c;
            if(object1 == null) {
                p0.c = object0;
                return;
            }
            if(object1 instanceof MutableScatterSet) {
                ((MutableScatterSet)object1).add(object0);
                return;
            }
            p0.c = ScatterSetKt.mutableScatterSetOf(object1, object0);
            return;
        }
        p0.c = null;
    }

    public static final MutableScatterMap access$multiMap(int v) {
        return new MutableScatterMap(v);
    }

    public static final int access$nearestCommonRootOf(SlotReader slotReader0, int v, int v1, int v2) {
        if(v != v1) {
            if(v == v2 || v1 == v2) {
                return v2;
            }
            if(slotReader0.parent(v) == v1) {
                return v1;
            }
            if(slotReader0.parent(v1) != v) {
                if(slotReader0.parent(v) == slotReader0.parent(v1)) {
                    return slotReader0.parent(v);
                }
                int v4 = v;
                int v5;
                for(v5 = 0; v4 > 0 && v4 != v2; ++v5) {
                    v4 = slotReader0.parent(v4);
                }
                int v6 = v1;
                int v7;
                for(v7 = 0; v6 > 0 && v6 != v2; ++v7) {
                    v6 = slotReader0.parent(v6);
                }
                for(int v8 = 0; v8 < v5 - v7; ++v8) {
                    v = slotReader0.parent(v);
                }
                for(int v3 = 0; v3 < v7 - v5; ++v3) {
                    v1 = slotReader0.parent(v1);
                }
                while(v != v1) {
                    v = slotReader0.parent(v);
                    v1 = slotReader0.parent(v1);
                }
                return v;
            }
        }
        return v;
    }

    public static final p access$removeLocation(List list0, int v) {
        int v1 = ComposerKt.b(v, list0);
        return v1 < 0 ? null : ((p)list0.remove(v1));
    }

    public static final void access$removeRange(List list0, int v, int v1) {
        int v2 = ComposerKt.b(v, list0);
        if(v2 < 0) {
            v2 = -(v2 + 1);
        }
        while(v2 < list0.size() && ((p)list0.get(v2)).b < v1) {
            list0.remove(v2);
        }
    }

    public static final int b(int v, List list0) {
        int v1 = list0.size() - 1;
        int v2 = 0;
        while(v2 <= v1) {
            int v3 = v2 + v1 >>> 1;
            int v4 = Intrinsics.compare(((p)list0.get(v3)).b, v);
            if(v4 < 0) {
                v2 = v3 + 1;
                continue;
            }
            if(v4 > 0) {
                v1 = v3 - 1;
                continue;
            }
            return v3;
        }
        return -(v2 + 1);
    }

    public static final Object c(Object object0, Object object1, Object object2) {
        JoinedKey joinedKey0 = object0 instanceof JoinedKey ? ((JoinedKey)object0) : null;
        if(joinedKey0 != null) {
            if(!Intrinsics.areEqual(joinedKey0.getLeft(), object1) || !Intrinsics.areEqual(joinedKey0.getRight(), object2)) {
                object0 = ComposerKt.c(joinedKey0.getLeft(), object1, object2);
                return object0 == null ? ComposerKt.c(joinedKey0.getRight(), object1, object2) : object0;
            }
            return object0;
        }
        return null;
    }

    @ComposeCompilerApi
    public static final Object cache(@NotNull Composer composer0, boolean z, @NotNull Function0 function00) {
        Object object0 = composer0.rememberedValue();
        if(z || object0 == Composer.Companion.getEmpty()) {
            object0 = function00.invoke();
            composer0.updateRememberedValue(object0);
        }
        return object0;
    }

    public static final void composeImmediateRuntimeError(@NotNull String s) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + s + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    @NotNull
    public static final Void composeRuntimeError(@NotNull String s) {
        throw new ComposeRuntimeError(a.d("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", s, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void deactivateCurrentGroup(@NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
        int v8;
        int v7;
        int v = slotWriter0.getCurrentGroup();
        int v1 = slotWriter0.getCurrentGroupEnd();
        while(v < v1) {
            Object object0 = slotWriter0.node(v);
            if(object0 instanceof ComposeNodeLifecycleCallback) {
                rememberManager0.deactivating(((ComposeNodeLifecycleCallback)object0), slotWriter0.getSlotsSize() - slotWriter0.slotsStartIndex$runtime_release(v), -1, -1);
            }
            int v2 = SlotWriter.access$slotIndex(slotWriter0, SlotWriter.access$getGroups$p(slotWriter0), SlotWriter.access$groupIndexToAddress(slotWriter0, v));
            int v3 = SlotWriter.access$dataIndex(slotWriter0, SlotWriter.access$getGroups$p(slotWriter0), SlotWriter.access$groupIndexToAddress(slotWriter0, v + 1));
            for(int v4 = v2; v4 < v3; ++v4) {
                int v5 = v4 - v2;
                Object object1 = SlotWriter.access$getSlots$p(slotWriter0)[SlotWriter.access$dataIndexToDataAddress(slotWriter0, v4)];
                if(object1 instanceof RememberObserverHolder) {
                    RememberObserver rememberObserver0 = ((RememberObserverHolder)object1).getWrapped();
                    if(!(rememberObserver0 instanceof ReusableRememberObserver)) {
                        if(object1 != slotWriter0.set(v, v5, Composer.Companion.getEmpty())) {
                            ComposerKt.composeImmediateRuntimeError("Slot table is out of sync");
                        }
                        int v6 = slotWriter0.getSlotsSize();
                        Anchor anchor0 = ((RememberObserverHolder)object1).getAfter();
                        if(anchor0 == null || !anchor0.getValid()) {
                            v7 = -1;
                            v8 = -1;
                        }
                        else {
                            v7 = slotWriter0.anchorIndex(anchor0);
                            v8 = slotWriter0.getSlotsSize() - slotWriter0.slotsEndAllIndex$runtime_release(v7);
                        }
                        rememberManager0.forgetting(rememberObserver0, v6 - v5, v7, v8);
                    }
                }
                else if(object1 instanceof RecomposeScopeImpl) {
                    if(object1 != slotWriter0.set(v, v5, Composer.Companion.getEmpty())) {
                        ComposerKt.composeImmediateRuntimeError("Slot table is out of sync");
                    }
                    ((RecomposeScopeImpl)object1).release();
                }
            }
            ++v;
        }
    }

    @NotNull
    public static final Object getCompositionLocalMap() {
        return ComposerKt.d;
    }

    @PublishedApi
    public static void getCompositionLocalMap$annotations() {
    }

    @PublishedApi
    public static void getCompositionLocalMapKey$annotations() {
    }

    @NotNull
    public static final Object getInvocation() {
        return ComposerKt.b;
    }

    @PublishedApi
    public static void getInvocation$annotations() {
    }

    @PublishedApi
    public static void getInvocationKey$annotations() {
    }

    @NotNull
    public static final Object getProvider() {
        return ComposerKt.c;
    }

    @PublishedApi
    public static void getProvider$annotations() {
    }

    @PublishedApi
    public static void getProviderKey$annotations() {
    }

    @NotNull
    public static final Object getProviderMaps() {
        return ComposerKt.f;
    }

    @PublishedApi
    public static void getProviderMaps$annotations() {
    }

    @PublishedApi
    public static void getProviderMapsKey$annotations() {
    }

    @NotNull
    public static final Object getProviderValues() {
        return ComposerKt.e;
    }

    @PublishedApi
    public static void getProviderValues$annotations() {
    }

    @PublishedApi
    public static void getProviderValuesKey$annotations() {
    }

    @NotNull
    public static final Object getReference() {
        return ComposerKt.g;
    }

    @PublishedApi
    public static void getReference$annotations() {
    }

    @PublishedApi
    public static void getReferenceKey$annotations() {
    }

    @PublishedApi
    public static void getReuseKey$annotations() {
    }

    public static final boolean isAfterFirstChild(@NotNull SlotReader slotReader0) {
        return slotReader0.getCurrentGroup() > slotReader0.getParent() + 1;
    }

    public static final boolean isAfterFirstChild(@NotNull SlotWriter slotWriter0) {
        return slotWriter0.getCurrentGroup() > slotWriter0.getParent() + 1;
    }

    @ComposeCompilerApi
    public static final boolean isTraceInProgress() {
        return ComposerKt.a != null && ComposerKt.a.isTraceInProgress();
    }

    public static final void removeCurrentGroup(@NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
        int v4;
        int v = SlotWriter.access$dataIndex(slotWriter0, SlotWriter.access$getGroups$p(slotWriter0), SlotWriter.access$groupIndexToAddress(slotWriter0, slotWriter0.getCurrentGroup()));
        int v1 = SlotWriter.access$dataIndex(slotWriter0, SlotWriter.access$getGroups$p(slotWriter0), SlotWriter.access$groupIndexToAddress(slotWriter0, slotWriter0.groupSize(slotWriter0.getCurrentGroup()) + slotWriter0.getCurrentGroup()));
        while(v < v1) {
            Object object0 = SlotWriter.access$getSlots$p(slotWriter0)[SlotWriter.access$dataIndexToDataAddress(slotWriter0, v)];
            int v2 = -1;
            if(object0 instanceof ComposeNodeLifecycleCallback) {
                rememberManager0.releasing(((ComposeNodeLifecycleCallback)object0), slotWriter0.getSlotsSize() - v, -1, -1);
            }
            if(object0 instanceof RememberObserverHolder) {
                int v3 = slotWriter0.getSlotsSize();
                Anchor anchor0 = ((RememberObserverHolder)object0).getAfter();
                if(anchor0 == null || !anchor0.getValid()) {
                    v4 = -1;
                }
                else {
                    v2 = slotWriter0.anchorIndex(anchor0);
                    v4 = slotWriter0.getSlotsSize() - slotWriter0.slotsEndAllIndex$runtime_release(v2);
                }
                rememberManager0.forgetting(((RememberObserverHolder)object0).getWrapped(), v3 - v, v2, v4);
            }
            if(object0 instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl)object0).release();
            }
            ++v;
        }
        slotWriter0.removeGroup();
    }

    public static final void runtimeCheck(boolean z) {
        if(!z) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
    }

    public static final void runtimeCheck(boolean z, @NotNull Function0 function00) {
        if(!z) {
            ComposerKt.composeImmediateRuntimeError(((String)function00.invoke()));
        }
    }

    @ComposeCompilerApi
    public static final void sourceInformation(@NotNull Composer composer0, @NotNull String s) {
        composer0.sourceInformation(s);
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerEnd(@NotNull Composer composer0) {
        composer0.sourceInformationMarkerEnd();
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerStart(@NotNull Composer composer0, int v, @NotNull String s) {
        composer0.sourceInformationMarkerStart(v, s);
    }

    @ComposeCompilerApi
    public static final void traceEventEnd() {
        CompositionTracer compositionTracer0 = ComposerKt.a;
        if(compositionTracer0 != null) {
            compositionTracer0.traceEventEnd();
        }
    }

    @ComposeCompilerApi
    public static final void traceEventStart(int v, int v1, int v2, @NotNull String s) {
        CompositionTracer compositionTracer0 = ComposerKt.a;
        if(compositionTracer0 != null) {
            compositionTracer0.traceEventStart(v, v1, v2, s);
        }
    }

    @ComposeCompilerApi
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the overload with $dirty metadata instead", replaceWith = @ReplaceWith(expression = "traceEventStart(key, dirty1, dirty2, info)", imports = {}))
    public static final void traceEventStart(int v, String s) {
        ComposerKt.traceEventStart(v, -1, -1, s);
    }

    public static final void withAfterAnchorInfo(@NotNull SlotWriter slotWriter0, @Nullable Anchor anchor0, @NotNull Function2 function20) {
        int v1;
        int v;
        if(anchor0 == null || !anchor0.getValid()) {
            v = -1;
            v1 = -1;
        }
        else {
            v = slotWriter0.anchorIndex(anchor0);
            v1 = slotWriter0.getSlotsSize() - slotWriter0.slotsEndAllIndex$runtime_release(v);
        }
        function20.invoke(v, v1);
    }
}

