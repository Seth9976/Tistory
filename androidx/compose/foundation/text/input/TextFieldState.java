package androidx.compose.foundation.text.input;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.text.input.internal.EditingBuffer;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001A\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0002\\]B!\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\tB\u001D\b\u0016\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\b\u0010\nJ)\u0010\u0010\u001A\u00020\r2\u0017\u0010\u000F\u001A\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000B\u00A2\u0006\u0002\b\u000EH\u0086\b\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0012\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0014\u001A\u00020\fH\u0001\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001A\u00020\r2\u0006\u0010\u0016\u001A\u00020\fH\u0001\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u000F\u0010\u0019\u001A\u00020\rH\u0001\u00A2\u0006\u0004\b\u0019\u0010\u001AJG\u0010$\u001A\u00020\r2\b\u0010\u001C\u001A\u0004\u0018\u00010\u001B2\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\b\b\u0002\u0010 \u001A\u00020\u001F2\u0017\u0010\u000F\u001A\u0013\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\r0\u000B\u00A2\u0006\u0002\b\u000EH\u0080\b\u00A2\u0006\u0004\b\"\u0010#J)\u0010&\u001A\u00020\r2\u0017\u0010\u000F\u001A\u0013\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\r0\u000B\u00A2\u0006\u0002\b\u000EH\u0080\b\u00A2\u0006\u0004\b%\u0010\u0011J\u0017\u0010+\u001A\u00020\r2\u0006\u0010(\u001A\u00020\'H\u0000\u00A2\u0006\u0004\b)\u0010*J\u0017\u0010-\u001A\u00020\r2\u0006\u0010(\u001A\u00020\'H\u0000\u00A2\u0006\u0004\b,\u0010*J4\u00104\u001A\u00020\r2\u0006\u0010.\u001A\u00020\f2\b\u0010/\u001A\u0004\u0018\u00010\u00042\u0006\u00100\u001A\u00020\u001D2\u0006\u00101\u001A\u00020\u001DH\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b2\u00103R\u001A\u00109\u001A\u00020\u00068\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u00108R(\u0010A\u001A\u00020!8\u0000@\u0000X\u0081\u000E\u00A2\u0006\u0018\n\u0004\b:\u0010;\u0012\u0004\b@\u0010\u001A\u001A\u0004\b<\u0010=\"\u0004\b>\u0010?R+\u0010J\u001A\u00020B2\u0006\u0010C\u001A\u00020B8@@BX\u0080\u008E\u0002\u00A2\u0006\u0012\n\u0004\bD\u0010E\u001A\u0004\bF\u0010G\"\u0004\bH\u0010IR \u0010Q\u001A\u00020K8GX\u0087\u0004\u00A2\u0006\u0012\n\u0004\bL\u0010M\u0012\u0004\bP\u0010\u001A\u001A\u0004\bN\u0010OR\u0011\u0010U\u001A\u00020R8F\u00A2\u0006\u0006\u001A\u0004\bS\u0010TR\u0017\u0010X\u001A\u00020\u00048F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bV\u0010WR\u0019\u0010[\u001A\u0004\u0018\u00010\u00048F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bY\u0010Z\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006^"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldState;", "", "", "initialText", "Landroidx/compose/ui/text/TextRange;", "initialSelection", "Landroidx/compose/foundation/text/input/TextUndoManager;", "initialTextUndoManager", "<init>", "(Ljava/lang/String;JLandroidx/compose/foundation/text/input/TextUndoManager;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "", "Lkotlin/ExtensionFunctionType;", "block", "edit", "(Lkotlin/jvm/functions/Function1;)V", "toString", "()Ljava/lang/String;", "startEdit", "()Landroidx/compose/foundation/text/input/TextFieldBuffer;", "newValue", "commitEdit", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V", "finishEditing", "()V", "Landroidx/compose/foundation/text/input/InputTransformation;", "inputTransformation", "", "restartImeIfContentChanges", "Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;", "undoBehavior", "Landroidx/compose/foundation/text/input/internal/EditingBuffer;", "editAsUser$foundation_release", "(Landroidx/compose/foundation/text/input/InputTransformation;ZLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;Lkotlin/jvm/functions/Function1;)V", "editAsUser", "editWithNoSideEffects$foundation_release", "editWithNoSideEffects", "Landroidx/compose/foundation/text/input/TextFieldState$NotifyImeListener;", "notifyImeListener", "addNotifyImeListener$foundation_release", "(Landroidx/compose/foundation/text/input/TextFieldState$NotifyImeListener;)V", "addNotifyImeListener", "removeNotifyImeListener$foundation_release", "removeNotifyImeListener", "textFieldBuffer", "newComposition", "textChanged", "selectionChanged", "syncMainBufferToTemporaryBuffer-TS3Rm5k$foundation_release", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;Landroidx/compose/ui/text/TextRange;ZZ)V", "syncMainBufferToTemporaryBuffer", "a", "Landroidx/compose/foundation/text/input/TextUndoManager;", "getTextUndoManager$foundation_release", "()Landroidx/compose/foundation/text/input/TextUndoManager;", "textUndoManager", "b", "Landroidx/compose/foundation/text/input/internal/EditingBuffer;", "getMainBuffer$foundation_release", "()Landroidx/compose/foundation/text/input/internal/EditingBuffer;", "setMainBuffer$foundation_release", "(Landroidx/compose/foundation/text/input/internal/EditingBuffer;)V", "getMainBuffer$foundation_release$annotations", "mainBuffer", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "<set-?>", "d", "Landroidx/compose/runtime/MutableState;", "getValue$foundation_release", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "setValue", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;)V", "value", "Landroidx/compose/foundation/text/input/UndoState;", "e", "Landroidx/compose/foundation/text/input/UndoState;", "getUndoState", "()Landroidx/compose/foundation/text/input/UndoState;", "getUndoState$annotations", "undoState", "", "getText", "()Ljava/lang/CharSequence;", "text", "getSelection-d9O1mEE", "()J", "selection", "getComposition-MzsxiRA", "()Landroidx/compose/ui/text/TextRange;", "composition", "NotifyImeListener", "Saver", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,694:1\n1208#2:695\n1187#2,2:696\n81#3:698\n107#3,2:699\n81#3:701\n107#3,2:702\n602#4,8:704\n602#4,8:712\n1#5:720\n460#6,11:721\n*S KotlinDebug\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n572#1:695\n572#1:696,2\n97#1:698\n97#1:699,2\n112#1:701\n112#1:702,2\n184#1:704,8\n203#1:712,8\n432#1:721,11\n*E\n"})
public final class TextFieldState {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00020\bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldState$NotifyImeListener;", "", "onChange", "", "oldValue", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "newValue", "restartImeIfContentChanges", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface NotifyImeListener {
        void onChange(@NotNull TextFieldCharSequence arg1, @NotNull TextFieldCharSequence arg2, boolean arg3);
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001D\u0010\u0006\u001A\u0004\u0018\u00010\u0003*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldState$Saver;", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/input/TextFieldState;", "", "Landroidx/compose/runtime/saveable/SaverScope;", "value", "save", "(Landroidx/compose/runtime/saveable/SaverScope;Landroidx/compose/foundation/text/input/TextFieldState;)Ljava/lang/Object;", "restore", "(Ljava/lang/Object;)Landroidx/compose/foundation/text/input/TextFieldState;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Saver implements androidx.compose.runtime.saveable.Saver {
        public static final int $stable;
        @NotNull
        public static final Saver INSTANCE;

