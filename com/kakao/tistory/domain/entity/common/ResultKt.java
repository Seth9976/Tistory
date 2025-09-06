package com.kakao.tistory.domain.entity.common;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001AN\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u001A\b\u0002\u0010\u0004\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0014\b\u0002\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0086\bø\u0001\u0000\u001AU\u0010\t\u001A\u0002H\n\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0018\u0010\u0004\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0006\u0012\u0004\u0012\u0002H\n0\u00052\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002H\n0\u0005H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u000B\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"process", "", "T", "Lcom/kakao/tistory/domain/entity/common/Result;", "success", "Lkotlin/Function1;", "Lcom/kakao/tistory/domain/entity/common/Result$Success;", "fail", "Lcom/kakao/tistory/domain/entity/common/Result$Fail;", "processReturn", "R", "(Lcom/kakao/tistory/domain/entity/common/Result;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "domain_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class ResultKt {
    public static final void process(@NotNull Result result0, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(result0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "success");
        Intrinsics.checkNotNullParameter(function11, "fail");
        if(result0 instanceof Success) {
            function10.invoke(result0);
            return;
        }
        if(result0 instanceof Fail) {
            function11.invoke(result0);
        }
    }

    public static void process$default(Result result0, Function1 function10, Function1 function11, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = com.kakao.tistory.domain.entity.common.ResultKt.process.1.INSTANCE;
        }
        if((v & 2) != 0) {
            function11 = com.kakao.tistory.domain.entity.common.ResultKt.process.2.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(result0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "success");
        Intrinsics.checkNotNullParameter(function11, "fail");
        if(result0 instanceof Success) {
            function10.invoke(result0);
            return;
        }
        if(result0 instanceof Fail) {
            function11.invoke(result0);
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "it", "Lcom/kakao/tistory/domain/entity/common/Result$Success;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Result.kt\ncom/kakao/tistory/domain/entity/common/ResultKt$process$1\n*L\n1#1,32:1\n*E\n"})
        public final class com.kakao.tistory.domain.entity.common.ResultKt.process.1 extends Lambda implements Function1 {
            public static final com.kakao.tistory.domain.entity.common.ResultKt.process.1 INSTANCE;

            static {
                com.kakao.tistory.domain.entity.common.ResultKt.process.1.INSTANCE = new com.kakao.tistory.domain.entity.common.ResultKt.process.1();
            }

            public com.kakao.tistory.domain.entity.common.ResultKt.process.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Success)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Success result$Success0) {
                Intrinsics.checkNotNullParameter(result$Success0, "it");
            }
        }


        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001A\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "it", "Lcom/kakao/tistory/domain/entity/common/Result$Fail;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Result.kt\ncom/kakao/tistory/domain/entity/common/ResultKt$process$2\n*L\n1#1,32:1\n*E\n"})
        public final class com.kakao.tistory.domain.entity.common.ResultKt.process.2 extends Lambda implements Function1 {
            public static final com.kakao.tistory.domain.entity.common.ResultKt.process.2 INSTANCE;

            static {
                com.kakao.tistory.domain.entity.common.ResultKt.process.2.INSTANCE = new com.kakao.tistory.domain.entity.common.ResultKt.process.2();
            }

            public com.kakao.tistory.domain.entity.common.ResultKt.process.2() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Fail)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Fail result$Fail0) {
                Intrinsics.checkNotNullParameter(result$Fail0, "it");
            }
        }

    }

    public static final Object processReturn(@NotNull Result result0, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(result0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "success");
        Intrinsics.checkNotNullParameter(function11, "fail");
        if(result0 instanceof Success) {
            return function10.invoke(result0);
        }
        if(!(result0 instanceof Fail)) {
            throw new NoWhenBranchMatchedException();
        }
        return function11.invoke(result0);
    }
}

