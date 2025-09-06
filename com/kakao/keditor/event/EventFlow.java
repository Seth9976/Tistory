package com.kakao.keditor.event;

import com.kakao.keditor.Keditor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001F\u0010\b\u001A\u00020\t2\u0012\u0010\u0002\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\n\u001A\u00020\tJ\u000E\u0010\u000B\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\rJ\u001E\u0010\u000E\u001A\u00020\t2\u0006\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\r2\u0006\u0010\u0012\u001A\u00020\rJ\u0018\u0010\u000E\u001A\u00020\t2\u0006\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\rJ\u000E\u0010\u0013\u001A\u00020\t2\u0006\u0010\u0014\u001A\u00020\u0004R\u0014\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/kakao/keditor/event/EventFlow;", "Ljava/io/Serializable;", "participants", "", "Lcom/kakao/keditor/event/Participant;", "([Lcom/kakao/keditor/event/Participant;)V", "participants_", "", "addParticipant", "", "clearParticipant", "post", "event", "Lcom/kakao/keditor/event/Event;", "postIf", "condition", "", "event1", "event2", "removeParticipant", "participant", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEventFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventFlow.kt\ncom/kakao/keditor/event/EventFlow\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,54:1\n800#2,11:55\n*S KotlinDebug\n*F\n+ 1 EventFlow.kt\ncom/kakao/keditor/event/EventFlow\n*L\n32#1:55,11\n*E\n"})
public final class EventFlow implements Serializable {
    @NotNull
    private List participants_;

    public EventFlow(@NotNull Participant[] arr_participant) {
        Intrinsics.checkNotNullParameter(arr_participant, "participants");
        super();
        this.participants_ = new ArrayList();
        this.addParticipant(((Participant[])Arrays.copyOf(arr_participant, arr_participant.length)));
    }

    public final void addParticipant(@NotNull Participant[] arr_participant) {
        Intrinsics.checkNotNullParameter(arr_participant, "participants");
        this.participants_.addAll(ArraysKt___ArraysKt.toList(arr_participant));
    }

    public final void clearParticipant() {
        this.participants_.clear();
    }

    public final void post(@NotNull Event event0) {
        Intrinsics.checkNotNullParameter(event0, "event");
        Keditor.INSTANCE.log(this, this + " posted " + event0);
        Iterable iterable0 = this.participants_;
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            if(object0 instanceof Subscriber) {
                arrayList0.add(object0);
            }
        }
        for(Object object1: arrayList0) {
            Subscriber subscriber0 = (Subscriber)object1;
            subscriber0.onEvent(event0);
            Function1 function10 = event0.pendingEvent();
            if(function10 != null) {
                function10.invoke(subscriber0);
            }
        }
    }

    public final void postIf(boolean z, @Nullable Event event0) {
        if(z && event0 != null) {
            this.post(event0);
        }
    }

    public final void postIf(boolean z, @NotNull Event event0, @NotNull Event event1) {
        Intrinsics.checkNotNullParameter(event0, "event1");
        Intrinsics.checkNotNullParameter(event1, "event2");
        if(!z) {
            event0 = event1;
        }
        this.post(event0);
    }

    public final void removeParticipant(@NotNull Participant participant0) {
        Intrinsics.checkNotNullParameter(participant0, "participant");
        this.participants_.remove(participant0);
    }
}

