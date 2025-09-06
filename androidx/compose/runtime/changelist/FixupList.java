package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import wb.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\t\u001A\u00020\b¢\u0006\u0004\b\t\u0010\u0003J)\u0010\u0010\u001A\u00020\b2\n\u0010\u000B\u001A\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0019\u001A\u00020\b2\u000E\u0010\u0014\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00122\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0018\u001A\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001AJ\r\u0010\u001B\u001A\u00020\b¢\u0006\u0004\b\u001B\u0010\u0003J@\u0010\"\u001A\u00020\b\"\u0004\b\u0000\u0010\u001C\"\u0004\b\u0001\u0010\u001D2\u0006\u0010\u001E\u001A\u00028\u00002\u001D\u0010!\u001A\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u001F¢\u0006\u0002\b ¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001A\u00020$2\u0006\u0010%\u001A\u00020$H\u0016¢\u0006\u0004\b&\u0010\'R\u0011\u0010*\u001A\u00020\u00158F¢\u0006\u0006\u001A\u0004\b(\u0010)¨\u0006+"}, d2 = {"Landroidx/compose/runtime/changelist/FixupList;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "<init>", "()V", "", "isEmpty", "()Z", "isNotEmpty", "", "clear", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "executeAndFlushAllPendingFixups", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "Lkotlin/Function0;", "", "factory", "", "insertIndex", "Landroidx/compose/runtime/Anchor;", "groupAnchor", "createAndInsertNode", "(Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Anchor;)V", "endNodeInsert", "V", "T", "value", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", "updateNode", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "", "linePrefix", "toDebugString", "(Ljava/lang/String;)Ljava/lang/String;", "getSize", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFixupList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FixupList.kt\nandroidx/compose/runtime/changelist/FixupList\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n+ 4 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertNodeFixup\n+ 5 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 6 Operation.kt\nandroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup\n+ 7 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n*L\n1#1,91:1\n4551#2,7:92\n4551#2,7:184\n166#3,5:99\n174#3,2:107\n173#3:109\n177#3,25:115\n203#3:141\n166#3,5:142\n174#3,2:149\n173#3:151\n177#3,25:157\n203#3:183\n166#3,5:191\n174#3,2:198\n173#3:200\n177#3,25:206\n203#3:232\n563#4:104\n564#4:105\n565#4:106\n50#5,5:110\n56#5:140\n50#5,5:152\n56#5:182\n50#5,5:201\n56#5:231\n595#6:147\n596#6:148\n433#7:196\n434#7:197\n*S KotlinDebug\n*F\n+ 1 FixupList.kt\nandroidx/compose/runtime/changelist/FixupList\n*L\n46#1:92,7\n71#1:184,7\n58#1:99,5\n58#1:107,2\n58#1:109\n58#1:115,25\n58#1:141\n64#1:142,5\n64#1:149,2\n64#1:151\n64#1:157,25\n64#1:183\n78#1:191,5\n78#1:198,2\n78#1:200\n78#1:206,25\n78#1:232\n59#1:104\n60#1:105\n61#1:106\n58#1:110,5\n58#1:140\n64#1:152,5\n64#1:182\n78#1:201,5\n78#1:231\n65#1:147\n66#1:148\n79#1:196\n80#1:197\n*E\n"})
public final class FixupList extends OperationsDebugStringFormattable {
    public static final int $stable = 8;
    public final Operations a;
    public final Operations b;

    public FixupList() {
        this.a = new Operations();
        this.b = new Operations();
    }

    public final void clear() {
        this.b.clear();
        this.a.clear();
    }

    public final void createAndInsertNode(@NotNull Function0 function00, int v, @NotNull Anchor anchor0) {
        Operations operations2;
        InsertNodeFixup operation$InsertNodeFixup0 = InsertNodeFixup.INSTANCE;
        Operations operations0 = this.a;
        operations0.pushOp(operation$InsertNodeFixup0);
        WriteScope.setObject-DKhxnng(operations0, 0, function00);
        WriteScope.setInt-A6tL2VI(operations0, 0, v);
        WriteScope.setObject-DKhxnng(operations0, 1, anchor0);
        if(Operations.access$getPushedIntMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$InsertNodeFixup0.getInts()) || Operations.access$getPushedObjectMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$InsertNodeFixup0.getObjects())) {
            StringBuilder stringBuilder0 = new StringBuilder();
            int v1 = operation$InsertNodeFixup0.getInts();
            int v2 = 0;
            for(int v3 = 0; v3 < v1; ++v3) {
                if((1 << v3 & Operations.access$getPushedIntMask$p(operations0)) != 0) {
                    if(v2 > 0) {
                        stringBuilder0.append(", ");
                    }
                    stringBuilder0.append(operation$InsertNodeFixup0.intParamName-w8GmfQM(v3));
                    ++v2;
                }
            }
            String s = stringBuilder0.toString();
            StringBuilder stringBuilder1 = a.f(s, "StringBuilder().apply(builderAction).toString()");
            int v4 = operation$InsertNodeFixup0.getObjects();
            int v5 = 0;
            for(int v6 = 0; v6 < v4; ++v6) {
                if((1 << v6 & Operations.access$getPushedObjectMask$p(operations0)) != 0) {
                    if(v2 > 0) {
                        stringBuilder1.append(", ");
                    }
                    stringBuilder1.append(operation$InsertNodeFixup0.objectParamName-31yXWZQ(v6));
                    ++v5;
                }
            }
            String s1 = stringBuilder1.toString();
            Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
            StringBuilder stringBuilder2 = new StringBuilder("Error while pushing ");
            stringBuilder2.append(operation$InsertNodeFixup0);
            stringBuilder2.append(". Not all arguments were provided. Missing ");
            a.j(stringBuilder2, v2, " int arguments (", s, ") and ");
            a.l(stringBuilder2, v5, " object arguments (", s1, ").");
        }
        PostInsertNodeFixup operation$PostInsertNodeFixup0 = PostInsertNodeFixup.INSTANCE;
        Operations operations1 = this.b;
        operations1.pushOp(operation$PostInsertNodeFixup0);
        WriteScope.setInt-A6tL2VI(operations1, 0, v);
        WriteScope.setObject-DKhxnng(operations1, 0, anchor0);
        if(Operations.access$getPushedIntMask$p(operations1) != Operations.access$createExpectedArgMask(operations1, operation$PostInsertNodeFixup0.getInts()) || Operations.access$getPushedObjectMask$p(operations1) != Operations.access$createExpectedArgMask(operations1, operation$PostInsertNodeFixup0.getObjects())) {
            StringBuilder stringBuilder3 = new StringBuilder();
            int v7 = operation$PostInsertNodeFixup0.getInts();
            int v9 = 0;
            for(int v8 = 0; v8 < v7; ++v8) {
                if((1 << v8 & Operations.access$getPushedIntMask$p(operations1)) != 0) {
                    if(v9 > 0) {
                        stringBuilder3.append(", ");
                    }
                    stringBuilder3.append(operation$PostInsertNodeFixup0.intParamName-w8GmfQM(v8));
                    ++v9;
                }
            }
            String s2 = stringBuilder3.toString();
            StringBuilder stringBuilder4 = a.f(s2, "StringBuilder().apply(builderAction).toString()");
            int v10 = operation$PostInsertNodeFixup0.getObjects();
            int v11 = 0;
            int v12 = 0;
            while(v12 < v10) {
                if((1 << v12 & Operations.access$getPushedObjectMask$p(operations1)) == 0) {
                    operations2 = operations1;
                }
                else {
                    if(v9 > 0) {
                        stringBuilder4.append(", ");
                    }
                    operations2 = operations1;
                    stringBuilder4.append(operation$PostInsertNodeFixup0.objectParamName-31yXWZQ(v12));
                    ++v11;
                }
                ++v12;
                operations1 = operations2;
            }
            String s3 = stringBuilder4.toString();
            Intrinsics.checkNotNullExpressionValue(s3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder stringBuilder5 = new StringBuilder("Error while pushing ");
            stringBuilder5.append(operation$PostInsertNodeFixup0);
            stringBuilder5.append(". Not all arguments were provided. Missing ");
            a.j(stringBuilder5, v9, " int arguments (", s2, ") and ");
            a.l(stringBuilder5, v11, " object arguments (", s3, ").");
        }
    }

    public final void endNodeInsert() {
        Operations operations0 = this.b;
        if(!operations0.isNotEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        operations0.popInto(this.a);
    }

    public final void executeAndFlushAllPendingFixups(@NotNull Applier applier0, @NotNull SlotWriter slotWriter0, @NotNull RememberManager rememberManager0) {
        if(!this.b.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        this.a.executeAndFlushAllPendingOperations(applier0, slotWriter0, rememberManager0);
    }

    public final int getSize() {
        return this.a.getSize();
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final boolean isNotEmpty() {
        return this.a.isNotEmpty();
    }

    @Override  // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    @NotNull
    public String toDebugString(@NotNull String s) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("FixupList instance containing " + this.getSize() + " operations");
        if(stringBuilder0.length() > 0) {
            stringBuilder0.append(":\n" + this.a.toDebugString(s));
        }
        String s1 = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
        return s1;
    }

    public final void updateNode(Object object0, @NotNull Function2 function20) {
        UpdateNode operation$UpdateNode0 = UpdateNode.INSTANCE;
        Operations operations0 = this.a;
        operations0.pushOp(operation$UpdateNode0);
        WriteScope.setObject-DKhxnng(operations0, 0, object0);
        Intrinsics.checkNotNull(function20, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        WriteScope.setObject-DKhxnng(operations0, 1, ((Function2)TypeIntrinsics.beforeCheckcastToFunctionOfArity(function20, 2)));
        if(Operations.access$getPushedIntMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$UpdateNode0.getInts()) || Operations.access$getPushedObjectMask$p(operations0) != Operations.access$createExpectedArgMask(operations0, operation$UpdateNode0.getObjects())) {
            StringBuilder stringBuilder0 = new StringBuilder();
            int v1 = operation$UpdateNode0.getInts();
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                if((1 << v2 & Operations.access$getPushedIntMask$p(operations0)) != 0) {
                    if(v3 > 0) {
                        stringBuilder0.append(", ");
                    }
                    stringBuilder0.append(operation$UpdateNode0.intParamName-w8GmfQM(v2));
                    ++v3;
                }
            }
            String s = stringBuilder0.toString();
            StringBuilder stringBuilder1 = a.f(s, "StringBuilder().apply(builderAction).toString()");
            int v4 = operation$UpdateNode0.getObjects();
            int v5 = 0;
            for(int v = 0; v < v4; ++v) {
                if((1 << v & Operations.access$getPushedObjectMask$p(operations0)) != 0) {
                    if(v3 > 0) {
                        stringBuilder1.append(", ");
                    }
                    stringBuilder1.append(operation$UpdateNode0.objectParamName-31yXWZQ(v));
                    ++v5;
                }
            }
            String s1 = stringBuilder1.toString();
            Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
            StringBuilder stringBuilder2 = new StringBuilder("Error while pushing ");
            stringBuilder2.append(operation$UpdateNode0);
            stringBuilder2.append(". Not all arguments were provided. Missing ");
            a.j(stringBuilder2, v3, " int arguments (", s, ") and ");
            a.l(stringBuilder2, v5, " object arguments (", s1, ").");
        }
    }
}

