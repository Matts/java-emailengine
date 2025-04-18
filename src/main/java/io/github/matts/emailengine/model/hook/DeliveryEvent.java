package io.github.matts.emailengine.model.hook;

import io.github.matts.emailengine.model.hook.data.DeliveryEventData;
import io.github.matts.emailengine.model.hook.data.MessageEventData;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper=true, includeFieldNames=true)
public class DeliveryEvent extends Event {
    private DeliveryEventData data;

}
