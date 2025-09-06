package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/internal/MainDispatcherLoader;", "", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "dispatcher", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatcherLoader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n1963#2,14:135\n*S KotlinDebug\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatcherLoader\n*L\n38#1:135,14\n*E\n"})
public final class MainDispatcherLoader {
    @NotNull
    public static final MainDispatcherLoader INSTANCE;
    @JvmField
    @NotNull
    public static final MainCoroutineDispatcher dispatcher;

    static {
        Object object0;
        MainDispatcherLoader.INSTANCE = new MainDispatcherLoader();  // 初始化器: Ljava/lang/Object;-><init>()V
        SystemPropsKt.systemProp("kotlinx.coroutines.fast.service.loader", true);
        List list0 = SequencesKt___SequencesKt.toList(SequencesKt__SequencesKt.asSequence(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator()));
        Iterator iterator0 = list0.iterator();
        if(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            if(iterator0.hasNext()) {
                int v = ((MainDispatcherFactory)object1).getLoadPriority();
                while(true) {
                    Object object2 = iterator0.next();
                    int v1 = ((MainDispatcherFactory)object2).getLoadPriority();
                    if(v < v1) {
                        object1 = object2;
                        v = v1;
                    }
                    if(!iterator0.hasNext()) {
                        break;
                    }
                }
            }
            object0 = object1;
        }
        else {
            object0 = null;
        }
        if(((MainDispatcherFactory)object0) != null) {
            MainCoroutineDispatcher mainCoroutineDispatcher0 = MainDispatchersKt.tryCreateDispatcher(((MainDispatcherFactory)object0), list0);
            if(mainCoroutineDispatcher0 != null) {
                MainDispatcherLoader.dispatcher = mainCoroutineDispatcher0;
                return;
            }
        }
        MainDispatchersKt.throwMissingMainDispatcherException();
        throw new KotlinNothingValueException();
    }
}

