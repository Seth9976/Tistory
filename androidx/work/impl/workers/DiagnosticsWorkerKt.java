package androidx.work.impl.workers;

import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.model.WorkTagDao;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDiagnosticsWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiagnosticsWorker.kt\nandroidx/work/impl/workers/DiagnosticsWorkerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n1855#2,2:89\n*S KotlinDebug\n*F\n+ 1 DiagnosticsWorker.kt\nandroidx/work/impl/workers/DiagnosticsWorkerKt\n*L\n77#1:89,2\n*E\n"})
public final class DiagnosticsWorkerKt {
    public static final String a;

    // 去混淆评级： 低(20)
    static {
        Intrinsics.checkNotNullExpressionValue("WM-DiagnosticsWrkr", "tagWithPrefix(\"DiagnosticsWrkr\")");
        DiagnosticsWorkerKt.a = "WM-DiagnosticsWrkr";
    }

    // 去混淆评级： 低(20)
    public static final String access$getTAG$p() [...] // 潜在的解密器

    public static final String access$workSpecRows(WorkNameDao workNameDao0, WorkTagDao workTagDao0, SystemIdInfoDao systemIdInfoDao0, List list0) {
        StringBuilder stringBuilder0 = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        for(Object object0: list0) {
            SystemIdInfo systemIdInfo0 = systemIdInfoDao0.getSystemIdInfo(WorkSpecKt.generationalId(((WorkSpec)object0)));
            String s = CollectionsKt___CollectionsKt.joinToString$default(workNameDao0.getNamesForWorkSpecId(((WorkSpec)object0).id), ",", null, null, 0, null, null, 62, null);
            String s1 = CollectionsKt___CollectionsKt.joinToString$default(workTagDao0.getTagsForWorkSpecId(((WorkSpec)object0).id), ",", null, null, 0, null, null, 62, null);
            stringBuilder0.append("\n" + ((WorkSpec)object0).id + "\t " + ((WorkSpec)object0).workerClassName + "\t " + (systemIdInfo0 == null ? null : systemIdInfo0.systemId) + "\t " + ((WorkSpec)object0).state.name() + "\t " + s + "\t " + s1 + '\t');
        }
        String s2 = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s2, "StringBuilder().apply(builderAction).toString()");
        return s2;
    }
}

