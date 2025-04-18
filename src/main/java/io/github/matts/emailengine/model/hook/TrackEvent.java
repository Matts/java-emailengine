package io.github.matts.emailengine.model.hook;

import io.github.matts.emailengine.model.hook.data.TrackEventData;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper=true, includeFieldNames=true)
public class TrackEvent extends Event {
    private TrackEventData data;
}
