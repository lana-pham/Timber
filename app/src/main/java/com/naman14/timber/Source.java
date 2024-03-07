package com.naman14.timber;

import com.naman14.timber.utils.TimberUtils;

public class Source {
    public long id;
    public TimberUtils.IdType type;

    public Source(long sourceId, TimberUtils.IdType sourceType) {
        this.id = sourceId;
        this.type = sourceType;
    }
}
