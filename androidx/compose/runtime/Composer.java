package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionData;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

@Metadata(d1 = {"\u0000\u00CE\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\u0010\f\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u0087\u00012\u00020\u0001:\u0002\u0087\u0001J@\u00105\u001A\u000206\"\u0004\b\u0000\u00107\"\u0004\b\u0001\u001082\u0006\u00109\u001A\u0002H72\u001D\u0010:\u001A\u0019\u0012\u0004\u0012\u0002H8\u0012\u0004\u0012\u0002H7\u0012\u0004\u0012\u0002060;\u00A2\u0006\u0002\b<H\'\u00A2\u0006\u0002\u0010=J\b\u0010>\u001A\u00020?H\'J\u0012\u0010@\u001A\u00020\"2\b\u00109\u001A\u0004\u0018\u00010\u0001H\'J\u0010\u0010@\u001A\u00020\"2\u0006\u00109\u001A\u00020\"H\u0017J\u0010\u0010@\u001A\u00020\"2\u0006\u00109\u001A\u00020AH\u0017J\u0010\u0010@\u001A\u00020\"2\u0006\u00109\u001A\u00020BH\u0017J\u0010\u0010@\u001A\u00020\"2\u0006\u00109\u001A\u00020CH\u0017J\u0010\u0010@\u001A\u00020\"2\u0006\u00109\u001A\u00020DH\u0017J\u0010\u0010@\u001A\u00020\"2\u0006\u00109\u001A\u00020\u0016H\u0017J\u0010\u0010@\u001A\u00020\"2\u0006\u00109\u001A\u00020EH\u0017J\u0010\u0010@\u001A\u00020\"2\u0006\u00109\u001A\u00020FH\u0017J\u0012\u0010G\u001A\u00020\"2\b\u00109\u001A\u0004\u0018\u00010\u0001H\u0017J\b\u0010H\u001A\u000206H&J!\u0010I\u001A\u0002H8\"\u0004\b\u0000\u001082\f\u0010J\u001A\b\u0012\u0004\u0012\u0002H80KH\'\u00A2\u0006\u0002\u0010LJ\u001C\u0010M\u001A\u000206\"\u0004\b\u0000\u001082\f\u0010N\u001A\b\u0012\u0004\u0012\u0002H80OH\'J\u0010\u0010P\u001A\u0002062\u0006\u0010@\u001A\u00020\"H\'J\b\u0010Q\u001A\u000206H\'J\b\u0010R\u001A\u000206H\'J\b\u0010S\u001A\u000206H\'J\b\u0010T\u001A\u000206H\'J\b\u0010U\u001A\u000206H\'J\b\u0010V\u001A\u000206H\'J\b\u0010W\u001A\u000206H\'J\b\u0010X\u001A\u000206H\'J\b\u0010Y\u001A\u000206H\'J\b\u0010Z\u001A\u000206H\'J\n\u0010[\u001A\u0004\u0018\u00010\\H\'J\b\u0010]\u001A\u000206H\'J\u0010\u0010^\u001A\u0002062\u0006\u0010_\u001A\u00020\u0016H\'J\u001E\u0010`\u001A\u0002062\n\u00109\u001A\u0006\u0012\u0002\b\u00030a2\b\u0010b\u001A\u0004\u0018\u00010\u0001H\'J$\u0010c\u001A\u0002062\u001A\u0010d\u001A\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020g\u0012\u0006\u0012\u0004\u0018\u00010g0f0eH\'J\u001C\u0010h\u001A\u00020\u00012\b\u0010i\u001A\u0004\u0018\u00010\u00012\b\u0010j\u001A\u0004\u0018\u00010\u0001H\'J\u0016\u0010k\u001A\u0002062\f\u0010l\u001A\b\u0012\u0004\u0012\u0002060OH\'J\u0010\u0010m\u001A\u0002062\u0006\u0010n\u001A\u00020*H\'J\n\u0010o\u001A\u0004\u0018\u00010\u0001H\'J\b\u0010p\u001A\u000206H\'J\b\u0010q\u001A\u000206H\'J\u0010\u0010r\u001A\u0002062\u0006\u0010r\u001A\u00020sH&J\b\u0010t\u001A\u000206H&J\u0018\u0010u\u001A\u0002062\u0006\u0010J\u001A\u00020\u00162\u0006\u0010r\u001A\u00020sH&J\b\u0010v\u001A\u000206H\'J\u001A\u0010w\u001A\u0002062\u0006\u0010J\u001A\u00020\u00162\b\u0010x\u001A\u0004\u0018\u00010\u0001H\'J\b\u0010y\u001A\u000206H\'J\u0014\u0010z\u001A\u0002062\n\u00109\u001A\u0006\u0012\u0002\b\u00030{H\'J!\u0010|\u001A\u0002062\u0012\u0010}\u001A\u000E\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030{0~H\'\u00A2\u0006\u0002\u0010\u007FJ\u0011\u0010\u0080\u0001\u001A\u0002062\u0006\u0010J\u001A\u00020\u0016H\'J\u0011\u0010\u0081\u0001\u001A\u0002062\u0006\u0010J\u001A\u00020\u0016H\'J\u0011\u0010\u0082\u0001\u001A\u00020\u00002\u0006\u0010J\u001A\u00020\u0016H\'J\u001B\u0010\u0083\u0001\u001A\u0002062\u0006\u0010J\u001A\u00020\u00162\b\u0010x\u001A\u0004\u0018\u00010\u0001H\'J\t\u0010\u0084\u0001\u001A\u000206H\'J\u0013\u0010\u0085\u0001\u001A\u0002062\b\u00109\u001A\u0004\u0018\u00010\u0001H\'J\t\u0010\u0086\u0001\u001A\u000206H\'R\u001E\u0010\u0002\u001A\u0006\u0012\u0002\b\u00030\u00038&X\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007R\u001A\u0010\b\u001A\u00020\t8gX\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b\n\u0010\u0005\u001A\u0004\b\u000B\u0010\fR\u0014\u0010\r\u001A\u00020\u000E8gX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010R\u0012\u0010\u0011\u001A\u00020\u0012X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014R\u001A\u0010\u0015\u001A\u00020\u00168&X\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b\u0017\u0010\u0005\u001A\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001A\u001A\u00020\u001BX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u001C\u0010\u001DR\u001A\u0010\u001E\u001A\u00020\u00168&X\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b\u001F\u0010\u0005\u001A\u0004\b \u0010\u0019R\u001A\u0010!\u001A\u00020\"8&X\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b#\u0010\u0005\u001A\u0004\b$\u0010%R\u001A\u0010&\u001A\u00020\"8&X\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b\'\u0010\u0005\u001A\u0004\b(\u0010%R\u001C\u0010)\u001A\u0004\u0018\u00010*8&X\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b+\u0010\u0005\u001A\u0004\b,\u0010-R\u001C\u0010.\u001A\u0004\u0018\u00010\u00018&X\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b/\u0010\u0005\u001A\u0004\b0\u00101R\u001A\u00102\u001A\u00020\"8&X\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b3\u0010\u0005\u001A\u0004\b4\u0010%\u0082\u0001\u0002\u0088\u0001\u00F8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00A8\u0006\u0089\u0001\u00C0\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/Composer;", "", "applier", "Landroidx/compose/runtime/Applier;", "getApplier$annotations", "()V", "getApplier", "()Landroidx/compose/runtime/Applier;", "applyCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext$annotations", "getApplyCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "composition", "Landroidx/compose/runtime/ControlledComposition;", "getComposition", "()Landroidx/compose/runtime/ControlledComposition;", "compositionData", "Landroidx/compose/runtime/tooling/CompositionData;", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "compoundKeyHash", "", "getCompoundKeyHash$annotations", "getCompoundKeyHash", "()I", "currentCompositionLocalMap", "Landroidx/compose/runtime/CompositionLocalMap;", "getCurrentCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "currentMarker", "getCurrentMarker$annotations", "getCurrentMarker", "defaultsInvalid", "", "getDefaultsInvalid$annotations", "getDefaultsInvalid", "()Z", "inserting", "getInserting$annotations", "getInserting", "recomposeScope", "Landroidx/compose/runtime/RecomposeScope;", "getRecomposeScope$annotations", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "recomposeScopeIdentity", "getRecomposeScopeIdentity$annotations", "getRecomposeScopeIdentity", "()Ljava/lang/Object;", "skipping", "getSkipping$annotations", "getSkipping", "apply", "", "V", "T", "value", "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "buildContext", "Landroidx/compose/runtime/CompositionContext;", "changed", "", "", "", "", "", "", "changedInstance", "collectParameterInformation", "consume", "key", "Landroidx/compose/runtime/CompositionLocal;", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "createNode", "factory", "Lkotlin/Function0;", "deactivateToEndGroup", "disableReusing", "disableSourceInformation", "enableReusing", "endDefaults", "endMovableGroup", "endNode", "endProvider", "endProviders", "endReplaceGroup", "endReplaceableGroup", "endRestartGroup", "Landroidx/compose/runtime/ScopeUpdateScope;", "endReusableGroup", "endToMarker", "marker", "insertMovableContent", "Landroidx/compose/runtime/MovableContent;", "parameter", "insertMovableContentReferences", "references", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "joinKey", "left", "right", "recordSideEffect", "effect", "recordUsed", "scope", "rememberedValue", "skipCurrentGroup", "skipToGroupEnd", "sourceInformation", "", "sourceInformationMarkerEnd", "sourceInformationMarkerStart", "startDefaults", "startMovableGroup", "dataKey", "startNode", "startProvider", "Landroidx/compose/runtime/ProvidedValue;", "startProviders", "values", "", "([Landroidx/compose/runtime/ProvidedValue;)V", "startReplaceGroup", "startReplaceableGroup", "startRestartGroup", "startReusableGroup", "startReusableNode", "updateRememberedValue", "useNode", "Companion", "Landroidx/compose/runtime/ComposerImpl;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface Composer {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000B\u001A\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/Composer$Companion;", "", "Landroidx/compose/runtime/CompositionTracer;", "tracer", "", "setTracer", "(Landroidx/compose/runtime/CompositionTracer;)V", "b", "Ljava/lang/Object;", "getEmpty", "()Ljava/lang/Object;", "Empty", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public static final Companion a;
        public static final Composer.Companion.Empty.1 b;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
            Companion.b = new Composer.Companion.Empty.1();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @NotNull
        public final Object getEmpty() {
            return Companion.b;
        }

        @InternalComposeTracingApi
        public final void setTracer(@NotNull CompositionTracer compositionTracer0) {
            ComposerKt.a = compositionTracer0;
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        Composer.Companion = Companion.a;
    }

    @ComposeCompilerApi
    void apply(Object arg1, @NotNull Function2 arg2);

    @InternalComposeApi
    @NotNull
    CompositionContext buildContext();

    @ComposeCompilerApi
    default boolean changed(byte b) {
        return this.changed(b);
    }

    @ComposeCompilerApi
    default boolean changed(char c) {
        return this.changed(c);
    }

    @ComposeCompilerApi
    default boolean changed(double f) {
        return this.changed(f);
    }

    @ComposeCompilerApi
    default boolean changed(float f) {
        return this.changed(f);
    }

    @ComposeCompilerApi
    default boolean changed(int v) {
        return this.changed(v);
    }

    @ComposeCompilerApi
    default boolean changed(long v) {
        return this.changed(v);
    }

    @ComposeCompilerApi
    boolean changed(@Nullable Object arg1);

    @ComposeCompilerApi
    default boolean changed(short v) {
        return this.changed(v);
    }

    @ComposeCompilerApi
    default boolean changed(boolean z) {
        return this.changed(z);
    }

    @ComposeCompilerApi
    default boolean changedInstance(@Nullable Object object0) {
        return this.changed(object0);
    }

    void collectParameterInformation();

    @InternalComposeApi
    Object consume(@NotNull CompositionLocal arg1);

    @ComposeCompilerApi
    void createNode(@NotNull Function0 arg1);

    @ComposeCompilerApi
    void deactivateToEndGroup(boolean arg1);

    @ComposeCompilerApi
    void disableReusing();

    @TestOnly
    void disableSourceInformation();

    @ComposeCompilerApi
    void enableReusing();

    @ComposeCompilerApi
    void endDefaults();

    @ComposeCompilerApi
    void endMovableGroup();

    @ComposeCompilerApi
    void endNode();

    @InternalComposeApi
    void endProvider();

    @InternalComposeApi
    void endProviders();

    @ComposeCompilerApi
    void endReplaceGroup();

    @ComposeCompilerApi
    void endReplaceableGroup();

    @ComposeCompilerApi
    @Nullable
    ScopeUpdateScope endRestartGroup();

    @ComposeCompilerApi
    void endReusableGroup();

    @ComposeCompilerApi
    void endToMarker(int arg1);

    @NotNull
    Applier getApplier();

    @ComposeCompilerApi
    static void getApplier$annotations() {
    }

    @NotNull
    @TestOnly
    CoroutineContext getApplyCoroutineContext();

    @InternalComposeApi
    static void getApplyCoroutineContext$annotations() {
    }

    @NotNull
    @TestOnly
    ControlledComposition getComposition();

    @NotNull
    CompositionData getCompositionData();

    int getCompoundKeyHash();

    @InternalComposeApi
    static void getCompoundKeyHash$annotations() {
    }

    @NotNull
    CompositionLocalMap getCurrentCompositionLocalMap();

    int getCurrentMarker();

    @ComposeCompilerApi
    static void getCurrentMarker$annotations() {
    }

    boolean getDefaultsInvalid();

    @ComposeCompilerApi
    static void getDefaultsInvalid$annotations() {
    }

    boolean getInserting();

    @ComposeCompilerApi
    static void getInserting$annotations() {
    }

    @Nullable
    RecomposeScope getRecomposeScope();

    @InternalComposeApi
    static void getRecomposeScope$annotations() {
    }

    @Nullable
    Object getRecomposeScopeIdentity();

    @ComposeCompilerApi
    static void getRecomposeScopeIdentity$annotations() {
    }

    boolean getSkipping();

    @ComposeCompilerApi
    static void getSkipping$annotations() {
    }

    @InternalComposeApi
    void insertMovableContent(@NotNull MovableContent arg1, @Nullable Object arg2);

    @InternalComposeApi
    void insertMovableContentReferences(@NotNull List arg1);

    @ComposeCompilerApi
    @NotNull
    Object joinKey(@Nullable Object arg1, @Nullable Object arg2);

    @InternalComposeApi
    void recordSideEffect(@NotNull Function0 arg1);

    @InternalComposeApi
    void recordUsed(@NotNull RecomposeScope arg1);

    @ComposeCompilerApi
    @Nullable
    Object rememberedValue();

    @ComposeCompilerApi
    void skipCurrentGroup();

    @ComposeCompilerApi
    void skipToGroupEnd();

    void sourceInformation(@NotNull String arg1);

    void sourceInformationMarkerEnd();

    void sourceInformationMarkerStart(int arg1, @NotNull String arg2);

    @ComposeCompilerApi
    void startDefaults();

    @ComposeCompilerApi
    void startMovableGroup(int arg1, @Nullable Object arg2);

    @ComposeCompilerApi
    void startNode();

    @InternalComposeApi
    void startProvider(@NotNull ProvidedValue arg1);

    @InternalComposeApi
    void startProviders(@NotNull ProvidedValue[] arg1);

    @ComposeCompilerApi
    void startReplaceGroup(int arg1);

    @ComposeCompilerApi
    void startReplaceableGroup(int arg1);

    @ComposeCompilerApi
    @NotNull
    Composer startRestartGroup(int arg1);

    @ComposeCompilerApi
    void startReusableGroup(int arg1, @Nullable Object arg2);

    @ComposeCompilerApi
    void startReusableNode();

    @ComposeCompilerApi
    void updateRememberedValue(@Nullable Object arg1);

    @ComposeCompilerApi
    void useNode();
}

