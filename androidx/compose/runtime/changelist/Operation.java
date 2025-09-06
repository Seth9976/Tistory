package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.OffsetApplier;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeOwner;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:$\"#$%&\'()*+,-./0123456789:;<=>?@ABCDEJ/\u0010\n\u001A\u00020\t*\u00020\u00022\n\u0010\u0004\u001A\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000BJ\u001A\u0010\u0011\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\u0010J\u001E\u0010\u0014\u001A\u00020\u000E2\n\u0010\r\u001A\u0006\u0012\u0002\b\u00030\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0010J\u000F\u0010\u0015\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001C\u001A\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001BR\u0017\u0010\u001F\u001A\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u0019\u001A\u0004\b\u001E\u0010\u001BR\u0011\u0010!\u001A\u00020\u000E8F¢\u0006\u0006\u001A\u0004\b \u0010\u0016\u0082\u0001\"FGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefg\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006h"}, d2 = {"Landroidx/compose/runtime/changelist/Operation;", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "parameter", "", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "intParamName", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "objectParamName-31yXWZQ", "objectParamName", "toString", "()Ljava/lang/String;", "", "a", "I", "getInts", "()I", "ints", "b", "getObjects", "objects", "getName", "name", "AdvanceSlotsBy", "AppendValue", "ApplyChangeList", "CopyNodesToNewAnchorLocation", "CopySlotTableToAnchorLocation", "DeactivateCurrentGroup", "DetermineMovableContentNodeIndex", "Downs", "EndCompositionScope", "EndCurrentGroup", "EndMovableContentPlacement", "EnsureGroupStarted", "EnsureRootGroupStarted", "InsertNodeFixup", "InsertSlots", "InsertSlotsWithFixups", "IntParameter", "MoveCurrentGroup", "MoveNode", "ObjectParameter", "PostInsertNodeFixup", "ReleaseMovableGroupAtCurrent", "Remember", "RemoveCurrentGroup", "RemoveNode", "ResetSlots", "SideEffect", "SkipToEndOfCurrentGroup", "TestOperation", "TrimParentValues", "UpdateAnchoredValue", "UpdateAuxData", "UpdateNode", "UpdateValue", "Ups", "UseCurrentNode", "Landroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy;", "Landroidx/compose/runtime/changelist/Operation$AppendValue;", "Landroidx/compose/runtime/changelist/Operation$ApplyChangeList;", "Landroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation;", "Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;", "Landroidx/compose/runtime/changelist/Operation$DeactivateCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex;", "Landroidx/compose/runtime/changelist/Operation$Downs;", "Landroidx/compose/runtime/changelist/Operation$EndCompositionScope;", "Landroidx/compose/runtime/changelist/Operation$EndCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$EndMovableContentPlacement;", "Landroidx/compose/runtime/changelist/Operation$EnsureGroupStarted;", "Landroidx/compose/runtime/changelist/Operation$EnsureRootGroupStarted;", "Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;", "Landroidx/compose/runtime/changelist/Operation$InsertSlots;", "Landroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups;", "Landroidx/compose/runtime/changelist/Operation$MoveCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$MoveNode;", "Landroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup;", "Landroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent;", "Landroidx/compose/runtime/changelist/Operation$Remember;", "Landroidx/compose/runtime/changelist/Operation$RemoveCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$RemoveNode;", "Landroidx/compose/runtime/changelist/Operation$ResetSlots;", "Landroidx/compose/runtime/changelist/Operation$SideEffect;", "Landroidx/compose/runtime/changelist/Operation$SkipToEndOfCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$TestOperation;", "Landroidx/compose/runtime/changelist/Operation$TrimParentValues;", "Landroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue;", "Landroidx/compose/runtime/changelist/Operation$UpdateAuxData;", "Landroidx/compose/runtime/changelist/Operation$UpdateNode;", "Landroidx/compose/runtime/changelist/Operation$UpdateValue;", "Landroidx/compose/runtime/changelist/Operation$Ups;", "Landroidx/compose/runtime/changelist/Operation$UseCurrentNode;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class Operation {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001J\u001A\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u0010\u001A\u00020\u000F*\u00020\b2\n\u0010\n\u001A\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001A\u00020\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "parameter", "", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "intParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "getDistance-jn0FJLE", "()I", "Distance", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy\n*L\n1#1,990:1\n116#1:991\n116#1:992\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy\n*L\n119#1:991\n128#1:992\n*E\n"})
    public static final class AdvanceSlotsBy extends Operation {
        public static final int $stable;
        @NotNull
        public static final AdvanceSlotsBy INSTANCE;

        static {
            AdvanceSlotsBy.INSTANCE = new AdvanceSlotsBy(1, 0, 2, null);  // 初始化器: Landroidx/compose/runtime/changelist/Operation;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer0, @NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
            slotWriter0.advanceBy(operationArgContainer0.getInt-w8GmfQM(0));
        }

        public final int getDistance-jn0FJLE() {
            return 0;
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.compose.runtime.changelist.Operation
        @NotNull
        public String intParamName-w8GmfQM(int v) {
            return IntParameter.equals-impl0(v, 0) ? "distance" : super.intParamName-w8GmfQM(v);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u001E\u0010\u0007\u001A\u00020\u00042\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u0010\u001A\u00020\u000F*\u00020\b2\n\u0010\n\u001A\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001E\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00120\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014R \u0010\u0018\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0014\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$AppendValue;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "parameter", "", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "()I", "Anchor", "", "getValue-HpuvwBQ", "Value", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AppendValue\n*L\n1#1,990:1\n169#1:991\n170#1:992\n169#1:993\n170#1:994\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AppendValue\n*L\n173#1:991\n174#1:992\n183#1:993\n184#1:994\n*E\n"})
    public static final class AppendValue extends Operation {
        public static final int $stable;
        @NotNull
        public static final AppendValue INSTANCE;

        static {
            AppendValue.INSTANCE = new AppendValue(0, 2, 1, null);  // 初始化器: Landroidx/compose/runtime/changelist/Operation;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer0, @NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
            Anchor anchor0 = (Anchor)operationArgContainer0.getObject-31yXWZQ(0);
            Object object0 = operationArgContainer0.getObject-31yXWZQ(1);
            if(object0 instanceof RememberObserverHolder) {
                rememberManager0.remembering(((RememberObserverHolder)object0).getWrapped());
            }
            slotWriter0.appendSlot(anchor0, object0);
        }

        public final int getAnchor-HpuvwBQ() {
            return 0;
        }

        public final int getValue-HpuvwBQ() {
            return 1;
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        @NotNull
        public String objectParamName-31yXWZQ(int v) {
            if(ObjectParameter.equals-impl0(v, 0)) {
                return "anchor";
            }
            return ObjectParameter.equals-impl0(v, 1) ? "value" : super.objectParamName-31yXWZQ(v);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u001E\u0010\u0007\u001A\u00020\u00042\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u0010\u001A\u00020\u000F*\u00020\b2\n\u0010\n\u001A\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001E\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00120\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014R \u0010\u0018\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0014\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$ApplyChangeList;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "parameter", "", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "Landroidx/compose/runtime/changelist/ChangeList;", "getChanges-HpuvwBQ", "()I", "Changes", "Landroidx/compose/runtime/internal/IntRef;", "getEffectiveNodeIndex-HpuvwBQ", "EffectiveNodeIndex", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ApplyChangeList\n*L\n1#1,990:1\n788#1:991\n789#1:992\n789#1:993\n788#1:994\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ApplyChangeList\n*L\n792#1:991\n793#1:992\n802#1:993\n804#1:994\n*E\n"})
    public static final class ApplyChangeList extends Operation {
        public static final int $stable;
        @NotNull
        public static final ApplyChangeList INSTANCE;

        static {
            ApplyChangeList.INSTANCE = new ApplyChangeList(0, 2, 1, null);  // 初始化器: Landroidx/compose/runtime/changelist/Operation;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer0, @NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
            IntRef intRef0 = (IntRef)operationArgContainer0.getObject-31yXWZQ(1);
            int v = intRef0 == null ? 0 : intRef0.getElement();
            ChangeList changeList0 = (ChangeList)operationArgContainer0.getObject-31yXWZQ(0);
            if(v > 0) {
                applier0 = new OffsetApplier(applier0, v);
            }
            changeList0.executeAndFlushAllPendingChanges(applier0, slotWriter0, rememberManager0);
        }

        public final int getChanges-HpuvwBQ() {
            return 0;
        }

        public final int getEffectiveNodeIndex-HpuvwBQ() {
            return 1;
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        @NotNull
        public String objectParamName-31yXWZQ(int v) {
            if(ObjectParameter.equals-impl0(v, 0)) {
                return "changes";
            }
            return ObjectParameter.equals-impl0(v, 1) ? "effectiveNodeIndex" : super.objectParamName-31yXWZQ(v);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u001E\u0010\u0007\u001A\u00020\u00042\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u0010\u001A\u00020\u000F*\u00020\b2\n\u0010\n\u001A\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001E\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00120\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014R&\u0010\u0019\u001A\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00160\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u0014\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001A"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "parameter", "", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "Landroidx/compose/runtime/internal/IntRef;", "getEffectiveNodeIndex-HpuvwBQ", "()I", "EffectiveNodeIndex", "", "", "getNodes-HpuvwBQ", "Nodes", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,990:1\n674#1:991\n675#1:992\n674#1:993\n675#1:994\n64#2,6:995\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation\n*L\n678#1:991\n679#1:992\n688#1:993\n689#1:994\n691#1:995,6\n*E\n"})
    public static final class CopyNodesToNewAnchorLocation extends Operation {
        public static final int $stable;
        @NotNull
        public static final CopyNodesToNewAnchorLocation INSTANCE;

        static {
            CopyNodesToNewAnchorLocation.INSTANCE = new CopyNodesToNewAnchorLocation(0, 2, 1, null);  // 初始化器: Landroidx/compose/runtime/changelist/Operation;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer0, @NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
            int v1 = ((IntRef)operationArgContainer0.getObject-31yXWZQ(0)).getElement();
            List list0 = (List)operationArgContainer0.getObject-31yXWZQ(1);
            int v2 = list0.size();
            for(int v = 0; v < v2; ++v) {
                Object object0 = list0.get(v);
                Intrinsics.checkNotNull(applier0, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                int v3 = v1 + v;
                applier0.insertBottomUp(v3, object0);
                applier0.insertTopDown(v3, object0);
            }
        }

        public final int getEffectiveNodeIndex-HpuvwBQ() {
            return 0;
        }

        public final int getNodes-HpuvwBQ() {
            return 1;
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        @NotNull
        public String objectParamName-31yXWZQ(int v) {
            if(ObjectParameter.equals-impl0(v, 0)) {
                return "effectiveNodeIndex";
            }
            return ObjectParameter.equals-impl0(v, 1) ? "nodes" : super.objectParamName-31yXWZQ(v);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001J\u001E\u0010\u0007\u001A\u00020\u00042\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u0010\u001A\u00020\u000F*\u00020\b2\n\u0010\n\u001A\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014R\u001E\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00160\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0014R\u001E\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u00190\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u0014R\u001E\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u00190\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u001C\u0010\u0014\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001E"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "parameter", "", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "Landroidx/compose/runtime/MovableContentState;", "getResolvedState-HpuvwBQ", "()I", "ResolvedState", "Landroidx/compose/runtime/CompositionContext;", "getParentCompositionContext-HpuvwBQ", "ParentCompositionContext", "Landroidx/compose/runtime/MovableContentStateReference;", "getFrom-HpuvwBQ", "From", "getTo-HpuvwBQ", "To", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation\n*L\n1#1,990:1\n701#1:991\n702#1:992\n703#1:993\n704#1:994\n703#1:995\n704#1:996\n702#1:997\n701#1:998\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation\n*L\n707#1:991\n708#1:992\n709#1:993\n710#1:994\n719#1:995\n720#1:996\n722#1:997\n724#1:998\n*E\n"})
    public static final class CopySlotTableToAnchorLocation extends Operation {
        public static final int $stable;
        @NotNull
        public static final CopySlotTableToAnchorLocation INSTANCE;

        static {
            CopySlotTableToAnchorLocation.INSTANCE = new CopySlotTableToAnchorLocation(0, 4, 1, null);  // 初始化器: Landroidx/compose/runtime/changelist/Operation;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer0, @NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
            MovableContentStateReference movableContentStateReference0 = (MovableContentStateReference)operationArgContainer0.getObject-31yXWZQ(2);
            MovableContentStateReference movableContentStateReference1 = (MovableContentStateReference)operationArgContainer0.getObject-31yXWZQ(3);
            CompositionContext compositionContext0 = (CompositionContext)operationArgContainer0.getObject-31yXWZQ(1);
            MovableContentState movableContentState0 = (MovableContentState)operationArgContainer0.getObject-31yXWZQ(0);
            if(movableContentState0 == null) {
                movableContentState0 = compositionContext0.movableContentStateResolve$runtime_release(movableContentStateReference0);
                if(movableContentState0 == null) {
                    ComposerKt.composeRuntimeError("Could not resolve state for movable content");
                    throw new KotlinNothingValueException();
                }
            }
            List list0 = slotWriter0.moveIntoGroupFrom(1, movableContentState0.getSlotTable$runtime_release(), 2);
            ControlledComposition controlledComposition0 = movableContentStateReference1.getComposition$runtime_release();
            Intrinsics.checkNotNull(controlledComposition0, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeOwner");
            RecomposeScopeImpl.Companion.adoptAnchoredScopes$runtime_release(slotWriter0, list0, ((RecomposeScopeOwner)controlledComposition0));
        }

        public final int getFrom-HpuvwBQ() {
            return 2;
        }

        public final int getParentCompositionContext-HpuvwBQ() {
            return 1;
        }

        public final int getResolvedState-HpuvwBQ() {
            return 0;
        }

        public final int getTo-HpuvwBQ() {
            return 3;
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        @NotNull
        public String objectParamName-31yXWZQ(int v) {
            if(ObjectParameter.equals-impl0(v, 0)) {
                return "resolvedState";
            }
            if(ObjectParameter.equals-impl0(v, 1)) {
                return "resolvedCompositionContext";
            }
            if(ObjectParameter.equals-impl0(v, 2)) {
                return "from";
            }
            return ObjectParameter.equals-impl0(v, 3) ? "to" : super.objectParamName-31yXWZQ(v);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J/\u0010\n\u001A\u00020\t*\u00020\u00022\n\u0010\u0004\u001A\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$DeactivateCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class DeactivateCurrentGroup extends Operation {
        public static final int $stable;
        @NotNull
        public static final DeactivateCurrentGroup INSTANCE;

        static {
            DeactivateCurrentGroup.INSTANCE = new DeactivateCurrentGroup(0, 0, 3, null);  // 初始化器: Landroidx/compose/runtime/changelist/Operation;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer0, @NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
            ComposerKt.deactivateCurrentGroup(slotWriter0, rememberManager0);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u001E\u0010\u0007\u001A\u00020\u00042\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u0010\u001A\u00020\u000F*\u00020\b2\n\u0010\n\u001A\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001E\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00120\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014R\u001E\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00160\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0014\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "parameter", "", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "Landroidx/compose/runtime/internal/IntRef;", "getEffectiveNodeIndexOut-HpuvwBQ", "()I", "EffectiveNodeIndexOut", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "Anchor", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex\n*L\n1#1,990:1\n646#1:991\n647#1:992\n646#1:993\n647#1:994\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex\n*L\n650#1:991\n651#1:992\n661#1:993\n665#1:994\n*E\n"})
    public static final class DetermineMovableContentNodeIndex extends Operation {
        public static final int $stable;
        @NotNull
        public static final DetermineMovableContentNodeIndex INSTANCE;

        static {
            DetermineMovableContentNodeIndex.INSTANCE = new DetermineMovableContentNodeIndex(0, 2, 1, null);  // 初始化器: Landroidx/compose/runtime/changelist/Operation;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer0, @NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
            IntRef intRef0 = (IntRef)operationArgContainer0.getObject-31yXWZQ(0);
            Anchor anchor0 = (Anchor)operationArgContainer0.getObject-31yXWZQ(1);
            Intrinsics.checkNotNull(applier0, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            intRef0.setElement(OperationKt.access$positionToInsert(slotWriter0, anchor0, applier0));
        }

        // 去混淆评级： 低(20)
        public final int getAnchor-HpuvwBQ() {
            return 1;
        }

        public final int getEffectiveNodeIndexOut-HpuvwBQ() {
            return 0;
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        @NotNull
        public String objectParamName-31yXWZQ(int v) {
            if(ObjectParameter.equals-impl0(v, 0)) {
                return "effectiveNodeIndexOut";
            }
            return ObjectParameter.equals-impl0(v, 1) ? "anchor" : super.objectParamName-31yXWZQ(v);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001J\u001E\u0010\u0007\u001A\u00020\u00042\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u0010\u001A\u00020\u000F*\u00020\b2\n\u0010\n\u001A\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R&\u0010\u0016\u001A\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00120\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0014\u0010\u0015\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$Downs;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "parameter", "", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "", "", "getNodes-HpuvwBQ", "()I", "Nodes", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Downs\n*L\n1#1,990:1\n94#1:991\n94#1:992\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Downs\n*L\n97#1:991\n108#1:992\n*E\n"})
    public static final class Downs extends Operation {
        public static final int $stable;
        @NotNull
        public static final Downs INSTANCE;

        static {
            Downs.INSTANCE = new Downs(0, 1, 1, null);  // 初始化器: Landroidx/compose/runtime/changelist/Operation;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer0, @NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
            Intrinsics.checkNotNull(applier0, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            Object[] arr_object = (Object[])operationArgContainer0.getObject-31yXWZQ(0);
            for(int v = 0; v < arr_object.length; ++v) {
                applier0.down(arr_object[v]);
            }
        }

        public final int getNodes-HpuvwBQ() {
            return 0;
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.compose.runtime.changelist.Operation
        @NotNull
        public String objectParamName-31yXWZQ(int v) {
            return ObjectParameter.equals-impl0(v, 0) ? "nodes" : super.objectParamName-31yXWZQ(v);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001J\u001E\u0010\u0007\u001A\u00020\u00042\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u0010\u001A\u00020\u000F*\u00020\b2\n\u0010\n\u001A\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R*\u0010\u0016\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000F0\u00120\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0014\u0010\u0015R\u001E\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00130\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0015\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EndCompositionScope;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "parameter", "", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "getAction-HpuvwBQ", "()I", "Action", "getComposition-HpuvwBQ", "Composition", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndCompositionScope\n*L\n1#1,990:1\n401#1:991\n402#1:992\n401#1:993\n402#1:994\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndCompositionScope\n*L\n405#1:991\n406#1:992\n415#1:993\n416#1:994\n*E\n"})
    public static final class EndCompositionScope extends Operation {
        public static final int $stable;
        @NotNull
        public static final EndCompositionScope INSTANCE;

        static {
            EndCompositionScope.INSTANCE = new EndCompositionScope(0, 2, 1, null);  // 初始化器: Landroidx/compose/runtime/changelist/Operation;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer0, @NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
            ((Function1)operationArgContainer0.getObject-31yXWZQ(0)).invoke(((Composition)operationArgContainer0.getObject-31yXWZQ(1)));
        }

        public final int getAction-HpuvwBQ() {
            return 0;
        }

        public final int getComposition-HpuvwBQ() {
            return 1;
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        @NotNull
        public String objectParamName-31yXWZQ(int v) {
            if(ObjectParameter.equals-impl0(v, 0)) {
                return "anchor";
            }
            return ObjectParameter.equals-impl0(v, 1) ? "composition" : super.objectParamName-31yXWZQ(v);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J/\u0010\n\u001A\u00020\t*\u00020\u00022\n\u0010\u0004\u001A\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EndCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class EndCurrentGroup extends Operation {
        public static final int $stable;
        @NotNull
        public static final EndCurrentGroup INSTANCE;

        static {
            EndCurrentGroup.INSTANCE = new EndCurrentGroup(0, 0, 3, null);  // 初始化器: Landroidx/compose/runtime/changelist/Operation;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer0, @NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
            slotWriter0.endGroup();
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J/\u0010\n\u001A\u00020\t*\u00020\u00022\n\u0010\u0004\u001A\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EndMovableContentPlacement;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class EndMovableContentPlacement extends Operation {
        public static final int $stable;
        @NotNull
        public static final EndMovableContentPlacement INSTANCE;

        static {
            EndMovableContentPlacement.INSTANCE = new EndMovableContentPlacement(0, 0, 3, null);  // 初始化器: Landroidx/compose/runtime/changelist/Operation;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer0, @NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
            Intrinsics.checkNotNull(applier0, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            OperationKt.access$positionToParentOf(slotWriter0, applier0, 0);
            slotWriter0.endGroup();
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001J\u001E\u0010\u0007\u001A\u00020\u00042\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u0010\u001A\u00020\u000F*\u00020\b2\n\u0010\n\u001A\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001E\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00120\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EnsureGroupStarted;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "parameter", "", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "()I", "Anchor", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EnsureGroupStarted\n*L\n1#1,990:1\n337#1:991\n337#1:992\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EnsureGroupStarted\n*L\n340#1:991\n349#1:992\n*E\n"})
    public static final class EnsureGroupStarted extends Operation {
        public static final int $stable;
        @NotNull
        public static final EnsureGroupStarted INSTANCE;

        static {
            EnsureGroupStarted.INSTANCE = new EnsureGroupStarted(0, 1, 1, null);  // 初始化器: Landroidx/compose/runtime/changelist/Operation;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer0, @NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
            slotWriter0.ensureStarted(((Anchor)operationArgContainer0.getObject-31yXWZQ(0)));
        }

        public final int getAnchor-HpuvwBQ() {
            return 0;
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.compose.runtime.changelist.Operation
        @NotNull
        public String objectParamName-31yXWZQ(int v) {
            return ObjectParameter.equals-impl0(v, 0) ? "anchor" : super.objectParamName-31yXWZQ(v);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J/\u0010\n\u001A\u00020\t*\u00020\u00022\n\u0010\u0004\u001A\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EnsureRootGroupStarted;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class EnsureRootGroupStarted extends Operation {
        public static final int $stable;
        @NotNull
        public static final EnsureRootGroupStarted INSTANCE;

        static {
            EnsureRootGroupStarted.INSTANCE = new EnsureRootGroupStarted(0, 0, 3, null);  // 初始化器: Landroidx/compose/runtime/changelist/Operation;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer0, @NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
            slotWriter0.ensureStarted(0);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u001A\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001E\u0010\n\u001A\u00020\u00042\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006J/\u0010\u0013\u001A\u00020\u0012*\u00020\u000B2\n\u0010\r\u001A\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R&\u0010\u0019\u001A\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00150\b8Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001B\u001A\u00020\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u0018R\u001E\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u001C0\b8Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u001D\u0010\u0018\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001F"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "parameter", "", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "intParamName", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "objectParamName-31yXWZQ", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "Lkotlin/Function0;", "", "getFactory-HpuvwBQ", "()I", "Factory", "getInsertIndex-jn0FJLE", "InsertIndex", "Landroidx/compose/runtime/Anchor;", "getGroupAnchor-HpuvwBQ", "GroupAnchor", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertNodeFixup\n*L\n1#1,990:1\n564#1:991\n563#1:992\n565#1:993\n563#1:994\n565#1:995\n564#1:996\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertNodeFixup\n*L\n568#1:991\n573#1:992\n574#1:993\n583#1:994\n584#1:995\n585#1:996\n*E\n"})
    public static final class InsertNodeFixup extends Operation {
        public static final int $stable;
        @NotNull
        public static final InsertNodeFixup INSTANCE;

        static {
            InsertNodeFixup.INSTANCE = new InsertNodeFixup(1, 2, null);  // 初始化器: Landroidx/compose/runtime/changelist/Operation;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer0, @NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
            Object object0 = ((Function0)operationArgContainer0.getObject-31yXWZQ(0)).invoke();
            Anchor anchor0 = (Anchor)operationArgContainer0.getObject-31yXWZQ(1);
            int v = operationArgContainer0.getInt-w8GmfQM(0);
            Intrinsics.checkNotNull(applier0, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            slotWriter0.updateNode(anchor0, object0);
            applier0.insertTopDown(v, object0);
            applier0.down(object0);
        }

        public final int getFactory-HpuvwBQ() {
            return 0;
        }

        // 去混淆评级： 低(20)
        public final int getGroupAnchor-HpuvwBQ() {
            return 1;
        }

        public final int getInsertIndex-jn0FJLE() {
            return 0;
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.compose.runtime.changelist.Operation
        @NotNull
        public String intParamName-w8GmfQM(int v) {
            return IntParameter.equals-impl0(v, 0) ? "insertIndex" : super.intParamName-w8GmfQM(v);
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        @NotNull
        public String objectParamName-31yXWZQ(int v) {
            if(ObjectParameter.equals-impl0(v, 0)) {
                return "factory";
            }
            return ObjectParameter.equals-impl0(v, 1) ? "groupAnchor" : super.objectParamName-31yXWZQ(v);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u001E\u0010\u0007\u001A\u00020\u00042\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u0010\u001A\u00020\u000F*\u00020\b2\n\u0010\n\u001A\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001E\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00120\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014R\u001E\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00160\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0014\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$InsertSlots;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "parameter", "", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "()I", "Anchor", "Landroidx/compose/runtime/SlotTable;", "getFromSlotTable-HpuvwBQ", "FromSlotTable", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlots\n*L\n1#1,990:1\n501#1:991\n502#1:992\n502#1:993\n501#1:994\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlots\n*L\n505#1:991\n506#1:992\n515#1:993\n516#1:994\n*E\n"})
    public static final class InsertSlots extends Operation {
        public static final int $stable;
        @NotNull
        public static final InsertSlots INSTANCE;

        static {
            InsertSlots.INSTANCE = new InsertSlots(0, 2, 1, null);  // 初始化器: Landroidx/compose/runtime/changelist/Operation;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer0, @NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
            SlotTable slotTable0 = (SlotTable)operationArgContainer0.getObject-31yXWZQ(1);
            Anchor anchor0 = (Anchor)operationArgContainer0.getObject-31yXWZQ(0);
            slotWriter0.beginInsert();
            slotWriter0.moveFrom(slotTable0, anchor0.toIndexFor(slotTable0), false);
            slotWriter0.endInsert();
        }

        public final int getAnchor-HpuvwBQ() {
            return 0;
        }

        public final int getFromSlotTable-HpuvwBQ() {
            return 1;
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        @NotNull
        public String objectParamName-31yXWZQ(int v) {
            if(ObjectParameter.equals-impl0(v, 0)) {
                return "anchor";
            }
            return ObjectParameter.equals-impl0(v, 1) ? "from" : super.objectParamName-31yXWZQ(v);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u001E\u0010\u0007\u001A\u00020\u00042\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u0010\u001A\u00020\u000F*\u00020\b2\n\u0010\n\u001A\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001E\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00120\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014R\u001E\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00160\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0014R\u001E\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u00190\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u0014\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001C"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "parameter", "", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "()I", "Anchor", "Landroidx/compose/runtime/SlotTable;", "getFromSlotTable-HpuvwBQ", "FromSlotTable", "Landroidx/compose/runtime/changelist/FixupList;", "getFixups-HpuvwBQ", "Fixups", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,990:1\n529#1:991\n530#1:992\n531#1:993\n530#1:994\n529#1:995\n531#1:996\n174#2,5:997\n180#2,3:1003\n1#3:1002\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups\n*L\n534#1:991\n535#1:992\n536#1:993\n545#1:994\n546#1:995\n547#1:996\n549#1:997,5\n549#1:1003,3\n549#1:1002\n*E\n"})
    public static final class InsertSlotsWithFixups extends Operation {
        public static final int $stable;
        @NotNull
        public static final InsertSlotsWithFixups INSTANCE;

        static {
            InsertSlotsWithFixups.INSTANCE = new InsertSlotsWithFixups(0, 3, 1, null);  // 初始化器: Landroidx/compose/runtime/changelist/Operation;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer0, @NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
            SlotTable slotTable0 = (SlotTable)operationArgContainer0.getObject-31yXWZQ(1);
            Anchor anchor0 = (Anchor)operationArgContainer0.getObject-31yXWZQ(0);
            FixupList fixupList0 = (FixupList)operationArgContainer0.getObject-31yXWZQ(2);
            SlotWriter slotWriter1 = slotTable0.openWriter();
            try {
                fixupList0.executeAndFlushAllPendingFixups(applier0, slotWriter1, rememberManager0);
            }
            catch(Throwable throwable0) {
                slotWriter1.close(false);
                throw throwable0;
            }
            slotWriter1.close(true);
            slotWriter0.beginInsert();
            slotWriter0.moveFrom(slotTable0, anchor0.toIndexFor(slotTable0), false);
            slotWriter0.endInsert();
        }

        public final int getAnchor-HpuvwBQ() {
            return 0;
        }

        public final int getFixups-HpuvwBQ() {
            return 2;
        }

        public final int getFromSlotTable-HpuvwBQ() {
            return 1;
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        @NotNull
        public String objectParamName-31yXWZQ(int v) {
            if(ObjectParameter.equals-impl0(v, 0)) {
                return "anchor";
            }
            if(ObjectParameter.equals-impl0(v, 1)) {
                return "from";
            }
            return ObjectParameter.equals-impl0(v, 2) ? "fixups" : super.objectParamName-31yXWZQ(v);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001A\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000B\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001A\u0010\u0010\u001A\u00020\r2\b\u0010\f\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000E\u0010\u000FR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$IntParameter;", "", "", "offset", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "a", "I", "getOffset", "()I", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @JvmInline
    public static final class IntParameter {
        public final int a;

        public IntParameter(int v) {
            this.a = v;
        }

        public static final IntParameter box-impl(int v) {
            return new IntParameter(v);
        }

        public static int constructor-impl(int v) [...] // Inlined contents

        @Override
        public boolean equals(Object object0) {
            return IntParameter.equals-impl(this.a, object0);
        }

        public static boolean equals-impl(int v, Object object0) {
            return object0 instanceof IntParameter ? v == ((IntParameter)object0).unbox-impl() : false;
        }

        public static final boolean equals-impl0(int v, int v1) {
            return v == v1;
        }

        public final int getOffset() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return IntParameter.hashCode-impl(this.a);
        }

        public static int hashCode-impl(int v) {
            return v;
        }

        @Override
        public String toString() {
            return IntParameter.toString-impl(this.a);
        }

        public static String toString-impl(int v) {
            return "IntParameter(offset=" + v + ')';
        }

        public final int unbox-impl() {
            return this.a;
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001J\u001A\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u0010\u001A\u00020\u000F*\u00020\b2\n\u0010\n\u001A\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001A\u00020\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$MoveCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "parameter", "", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "intParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "getOffset-jn0FJLE", "()I", "Offset", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveCurrentGroup\n*L\n1#1,990:1\n364#1:991\n364#1:992\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveCurrentGroup\n*L\n367#1:991\n376#1:992\n*E\n"})
    public static final class MoveCurrentGroup extends Operation {
        public static final int $stable;
        @NotNull
        public static final MoveCurrentGroup INSTANCE;

        static {
            MoveCurrentGroup.INSTANCE = new MoveCurrentGroup(1, 0, 2, null);  // 初始化器: Landroidx/compose/runtime/changelist/Operation;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer0, @NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
            slotWriter0.moveGroup(operationArgContainer0.getInt-w8GmfQM(0));
        }

        public final int getOffset-jn0FJLE() {
            return 0;
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.compose.runtime.changelist.Operation
        @NotNull
        public String intParamName-w8GmfQM(int v) {
            return IntParameter.equals-impl0(v, 0) ? "offset" : super.intParamName-w8GmfQM(v);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001J\u001A\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u0010\u001A\u00020\u000F*\u00020\b2\n\u0010\n\u001A\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001A\u00020\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001A\u00020\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0015\u0010\u0013R\u0018\u0010\u0018\u001A\u00020\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0013\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$MoveNode;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "parameter", "", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "intParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "getFrom-jn0FJLE", "()I", "From", "getTo-jn0FJLE", "To", "getCount-jn0FJLE", "Count", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveNode\n*L\n1#1,990:1\n476#1:991\n477#1:992\n478#1:993\n476#1:994\n477#1:995\n478#1:996\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveNode\n*L\n481#1:991\n482#1:992\n483#1:993\n493#1:994\n494#1:995\n495#1:996\n*E\n"})
    public static final class MoveNode extends Operation {
        public static final int $stable;
        @NotNull
        public static final MoveNode INSTANCE;

        static {
            MoveNode.INSTANCE = new MoveNode(3, 0, 2, null);  // 初始化器: Landroidx/compose/runtime/changelist/Operation;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer0, @NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
            applier0.move(operationArgContainer0.getInt-w8GmfQM(0), operationArgContainer0.getInt-w8GmfQM(1), operationArgContainer0.getInt-w8GmfQM(2));
        }

        public final int getCount-jn0FJLE() {
            return 2;
        }

        public final int getFrom-jn0FJLE() {
            return 0;
        }

        public final int getTo-jn0FJLE() {
            return 1;
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        @NotNull
        public String intParamName-w8GmfQM(int v) {
            if(IntParameter.equals-impl0(v, 0)) {
                return "from";
            }
            if(IntParameter.equals-impl0(v, 1)) {
                return "to";
            }
            return IntParameter.equals-impl0(v, 2) ? "count" : super.intParamName-w8GmfQM(v);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\b\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001A\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000B\u0010\u0006J\u001A\u0010\u0011\u001A\u00020\u000E2\b\u0010\r\u001A\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u000F\u0010\u0010R\u0017\u0010\u0004\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015\u0088\u0001\u0004\u0092\u0001\u00020\u0003¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "T", "", "", "offset", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "a", "I", "getOffset", "()I", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @JvmInline
    public static final class ObjectParameter {
        public final int a;

        public ObjectParameter(int v) {
            this.a = v;
        }

        public static final ObjectParameter box-impl(int v) {
            return new ObjectParameter(v);
        }

        public static int constructor-impl(int v) [...] // Inlined contents

        @Override
        public boolean equals(Object object0) {
            return ObjectParameter.equals-impl(this.a, object0);
        }

        public static boolean equals-impl(int v, Object object0) {
            return object0 instanceof ObjectParameter ? v == ((ObjectParameter)object0).unbox-impl() : false;
        }

        public static final boolean equals-impl0(int v, int v1) {
            return v == v1;
        }

        public final int getOffset() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return ObjectParameter.hashCode-impl(this.a);
        }

        public static int hashCode-impl(int v) {
            return v;
        }

        @Override
        public String toString() {
            return ObjectParameter.toString-impl(this.a);
        }

        public static String toString-impl(int v) {
            return "ObjectParameter(offset=" + v + ')';
        }

        public final int unbox-impl() {
            return this.a;
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u001A\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001E\u0010\n\u001A\u00020\u00042\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006J/\u0010\u0013\u001A\u00020\u0012*\u00020\u000B2\n\u0010\r\u001A\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0017\u001A\u00020\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0015\u0010\u0016R\u001E\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u00180\b8Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0019\u0010\u0016\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001B"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "parameter", "", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "intParamName", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "objectParamName-31yXWZQ", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "getInsertIndex-jn0FJLE", "()I", "InsertIndex", "Landroidx/compose/runtime/Anchor;", "getGroupAnchor-HpuvwBQ", "GroupAnchor", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup\n*L\n1#1,990:1\n595#1:991\n596#1:992\n596#1:993\n595#1:994\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup\n*L\n599#1:991\n604#1:992\n613#1:993\n614#1:994\n*E\n"})
    public static final class PostInsertNodeFixup extends Operation {
        public static final int $stable;
        @NotNull
        public static final PostInsertNodeFixup INSTANCE;

        static {
            PostInsertNodeFixup.INSTANCE = new PostInsertNodeFixup(1, 1, null);  // 初始化器: Landroidx/compose/runtime/changelist/Operation;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer0, @NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
            Anchor anchor0 = (Anchor)operationArgContainer0.getObject-31yXWZQ(0);
            int v = operationArgContainer0.getInt-w8GmfQM(0);
            applier0.up();
            Intrinsics.checkNotNull(applier0, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            applier0.insertBottomUp(v, slotWriter0.node(anchor0));
        }

        public final int getGroupAnchor-HpuvwBQ() {
            return 0;
        }

        public final int getInsertIndex-jn0FJLE() {
            return 0;
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.compose.runtime.changelist.Operation
        @NotNull
        public String intParamName-w8GmfQM(int v) {
            return IntParameter.equals-impl0(v, 0) ? "insertIndex" : super.intParamName-w8GmfQM(v);
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.compose.runtime.changelist.Operation
        @NotNull
        public String objectParamName-31yXWZQ(int v) {
            return ObjectParameter.equals-impl0(v, 0) ? "groupAnchor" : super.objectParamName-31yXWZQ(v);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u001E\u0010\u0007\u001A\u00020\u00042\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u0010\u001A\u00020\u000F*\u00020\b2\n\u0010\n\u001A\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001E\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00120\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014R\u001E\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00160\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0014R\u001E\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u00190\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u0014\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001C"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "parameter", "", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "Landroidx/compose/runtime/ControlledComposition;", "getComposition-HpuvwBQ", "()I", "Composition", "Landroidx/compose/runtime/CompositionContext;", "getParentCompositionContext-HpuvwBQ", "ParentCompositionContext", "Landroidx/compose/runtime/MovableContentStateReference;", "getReference-HpuvwBQ", "Reference", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent\n*L\n1#1,990:1\n762#1:991\n763#1:992\n764#1:993\n762#1:994\n763#1:995\n764#1:996\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent\n*L\n767#1:991\n768#1:992\n769#1:993\n779#1:994\n780#1:995\n781#1:996\n*E\n"})
    public static final class ReleaseMovableGroupAtCurrent extends Operation {
        public static final int $stable;
        @NotNull
        public static final ReleaseMovableGroupAtCurrent INSTANCE;

        static {
            ReleaseMovableGroupAtCurrent.INSTANCE = new ReleaseMovableGroupAtCurrent(0, 3, 1, null);  // 初始化器: Landroidx/compose/runtime/changelist/Operation;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer0, @NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
            OperationKt.access$releaseMovableGroupAtCurrent(((ControlledComposition)operationArgContainer0.getObject-31yXWZQ(0)), ((CompositionContext)operationArgContainer0.getObject-31yXWZQ(1)), ((MovableContentStateReference)operationArgContainer0.getObject-31yXWZQ(2)), slotWriter0);
        }

        public final int getComposition-HpuvwBQ() {
            return 0;
        }

        public final int getParentCompositionContext-HpuvwBQ() {
            return 1;
        }

        public final int getReference-HpuvwBQ() {
            return 2;
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        @NotNull
        public String objectParamName-31yXWZQ(int v) {
            if(ObjectParameter.equals-impl0(v, 0)) {
                return "composition";
            }
            if(ObjectParameter.equals-impl0(v, 1)) {
                return "parentCompositionContext";
            }
            return ObjectParameter.equals-impl0(v, 2) ? "reference" : super.objectParamName-31yXWZQ(v);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001J\u001E\u0010\u0007\u001A\u00020\u00042\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u0010\u001A\u00020\u000F*\u00020\b2\n\u0010\n\u001A\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001E\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00120\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$Remember;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "parameter", "", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "Landroidx/compose/runtime/RememberObserver;", "getValue-HpuvwBQ", "()I", "Value", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Remember\n*L\n1#1,990:1\n152#1:991\n152#1:992\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Remember\n*L\n155#1:991\n164#1:992\n*E\n"})
    public static final class Remember extends Operation {
        public static final int $stable;
        @NotNull
        public static final Remember INSTANCE;

        static {
            Remember.INSTANCE = new Remember(0, 1, 1, null);  // 初始化器: Landroidx/compose/runtime/changelist/Operation;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer0, @NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
            rememberManager0.remembering(((RememberObserver)operationArgContainer0.getObject-31yXWZQ(0)));
        }

        public final int getValue-HpuvwBQ() {
            return 0;
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.compose.runtime.changelist.Operation
        @NotNull
        public String objectParamName-31yXWZQ(int v) {
            return ObjectParameter.equals-impl0(v, 0) ? "value" : super.objectParamName-31yXWZQ(v);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J/\u0010\n\u001A\u00020\t*\u00020\u00022\n\u0010\u0004\u001A\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$RemoveCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class RemoveCurrentGroup extends Operation {
        public static final int $stable;
        @NotNull
        public static final RemoveCurrentGroup INSTANCE;

        static {
            RemoveCurrentGroup.INSTANCE = new RemoveCurrentGroup(0, 0, 3, null);  // 初始化器: Landroidx/compose/runtime/changelist/Operation;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer0, @NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
            ComposerKt.removeCurrentGroup(slotWriter0, rememberManager0);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001J\u001A\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u0010\u001A\u00020\u000F*\u00020\b2\n\u0010\n\u001A\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001A\u00020\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001A\u00020\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0015\u0010\u0013\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$RemoveNode;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "parameter", "", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "intParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "getRemoveIndex-jn0FJLE", "()I", "RemoveIndex", "getCount-jn0FJLE", "Count", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RemoveNode\n*L\n1#1,990:1\n454#1:991\n455#1:992\n454#1:993\n455#1:994\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RemoveNode\n*L\n458#1:991\n459#1:992\n469#1:993\n470#1:994\n*E\n"})
    public static final class RemoveNode extends Operation {
        public static final int $stable;
        @NotNull
        public static final RemoveNode INSTANCE;

        static {
            RemoveNode.INSTANCE = new RemoveNode(2, 0, 2, null);  // 初始化器: Landroidx/compose/runtime/changelist/Operation;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer0, @NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
            applier0.remove(operationArgContainer0.getInt-w8GmfQM(0), operationArgContainer0.getInt-w8GmfQM(1));
        }

        public final int getCount-jn0FJLE() {
            return 1;
        }

        public final int getRemoveIndex-jn0FJLE() {
            return 0;
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        @NotNull
        public String intParamName-w8GmfQM(int v) {
            if(IntParameter.equals-impl0(v, 0)) {
                return "removeIndex";
            }
            return IntParameter.equals-impl0(v, 1) ? "count" : super.intParamName-w8GmfQM(v);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J/\u0010\n\u001A\u00020\t*\u00020\u00022\n\u0010\u0004\u001A\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$ResetSlots;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class ResetSlots extends Operation {
        public static final int $stable;
        @NotNull
        public static final ResetSlots INSTANCE;

        static {
            ResetSlots.INSTANCE = new ResetSlots(0, 0, 3, null);  // 初始化器: Landroidx/compose/runtime/changelist/Operation;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer0, @NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
            slotWriter0.reset();
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001J\u001E\u0010\u0007\u001A\u00020\u00042\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u0010\u001A\u00020\u000F*\u00020\b2\n\u0010\n\u001A\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0015\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000F0\u00120\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$SideEffect;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "parameter", "", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "Lkotlin/Function0;", "getEffect-HpuvwBQ", "()I", "Effect", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$SideEffect\n*L\n1#1,990:1\n135#1:991\n135#1:992\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$SideEffect\n*L\n138#1:991\n147#1:992\n*E\n"})
    public static final class SideEffect extends Operation {
        public static final int $stable;
        @NotNull
        public static final SideEffect INSTANCE;

        static {
            SideEffect.INSTANCE = new SideEffect(0, 1, 1, null);  // 初始化器: Landroidx/compose/runtime/changelist/Operation;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer0, @NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
            rememberManager0.sideEffect(((Function0)operationArgContainer0.getObject-31yXWZQ(0)));
        }

        public final int getEffect-HpuvwBQ() {
            return 0;
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.compose.runtime.changelist.Operation
        @NotNull
        public String objectParamName-31yXWZQ(int v) {
            return ObjectParameter.equals-impl0(v, 0) ? "effect" : super.objectParamName-31yXWZQ(v);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J/\u0010\n\u001A\u00020\t*\u00020\u00022\n\u0010\u0004\u001A\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$SkipToEndOfCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class SkipToEndOfCurrentGroup extends Operation {
        public static final int $stable;
        @NotNull
        public static final SkipToEndOfCurrentGroup INSTANCE;

        static {
            SkipToEndOfCurrentGroup.INSTANCE = new SkipToEndOfCurrentGroup(0, 0, 3, null);  // 初始化器: Landroidx/compose/runtime/changelist/Operation;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer0, @NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
            slotWriter0.skipToGroupEnd();
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BC\b\u0007\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012$\b\u0002\u0010\n\u001A\u001E\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0004\b\u000B\u0010\fJ/\u0010\u0011\u001A\u00020\t*\u00020\r2\n\u0010\u000E\u001A\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u000F\u001A\u00020\u00072\u0006\u0010\u0010\u001A\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0014\u001A\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R3\u0010\n\u001A\u001E\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019R\u001D\u0010 \u001A\b\u0012\u0004\u0012\u00020\u001B0\u001A8\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001FR%\u0010%\u001A\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\"0!0\u001A8\u0006¢\u0006\f\n\u0004\b#\u0010\u001D\u001A\u0004\b$\u0010\u001F¨\u0006&"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$TestOperation;", "Landroidx/compose/runtime/changelist/Operation;", "", "ints", "objects", "Lkotlin/Function3;", "Landroidx/compose/runtime/Applier;", "Landroidx/compose/runtime/SlotWriter;", "Landroidx/compose/runtime/RememberManager;", "", "block", "<init>", "(IILkotlin/jvm/functions/Function3;)V", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "slots", "rememberManager", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "", "toString", "()Ljava/lang/String;", "c", "Lkotlin/jvm/functions/Function3;", "getBlock", "()Lkotlin/jvm/functions/Function3;", "", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "d", "Ljava/util/List;", "getIntParams", "()Ljava/util/List;", "intParams", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "", "e", "getObjParams", "objParams", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$TestOperation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,990:1\n1#2:991\n*E\n"})
    public static final class TestOperation extends Operation {
        public static final int $stable = 8;
        public final Function3 c;
        public final ArrayList d;
        public final ArrayList e;

        @TestOnly
        public TestOperation() {
            this(0, 0, null, 7, null);
        }

        @TestOnly
        public TestOperation(int v, int v1, @NotNull Function3 function30) {
            super(v, v1, null);
            this.c = function30;
            ArrayList arrayList0 = new ArrayList(v);
            for(int v3 = 0; v3 < v; ++v3) {
                arrayList0.add(IntParameter.box-impl(v3));
            }
            this.d = arrayList0;
            ArrayList arrayList1 = new ArrayList(v1);
            for(int v2 = 0; v2 < v1; ++v2) {
                arrayList1.add(ObjectParameter.box-impl(v2));
            }
            this.e = arrayList1;
        }

        public TestOperation(int v, int v1, Function3 function30, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v2 & 1) != 0) {
                v = 0;
            }
            if((v2 & 2) != 0) {
                v1 = 0;
            }
            if((v2 & 4) != 0) {
                function30 = a.w;
            }
            this(v, v1, function30);
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer0, @NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
            this.c.invoke(applier0, slotWriter0, rememberManager0);
        }

        @NotNull
        public final Function3 getBlock() {
            return this.c;
        }

        @NotNull
        public final List getIntParams() {
            return this.d;
        }

        @NotNull
        public final List getObjParams() {
            return this.e;
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        @NotNull
        public String toString() {
            return "TestOperation(ints = " + this.getInts() + ", objects = " + this.getObjects() + ")@" + System.identityHashCode(this);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001J\u001A\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u0010\u001A\u00020\u000F*\u00020\b2\n\u0010\n\u001A\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001A\u00020\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$TrimParentValues;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "parameter", "", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "intParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "getCount-jn0FJLE", "()I", "Count", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$TrimParentValues\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n*L\n1#1,990:1\n193#1:991\n193#1:992\n1871#2,6:993\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$TrimParentValues\n*L\n196#1:991\n205#1:992\n207#1:993,6\n*E\n"})
    public static final class TrimParentValues extends Operation {
        public static final int $stable;
        @NotNull
        public static final TrimParentValues INSTANCE;

        static {
            TrimParentValues.INSTANCE = new TrimParentValues(1, 0, 2, null);  // 初始化器: Landroidx/compose/runtime/changelist/Operation;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer0, @NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
            int v = operationArgContainer0.getInt-w8GmfQM(0);
            int v1 = slotWriter0.getSlotsSize();
            int v2 = slotWriter0.getParent();
            int v3 = slotWriter0.slotsStartIndex$runtime_release(v2);
            int v4 = slotWriter0.slotsEndIndex$runtime_release(v2);
            for(int v5 = Math.max(v3, v4 - v); v5 < v4; ++v5) {
                Object object0 = slotWriter0.c[slotWriter0.b(v5)];
                if(object0 instanceof RememberObserverHolder) {
                    rememberManager0.forgetting(((RememberObserverHolder)object0).getWrapped(), v1 - v5, -1, -1);
                }
                else if(object0 instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl)object0).release();
                }
            }
            slotWriter0.trimTailSlots(v);
        }

        public final int getCount-jn0FJLE() {
            return 0;
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.compose.runtime.changelist.Operation
        @NotNull
        public String intParamName-w8GmfQM(int v) {
            return IntParameter.equals-impl0(v, 0) ? "count" : super.intParamName-w8GmfQM(v);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001J\u001A\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001E\u0010\n\u001A\u00020\u00042\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006J/\u0010\u0013\u001A\u00020\u0012*\u00020\u000B2\n\u0010\r\u001A\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0018\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\b8Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0016\u0010\u0017R\u001E\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u00190\b8Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u0017R\u0018\u0010\u001D\u001A\u00020\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u001C\u0010\u0017\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001E"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "parameter", "", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "intParamName", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "objectParamName-31yXWZQ", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "", "getValue-HpuvwBQ", "()I", "Value", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "Anchor", "getGroupSlotIndex-jn0FJLE", "GroupSlotIndex", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,990:1\n264#1:991\n262#1:992\n263#1:993\n262#1:994\n263#1:995\n264#1:996\n4184#2,8:997\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue\n*L\n267#1:991\n272#1:992\n273#1:993\n282#1:994\n283#1:995\n284#1:996\n293#1:997,8\n*E\n"})
    public static final class UpdateAnchoredValue extends Operation {
        public static final int $stable;
        @NotNull
        public static final UpdateAnchoredValue INSTANCE;

        static {
            UpdateAnchoredValue.INSTANCE = new UpdateAnchoredValue(1, 2, null);  // 初始化器: Landroidx/compose/runtime/changelist/Operation;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer0, @NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
            int v5;
            int v4;
            Object object0 = operationArgContainer0.getObject-31yXWZQ(0);
            Anchor anchor0 = (Anchor)operationArgContainer0.getObject-31yXWZQ(1);
            int v = operationArgContainer0.getInt-w8GmfQM(0);
            if(object0 instanceof RememberObserverHolder) {
                rememberManager0.remembering(((RememberObserverHolder)object0).getWrapped());
            }
            int v1 = slotWriter0.anchorIndex(anchor0);
            Object object1 = slotWriter0.set(v1, v, object0);
            if(object1 instanceof RememberObserverHolder) {
                int v2 = slotWriter0.getSlotsSize();
                int v3 = slotWriter0.slotIndexOfGroupSlotIndex(v1, v);
                Anchor anchor1 = ((RememberObserverHolder)object1).getAfter();
                if(anchor1 == null || !anchor1.getValid()) {
                    v4 = -1;
                    v5 = -1;
                }
                else {
                    v4 = slotWriter0.anchorIndex(anchor1);
                    v5 = slotWriter0.getSlotsSize() - slotWriter0.slotsEndAllIndex$runtime_release(v4);
                }
                rememberManager0.forgetting(((RememberObserverHolder)object1).getWrapped(), v2 - v3, v4, v5);
                return;
            }
            if(object1 instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl)object1).release();
            }
        }

        public final int getAnchor-HpuvwBQ() {
            return 1;
        }

        public final int getGroupSlotIndex-jn0FJLE() {
            return 0;
        }

        public final int getValue-HpuvwBQ() {
            return 0;
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.compose.runtime.changelist.Operation
        @NotNull
        public String intParamName-w8GmfQM(int v) {
            return IntParameter.equals-impl0(v, 0) ? "groupSlotIndex" : super.intParamName-w8GmfQM(v);
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        @NotNull
        public String objectParamName-31yXWZQ(int v) {
            if(ObjectParameter.equals-impl0(v, 0)) {
                return "value";
            }
            return ObjectParameter.equals-impl0(v, 1) ? "anchor" : super.objectParamName-31yXWZQ(v);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001J\u001E\u0010\u0007\u001A\u00020\u00042\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u0010\u001A\u00020\u000F*\u00020\b2\n\u0010\n\u001A\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$UpdateAuxData;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "parameter", "", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "", "getData-HpuvwBQ", "()I", "Data", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAuxData\n*L\n1#1,990:1\n310#1:991\n310#1:992\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAuxData\n*L\n313#1:991\n322#1:992\n*E\n"})
    public static final class UpdateAuxData extends Operation {
        public static final int $stable;
        @NotNull
        public static final UpdateAuxData INSTANCE;

        static {
            UpdateAuxData.INSTANCE = new UpdateAuxData(0, 1, 1, null);  // 初始化器: Landroidx/compose/runtime/changelist/Operation;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer0, @NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
            slotWriter0.updateAux(operationArgContainer0.getObject-31yXWZQ(0));
        }

        public final int getData-HpuvwBQ() {
            return 0;
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.compose.runtime.changelist.Operation
        @NotNull
        public String objectParamName-31yXWZQ(int v) {
            return ObjectParameter.equals-impl0(v, 0) ? "data" : super.objectParamName-31yXWZQ(v);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u001E\u0010\u0007\u001A\u00020\u00042\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u0010\u001A\u00020\u000F*\u00020\b2\n\u0010\n\u001A\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014R9\u0010\u0019\u001A#\u0012\u001F\u0012\u001D\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000F0\u0016¢\u0006\u0002\b\u00170\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u0014\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001A"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$UpdateNode;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "parameter", "", "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "", "getValue-HpuvwBQ", "()I", "Value", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "getBlock-HpuvwBQ", "Block", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n*L\n1#1,990:1\n433#1:991\n434#1:992\n433#1:993\n434#1:994\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n*L\n437#1:991\n438#1:992\n447#1:993\n448#1:994\n*E\n"})
    public static final class UpdateNode extends Operation {
        public static final int $stable;
        @NotNull
        public static final UpdateNode INSTANCE;

        static {
            UpdateNode.INSTANCE = new UpdateNode(0, 2, 1, null);  // 初始化器: Landroidx/compose/runtime/changelist/Operation;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer0, @NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
            Object object0 = operationArgContainer0.getObject-31yXWZQ(0);
            ((Function2)operationArgContainer0.getObject-31yXWZQ(1)).invoke(applier0.getCurrent(), object0);
        }

        public final int getBlock-HpuvwBQ() {
            return 1;
        }

        public final int getValue-HpuvwBQ() {
            return 0;
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        @NotNull
        public String objectParamName-31yXWZQ(int v) {
            if(ObjectParameter.equals-impl0(v, 0)) {
                return "value";
            }
            return ObjectParameter.equals-impl0(v, 1) ? "block" : super.objectParamName-31yXWZQ(v);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001J\u001A\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001E\u0010\n\u001A\u00020\u00042\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006J/\u0010\u0013\u001A\u00020\u0012*\u00020\u000B2\n\u0010\r\u001A\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0018\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\b8Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001A\u001A\u00020\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0019\u0010\u0017\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001B"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$UpdateValue;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "parameter", "", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "intParamName", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "objectParamName-31yXWZQ", "objectParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "", "getValue-HpuvwBQ", "()I", "Value", "getGroupSlotIndex-jn0FJLE", "GroupSlotIndex", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateValue\n*L\n1#1,990:1\n224#1:991\n223#1:992\n223#1:993\n224#1:994\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateValue\n*L\n227#1:991\n232#1:992\n241#1:993\n242#1:994\n*E\n"})
    public static final class UpdateValue extends Operation {
        public static final int $stable;
        @NotNull
        public static final UpdateValue INSTANCE;

        static {
            UpdateValue.INSTANCE = new UpdateValue(1, 1, null);  // 初始化器: Landroidx/compose/runtime/changelist/Operation;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer0, @NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
            Object object0 = operationArgContainer0.getObject-31yXWZQ(0);
            int v = operationArgContainer0.getInt-w8GmfQM(0);
            if(object0 instanceof RememberObserverHolder) {
                rememberManager0.remembering(((RememberObserverHolder)object0).getWrapped());
            }
            Object object1 = slotWriter0.set(v, object0);
            if(object1 instanceof RememberObserverHolder) {
                rememberManager0.forgetting(((RememberObserverHolder)object1).getWrapped(), slotWriter0.getSlotsSize() - slotWriter0.slotIndexOfGroupSlotIndex(slotWriter0.getCurrentGroup(), v), -1, -1);
                return;
            }
            if(object1 instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl)object1).release();
            }
        }

        public final int getGroupSlotIndex-jn0FJLE() {
            return 0;
        }

        public final int getValue-HpuvwBQ() {
            return 0;
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.compose.runtime.changelist.Operation
        @NotNull
        public String intParamName-w8GmfQM(int v) {
            return IntParameter.equals-impl0(v, 0) ? "groupSlotIndex" : super.intParamName-w8GmfQM(v);
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.compose.runtime.changelist.Operation
        @NotNull
        public String objectParamName-31yXWZQ(int v) {
            return ObjectParameter.equals-impl0(v, 0) ? "value" : super.objectParamName-31yXWZQ(v);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001J\u001A\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u0010\u001A\u00020\u000F*\u00020\b2\n\u0010\n\u001A\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001A\u00020\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$Ups;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "parameter", "", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "intParamName", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "getCount-jn0FJLE", "()I", "Count", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Ups\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,990:1\n77#1:991\n77#1:992\n1#2:993\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Ups\n*L\n80#1:991\n89#1:992\n*E\n"})
    public static final class Ups extends Operation {
        public static final int $stable;
        @NotNull
        public static final Ups INSTANCE;

        static {
            Ups.INSTANCE = new Ups(1, 0, 2, null);  // 初始化器: Landroidx/compose/runtime/changelist/Operation;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer0, @NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
            int v1 = operationArgContainer0.getInt-w8GmfQM(0);
            for(int v = 0; v < v1; ++v) {
                applier0.up();
            }
        }

        public final int getCount-jn0FJLE() {
            return 0;
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.compose.runtime.changelist.Operation
        @NotNull
        public String intParamName-w8GmfQM(int v) {
            return IntParameter.equals-impl0(v, 0) ? "count" : super.intParamName-w8GmfQM(v);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J/\u0010\n\u001A\u00020\t*\u00020\u00022\n\u0010\u0004\u001A\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$UseCurrentNode;", "Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "execute", "(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class UseCurrentNode extends Operation {
        public static final int $stable;
        @NotNull
        public static final UseCurrentNode INSTANCE;

        static {
            UseCurrentNode.INSTANCE = new UseCurrentNode(0, 0, 3, null);  // 初始化器: Landroidx/compose/runtime/changelist/Operation;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.compose.runtime.changelist.Operation
        public void execute(@NotNull OperationArgContainer operationArgContainer0, @NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
            Object object0 = applier0.getCurrent();
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback");
            ((ComposeNodeLifecycleCallback)object0).onReuse();
        }
    }

    public static final int $stable;
    public final int a;
    public final int b;

    public Operation(int v, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        this(v, v1, null);
    }

    public Operation(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
    }

    public abstract void execute(@NotNull OperationArgContainer arg1, @NotNull Applier arg2, @NotNull SlotWriter arg3, @NotNull RememberManager arg4);

    public final int getInts() {
        return this.a;
    }

    @NotNull
    public final String getName() {
        String s = Reflection.getOrCreateKotlinClass(this.getClass()).getSimpleName();
        return s == null ? "" : s;
    }

    public final int getObjects() {
        return this.b;
    }

    @NotNull
    public String intParamName-w8GmfQM(int v) {
        return "IntParameter(" + v + ')';
    }

    @NotNull
    public String objectParamName-31yXWZQ(int v) {
        return "ObjectParameter(" + v + ')';
    }

    @Override
    @NotNull
    public String toString() {
        return this.getName();
    }
}

