package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public final class WorkQuery {
    public static final class Builder {
        public final ArrayList a;
        public final ArrayList b;
        public final ArrayList c;
        public final ArrayList d;

        public Builder() {
            this.a = new ArrayList();
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
        }

        @NonNull
        public Builder addIds(@NonNull List list0) {
            this.a.addAll(list0);
            return this;
        }

        @NonNull
        public Builder addStates(@NonNull List list0) {
            this.d.addAll(list0);
            return this;
        }

        @NonNull
        public Builder addTags(@NonNull List list0) {
            this.c.addAll(list0);
            return this;
        }

        @NonNull
        public Builder addUniqueWorkNames(@NonNull List list0) {
            this.b.addAll(list0);
            return this;
        }

        @NonNull
        public WorkQuery build() {
            if(this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty() && this.d.isEmpty()) {
                throw new IllegalArgumentException("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
            }
            return new WorkQuery(this);
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public static Builder fromIds(@NonNull List list0) {
            Builder workQuery$Builder0 = new Builder();
            workQuery$Builder0.addIds(list0);
            return workQuery$Builder0;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public static Builder fromStates(@NonNull List list0) {
            Builder workQuery$Builder0 = new Builder();
            workQuery$Builder0.addStates(list0);
            return workQuery$Builder0;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public static Builder fromTags(@NonNull List list0) {
            Builder workQuery$Builder0 = new Builder();
            workQuery$Builder0.addTags(list0);
            return workQuery$Builder0;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public static Builder fromUniqueWorkNames(@NonNull List list0) {
            Builder workQuery$Builder0 = new Builder();
            workQuery$Builder0.addUniqueWorkNames(list0);
            return workQuery$Builder0;
        }
    }

    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;

    public WorkQuery(Builder workQuery$Builder0) {
        this.a = workQuery$Builder0.a;
        this.b = workQuery$Builder0.b;
        this.c = workQuery$Builder0.c;
        this.d = workQuery$Builder0.d;
    }

    @NonNull
    public static WorkQuery fromIds(@NonNull List list0) {
        return Builder.fromIds(list0).build();
    }

    @NonNull
    public static WorkQuery fromIds(@NonNull UUID[] arr_uUID) {
        return WorkQuery.fromIds(Arrays.asList(arr_uUID));
    }

    @NonNull
    public static WorkQuery fromStates(@NonNull List list0) {
        return Builder.fromStates(list0).build();
    }

    @NonNull
    public static WorkQuery fromStates(@NonNull State[] arr_workInfo$State) {
        return Builder.fromStates(Arrays.asList(arr_workInfo$State)).build();
    }

    @NonNull
    public static WorkQuery fromTags(@NonNull List list0) {
        return Builder.fromTags(list0).build();
    }

    @NonNull
    public static WorkQuery fromTags(@NonNull String[] arr_s) {
        return WorkQuery.fromTags(Arrays.asList(arr_s));
    }

    @NonNull
    public static WorkQuery fromUniqueWorkNames(@NonNull List list0) {
        return Builder.fromUniqueWorkNames(list0).build();
    }

    @NonNull
    public static WorkQuery fromUniqueWorkNames(@NonNull String[] arr_s) {
        return Builder.fromUniqueWorkNames(Arrays.asList(arr_s)).build();
    }

    @NonNull
    public List getIds() {
        return this.a;
    }

    @NonNull
    public List getStates() {
        return this.d;
    }

    @NonNull
    public List getTags() {
        return this.c;
    }

    @NonNull
    public List getUniqueWorkNames() {
        return this.b;
    }
}