        static {
            Saver.INSTANCE = new Saver();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Nullable
        public TextFieldState restore(@NotNull Object object0) {
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.collections.List<*>");
            Object object1 = ((List)object0).get(0);
            Object object2 = ((List)object0).get(1);
            Object object3 = ((List)object0).get(2);
            Object object4 = ((List)object0).get(3);
            Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlin.Int");
            Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type kotlin.Int");
            long v = TextRangeKt.TextRange(((int)(((Integer)object2))), ((int)(((Integer)object3))));
            Intrinsics.checkNotNull(object4);
            TextUndoManager textUndoManager0 = androidx.compose.foundation.text.input.TextUndoManager.Companion.Saver.INSTANCE.restore(object4);
            Intrinsics.checkNotNull(textUndoManager0);
            return new TextFieldState(((String)object1), v, textUndoManager0, null);
        }

        @Override  // androidx.compose.runtime.saveable.Saver
        public Object restore(Object object0) {
            return this.restore(object0);
        }

        @Nullable
        public Object save(@NotNull SaverScope saverScope0, @NotNull TextFieldState textFieldState0) {
            return CollectionsKt__CollectionsKt.listOf(new Object[]{textFieldState0.getText().toString(), TextRange.getStart-impl(textFieldState0.getSelection-d9O1mEE()), TextRange.getEnd-impl(textFieldState0.getSelection-d9O1mEE()), androidx.compose.foundation.text.input.TextUndoManager.Companion.Saver.INSTANCE.save(saverScope0, textFieldState0.getTextUndoManager$foundation_release())});
        }

        @Override  // androidx.compose.runtime.saveable.Saver
        public Object save(SaverScope saverScope0, Object object0) {
            return this.save(saverScope0, ((TextFieldState)object0));
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[TextFieldEditUndoBehavior.values().length];
            try {
                arr_v[TextFieldEditUndoBehavior.ClearHistory.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TextFieldEditUndoBehavior.MergeIfPossible.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TextFieldEditUndoBehavior.NeverMerge.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable;
    public final TextUndoManager a;
    public EditingBuffer b;
    public final MutableState c;
    public final MutableState d;
    public final UndoState e;
    public final MutableVector f;

    public TextFieldState(String s, long v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            s = "";
        }
        if((v1 & 2) != 0) {
            v = TextRangeKt.TextRange(s.length());
        }
        this(s, v, null);
    }

    public TextFieldState(String s, long v, TextUndoManager textUndoManager0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = textUndoManager0;
        this.b = new EditingBuffer(s, TextRangeKt.coerceIn-8ffj60Q(v, 0, s.length()), null);
        this.c = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.d = SnapshotStateKt.mutableStateOf$default(new TextFieldCharSequence(s, v, null, null, 12, null), null, 2, null);
        this.e = new UndoState(this);
        this.f = new MutableVector(new NotifyImeListener[16], 0);
    }

    public TextFieldState(String s, long v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(s, v, new TextUndoManager(null, null, 3, null), null);
    }

    public final void a(TextFieldCharSequence textFieldCharSequence0, TextFieldCharSequence textFieldCharSequence1, ChangeList textFieldBuffer$ChangeList0, TextFieldEditUndoBehavior textFieldEditUndoBehavior0) {
        TextUndoManager textUndoManager0 = this.a;
        switch(textFieldEditUndoBehavior0) {
            case 1: {
                textUndoManager0.clearHistory();
                return;
            }
            case 2: {
                TextUndoManagerKt.recordChanges(textUndoManager0, textFieldCharSequence0, textFieldCharSequence1, textFieldBuffer$ChangeList0, true);
                return;
            }
            case 3: {
                TextUndoManagerKt.recordChanges(textUndoManager0, textFieldCharSequence0, textFieldCharSequence1, textFieldBuffer$ChangeList0, false);
            }
        }
    }

    public static final void access$commitEditAsUser(TextFieldState textFieldState0, InputTransformation inputTransformation0, boolean z, TextFieldEditUndoBehavior textFieldEditUndoBehavior0) {
        TextFieldBuffer textFieldBuffer1;
        TextFieldCharSequence textFieldCharSequence0 = textFieldState0.getValue$foundation_release();
        if(textFieldState0.b.getChangeTracker().getChangeCount() != 0 || !TextRange.equals-impl0(textFieldCharSequence0.getSelection-d9O1mEE(), textFieldState0.b.getSelection-d9O1mEE())) {
            TextFieldCharSequence textFieldCharSequence1 = new TextFieldCharSequence(textFieldState0.b.toString(), textFieldState0.b.getSelection-d9O1mEE(), textFieldState0.b.getComposition-MzsxiRA(), textFieldState0.b.getHighlight(), null);
            if(inputTransformation0 == null) {
                textFieldState0.b(textFieldCharSequence0, textFieldCharSequence1, z);
                textFieldState0.a(textFieldCharSequence0, textFieldCharSequence1, textFieldState0.b.getChangeTracker(), textFieldEditUndoBehavior0);
                return;
            }
            TextFieldBuffer textFieldBuffer0 = new TextFieldBuffer(textFieldCharSequence1, textFieldState0.b.getChangeTracker(), textFieldCharSequence0, null, 8, null);
            inputTransformation0.transformInput(textFieldBuffer0);
            boolean z1 = p.contentEquals(textFieldBuffer0.asCharSequence(), textFieldCharSequence1);
            boolean z2 = TextRange.equals-impl0(textFieldBuffer0.getSelection-d9O1mEE(), textFieldCharSequence1.getSelection-d9O1mEE());
            if(z1 && z2) {
                textFieldBuffer1 = textFieldBuffer0;
                textFieldState0.b(textFieldCharSequence0, TextFieldBuffer.toTextFieldCharSequence-udt6zUU$foundation_release$default(textFieldBuffer0, 0L, textFieldCharSequence1.getComposition-MzsxiRA(), 1, null), z);
            }
            else {
                textFieldBuffer1 = textFieldBuffer0;
                textFieldState0.syncMainBufferToTemporaryBuffer-TS3Rm5k$foundation_release(textFieldBuffer1, null, !z1, !z2);
            }
            textFieldState0.a(textFieldCharSequence0, textFieldState0.getValue$foundation_release(), textFieldBuffer1.getChanges(), textFieldEditUndoBehavior0);
        }
        else if(!Intrinsics.areEqual(textFieldCharSequence0.getComposition-MzsxiRA(), textFieldState0.b.getComposition-MzsxiRA()) || !Intrinsics.areEqual(textFieldCharSequence0.getHighlight(), textFieldState0.b.getHighlight())) {
            textFieldState0.b(textFieldState0.getValue$foundation_release(), new TextFieldCharSequence(textFieldState0.b.toString(), textFieldState0.b.getSelection-d9O1mEE(), textFieldState0.b.getComposition-MzsxiRA(), textFieldState0.b.getHighlight(), null), z);
        }
    }

    public final void addNotifyImeListener$foundation_release(@NotNull NotifyImeListener textFieldState$NotifyImeListener0) {
        this.f.add(textFieldState$NotifyImeListener0);
    }

    public final void b(TextFieldCharSequence textFieldCharSequence0, TextFieldCharSequence textFieldCharSequence1, boolean z) {
        this.d.setValue(textFieldCharSequence1);
        this.finishEditing();
        MutableVector mutableVector0 = this.f;
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                ((NotifyImeListener)arr_object[v1]).onChange(textFieldCharSequence0, textFieldCharSequence1, z);
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    @PublishedApi
    public final void commitEdit(@NotNull TextFieldBuffer textFieldBuffer0) {
        boolean z = textFieldBuffer0.getChanges().getChangeCount() > 0;
        boolean z1 = TextRange.equals-impl0(textFieldBuffer0.getSelection-d9O1mEE(), this.b.getSelection-d9O1mEE());
        if(z) {
            this.a.clearHistory();
        }
        this.syncMainBufferToTemporaryBuffer-TS3Rm5k$foundation_release(textFieldBuffer0, null, z, ((boolean)(true ^ z1)));
    }

    public final void edit(@NotNull Function1 function10) {
        TextFieldBuffer textFieldBuffer0 = this.startEdit();
        try {
            function10.invoke(textFieldBuffer0);
            this.commitEdit(textFieldBuffer0);
        }
        finally {
            this.finishEditing();
        }
    }

    public final void editAsUser$foundation_release(@Nullable InputTransformation inputTransformation0, boolean z, @NotNull TextFieldEditUndoBehavior textFieldEditUndoBehavior0, @NotNull Function1 function10) {
        this.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        function10.invoke(this.getMainBuffer$foundation_release());
        TextFieldState.access$commitEditAsUser(this, inputTransformation0, z, textFieldEditUndoBehavior0);
    }

    public static void editAsUser$foundation_release$default(TextFieldState textFieldState0, InputTransformation inputTransformation0, boolean z, TextFieldEditUndoBehavior textFieldEditUndoBehavior0, Function1 function10, int v, Object object0) {
        if((v & 2) != 0) {
            z = true;
        }
        if((v & 4) != 0) {
            textFieldEditUndoBehavior0 = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        textFieldState0.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        function10.invoke(textFieldState0.getMainBuffer$foundation_release());
        TextFieldState.access$commitEditAsUser(textFieldState0, inputTransformation0, z, textFieldEditUndoBehavior0);
    }

    public final void editWithNoSideEffects$foundation_release(@NotNull Function1 function10) {
        this.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        function10.invoke(this.getMainBuffer$foundation_release());
        TextFieldCharSequence textFieldCharSequence0 = new TextFieldCharSequence(this.getMainBuffer$foundation_release().toString(), this.getMainBuffer$foundation_release().getSelection-d9O1mEE(), this.getMainBuffer$foundation_release().getComposition-MzsxiRA(), null, 8, null);
        this.b(this.getValue$foundation_release(), textFieldCharSequence0, true);
    }

    @PublishedApi
    public final void finishEditing() {
        this.c.setValue(Boolean.FALSE);
    }

    @Nullable
    public final TextRange getComposition-MzsxiRA() {
        return this.getValue$foundation_release().getComposition-MzsxiRA();
    }

    @NotNull
    public final EditingBuffer getMainBuffer$foundation_release() {
        return this.b;
    }

    @VisibleForTesting
    public static void getMainBuffer$foundation_release$annotations() {
    }

    public final long getSelection-d9O1mEE() {
        return this.getValue$foundation_release().getSelection-d9O1mEE();
    }

    @NotNull
    public final CharSequence getText() {
        return this.getValue$foundation_release().getText();
    }

    @NotNull
    public final TextUndoManager getTextUndoManager$foundation_release() {
        return this.a;
    }

    @ExperimentalFoundationApi
    @NotNull
    public final UndoState getUndoState() {
        return this.e;
    }

    @ExperimentalFoundationApi
    public static void getUndoState$annotations() {
    }

    @NotNull
    public final TextFieldCharSequence getValue$foundation_release() {
        return (TextFieldCharSequence)this.d.getValue();
    }

    public final void removeNotifyImeListener$foundation_release(@NotNull NotifyImeListener textFieldState$NotifyImeListener0) {
        this.f.remove(textFieldState$NotifyImeListener0);
    }

    public final void setMainBuffer$foundation_release(@NotNull EditingBuffer editingBuffer0) {
        this.b = editingBuffer0;
    }

    @PublishedApi
    @NotNull
    public final TextFieldBuffer startEdit() {
        MutableState mutableState0 = this.c;
        Snapshot snapshot0 = Snapshot.Companion.getCurrentThreadSnapshot();
        Function1 function10 = snapshot0 == null ? null : snapshot0.getReadObserver();
        Snapshot snapshot1 = Snapshot.Companion.makeCurrentNonObservable(snapshot0);
        try {
            boolean z = ((Boolean)mutableState0.getValue()).booleanValue();
        }
        finally {
            Snapshot.Companion.restoreNonObservable(snapshot0, snapshot1, function10);
        }
        if(z) {
            throw new IllegalStateException("TextFieldState does not support concurrent or nested editing.");
        }
        mutableState0.setValue(Boolean.TRUE);
        return new TextFieldBuffer(this.getValue$foundation_release(), null, null, null, 14, null);
    }

    @VisibleForTesting
    public final void syncMainBufferToTemporaryBuffer-TS3Rm5k$foundation_release(@NotNull TextFieldBuffer textFieldBuffer0, @Nullable TextRange textRange0, boolean z, boolean z1) {
        String s = this.b.toString();
        TextFieldCharSequence textFieldCharSequence0 = new TextFieldCharSequence(s, this.b.getSelection-d9O1mEE(), this.b.getComposition-MzsxiRA(), null, 8, null);
        boolean z2 = Intrinsics.areEqual(textRange0, this.b.getComposition-MzsxiRA());
        if(z) {
            this.b = new EditingBuffer(textFieldBuffer0.toString(), textFieldBuffer0.getSelection-d9O1mEE(), null);
        }
        else if(z1) {
            this.b.setSelection(TextRange.getStart-impl(textFieldBuffer0.getSelection-d9O1mEE()), TextRange.getEnd-impl(textFieldBuffer0.getSelection-d9O1mEE()));
        }
        if(textRange0 == null || TextRange.getCollapsed-impl(textRange0.unbox-impl())) {
            this.b.commitComposition();
        }
        else {
            this.b.setComposition(TextRange.getMin-impl(textRange0.unbox-impl()), TextRange.getMax-impl(textRange0.unbox-impl()));
        }
        if(z || !z1 && !z2) {
            this.b.commitComposition();
        }
        if(z) {
            s = textFieldBuffer0.toString();
        }
        this.b(textFieldCharSequence0, new TextFieldCharSequence(s, this.b.getSelection-d9O1mEE(), this.b.getComposition-MzsxiRA(), null, 8, null), true);
    }

    @Override
    @NotNull
    public String toString() {
        Snapshot snapshot0 = Snapshot.Companion.getCurrentThreadSnapshot();
        Function1 function10 = snapshot0 == null ? null : snapshot0.getReadObserver();
        Snapshot snapshot1 = Snapshot.Companion.makeCurrentNonObservable(snapshot0);
        try {
            return "TextFieldState(selection=" + TextRange.toString-impl(this.getSelection-d9O1mEE()) + ", text=\"" + this.getText() + "\")";
        }
        finally {
            Snapshot.Companion.restoreNonObservable(snapshot0, snapshot1, function10);
        }
    }
}

